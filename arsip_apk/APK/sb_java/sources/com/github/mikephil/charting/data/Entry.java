package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;

/* loaded from: classes4.dex */
public class Entry extends BaseEntry implements Parcelable {
    public static final Parcelable.Creator<Entry> CREATOR = null;

    /* renamed from: x, reason: collision with root package name */
    private float f37845x;

    static {
        CREATOR = new AnonymousClass1();
    }

    public Entry() {
        this.f37845x = 0.0f;
    }

    public Entry copy() {
        return new Entry(this.f37845x, getY(), getData());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equalTo(Entry r4) {
        if (r4 != null) goto L6;
        return false;
    L6:
        if (r4.getData() == getData()) goto L8;
        return false;
    L8:
        float r1 = Math.abs(r4.f37845x - this.f37845x);
        float r2 = Utils.FLOAT_EPSILON;
        if (r1 <= r2) goto L12;
        return false;
    L12:
        if (Math.abs(r4.getY() - getY()) <= r2) goto L14;
        return false;
    L14:
        return true;
    }

    public float getX() {
        return this.f37845x;
    }

    public void setX(float r1) {
        this.f37845x = r1;
    }

    public String toString() {
        return "Entry, x: " + this.f37845x + " y: " + getY();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r2, int r3) {
        r2.writeFloat(this.f37845x);
        r2.writeFloat(getY());
        if (getData() != null) goto L5;
        r2.writeInt(0);
        return;
    L5:
        if ((getData() instanceof Parcelable) == false) goto L9;
        r2.writeInt(1);
        r2.writeParcelable((Parcelable) getData(), r3);
        return;
    L9:
        throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
    }

    public Entry(float r1, float r2) {
        super(r2);
        this.f37845x = r1;
    }

    public Entry(float r1, float r2, Object r3) {
        super(r2, r3);
        this.f37845x = r1;
    }

    public Entry(float r1, float r2, Drawable r3) {
        super(r2, r3);
        this.f37845x = r1;
    }

    public Entry(float r1, float r2, Drawable r3, Object r4) {
        super(r2, r3, r4);
        this.f37845x = r1;
    }

    public Entry(Parcel r3) {
        this.f37845x = 0.0f;
        this.f37845x = r3.readFloat();
        setY(r3.readFloat());
        if (r3.readInt() != 1) goto L6;
        setData(r3.readParcelable(Object.class.getClassLoader()));
        return;
    }
}
