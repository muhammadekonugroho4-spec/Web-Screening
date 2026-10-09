package com.google.android.a;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c {
    static {
        c.class.getClassLoader();
    }

    private c() {
    }

    public static <T extends Parcelable> T a(Parcel r1, Parcelable.Creator<T> r2) {
        if (r1.readInt() != 0) goto L7;
        return null;
    L7:
        return r2.createFromParcel(r1);
    }

    public static void b(Parcel r1, Parcelable r2) {
        r1.writeInt(1);
        r2.writeToParcel(r1, 0);
    }

    public static void c(Parcel r1, Parcelable r2) {
        if (r2 != null) goto L5;
        r1.writeInt(0);
        return;
    L5:
        r1.writeInt(1);
        r2.writeToParcel(r1, 1);
    }
}
