package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
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
public final class Booleans {

    @GwtCompatible
    public static class BooleanArrayAsList extends AbstractList<Boolean> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final boolean[] array;
        final int end;
        final int start;

        public BooleanArrayAsList(boolean[] r3) {
            this(r3, 0, r3.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object r4) {
            if ((r4 instanceof Boolean) == true) goto L5;
            return false;
        L5:
            if (Booleans.access$000(this.array, ((Boolean) r4).booleanValue(), this.start, this.end) == (-1)) goto L10;
            return true;
        L10:
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object r8) {
            if (r8 != this) goto L6;
            return true;
        L6:
            if ((r8 instanceof BooleanArrayAsList) == false) goto L18;
            BooleanArrayAsList r82 = (BooleanArrayAsList) r8;
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
            r1 = (r1 * 31) + Booleans.hashCode(this.array[r02]);
            r02 = r02 + 1;
            goto L4
        L6:
            return r1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object r4) {
            if ((r4 instanceof Boolean) == false) goto L8;
            int r42 = Booleans.access$000(this.array, ((Boolean) r4).booleanValue(), this.start, this.end);
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
            if ((r4 instanceof Boolean) == false) goto L8;
            int r42 = Booleans.access$100(this.array, ((Boolean) r4).booleanValue(), this.start, this.end);
            if (r42 >= 0) goto L7;
            return -1;
        L7:
            return r42 - this.start;
        L8:
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object set(int r1, Object r2) {
            return set(r1, (Boolean) r2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Boolean> subList(int r4, int r5) {
            Preconditions.checkPositionIndexes(r4, r5, size());
            if (r4 == r5) goto L5;
            boolean[] r1 = this.array;
            int r2 = this.start;
            return new BooleanArrayAsList(r1, r4 + r2, r2 + r5);
        L5:
            return Collections.EMPTY_LIST;
        }

        public boolean[] toBooleanArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder r02 = new StringBuilder(size() * 7);
            if (this.array[this.start] == false) goto L5;
            String r1 = "[true";
        L6:
            r02.append(r1);
            int r12 = this.start;
        L7:
            r12 = r12 + 1;
            if (r12 >= this.end) goto L14;
            if (this.array[r12] == false) goto L12;
            String r2 = ", true";
        L13:
            r02.append(r2);
            goto L7
        L12:
            r2 = ", false";
            goto L13
        L14:
            r02.append(']');
            return r02.toString();
        L5:
            r1 = "[false";
            goto L6
        }

        public BooleanArrayAsList(boolean[] r1, int r2, int r3) {
            this.array = r1;
            this.start = r2;
            this.end = r3;
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean get(int r3) {
            Preconditions.checkElementIndex(r3, size());
            return Boolean.valueOf(this.array[this.start + r3]);
        }

        public Boolean set(int r4, Boolean r5) {
            Preconditions.checkElementIndex(r4, size());
            boolean[] r02 = this.array;
            int r1 = this.start;
            boolean r2 = r02[r1 + r4];
            r02[r1 + r4] = ((Boolean) Preconditions.checkNotNull(r5)).booleanValue();
            return Boolean.valueOf(r2);
        }
    }

    public enum BooleanComparator extends Enum<BooleanComparator> implements Comparator<Boolean> {
        private static final /* synthetic */ BooleanComparator[] $VALUES = null;
        public static final BooleanComparator FALSE_FIRST = null;
        public static final BooleanComparator TRUE_FIRST = null;
        private final String toString;
        private final int trueValue;

        private static /* synthetic */ BooleanComparator[] $values() {
            return new BooleanComparator[]{TRUE_FIRST, FALSE_FIRST};
        }

        static {
            TRUE_FIRST = new BooleanComparator("TRUE_FIRST", 0, 1, "Booleans.trueFirst()");
            FALSE_FIRST = new BooleanComparator("FALSE_FIRST", 1, -1, "Booleans.falseFirst()");
            $VALUES = $values();
        }

        BooleanComparator(String r1, int r2, int r3, String r4) {
            this.trueValue = r3;
            this.toString = r4;
        }

        public static BooleanComparator valueOf(String r1) {
            return (BooleanComparator) Enum.valueOf(BooleanComparator.class, r1);
        }

        public static BooleanComparator[] values() {
            return (BooleanComparator[]) $VALUES.clone();
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Boolean r1, Boolean r2) {
            return compare2(r1, r2);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.toString;
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(Boolean r2, Boolean r3) {
            int r02 = 0;
            if (r2.booleanValue() == false) goto L5;
            int r22 = this.trueValue;
        L7:
            if (r3.booleanValue() == false) goto L10;
            r02 = this.trueValue;
        L10:
            return r02 - r22;
        L5:
            r22 = 0;
            goto L7
        }
    }

    public enum LexicographicalComparator extends Enum<LexicographicalComparator> implements Comparator<boolean[]> {
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
        public /* bridge */ /* synthetic */ int compare(boolean[] r1, boolean[] r2) {
            return compare2(r1, r2);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Booleans.lexicographicalComparator()";
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(boolean[] r5, boolean[] r6) {
            int r02 = Math.min(r5.length, r6.length);
            int r1 = 0;
        L3:
            if (r1 >= r02) goto L9;
            int r2 = Booleans.compare(r5[r1], r6[r1]);
            if (r2 != 0) goto L6;
            r1 = r1 + 1;
            goto L3
        L6:
            return r2;
        L9:
            return r5.length - r6.length;
        }
    }

    private Booleans() {
    }

    public static /* synthetic */ int access$000(boolean[] r02, boolean r1, int r2, int r3) {
        return indexOf(r02, r1, r2, r3);
    }

    public static /* synthetic */ int access$100(boolean[] r02, boolean r1, int r2, int r3) {
        return lastIndexOf(r02, r1, r2, r3);
    }

    public static List<Boolean> asList(boolean... r1) {
        if (r1.length != 0) goto L7;
        return Collections.EMPTY_LIST;
    L7:
        return new BooleanArrayAsList(r1);
    }

    public static int compare(boolean r02, boolean r1) {
        if (r02 != r1) goto L5;
        return 0;
    L5:
        if (r02 == false) goto L8;
        return 1;
    L8:
        return -1;
    }

    public static boolean[] concat(boolean[]... r7) {
        int r02 = r7.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r02) goto L5;
        r3 = r3 + r7[r2].length;
        r2 = r2 + 1;
        goto L3
    L5:
        boolean[] r03 = new boolean[r3];
        int r22 = r7.length;
        int r32 = 0;
        int r4 = 0;
    L6:
        if (r32 >= r22) goto L8;
        boolean[] r5 = r7[r32];
        System.arraycopy(r5, 0, r03, r4, r5.length);
        r4 = r4 + r5.length;
        r32 = r32 + 1;
        goto L6
    L8:
        return r03;
    }

    public static boolean contains(boolean[] r4, boolean r5) {
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

    @Beta
    public static int countTrue(boolean... r4) {
        int r02 = r4.length;
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r02) goto L8;
        if (r4[r1] == false) goto L7;
        r2 = r2 + 1;
    L7:
        r1 = r1 + 1;
        goto L3
    L8:
        return r2;
    }

    public static boolean[] ensureCapacity(boolean[] r4, int r5, int r6) {
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

    @Beta
    public static Comparator<Boolean> falseFirst() {
        return BooleanComparator.FALSE_FIRST;
    }

    public static int hashCode(boolean r02) {
        if (r02 == false) goto L5;
        return 1231;
    L5:
        return 1237;
    }

    public static int indexOf(boolean[] r2, boolean r3) {
        return indexOf(r2, r3, 0, r2.length);
    }

    public static String join(String r3, boolean... r4) {
        Preconditions.checkNotNull(r3);
        if (r4.length != 0) goto L6;
        return "";
    L6:
        StringBuilder r02 = new StringBuilder(r4.length * 7);
        r02.append(r4[0]);
        int r1 = 1;
    L8:
        if (r1 >= r4.length) goto L11;
        r02.append(r3);
        r02.append(r4[r1]);
        r1 = r1 + 1;
        goto L8
    L11:
        return r02.toString();
    }

    public static int lastIndexOf(boolean[] r2, boolean r3) {
        return lastIndexOf(r2, r3, 0, r2.length);
    }

    public static Comparator<boolean[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static void reverse(boolean[] r2) {
        Preconditions.checkNotNull(r2);
        reverse(r2, 0, r2.length);
    }

    public static boolean[] toArray(Collection<Boolean> r4) {
        if ((r4 instanceof BooleanArrayAsList) == true) goto L5;
        Object[] r42 = r4.toArray();
        int r02 = r42.length;
        boolean[] r1 = new boolean[r02];
        int r2 = 0;
    L7:
        if (r2 >= r02) goto L9;
        r1[r2] = ((Boolean) Preconditions.checkNotNull(r42[r2])).booleanValue();
        r2 = r2 + 1;
        goto L7
    L9:
        return r1;
    L5:
        return ((BooleanArrayAsList) r4).toBooleanArray();
    }

    @Beta
    public static Comparator<Boolean> trueFirst() {
        return BooleanComparator.TRUE_FIRST;
    }

    private static int indexOf(boolean[] r1, boolean r2, int r3, int r4) {
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

    private static int lastIndexOf(boolean[] r1, boolean r2, int r3, int r4) {
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

    public static int indexOf(boolean[] r5, boolean[] r6) {
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

    public static void reverse(boolean[] r2, int r3, int r4) {
        Preconditions.checkNotNull(r2);
        Preconditions.checkPositionIndexes(r3, r4, r2.length);
        int r42 = r4 - 1;
    L3:
        if (r3 >= r42) goto L5;
        boolean r02 = r2[r3];
        r2[r3] = r2[r42];
        r2[r42] = r02;
        r3 = r3 + 1;
        r42 = r42 - 1;
        goto L3
    }
}
