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
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class SafeParcelReader {

    public static class ParseException extends RuntimeException {
        public ParseException(String r3, Parcel r4) {
            StringBuffer r02 = new StringBuffer(String.valueOf(r3).length() + 41);
            r02.append(r3);
            r02.append(" Parcel: pos=");
            r02.append(r4.dataPosition());
            r02.append(" size=");
            r02.append(r4.dataSize());
            super(r02.toString());
        }
    }

    private SafeParcelReader() {
    }

    private static boolean a(int r2, int r3) {
        long r02 = r2 + r3;
        if (r02 <= 2147483647L) goto L5;
        return true;
    L5:
        if (r02 < (-2147483648L)) goto L11;
        return false;
    L11:
        return true;
    }

    private static void b(Parcel r4, int r5, int r6) {
        int r52 = readSize(r4, r5);
        if (r52 != r6) goto L5;
        return;
    L5:
        String r02 = Integer.toHexString(r52);
        StringBuilder r2 = new StringBuilder(r02.length() + 46);
        r2.append("Expected size ");
        r2.append(r6);
        r2.append(" got ");
        r2.append(r52);
        r2.append(" (0x");
        r2.append(r02);
        r2.append(")");
        throw new ParseException(r2.toString(), r4);
    }

    public static BigDecimal createBigDecimal(Parcel r3, int r4) {
        int r42 = readSize(r3, r4);
        int r02 = r3.dataPosition();
        if (r42 != 0) goto L6;
        return null;
    L6:
        a(r3, r42, r02);
        byte[] r1 = r3.createByteArray();
        int r2 = r3.readInt();
        r3.setDataPosition(r42 + r02);
        return new BigDecimal(new BigInteger(r1), r2);
    }

    public static BigDecimal[] createBigDecimalArray(Parcel r7, int r8) {
        int r82 = readSize(r7, r8);
        int r02 = r7.dataPosition();
        int r1 = 0;
        if (r82 == 0) goto L5;
        a(r7, r82, r02);
        int r2 = r7.readInt();
        a(r7, r2);
        BigDecimal[] r3 = new BigDecimal[r2];
    L7:
        if (r1 >= r2) goto L9;
        r3[r1] = new BigDecimal(new BigInteger(r7.createByteArray()), r7.readInt());
        r1 = r1 + 1;
        goto L7
    L9:
        r7.setDataPosition(r02 + r82);
        return r3;
    L5:
        return new BigDecimal[0];
    }

    public static BigInteger createBigInteger(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 != 0) goto L6;
        return null;
    L6:
        a(r2, r32, r02);
        byte[] r1 = r2.createByteArray();
        r2.setDataPosition(r32 + r02);
        return new BigInteger(r1);
    }

    public static BigInteger[] createBigIntegerArray(Parcel r6, int r7) {
        int r72 = readSize(r6, r7);
        int r02 = r6.dataPosition();
        int r1 = 0;
        if (r72 == 0) goto L5;
        a(r6, r72, r02);
        int r2 = r6.readInt();
        a(r6, r2);
        BigInteger[] r3 = new BigInteger[r2];
    L7:
        if (r1 >= r2) goto L9;
        r3[r1] = new BigInteger(r6.createByteArray());
        r1 = r1 + 1;
        goto L7
    L9:
        r6.setDataPosition(r02 + r72);
        return r3;
    L5:
        return new BigInteger[0];
    }

    public static boolean[] createBooleanArray(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 == 0) goto L5;
        a(r2, r32, r02);
        boolean[] r1 = r2.createBooleanArray();
        r2.setDataPosition(r32 + r02);
        return r1;
    L5:
        return new boolean[0];
    }

    public static ArrayList<Boolean> createBooleanList(Parcel r6, int r7) {
        int r72 = readSize(r6, r7);
        int r02 = r6.dataPosition();
        if (r72 != 0) goto L6;
        return null;
    L6:
        a(r6, r72, r02);
        ArrayList<Boolean> r1 = new ArrayList();
        int r2 = r6.readInt();
        a(r6, r2);
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
        a(r2, r32, r02);
        Bundle r1 = r2.readBundle();
        r2.setDataPosition(r32 + r02);
        return r1;
    }

    public static byte[] createByteArray(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 == 0) goto L5;
        a(r2, r32, r02);
        byte[] r1 = r2.createByteArray();
        r2.setDataPosition(r32 + r02);
        return r1;
    L5:
        return new byte[0];
    }

    public static byte[][] createByteArrayArray(Parcel r5, int r6) {
        int r62 = readSize(r5, r6);
        int r02 = r5.dataPosition();
        if (r62 != 0) goto L6;
        return null;
    L6:
        a(r5, r62, r02);
        int r1 = r5.readInt();
        a(r5, r1);
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
        a(r6, r72, r02);
        int r1 = r6.readInt();
        a(r6, r1);
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
        if (r32 == 0) goto L5;
        a(r2, r32, r02);
        char[] r1 = r2.createCharArray();
        r2.setDataPosition(r32 + r02);
        return r1;
    L5:
        return new char[0];
    }

    public static double[] createDoubleArray(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 == 0) goto L5;
        a(r2, r32, r02);
        double[] r1 = r2.createDoubleArray();
        r2.setDataPosition(r32 + r02);
        return r1;
    L5:
        return new double[0];
    }

    public static ArrayList<Double> createDoubleList(Parcel r6, int r7) {
        int r72 = readSize(r6, r7);
        int r02 = r6.dataPosition();
        if (r72 != 0) goto L6;
        return null;
    L6:
        a(r6, r72, r02);
        ArrayList<Double> r1 = new ArrayList();
        int r2 = r6.readInt();
        a(r6, r2);
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
        a(r7, r82, r02);
        SparseArray<Double> r1 = new SparseArray();
        int r2 = r7.readInt();
        a(r7, r2);
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
        if (r32 == 0) goto L5;
        a(r2, r32, r02);
        float[] r1 = r2.createFloatArray();
        r2.setDataPosition(r32 + r02);
        return r1;
    L5:
        return new float[0];
    }

    public static ArrayList<Float> createFloatList(Parcel r5, int r6) {
        int r62 = readSize(r5, r6);
        int r02 = r5.dataPosition();
        if (r62 != 0) goto L6;
        return null;
    L6:
        a(r5, r62, r02);
        ArrayList<Float> r1 = new ArrayList();
        int r2 = r5.readInt();
        a(r5, r2);
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
        a(r6, r72, r02);
        SparseArray<Float> r1 = new SparseArray();
        int r2 = r6.readInt();
        a(r6, r2);
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
        if (r32 == 0) goto L5;
        a(r2, r32, r02);
        IBinder[] r1 = r2.createBinderArray();
        r2.setDataPosition(r32 + r02);
        return r1;
    L5:
        return new IBinder[0];
    }

    public static ArrayList<IBinder> createIBinderList(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 != 0) goto L6;
        return null;
    L6:
        a(r2, r32, r02);
        ArrayList<IBinder> r1 = r2.createBinderArrayList();
        r2.setDataPosition(r32 + r02);
        return r1;
    }

    public static SparseArray<IBinder> createIBinderSparseArray(Parcel r6, int r7) {
        int r72 = readSize(r6, r7);
        int r02 = r6.dataPosition();
        if (r72 != 0) goto L6;
        return null;
    L6:
        a(r6, r72, r02);
        int r1 = r6.readInt();
        a(r6, r1);
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
        if (r32 == 0) goto L5;
        a(r2, r32, r02);
        int[] r1 = r2.createIntArray();
        r2.setDataPosition(r32 + r02);
        return r1;
    L5:
        return new int[0];
    }

    public static ArrayList<Integer> createIntegerList(Parcel r5, int r6) {
        int r62 = readSize(r5, r6);
        int r02 = r5.dataPosition();
        if (r62 != 0) goto L6;
        return null;
    L6:
        a(r5, r62, r02);
        ArrayList<Integer> r1 = new ArrayList();
        int r2 = r5.readInt();
        a(r5, r2);
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
        if (r32 == 0) goto L5;
        a(r2, r32, r02);
        long[] r1 = r2.createLongArray();
        r2.setDataPosition(r32 + r02);
        return r1;
    L5:
        return new long[0];
    }

    public static ArrayList<Long> createLongList(Parcel r6, int r7) {
        int r72 = readSize(r6, r7);
        int r02 = r6.dataPosition();
        if (r72 != 0) goto L6;
        return null;
    L6:
        a(r6, r72, r02);
        ArrayList<Long> r1 = new ArrayList();
        int r2 = r6.readInt();
        a(r6, r2);
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
        a(r2, r32, r02);
        Parcel r1 = Parcel.obtain();
        r1.appendFrom(r2, r02, r32);
        r2.setDataPosition(r32 + r02);
        return r1;
    }

    public static Parcel[] createParcelArray(Parcel r7, int r8) {
        int r82 = readSize(r7, r8);
        int r02 = r7.dataPosition();
        int r1 = 0;
        if (r82 == 0) goto L5;
        a(r7, r82, r02);
        int r2 = r7.readInt();
        a(r7, r2);
        Parcel[] r3 = new Parcel[r2];
    L7:
        if (r1 >= r2) goto L13;
        int r4 = r7.readInt();
        if (r4 != 0) goto L11;
        r3[r1] = null;
    L12:
        r1 = r1 + 1;
        goto L7
    L11:
        int r5 = r7.dataPosition();
        a(r7, r4, r5);
        Parcel r6 = Parcel.obtain();
        r6.appendFrom(r7, r5, r4);
        r3[r1] = r6;
        r7.setDataPosition(r4 + r5);
        goto L12
    L13:
        r7.setDataPosition(r02 + r82);
        return r3;
    L5:
        return new Parcel[0];
    }

    public static ArrayList<Parcel> createParcelList(Parcel r8, int r9) {
        int r92 = readSize(r8, r9);
        int r02 = r8.dataPosition();
        if (r92 != 0) goto L5;
        return null;
    L5:
        a(r8, r92, r02);
        int r2 = r8.readInt();
        a(r8, r2);
        ArrayList<Parcel> r3 = new ArrayList();
        int r4 = 0;
    L6:
        if (r4 >= r2) goto L12;
        int r5 = r8.readInt();
        if (r5 != 0) goto L10;
        r3.add(null);
    L11:
        r4 = r4 + 1;
        goto L6
    L10:
        int r6 = r8.dataPosition();
        a(r8, r5, r6);
        Parcel r7 = Parcel.obtain();
        r7.appendFrom(r8, r6, r5);
        r3.add(r7);
        r8.setDataPosition(r5 + r6);
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
        a(r9, r102, r02);
        int r2 = r9.readInt();
        a(r9, r2);
        SparseArray<Parcel> r3 = new SparseArray();
        int r4 = 0;
    L6:
        if (r4 >= r2) goto L12;
        int r5 = r9.readInt();
        int r6 = r9.readInt();
        if (r6 != 0) goto L10;
        r3.append(r5, null);
    L11:
        r4 = r4 + 1;
        goto L6
    L10:
        int r7 = r9.dataPosition();
        a(r9, r6, r7);
        Parcel r8 = Parcel.obtain();
        r8.appendFrom(r9, r7, r6);
        r3.append(r5, r8);
        r9.setDataPosition(r7 + r6);
        goto L11
    L12:
        r9.setDataPosition(r02 + r102);
        return r3;
    }

    public static <P extends Parcelable> P createParcelable(Parcel r1, int r2, Parcelable.Creator<P> r3) {
        int r22 = readSize(r1, r2);
        int r02 = r1.dataPosition();
        if (r22 != 0) goto L6;
        return null;
    L6:
        a(r1, r22, r02);
        P r32 = r3.createFromParcel(r1);
        r1.setDataPosition(r22 + r02);
        return r32;
    }

    public static SparseBooleanArray createSparseBooleanArray(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 != 0) goto L6;
        return null;
    L6:
        a(r2, r32, r02);
        SparseBooleanArray r1 = r2.readSparseBooleanArray();
        r2.setDataPosition(r32 + r02);
        return r1;
    }

    public static SparseIntArray createSparseIntArray(Parcel r6, int r7) {
        int r72 = readSize(r6, r7);
        int r02 = r6.dataPosition();
        if (r72 != 0) goto L6;
        return null;
    L6:
        a(r6, r72, r02);
        SparseIntArray r1 = new SparseIntArray();
        int r2 = r6.readInt();
        a(r6, r2);
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
        if (r7 != null) goto L5;
        return null;
    L5:
        int r82 = readSize(r7, r8);
        int r1 = r7.dataPosition();
        if (r82 != 0) goto L8;
        return null;
    L8:
        a(r7, r82, r1);
        SparseLongArray r02 = new SparseLongArray();
        int r2 = r7.readInt();
        a(r7, r2);
        int r3 = 0;
    L9:
        if (r3 >= r2) goto L11;
        r02.append(r7.readInt(), r7.readLong());
        r3 = r3 + 1;
        goto L9
    L11:
        r7.setDataPosition(r1 + r82);
        return r02;
    }

    public static String createString(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 != 0) goto L6;
        return null;
    L6:
        a(r2, r32, r02);
        String r1 = r2.readString();
        r2.setDataPosition(r32 + r02);
        return r1;
    }

    public static String[] createStringArray(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 == 0) goto L5;
        a(r2, r32, r02);
        String[] r1 = r2.createStringArray();
        r2.setDataPosition(r32 + r02);
        return r1;
    L5:
        return new String[0];
    }

    public static ArrayList<String> createStringList(Parcel r2, int r3) {
        int r32 = readSize(r2, r3);
        int r02 = r2.dataPosition();
        if (r32 != 0) goto L6;
        return null;
    L6:
        a(r2, r32, r02);
        ArrayList<String> r1 = r2.createStringArrayList();
        r2.setDataPosition(r32 + r02);
        return r1;
    }

    public static SparseArray<String> createStringSparseArray(Parcel r6, int r7) {
        int r72 = readSize(r6, r7);
        int r02 = r6.dataPosition();
        if (r72 != 0) goto L6;
        return null;
    L6:
        a(r6, r72, r02);
        SparseArray<String> r1 = new SparseArray();
        int r2 = r6.readInt();
        a(r6, r2);
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

    public static <C> C[] createTypedArray(Parcel r1, int r2, Parcelable.Creator<C> r3) {
        int r22 = readSize(r1, r2);
        int r02 = r1.dataPosition();
        if (r22 == 0) goto L5;
        a(r1, r22, r02);
        C[] r32 = (C[]) r1.createTypedArray(r3);
        r1.setDataPosition(r22 + r02);
        return r32;
    L5:
        return r3.newArray(0);
    }

    public static <C> ArrayList<C> createTypedList(Parcel r1, int r2, Parcelable.Creator<C> r3) {
        int r22 = readSize(r1, r2);
        int r02 = r1.dataPosition();
        if (r22 != 0) goto L6;
        return null;
    L6:
        a(r1, r22, r02);
        ArrayList<C> r32 = r1.createTypedArrayList(r3);
        r1.setDataPosition(r22 + r02);
        return r32;
    }

    public static <C> SparseArray<C> createTypedSparseArray(Parcel r7, int r8, Parcelable.Creator<C> r9) {
        int r82 = readSize(r7, r8);
        int r02 = r7.dataPosition();
        if (r82 != 0) goto L5;
        return null;
    L5:
        a(r7, r82, r02);
        int r2 = r7.readInt();
        a(r7, r2);
        SparseArray<C> r3 = new SparseArray();
        int r4 = 0;
    L6:
        if (r4 >= r2) goto L12;
        int r5 = r7.readInt();
        if (r7.readInt() == 0) goto L10;
        C r6 = r9.createFromParcel(r7);
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

    public static int getFieldId(int r1) {
        return r1 & 65535;
    }

    public static boolean readBoolean(Parcel r1, int r2) {
        b(r1, r2, 4);
        if (r1.readInt() == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static Boolean readBooleanObject(Parcel r2, int r3) {
        int r02 = readSize(r2, r3);
        if (r02 == 0) goto L5;
        a(r2, r3, r02, 4);
        if (r2.readInt() == 0) goto L9;
        boolean r22 = true;
    L11:
        return Boolean.valueOf(r22);
    L9:
        r22 = false;
        goto L11
    L5:
        return Boolean.FALSE;
    }

    public static byte readByte(Parcel r1, int r2) {
        b(r1, r2, 4);
        return (byte) r1.readInt();
    }

    public static char readChar(Parcel r1, int r2) {
        b(r1, r2, 4);
        return (char) r1.readInt();
    }

    public static double readDouble(Parcel r1, int r2) {
        b(r1, r2, 8);
        return r1.readDouble();
    }

    public static Double readDoubleObject(Parcel r2, int r3) {
        int r02 = readSize(r2, r3);
        if (r02 != 0) goto L6;
        return null;
    L6:
        a(r2, r3, r02, 8);
        return Double.valueOf(r2.readDouble());
    }

    public static float readFloat(Parcel r1, int r2) {
        b(r1, r2, 4);
        return r1.readFloat();
    }

    public static Float readFloatObject(Parcel r2, int r3) {
        int r02 = readSize(r2, r3);
        if (r02 != 0) goto L6;
        return null;
    L6:
        a(r2, r3, r02, 4);
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
        a(r2, r32, r02);
        IBinder r1 = r2.readStrongBinder();
        r2.setDataPosition(r32 + r02);
        return r1;
    }

    public static int readInt(Parcel r1, int r2) {
        b(r1, r2, 4);
        return r1.readInt();
    }

    public static Integer readIntegerObject(Parcel r2, int r3) {
        int r02 = readSize(r2, r3);
        if (r02 != 0) goto L6;
        return null;
    L6:
        a(r2, r3, r02, 4);
        return Integer.valueOf(r2.readInt());
    }

    public static void readList(Parcel r1, int r2, List r3, ClassLoader r4) {
        int r22 = readSize(r1, r2);
        int r02 = r1.dataPosition();
        if (r22 == 0) goto L6;
        a(r1, r22, r02);
        r1.readList(r3, r4);
        r1.setDataPosition(r22 + r02);
        return;
    }

    public static long readLong(Parcel r1, int r2) {
        b(r1, r2, 8);
        return r1.readLong();
    }

    public static Long readLongObject(Parcel r2, int r3) {
        int r02 = readSize(r2, r3);
        if (r02 != 0) goto L6;
        return null;
    L6:
        a(r2, r3, r02, 8);
        return Long.valueOf(r2.readLong());
    }

    public static short readShort(Parcel r1, int r2) {
        b(r1, r2, 4);
        return (short) r1.readInt();
    }

    public static int readSize(Parcel r2, int r3) {
        if ((r3 & (-65536)) == (-65536)) goto L7;
        return (r3 >> 16) & 65535;
    L7:
        return r2.readInt();
    }

    public static void skipUnknownField(Parcel r1, int r2) {
        int r22 = readSize(r1, r2);
        int r02 = r1.dataPosition();
        a(r1, r22, r02);
        r1.setDataPosition(r22 + r02);
    }

    public static int validateObjectHeader(Parcel r5) {
        int r02 = readHeader(r5);
        int r1 = readSize(r5, r02);
        int r2 = r5.dataPosition();
        if (getFieldId(r02) == 20293) goto L9;
        String r03 = Integer.toHexString(r02);
        String r3 = "Expected object header. Got 0x";
        if (r03.length() == 0) goto L8;
        r3 = "Expected object header. Got 0x".concat(r03);
    L8:
        throw new ParseException(r3, r5);
    L9:
        int r12 = r1 + r2;
        if (r12 < r2) goto L15;
        if (r12 > r5.dataSize()) goto L15;
        return r12;
    L15:
        throw new ParseException("invalid start=" + r2 + " end=" + r12, r5);
    }

    private static void a(Parcel r3, int r4, int r5, int r6) {
        if (r5 != r6) goto L4;
        return;
    L4:
        String r42 = Integer.toHexString(r5);
        StringBuilder r1 = new StringBuilder(r42.length() + 46);
        r1.append("Expected size ");
        r1.append(r6);
        r1.append(" got ");
        r1.append(r5);
        r1.append(" (0x");
        r1.append(r42);
        r1.append(")");
        throw new ParseException(r1.toString(), r3);
    }

    private static void a(Parcel r02, int r1, int r2) {
        if (r1 < 0) goto L7;
        if (a(r1, r2) == true) goto L7;
        return;
    L7:
        throw new ParseException("dataPosition cannot be beyond integer scope", r02);
    }

    private static void a(Parcel r1, int r2) {
        if (r2 > 1024) goto L6;
        return;
    L6:
        throw new ParseException("arraySize cannot be beyond 65535", r1);
    }
}
