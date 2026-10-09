package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes5.dex */
public final class Longs {
    public static final int BYTES = 8;
    public static final long MAX_POWER_OF_TWO = 4611686018427387904L;

    public static final class AsciiDigits {
        private static final byte[] asciiDigits = null;

        static {
            byte[] r02 = new byte[128];
            Arrays.fill(r02, (byte) -1);
            int r1 = 0;
            int r2 = 0;
        L4:
            if (r2 >= 10) goto L7;
            r02[r2 + 48] = (byte) r2;
            r2 = r2 + 1;
        L7:
            if (r1 >= 26) goto L9;
            byte r3 = (byte) (r1 + 10);
            r02[r1 + 65] = r3;
            r02[r1 + 97] = r3;
            r1 = r1 + 1;
            goto L7
        L9:
            asciiDigits = r02;
        }

        private AsciiDigits() {
        }

        public static int digit(char r1) {
            if (r1 < 128) goto L5;
            return -1;
        L5:
            return asciiDigits[r1];
        }
    }

    public enum LexicographicalComparator extends Enum<LexicographicalComparator> implements Comparator<long[]> {
        private static final /* synthetic */ LexicographicalComparator[] $VALUES = null;
        public static final LexicographicalComparator INSTANCE = null;

        private static /* synthetic */ LexicographicalComparator[] $values() {
            return new LexicographicalComparator[]{INSTANCE};
        }

        static {
            INSTANCE = new LexicographicalComparator("INSTANCE", 0);
            $VALUES = $values();
        }

        LexicographicalComparator(String r1, int r2) {
        }

        public static LexicographicalComparator valueOf(String r1) {
            return (LexicographicalComparator) Enum.valueOf(LexicographicalComparator.class, r1);
        }

