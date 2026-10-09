package com.airbnb.lottie.animation.keyframe;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f31000a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31001b;

    /* renamed from: c, reason: collision with root package name */
    public final d f31002c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public com.airbnb.lottie.value.c f31003e;

    /* renamed from: f, reason: collision with root package name */
    public Object f31004f;

    /* renamed from: g, reason: collision with root package name */
    public float f31005g;

    /* renamed from: h, reason: collision with root package name */
    public float f31006h;

    /* renamed from: com.airbnb.lottie.animation.keyframe.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0294a {
    }

    public interface b {
        void d();
    }

    public static final class c implements d {
        public c() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public com.airbnb.lottie.value.a a() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float b() {
            return 0.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean c(float r2) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean d(float r1) {
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float e() {
            return 1.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return true;
        }

        public /* synthetic */ c(C0294a r1) {
            this();
        }
    }

    public interface d {
        com.airbnb.lottie.value.a a();

        float b();

        boolean c(float r1);

        boolean d(float r1);

        float e();

        boolean isEmpty();
    }

    public static final class e implements d {

        /* renamed from: a, reason: collision with root package name */
        public final List f31007a;

        /* renamed from: b, reason: collision with root package name */
        public com.airbnb.lottie.value.a f31008b;

        /* renamed from: c, reason: collision with root package name */
        public com.airbnb.lottie.value.a f31009c;
        public float d;

        public e(List r2) {
            this.f31009c = null;
            this.d = -1.0f;
            this.f31007a = r2;
            this.f31008b = f(0.0f);
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public com.airbnb.lottie.value.a a() {
            return this.f31008b;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float b() {
            return ((com.airbnb.lottie.value.a) this.f31007a.get(0)).e();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean c(float r3) {
            com.airbnb.lottie.value.a r02 = this.f31009c;
            com.airbnb.lottie.value.a r1 = this.f31008b;
            if (r02 == r1) goto L5;
        L8:
            this.f31009c = r1;
            this.d = r3;
            return false;
        L5:
            if (this.d != r3) goto L8;
            return true;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean d(float r3) {
            if (this.f31008b.a(r3) == true) goto L5;
            this.f31008b = f(r3);
            return true;
        L5:
            return !this.f31008b.h();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float e() {
            return ((com.airbnb.lottie.value.a) this.f31007a.get(r0.size() - 1)).b();
        }

        public final com.airbnb.lottie.value.a f(float r5) {
            List r02 = this.f31007a;
            com.airbnb.lottie.value.a r03 = (com.airbnb.lottie.value.a) r02.get(r02.size() - 1);
            if (r5 < r03.e()) goto L5;
            return r03;
        L5:
            int r04 = this.f31007a.size() - 2;
        L6:
            if (r04 < 1) goto L15;
            com.airbnb.lottie.value.a r1 = (com.airbnb.lottie.value.a) this.f31007a.get(r04);
            if (this.f31008b == r1) goto L13;
            if (r1.a(r5) == false) goto L13;
            return r1;
        L13:
            r04 = r04 - 1;
            goto L6
        L15:
            return (com.airbnb.lottie.value.a) this.f31007a.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    public static final class f implements d {

        /* renamed from: a, reason: collision with root package name */
        public final com.airbnb.lottie.value.a f31010a;

        /* renamed from: b, reason: collision with root package name */
        public float f31011b;

        public f(List r2) {
            this.f31011b = -1.0f;
            this.f31010a = (com.airbnb.lottie.value.a) r2.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public com.airbnb.lottie.value.a a() {
            return this.f31010a;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float b() {
            return this.f31010a.e();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean c(float r2) {
            if (this.f31011b != r2) goto L6;
            return true;
        L6:
            this.f31011b = r2;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean d(float r1) {
            return !this.f31010a.h();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float e() {
            return this.f31010a.b();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    public a(List r3) {
        this.f31000a = new ArrayList(1);
        this.f31001b = false;
        this.d = 0.0f;
        this.f31004f = null;
        this.f31005g = -1.0f;
        this.f31006h = -1.0f;
        this.f31002c = o(r3);
    }

    public static d o(List r2) {
        if (r2.isEmpty() == false) goto L7;
        return new c(null);
    L7:
        if (r2.size() != 1) goto L11;
        return new f(r2);
    L11:
        return new e(r2);
    }

    public void a(b r2) {
        this.f31000a.add(r2);
    }

    public com.airbnb.lottie.value.a b() {
        com.airbnb.lottie.c.a("BaseKeyframeAnimation#getCurrentKeyframe");
        com.airbnb.lottie.value.a r1 = this.f31002c.a();
        com.airbnb.lottie.c.b("BaseKeyframeAnimation#getCurrentKeyframe");
        return r1;
    }

    public float c() {
        if (this.f31006h != (-1.0f)) goto L6;
        this.f31006h = this.f31002c.e();
    L6:
        return this.f31006h;
    }

    public float d() {
        com.airbnb.lottie.value.a r02 = b();
        if (r02.h() == false) goto L7;
        return 0.0f;
    L7:
        return r02.d.getInterpolation(e());
    }

    public float e() {
        if (this.f31001b == false) goto L5;
        return 0.0f;
    L5:
        com.airbnb.lottie.value.a r02 = b();
        if (r02.h() == false) goto L9;
        return 0.0f;
    L9:
        return (this.d - r02.e()) / (r02.b() - r02.e());
    }

    public float f() {
        return this.d;
    }

    public final float g() {
        if (this.f31005g != (-1.0f)) goto L6;
        this.f31005g = this.f31002c.b();
    L6:
        return this.f31005g;
    }

    public Object h() {
        float r02 = e();
        if (this.f31003e == null) goto L5;
    L8:
        com.airbnb.lottie.value.a r1 = b();
        Interpolator r2 = r1.f31634e;
        if (r2 != null) goto L11;
    L13:
        Object r03 = i(r1, d());
    L14:
        this.f31004f = r03;
        return r03;
    L11:
        if (r1.f31635f == null) goto L13;
        r03 = j(r1, r02, r2.getInterpolation(r02), r1.f31635f.getInterpolation(r02));
        goto L14
    L5:
        if (this.f31002c.c(r02) == false) goto L8;
        return this.f31004f;
    }

    public abstract Object i(com.airbnb.lottie.value.a r1, float r2);

    public Object j(com.airbnb.lottie.value.a r1, float r2, float r3, float r4) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void k() {
        int r02 = 0;
    L4:
        if (r02 >= this.f31000a.size()) goto L6;
        ((b) this.f31000a.get(r02)).d();
        r02 = r02 + 1;
        goto L4
    }

    public void l() {
        this.f31001b = true;
    }

    public void m(float r2) {
        if (this.f31002c.isEmpty() == false) goto L6;
        return;
    L6:
        if (r2 >= g()) goto L9;
        r2 = g();
    L12:
        if (r2 == this.d) goto L20;
        this.d = r2;
        if (this.f31002c.d(r2) == false) goto L18;
        k();
        return;
    L18:
        return;
    L20:
        return;
    L9:
        if (r2 <= c()) goto L12;
        r2 = c();
        goto L12
    }

    public void n(com.airbnb.lottie.value.c r3) {
        com.airbnb.lottie.value.c r02 = this.f31003e;
        if (r02 == null) goto L5;
        r02.c(null);
    L5:
        this.f31003e = r3;
        if (r3 == null) goto L9;
        r3.c(this);
        return;
    }
}
