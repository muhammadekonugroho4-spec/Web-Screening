package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public abstract class J1 {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f15931a = null;

    static {
        f15931a = new long[0];
    }

    public static final void A(int[] r2, int r3, int r4) {
        if (r4 >= 0) goto L4;
    L4:
        int r32 = (r3 * 5) + 1;
        r2[r32] = r4 | (r2[r32] & (-67108864));
    }

    public static final /* synthetic */ int a(int[] r02, int r1) {
        return n(r02, r1);
    }

    public static final /* synthetic */ C3372b b(ArrayList r02, int r1, int r2) {
        return p(r02, r1, r2);
    }

    public static final /* synthetic */ long[] c() {
        return f15931a;
    }

    public static final /* synthetic */ int d(int[] r02, int r1) {
        return q(r02, r1);
    }

    public static final /* synthetic */ void e(int[] r02, int r1, int r2, boolean r3, boolean r4, boolean r5, int r6, int r7) {
        r(r02, r1, r2, r3, r4, r5, r6, r7);
    }

    public static final /* synthetic */ int f(ArrayList r02, int r1, int r2) {
        return s(r02, r1, r2);
    }

    public static final /* synthetic */ int g(int[] r02, int r1) {
        return t(r02, r1);
    }

    public static final /* synthetic */ int h(ArrayList r02, int r1, int r2) {
        return u(r02, r1, r2);
    }

    public static final /* synthetic */ int i(int[] r02, int r1) {
        return v(r02, r1);
    }

    public static final /* synthetic */ void j(int[] r02, int r1, boolean r2) {
        x(r02, r1, r2);
    }

    public static final /* synthetic */ void k(int[] r02, int r1, int r2) {
        y(r02, r1, r2);
    }

    public static final /* synthetic */ void l(int[] r02, int r1, boolean r2) {
        z(r02, r1, r2);
    }

    public static final /* synthetic */ void m(int[] r02, int r1, int r2) {
        A(r02, r1, r2);
    }

    public static final int n(int[] r1, int r2) {
        int r22 = r2 * 5;
        if (r22 < r1.length) goto L7;
        return r1.length;
    L7:
        return r1[r22 + 4] + Integer.bitCount(r1[r22 + 1] >> 29);
    }

    public static final androidx.compose.runtime.tooling.n o(H1 r2, int r3) {
        return new I1(r2, r3, r2.w());
    }

    public static final C3372b p(ArrayList r02, int r1, int r2) {
        int r12 = u(r02, r1, r2);
        if (r12 >= 0) goto L5;
        return null;
    L5:
        return (C3372b) r02.get(r12);
    }

    public static final int q(int[] r02, int r1) {
        return r02[(r1 * 5) + 3];
    }

    public static final void r(int[] r02, int r1, int r2, boolean r3, boolean r4, boolean r5, int r6, int r7) {
        int r12 = r1 * 5;
        r02[r12] = r2;
        r02[r12 + 1] = (((r3 ? 1 : 0) << 30) | ((r4 ? 1 : 0) << 29)) | ((r5 ? 1 : 0) << 28);
        r02[r12 + 2] = r6;
        r02[r12 + 3] = 0;
        r02[r12 + 4] = r7;
    }

    public static final int s(ArrayList r02, int r1, int r2) {
        int r03 = u(r02, r1, r2);
        if (r03 < 0) goto L6;
        return r03;
    L6:
        return -(r03 + 1);
    }

    public static final int t(int[] r1, int r2) {
        int r22 = r2 * 5;
        return r1[r22 + 4] + Integer.bitCount(r1[r22 + 1] >> 30);
    }

    public static final int u(ArrayList r4, int r5, int r6) {
        int r02 = r4.size() - 1;
        int r1 = 0;
    L3:
        if (r1 > r02) goto L14;
        int r2 = (r1 + r02) >>> 1;
        int r3 = ((C3372b) r4.get(r2)).a();
        if (r3 >= 0) goto L7;
        r3 = r3 + r6;
    L7:
        int r32 = kotlin.jvm.internal.p.n(r3, r5);
        if (r32 < 0) goto L9;
        if (r32 <= 0) goto L12;
        r02 = r2 - 1;
        goto L3
    L12:
        return r2;
    L9:
        r1 = r2 + 1;
        goto L3
    L14:
        return -(r1 + 1);
    }

    public static final int v(int[] r1, int r2) {
        int r22 = r2 * 5;
        return r1[r22 + 4] + Integer.bitCount(r1[r22 + 1] >> 28);
    }

    public static final void w() {
        throw new ConcurrentModificationException();
    }

    public static final void x(int[] r2, int r3, boolean r4) {
        int r32 = (r3 * 5) + 1;
        int r02 = r2[r32] & (-67108865);
        r2[r32] = ((r4 ? 1 : 0) << 26) | r02;
    }

    public static final void y(int[] r02, int r1, int r2) {
        r02[(r1 * 5) + 3] = r2;
    }

    public static final void z(int[] r2, int r3, boolean r4) {
        int r32 = (r3 * 5) + 1;
        int r02 = r2[r32] & (-134217729);
        r2[r32] = ((r4 ? 1 : 0) << 27) | r02;
    }
}