        public static LexicographicalComparator[] values() {
            return (LexicographicalComparator[]) $VALUES.clone();
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(long[] r1, long[] r2) {
            return compare2(r1, r2);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Longs.lexicographicalComparator()";
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(long[] r7, long[] r8) {
            int r02 = Math.min(r7.length, r8.length);
            int r1 = 0;
        L3:
            if (r1 >= r02) goto L9;
            int r2 = Longs.compare(r7[r1], r8[r1]);
            if (r2 != 0) goto L6;
            r1 = r1 + 1;
            goto L3
        L6:
            return r2;
        L9:
            return r7.length - r8.length;
        }
    }

    @GwtCompatible
    public static class LongArrayAsList extends AbstractList<Long> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final long[] array;
        final int end;
        final int start;

        public LongArrayAsList(long[] r3) {
            this(r3, 0, r3.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object r5) {
            if ((r5 instanceof Long) == true) goto L5;
            return false;
        L5:
            if (Longs.access$000(this.array, ((Long) r5).longValue(), this.start, this.end) == (-1)) goto L10;
            return true;
        L10:
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object r10) {
            if (r10 != this) goto L6;
            return true;
        L6:
            if ((r10 instanceof LongArrayAsList) == false) goto L18;
            LongArrayAsList r102 = (LongArrayAsList) r10;
            int r1 = size();
            if (r102.size() == r1) goto L10;
            return false;
        L10:
            int r2 = 0;
        L11:
            if (r2 >= r1) goto L16;
            if (this.array[this.start + r2] != r102.array[r102.start + r2]) goto L14;
            r2 = r2 + 1;
            goto L11
        L14:
            return false;
        L16:
            return true;
        L18:
            return super.equals(r10);
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int r1) {
            return get(r1);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int r02 = this.start;
            int r1 = 1;
        L4:
            if (r02 >= this.end) goto L6;
            r1 = (r1 * 31) + Longs.hashCode(this.array[r02]);
            r02 = r02 + 1;
            goto L4
        L6:
            return r1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object r5) {
            if ((r5 instanceof Long) == false) goto L8;
            int r52 = Longs.access$000(this.array, ((Long) r5).longValue(), this.start, this.end);
            if (r52 >= 0) goto L7;
            return -1;
        L7:
            return r52 - this.start;
        L8:
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object r5) {
            if ((r5 instanceof Long) == false) goto L8;
            int r52 = Longs.access$100(this.array, ((Long) r5).longValue(), this.start, this.end);
            if (r52 >= 0) goto L7;
            return -1;
        L7:
            return r52 - this.start;
        L8:
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object set(int r1, Object r2) {
            return set(r1, (Long) r2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int r4, int r5) {
            Preconditions.checkPositionIndexes(r4, r5, size());
            if (r4 == r5) goto L5;
            long[] r1 = this.array;
            int r2 = this.start;
            return new LongArrayAsList(r1, r4 + r2, r2 + r5);
        L5:
            return Collections.EMPTY_LIST;
        }

        public long[] toLongArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder r02 = new StringBuilder(size() * 10);
            r02.append('[');
            r02.append(this.array[this.start]);
            int r1 = this.start;
        L3:
            r1 = r1 + 1;
            if (r1 >= this.end) goto L6;
            r02.append(", ");
            r02.append(this.array[r1]);
            goto L3
        L6:
            r02.append(']');
            return r02.toString();
        }

        public LongArrayAsList(long[] r1, int r2, int r3) {
            this.array = r1;
            this.start = r2;
            this.end = r3;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int r4) {
            Preconditions.checkElementIndex(r4, size());
            return Long.valueOf(this.array[this.start + r4]);
        }

        public Long set(int r5, Long r6) {
            Preconditions.checkElementIndex(r5, size());
            long[] r02 = this.array;
            int r1 = this.start;
            long r2 = r02[r1 + r5];
            r02[r1 + r5] = ((Long) Preconditions.checkNotNull(r6)).longValue();
            return Long.valueOf(r2);
        }
    }

    public static final class LongConverter extends Converter<String, Long> implements Serializable {
        static final LongConverter INSTANCE = null;
        private static final long serialVersionUID = 1;

        static {
            INSTANCE = new LongConverter();
        }

        private LongConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Converter
        public /* bridge */ /* synthetic */ String doBackward(Long r1) {
            return doBackward2(r1);
        }

        @Override // com.google.common.base.Converter
        public /* bridge */ /* synthetic */ Long doForward(String r1) {
            return doForward2(r1);
        }

        public String toString() {
            return "Longs.stringConverter()";
        }

        /* renamed from: doBackward, reason: avoid collision after fix types in other method */
        public String doBackward2(Long r1) {
            return r1.toString();
        }

        /* renamed from: doForward, reason: avoid collision after fix types in other method */
        public Long doForward2(String r1) {
            return Long.decode(r1);
        }
    }

    private Longs() {
    }

    public static /* synthetic */ int access$000(long[] r02, long r1, int r3, int r4) {
        return indexOf(r02, r1, r3, r4);
    }

    public static /* synthetic */ int access$100(long[] r02, long r1, int r3, int r4) {
        return lastIndexOf(r02, r1, r3, r4);
    }

    public static List<Long> asList(long... r1) {
        if (r1.length != 0) goto L7;
        return Collections.EMPTY_LIST;
    L7:
        return new LongArrayAsList(r1);
    }

    public static int compare(long r02, long r2) {
        if (r02 >= r2) goto L6;
        return -1;
    L6:
        if (r02 <= r2) goto L9;
        return 1;
    L9:
        return 0;
    }

    public static long[] concat(long[]... r7) {
        int r02 = r7.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r02) goto L5;
        r3 = r3 + r7[r2].length;
        r2 = r2 + 1;
        goto L3
    L5:
        long[] r03 = new long[r3];
        int r22 = r7.length;
        int r32 = 0;
        int r4 = 0;
    L6:
        if (r32 >= r22) goto L8;
        long[] r5 = r7[r32];
        System.arraycopy(r5, 0, r03, r4, r5.length);
        r4 = r4 + r5.length;
        r32 = r32 + 1;
        goto L6
    L8:
        return r03;
    }

    @Beta
    public static long constrainToRange(long r7, long r9, long r11) {
        if (r9 > r11) goto L6;
        boolean r02 = true;
    L7:
        Preconditions.checkArgument(r02, "min (%s) must be less than or equal to max (%s)", r9, r11);
        return Math.min(Math.max(r7, r9), r11);
    L6:
        r02 = false;
        goto L7
    }

    public static boolean contains(long[] r5, long r6) {
        int r02 = r5.length;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L9;
        if (r5[r2] == r6) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    public static long[] ensureCapacity(long[] r4, int r5, int r6) {
        boolean r02 = false;
        if (r5 < 0) goto L5;
        boolean r2 = true;
    L6:
        Preconditions.checkArgument(r2, "Invalid minLength: %s", r5);
        if (r6 < 0) goto L9;
        r02 = true;
    L9:
        Preconditions.checkArgument(r02, "Invalid padding: %s", r6);
        if (r4.length < r5) goto L12;
        return r4;
    L12:
        return Arrays.copyOf(r4, r5 + r6);
    L5:
        r2 = false;
        goto L6
    }

    public static long fromByteArray(byte[] r14) {
        if (r14.length < 8) goto L5;
        boolean r02 = true;
    L6:
        Preconditions.checkArgument(r02, "array too small: %s < %s", r14.length, 8);
        return fromBytes(r14[0], r14[1], r14[2], r14[3], r14[4], r14[5], r14[6], r14[7]);
    L5:
        r02 = false;
        goto L6
    }

    public static long fromBytes(byte r5, byte r6, byte r7, byte r8, byte r9, byte r10, byte r11, byte r12) {
        return ((((((((r6 & 255) << 48) | ((r5 & 255) << 56)) | ((r7 & 255) << 40)) | ((r8 & 255) << 32)) | ((r9 & 255) << 24)) | ((r10 & 255) << 16)) | ((r11 & 255) << 8)) | (r12 & 255);
    }

    public static int hashCode(long r2) {
        return (int) (r2 ^ (r2 >>> 32));
    }

    public static int indexOf(long[] r2, long r3) {
        return indexOf(r2, r3, 0, r2.length);
    }

    public static String join(String r4, long... r5) {
        Preconditions.checkNotNull(r4);
        if (r5.length != 0) goto L6;
        return "";
    L6:
        StringBuilder r02 = new StringBuilder(r5.length * 10);
        r02.append(r5[0]);
        int r1 = 1;
    L8:
        if (r1 >= r5.length) goto L11;
        r02.append(r4);
        r02.append(r5[r1]);
        r1 = r1 + 1;
        goto L8
    L11:
        return r02.toString();
    }

    public static int lastIndexOf(long[] r2, long r3) {
        return lastIndexOf(r2, r3, 0, r2.length);
    }

    public static Comparator<long[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static long max(long... r6) {
        int r2 = 1;
        if (r6.length <= 0) goto L5;
        boolean r02 = true;
    L6:
        Preconditions.checkArgument(r02);
        long r03 = r6[0];
    L8:
        if (r2 >= r6.length) goto L13;
        long r3 = r6[r2];
        if (r3 <= r03) goto L12;
        r03 = r3;
    L12:
        r2 = r2 + 1;
        goto L8
    L13:
        return r03;
    L5:
        r02 = false;
        goto L6
    }

    public static long min(long... r6) {
        int r2 = 1;
        if (r6.length <= 0) goto L5;
        boolean r02 = true;
    L6:
        Preconditions.checkArgument(r02);
        long r03 = r6[0];
    L8:
        if (r2 >= r6.length) goto L13;
        long r3 = r6[r2];
        if (r3 >= r03) goto L12;
        r03 = r3;
    L12:
        r2 = r2 + 1;
        goto L8
    L13:
        return r03;
    L5:
        r02 = false;
        goto L6
    }

    public static void reverse(long[] r2) {
        Preconditions.checkNotNull(r2);
        reverse(r2, 0, r2.length);
    }

    public static void sortDescending(long[] r2) {
        Preconditions.checkNotNull(r2);
        sortDescending(r2, 0, r2.length);
    }

    @Beta
    public static Converter<String, Long> stringConverter() {
        return LongConverter.INSTANCE;
    }

    public static long[] toArray(Collection<? extends Number> r5) {
        if ((r5 instanceof LongArrayAsList) == true) goto L5;
        Object[] r52 = r5.toArray();
        int r02 = r52.length;
        long[] r1 = new long[r02];
        int r2 = 0;
    L7:
        if (r2 >= r02) goto L9;
        r1[r2] = ((Number) Preconditions.checkNotNull(r52[r2])).longValue();
        r2 = r2 + 1;
        goto L7
    L9:
        return r1;
    L5:
        return ((LongArrayAsList) r5).toLongArray();
    }

    public static byte[] toByteArray(long r5) {
        byte[] r1 = new byte[8];
        int r2 = 7;
    L3:
        if (r2 < 0) goto L5;
        r1[r2] = (byte) (255 & r5);
        r5 = r5 >> 8;
        r2 = r2 - 1;
        goto L3
    L5:
        return r1;
    }

    @Beta
    public static Long tryParse(String r1) {
        return tryParse(r1, 10);
    }

    private static int indexOf(long[] r2, long r3, int r5, int r6) {
    L2:
        if (r5 >= r6) goto L7;
        if (r2[r5] == r3) goto L5;
        r5 = r5 + 1;
        goto L2
    L5:
        return r5;
    L7:
        return -1;
    }

    private static int lastIndexOf(long[] r2, long r3, int r5, int r6) {
        int r62 = r6 - 1;
    L3:
        if (r62 < r5) goto L8;
        if (r2[r62] == r3) goto L6;
        r62 = r62 - 1;
        goto L3
    L6:
        return r62;
    L8:
        return -1;
    }

    @Beta
    public static Long tryParse(String r18, int r19) {
        if (((String) Preconditions.checkNotNull(r18)).isEmpty() == false) goto L6;
        return null;
    L6:
        if (r19 >= 2) goto L8;
    L42:
        StringBuilder r2 = new StringBuilder(65);
        r2.append("radix must be between MIN_RADIX and MAX_RADIX but was ");
        r2.append(r19);
        throw new IllegalArgumentException(r2.toString());
    L8:
        if (r19 > 36) goto L42;
        int r22 = 0;
        if (r18.charAt(0) != '-') goto L13;
        r22 = 1;
    L13:
        if (r22 != r18.length()) goto L15;
        return null;
    L15:
        int r4 = r22 + 1;
        int r5 = AsciiDigits.digit(r18.charAt(r22));
        if (r5 < 0) goto L41;
        if (r5 >= r19) goto L41;
        long r52 = -r5;
        long r7 = r19;
        long r11 = Long.MIN_VALUE / r7;
    L21:
        if (r4 >= r18.length()) goto L33;
        int r13 = r4 + 1;
        int r42 = AsciiDigits.digit(r18.charAt(r4));
        if (r42 < 0) goto L32;
        if (r42 >= r19) goto L32;
        if (r52 < r11) goto L32;
        long r53 = r52 * r7;
        long r14 = r42;
        if (r53 < (r14 - Long.MIN_VALUE)) goto L30;
        r52 = r53 - r14;
        r4 = r13;
        goto L21
    L30:
        return null;
    L32:
        return null;
    L33:
        if (r22 == 0) goto L37;
        return Long.valueOf(r52);
    L37:
        if (r52 != Long.MIN_VALUE) goto L40;
        return null;
    L40:
        return Long.valueOf(-r52);
    L41:
        return null;
    }

    public static int indexOf(long[] r7, long[] r8) {
        Preconditions.checkNotNull(r7, "array");
        Preconditions.checkNotNull(r8, "target");
        if (r8.length != 0) goto L5;
        return 0;
    L5:
        int r02 = 0;
    L7:
        if (r02 >= ((r7.length - r8.length) + 1)) goto L16;
        int r2 = 0;
    L10:
        if (r2 >= r8.length) goto L15;
        if (r7[r02 + r2] != r8[r2]) goto L13;
        r2 = r2 + 1;
        goto L10
    L13:
        r02 = r02 + 1;
        goto L7
    L15:
        return r02;
    L16:
        return -1;
    }

    public static void reverse(long[] r4, int r5, int r6) {
        Preconditions.checkNotNull(r4);
        Preconditions.checkPositionIndexes(r5, r6, r4.length);
        int r62 = r6 - 1;
    L3:
        if (r5 >= r62) goto L5;
        long r02 = r4[r5];
        r4[r5] = r4[r62];
        r4[r62] = r02;
        r5 = r5 + 1;
        r62 = r62 - 1;
        goto L3
    }

    public static void sortDescending(long[] r1, int r2, int r3) {
        Preconditions.checkNotNull(r1);
        Preconditions.checkPositionIndexes(r2, r3, r1.length);
        Arrays.sort(r1, r2, r3);
        reverse(r1, r2, r3);
    }
}
