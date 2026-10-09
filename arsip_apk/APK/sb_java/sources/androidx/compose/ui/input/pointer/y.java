package androidx.compose.ui.input.pointer;

import java.util.List;
import kotlin.collections.AbstractC11777v;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final long f18187a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18188b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18189c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final float f18190e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18191f;

    /* renamed from: g, reason: collision with root package name */
    public final long f18192g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f18193h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18194i;

    /* renamed from: j, reason: collision with root package name */
    public final long f18195j;

    /* renamed from: k, reason: collision with root package name */
    public List f18196k;

    /* renamed from: l, reason: collision with root package name */
    public long f18197l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18198m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18199n;

    /* renamed from: o, reason: collision with root package name */
    public y f18200o;

    static {
    }

    public /* synthetic */ y(long r1, long r3, long r5, boolean r7, float r8, long r9, long r11, boolean r13, boolean r14, int r15, long r16, kotlin.jvm.internal.i r18) {
        this(r1, r3, r5, r7, r8, r9, r11, r13, r14, r15, r16);
    }

    public static /* synthetic */ y c(y r18, long r19, long r21, long r23, boolean r25, long r26, long r28, boolean r30, int r31, List r32, long r33, int r35, Object r36) {
        if ((r35 & 1) == 0) goto L5;
        long r2 = r18.f18187a;
    L7:
        if ((r35 & 2) == 0) goto L9;
        long r4 = r18.f18188b;
    L11:
        if ((r35 & 4) == 0) goto L13;
        long r6 = r18.f18189c;
    L15:
        if ((r35 & 8) == 0) goto L17;
        boolean r8 = r18.d;
    L19:
        if ((r35 & 16) == 0) goto L21;
        long r9 = r18.f18191f;
    L23:
        if ((r35 & 32) == 0) goto L25;
        long r11 = r18.f18192g;
    L27:
        if ((r35 & 64) == 0) goto L29;
        boolean r13 = r18.f18193h;
    L31:
        if ((r35 & 128) == 0) goto L33;
        int r14 = r18.f18194i;
    L35:
        if ((r35 & 512) == 0) goto L38;
        long r192 = r2;
        long r16 = r18.f18195j;
        r2 = r192;
    L40:
        return r18.b(r2, r4, r6, r8, r9, r11, r13, r14, r32, r16);
    L38:
        r16 = r33;
        goto L40
    L33:
        r14 = r31;
        goto L35
    L29:
        r13 = r30;
        goto L31
    L25:
        r11 = r28;
        goto L27
    L21:
        r9 = r26;
        goto L23
    L17:
        r8 = r25;
        goto L19
    L13:
        r6 = r23;
        goto L15
    L9:
        r4 = r21;
        goto L11
    L5:
        r2 = r19;
        goto L7
    }

    public final void a() {
        y r02 = this.f18200o;
        if (r02 != null) goto L6;
        this.f18198m = true;
        this.f18199n = true;
        return;
    L6:
        if (r02 == null) goto L9;
        r02.a();
        return;
    }

    public final y b(long r20, long r22, long r24, boolean r26, long r27, long r29, boolean r31, int r32, List r33, long r34) {
        y r02 = d(r20, r22, r24, r26, this.f18190e, r27, r29, r31, r32, r33, r34);
        y r2 = this.f18200o;
        if (r2 != null) goto L5;
        r2 = this;
    L5:
        r02.f18200o = r2;
        return r02;
    }

    public final y d(long r24, long r26, long r28, boolean r30, float r31, long r32, long r34, boolean r36, int r37, List r38, long r39) {
        boolean r15 = false;
        y r1 = new y(r24, r26, r28, r30, r31, r32, r34, r36, r15, r37, r38, r39, this.f18197l, null);
        y r2 = this.f18200o;
        if (r2 != null) goto L5;
        r2 = this;
    L5:
        r1.f18200o = r2;
        return r1;
    }

    public final List e() {
        List r02 = this.f18196k;
        if (r02 == null) goto L5;
        return r02;
    L5:
        return AbstractC11777v.o();
    }

    public final long f() {
        return this.f18187a;
    }

    public final long g() {
        return this.f18197l;
    }

    public final long h() {
        return this.f18189c;
    }

    public final boolean i() {
        return this.d;
    }

    public final float j() {
        return this.f18190e;
    }

    public final long k() {
        return this.f18192g;
    }

    public final boolean l() {
        return this.f18193h;
    }

    public final long m() {
        return this.f18195j;
    }

    public final int n() {
        return this.f18194i;
    }

    public final long o() {
        return this.f18188b;
    }

    public final boolean p() {
        y r02 = this.f18200o;
        if (r02 == null) goto L7;
        return r02.p();
    L7:
        if (this.f18198m == false) goto L9;
        return true;
    L9:
        if (this.f18199n == true) goto L15;
        return false;
    L15:
        return true;
    }

    public String toString() {
        return "PointerInputChange(id=" + x.d(this.f18187a) + ", uptimeMillis=" + this.f18188b + ", position=" + androidx.compose.ui.geometry.e.s(this.f18189c) + ", pressed=" + this.d + ", pressure=" + this.f18190e + ", previousUptimeMillis=" + this.f18191f + ", previousPosition=" + androidx.compose.ui.geometry.e.s(this.f18192g) + ", previousPressed=" + this.f18193h + ", isConsumed=" + p() + ", type=" + J.k(this.f18194i) + ", historical=" + e() + ",scrollDelta=" + androidx.compose.ui.geometry.e.s(this.f18195j) + ')';
    }

    public /* synthetic */ y(long r1, long r3, long r5, boolean r7, float r8, long r9, long r11, boolean r13, boolean r14, int r15, List r16, long r17, long r19, kotlin.jvm.internal.i r21) {
        this(r1, r3, r5, r7, r8, r9, r11, r13, r14, r15, r16, r17, r19);
    }

    public y(long r1, long r3, long r5, boolean r7, float r8, long r9, long r11, boolean r13, boolean r14, int r15, long r16) {
        this.f18187a = r1;
        this.f18188b = r3;
        this.f18189c = r5;
        this.d = r7;
        this.f18190e = r8;
        this.f18191f = r9;
        this.f18192g = r11;
        this.f18193h = r13;
        this.f18194i = r15;
        this.f18195j = r16;
        this.f18197l = androidx.compose.ui.geometry.e.f17050b.c();
        this.f18198m = r14;
        this.f18199n = r14;
    }

    public /* synthetic */ y(long r22, long r24, long r26, boolean r28, float r29, long r30, long r32, boolean r34, boolean r35, int r36, long r37, int r39, kotlin.jvm.internal.i r40) {
        if ((r39 & 512) == 0) goto L5;
        int r17 = J.f18073b.d();
    L7:
        if ((r39 & 1024) == 0) goto L9;
        long r18 = androidx.compose.ui.geometry.e.f17050b.c();
    L10:
        this(r22, r24, r26, r28, r29, r30, r32, r34, r35, r17, r18, null);
        return;
    L9:
        r18 = r37;
        goto L10
    L5:
        r17 = r36;
        goto L7
    }

    public y(long r20, long r22, long r24, boolean r26, float r27, long r28, long r30, boolean r32, boolean r33, int r34, List r35, long r36, long r38) {
        this(r20, r22, r24, r26, r27, r28, r30, r32, r33, r34, r36, null);
        this.f18196k = r35;
        this.f18197l = r38;
    }
}
