package com.nineoldandroids.animation;

import android.view.animation.Interpolator;

/* loaded from: classes6.dex */
public abstract class g implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public float f43543a;

    /* renamed from: b, reason: collision with root package name */
    public Class f43544b;

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f43545c;
    public boolean d;

    public static class a extends g {

        /* renamed from: e, reason: collision with root package name */
        public float f43546e;

        public a(float r1, float r2) {
            this.f43543a = r1;
            this.f43546e = r2;
            this.f43544b = Float.TYPE;
            this.d = true;
        }

        @Override // com.nineoldandroids.animation.g
        public /* bridge */ /* synthetic */ g a() {
            return l();
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return l();
        }

        @Override // com.nineoldandroids.animation.g
        public Object e() {
            return Float.valueOf(this.f43546e);
        }

        @Override // com.nineoldandroids.animation.g
        public void k(Object r3) {
            if (r3 != null) goto L4;
            return;
        L4:
            if (r3.getClass() != Float.class) goto L8;
            this.f43546e = ((Float) r3).floatValue();
            this.d = true;
            return;
        }

        public a l() {
            a r02 = new a(b(), this.f43546e);
            r02.j(c());
            return r02;
        }

        public float m() {
            return this.f43546e;
        }

        public a(float r1) {
            this.f43543a = r1;
            this.f43544b = Float.TYPE;
        }
    }

    public g() {
        this.f43545c = null;
        this.d = false;
    }

    public static g h(float r1) {
        return new a(r1);
    }

    public static g i(float r1, float r2) {
        return new a(r1, r2);
    }

    public abstract g a();

    public float b() {
        return this.f43543a;
    }

    public Interpolator c() {
        return this.f43545c;
    }

    public abstract Object e();

    public boolean g() {
        return this.d;
    }

    public void j(Interpolator r1) {
        this.f43545c = r1;
    }

    public abstract void k(Object r1);
}
