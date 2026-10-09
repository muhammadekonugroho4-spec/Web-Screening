package com.google.android.play.integrity.internal;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final ClassLoader f38349a = null;

    static {
        f38349a = c.class.getClassLoader();
    }

    private c() {
    }

    public static Parcelable a(Parcel r1, Parcelable.Creator r2) {
        if (r1.readInt() != 0) goto L7;
        return null;
    L7:
        return (Parcelable) r2.createFromParcel(r1);
    }

    public static void b(Parcel r3) {
        int r32 = r3.dataAvail();
        if (r32 > 0) goto L6;
        return;
    L6:
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + r32);
    }

    public static void c(Parcel r1, Parcelable r2) {
        r1.writeInt(1);
        r2.writeToParcel(r1, 0);
    }
}
