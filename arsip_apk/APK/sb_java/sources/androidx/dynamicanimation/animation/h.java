package androidx.dynamicanimation.animation;

import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.AbstractC3869e0;
import androidx.dynamicanimation.animation.c;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class h implements c.InterfaceC0192c {

    /* renamed from: A, reason: collision with root package name */
    public static final s f23974A = null;

    /* renamed from: n, reason: collision with root package name */
    public static final s f23975n = null;

    /* renamed from: o, reason: collision with root package name */
    public static final s f23976o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final s f23977p = null;

    /* renamed from: q, reason: collision with root package name */
    public static final s f23978q = null;

    /* renamed from: r, reason: collision with root package name */
    public static final s f23979r = null;

    /* renamed from: s, reason: collision with root package name */
    public static final s f23980s = null;

    /* renamed from: t, reason: collision with root package name */
    public static final s f23981t = null;

    /* renamed from: u, reason: collision with root package name */
    public static final s f23982u = null;

    /* renamed from: v, reason: collision with root package name */
    public static final s f23983v = null;

    /* renamed from: w, reason: collision with root package name */
    public static final s f23984w = null;

    /* renamed from: x, reason: collision with root package name */
    public static final s f23985x = null;

    /* renamed from: y, reason: collision with root package name */
    public static final s f23986y = null;

    /* renamed from: z, reason: collision with root package name */
    public static final s f23987z = null;

    /* renamed from: a, reason: collision with root package name */
    public float f23988a;

    /* renamed from: b, reason: collision with root package name */
    public float f23989b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23990c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.dynamicanimation.animation.i f23991e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23992f;

    /* renamed from: g, reason: collision with root package name */
    public float f23993g;

    /* renamed from: h, reason: collision with root package name */
    public float f23994h;

    /* renamed from: i, reason: collision with root package name */
    public long f23995i;

    /* renamed from: j, reason: collision with root package name */
    public float f23996j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f23997k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f23998l;

    /* renamed from: m, reason: collision with root package name */
    public androidx.dynamicanimation.animation.c f23999m;

    public class a extends s {
        public a(String r2) {
            super(r2, null);
        }

        public float a(View r1) {
            return r1.getY();
        }

        public void b(View r1, float r2) {
            r1.setY(r2);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ float getValue(Object r1) {
            return a((View) r1);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ void setValue(Object r1, float r2) {
            b((View) r1, r2);
        }
    }

    public class b extends s {
        public b(String r2) {
            super(r2, null);
        }

        public float a(View r1) {
            return AbstractC3869e0.M(r1);
        }

        public void b(View r1, float r2) {
            AbstractC3869e0.F0(r1, r2);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ float getValue(Object r1) {
            return a((View) r1);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ void setValue(Object r1, float r2) {
            b((View) r1, r2);
        }
    }

    public class c extends s {
        public c(String r2) {
            super(r2, null);
        }

        public float a(View r1) {
            return r1.getAlpha();
        }

        public void b(View r1, float r2) {
            r1.setAlpha(r2);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ float getValue(Object r1) {
            return a((View) r1);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ void setValue(Object r1, float r2) {
            b((View) r1, r2);
        }
    }

    public class d extends s {
        public d(String r2) {
            super(r2, null);
        }

        public float a(View r1) {
            return r1.getScrollX();
        }

        public void b(View r1, float r2) {
            r1.setScrollX((int) r2);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ float getValue(Object r1) {
            return a((View) r1);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ void setValue(Object r1, float r2) {
            b((View) r1, r2);
        }
    }

    public class e extends s {
        public e(String r2) {
            super(r2, null);
        }

        public float a(View r1) {
            return r1.getScrollY();
        }

        public void b(View r1, float r2) {
            r1.setScrollY((int) r2);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ float getValue(Object r1) {
            return a((View) r1);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ void setValue(Object r1, float r2) {
            b((View) r1, r2);
        }
    }

    public class f extends androidx.dynamicanimation.animation.i {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.dynamicanimation.animation.j f24000a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f24001b;

        public f(h r1, String r2, androidx.dynamicanimation.animation.j r3) {
            this.f24001b = r1;
            this.f24000a = r3;
            super(r2);
        }

        @Override // androidx.dynamicanimation.animation.i
        public float getValue(Object r1) {
            return this.f24000a.a();
        }

        @Override // androidx.dynamicanimation.animation.i
        public void setValue(Object r1, float r2) {
            this.f24000a.b(r2);
        }
    }

    public class g extends s {
        public g(String r2) {
            super(r2, null);
        }

        public float a(View r1) {
            return r1.getTranslationX();
        }

        public void b(View r1, float r2) {
            r1.setTranslationX(r2);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ float getValue(Object r1) {
            return a((View) r1);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ void setValue(Object r1, float r2) {
            b((View) r1, r2);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.h$h, reason: collision with other inner class name */
    public class C0193h extends s {
        public C0193h(String r2) {
            super(r2, null);
        }

        public float a(View r1) {
            return r1.getTranslationY();
        }

        public void b(View r1, float r2) {
            r1.setTranslationY(r2);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ float getValue(Object r1) {
            return a((View) r1);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ void setValue(Object r1, float r2) {
            b((View) r1, r2);
        }
    }

    public class i extends s {
        public i(String r2) {
            super(r2, null);
        }

        public float a(View r1) {
            return AbstractC3869e0.J(r1);
        }

        public void b(View r1, float r2) {
            AbstractC3869e0.D0(r1, r2);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ float getValue(Object r1) {
            return a((View) r1);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ void setValue(Object r1, float r2) {
            b((View) r1, r2);
        }
    }

    public class j extends s {
        public j(String r2) {
            super(r2, null);
        }

        public float a(View r1) {
            return r1.getScaleX();
        }

        public void b(View r1, float r2) {
            r1.setScaleX(r2);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ float getValue(Object r1) {
            return a((View) r1);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ void setValue(Object r1, float r2) {
            b((View) r1, r2);
        }
    }

    public class k extends s {
        public k(String r2) {
            super(r2, null);
        }

        public float a(View r1) {
            return r1.getScaleY();
        }

        public void b(View r1, float r2) {
            r1.setScaleY(r2);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ float getValue(Object r1) {
            return a((View) r1);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ void setValue(Object r1, float r2) {
            b((View) r1, r2);
        }
    }

    public class l extends s {
        public l(String r2) {
            super(r2, null);
        }

        public float a(View r1) {
            return r1.getRotation();
        }

        public void b(View r1, float r2) {
            r1.setRotation(r2);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ float getValue(Object r1) {
            return a((View) r1);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ void setValue(Object r1, float r2) {
            b((View) r1, r2);
        }
    }

    public class m extends s {
        public m(String r2) {
            super(r2, null);
        }

        public float a(View r1) {
            return r1.getRotationX();
        }

        public void b(View r1, float r2) {
            r1.setRotationX(r2);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ float getValue(Object r1) {
            return a((View) r1);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ void setValue(Object r1, float r2) {
            b((View) r1, r2);
        }
    }

    public class n extends s {
        public n(String r2) {
            super(r2, null);
        }

        public float a(View r1) {
            return r1.getRotationY();
        }

        public void b(View r1, float r2) {
            r1.setRotationY(r2);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ float getValue(Object r1) {
            return a((View) r1);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ void setValue(Object r1, float r2) {
            b((View) r1, r2);
        }
    }

    public class o extends s {
        public o(String r2) {
            super(r2, null);
        }

        public float a(View r1) {
            return r1.getX();
        }

        public void b(View r1, float r2) {
            r1.setX(r2);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ float getValue(Object r1) {
            return a((View) r1);
        }

        @Override // androidx.dynamicanimation.animation.i
        public /* bridge */ /* synthetic */ void setValue(Object r1, float r2) {
            b((View) r1, r2);
        }
    }

    public static class p {

        /* renamed from: a, reason: collision with root package name */
        public float f24002a;

        /* renamed from: b, reason: collision with root package name */
        public float f24003b;

        public p() {
        }
    }

    public interface q {
        void a(h r1, boolean r2, float r3, float r4);
    }

    public interface r {
        void b(h r1, float r2, float r3);
    }

    public static abstract class s extends androidx.dynamicanimation.animation.i {
        public /* synthetic */ s(String r1, g r2) {
            this(r1);
        }

        public s(String r1) {
            super(r1);
        }
    }

    static {
        f23975n = new g("translationX");
        f23976o = new C0193h("translationY");
        f23977p = new i("translationZ");
        f23978q = new j("scaleX");
        f23979r = new k("scaleY");
        f23980s = new l("rotation");
        f23981t = new m("rotationX");
        f23982u = new n("rotationY");
        f23983v = new o("x");
        f23984w = new a("y");
        f23985x = new b("z");
        f23986y = new c("alpha");
        f23987z = new d("scrollX");
        f23974A = new e("scrollY");
    }

    public h(androidx.dynamicanimation.animation.j r3) {
        this.f23988a = 0.0f;
        this.f23989b = Float.MAX_VALUE;
        this.f23990c = false;
        this.f23992f = false;
        this.f23993g = Float.MAX_VALUE;
        this.f23994h = -Float.MAX_VALUE;
        this.f23995i = 0;
        this.f23997k = new ArrayList();
        this.f23998l = new ArrayList();
        this.d = null;
        this.f23991e = new f(this, "FloatValueHolder", r3);
        this.f23996j = 1.0f;
    }

    public static void j(ArrayList r1, Object r2) {
        int r22 = r1.indexOf(r2);
        if (r22 < 0) goto L6;
        r1.set(r22, null);
        return;
    }

    public static void k(ArrayList r2) {
        int r02 = r2.size() - 1;
    L3:
        if (r02 < 0) goto L8;
        if (r2.get(r02) != null) goto L7;
        r2.remove(r02);
    L7:
        r02 = r02 - 1;
        goto L3
    }

    @Override // androidx.dynamicanimation.animation.c.InterfaceC0192c
    public boolean a(long r5) {
        long r02 = this.f23995i;
        if (r02 != 0) goto L6;
        this.f23995i = r5;
        o(this.f23989b);
        return false;
    L6:
        long r03 = r5 - r02;
        this.f23995i = r5;
        float r52 = e().g();
        if (r52 != 0.0f) goto L9;
        long r53 = 2147483647L;
    L10:
        boolean r54 = u(r53);
        float r6 = Math.min(this.f23989b, this.f23993g);
        this.f23989b = r6;
        float r62 = Math.max(r6, this.f23994h);
        this.f23989b = r62;
        o(r62);
        if (r54 == false) goto L13;
        d(false);
    L13:
        return r54;
    L9:
        r53 = (long) (r03 / r52);
        goto L10
    }

    public h b(q r2) {
        if (this.f23997k.contains(r2) == true) goto L5;
        this.f23997k.add(r2);
    L5:
        return this;
    }

    public h c(r r2) {
        if (h() == true) goto L9;
        if (this.f23998l.contains(r2) == true) goto L7;
        this.f23998l.add(r2);
    L7:
        return this;
    L9:
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public final void d(boolean r5) {
        int r02 = 0;
        this.f23992f = false;
        e().k(this);
        this.f23995i = 0;
        this.f23990c = false;
    L4:
        if (r02 >= this.f23997k.size()) goto L9;
        if (this.f23997k.get(r02) == null) goto L8;
        ((q) this.f23997k.get(r02)).a(this, r5, this.f23989b, this.f23988a);
    L8:
        r02 = r02 + 1;
        goto L4
    L9:
        k(this.f23997k);
    }

    public androidx.dynamicanimation.animation.c e() {
        androidx.dynamicanimation.animation.c r02 = this.f23999m;
        if (r02 == null) goto L6;
        return r02;
    L6:
        return androidx.dynamicanimation.animation.c.h();
    }

    public final float f() {
        return this.f23991e.getValue(this.d);
    }

    public float g() {
        return this.f23996j * 0.75f;
    }

    public boolean h() {
        return this.f23992f;
    }

    public void i(q r2) {
        j(this.f23997k, r2);
    }

    public h l(float r1) {
        this.f23993g = r1;
        return this;
    }

    public h m(float r1) {
        this.f23994h = r1;
        return this;
    }

    public h n(float r2) {
        if (r2 <= 0.0f) goto L7;
        this.f23996j = r2;
        r(r2 * 0.75f);
        return this;
    L7:
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public void o(float r4) {
        this.f23991e.setValue(this.d, r4);
        int r42 = 0;
    L4:
        if (r42 >= this.f23998l.size()) goto L9;
        if (this.f23998l.get(r42) == null) goto L8;
        ((r) this.f23998l.get(r42)).b(this, this.f23989b, this.f23988a);
    L8:
        r42 = r42 + 1;
        goto L4
    L9:
        k(this.f23998l);
    }

    public h p(float r1) {
        this.f23989b = r1;
        this.f23990c = true;
        return this;
    }

    public h q(float r1) {
        this.f23988a = r1;
        return this;
    }

    public abstract void r(float r1);

    public void s() {
        if (e().j() == false) goto L9;
        if (this.f23992f == true) goto L10;
        t();
        return;
    L10:
        return;
    L9:
        throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
    }

    public final void t() {
        if (this.f23992f == true) goto L15;
        this.f23992f = true;
        if (this.f23990c == true) goto L7;
        this.f23989b = f();
    L7:
        float r02 = this.f23989b;
        if (r02 > this.f23993g) goto L14;
        if (r02 < this.f23994h) goto L14;
        e().d(this, 0);
        return;
    L14:
        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
    }

    public abstract boolean u(long r1);

    public h(Object r3, androidx.dynamicanimation.animation.i r4) {
        this.f23988a = 0.0f;
        this.f23989b = Float.MAX_VALUE;
        this.f23990c = false;
        this.f23992f = false;
        this.f23993g = Float.MAX_VALUE;
        this.f23994h = -Float.MAX_VALUE;
        this.f23995i = 0;
        this.f23997k = new ArrayList();
        this.f23998l = new ArrayList();
        this.d = r3;
        this.f23991e = r4;
        if (r4 != f23980s) goto L5;
    L22:
        this.f23996j = 0.1f;
        return;
    L5:
        if (r4 == f23981t) goto L22;
        if (r4 == f23982u) goto L22;
        if (r4 != f23986y) goto L14;
        this.f23996j = 0.00390625f;
        return;
    L14:
        if (r4 != f23978q) goto L16;
    L20:
        this.f23996j = 0.002f;
        return;
    L16:
        if (r4 == f23979r) goto L20;
        this.f23996j = 1.0f;
    }
}
