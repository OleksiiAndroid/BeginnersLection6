package ua.com.webacademy.beginnerslection6;

import android.os.Parcel;
import android.os.Parcelable;

public class StudentP implements Parcelable {
    public String Name;
    public int Age;

    public StudentP(String name, int age) {
        this.Name = name;
        this.Age = age;
    }

    //Parcelable methods
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.Name);
        dest.writeInt(this.Age);
    }

    protected StudentP(Parcel in) {
        this.Name = in.readString();
        this.Age = in.readInt();
    }

    public static final Creator<StudentP> CREATOR = new Creator<StudentP>() {
        public StudentP createFromParcel(Parcel source) {
            return new StudentP(source);
        }

        public StudentP[] newArray(int size) {
            return new StudentP[size];
        }
    };
}
