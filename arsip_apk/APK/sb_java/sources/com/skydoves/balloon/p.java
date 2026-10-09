package com.skydoves.balloon;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* loaded from: classes6.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f44172a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f44173b;

    /* renamed from: c, reason: collision with root package name */
    public final IconGravity f44174c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f44175e;

    /* renamed from: f, reason: collision with root package name */
    public final int f44176f;

    /* renamed from: g, reason: collision with root package name */
    public final int f44177g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f44178h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f44179a;

        /* renamed from: b, reason: collision with root package name */
        public Drawable f44180b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f44181c;
        public IconGravity d;

        /* renamed from: e, reason: collision with root package name */
        public int f44182e;

        /* renamed from: f, reason: collision with root package name */
        public int f44183f;

        /* renamed from: g, reason: collision with root package name */
        public int f44184g;

        /* renamed from: h, reason: collision with root package name */
        public int f44185h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f44186i;

        public a(Context r3) {
            kotlin.jvm.internal.p.l(r3, "context");
            this.f44179a = r3;
            this.d = IconGravity.START;
            float r32 = 28;
            this.f44182e = kotlin.math.d.e(TypedValue.applyDimension(1, r32, Resources.getSystem().getDisplayMetrics()));
            this.f44183f = kotlin.math.d.e(TypedValue.applyDimension(1, r32, Resources.getSystem().getDisplayMetrics()));
            this.f44184g = kotlin.math.d.e(TypedValue.applyDimension(1, 8, Resources.getSystem().getDisplayMetrics()));
            this.f44185h = -1;
            kotlin.jvm.internal.y r33 = kotlin.jvm.internal.y.f177509a;
            this.f44186i = "";
        }

        public final p a() {
            return new p(this, null);
        }

        public final Drawable b() {
            return this.f44180b;
        }

        public final Integer c() {
            return this.f44181c;
        }

        public final int d() {
            return this.f44185h;
        }

        public final CharSequence e() {
            return this.f44186i;
        }

        public final IconGravity f() {
            return this.d;
        }

        public final int g() {
            return this.f44183f;
        }

        public final int h() {
            return this.f44184g;
        }

        public final int i() {
            return this.f44182e;
        }

        public final a j(Drawable r1) {
            this.f44180b = r1;
            return this;
        }

        public final a k(IconGravity r2) {
            kotlin.jvm.internal.p.l(r2, "value");
            this.d = r2;
            return this;
        }

        public final a l(int r1) {
            this.f44185h = r1;
            return this;
        }

        public final a m(int r1) {
            this.f44183f = r1;
            return this;
        }

        public final a n(int r1) {
            this.f44184g = r1;
            return this;
        }

        public final a o(int r1) {
            this.f44182e = r1;
            return this;
        }
    }

    public /* synthetic */ p(a r1, kotlin.jvm.internal.i r2) {
        this(r1);
    }

    public final Drawable a() {
        return this.f44172a;
    }

    public final Integer b() {
        return this.f44173b;
    }

    public final int c() {
        return this.f44177g;
    }

    public final CharSequence d() {
        return this.f44178h;
    }

    public final IconGravity e() {
        return this.f44174c;
    }

    public final int f() {
        return this.f44175e;
    }

    public final int g() {
        return this.f44176f;
    }

    public final int h() {
        return this.d;
    }

    public p(a r2) {
        this.f44172a = r2.b();
        this.f44173b = r2.c();
        this.f44174c = r2.f();
        this.d = r2.i();
        this.f44175e = r2.g();
        this.f44176f = r2.h();
        this.f44177g = r2.d();
        this.f44178h = r2.e();
    }
}
