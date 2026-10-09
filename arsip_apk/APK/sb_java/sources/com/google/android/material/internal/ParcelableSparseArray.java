package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* loaded from: classes5.dex */
public class ParcelableSparseArray extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseArray> CREATOR = null;

    static {
        CREATOR = new AnonymousClass1();
    }

    public ParcelableSparseArray() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r6, int r7) {
        int r02 = size();
        int[] r1 = new int[r02];
        Parcelable[] r2 = new Parcelable[r02];
        int r3 = 0;
    L3:
        if (r3 >= r02) goto L5;
        r1[r3] = keyAt(r3);
        r2[r3] = valueAt(r3);
        r3 = r3 + 1;
        goto L3
    L5:
        r6.writeInt(r02);
        r6.writeIntArray(r1);
        r6.writeParcelableArray(r2, r7);
    }

    public ParcelableSparseArray(Parcel r5, ClassLoader r6) {
        int r02 = r5.readInt();
        int[] r1 = new int[r02];
        r5.readIntArray(r1);
        Parcelable[] r52 = r5.readParcelableArray(r6);
        int r62 = 0;
    L3:
        if (r62 >= r02) goto L5;
        put(r1[r62], r52[r62]);
        r62 = r62 + 1;
        goto L3
    }
}
