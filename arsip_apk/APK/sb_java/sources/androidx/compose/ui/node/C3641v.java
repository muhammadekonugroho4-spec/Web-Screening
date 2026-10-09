package androidx.compose.ui.node;

import java.util.Arrays;

/* renamed from: androidx.compose.ui.node.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3641v {

    /* renamed from: a, reason: collision with root package name */
    public int[] f18827a;

    /* renamed from: b, reason: collision with root package name */
    public int f18828b;

    public C3641v(int r1) {
        this.f18827a = new int[r1];
    }

    public final boolean a(int r5, int r6) {
        int[] r02 = this.f18827a;
        int r1 = r02[r5];
        int r2 = r02[r6];
        if (r1 < r2) goto L10;
        if (r1 == r2) goto L6;
        return false;
    L6:
        if (r02[r5 + 1] <= r02[r6 + 1]) goto L10;
        return false;
    L10:
        return true;
    }

    public final int b(int r2) {
        return this.f18827a[r2];
    }

    public final int c() {
        return this.f18828b;
    }

    public final boolean d() {
        if (this.f18828b == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final int e(int r3, int r4, int r5) {
        int r02 = r3 - r5;
    L3:
        if (r3 >= r4) goto L8;
        if (a(r3, r4) == false) goto L7;
        r02 = r02 + r5;
        l(r02, r3);
    L7:
        r3 = r3 + r5;
        goto L3
    L8:
        int r03 = r02 + r5;
        l(r03, r4);
        return r03;
    }

    public final int f() {
        int[] r02 = this.f18827a;
        int r1 = this.f18828b - 1;
        this.f18828b = r1;
        return r02[r1];
    }

    public final void g(int r5, int r6, int r7) {
        int r02 = this.f18828b;
        int[] r1 = this.f18827a;
        int r2 = r02 + 3;
        if (r2 < r1.length) goto L5;
        r1 = j(r1);
    L5:
        r1[r02] = r5 + r7;
        r1[r02 + 1] = r6 + r7;
        r1[r02 + 2] = r7;
        this.f18828b = r2;
    }

    public final void h(int r5, int r6, int r7, int r8) {
        int r02 = this.f18828b;
        int[] r1 = this.f18827a;
        int r2 = r02 + 4;
        if (r2 < r1.length) goto L5;
        r1 = j(r1);
    L5:
        r1[r02] = r5;
        r1[r02 + 1] = r6;
        r1[r02 + 2] = r7;
        r1[r02 + 3] = r8;
        this.f18828b = r2;
    }

    public final void i(int r3, int r4, int r5) {
        if (r3 >= r4) goto L5;
        int r02 = e(r3, r4, r5);
        i(r3, r02 - r5, r5);
        i(r02 + r5, r4, r5);
        return;
    }

    public final int[] j(int[] r2) {
        int[] r22 = Arrays.copyOf(r2, r2.length * 2);
        kotlin.jvm.internal.p.k(r22, "copyOf(...)");
        this.f18827a = r22;
        return r22;
    }

    public final void k() {
        int r02 = this.f18828b;
        if ((r02 % 3) != 0) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == true) goto L9;
        androidx.compose.ui.internal.a.b("Array size not a multiple of 3");
    L9:
        if (r02 <= 3) goto L12;
        i(0, r02 - 3, 3);
        return;
    L12:
        return;
    L5:
        r1 = false;
        goto L6
    }

    public final void l(int r4, int r5) {
        int[] r02 = this.f18827a;
        U.a(r02, r4, r5);
        U.a(r02, r4 + 1, r5 + 1);
        U.a(r02, r4 + 2, r5 + 2);
    }
}
