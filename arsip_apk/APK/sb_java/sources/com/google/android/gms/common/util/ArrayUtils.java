package com.google.android.gms.common.util;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

@KeepForSdk
/* loaded from: classes5.dex */
public final class ArrayUtils {
    private ArrayUtils() {
    }

    @KeepForSdk
    public static <T> T[] concat(T[]... r6) {
        if (r6.length == 0) goto L14;
        int r02 = 0;
        int r2 = 0;
    L6:
        if (r02 >= r6.length) goto L8;
        r2 = r2 + r6[r02].length;
        r02 = r02 + 1;
        goto L6
    L8:
        T[] r03 = (T[]) Arrays.copyOf(r6[0], r2);
        int r22 = r6[0].length;
        int r3 = 1;
    L10:
        if (r3 >= r6.length) goto L12;
        T[] r4 = r6[r3];
        int r5 = r4.length;
        System.arraycopy(r4, 0, r03, r22, r5);
        r22 = r22 + r5;
        r3 = r3 + 1;
        goto L10
    L12:
        return r03;
    L14:
        return (T[]) ((Object[]) Array.newInstance(r6.getClass(), 0));
    }

    @KeepForSdk
    public static byte[] concatByteArrays(byte[]... r6) {
        if (r6.length == 0) goto L14;
        int r02 = 0;
        int r2 = 0;
    L6:
        if (r02 >= r6.length) goto L8;
        r2 = r2 + r6[r02].length;
        r02 = r02 + 1;
        goto L6
    L8:
        byte[] r03 = Arrays.copyOf(r6[0], r2);
        int r22 = r6[0].length;
        int r3 = 1;
    L10:
        if (r3 >= r6.length) goto L12;
        byte[] r4 = r6[r3];
        int r5 = r4.length;
        System.arraycopy(r4, 0, r03, r22, r5);
        r22 = r22 + r5;
        r3 = r3 + 1;
        goto L10
    L12:
        return r03;
    L14:
        return new byte[0];
    }

    @KeepForSdk
    public static boolean contains(int[] r3, int r4) {
        if (r3 == null) goto L12;
        int r1 = 0;
    L6:
        if (r1 >= r3.length) goto L12;
        if (r3[r1] == r4) goto L9;
        r1 = r1 + 1;
        goto L6
    L9:
        return true;
    L12:
        return false;
    }

    @KeepForSdk
    public static <T> ArrayList<T> newArrayList() {
        return new ArrayList();
    }

    @KeepForSdk
    public static <T> T[] removeAll(T[] r8, T... r9) {
        if (r8 != null) goto L5;
        return null;
    L5:
        if (r9 == null) goto L32;
        int r1 = r9.length;
        if (r1 == 0) goto L32;
        Class<?> r2 = r9.getClass();
        int r3 = r8.length;
        T[] r22 = (T[]) ((Object[]) Array.newInstance(r2.getComponentType(), r3));
        int r4 = 0;
        if (r1 != 1) goto L17;
        int r12 = 0;
        int r5 = 0;
    L12:
        if (r12 >= r3) goto L24;
        T r6 = r8[r12];
        if (Objects.equal(r9[0], r6) == true) goto L16;
        r22[r5] = r6;
        r5 = r5 + 1;
    L16:
        r12 = r12 + 1;
    L24:
        if (r22 != null) goto L27;
        return null;
    L27:
        if (r5 != r22.length) goto L30;
        return r22;
    L30:
        return (T[]) Arrays.copyOf(r22, r5);
    L17:
        int r13 = 0;
    L18:
        if (r4 >= r3) goto L23;
        T r52 = r8[r4];
        if (contains(r9, r52) == true) goto L22;
        r22[r13] = r52;
        r13 = r13 + 1;
    L22:
        r4 = r4 + 1;
        goto L18
    L23:
        r5 = r13;
    L32:
        return (T[]) Arrays.copyOf(r8, r8.length);
    }

