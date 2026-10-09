package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class Random implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicLong f176856a = null;
    private static final long serialVersionUID = -4257915988930727506L;
    private boolean gausAvailable;
    private long inc;
    private double nextGaus;
    private long state;

    static {
        f176856a = new AtomicLong(System.nanoTime());
    }

    public Random() {
        this(a(), a());
    }

    public static long a() {
    L2:
        AtomicLong r02 = f176856a;
        long r1 = r02.get();
        long r3 = (r1 >> 12) ^ r1;
        long r32 = r3 ^ (r3 << 25);
        long r33 = (r32 ^ (r32 >> 27)) * 2685821657736338717L;
        if (r02.compareAndSet(r1, r33) == false) goto L2;
        return r33;
    }

    public void b(byte[] r8) {
        int r02 = 0;
    L4:
        if (r02 >= r8.length) goto L6;
        this.state = (this.state * 6364136223846793005L) + this.inc;
        r8[r02] = (byte) ((((r1 >>> 22) ^ r1) >>> ((int) ((r1 >>> 61) + 22))) >>> 24);
        r02 = r02 + 1;
        goto L4
    }

    public double c() {
        long r02 = this.state * 6364136223846793005L;
        long r4 = this.inc;
        long r03 = r02 + r4;
        long r7 = (((r03 >>> 22) ^ r03) >>> ((int) ((r03 >>> 61) + 22))) & 4294967295L;
        this.state = (r03 * 6364136223846793005L) + r4;
        return (((r7 >>> 6) << 27) + (((((r0 >>> 22) ^ r0) >>> ((int) ((r0 >>> 61) + 22))) & 4294967295L) >>> 5)) / 9.007199254740992E15d;
    }

    public void d(long r3, long r5) {
        long r52 = (r5 << 1) | 1;
        this.inc = r52;
        this.state = r52 + r3;
    }

    public Random(long r1, long r3) {
        d(r1, r3);
    }
}
