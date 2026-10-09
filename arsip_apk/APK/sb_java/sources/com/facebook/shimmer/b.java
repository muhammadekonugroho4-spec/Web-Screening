package com.facebook.shimmer;

import android.content.res.TypedArray;
import android.graphics.RectF;
import com.google.android.flexbox.FlexItem;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f36981a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f36982b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f36983c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f36984e;

    /* renamed from: f, reason: collision with root package name */
    public int f36985f;

    /* renamed from: g, reason: collision with root package name */
    public int f36986g;

    /* renamed from: h, reason: collision with root package name */
    public int f36987h;

    /* renamed from: i, reason: collision with root package name */
    public int f36988i;

    /* renamed from: j, reason: collision with root package name */
    public float f36989j;

    /* renamed from: k, reason: collision with root package name */
    public float f36990k;

    /* renamed from: l, reason: collision with root package name */
    public float f36991l;

    /* renamed from: m, reason: collision with root package name */
    public float f36992m;

    /* renamed from: n, reason: collision with root package name */
    public float f36993n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f36994o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f36995p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f36996q;

    /* renamed from: r, reason: collision with root package name */
    public int f36997r;

    /* renamed from: s, reason: collision with root package name */
    public int f36998s;

    /* renamed from: t, reason: collision with root package name */
    public long f36999t;

    /* renamed from: u, reason: collision with root package name */
    public long f37000u;

    public static class a extends AbstractC0386b {
        public a() {
            this.f37001a.f36996q = true;
        }

        @Override // com.facebook.shimmer.b.AbstractC0386b
        public /* bridge */ /* synthetic */ AbstractC0386b d() {
            return v();
        }

        public a v() {
            return this;
        }
    }

    /* renamed from: com.facebook.shimmer.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0386b {

        /* renamed from: a, reason: collision with root package name */
        public final b f37001a;

        public AbstractC0386b() {
            this.f37001a = new b();
        }

        public static float b(float r02, float r1, float r2) {
            return Math.min(r1, Math.max(r02, r2));
        }

        public b a() {
            this.f37001a.b();
            this.f37001a.c();
            return this.f37001a;
        }

        public AbstractC0386b c(TypedArray r5) {
            if (r5.hasValue(com.facebook.shimmer.a.f36964e) == false) goto L6;
            g(r5.getBoolean(com.facebook.shimmer.a.f36964e, this.f37001a.f36994o));
        L6:
            if (r5.hasValue(com.facebook.shimmer.a.f36962b) == false) goto L9;
            e(r5.getBoolean(com.facebook.shimmer.a.f36962b, this.f37001a.f36995p));
        L9:
            if (r5.hasValue(com.facebook.shimmer.a.f36963c) == false) goto L12;
            f(r5.getFloat(com.facebook.shimmer.a.f36963c, 0.3f));
        L12:
            if (r5.hasValue(com.facebook.shimmer.a.f36972m) == false) goto L15;
            n(r5.getFloat(com.facebook.shimmer.a.f36972m, 1.0f));
        L15:
            if (r5.hasValue(com.facebook.shimmer.a.f36968i) == false) goto L18;
            j(r5.getInt(com.facebook.shimmer.a.f36968i, (int) this.f37001a.f36999t));
        L18:
            if (r5.hasValue(com.facebook.shimmer.a.f36975p) == false) goto L21;
            p(r5.getInt(com.facebook.shimmer.a.f36975p, this.f37001a.f36997r));
        L21:
            if (r5.hasValue(com.facebook.shimmer.a.f36976q) == false) goto L24;
            q(r5.getInt(com.facebook.shimmer.a.f36976q, (int) this.f37001a.f37000u));
        L24:
            if (r5.hasValue(com.facebook.shimmer.a.f36977r) == false) goto L27;
            r(r5.getInt(com.facebook.shimmer.a.f36977r, this.f37001a.f36998s));
        L27:
            if (r5.hasValue(com.facebook.shimmer.a.f36966g) == false) goto L39;
            int r02 = r5.getInt(com.facebook.shimmer.a.f36966g, this.f37001a.d);
            if (r02 != 1) goto L31;
            h(1);
            goto L39
        L31:
            if (r02 != 2) goto L33;
            h(2);
            goto L39
        L33:
            if (r02 == 3) goto L35;
            h(0);
            goto L39
        L35:
            h(3);
        L39:
            if (r5.hasValue(com.facebook.shimmer.a.f36978s) == false) goto L45;
            if (r5.getInt(com.facebook.shimmer.a.f36978s, this.f37001a.f36986g) == 1) goto L43;
            s(0);
            goto L45
        L43:
            s(1);
        L45:
            if (r5.hasValue(com.facebook.shimmer.a.f36967h) == false) goto L48;
            i(r5.getFloat(com.facebook.shimmer.a.f36967h, this.f37001a.f36992m));
        L48:
            if (r5.hasValue(com.facebook.shimmer.a.f36970k) == false) goto L51;
            l(r5.getDimensionPixelSize(com.facebook.shimmer.a.f36970k, this.f37001a.f36987h));
        L51:
            if (r5.hasValue(com.facebook.shimmer.a.f36969j) == false) goto L54;
            k(r5.getDimensionPixelSize(com.facebook.shimmer.a.f36969j, this.f37001a.f36988i));
        L54:
            if (r5.hasValue(com.facebook.shimmer.a.f36974o) == false) goto L57;
            o(r5.getFloat(com.facebook.shimmer.a.f36974o, this.f37001a.f36991l));
        L57:
            if (r5.hasValue(com.facebook.shimmer.a.f36980u) == false) goto L60;
            u(r5.getFloat(com.facebook.shimmer.a.f36980u, this.f37001a.f36989j));
        L60:
            if (r5.hasValue(com.facebook.shimmer.a.f36971l) == false) goto L63;
            m(r5.getFloat(com.facebook.shimmer.a.f36971l, this.f37001a.f36990k));
        L63:
            if (r5.hasValue(com.facebook.shimmer.a.f36979t) == false) goto L66;
            t(r5.getFloat(com.facebook.shimmer.a.f36979t, this.f37001a.f36993n));
        L66:
            return d();
        }

        public abstract AbstractC0386b d();

        public AbstractC0386b e(boolean r2) {
            this.f37001a.f36995p = r2;
            return d();
        }

        public AbstractC0386b f(float r4) {
            int r42 = (int) (b(0.0f, 1.0f, r4) * 255.0f);
            b r02 = this.f37001a;
            r02.f36985f = (r42 << 24) | (r02.f36985f & FlexItem.MAX_SIZE);
            return d();
        }

        public AbstractC0386b g(boolean r2) {
            this.f37001a.f36994o = r2;
            return d();
        }

        public AbstractC0386b h(int r2) {
            this.f37001a.d = r2;
            return d();
        }

        public AbstractC0386b i(float r4) {
            if (r4 < 0.0f) goto L7;
            this.f37001a.f36992m = r4;
            return d();
        L7:
            throw new IllegalArgumentException("Given invalid dropoff value: " + r4);
        }

        public AbstractC0386b j(long r4) {
            if (r4 < 0) goto L7;
            this.f37001a.f36999t = r4;
            return d();
        L7:
            throw new IllegalArgumentException("Given a negative duration: " + r4);
        }

        public AbstractC0386b k(int r4) {
            if (r4 < 0) goto L6;
            this.f37001a.f36988i = r4;
            return d();
        L6:
            throw new IllegalArgumentException("Given invalid height: " + r4);
        }

        public AbstractC0386b l(int r4) {
            if (r4 < 0) goto L6;
            this.f37001a.f36987h = r4;
            return d();
        L6:
            throw new IllegalArgumentException("Given invalid width: " + r4);
        }

        public AbstractC0386b m(float r4) {
            if (r4 < 0.0f) goto L7;
            this.f37001a.f36990k = r4;
            return d();
        L7:
            throw new IllegalArgumentException("Given invalid height ratio: " + r4);
        }

        public AbstractC0386b n(float r4) {
            int r42 = (int) (b(0.0f, 1.0f, r4) * 255.0f);
            b r02 = this.f37001a;
            r02.f36984e = (r42 << 24) | (r02.f36984e & FlexItem.MAX_SIZE);
            return d();
        }

        public AbstractC0386b o(float r4) {
            if (r4 < 0.0f) goto L7;
            this.f37001a.f36991l = r4;
            return d();
        L7:
            throw new IllegalArgumentException("Given invalid intensity value: " + r4);
        }

        public AbstractC0386b p(int r2) {
            this.f37001a.f36997r = r2;
            return d();
        }

        public AbstractC0386b q(long r4) {
            if (r4 < 0) goto L7;
            this.f37001a.f37000u = r4;
            return d();
        L7:
            throw new IllegalArgumentException("Given a negative repeat delay: " + r4);
        }

        public AbstractC0386b r(int r2) {
            this.f37001a.f36998s = r2;
            return d();
        }

        public AbstractC0386b s(int r2) {
            this.f37001a.f36986g = r2;
            return d();
        }

        public AbstractC0386b t(float r2) {
            this.f37001a.f36993n = r2;
            return d();
        }

        public AbstractC0386b u(float r4) {
            if (r4 < 0.0f) goto L7;
            this.f37001a.f36989j = r4;
            return d();
        L7:
            throw new IllegalArgumentException("Given invalid width ratio: " + r4);
        }
    }

    public static class c extends AbstractC0386b {
        public c() {
            this.f37001a.f36996q = false;
        }

        @Override // com.facebook.shimmer.b.AbstractC0386b
        public /* bridge */ /* synthetic */ AbstractC0386b c(TypedArray r1) {
            return v(r1);
        }

        @Override // com.facebook.shimmer.b.AbstractC0386b
        public /* bridge */ /* synthetic */ AbstractC0386b d() {
            return w();
        }

        public c v(TypedArray r3) {
            super.c(r3);
            if (r3.hasValue(com.facebook.shimmer.a.d) == false) goto L6;
            x(r3.getColor(com.facebook.shimmer.a.d, this.f37001a.f36985f));
        L6:
            if (r3.hasValue(com.facebook.shimmer.a.f36973n) == false) goto L9;
            y(r3.getColor(com.facebook.shimmer.a.f36973n, this.f37001a.f36984e));
        L9:
            return w();
        }

        public c w() {
            return this;
        }

        public c x(int r4) {
            b r02 = this.f37001a;
            int r1 = r02.f36985f & (-16777216);
            r02.f36985f = (r4 & FlexItem.MAX_SIZE) | r1;
            return w();
        }

        public c y(int r2) {
            this.f37001a.f36984e = r2;
            return w();
        }
    }

    public b() {
        this.f36981a = new float[4];
        this.f36982b = new int[4];
        this.f36983c = new RectF();
        this.d = 0;
        this.f36984e = -1;
        this.f36985f = 1291845631;
        this.f36986g = 0;
        this.f36987h = 0;
        this.f36988i = 0;
        this.f36989j = 1.0f;
        this.f36990k = 1.0f;
        this.f36991l = 0.0f;
        this.f36992m = 0.5f;
        this.f36993n = 20.0f;
        this.f36994o = true;
        this.f36995p = true;
        this.f36996q = true;
        this.f36997r = -1;
        this.f36998s = 1;
        this.f36999t = 1000;
    }

    public int a(int r2) {
        int r02 = this.f36988i;
        if (r02 <= 0) goto L6;
        return r02;
    L6:
        return Math.round(this.f36990k * r2);
    }

    public void b() {
        if (this.f36986g == 1) goto L6;
        int[] r02 = this.f36982b;
        int r5 = this.f36985f;
        r02[0] = r5;
        int r3 = this.f36984e;
        r02[1] = r3;
        r02[2] = r3;
        r02[3] = r5;
        return;
    L6:
        int[] r03 = this.f36982b;
        int r52 = this.f36984e;
        r03[0] = r52;
        r03[1] = r52;
        int r32 = this.f36985f;
        r03[2] = r32;
        r03[3] = r32;
    }

    public void c() {
        if (this.f36986g == 1) goto L6;
        this.f36981a[0] = Math.max(((1.0f - this.f36991l) - this.f36992m) / 2.0f, 0.0f);
        this.f36981a[1] = Math.max(((1.0f - this.f36991l) - 0.001f) / 2.0f, 0.0f);
        this.f36981a[2] = Math.min(((this.f36991l + 1.0f) + 0.001f) / 2.0f, 1.0f);
        this.f36981a[3] = Math.min(((this.f36991l + 1.0f) + this.f36992m) / 2.0f, 1.0f);
        return;
    L6:
        float[] r02 = this.f36981a;
        r02[0] = 0.0f;
        r02[1] = Math.min(this.f36991l, 1.0f);
        this.f36981a[2] = Math.min(this.f36991l + this.f36992m, 1.0f);
        this.f36981a[3] = 1.0f;
    }

    public int d(int r2) {
        int r02 = this.f36987h;
        if (r02 <= 0) goto L6;
        return r02;
    L6:
        return Math.round(this.f36989j * r2);
    }
}
