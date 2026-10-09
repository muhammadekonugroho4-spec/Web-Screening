package kotlin;

import kotlin.text.AbstractC11848a;

/* loaded from: classes3.dex */
public abstract class x {
    public static final int a(int r1, int r2) {
        return kotlin.jvm.internal.p.n(r1 ^ Integer.MIN_VALUE, r2 ^ Integer.MIN_VALUE);
    }

    public static final int b(long r2, long r4) {
        return kotlin.jvm.internal.p.o(r2 ^ Long.MIN_VALUE, r4 ^ Long.MIN_VALUE);
    }

    public static final double c(long r4) {
        return ((r4 >>> 11) * 2048) + (r4 & 2047);
    }

    public static final String d(long r8, int r10) {
        if (r8 < 0) goto L6;
        String r82 = Long.toString(r8, AbstractC11848a.a(r10));
        kotlin.jvm.internal.p.k(r82, "toString(...)");
        return r82;
    L6:
        long r4 = r10;
        long r2 = ((r8 >>> 1) / r4) << 1;
        long r83 = r8 - (r2 * r4);
        if (r83 < r4) goto L9;
        r83 = r83 - r4;
        r2 = r2 + 1;
    L9:
        StringBuilder r02 = new StringBuilder();
        String r22 = Long.toString(r2, AbstractC11848a.a(r10));
        kotlin.jvm.internal.p.k(r22, "toString(...)");
        r02.append(r22);
        String r84 = Long.toString(r83, AbstractC11848a.a(r10));
        kotlin.jvm.internal.p.k(r84, "toString(...)");
        r02.append(r84);
        return r02.toString();
    }
}
