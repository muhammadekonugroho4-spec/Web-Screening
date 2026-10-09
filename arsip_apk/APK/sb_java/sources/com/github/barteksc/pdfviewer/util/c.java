package com.github.barteksc.pdfviewer.util;

import com.shockwave.pdfium.util.Size;
import com.shockwave.pdfium.util.SizeF;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public FitPolicy f37542a;

    /* renamed from: b, reason: collision with root package name */
    public final Size f37543b;

    /* renamed from: c, reason: collision with root package name */
    public final Size f37544c;
    public final Size d;

    /* renamed from: e, reason: collision with root package name */
    public SizeF f37545e;

    /* renamed from: f, reason: collision with root package name */
    public SizeF f37546f;

    /* renamed from: g, reason: collision with root package name */
    public float f37547g;

    /* renamed from: h, reason: collision with root package name */
    public float f37548h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f37549i;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37550a = null;

        static {
            int[] r02 = new int[FitPolicy.values().length];
            f37550a = r02;
            r02[FitPolicy.HEIGHT.ordinal()] = 1;     // Catch: NoSuchFieldError -> L6
        L8:
            f37550a[FitPolicy.BOTH.ordinal()] = 2;     // Catch: NoSuchFieldError -> L7
            return;
        }
    }

    public c(FitPolicy r1, Size r2, Size r3, Size r4, boolean r5) {
        this.f37542a = r1;
        this.f37543b = r2;
        this.f37544c = r3;
        this.d = r4;
        this.f37549i = r5;
        b();
    }

    public SizeF a(Size r5) {
        if (r5.b() <= 0) goto L26;
        if (r5.a() <= 0) goto L26;
        if (this.f37549i == false) goto L10;
        float r02 = this.d.b();
    L12:
        if (this.f37549i == false) goto L14;
        float r1 = this.d.a();
    L15:
        int r2 = a.f37550a[this.f37542a.ordinal()];
        if (r2 == 1) goto L24;
        if (r2 == 2) goto L22;
        return e(r5, r02);
    L22:
        return c(r5, r02, r1);
    L24:
        return d(r5, r1);
    L14:
        r1 = r5.a() * this.f37548h;
        goto L15
    L10:
        r02 = r5.b() * this.f37547g;
    L26:
        return new SizeF(0.0f, 0.0f);
    }

    public final void b() {
        int r02 = a.f37550a[this.f37542a.ordinal()];
        if (r02 != 1) goto L5;
        SizeF r03 = d(this.f37544c, this.d.a());
        this.f37546f = r03;
        this.f37548h = r03.a() / this.f37544c.a();
        this.f37545e = d(this.f37543b, r0.a() * this.f37548h);
        return;
    L5:
        if (r02 == 2) goto L8;
        SizeF r04 = e(this.f37543b, this.d.b());
        this.f37545e = r04;
        this.f37547g = r04.b() / this.f37543b.b();
        this.f37546f = e(this.f37544c, r0.b() * this.f37547g);
        return;
    L8:
        float r05 = c(this.f37543b, this.d.b(), this.d.a()).b() / this.f37543b.b();
        SizeF r06 = c(this.f37544c, r1.b() * r05, this.d.a());
        this.f37546f = r06;
        this.f37548h = r06.a() / this.f37544c.a();
        SizeF r07 = c(this.f37543b, this.d.b(), this.f37543b.a() * this.f37548h);
        this.f37545e = r07;
        this.f37547g = r07.b() / this.f37543b.b();
    }

    public final SizeF c(Size r4, float r5, float r6) {
        float r02 = r4.b() / r4.a();
        float r42 = (float) Math.floor(r5 / r02);
        if (r42 <= r6) goto L5;
        r5 = (float) Math.floor(r02 * r6);
    L7:
        return new SizeF(r5, r6);
    L5:
        r6 = r42;
        goto L7
    }

    public final SizeF d(Size r3, float r4) {
        float r02 = r3.b();
        return new SizeF((float) Math.floor(r4 / (r3.a() / r02)), r4);
    }

    public final SizeF e(Size r3, float r4) {
        return new SizeF(r4, (float) Math.floor(r4 / (r3.b() / r3.a())));
    }

    public SizeF f() {
        return this.f37546f;
    }

    public SizeF g() {
        return this.f37545e;
    }
}
