package com.amulyakhare.textdrawable;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import com.clevertap.android.sdk.Constants;
import java.util.Locale;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class a extends ShapeDrawable {

    /* renamed from: j, reason: collision with root package name */
    public static final b f31669j = null;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f31670a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f31671b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31672c;
    public final RectShape d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31673e;

    /* renamed from: f, reason: collision with root package name */
    public final int f31674f;

    /* renamed from: g, reason: collision with root package name */
    public final int f31675g;

    /* renamed from: h, reason: collision with root package name */
    public final float f31676h;

    /* renamed from: i, reason: collision with root package name */
    public final int f31677i;

    /* renamed from: com.amulyakhare.textdrawable.a$a, reason: collision with other inner class name */
    public static final class C0299a implements d, e, c {

        /* renamed from: a, reason: collision with root package name */
        public String f31678a;

        /* renamed from: b, reason: collision with root package name */
        public int f31679b;

        /* renamed from: c, reason: collision with root package name */
        public int f31680c;
        public int d;

        /* renamed from: e, reason: collision with root package name */
        public int f31681e;

        /* renamed from: f, reason: collision with root package name */
        public Typeface f31682f;

        /* renamed from: g, reason: collision with root package name */
        public RectShape f31683g;

        /* renamed from: h, reason: collision with root package name */
        public int f31684h;

        /* renamed from: i, reason: collision with root package name */
        public int f31685i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f31686j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f31687k;

        /* renamed from: l, reason: collision with root package name */
        public float f31688l;

        public C0299a() {
            this.f31678a = "";
            this.f31679b = -7829368;
            this.f31684h = -1;
            this.f31680c = 0;
            this.d = -1;
            this.f31681e = -1;
            this.f31683g = new RectShape();
            Typeface r2 = Typeface.create("sans-serif-light", 0);
            p.k(r2, "create(\"sans-serif-light\", Typeface.NORMAL)");
            this.f31682f = r2;
            this.f31685i = -1;
            this.f31686j = false;
            this.f31687k = false;
        }

        @Override // com.amulyakhare.textdrawable.a.d
        public d a() {
            this.f31686j = true;
            return this;
        }

        @Override // com.amulyakhare.textdrawable.a.d
        public d b(int r1) {
            this.f31685i = r1;
            return this;
        }

        @Override // com.amulyakhare.textdrawable.a.d
        public d c(int r1) {
            this.f31684h = r1;
            return this;
        }

        @Override // com.amulyakhare.textdrawable.a.d
        public e d() {
            return this;
        }

        @Override // com.amulyakhare.textdrawable.a.e
        public d e() {
            return this;
        }

        @Override // com.amulyakhare.textdrawable.a.e
        public a f(String r2, int r3) {
            p.l(r2, Constants.KEY_TEXT);
            u();
            return h(r2, r3);
        }

        @Override // com.amulyakhare.textdrawable.a.d
        public d g(Typeface r2) {
            p.l(r2, "font");
            this.f31682f = r2;
            return this;
        }

        public a h(String r2, int r3) {
            p.l(r2, Constants.KEY_TEXT);
            this.f31679b = r3;
            this.f31678a = r2;
            return new a(this);
        }

        public final int i() {
            return this.f31680c;
        }

        public final int j() {
            return this.f31679b;
        }

        public final Typeface k() {
            return this.f31682f;
        }

        public final int l() {
            return this.f31685i;
        }

        public final int m() {
            return this.f31681e;
        }

        public final float n() {
            return this.f31688l;
        }

        public final RectShape o() {
            return this.f31683g;
        }

        public final String p() {
            return this.f31678a;
        }

        public final int q() {
            return this.f31684h;
        }

        public final boolean r() {
            return this.f31687k;
        }

        public final int s() {
            return this.d;
        }

        public final boolean t() {
            return this.f31686j;
        }

        public c u() {
            this.f31683g = new OvalShape();
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(i r1) {
            this();
        }

        public final e a() {
            return new C0299a();
        }

        public b() {
        }
    }

    public interface c {
    }

    public interface d {
        d a();

        d b(int r1);

        d c(int r1);

        e d();

        d g(Typeface r1);
    }

    public interface e {
        d e();

        a f(String r1, int r2);
    }

    static {
        f31669j = new b(null);
    }

    public a(C0299a r4) {
        p.l(r4, "builder");
        super(r4.o());
        this.d = r4.o();
        this.f31673e = r4.m();
        this.f31674f = r4.s();
        this.f31676h = r4.n();
        if (r4.r() == false) goto L9;
        String r02 = r4.p();
        Locale r1 = Locale.getDefault();
        p.k(r1, "getDefault()");
        if (r02 == null) goto L8;
        String r03 = r02.toUpperCase(r1);
        p.k(r03, "(this as java.lang.String).toUpperCase(locale)");
    L10:
        this.f31672c = r03;
        int r04 = r4.j();
        this.f31675g = r4.l();
        Paint r12 = new Paint();
        this.f31670a = r12;
        r12.setColor(r4.q());
        r12.setAntiAlias(true);
        r12.setFakeBoldText(r4.t());
        r12.setStyle(Paint.Style.FILL);
        r12.setTypeface(r4.k());
        r12.setTextAlign(Paint.Align.CENTER);
        r12.setStrokeWidth(r4.i());
        int r42 = r4.i();
        this.f31677i = r42;
        Paint r13 = new Paint();
        this.f31671b = r13;
        r13.setColor(b(r04));
        r13.setStyle(Paint.Style.STROKE);
        r13.setStrokeWidth(r42);
        getPaint().setColor(r04);
        return;
    L8:
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    L9:
        r03 = r4.p();
        goto L10
    }

    public final void a(Canvas r4) {
        RectF r02 = new RectF(getBounds());
        int r1 = this.f31677i;
        r02.inset(r1 / 2, r1 / 2);
        RectShape r12 = this.d;
        if ((r12 instanceof OvalShape) == false) goto L7;
        r4.drawOval(r02, this.f31671b);
        return;
    L7:
        if ((r12 instanceof RoundRectShape) == false) goto L10;
        float r13 = this.f31676h;
        r4.drawRoundRect(r02, r13, r13, this.f31671b);
        return;
    L10:
        r4.drawRect(r02, this.f31671b);
    }

    public final int b(int r4) {
        return Color.rgb((int) (Color.red(r4) * 0.9f), (int) (Color.green(r4) * 0.9f), (int) (Color.blue(r4) * 0.9f));
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas r8) {
        p.l(r8, "canvas");
        super.draw(r8);
        Rect r02 = getBounds();
        p.k(r02, "bounds");
        if (this.f31677i <= 0) goto L5;
        a(r8);
    L5:
        int r1 = r8.save();
        r8.translate(r02.left, r02.top);
        int r2 = this.f31674f;
        if (r2 >= 0) goto L8;
        r2 = r02.width();
    L8:
        int r3 = this.f31673e;
        if (r3 >= 0) goto L11;
        r3 = r02.height();
    L11:
        int r03 = this.f31675g;
        if (r03 >= 0) goto L14;
        r03 = Math.min(r2, r3) / 2;
    L14:
        this.f31670a.setTextSize(r03);
        r8.drawText(this.f31672c, r2 / 2, (r3 / 2) - ((this.f31670a.descent() + this.f31670a.ascent()) / 2), this.f31670a);
        r8.restoreToCount(r1);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f31673e;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f31674f;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
        this.f31670a.setAlpha(r2);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter r2) {
        this.f31670a.setColorFilter(r2);
    }
}
