package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import java.security.AccessController;
import java.util.Random;
import sun.misc.Unsafe;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes5.dex */
abstract class Striped64 extends Number {
    static final int NCPU = 0;
    private static final Unsafe UNSAFE = null;
    private static final long baseOffset = 0;
    private static final long busyOffset = 0;
    static final Random rng = null;
    static final ThreadLocal<int[]> threadHashCode = null;
    volatile transient long base;
    volatile transient int busy;
    volatile transient Cell[] cells;

    public static final class Cell {
        private static final Unsafe UNSAFE = null;
        private static final long valueOffset = 0;

        /* renamed from: p0, reason: collision with root package name */
        volatile long f38366p0;
        volatile long p1;
        volatile long p2;
        volatile long p3;
        volatile long p4;
        volatile long p5;
        volatile long p6;

        /* renamed from: q0, reason: collision with root package name */
        volatile long f38367q0;
        volatile long q1;
        volatile long q2;
        volatile long q3;
        volatile long q4;
        volatile long q5;
        volatile long q6;
        volatile long value;

        static {
            Unsafe r02 = Striped64.access$000();     // Catch: Exception -> L4
            UNSAFE = r02;     // Catch: Exception -> L4
            valueOffset = r02.objectFieldOffset(Cell.class.getDeclaredField("value"));     // Catch: Exception -> L4
            return;
        L4:
            e = move-exception;
            throw new Error(e);
        }

        public Cell(long r1) {
            this.value = r1;
        }

        public final boolean cas(long r9, long r11) {
            return UNSAFE.compareAndSwapLong(this, valueOffset, r9, r11);
        }
    }

    static {
        threadHashCode = new ThreadLocal();
        rng = new Random();
        NCPU = Runtime.getRuntime().availableProcessors();
        Unsafe r02 = getUnsafe();     // Catch: Exception -> L5
        UNSAFE = r02;     // Catch: Exception -> L5
        baseOffset = r02.objectFieldOffset(Striped64.class.getDeclaredField("base"));     // Catch: Exception -> L5
        busyOffset = r02.objectFieldOffset(Striped64.class.getDeclaredField("busy"));     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        throw new Error(e);
    }

    public Striped64() {
    }

    public static /* synthetic */ Unsafe access$000() {
        return getUnsafe();
    }

    private static Unsafe getUnsafe() {
        return Unsafe.getUnsafe();
    L4:
        return (Unsafe) AccessController.doPrivileged(new AnonymousClass1());
    L6:
        e = move-exception;
        throw new RuntimeException("Could not initialize intrinsics", e.getCause());
    }

    public final boolean casBase(long r9, long r11) {
        return UNSAFE.compareAndSwapLong(this, baseOffset, r9, r11);
    }

    public final boolean casBusy() {
        return UNSAFE.compareAndSwapInt(this, busyOffset, 0, 1);
    }

    public abstract long fn(long r1, long r3);

    public final void internalReset(long r5) {
        Cell[] r02 = this.cells;
        this.base = r5;
        if (r02 == null) goto L10;
        int r1 = r02.length;
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L14;
        Cell r3 = r02[r2];
        if (r3 == null) goto L9;
        r3.value = r5;
    L9:
        r2 = r2 + 1;
        goto L5
    L14:
        return;
    }

    public final void retryUpdate(long r17, int[] r19, boolean r20) {
        if (r19 != null) goto L8;
        int[] r6 = new int[1];
        threadHashCode.set(r6);
        int r5 = rng.nextInt();
        if (r5 != 0) goto L7;
        r5 = 1;
    L7:
        r6[0] = r5;
    L9:
        boolean r8 = false;
        int r7 = r5;
        boolean r52 = r20;
    L10:
        Cell[] r9 = this.cells;
        if (r9 == null) goto L68;
        int r10 = r9.length;
        if (r10 <= 0) goto L68;
        Cell r11 = r9[(r10 - 1) & r7];
        if (r11 == null) goto L17;
        if (r52 == false) goto L40;
        long r12 = r11.value;
        if (r11.cas(r12, fn(r12, r17)) == true) goto L122;
        if (r10 >= NCPU) goto L38;
        if (this.cells != r9) goto L38;
        if (r8 == false) goto L50;
        if (this.busy != 0) goto L66;
        if (casBusy() == false) goto L66;
        if (this.cells != r9) goto L63;
        Cell[] r82 = new Cell[r10 << 1];     // Catch: Throwable -> L60
        int r112 = 0;
    L58:
        if (r112 >= r10) goto L62;
        r82[r112] = r9[r112];     // Catch: Throwable -> L60
        r112 = r112 + 1;     // Catch: Throwable -> L60
        goto L58
    L62:
        this.cells = r82;     // Catch: Throwable -> L60
    L63:
        this.busy = 0;
        r8 = false;
    L60:
        th = move-exception;
        this.busy = 0;
        throw th;
    L66:
        int r72 = r7 ^ (r7 << 13);
        int r73 = r72 ^ (r72 >>> 17);
        r7 = r73 ^ (r73 << 5);
        r6[0] = r7;
        goto L10
    L50:
        r8 = true;
    L38:
        r8 = false;
        goto L66
    L122:
        return;
    L40:
        r52 = true;
        goto L66
    L17:
        if (this.busy != 0) goto L38;
        Cell r92 = new Cell(r17);
        if (this.busy != 0) goto L38;
        if (casBusy() == false) goto L38;
        Cell[] r102 = this.cells;     // Catch: Throwable -> L30
        if (r102 == null) goto L32;
        int r113 = r102.length;     // Catch: Throwable -> L30
        if (r113 <= 0) goto L32;
        int r114 = (r113 - 1) & r7;     // Catch: Throwable -> L30
        if (r102[r114] != null) goto L32;
        r102[r114] = r92;     // Catch: Throwable -> L30
        boolean r93 = true;
    L33:
        this.busy = 0;
        if (r93 == false) goto L10;
        return;
    L32:
        r93 = false;
    L30:
        th = move-exception;
        this.busy = 0;
        throw th;
    L68:
        if (this.busy != 0) goto L85;
        if (this.cells != r9) goto L85;
        if (casBusy() == false) goto L85;
        if (this.cells != r9) goto L79;
        Cell[] r94 = new Cell[2];     // Catch: Throwable -> L77
        r94[r7 & 1] = new Cell(r17);     // Catch: Throwable -> L77
        this.cells = r94;     // Catch: Throwable -> L77
        boolean r95 = true;
    L80:
        this.busy = 0;
        if (r95 == false) goto L10;
        return;
    L79:
        r95 = false;
    L77:
        th = move-exception;
        this.busy = 0;
        throw th;
    L85:
        long r96 = this.base;
        if (casBase(r96, fn(r96, r17)) == false) goto L10;
        return;
    L8:
        r5 = r19[0];
        r6 = r19;
        goto L9
    }
}
