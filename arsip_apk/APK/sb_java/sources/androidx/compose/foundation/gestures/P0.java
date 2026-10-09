package androidx.compose.foundation.gestures;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    public Orientation f7590a;

    /* renamed from: b, reason: collision with root package name */
    public long f7591b;

    static {
    }

    public /* synthetic */ P0(Orientation r1, long r2, kotlin.jvm.internal.i r4) {
        this(r1, r2);
    }

    public static /* synthetic */ void f(P0 r02, long r1, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = androidx.compose.ui.geometry.e.f17050b.c();
    L5:
        r02.e(r1);
    }

    public final long a(long r1, long r3, float r5) {
        long r12 = androidx.compose.ui.geometry.e.p(r1, r3);
        long r13 = androidx.compose.ui.geometry.e.q(this.f7591b, r12);
        this.f7591b = r13;
        if (this.f7590a != null) goto L5;
        float r14 = androidx.compose.ui.geometry.e.k(r13);
    L7:
        if (r14 < r5) goto L11;
        return b(r5);
    L11:
        return androidx.compose.ui.geometry.e.f17050b.b();
    L5:
        r14 = Math.abs(d(r13));
        goto L7
    }

    public final long b(float r9) {
        if (this.f7590a != null) goto L6;
        long r02 = this.f7591b;
        return androidx.compose.ui.geometry.e.p(this.f7591b, androidx.compose.ui.geometry.e.r(androidx.compose.ui.geometry.e.h(r02, androidx.compose.ui.geometry.e.k(r02)), r9));
    L6:
        float r03 = d(this.f7591b) - (Math.signum(d(this.f7591b)) * r9);
        float r92 = c(this.f7591b);
        if (this.f7590a != Orientation.Horizontal) goto L11;
        return androidx.compose.ui.geometry.e.e((Float.floatToRawIntBits(r03) << 32) | (Float.floatToRawIntBits(r92) & 4294967295L));
    L11:
        return androidx.compose.ui.geometry.e.e((Float.floatToRawIntBits(r92) << 32) | (Float.floatToRawIntBits(r03) & 4294967295L));
    }

    public final float c(long r3) {
        if (this.f7590a != Orientation.Horizontal) goto L7;
        long r32 = r3 & 4294967295L;
    L6:
        return Float.intBitsToFloat((int) r32);
    L7:
        r32 = r3 >> 32;
        goto L6
    }

    public final float d(long r3) {
        if (this.f7590a != Orientation.Horizontal) goto L7;
        long r32 = r3 >> 32;
    L6:
        return Float.intBitsToFloat((int) r32);
    L7:
        r32 = r3 & 4294967295L;
        goto L6
    }

    public final void e(long r1) {
        this.f7591b = r1;
    }

    public final void g(Orientation r1) {
        this.f7590a = r1;
    }

    public P0(Orientation r1, long r2) {
        this.f7590a = r1;
        this.f7591b = r2;
    }

    public /* synthetic */ P0(Orientation r2, long r3, int r5, kotlin.jvm.internal.i r6) {
        kotlin.jvm.internal.i r02 = null;
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L8;
        r3 = androidx.compose.ui.geometry.e.f17050b.c();
    L8:
        this(r2, r3, r02);
    }
}
