package com.huawei.hms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.util.Base64Utils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;

/* loaded from: classes6.dex */
public final class SafeParcelableSerializer {
    public SafeParcelableSerializer() {
    }

    public static <S extends SafeParcelable> S deserializeFromBytes(byte[] r3, Parcelable.Creator<S> r4) {
        Preconditions.checkNotNull(r4);
        Parcel r02 = Parcel.obtain();
        r02.unmarshall(r3, 0, r3.length);
        r02.setDataPosition(0);
        S r32 = r4.createFromParcel(r02);
        r02.recycle();
        return r32;
    }

    public static <S extends SafeParcelable> S deserializeFromIntentExtra(Intent r02, String r1, Parcelable.Creator<S> r2) {
        byte[] r03 = r02.getByteArrayExtra(r1);
        if (r03 != null) goto L7;
        return null;
    L7:
        return (S) deserializeFromBytes(r03, r2);
    }

    public static <S extends SafeParcelable> S deserializeFromString(String r02, Parcelable.Creator<S> r1) {
        return (S) deserializeFromBytes(Base64Utils.decodeUrlSafe(r02), r1);
    }

    public static <S extends SafeParcelable> ArrayList<S> deserializeIterableFromBundle(Bundle r1, String r2, Parcelable.Creator<S> r3) {
        if (r1 != null) goto L5;
        return null;
    L5:
        ArrayList r12 = (ArrayList) r1.getSerializable(r2);
        if (r12 != null) goto L8;
        return null;
    L8:
        ArgumentList r22 = (ArrayList<S>) new ArrayList(r12.size());
        Iterator r13 = r12.iterator();
    L10:
        if (r13.hasNext() == false) goto L12;
        r22.add(deserializeFromBytes((byte[]) r13.next(), r3));
        goto L10
    L12:
        return r22;
    }

    public static <S extends SafeParcelable> ArrayList<S> deserializeIterableFromIntentExtra(Intent r1, String r2, Parcelable.Creator<S> r3) {
        ArrayList r12 = (ArrayList) r1.getSerializableExtra(r2);
        if (r12 != null) goto L6;
        return null;
    L6:
        ArgumentList r22 = (ArrayList<S>) new ArrayList(r12.size());
        Iterator r13 = r12.iterator();
    L8:
        if (r13.hasNext() == false) goto L10;
        r22.add(deserializeFromBytes((byte[]) r13.next(), r3));
        goto L8
    L10:
        return r22;
    }

    public static <S extends SafeParcelable> void serializeIterableToBundle(Iterable<S> r2, Bundle r3, String r4) {
        ArrayList r02 = new ArrayList();
        Iterator<S> r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L6;
        r02.add(serializeToBytes(r22.next()));
        goto L4
    L6:
        r3.putSerializable(r4, r02);
    }

    public static <S extends SafeParcelable> void serializeIterableToIntentExtra(Iterable<S> r2, Intent r3, String r4) {
        ArrayList r02 = new ArrayList();
        Iterator<S> r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L6;
        r02.add(serializeToBytes(r22.next()));
        goto L4
    L6:
        r3.putExtra(r4, r02);
    }

    public static <S extends SafeParcelable> byte[] serializeToBytes(S r2) {
        Parcel r02 = Parcel.obtain();
        r2.writeToParcel(r02, 0);
        byte[] r22 = r02.marshall();
        r02.recycle();
        return r22;
    }

    public static <S extends SafeParcelable> void serializeToIntentExtra(S r02, Intent r1, String r2) {
        r1.putExtra(r2, serializeToBytes(r02));
    }

    public static <S extends SafeParcelable> String serializeToString(S r02) {
        return Base64Utils.encodeUrlSafe(serializeToBytes(r02));
    }
}
