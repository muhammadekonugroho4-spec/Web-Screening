package io.reactivex.internal.util;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f174629a;

    /* renamed from: b, reason: collision with root package name */
    public int f174630b;

    /* renamed from: c, reason: collision with root package name */
    public int f174631c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f174632e;

    public e() {
        this(16, 0.75f);
    }

    public static int c(int r1) {
        int r12 = r1 * (-1640531527);
        return r12 ^ (r12 >>> 16);
    }

    public boolean a(Object r7) {
        Object[] r02 = this.f174632e;
        int r1 = this.f174630b;
        int r2 = c(r7.hashCode()) & r1;
        Object r3 = r02[r2];
        if (r3 != null) goto L5;
    L13:
        r02[r2] = r7;
        int r72 = this.f174631c + 1;
        this.f174631c = r72;
        if (r72 < this.d) goto L16;
        d();
    L16:
        return true;
    L5:
        if (r3.equals(r7) == false) goto L7;
        return false;
    L7:
        r2 = (r2 + 1) & r1;
        Object r32 = r02[r2];
        if (r32 == null) goto L13;
        if (r32.equals(r7) == false) goto L7;
        return false;
    }

    public Object[] b() {
        return this.f174632e;
    }

    public void d() {
        Object[] r02 = this.f174632e;
        int r1 = r02.length;
        int r2 = r1 << 1;
        int r3 = r2 - 1;
        Object[] r4 = new Object[r2];
        int r5 = this.f174631c;
    L3:
        int r6 = r5 - 1;
        if (r5 == 0) goto L13;
    L5:
        r1 = r1 - 1;
        Object r52 = r02[r1];
        if (r52 == null) goto L5;
        int r53 = c(r52.hashCode()) & r3;
        if (r4[r53] == null) goto L12;
    L10:
        r53 = (r53 + 1) & r3;
        if (r4[r53] != null) goto L10;
    L12:
        r4[r53] = r02[r1];
        r5 = r6;
        goto L3
    L13:
        this.f174630b = r3;
        this.d = (int) (r2 * this.f174629a);
        this.f174632e = r4;
    }

    public boolean e(Object r6) {
        Object[] r02 = this.f174632e;
        int r1 = this.f174630b;
        int r2 = c(r6.hashCode()) & r1;
        Object r3 = r02[r2];
        if (r3 != null) goto L6;
        return false;
    L6:
        if (r3.equals(r6) == true) goto L8;
    L9:
        r2 = (r2 + 1) & r1;
        Object r32 = r02[r2];
        if (r32 == null) goto L11;
        if (r32.equals(r6) == false) goto L9;
        return f(r2, r02, r1);
    L11:
        return false;
    L8:
        return f(r2, r02, r1);
    }

    public boolean f(int r5, Object[] r6, int r7) {
        this.f174631c--;
    L3:
        int r02 = r5 + 1;
    L4:
        int r03 = r02 & r7;
        Object r2 = r6[r03];
        if (r2 == null) goto L6;
        int r3 = c(r2.hashCode()) & r7;
        if (r5 > r03) goto L13;
        if (r5 >= r3) goto L15;
        if (r3 > r03) goto L15;
    L16:
        r02 = r03 + 1;
    L15:
        r6[r5] = r2;
        r5 = r03;
        goto L3
    L13:
        if (r5 < r3) goto L16;
        if (r3 <= r03) goto L16;
    L6:
        r6[r5] = null;
        return true;
    }

    public e(int r2, float r3) {
        this.f174629a = r3;
        int r22 = f.a(r2);
        this.f174630b = r22 - 1;
        this.d = (int) (r3 * r22);
        this.f174632e = new Object[r22];
    }
}
