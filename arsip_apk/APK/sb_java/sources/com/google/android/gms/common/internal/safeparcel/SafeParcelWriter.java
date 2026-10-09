package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
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

/* loaded from: classes5.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static int beginObjectHeader(Parcel r1) {
        return zza(r1, 20293);
    }

    public static void finishObjectHeader(Parcel r02, int r1) {
        zzb(r02, r1);
    }

    public static void writeBigDecimal(Parcel r02, int r1, BigDecimal r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        int r12 = zza(r02, r1);
        r02.writeByteArray(r2.unscaledValue().toByteArray());
        r02.writeInt(r2.scale());
        zzb(r02, r12);
    }

    public static void writeBigDecimalArray(Parcel r2, int r3, BigDecimal[] r4, boolean r5) {
        int r02 = 0;
        if (r4 != null) goto L7;
        if (r5 == false) goto L13;
        zzc(r2, r3, 0);
        return;
    L13:
        return;
    L7:
        int r32 = zza(r2, r3);
        int r52 = r4.length;
        r2.writeInt(r52);
    L8:
        if (r02 >= r52) goto L10;
        r2.writeByteArray(r4[r02].unscaledValue().toByteArray());
        r2.writeInt(r4[r02].scale());
        r02 = r02 + 1;
        goto L8
    L10:
        zzb(r2, r32);
    }

    public static void writeBigInteger(Parcel r02, int r1, BigInteger r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        int r12 = zza(r02, r1);
        r02.writeByteArray(r2.toByteArray());
        zzb(r02, r12);
    }

    public static void writeBigIntegerArray(Parcel r2, int r3, BigInteger[] r4, boolean r5) {
        int r02 = 0;
        if (r4 != null) goto L7;
        if (r5 == false) goto L13;
        zzc(r2, r3, 0);
        return;
    L13:
        return;
    L7:
        int r32 = zza(r2, r3);
        int r52 = r4.length;
        r2.writeInt(r52);
    L8:
        if (r02 >= r52) goto L10;
        r2.writeByteArray(r4[r02].toByteArray());
        r02 = r02 + 1;
        goto L8
    L10:
        zzb(r2, r32);
    }

    public static void writeBoolean(Parcel r1, int r2, boolean r3) {
        zzc(r1, r2, 4);
        r1.writeInt(r3 ? 1 : 0);
    }

    public static void writeBooleanArray(Parcel r02, int r1, boolean[] r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        int r12 = zza(r02, r1);
        r02.writeBooleanArray(r2);
        zzb(r02, r12);
    }

    public static void writeBooleanList(Parcel r2, int r3, List<Boolean> r4, boolean r5) {
        int r02 = 0;
        if (r4 != null) goto L7;
        if (r5 == false) goto L13;
        zzc(r2, r3, 0);
        return;
    L13:
        return;
    L7:
        int r32 = zza(r2, r3);
        int r52 = r4.size();
        r2.writeInt(r52);
    L8:
        if (r02 >= r52) goto L10;
        r2.writeInt(r4.get(r02).booleanValue() ? 1 : 0);
        r02 = r02 + 1;
        goto L8
    L10:
        zzb(r2, r32);
    }

    public static void writeBooleanObject(Parcel r02, int r1, Boolean r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        zzc(r02, r1, 4);
        r02.writeInt(r2.booleanValue() ? 1 : 0);
    }

    public static void writeBundle(Parcel r02, int r1, Bundle r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        int r12 = zza(r02, r1);
        r02.writeBundle(r2);
        zzb(r02, r12);
    }

    public static void writeByte(Parcel r1, int r2, byte r3) {
        zzc(r1, r2, 4);
        r1.writeInt(r3);
    }

    public static void writeByteArray(Parcel r02, int r1, byte[] r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        int r12 = zza(r02, r1);
        r02.writeByteArray(r2);
        zzb(r02, r12);
    }

    public static void writeByteArrayArray(Parcel r2, int r3, byte[][] r4, boolean r5) {
        int r02 = 0;
        if (r4 != null) goto L7;
        if (r5 == false) goto L13;
        zzc(r2, r3, 0);
        return;
    L13:
        return;
    L7:
        int r32 = zza(r2, r3);
        int r52 = r4.length;
        r2.writeInt(r52);
    L8:
        if (r02 >= r52) goto L10;
        r2.writeByteArray(r4[r02]);
        r02 = r02 + 1;
        goto L8
    L10:
        zzb(r2, r32);
    }

    public static void writeByteArraySparseArray(Parcel r2, int r3, SparseArray<byte[]> r4, boolean r5) {
        int r02 = 0;
        if (r4 != null) goto L7;
        if (r5 == false) goto L13;
        zzc(r2, r3, 0);
        return;
    L13:
        return;
    L7:
        int r32 = zza(r2, r3);
        int r52 = r4.size();
        r2.writeInt(r52);
    L8:
        if (r02 >= r52) goto L10;
        r2.writeInt(r4.keyAt(r02));
        r2.writeByteArray(r4.valueAt(r02));
        r02 = r02 + 1;
        goto L8
    L10:
        zzb(r2, r32);
    }

    public static void writeChar(Parcel r1, int r2, char r3) {
        zzc(r1, r2, 4);
        r1.writeInt(r3);
    }

    public static void writeCharArray(Parcel r02, int r1, char[] r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        int r12 = zza(r02, r1);
        r02.writeCharArray(r2);
        zzb(r02, r12);
    }

    public static void writeDouble(Parcel r1, int r2, double r3) {
        zzc(r1, r2, 8);
        r1.writeDouble(r3);
    }

    public static void writeDoubleArray(Parcel r02, int r1, double[] r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        int r12 = zza(r02, r1);
        r02.writeDoubleArray(r2);
        zzb(r02, r12);
    }

    public static void writeDoubleList(Parcel r3, int r4, List<Double> r5, boolean r6) {
        int r02 = 0;
        if (r5 != null) goto L7;
        if (r6 == false) goto L13;
        zzc(r3, r4, 0);
        return;
    L13:
        return;
    L7:
        int r42 = zza(r3, r4);
        int r62 = r5.size();
        r3.writeInt(r62);
    L8:
        if (r02 >= r62) goto L10;
        r3.writeDouble(r5.get(r02).doubleValue());
        r02 = r02 + 1;
        goto L8
    L10:
        zzb(r3, r42);
    }

    public static void writeDoubleObject(Parcel r02, int r1, Double r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        zzc(r02, r1, 8);
        r02.writeDouble(r2.doubleValue());
    }

    public static void writeDoubleSparseArray(Parcel r3, int r4, SparseArray<Double> r5, boolean r6) {
        int r02 = 0;
        if (r5 != null) goto L7;
        if (r6 == false) goto L13;
        zzc(r3, r4, 0);
        return;
    L13:
        return;
    L7:
        int r42 = zza(r3, r4);
        int r62 = r5.size();
        r3.writeInt(r62);
    L8:
        if (r02 >= r62) goto L10;
        r3.writeInt(r5.keyAt(r02));
        r3.writeDouble(r5.valueAt(r02).doubleValue());
        r02 = r02 + 1;
        goto L8
    L10:
        zzb(r3, r42);
    }

    public static void writeFloat(Parcel r1, int r2, float r3) {
        zzc(r1, r2, 4);
        r1.writeFloat(r3);
    }

    public static void writeFloatArray(Parcel r02, int r1, float[] r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        int r12 = zza(r02, r1);
        r02.writeFloatArray(r2);
        zzb(r02, r12);
    }

    public static void writeFloatList(Parcel r2, int r3, List<Float> r4, boolean r5) {
        int r02 = 0;
        if (r4 != null) goto L7;
        if (r5 == false) goto L13;
        zzc(r2, r3, 0);
        return;
    L13:
        return;
    L7:
        int r32 = zza(r2, r3);
        int r52 = r4.size();
        r2.writeInt(r52);
    L8:
        if (r02 >= r52) goto L10;
        r2.writeFloat(r4.get(r02).floatValue());
        r02 = r02 + 1;
        goto L8
    L10:
        zzb(r2, r32);
    }

    public static void writeFloatObject(Parcel r02, int r1, Float r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        zzc(r02, r1, 4);
        r02.writeFloat(r2.floatValue());
    }

    public static void writeFloatSparseArray(Parcel r2, int r3, SparseArray<Float> r4, boolean r5) {
        int r02 = 0;
        if (r4 != null) goto L7;
        if (r5 == false) goto L13;
        zzc(r2, r3, 0);
        return;
    L13:
        return;
    L7:
        int r32 = zza(r2, r3);
        int r52 = r4.size();
        r2.writeInt(r52);
    L8:
        if (r02 >= r52) goto L10;
        r2.writeInt(r4.keyAt(r02));
        r2.writeFloat(r4.valueAt(r02).floatValue());
        r02 = r02 + 1;
        goto L8
    L10:
        zzb(r2, r32);
    }

    public static void writeIBinder(Parcel r02, int r1, IBinder r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        int r12 = zza(r02, r1);
        r02.writeStrongBinder(r2);
        zzb(r02, r12);
    }

    public static void writeIBinderArray(Parcel r02, int r1, IBinder[] r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        int r12 = zza(r02, r1);
        r02.writeBinderArray(r2);
        zzb(r02, r12);
    }

    public static void writeIBinderList(Parcel r02, int r1, List<IBinder> r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        int r12 = zza(r02, r1);
        r02.writeBinderList(r2);
        zzb(r02, r12);
    }

    public static void writeIBinderSparseArray(Parcel r2, int r3, SparseArray<IBinder> r4, boolean r5) {
        int r02 = 0;
        if (r4 != null) goto L7;
        if (r5 == false) goto L13;
        zzc(r2, r3, 0);
        return;
    L13:
        return;
    L7:
        int r32 = zza(r2, r3);
        int r52 = r4.size();
        r2.writeInt(r52);
    L8:
        if (r02 >= r52) goto L10;
        r2.writeInt(r4.keyAt(r02));
        r2.writeStrongBinder(r4.valueAt(r02));
        r02 = r02 + 1;
        goto L8
    L10:
        zzb(r2, r32);
    }

    public static void writeInt(Parcel r1, int r2, int r3) {
        zzc(r1, r2, 4);
        r1.writeInt(r3);
    }

    public static void writeIntArray(Parcel r02, int r1, int[] r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        int r12 = zza(r02, r1);
        r02.writeIntArray(r2);
        zzb(r02, r12);
    }

    public static void writeIntegerList(Parcel r2, int r3, List<Integer> r4, boolean r5) {
        int r02 = 0;
        if (r4 != null) goto L7;
        if (r5 == false) goto L13;
        zzc(r2, r3, 0);
        return;
    L13:
        return;
    L7:
        int r32 = zza(r2, r3);
        int r52 = r4.size();
        r2.writeInt(r52);
    L8:
        if (r02 >= r52) goto L10;
        r2.writeInt(r4.get(r02).intValue());
        r02 = r02 + 1;
        goto L8
    L10:
        zzb(r2, r32);
    }

    public static void writeIntegerObject(Parcel r02, int r1, Integer r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        zzc(r02, r1, 4);
        r02.writeInt(r2.intValue());
    }

    public static void writeList(Parcel r02, int r1, List r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        int r12 = zza(r02, r1);
        r02.writeList(r2);
        zzb(r02, r12);
    }

    public static void writeLong(Parcel r1, int r2, long r3) {
        zzc(r1, r2, 8);
        r1.writeLong(r3);
    }

    public static void writeLongArray(Parcel r02, int r1, long[] r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        int r12 = zza(r02, r1);
        r02.writeLongArray(r2);
        zzb(r02, r12);
    }

    public static void writeLongList(Parcel r3, int r4, List<Long> r5, boolean r6) {
        int r02 = 0;
        if (r5 != null) goto L7;
        if (r6 == false) goto L13;
        zzc(r3, r4, 0);
        return;
    L13:
        return;
    L7:
        int r42 = zza(r3, r4);
        int r62 = r5.size();
        r3.writeInt(r62);
    L8:
        if (r02 >= r62) goto L10;
        r3.writeLong(r5.get(r02).longValue());
        r02 = r02 + 1;
        goto L8
    L10:
        zzb(r3, r42);
    }

    public static void writeLongObject(Parcel r02, int r1, Long r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        zzc(r02, r1, 8);
        r02.writeLong(r2.longValue());
    }

    public static void writeParcel(Parcel r1, int r2, Parcel r3, boolean r4) {
        if (r3 != null) goto L7;
        if (r4 == false) goto L9;
        zzc(r1, r2, 0);
        return;
    L9:
        return;
    L7:
        int r22 = zza(r1, r2);
        r1.appendFrom(r3, 0, r3.dataSize());
        zzb(r1, r22);
    }

    public static void writeParcelArray(Parcel r4, int r5, Parcel[] r6, boolean r7) {
        if (r6 != null) goto L7;
        if (r7 == false) goto L19;
        zzc(r4, r5, 0);
        return;
    L19:
        return;
    L7:
        int r52 = zza(r4, r5);
        int r72 = r6.length;
        r4.writeInt(r72);
        int r1 = 0;
    L8:
        if (r1 >= r72) goto L14;
        Parcel r2 = r6[r1];
        if (r2 == null) goto L12;
        r4.writeInt(r2.dataSize());
        r4.appendFrom(r2, 0, r2.dataSize());
    L13:
        r1 = r1 + 1;
        goto L8
    L12:
        r4.writeInt(0);
        goto L13
    L14:
        zzb(r4, r52);
    }

    public static void writeParcelList(Parcel r4, int r5, List<Parcel> r6, boolean r7) {
        if (r6 != null) goto L7;
        if (r7 == false) goto L19;
        zzc(r4, r5, 0);
        return;
    L19:
        return;
    L7:
        int r52 = zza(r4, r5);
        int r72 = r6.size();
        r4.writeInt(r72);
        int r1 = 0;
    L8:
        if (r1 >= r72) goto L14;
        Parcel r2 = r6.get(r1);
        if (r2 == null) goto L12;
        r4.writeInt(r2.dataSize());
        r4.appendFrom(r2, 0, r2.dataSize());
    L13:
        r1 = r1 + 1;
        goto L8
    L12:
        r4.writeInt(0);
        goto L13
    L14:
        zzb(r4, r52);
    }

    public static void writeParcelSparseArray(Parcel r4, int r5, SparseArray<Parcel> r6, boolean r7) {
        if (r6 != null) goto L7;
        if (r7 == false) goto L19;
        zzc(r4, r5, 0);
        return;
    L19:
        return;
    L7:
        int r52 = zza(r4, r5);
        int r72 = r6.size();
        r4.writeInt(r72);
        int r1 = 0;
    L8:
        if (r1 >= r72) goto L14;
        r4.writeInt(r6.keyAt(r1));
        Parcel r2 = r6.valueAt(r1);
        if (r2 == null) goto L12;
        r4.writeInt(r2.dataSize());
        r4.appendFrom(r2, 0, r2.dataSize());
    L13:
        r1 = r1 + 1;
        goto L8
    L12:
        r4.writeInt(0);
        goto L13
    L14:
        zzb(r4, r52);
    }

    public static void writeParcelable(Parcel r02, int r1, Parcelable r2, int r3, boolean r4) {
        if (r2 != null) goto L6;
        if (r4 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        int r12 = zza(r02, r1);
        r2.writeToParcel(r02, r3);
        zzb(r02, r12);
    }

    public static void writePendingIntent(Parcel r02, int r1, PendingIntent r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        int r12 = zza(r02, r1);
        PendingIntent.writePendingIntentOrNullToParcel(r2, r02);
        zzb(r02, r12);
    }

    public static void writeShort(Parcel r1, int r2, short r3) {
        zzc(r1, r2, 4);
        r1.writeInt(r3);
    }

    public static void writeSparseBooleanArray(Parcel r02, int r1, SparseBooleanArray r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        int r12 = zza(r02, r1);
        r02.writeSparseBooleanArray(r2);
        zzb(r02, r12);
    }

    public static void writeSparseIntArray(Parcel r2, int r3, SparseIntArray r4, boolean r5) {
        int r02 = 0;
        if (r4 != null) goto L7;
        if (r5 == false) goto L13;
        zzc(r2, r3, 0);
        return;
    L13:
        return;
    L7:
        int r32 = zza(r2, r3);
        int r52 = r4.size();
        r2.writeInt(r52);
    L8:
        if (r02 >= r52) goto L10;
        r2.writeInt(r4.keyAt(r02));
        r2.writeInt(r4.valueAt(r02));
        r02 = r02 + 1;
        goto L8
    L10:
        zzb(r2, r32);
    }

    public static void writeSparseLongArray(Parcel r3, int r4, SparseLongArray r5, boolean r6) {
        int r02 = 0;
        if (r5 != null) goto L7;
        if (r6 == false) goto L13;
        zzc(r3, r4, 0);
        return;
    L13:
        return;
    L7:
        int r42 = zza(r3, r4);
        int r62 = r5.size();
        r3.writeInt(r62);
    L8:
        if (r02 >= r62) goto L10;
        r3.writeInt(r5.keyAt(r02));
        r3.writeLong(r5.valueAt(r02));
        r02 = r02 + 1;
        goto L8
    L10:
        zzb(r3, r42);
    }

    public static void writeString(Parcel r02, int r1, String r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        int r12 = zza(r02, r1);
        r02.writeString(r2);
        zzb(r02, r12);
    }

    public static void writeStringArray(Parcel r02, int r1, String[] r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        int r12 = zza(r02, r1);
        r02.writeStringArray(r2);
        zzb(r02, r12);
    }

    public static void writeStringList(Parcel r02, int r1, List<String> r2, boolean r3) {
        if (r2 != null) goto L6;
        if (r3 == false) goto L8;
        zzc(r02, r1, 0);
        return;
    L8:
        return;
    L6:
        int r12 = zza(r02, r1);
        r02.writeStringList(r2);
        zzb(r02, r12);
    }

    public static void writeStringSparseArray(Parcel r2, int r3, SparseArray<String> r4, boolean r5) {
        int r02 = 0;
        if (r4 != null) goto L7;
        if (r5 == false) goto L13;
        zzc(r2, r3, 0);
        return;
    L13:
        return;
    L7:
        int r32 = zza(r2, r3);
        int r52 = r4.size();
        r2.writeInt(r52);
    L8:
        if (r02 >= r52) goto L10;
        r2.writeInt(r4.keyAt(r02));
        r2.writeString(r4.valueAt(r02));
        r02 = r02 + 1;
        goto L8
    L10:
        zzb(r2, r32);
    }

    public static <T extends Parcelable> void writeTypedArray(Parcel r3, int r4, T[] r5, int r6, boolean r7) {
        if (r5 != null) goto L7;
        if (r7 == false) goto L19;
        zzc(r3, r4, 0);
        return;
    L19:
        return;
    L7:
        int r42 = zza(r3, r4);
        int r72 = r5.length;
        r3.writeInt(r72);
        int r1 = 0;
    L8:
        if (r1 >= r72) goto L14;
        T r2 = r5[r1];
        if (r2 != null) goto L12;
        r3.writeInt(0);
    L13:
        r1 = r1 + 1;
        goto L8
    L12:
        zzd(r3, r2, r6);
        goto L13
    L14:
        zzb(r3, r42);
    }

    public static <T extends Parcelable> void writeTypedList(Parcel r3, int r4, List<T> r5, boolean r6) {
        if (r5 != null) goto L7;
        if (r6 == false) goto L19;
        zzc(r3, r4, 0);
        return;
    L19:
        return;
    L7:
        int r42 = zza(r3, r4);
        int r62 = r5.size();
        r3.writeInt(r62);
        int r1 = 0;
    L8:
        if (r1 >= r62) goto L14;
        T r2 = r5.get(r1);
        if (r2 != null) goto L12;
        r3.writeInt(0);
    L13:
        r1 = r1 + 1;
        goto L8
    L12:
        zzd(r3, r2, 0);
        goto L13
    L14:
        zzb(r3, r42);
    }

    public static <T extends Parcelable> void writeTypedSparseArray(Parcel r3, int r4, SparseArray<T> r5, boolean r6) {
        if (r5 != null) goto L7;
        if (r6 == false) goto L19;
        zzc(r3, r4, 0);
        return;
    L19:
        return;
    L7:
        int r42 = zza(r3, r4);
        int r62 = r5.size();
        r3.writeInt(r62);
        int r1 = 0;
    L8:
        if (r1 >= r62) goto L14;
        r3.writeInt(r5.keyAt(r1));
        T r2 = r5.valueAt(r1);
        if (r2 != null) goto L12;
        r3.writeInt(0);
    L13:
        r1 = r1 + 1;
        goto L8
    L12:
        zzd(r3, r2, 0);
        goto L13
    L14:
        zzb(r3, r42);
    }

    private static int zza(Parcel r1, int r2) {
        r1.writeInt(r2 | (-65536));
        r1.writeInt(0);
        return r1.dataPosition();
    }

    private static void zzb(Parcel r2, int r3) {
        int r02 = r2.dataPosition();
        r2.setDataPosition(r3 - 4);
        r2.writeInt(r02 - r3);
        r2.setDataPosition(r02);
    }

    private static void zzc(Parcel r02, int r1, int r2) {
        r02.writeInt(r1 | (r2 << 16));
    }

    private static void zzd(Parcel r2, Parcelable r3, int r4) {
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
