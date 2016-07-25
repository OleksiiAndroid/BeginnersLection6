package ua.com.webacademy.beginnerslection6;


import android.os.Parcel;
import android.os.Parcelable;

public class GroupP implements Parcelable {
    public String Number;
    StudentP[] Students;

    public GroupP() {
    }

    //Parcelable methods
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.Number);
        dest.writeTypedArray(this.Students, 0);
    }

    protected GroupP(Parcel in) {
        this.Number = in.readString();
        this.Students = in.createTypedArray(StudentP.CREATOR);
    }

    public static final Creator<GroupP> CREATOR = new Creator<GroupP>() {
        public GroupP createFromParcel(Parcel source) {
            return new GroupP(source);
        }

        public GroupP[] newArray(int size) {
            return new GroupP[size];
        }
    };
}
