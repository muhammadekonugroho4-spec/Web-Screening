package androidx.compose.runtime;

import java.util.Arrays;

/* renamed from: androidx.compose.runtime.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3420n0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f16390a;

    /* renamed from: b, reason: collision with root package name */
    public int f16391b;

    static {
    }

    public C3420n0() {
        this.f16390a = new int[10];
    }

    public final void a() {
        this.f16391b = 0;
    }

    public final int b(int r5) {
        int[] r02 = this.f16390a;
        int r1 = Math.min(r02.length, this.f16391b);
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        if (r02[r2] == r5) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r2;
    L8:
        return -1;
    }

    public final int c() {
        return this.f16390a[this.f16391b - 1];
    }

    public final int d(int r2) {
        return this.f16390a[r2];
    }

    public final int e() {
        return this.f16390a[this.f16391b - 2];
    }

    public final int f(int r2) {
        int r02 = this.f16391b - 1;
        if (r02 >= 0) goto L5;
        return r2;
    L5:
        return this.f16390a[r02];
    }

    public final int g() {
        int[] r02 = this.f16390a;
        int r1 = this.f16391b - 1;
        this.f16391b = r1;
        return r02[r1];
    }

    public final void h(int r4) {
        int[] r02 = this.f16390a;
        if (this.f16391b < r02.length) goto L5;
        r02 = i();
    L5:
        int r1 = this.f16391b;
        this.f16391b = r1 + 1;
        r02[r1] = r4;
    }

    public final int[] i() {
        int[] r02 = this.f16390a;
        int[] r03 = Arrays.copyOf(r02, r02.length * 2);
        kotlin.jvm.internal.p.k(r03, "copyOf(...)");
        this.f16390a = r03;
        return r03;
    }
}
