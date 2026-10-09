package com.skydoves.balloon;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.MovementMethod;

/* loaded from: classes6.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f43929a;

    /* renamed from: b, reason: collision with root package name */
    public final float f43930b;

    /* renamed from: c, reason: collision with root package name */
    public final int f43931c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final MovementMethod f43932e;

    /* renamed from: f, reason: collision with root package name */
    public final int f43933f;

    /* renamed from: g, reason: collision with root package name */
    public final Typeface f43934g;

    /* renamed from: h, reason: collision with root package name */
    public final Float f43935h;

    /* renamed from: i, reason: collision with root package name */
    public final int f43936i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f43937a;

        /* renamed from: b, reason: collision with root package name */
        public CharSequence f43938b;

        /* renamed from: c, reason: collision with root package name */
        public float f43939c;
        public int d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f43940e;

        /* renamed from: f, reason: collision with root package name */
        public MovementMethod f43941f;

        /* renamed from: g, reason: collision with root package name */
        public int f43942g;

        /* renamed from: h, reason: collision with root package name */
        public Typeface f43943h;

        /* renamed from: i, reason: collision with root package name */
        public Float f43944i;

        /* renamed from: j, reason: collision with root package name */
        public int f43945j;

        public a(Context r2) {
            kotlin.jvm.internal.p.l(r2, "context");
            this.f43937a = r2;
            kotlin.jvm.internal.y r22 = kotlin.jvm.internal.y.f177509a;
            this.f43938b = "";
            this.f43939c = 12.0f;
            this.d = -1;
            this.f43945j = 17;
        }

        public final A a() {
            return new A(this, null);
        }

        public final MovementMethod b() {
            return this.f43941f;
        }

        public final CharSequence c() {
            return this.f43938b;
        }

        public final int d() {
            return this.d;
        }

        public final int e() {
            return this.f43945j;
        }

        public final boolean f() {
            return this.f43940e;
        }

        public final Float g() {
            return this.f43944i;
        }

        public final float h() {
            return this.f43939c;
        }

        public final int i() {
            return this.f43942g;
        }

        public final Typeface j() {
            return this.f43943h;
        }

        public final a k(CharSequence r2) {
            kotlin.jvm.internal.p.l(r2, "value");
            this.f43938b = r2;
            return this;
        }

        public final a l(int r1) {
            this.d = r1;
            return this;
        }

        public final a m(int r1) {
            this.f43945j = r1;
            return this;
        }

        public final a n(boolean r1) {
            this.f43940e = r1;
            return this;
        }

        public final a o(Float r1) {
            this.f43944i = r1;
            return this;
        }

        public final a p(float r1) {
            this.f43939c = r1;
            return this;
        }

        public final a q(int r1) {
            this.f43942g = r1;
            return this;
        }

        public final a r(Typeface r1) {
            this.f43943h = r1;
            return this;
        }
    }

    public /* synthetic */ A(a r1, kotlin.jvm.internal.i r2) {
        this(r1);
    }

    public final MovementMethod a() {
        return this.f43932e;
    }

    public final CharSequence b() {
        return this.f43929a;
    }

    public final int c() {
        return this.f43931c;
    }

    public final int d() {
        return this.f43936i;
    }

    public final boolean e() {
        return this.d;
    }

    public final Float f() {
        return this.f43935h;
    }

    public final float g() {
        return this.f43930b;
    }

    public final int h() {
        return this.f43933f;
    }

    public final Typeface i() {
        return this.f43934g;
    }

    public A(a r2) {
        this.f43929a = r2.c();
        this.f43930b = r2.h();
        this.f43931c = r2.d();
        this.d = r2.f();
        this.f43932e = r2.b();
        this.f43933f = r2.i();
        this.f43934g = r2.j();
        this.f43935h = r2.g();
        this.f43936i = r2.e();
    }
}
