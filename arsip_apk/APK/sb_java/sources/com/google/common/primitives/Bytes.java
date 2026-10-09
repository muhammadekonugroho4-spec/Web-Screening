package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes5.dex */
public final class Bytes {

    @GwtCompatible
    public static class ByteArrayAsList extends AbstractList<Byte> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final byte[] array;
        final int end;
        final int start;

        public ByteArrayAsList(byte[] r3) {
            this(r3, 0, r3.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object r4) {
            if ((r4 instanceof Byte) == true) goto L5;
            return false;
        L5:
            if (Bytes.access$000(this.array, ((Byte) r4).byteValue(), this.start, this.end) == (-1)) goto L10;
            return true;
        L10:
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object r8) {
            if (r8 != this) goto L6;
            return true;
        L6:
            if ((r8 instanceof ByteArrayAsList) == false) goto L18;
            ByteArrayAsList r82 = (ByteArrayAsList) r8;
            int r1 = size();
            if (r82.size() == r1) goto L10;
            return false;
        L10:
            int r2 = 0;
        L11:
            if (r2 >= r1) goto L16;
            if (this.array[this.start + r2] != r82.array[r82.start + r2]) goto L14;
            r2 = r2 + 1;
            goto L11
        L14:
            return false;
        L16:
            return true;
        L18:
            return super.equals(r8);
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
            r1 = (r1 * 31) + Bytes.hashCode(this.array[r02]);
            r02 = r02 + 1;
            goto L4
        L6:
            return r1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object r4) {
            if ((r4 instanceof Byte) == false) goto L8;
            int r42 = Bytes.access$000(this.array, ((Byte) r4).byteValue(), this.start, this.end);
            if (r42 >= 0) goto L7;
            return -1;
        L7:
            return r42 - this.start;
        L8:
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object r4) {
            if ((r4 instanceof Byte) == false) goto L8;
            int r42 = Bytes.access$100(this.array, ((Byte) r4).byteValue(), this.start, this.end);
            if (r42 >= 0) goto L7;
            return -1;
        L7:
            return r42 - this.start;
        L8:
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object set(int r1, Object r2) {
            return set(r1, (Byte) r2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Byte> subList(int r4, int r5) {
            Preconditions.checkPositionIndexes(r4, r5, size());
            if (r4 == r5) goto L5;
            byte[] r1 = this.array;
            int r2 = this.start;
            return new ByteArrayAsList(r1, r4 + r2, r2 + r5);
        L5:
            return Collections.EMPTY_LIST;
        }

        public byte[] toByteArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder r02 = new StringBuilder(size() * 5);
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

        public ByteArrayAsList(byte[] r1, int r2, int r3) {
            this.array = r1;
            this.start = r2;
            this.end = r3;
        }

        @Override // java.util.AbstractList, java.util.List
        public Byte get(int r3) {
            Preconditions.checkElementIndex(r3, size());
            return Byte.valueOf(this.array[this.start + r3]);
        }

        public Byte set(int r4, Byte r5) {
            Preconditions.checkElementIndex(r4, size());
            byte[] r02 = this.array;
            int r1 = this.start;
            byte r2 = r02[r1 + r4];
            r02[r1 + r4] = ((Byte) Preconditions.checkNotNull(r5)).byteValue();
            return Byte.valueOf(r2);
        }
    }

    private Bytes() {
    }

    public static /* synthetic */ int access$000(byte[] r02, byte r1, int r2, int r3) {
        return indexOf(r02, r1, r2, r3);
    }

    public static /* synthetic */ int access$100(byte[] r02, byte r1, int r2, int r3) {
        return lastIndexOf(r02, r1, r2, r3);
    }

    public static List<Byte> asList(byte... r1) {
        if (r1.length != 0) goto L7;
        return Collections.EMPTY_LIST;
    L7:
        return new ByteArrayAsList(r1);
    }

    public static byte[] concat(byte[]... r7) {
        int r02 = r7.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r02) goto L5;
        r3 = r3 + r7[r2].length;
        r2 = r2 + 1;
        goto L3
    L5:
        byte[] r03 = new byte[r3];
        int r22 = r7.length;
        int r32 = 0;
        int r4 = 0;
    L6:
        if (r32 >= r22) goto L8;
        byte[] r5 = r7[r32];
        System.arraycopy(r5, 0, r03, r4, r5.length);
        r4 = r4 + r5.length;
        r32 = r32 + 1;
        goto L6
    L8:
        return r03;
    }

    public static boolean contains(byte[] r4, byte r5) {
        int r02 = r4.length;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L9;
        if (r4[r2] == r5) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    public static byte[] ensureCapacity(byte[] r4, int r5, int r6) {
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

    public static int hashCode(byte r02) {
        return r02;
    }

    public static int indexOf(byte[] r2, byte r3) {
        return indexOf(r2, r3, 0, r2.length);
    }

    public static int lastIndexOf(byte[] r2, byte r3) {
        return lastIndexOf(r2, r3, 0, r2.length);
    }

    public static void reverse(byte[] r2) {
        Preconditions.checkNotNull(r2);
        reverse(r2, 0, r2.length);
    }

    public static byte[] toArray(Collection<? extends Number> r4) {
        if ((r4 instanceof ByteArrayAsList) == true) goto L5;
        Object[] r42 = r4.toArray();
        int r02 = r42.length;
        byte[] r1 = new byte[r02];
        int r2 = 0;
    L7:
        if (r2 >= r02) goto L9;
        r1[r2] = ((Number) Preconditions.checkNotNull(r42[r2])).byteValue();
        r2 = r2 + 1;
        goto L7
    L9:
        return r1;
    L5:
        return ((ByteArrayAsList) r4).toByteArray();
    }

    private static int indexOf(byte[] r1, byte r2, int r3, int r4) {
    L2:
        if (r3 >= r4) goto L7;
        if (r1[r3] == r2) goto L5;
        r3 = r3 + 1;
        goto L2
    L5:
        return r3;
    L7:
        return -1;
    }

    private static int lastIndexOf(byte[] r1, byte r2, int r3, int r4) {
        int r42 = r4 - 1;
    L3:
        if (r42 < r3) goto L8;
        if (r1[r42] == r2) goto L6;
        r42 = r42 - 1;
        goto L3
    L6:
        return r42;
    L8:
        return -1;
    }

    public static int indexOf(byte[] r5, byte[] r6) {
        Preconditions.checkNotNull(r5, "array");
        Preconditions.checkNotNull(r6, "target");
        if (r6.length != 0) goto L5;
        return 0;
    L5:
        int r02 = 0;
    L7:
        if (r02 >= ((r5.length - r6.length) + 1)) goto L16;
        int r2 = 0;
    L10:
        if (r2 >= r6.length) goto L15;
        if (r5[r02 + r2] != r6[r2]) goto L13;
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

    public static void reverse(byte[] r2, int r3, int r4) {
        Preconditions.checkNotNull(r2);
        Preconditions.checkPositionIndexes(r3, r4, r2.length);
        int r42 = r4 - 1;
    L3:
        if (r3 >= r42) goto L5;
        byte r02 = r2[r3];
        r2[r3] = r2[r42];
        r2[r42] = r02;
        r3 = r3 + 1;
        r42 = r42 - 1;
        goto L3
    }
}
