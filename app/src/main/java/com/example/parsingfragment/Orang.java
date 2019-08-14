package com.example.parsingfragment;

import android.os.Parcel;
import android.os.Parcelable;

public class Orang implements Parcelable {
    private String nama;
    private int Age;
    private String email;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    private String kota;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeInt(this.Age);
        dest.writeString(this.email);
        dest.writeString(this.kota);
    }

    public Orang() {
    }

    protected Orang(Parcel in) {
        this.nama = in.readString();
        this.Age = in.readInt();
        this.email = in.readString();
        this.kota = in.readString();
    }

    public static final Parcelable.Creator<Orang> CREATOR = new Parcelable.Creator<Orang>() {
        @Override
        public Orang createFromParcel(Parcel source) {
            return new Orang(source);
        }

        @Override
        public Orang[] newArray(int size) {
            return new Orang[size];
        }
    };
}
