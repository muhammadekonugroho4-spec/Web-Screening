package com.huawei.hms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* loaded from: classes6.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    private static void a(Parcel r1, int r2, int r3) {
        if (r3 < 65535) goto L6;
        r1.writeInt(r2 | (-65536));
        r1.writeInt(r3);
        return;
    L6:
        r1.writeInt(r2 | (r3 << 16));
    }

    private static void b(Parcel r2, int r3) {
        int r02 = r2.dataPosition();
        r2.setDataPosition(r3 - 4);
        r2.writeInt(r02 - r3);
        r2.setDataPosition(r02);
    }

    public static int beginObjectHeader(Parcel r1) {
        return a(r1, 20293);
    }

    public static void finishObjectHeader(Parcel r02, int r1) {
        b(r02, r1);
    }

    public static void writeBigDecimal(Parcel r02, int r1, BigDecimal r2, boolean r3) {
        if (r2 == null) goto L5;
        int r12 = a(r02, r1);
        r02.writeByteArray(r2.unscaledValue().toByteArray());
        r02.writeInt(r2.scale());
        b(r02, r12);
        return;
    L5:
        if (r3 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeBigDecimalArray(Parcel r2, int r3, BigDecimal[] r4, boolean r5) {
        int r02 = 0;
        if (r4 == null) goto L9;
        int r32 = a(r2, r3);
        int r52 = r4.length;
        r2.writeInt(r52);
    L5:
        if (r02 >= r52) goto L7;
        r2.writeByteArray(r4[r02].unscaledValue().toByteArray());
        r2.writeInt(r4[r02].scale());
        r02 = r02 + 1;
        goto L5
    L7:
        b(r2, r32);
        return;
    L9:
        if (r5 == false) goto L13;
        a(r2, r3, 0);
        return;
    }

    public static void writeBigInteger(Parcel r02, int r1, BigInteger r2, boolean r3) {
        if (r2 == null) goto L5;
        int r12 = a(r02, r1);
        r02.writeByteArray(r2.toByteArray());
        b(r02, r12);
        return;
    L5:
        if (r3 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeBigIntegerArray(Parcel r2, int r3, BigInteger[] r4, boolean r5) {
        int r02 = 0;
        if (r4 == null) goto L9;
        int r32 = a(r2, r3);
        int r52 = r4.length;
        r2.writeInt(r52);
    L5:
        if (r02 >= r52) goto L7;
        r2.writeByteArray(r4[r02].toByteArray());
        r02 = r02 + 1;
        goto L5
    L7:
        b(r2, r32);
        return;
    L9:
        if (r5 == false) goto L13;
        a(r2, r3, 0);
        return;
    }

    public static void writeBoolean(Parcel r1, int r2, boolean r3) {
        a(r1, r2, 4);
        if (r3 == false) goto L6;
        r1.writeInt(1);
        return;
    L6:
        r1.writeInt(0);
    }

    public static void writeBooleanArray(Parcel r02, int r1, boolean[] r2, boolean r3) {
        if (r2 == null) goto L5;
        int r12 = a(r02, r1);
        r02.writeBooleanArray(r2);
        b(r02, r12);
        return;
    L5:
        if (r3 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeBooleanList(Parcel r2, int r3, List<Boolean> r4, boolean r5) {
        int r02 = 0;
        if (r4 == null) goto L9;
        int r32 = a(r2, r3);
        int r52 = r4.size();
        r2.writeInt(r52);
    L5:
        if (r02 >= r52) goto L7;
        r2.writeInt(r4.get(r02).booleanValue() ? 1 : 0);
        r02 = r02 + 1;
        goto L5
    L7:
        b(r2, r32);
        return;
    L9:
        if (r5 == false) goto L13;
        a(r2, r3, 0);
        return;
    }

    public static void writeBooleanObject(Parcel r02, int r1, Boolean r2, boolean r3) {
        if (r2 == null) goto L5;
        a(r02, r1, 4);
        r02.writeInt(r2.booleanValue() ? 1 : 0);
        return;
    L5:
        if (r3 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeBundle(Parcel r02, int r1, Bundle r2, boolean r3) {
        if (r2 == null) goto L5;
        int r12 = a(r02, r1);
        r02.writeBundle(r2);
        b(r02, r12);
        return;
    L5:
        if (r3 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeByte(Parcel r1, int r2, byte r3) {
        a(r1, r2, 4);
        r1.writeInt(r3);
    }

    public static void writeByteArray(Parcel r02, int r1, byte[] r2, boolean r3) {
        if (r2 == null) goto L5;
        int r12 = a(r02, r1);
        r02.writeByteArray(r2);
        b(r02, r12);
        return;
    L5:
        if (r3 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeByteArrayArray(Parcel r2, int r3, byte[][] r4, boolean r5) {
        int r02 = 0;
        if (r4 == null) goto L9;
        int r32 = a(r2, r3);
        int r52 = r4.length;
        r2.writeInt(r52);
    L5:
        if (r02 >= r52) goto L7;
        r2.writeByteArray(r4[r02]);
        r02 = r02 + 1;
        goto L5
    L7:
        b(r2, r32);
        return;
    L9:
        if (r5 == false) goto L13;
        a(r2, r3, 0);
        return;
    }

    public static void writeByteArraySparseArray(Parcel r2, int r3, SparseArray<byte[]> r4, boolean r5) {
        int r02 = 0;
        if (r4 == null) goto L9;
        int r32 = a(r2, r3);
        int r52 = r4.size();
        r2.writeInt(r52);
    L5:
        if (r02 >= r52) goto L7;
        r2.writeInt(r4.keyAt(r02));
        r2.writeByteArray(r4.valueAt(r02));
        r02 = r02 + 1;
        goto L5
    L7:
        b(r2, r32);
        return;
    L9:
        if (r5 == false) goto L13;
        a(r2, r3, 0);
        return;
    }

    public static void writeChar(Parcel r1, int r2, char r3) {
        a(r1, r2, 4);
        r1.writeInt(r3);
    }

    public static void writeCharArray(Parcel r02, int r1, char[] r2, boolean r3) {
        if (r2 == null) goto L5;
        int r12 = a(r02, r1);
        r02.writeCharArray(r2);
        b(r02, r12);
        return;
    L5:
        if (r3 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeDouble(Parcel r1, int r2, double r3) {
        a(r1, r2, 8);
        r1.writeDouble(r3);
    }

    public static void writeDoubleArray(Parcel r02, int r1, double[] r2, boolean r3) {
        if (r2 == null) goto L5;
        int r12 = a(r02, r1);
        r02.writeDoubleArray(r2);
        b(r02, r12);
        return;
    L5:
        if (r3 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeDoubleList(Parcel r3, int r4, List<Double> r5, boolean r6) {
        int r02 = 0;
        if (r5 == null) goto L9;
        int r42 = a(r3, r4);
        int r62 = r5.size();
        r3.writeInt(r62);
    L5:
        if (r02 >= r62) goto L7;
        r3.writeDouble(r5.get(r02).doubleValue());
        r02 = r02 + 1;
        goto L5
    L7:
        b(r3, r42);
        return;
    L9:
        if (r6 == false) goto L13;
        a(r3, r4, 0);
        return;
    }

    public static void writeDoubleObject(Parcel r02, int r1, Double r2, boolean r3) {
        if (r2 == null) goto L5;
        a(r02, r1, 8);
        r02.writeDouble(r2.doubleValue());
        return;
    L5:
        if (r3 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeDoubleSparseArray(Parcel r3, int r4, SparseArray<Double> r5, boolean r6) {
        int r02 = 0;
        if (r5 == null) goto L9;
        int r42 = a(r3, r4);
        int r62 = r5.size();
        r3.writeInt(r62);
    L5:
        if (r02 >= r62) goto L7;
        r3.writeInt(r5.keyAt(r02));
        r3.writeDouble(r5.valueAt(r02).doubleValue());
        r02 = r02 + 1;
        goto L5
    L7:
        b(r3, r42);
        return;
    L9:
        if (r6 == false) goto L13;
        a(r3, r4, 0);
        return;
    }

    public static void writeFloat(Parcel r1, int r2, float r3) {
        a(r1, r2, 4);
        r1.writeFloat(r3);
    }

    public static void writeFloatArray(Parcel r02, int r1, float[] r2, boolean r3) {
        if (r2 == null) goto L5;
        int r12 = a(r02, r1);
        r02.writeFloatArray(r2);
        b(r02, r12);
        return;
    L5:
        if (r3 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeFloatList(Parcel r2, int r3, List<Float> r4, boolean r5) {
        int r02 = 0;
        if (r4 == null) goto L9;
        int r32 = a(r2, r3);
        int r52 = r4.size();
        r2.writeInt(r52);
    L5:
        if (r02 >= r52) goto L7;
        r2.writeFloat(r4.get(r02).floatValue());
        r02 = r02 + 1;
        goto L5
    L7:
        b(r2, r32);
        return;
    L9:
        if (r5 == false) goto L13;
        a(r2, r3, 0);
        return;
    }

    public static void writeFloatObject(Parcel r02, int r1, Float r2, boolean r3) {
        if (r2 == null) goto L5;
        a(r02, r1, 4);
        r02.writeFloat(r2.floatValue());
        return;
    L5:
        if (r3 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeFloatSparseArray(Parcel r2, int r3, SparseArray<Float> r4, boolean r5) {
        int r02 = 0;
        if (r4 == null) goto L9;
        int r32 = a(r2, r3);
        int r52 = r4.size();
        r2.writeInt(r52);
    L5:
        if (r02 >= r52) goto L7;
        r2.writeInt(r4.keyAt(r02));
        r2.writeFloat(r4.valueAt(r02).floatValue());
        r02 = r02 + 1;
        goto L5
    L7:
        b(r2, r32);
        return;
    L9:
        if (r5 == false) goto L13;
        a(r2, r3, 0);
        return;
    }

    public static void writeIBinder(Parcel r02, int r1, IBinder r2, boolean r3) {
        if (r2 == null) goto L5;
        int r12 = a(r02, r1);
        r02.writeStrongBinder(r2);
        b(r02, r12);
        return;
    L5:
        if (r3 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeIBinderArray(Parcel r02, int r1, IBinder[] r2, boolean r3) {
        if (r2 == null) goto L5;
        int r12 = a(r02, r1);
        r02.writeBinderArray(r2);
        b(r02, r12);
        return;
    L5:
        if (r3 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeIBinderList(Parcel r02, int r1, List<IBinder> r2, boolean r3) {
        if (r2 == null) goto L5;
        int r12 = a(r02, r1);
        r02.writeBinderList(r2);
        b(r02, r12);
        return;
    L5:
        if (r3 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeIBinderSparseArray(Parcel r2, int r3, SparseArray<IBinder> r4, boolean r5) {
        int r02 = 0;
        if (r4 == null) goto L9;
        int r32 = a(r2, r3);
        int r52 = r4.size();
        r2.writeInt(r52);
    L5:
        if (r02 >= r52) goto L7;
        r2.writeInt(r4.keyAt(r02));
        r2.writeStrongBinder(r4.valueAt(r02));
        r02 = r02 + 1;
        goto L5
    L7:
        b(r2, r32);
        return;
    L9:
        if (r5 == false) goto L13;
        a(r2, r3, 0);
        return;
    }

    public static void writeInt(Parcel r1, int r2, int r3) {
        a(r1, r2, 4);
        r1.writeInt(r3);
    }

    public static void writeIntArray(Parcel r02, int r1, int[] r2, boolean r3) {
        if (r2 == null) goto L5;
        int r12 = a(r02, r1);
        r02.writeIntArray(r2);
        b(r02, r12);
        return;
    L5:
        if (r3 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeIntegerList(Parcel r2, int r3, List<Integer> r4, boolean r5) {
        int r02 = 0;
        if (r4 == null) goto L9;
        int r32 = a(r2, r3);
        int r52 = r4.size();
        r2.writeInt(r52);
    L5:
        if (r02 >= r52) goto L7;
        r2.writeInt(r4.get(r02).intValue());
        r02 = r02 + 1;
        goto L5
    L7:
        b(r2, r32);
        return;
    L9:
        if (r5 == false) goto L13;
        a(r2, r3, 0);
        return;
    }

    public static void writeIntegerObject(Parcel r02, int r1, Integer r2, boolean r3) {
        if (r2 == null) goto L5;
        a(r02, r1, 4);
        r02.writeInt(r2.intValue());
        return;
    L5:
        if (r3 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeList(Parcel r02, int r1, List r2, boolean r3) {
        if (r2 == null) goto L5;
        int r12 = a(r02, r1);
        r02.writeList(r2);
        b(r02, r12);
        return;
    L5:
        if (r3 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeLong(Parcel r1, int r2, long r3) {
        a(r1, r2, 8);
        r1.writeLong(r3);
    }

    public static void writeLongArray(Parcel r02, int r1, long[] r2, boolean r3) {
        if (r2 == null) goto L5;
        int r12 = a(r02, r1);
        r02.writeLongArray(r2);
        b(r02, r12);
        return;
    L5:
        if (r3 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeLongList(Parcel r3, int r4, List<Long> r5, boolean r6) {
        int r02 = 0;
        if (r5 == null) goto L9;
        int r42 = a(r3, r4);
        int r62 = r5.size();
        r3.writeInt(r62);
    L5:
        if (r02 >= r62) goto L7;
        r3.writeLong(r5.get(r02).longValue());
        r02 = r02 + 1;
        goto L5
    L7:
        b(r3, r42);
        return;
    L9:
        if (r6 == false) goto L13;
        a(r3, r4, 0);
        return;
    }

    public static void writeLongObject(Parcel r02, int r1, Long r2, boolean r3) {
        if (r2 == null) goto L5;
        a(r02, r1, 8);
        r02.writeLong(r2.longValue());
        return;
    L5:
        if (r3 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeParcel(Parcel r1, int r2, Parcel r3, boolean r4) {
        if (r3 == null) goto L6;
        int r22 = a(r1, r2);
        r1.appendFrom(r3, 0, r3.dataSize());
        b(r1, r22);
        return;
    L6:
        if (r4 == false) goto L9;
        a(r1, r2, 0);
        return;
    }

    public static void writeParcelArray(Parcel r4, int r5, Parcel[] r6, boolean r7) {
        if (r6 == null) goto L13;
        int r52 = a(r4, r5);
        int r72 = r6.length;
        r4.writeInt(r72);
        int r1 = 0;
    L5:
        if (r1 >= r72) goto L11;
        Parcel r2 = r6[r1];
        if (r2 != null) goto L9;
        r4.writeInt(0);
    L10:
        r1 = r1 + 1;
        goto L5
    L9:
        r4.writeInt(r2.dataSize());
        Parcel r22 = r6[r1];
        r4.appendFrom(r22, 0, r22.dataSize());
        goto L10
    L11:
        b(r4, r52);
        return;
    L13:
        if (r7 == false) goto L19;
        a(r4, r5, 0);
        return;
    }

    public static void writeParcelList(Parcel r4, int r5, List<Parcel> r6, boolean r7) {
        if (r6 == null) goto L13;
        int r52 = a(r4, r5);
        int r72 = r6.size();
        r4.writeInt(r72);
        int r1 = 0;
    L5:
        if (r1 >= r72) goto L11;
        Parcel r2 = r6.get(r1);
        if (r2 != null) goto L9;
        r4.writeInt(0);
    L10:
        r1 = r1 + 1;
        goto L5
    L9:
        r4.writeInt(r2.dataSize());
        r4.appendFrom(r2, 0, r2.dataSize());
        goto L10
    L11:
        b(r4, r52);
        return;
    L13:
        if (r7 == false) goto L19;
        a(r4, r5, 0);
        return;
    }

    public static void writeParcelSparseArray(Parcel r4, int r5, SparseArray<Parcel> r6, boolean r7) {
        if (r6 == null) goto L13;
        int r52 = a(r4, r5);
        int r72 = r6.size();
        r4.writeInt(r72);
        int r1 = 0;
    L5:
        if (r1 >= r72) goto L11;
        r4.writeInt(r6.keyAt(r1));
        Parcel r2 = r6.valueAt(r1);
        if (r2 != null) goto L9;
        r4.writeInt(0);
    L10:
        r1 = r1 + 1;
        goto L5
    L9:
        r4.writeInt(r2.dataSize());
        r4.appendFrom(r2, 0, r2.dataSize());
        goto L10
    L11:
        b(r4, r52);
        return;
    L13:
        if (r7 == false) goto L19;
        a(r4, r5, 0);
        return;
    }

    public static void writeParcelable(Parcel r02, int r1, Parcelable r2, int r3, boolean r4) {
        if (r2 == null) goto L5;
        int r12 = a(r02, r1);
        r2.writeToParcel(r02, r3);
        b(r02, r12);
        return;
    L5:
        if (r4 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeShort(Parcel r1, int r2, short r3) {
        a(r1, r2, 4);
        r1.writeInt(r3);
    }

    public static void writeSparseBooleanArray(Parcel r02, int r1, SparseBooleanArray r2, boolean r3) {
        if (r2 == null) goto L5;
        int r12 = a(r02, r1);
        r02.writeSparseBooleanArray(r2);
        b(r02, r12);
        return;
    L5:
        if (r3 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeSparseIntArray(Parcel r2, int r3, SparseIntArray r4, boolean r5) {
        int r02 = 0;
        if (r4 == null) goto L9;
        int r32 = a(r2, r3);
        int r52 = r4.size();
        r2.writeInt(r52);
    L5:
        if (r02 >= r52) goto L7;
        r2.writeInt(r4.keyAt(r02));
        r2.writeInt(r4.valueAt(r02));
        r02 = r02 + 1;
        goto L5
    L7:
        b(r2, r32);
        return;
    L9:
        if (r5 == false) goto L13;
        a(r2, r3, 0);
        return;
    }

    public static void writeSparseLongArray(Parcel r3, int r4, SparseLongArray r5, boolean r6) {
        int r02 = 0;
        if (r5 == null) goto L9;
        int r42 = a(r3, r4);
        int r62 = r5.size();
        r3.writeInt(r62);
    L5:
        if (r02 >= r62) goto L7;
        r3.writeInt(r5.keyAt(r02));
        r3.writeLong(r5.valueAt(r02));
        r02 = r02 + 1;
        goto L5
    L7:
        b(r3, r42);
        return;
    L9:
        if (r6 == false) goto L13;
        a(r3, r4, 0);
        return;
    }

    public static void writeString(Parcel r02, int r1, String r2, boolean r3) {
        if (r2 == null) goto L5;
        int r12 = a(r02, r1);
        r02.writeString(r2);
        b(r02, r12);
        return;
    L5:
        if (r3 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeStringArray(Parcel r02, int r1, String[] r2, boolean r3) {
        if (r2 == null) goto L5;
        int r12 = a(r02, r1);
        r02.writeStringArray(r2);
        b(r02, r12);
        return;
    L5:
        if (r3 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeStringList(Parcel r02, int r1, List<String> r2, boolean r3) {
        if (r2 == null) goto L5;
        int r12 = a(r02, r1);
        r02.writeStringList(r2);
        b(r02, r12);
        return;
    L5:
        if (r3 == false) goto L8;
        a(r02, r1, 0);
        return;
    }

    public static void writeStringSparseArray(Parcel r2, int r3, SparseArray<String> r4, boolean r5) {
        int r02 = 0;
        if (r4 == null) goto L9;
        int r32 = a(r2, r3);
        int r52 = r4.size();
        r2.writeInt(r52);
    L5:
        if (r02 >= r52) goto L7;
        r2.writeInt(r4.keyAt(r02));
        r2.writeString(r4.valueAt(r02));
        r02 = r02 + 1;
        goto L5
    L7:
        b(r2, r32);
        return;
    L9:
        if (r5 == false) goto L13;
        a(r2, r3, 0);
        return;
    }

    public static <P extends Parcelable> void writeTypedArray(Parcel r3, int r4, P[] r5, int r6, boolean r7) {
        if (r5 == null) goto L13;
        int r42 = a(r3, r4);
        r3.writeInt(r42);
        int r72 = r5.length;
        int r1 = 0;
    L5:
        if (r1 >= r72) goto L11;
        P r2 = r5[r1];
        if (r2 == null) goto L9;
        a(r3, r2, r6);
    L10:
        r1 = r1 + 1;
        goto L5
    L9:
        r3.writeInt(0);
        goto L10
    L11:
        b(r3, r42);
        return;
    L13:
        if (r7 == false) goto L19;
        a(r3, r4, 0);
        return;
    }

    public static <T extends Parcelable> void writeTypedList(Parcel r3, int r4, List<T> r5, boolean r6) {
        if (r5 == null) goto L13;
        int r42 = a(r3, r4);
        int r62 = r5.size();
        r3.writeInt(r62);
        int r1 = 0;
    L5:
        if (r1 >= r62) goto L11;
        T r2 = r5.get(r1);
        if (r2 == null) goto L9;
        a(r3, r2, 0);
    L10:
        r1 = r1 + 1;
        goto L5
    L9:
        r3.writeInt(0);
        goto L10
    L11:
        b(r3, r42);
        return;
    L13:
        if (r6 == false) goto L19;
        a(r3, r4, 0);
        return;
    }

    public static <T extends Parcelable> void writeTypedSparseArray(Parcel r3, int r4, SparseArray<T> r5, boolean r6) {
        if (r5 == null) goto L13;
        int r42 = a(r3, r4);
        int r62 = r5.size();
        r3.writeInt(r62);
        int r1 = 0;
    L5:
        if (r1 >= r62) goto L11;
        r3.writeInt(r5.keyAt(r1));
        T r2 = r5.valueAt(r1);
        if (r2 == null) goto L9;
        a(r3, r2, 0);
    L10:
        r1 = r1 + 1;
        goto L5
    L9:
        r3.writeInt(0);
        goto L10
    L11:
        b(r3, r42);
        return;
    L13:
        if (r6 == false) goto L19;
        a(r3, r4, 0);
        return;
    }

    private static int a(Parcel r1, int r2) {
        r1.writeInt(r2 | (-65536));
        r1.writeInt(0);
        return r1.dataPosition();
    }

    private static <P extends Parcelable> void a(Parcel r2, P r3, int r4) {
        int r02 = r2.dataPosition();
        r2.writeInt(1);
        int r1 = r2.dataPosition();
        r3.writeToParcel(r2, r4);
        int r32 = r2.dataPosition();
        r2.setDataPosition(r02);
        r2.writeInt(r32 - r1);
        r2.setDataPosition(r32);
    }
}