    @KeepForSdk
    public static <T> ArrayList<T> toArrayList(T[] r4) {
        int r02 = r4.length;
        ArrayList<T> r1 = new ArrayList(r02);
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L5;
        r1.add(r4[r2]);
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    @KeepForSdk
    public static int[] toPrimitiveArray(Collection<Integer> r4) {
        int r02 = 0;
        if (r4 == null) goto L13;
        if (r4.isEmpty() == true) goto L13;
        int[] r1 = new int[r4.size()];
        Iterator<Integer> r42 = r4.iterator();
    L9:
        if (r42.hasNext() == false) goto L11;
        r1[r02] = r42.next().intValue();
        r02 = r02 + 1;
        goto L9
    L11:
        return r1;
    L13:
        return new int[0];
    }

    @KeepForSdk
    public static Integer[] toWrapperArray(int[] r4) {
        if (r4 != null) goto L5;
        return null;
    L5:
        int r02 = r4.length;
        Integer[] r1 = new Integer[r02];
        int r2 = 0;
    L6:
        if (r2 >= r02) goto L8;
        r1[r2] = Integer.valueOf(r4[r2]);
        r2 = r2 + 1;
        goto L6
    L8:
        return r1;
    }

    @KeepForSdk
    public static void writeArray(StringBuilder r4, double[] r5) {
        int r02 = r5.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L7;
        if (r1 == 0) goto L6;
        r4.append(Constants.SEPARATOR_COMMA);
    L6:
        r4.append(r5[r1]);
        r1 = r1 + 1;
        goto L3
    }

    @KeepForSdk
    public static void writeStringArray(StringBuilder r4, String[] r5) {
        int r02 = r5.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L7;
        if (r1 == 0) goto L6;
        r4.append(Constants.SEPARATOR_COMMA);
    L6:
        r4.append("\"");
        r4.append(r5[r1]);
        r4.append("\"");
        r1 = r1 + 1;
        goto L3
    }

    @KeepForSdk
    public static <T> boolean contains(T[] r4, T r5) {
        if (r4 == null) goto L5;
        int r1 = r4.length;
    L6:
        int r2 = 0;
    L7:
        if (r2 >= r1) goto L14;
        if (Objects.equal(r4[r2], r5) == true) goto L10;
        r2 = r2 + 1;
        goto L7
    L10:
        if (r2 < 0) goto L14;
        return true;
    L14:
        return false;
    L5:
        r1 = 0;
        goto L6
    }

    @KeepForSdk
    public static void writeArray(StringBuilder r3, float[] r4) {
        int r02 = r4.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L7;
        if (r1 == 0) goto L6;
        r3.append(Constants.SEPARATOR_COMMA);
    L6:
        r3.append(r4[r1]);
        r1 = r1 + 1;
        goto L3
    }

    @KeepForSdk
    public static void writeArray(StringBuilder r3, int[] r4) {
        int r02 = r4.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L7;
        if (r1 == 0) goto L6;
        r3.append(Constants.SEPARATOR_COMMA);
    L6:
        r3.append(r4[r1]);
        r1 = r1 + 1;
        goto L3
    }

    @KeepForSdk
    public static void writeArray(StringBuilder r4, long[] r5) {
        int r02 = r5.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L7;
        if (r1 == 0) goto L6;
        r4.append(Constants.SEPARATOR_COMMA);
    L6:
        r4.append(r5[r1]);
        r1 = r1 + 1;
        goto L3
    }

    @KeepForSdk
    public static <T> void writeArray(StringBuilder r3, T[] r4) {
        int r02 = r4.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L7;
        if (r1 == 0) goto L6;
        r3.append(Constants.SEPARATOR_COMMA);
    L6:
        r3.append(r4[r1]);
        r1 = r1 + 1;
        goto L3
    }

    @KeepForSdk
    public static void writeArray(StringBuilder r3, boolean[] r4) {
        int r02 = r4.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L7;
        if (r1 == 0) goto L6;
        r3.append(Constants.SEPARATOR_COMMA);
    L6:
        r3.append(r4[r1]);
        r1 = r1 + 1;
        goto L3
    }
}
