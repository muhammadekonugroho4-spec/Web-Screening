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
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class SafeParcelReader {

    public static class ParseException extends RuntimeException {
        public ParseException(String r3, Parcel r4) {
            super(r3 + " Parcel: pos=" + r4.dataPosition() + " size=" + r4.dataSize());
        }
    }

    private SafeParcelReader() {
    }

    public static BigDecimal createBigDecimal(Parcel r3, int r4) {
        int r42 = readSize(r3, r4);
        int r02 = r3.dataPosition();
        if (r42 != 0) goto L6;
        return null;
    L6:
        byte[] r1 = r3.createByteArray();
        int r2 = r3.readInt();
        r3.setDataPosition(r02 + r42);
        return new BigDecimal(new BigInteger(r1), r2);
    }

    public static BigDecimal[] createBigDecimalArray(Parcel r8, int r9) {
        int r92 = readSize(r8, r9);
        int r02 = r8.dataPosition();
        if (r92 != 0) goto L6;
        return null;
    L6:
        int r1 = r8.readInt();
        BigDecimal[] r2 = new BigDecimal[r1];
        int r3 = 0;
    L7:
        if (r3 >= r1) goto L9;
        byte[] r4 = r8.createByteArray();
        int r5 = r8.readInt();
        r2[r3] = new BigDecimal(new BigInteger(r4), r5);
        r3 = r3 + 1;
        goto L7
    L9:
        r8.setDataPosition(r02 + r92);
        return r2;
    }

    public static BigInteger createBigInteger(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 != 0) goto L6;
        return null;
    L6:
        byte[] r1 = r2.createByteArray();
        r2.setDataPosition(r02 + r32);
        return new BigInteger(r1);
    }

    public static BigInteger[] createBigIntegerArray(Parcel r6, int r7) {
        int r72 = readSize(r6, r7);
        int r02 = r6.dataPosition();
        if (r72 != 0) goto L6;
        return null;
    L6:
        int r1 = r6.readInt();
        BigInteger[] r2 = new BigInteger[r1];
        int r3 = 0;
    L7:
        if (r3 >= r1) goto L9;
        r2[r3] = new BigInteger(r6.createByteArray());
        r3 = r3 + 1;
        goto L7
    L9:
        r6.setDataPosition(r02 + r72);
        return r2;
    }

    public static boolean[] createBooleanArray(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 != 0) goto L6;
        return null;
    L6:
        boolean[] r1 = r2.createBooleanArray();
        r2.setDataPosition(r02 + r32);
        return r1;
    }

    public static ArrayList<Boolean> createBooleanList(Parcel r6, int r7) {
        int r72 = readSize(r6, r7);
        int r02 = r6.dataPosition();
        if (r72 != 0) goto L6;
        return null;
    L6:
        ArrayList<Boolean> r1 = new ArrayList();
        int r2 = r6.readInt();
        int r4 = 0;
    L7:
        if (r4 >= r2) goto L13;
        if (r6.readInt() == 0) goto L11;
        boolean r5 = true;
    L12:
        r1.add(Boolean.valueOf(r5));
        r4 = r4 + 1;
        goto L7
    L11:
        r5 = false;
        goto L12
    L13:
        r6.setDataPosition(r02 + r72);
        return r1;
    }

    public static Bundle createBundle(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 != 0) goto L6;
        return null;
    L6:
        Bundle r1 = r2.readBundle();
        r2.setDataPosition(r02 + r32);
        return r1;
    }

    public static byte[] createByteArray(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 != 0) goto L6;
        return null;
    L6:
        byte[] r1 = r2.createByteArray();
        r2.setDataPosition(r02 + r32);
        return r1;
    }

    public static byte[][] createByteArrayArray(Parcel r5, int r6) {
        int r62 = readSize(r5, r6);
        int r02 = r5.dataPosition();
        if (r62 != 0) goto L6;
        return null;
    L6:
        int r1 = r5.readInt();
        byte[][] r2 = new byte[r1][];
        int r3 = 0;
    L7:
        if (r3 >= r1) goto L9;
        r2[r3] = r5.createByteArray();
        r3 = r3 + 1;
        goto L7
    L9:
        r5.setDataPosition(r02 + r62);
        return r2;
    }

    public static SparseArray<byte[]> createByteArraySparseArray(Parcel r6, int r7) {
        int r72 = readSize(r6, r7);
        int r02 = r6.dataPosition();
        if (r72 != 0) goto L6;
        return null;
    L6:
        int r1 = r6.readInt();
        SparseArray<byte[]> r2 = new SparseArray(r1);
        int r3 = 0;
    L7:
        if (r3 >= r1) goto L9;
        r2.append(r6.readInt(), r6.createByteArray());
        r3 = r3 + 1;
        goto L7
    L9:
        r6.setDataPosition(r02 + r72);
        return r2;
    }

    public static char[] createCharArray(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 != 0) goto L6;
        return null;
    L6:
        char[] r1 = r2.createCharArray();
        r2.setDataPosition(r02 + r32);
        return r1;
    }

    public static double[] createDoubleArray(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 != 0) goto L6;
        return null;
    L6:
        double[] r1 = r2.createDoubleArray();
        r2.setDataPosition(r02 + r32);
        return r1;
    }

    public static ArrayList<Double> createDoubleList(Parcel r6, int r7) {
        int r72 = readSize(r6, r7);
        int r02 = r6.dataPosition();
        if (r72 != 0) goto L6;
        return null;
    L6:
        ArrayList<Double> r1 = new ArrayList();
        int r2 = r6.readInt();
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L9;
        r1.add(Double.valueOf(r6.readDouble()));
        r3 = r3 + 1;
        goto L7
    L9:
        r6.setDataPosition(r02 + r72);
        return r1;
    }

    public static SparseArray<Double> createDoubleSparseArray(Parcel r7, int r8) {
        int r82 = readSize(r7, r8);
        int r02 = r7.dataPosition();
        if (r82 != 0) goto L6;
        return null;
    L6:
        SparseArray<Double> r1 = new SparseArray();
        int r2 = r7.readInt();
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L9;
        r1.append(r7.readInt(), Double.valueOf(r7.readDouble()));
        r3 = r3 + 1;
        goto L7
    L9:
        r7.setDataPosition(r02 + r82);
        return r1;
    }

    public static float[] createFloatArray(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 != 0) goto L6;
        return null;
    L6:
        float[] r1 = r2.createFloatArray();
        r2.setDataPosition(r02 + r32);
        return r1;
    }

    public static ArrayList<Float> createFloatList(Parcel r5, int r6) {
        int r62 = readSize(r5, r6);
        int r02 = r5.dataPosition();
        if (r62 != 0) goto L6;
        return null;
    L6:
        ArrayList<Float> r1 = new ArrayList();
        int r2 = r5.readInt();
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L9;
        r1.add(Float.valueOf(r5.readFloat()));
        r3 = r3 + 1;
        goto L7
    L9:
        r5.setDataPosition(r02 + r62);
        return r1;
    }

    public static SparseArray<Float> createFloatSparseArray(Parcel r6, int r7) {
        int r72 = readSize(r6, r7);
        int r02 = r6.dataPosition();
        if (r72 != 0) goto L6;
        return null;
    L6:
        SparseArray<Float> r1 = new SparseArray();
        int r2 = r6.readInt();
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L9;
        r1.append(r6.readInt(), Float.valueOf(r6.readFloat()));
        r3 = r3 + 1;
        goto L7
    L9:
        r6.setDataPosition(r02 + r72);
        return r1;
    }

    public static IBinder[] createIBinderArray(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 != 0) goto L6;
        return null;
    L6:
        IBinder[] r1 = r2.createBinderArray();
        r2.setDataPosition(r02 + r32);
        return r1;
    }

    public static ArrayList<IBinder> createIBinderList(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 != 0) goto L6;
        return null;
    L6:
        ArrayList<IBinder> r1 = r2.createBinderArrayList();
        r2.setDataPosition(r02 + r32);
        return r1;
    }

    public static SparseArray<IBinder> createIBinderSparseArray(Parcel r6, int r7) {
        int r72 = readSize(r6, r7);
        int r02 = r6.dataPosition();
        if (r72 != 0) goto L6;
        return null;
    L6:
        int r1 = r6.readInt();
        SparseArray<IBinder> r2 = new SparseArray(r1);
        int r3 = 0;
    L7:
        if (r3 >= r1) goto L9;
        r2.append(r6.readInt(), r6.readStrongBinder());
        r3 = r3 + 1;
        goto L7
    L9:
        r6.setDataPosition(r02 + r72);
        return r2;
    }

    public static int[] createIntArray(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 != 0) goto L6;
        return null;
    L6:
        int[] r1 = r2.createIntArray();
        r2.setDataPosition(r02 + r32);
        return r1;
    }

    public static ArrayList<Integer> createIntegerList(Parcel r5, int r6) {
        int r62 = readSize(r5, r6);
        int r02 = r5.dataPosition();
        if (r62 != 0) goto L6;
        return null;
    L6:
        ArrayList<Integer> r1 = new ArrayList();
        int r2 = r5.readInt();
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L9;
        r1.add(Integer.valueOf(r5.readInt()));
        r3 = r3 + 1;
        goto L7
    L9:
        r5.setDataPosition(r02 + r62);
        return r1;
    }

    public static long[] createLongArray(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 != 0) goto L6;
        return null;
    L6:
        long[] r1 = r2.createLongArray();
        r2.setDataPosition(r02 + r32);
        return r1;
    }

    public static ArrayList<Long> createLongList(Parcel r6, int r7) {
        int r72 = readSize(r6, r7);
        int r02 = r6.dataPosition();
        if (r72 != 0) goto L6;
        return null;
    L6:
        ArrayList<Long> r1 = new ArrayList();
        int r2 = r6.readInt();
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L9;
        r1.add(Long.valueOf(r6.readLong()));
        r3 = r3 + 1;
        goto L7
    L9:
        r6.setDataPosition(r02 + r72);
        return r1;
    }

    public static Parcel createParcel(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 != 0) goto L6;
        return null;
    L6:
        Parcel r1 = Parcel.obtain();
        r1.appendFrom(r2, r02, r32);
        r2.setDataPosition(r02 + r32);
        return r1;
    }

    public static Parcel[] createParcelArray(Parcel r8, int r9) {
        int r92 = readSize(r8, r9);
        int r02 = r8.dataPosition();
        if (r92 != 0) goto L5;
        return null;
    L5:
        int r2 = r8.readInt();
        Parcel[] r3 = new Parcel[r2];
        int r4 = 0;
    L6:
        if (r4 >= r2) goto L12;
        int r5 = r8.readInt();
        if (r5 == 0) goto L10;
        int r6 = r8.dataPosition();
        Parcel r7 = Parcel.obtain();
        r7.appendFrom(r8, r6, r5);
        r3[r4] = r7;
        r8.setDataPosition(r6 + r5);
    L11:
        r4 = r4 + 1;
        goto L6
    L10:
        r3[r4] = null;
        goto L11
    L12:
        r8.setDataPosition(r02 + r92);
        return r3;
    }

    public static ArrayList<Parcel> createParcelList(Parcel r8, int r9) {
        int r92 = readSize(r8, r9);
        int r02 = r8.dataPosition();
        if (r92 != 0) goto L5;
        return null;
    L5:
        int r2 = r8.readInt();
        ArrayList<Parcel> r3 = new ArrayList();
        int r4 = 0;
    L6:
        if (r4 >= r2) goto L12;
        int r5 = r8.readInt();
        if (r5 == 0) goto L10;
        int r6 = r8.dataPosition();
        Parcel r7 = Parcel.obtain();
        r7.appendFrom(r8, r6, r5);
        r3.add(r7);
        r8.setDataPosition(r6 + r5);
    L11:
        r4 = r4 + 1;
        goto L6
    L10:
        r3.add(null);
        goto L11
    L12:
        r8.setDataPosition(r02 + r92);
        return r3;
    }

    public static SparseArray<Parcel> createParcelSparseArray(Parcel r9, int r10) {
        int r102 = readSize(r9, r10);
        int r02 = r9.dataPosition();
        if (r102 != 0) goto L5;
        return null;
    L5:
        int r2 = r9.readInt();
        SparseArray<Parcel> r3 = new SparseArray();
        int r4 = 0;
    L6:
        if (r4 >= r2) goto L12;
        int r5 = r9.readInt();
        int r6 = r9.readInt();
        if (r6 == 0) goto L10;
        int r7 = r9.dataPosition();
        Parcel r8 = Parcel.obtain();
        r8.appendFrom(r9, r7, r6);
        r3.append(r5, r8);
        r9.setDataPosition(r7 + r6);
    L11:
        r4 = r4 + 1;
        goto L6
    L10:
        r3.append(r5, null);
        goto L11
    L12:
        r9.setDataPosition(r02 + r102);
        return r3;
    }

    public static <T extends Parcelable> T createParcelable(Parcel r1, int r2, Parcelable.Creator<T> r3) {
        int r22 = readSize(r1, r2);
        int r02 = r1.dataPosition();
        if (r22 != 0) goto L6;
        return null;
    L6:
        T r32 = r3.createFromParcel(r1);
        r1.setDataPosition(r02 + r22);
        return r32;
    }

    public static SparseBooleanArray createSparseBooleanArray(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 != 0) goto L6;
        return null;
    L6:
        SparseBooleanArray r1 = r2.readSparseBooleanArray();
        r2.setDataPosition(r02 + r32);
        return r1;
    }

    public static SparseIntArray createSparseIntArray(Parcel r6, int r7) {
        int r72 = readSize(r6, r7);
        int r02 = r6.dataPosition();
        if (r72 != 0) goto L6;
        return null;
    L6:
        SparseIntArray r1 = new SparseIntArray();
        int r2 = r6.readInt();
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L9;
        r1.append(r6.readInt(), r6.readInt());
        r3 = r3 + 1;
        goto L7
    L9:
        r6.setDataPosition(r02 + r72);
        return r1;
    }

    public static SparseLongArray createSparseLongArray(Parcel r7, int r8) {
        int r82 = readSize(r7, r8);
        int r02 = r7.dataPosition();
        if (r82 != 0) goto L6;
        return null;
    L6:
        SparseLongArray r1 = new SparseLongArray();
        int r2 = r7.readInt();
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L9;
        r1.append(r7.readInt(), r7.readLong());
        r3 = r3 + 1;
        goto L7
    L9:
        r7.setDataPosition(r02 + r82);
        return r1;
    }

    public static String createString(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 != 0) goto L6;
        return null;
    L6:
        String r1 = r2.readString();
        r2.setDataPosition(r02 + r32);
        return r1;
    }

    public static String[] createStringArray(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 != 0) goto L6;
        return null;
    L6:
        String[] r1 = r2.createStringArray();
        r2.setDataPosition(r02 + r32);
        return r1;
    }

    public static ArrayList<String> createStringList(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 != 0) goto L6;
        return null;
    L6:
        ArrayList<String> r1 = r2.createStringArrayList();
        r2.setDataPosition(r02 + r32);
        return r1;
    }

    public static SparseArray<String> createStringSparseArray(Parcel r6, int r7) {
        int r72 = readSize(r6, r7);
        int r02 = r6.dataPosition();
        if (r72 != 0) goto L6;
        return null;
    L6:
        SparseArray<String> r1 = new SparseArray();
        int r2 = r6.readInt();
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L9;
        r1.append(r6.readInt(), r6.readString());
        r3 = r3 + 1;
        goto L7
    L9:
        r6.setDataPosition(r02 + r72);
        return r1;
    }

    public static <T> T[] createTypedArray(Parcel r1, int r2, Parcelable.Creator<T> r3) {
        int r22 = readSize(r1, r2);
        int r02 = r1.dataPosition();
        if (r22 != 0) goto L6;
        return null;
    L6:
        T[] r32 = (T[]) r1.createTypedArray(r3);
        r1.setDataPosition(r02 + r22);
        return r32;
    }

    public static <T> ArrayList<T> createTypedList(Parcel r1, int r2, Parcelable.Creator<T> r3) {
        int r22 = readSize(r1, r2);
        int r02 = r1.dataPosition();
        if (r22 != 0) goto L6;
        return null;
    L6:
        ArrayList<T> r32 = r1.createTypedArrayList(r3);
        r1.setDataPosition(r02 + r22);
        return r32;
    }

    public static <T> SparseArray<T> createTypedSparseArray(Parcel r7, int r8, Parcelable.Creator<T> r9) {
        int r82 = readSize(r7, r8);
        int r02 = r7.dataPosition();
        if (r82 != 0) goto L5;
        return null;
    L5:
        int r2 = r7.readInt();
        SparseArray<T> r3 = new SparseArray();
        int r4 = 0;
    L6:
        if (r4 >= r2) goto L12;
        int r5 = r7.readInt();
        if (r7.readInt() == 0) goto L10;
        T r6 = r9.createFromParcel(r7);
    L11:
        r3.append(r5, r6);
        r4 = r4 + 1;
        goto L6
    L10:
        r6 = null;
        goto L11
    L12:
        r7.setDataPosition(r02 + r82);
        return r3;
    }

    public static void ensureAtEnd(Parcel r3, int r4) {
        if (r3.dataPosition() != r4) goto L6;
        return;
    L6:
        throw new ParseException("Overread allowed size end=" + r4, r3);
    }

    public static int getFieldId(int r02) {
        return (char) r02;
    }

    public static boolean readBoolean(Parcel r1, int r2) {
        zzb(r1, r2, 4);
        if (r1.readInt() == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static Boolean readBooleanObject(Parcel r2, int r3) {
        int r02 = readSize(r2, r3);
        if (r02 != 0) goto L6;
        return null;
    L6:
        zza(r2, r3, r02, 4);
        if (r2.readInt() == 0) goto L9;
        boolean r22 = true;
    L11:
        return Boolean.valueOf(r22);
    L9:
        r22 = false;
        goto L11
    }

    public static byte readByte(Parcel r1, int r2) {
        zzb(r1, r2, 4);
        return (byte) r1.readInt();
    }

    public static char readChar(Parcel r1, int r2) {
        zzb(r1, r2, 4);
        return (char) r1.readInt();
    }

    public static double readDouble(Parcel r1, int r2) {
        zzb(r1, r2, 8);
        return r1.readDouble();
    }

    public static Double readDoubleObject(Parcel r2, int r3) {
        int r02 = readSize(r2, r3);
        if (r02 != 0) goto L6;
        return null;
    L6:
        zza(r2, r3, r02, 8);
        return Double.valueOf(r2.readDouble());
    }

    public static float readFloat(Parcel r1, int r2) {
        zzb(r1, r2, 4);
        return r1.readFloat();
    }

    public static Float readFloatObject(Parcel r2, int r3) {
        int r02 = readSize(r2, r3);
        if (r02 != 0) goto L6;
        return null;
    L6:
        zza(r2, r3, r02, 4);
        return Float.valueOf(r2.readFloat());
    }

    public static int readHeader(Parcel r02) {
        return r02.readInt();
    }

    public static IBinder readIBinder(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 != 0) goto L6;
        return null;
    L6:
        IBinder r1 = r2.readStrongBinder();
        r2.setDataPosition(r02 + r32);
        return r1;
    }

    public static int readInt(Parcel r1, int r2) {
        zzb(r1, r2, 4);
        return r1.readInt();
    }

    public static Integer readIntegerObject(Parcel r2, int r3) {
        int r02 = readSize(r2, r3);
        if (r02 != 0) goto L6;
        return null;
    L6:
        zza(r2, r3, r02, 4);
        return Integer.valueOf(r2.readInt());
    }

    public static void readList(Parcel r1, int r2, List r3, ClassLoader r4) {
        int r22 = readSize(r1, r2);
        int r02 = r1.dataPosition();
        if (r22 != 0) goto L5;
        return;
    L5:
        r1.readList(r3, r4);
        r1.setDataPosition(r02 + r22);
    }

    public static long readLong(Parcel r1, int r2) {
        zzb(r1, r2, 8);
        return r1.readLong();
    }

    public static Long readLongObject(Parcel r2, int r3) {
        int r02 = readSize(r2, r3);
        if (r02 != 0) goto L6;
        return null;
    L6:
        zza(r2, r3, r02, 8);
        return Long.valueOf(r2.readLong());
    }

    public static PendingIntent readPendingIntent(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 != 0) goto L6;
        return null;
    L6:
        PendingIntent r1 = PendingIntent.readPendingIntentOrNullFromParcel(r2);
        r2.setDataPosition(r02 + r32);
        return r1;
    }

    public static short readShort(Parcel r1, int r2) {
        zzb(r1, r2, 4);
        return (short) r1.readInt();
    }

    public static int readSize(Parcel r2, int r3) {
        if ((r3 & (-65536)) == (-65536)) goto L7;
        return (char) (r3 >> 16);
    L7:
        return r2.readInt();
    }

    public static void skipUnknownField(Parcel r1, int r2) {
        int r22 = readSize(r1, r2);
        r1.setDataPosition(r1.dataPosition() + r22);
    }

    public static int validateObjectHeader(Parcel r5) {
        int r02 = readHeader(r5);
        int r1 = readSize(r5, r02);
        int r2 = getFieldId(r02);
        int r3 = r5.dataPosition();
        if (r2 != 20293) goto L12;
        int r12 = r1 + r3;
        if (r12 < r3) goto L10;
        if (r12 > r5.dataSize()) goto L10;
        return r12;
    L10:
        throw new ParseException("Size read is invalid start=" + r3 + " end=" + r12, r5);
    L12:
        throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(r02))), r5);
    }

    private static void zza(Parcel r3, int r4, int r5, int r6) {
        if (r5 != r6) goto L5;
        return;
    L5:
        throw new ParseException("Expected size " + r6 + " got " + r5 + " (0x" + Integer.toHexString(r5) + ")", r3);
    }

    private static void zzb(Parcel r4, int r5, int r6) {
        int r52 = readSize(r4, r5);
        if (r52 != r6) goto L6;
        return;
    L6:
        throw new ParseException("Expected size " + r6 + " got " + r52 + " (0x" + Integer.toHexString(r52) + ")", r4);
    }
}
