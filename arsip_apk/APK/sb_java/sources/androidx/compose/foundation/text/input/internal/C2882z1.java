package androidx.compose.foundation.text.input.internal;

/* renamed from: androidx.compose.foundation.text.input.internal.z1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2882z1 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f10549a;

    /* renamed from: b, reason: collision with root package name */
    public int f10550b;

    static {
    }

    public C2882z1() {
        this.f10549a = A1.a(10);
    }

    public final long a(int r13, boolean r14) {
        int[] r02 = this.f10549a;
        int r1 = this.f10550b;
        if (r1 < 0) goto L13;
        if (r14 == true) goto L10;
        int r12 = r1 - 1;
        int r3 = r13;
    L7:
        if ((-1) >= r12) goto L9;
        int r2 = r12 * 3;
        int r4 = r02[r2];
        int r5 = r02[r2 + 1];
        int r6 = r02[r2 + 2];
        boolean r7 = r14;
        long r10 = d(r3, r4, r5, r6, r7);
        long r132 = d(r13, r4, r5, r6, r7);
        r3 = Math.min(androidx.compose.ui.text.E1.n(r10), androidx.compose.ui.text.E1.n(r132));
        r13 = Math.max(androidx.compose.ui.text.E1.i(r10), androidx.compose.ui.text.E1.i(r132));
        r12 = r12 - 1;
        r14 = r7;
    L9:
        int r52 = r13;
        r13 = r3;
    L15:
        return androidx.compose.ui.text.F1.b(r13, r52);
    L10:
        int r142 = 0;
        r3 = r13;
    L11:
        if (r142 >= r1) goto L9;
        int r22 = r142 * 3;
        int r42 = r02[r22];
        int r53 = r02[r22 + 1];
        int r62 = r02[r22 + 2];
        long r8 = d(r3, r42, r53, r62, r14);
        long r32 = d(r13, r42, r53, r62, r14);
        int r133 = Math.min(androidx.compose.ui.text.E1.n(r8), androidx.compose.ui.text.E1.n(r32));
        int r23 = Math.max(androidx.compose.ui.text.E1.i(r8), androidx.compose.ui.text.E1.i(r32));
        r142 = r142 + 1;
        r3 = r133;
        r13 = r23;
        goto L11
    L13:
        r52 = r13;
        goto L15
    }

    public final long b(int r3) {
        return a(r3, false);
    }

    public final long c(int r3) {
        return a(r3, true);
    }

    public final long d(int r2, int r3, int r4, int r5, boolean r6) {
        if (r6 == false) goto L4;
        int r02 = r4;
    L5:
        if (r6 == false) goto L7;
        r4 = r5;
    L7:
        if (r2 < r3) goto L9;
        if (r2 != r3) goto L17;
        if (r02 != 0) goto L15;
        return androidx.compose.ui.text.F1.b(r3, r4 + r3);
    L15:
        return androidx.compose.ui.text.F1.a(r3);
    L17:
        if (r2 >= (r3 + r02)) goto L24;
        if (r4 != 0) goto L22;
        return androidx.compose.ui.text.F1.a(r3);
    L22:
        return androidx.compose.ui.text.F1.b(r3, r4 + r3);
    L24:
        return androidx.compose.ui.text.F1.a((r2 - r02) + r4);
    L9:
        return androidx.compose.ui.text.F1.a(r2);
    L4:
        r02 = r5;
        goto L5
    }

    public final void e(int r5, int r6, int r7) {
        if (r7 < 0) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == true) goto L8;
        androidx.compose.foundation.internal.e.a("Expected newLen to be ≥ 0, was " + r7);
    L8:
        int r52 = Math.min(r5, r6);
        int r62 = Math.max(r52, r6) - r52;
        if (r62 >= 2) goto L12;
        if (r62 != r7) goto L12;
        return;
    L12:
        int r2 = this.f10550b + 1;
        if (r2 <= A1.d(this.f10549a)) goto L15;
        this.f10549a = A1.c(this.f10549a, Math.max(r2 * 2, A1.d(this.f10549a) * 2));
    L15:
        A1.e(this.f10549a, this.f10550b, r52, r62, r7);
        this.f10550b = r2;
        return;
    L5:
        r1 = false;
        goto L6
    }
}
