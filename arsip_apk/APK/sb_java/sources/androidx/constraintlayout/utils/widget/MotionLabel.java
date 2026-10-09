package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.motion.widget.c;
import androidx.constraintlayout.widget.e;
import com.google.common.primitives.Ints;

/* loaded from: classes.dex */
public class MotionLabel extends View implements c {

    /* renamed from: V, reason: collision with root package name */
    public static String f22115V = "MotionLabel";

    /* renamed from: A, reason: collision with root package name */
    public float f22116A;

    /* renamed from: B, reason: collision with root package name */
    public float f22117B;

    /* renamed from: C, reason: collision with root package name */
    public float f22118C;

    /* renamed from: D, reason: collision with root package name */
    public Drawable f22119D;

    /* renamed from: E, reason: collision with root package name */
    public Matrix f22120E;

    /* renamed from: F, reason: collision with root package name */
    public Bitmap f22121F;

    /* renamed from: G, reason: collision with root package name */
    public BitmapShader f22122G;

    /* renamed from: H, reason: collision with root package name */
    public Matrix f22123H;

    /* renamed from: I, reason: collision with root package name */
    public float f22124I;

    /* renamed from: J, reason: collision with root package name */
    public float f22125J;

    /* renamed from: K, reason: collision with root package name */
    public float f22126K;

    /* renamed from: L, reason: collision with root package name */
    public float f22127L;

    /* renamed from: M, reason: collision with root package name */
    public Paint f22128M;

    /* renamed from: N, reason: collision with root package name */
    public int f22129N;

    /* renamed from: O, reason: collision with root package name */
    public Rect f22130O;

    /* renamed from: P, reason: collision with root package name */
    public Paint f22131P;

    /* renamed from: Q, reason: collision with root package name */
    public float f22132Q;

    /* renamed from: R, reason: collision with root package name */
    public float f22133R;

    /* renamed from: S, reason: collision with root package name */
    public float f22134S;

    /* renamed from: T, reason: collision with root package name */
    public float f22135T;

    /* renamed from: U, reason: collision with root package name */
    public float f22136U;

    /* renamed from: a, reason: collision with root package name */
    public TextPaint f22137a;

    /* renamed from: b, reason: collision with root package name */
    public Path f22138b;

    /* renamed from: c, reason: collision with root package name */
    public int f22139c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22140e;

    /* renamed from: f, reason: collision with root package name */
    public float f22141f;

    /* renamed from: g, reason: collision with root package name */
    public float f22142g;

    /* renamed from: h, reason: collision with root package name */
    public ViewOutlineProvider f22143h;

    /* renamed from: i, reason: collision with root package name */
    public RectF f22144i;

    /* renamed from: j, reason: collision with root package name */
    public float f22145j;

    /* renamed from: k, reason: collision with root package name */
    public float f22146k;

    /* renamed from: l, reason: collision with root package name */
    public int f22147l;

    /* renamed from: m, reason: collision with root package name */
    public int f22148m;

    /* renamed from: n, reason: collision with root package name */
    public float f22149n;

    /* renamed from: o, reason: collision with root package name */
    public String f22150o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f22151p;

    /* renamed from: q, reason: collision with root package name */
    public Rect f22152q;

    /* renamed from: r, reason: collision with root package name */
    public int f22153r;

    /* renamed from: s, reason: collision with root package name */
    public int f22154s;

    /* renamed from: t, reason: collision with root package name */
    public int f22155t;

    /* renamed from: u, reason: collision with root package name */
    public int f22156u;

    /* renamed from: v, reason: collision with root package name */
    public String f22157v;

    /* renamed from: w, reason: collision with root package name */
    public Layout f22158w;

    /* renamed from: x, reason: collision with root package name */
    public int f22159x;

    /* renamed from: y, reason: collision with root package name */
    public int f22160y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f22161z;

    public class a extends ViewOutlineProvider {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MotionLabel f22162a;

        public a(MotionLabel r1) {
            this.f22162a = r1;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View r7, Outline r8) {
            r8.setRoundRect(0, 0, this.f22162a.getWidth(), this.f22162a.getHeight(), (Math.min(r3, r4) * MotionLabel.b(this.f22162a)) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MotionLabel f22163a;

        public b(MotionLabel r1) {
            this.f22163a = r1;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View r7, Outline r8) {
            r8.setRoundRect(0, 0, this.f22163a.getWidth(), this.f22163a.getHeight(), MotionLabel.c(this.f22163a));
        }
    }

    static {
    }

    public MotionLabel(Context r6) {
        super(r6);
        this.f22137a = new TextPaint();
        this.f22138b = new Path();
        this.f22139c = 65535;
        this.d = 65535;
        this.f22140e = false;
        this.f22141f = 0.0f;
        this.f22142g = Float.NaN;
        this.f22145j = 48.0f;
        this.f22146k = Float.NaN;
        this.f22149n = 0.0f;
        this.f22150o = "Hello World";
        this.f22151p = true;
        this.f22152q = new Rect();
        this.f22153r = 1;
        this.f22154s = 1;
        this.f22155t = 1;
        this.f22156u = 1;
        this.f22159x = 8388659;
        this.f22160y = 0;
        this.f22161z = false;
        this.f22124I = Float.NaN;
        this.f22125J = Float.NaN;
        this.f22126K = 0.0f;
        this.f22127L = 0.0f;
        this.f22128M = new Paint();
        this.f22129N = 0;
        this.f22133R = Float.NaN;
        this.f22134S = Float.NaN;
        this.f22135T = Float.NaN;
        this.f22136U = Float.NaN;
        g(r6, null);
    }

    public static /* synthetic */ float b(MotionLabel r02) {
        return r02.f22141f;
    }

    public static /* synthetic */ float c(MotionLabel r02) {
        return r02.f22142g;
    }

    private float getHorizontalOffset() {
        if (Float.isNaN(this.f22146k) == false) goto L5;
        float r02 = 1.0f;
    L6:
        TextPaint r2 = this.f22137a;
        String r3 = this.f22150o;
        float r03 = r02 * r2.measureText(r3, 0, r3.length());
        if (Float.isNaN(this.f22117B) == false) goto L9;
        float r22 = getMeasuredWidth();
    L11:
        return ((((r22 - getPaddingLeft()) - getPaddingRight()) - r03) * (this.f22126K + 1.0f)) / 2.0f;
    L9:
        r22 = this.f22117B;
        goto L11
    L5:
        r02 = this.f22145j / this.f22146k;
        goto L6
    }

    private float getVerticalOffset() {
        if (Float.isNaN(this.f22146k) == false) goto L5;
        float r02 = 1.0f;
    L6:
        Paint.FontMetrics r2 = this.f22137a.getFontMetrics();
        if (Float.isNaN(this.f22118C) == false) goto L9;
        float r3 = getMeasuredHeight();
    L10:
        float r32 = (r3 - getPaddingTop()) - getPaddingBottom();
        float r4 = r2.descent;
        float r22 = r2.ascent;
        return (((r32 - ((r4 - r22) * r02)) * (1.0f - this.f22127L)) / 2.0f) - (r02 * r22);
    L9:
        r3 = this.f22118C;
        goto L10
    L5:
        r02 = this.f22145j / this.f22146k;
        goto L6
    }

    @Override // androidx.constraintlayout.motion.widget.c
    public void a(float r9, float r10, float r11, float r12) {
        int r1 = (int) (r9 + 0.5f);
        this.f22116A = r9 - r1;
        int r2 = (int) (r11 + 0.5f);
        int r3 = r2 - r1;
        int r4 = (int) (r12 + 0.5f);
        int r02 = (int) (0.5f + r10);
        int r5 = r4 - r02;
        float r6 = r11 - r9;
        this.f22117B = r6;
        float r7 = r12 - r10;
        this.f22118C = r7;
        d(r9, r10, r11, r12);
        if (getMeasuredHeight() == r5) goto L5;
    L8:
        measure(View.MeasureSpec.makeMeasureSpec(r3, Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(r5, Ints.MAX_POWER_OF_TWO));
        super.layout(r1, r02, r2, r4);
    L10:
        if (this.f22161z == true) goto L12;
        return;
    L12:
        if (this.f22130O != null) goto L14;
        this.f22131P = new Paint();
        this.f22130O = new Rect();
        this.f22131P.set(this.f22137a);
        this.f22132Q = this.f22131P.getTextSize();
    L14:
        this.f22117B = r6;
        this.f22118C = r7;
        Paint r92 = this.f22131P;
        String r102 = this.f22150o;
        r92.getTextBounds(r102, 0, r102.length(), this.f22130O);
        float r103 = this.f22130O.height() * 1.3f;
        float r62 = (r6 - this.f22154s) - this.f22153r;
        float r72 = (r7 - this.f22156u) - this.f22155t;
        float r93 = this.f22130O.width();
        if ((r93 * r72) <= (r103 * r62)) goto L17;
        this.f22137a.setTextSize((this.f22132Q * r62) / r93);
    L19:
        if (this.f22140e == true) goto L23;
        if (Float.isNaN(this.f22146k) == false) goto L23;
        return;
    L23:
        if (Float.isNaN(this.f22146k) == false) goto L25;
        float r94 = 1.0f;
    L26:
        f(r94);
        return;
    L25:
        r94 = this.f22145j / this.f22146k;
        goto L26
    L17:
        this.f22137a.setTextSize((this.f22132Q * r72) / r103);
        goto L19
    L5:
        if (getMeasuredWidth() != r3) goto L8;
        super.layout(r1, r02, r2, r4);
        goto L10
    }

    public final void d(float r2, float r3, float r4, float r5) {
        if (this.f22123H != null) goto L5;
        return;
    L5:
        this.f22117B = r4 - r2;
        this.f22118C = r5 - r3;
        l();
    }

    public Bitmap e(Bitmap r6, int r7) {
        System.nanoTime();
        int r02 = r6.getWidth();
        int r03 = r02 / 2;
        int r1 = r6.getHeight() / 2;
        Bitmap r62 = Bitmap.createScaledBitmap(r6, r03, r1, true);
        int r3 = 0;
    L3:
        if (r3 >= r7) goto L9;
        if (r03 < 32) goto L9;
        if (r1 < 32) goto L9;
        r03 = r03 / 2;
        r1 = r1 / 2;
        r62 = Bitmap.createScaledBitmap(r62, r03, r1, true);
        r3 = r3 + 1;
    L9:
        return r62;
    }

    public void f(float r11) {
        if (this.f22140e == false) goto L5;
    L7:
        this.f22138b.reset();
        String r3 = this.f22150o;
        int r5 = r3.length();
        this.f22137a.getTextBounds(r3, 0, r5, this.f22152q);
        this.f22137a.getTextPath(r3, 0, r5, 0.0f, 0.0f, this.f22138b);
        if (r11 == 1.0f) goto L10;
        Log.v(f22115V, androidx.constraintlayout.motion.widget.a.a() + " scale " + r11);
        Matrix r02 = new Matrix();
        r02.postScale(r11, r11);
        this.f22138b.transform(r02);
    L10:
        Rect r112 = this.f22152q;
        r112.right--;
        r112.left++;
        r112.bottom++;
        r112.top--;
        RectF r113 = new RectF();
        r113.bottom = getHeight();
        r113.right = getWidth();
        this.f22151p = false;
        return;
    L5:
        if (r11 != 1.0f) goto L7;
    }

    public final void g(Context r6, AttributeSet r7) {
        i(r6, r7);
        if (r7 == null) goto L77;
        TypedArray r62 = getContext().obtainStyledAttributes(r7, e.D8);
        int r72 = r62.getIndexCount();
        int r1 = 0;
    L5:
        if (r1 >= r72) goto L76;
        int r2 = r62.getIndex(r1);
        if (r2 != e.J8) goto L10;
        setText(r62.getText(r2));
    L75:
        r1 = r1 + 1;
        goto L5
    L10:
        if (r2 != e.K8) goto L13;
        this.f22157v = r62.getString(r2);
        goto L75
    L13:
        if (r2 != e.O8) goto L16;
        this.f22146k = r62.getDimensionPixelSize(r2, (int) this.f22146k);
        goto L75
    L16:
        if (r2 != e.E8) goto L19;
        this.f22145j = r62.getDimensionPixelSize(r2, (int) this.f22145j);
        goto L75
    L19:
        if (r2 != e.G8) goto L22;
        this.f22147l = r62.getInt(r2, this.f22147l);
        goto L75
    L22:
        if (r2 != e.F8) goto L25;
        this.f22148m = r62.getInt(r2, this.f22148m);
        goto L75
    L25:
        if (r2 != e.H8) goto L28;
        this.f22139c = r62.getColor(r2, this.f22139c);
        goto L75
    L28:
        if (r2 != e.M8) goto L31;
        float r22 = r62.getDimension(r2, this.f22142g);
        this.f22142g = r22;
        setRound(r22);
        goto L75
    L31:
        if (r2 != e.N8) goto L34;
        float r23 = r62.getFloat(r2, this.f22141f);
        this.f22141f = r23;
        setRoundPercent(r23);
        goto L75
    L34:
        if (r2 != e.I8) goto L37;
        setGravity(r62.getInt(r2, -1));
        goto L75
    L37:
        if (r2 != e.L8) goto L40;
        this.f22160y = r62.getInt(r2, 0);
        goto L75
    L40:
        if (r2 != e.U8) goto L43;
        this.d = r62.getInt(r2, this.d);
        this.f22140e = true;
        goto L75
    L43:
        if (r2 != e.V8) goto L46;
        this.f22149n = r62.getDimension(r2, this.f22149n);
        this.f22140e = true;
        goto L75
    L46:
        if (r2 != e.P8) goto L49;
        this.f22119D = r62.getDrawable(r2);
        this.f22140e = true;
        goto L75
    L49:
        if (r2 != e.Q8) goto L52;
        this.f22133R = r62.getFloat(r2, this.f22133R);
        goto L75
    L52:
        if (r2 != e.R8) goto L55;
        this.f22134S = r62.getFloat(r2, this.f22134S);
        goto L75
    L55:
        if (r2 != e.W8) goto L58;
        this.f22126K = r62.getFloat(r2, this.f22126K);
        goto L75
    L58:
        if (r2 != e.X8) goto L61;
        this.f22127L = r62.getFloat(r2, this.f22127L);
        goto L75
    L61:
        if (r2 != e.S8) goto L64;
        this.f22136U = r62.getFloat(r2, this.f22136U);
        goto L75
    L64:
        if (r2 != e.T8) goto L67;
        this.f22135T = r62.getFloat(r2, this.f22135T);
        goto L75
    L67:
        if (r2 != e.Z8) goto L70;
        this.f22124I = r62.getDimension(r2, this.f22124I);
        goto L75
    L70:
        if (r2 != e.a9) goto L73;
        this.f22125J = r62.getDimension(r2, this.f22125J);
        goto L75
    L73:
        if (r2 != e.Y8) goto L75;
        this.f22129N = r62.getInt(r2, this.f22129N);
        goto L75
    L76:
        r62.recycle();
    L77:
        k();
        j();
    }

    public float getRound() {
        return this.f22142g;
    }

    public float getRoundPercent() {
        return this.f22141f;
    }

    public float getScaleFromTextSize() {
        return this.f22146k;
    }

    public float getTextBackgroundPanX() {
        return this.f22133R;
    }

    public float getTextBackgroundPanY() {
        return this.f22134S;
    }

    public float getTextBackgroundRotate() {
        return this.f22136U;
    }

    public float getTextBackgroundZoom() {
        return this.f22135T;
    }

    public int getTextOutlineColor() {
        return this.d;
    }

    public float getTextPanX() {
        return this.f22126K;
    }

    public float getTextPanY() {
        return this.f22127L;
    }

    public float getTextureHeight() {
        return this.f22124I;
    }

    public float getTextureWidth() {
        return this.f22125J;
    }

    public Typeface getTypeface() {
        return this.f22137a.getTypeface();
    }

    public final void h(String r5, int r6, int r7) {
        if (r5 == null) goto L7;
        Typeface r52 = Typeface.create(r5, r7);
        if (r52 == null) goto L8;
        setTypeface(r52);
        return;
    L8:
        boolean r1 = true;
        if (r6 == 1) goto L16;
        if (r6 != 2) goto L12;
        r52 = Typeface.SERIF;
    L17:
        float r62 = 0.0f;
        if (r7 <= 0) goto L35;
        if (r52 != null) goto L21;
        Typeface r53 = Typeface.defaultFromStyle(r7);
    L22:
        setTypeface(r53);
        if (r53 == null) goto L25;
        int r54 = r53.getStyle();
    L26:
        int r55 = (~r54) & r7;
        TextPaint r72 = this.f22137a;
        if ((r55 & 1) != 0) goto L30;
        r1 = false;
    L30:
        r72.setFakeBoldText(r1);
        TextPaint r73 = this.f22137a;
        if ((r55 & 2) == 0) goto L33;
        r62 = -0.25f;
    L33:
        r73.setTextSkewX(r62);
        return;
    L25:
        r54 = 0;
        goto L26
    L21:
        r53 = Typeface.create(r52, r7);
        goto L22
    L35:
        this.f22137a.setFakeBoldText(false);
        this.f22137a.setTextSkewX(0.0f);
        setTypeface(r52);
        return;
    L12:
        if (r6 != 3) goto L17;
        r52 = Typeface.MONOSPACE;
        goto L17
    L16:
        r52 = Typeface.SANS_SERIF;
        goto L17
    L7:
        r52 = null;
        goto L8
    }

    public final void i(Context r3, AttributeSet r4) {
        TypedValue r42 = new TypedValue();
        r3.getTheme().resolveAttribute(androidx.appcompat.a.f2281B, r42, true);
        TextPaint r32 = this.f22137a;
        int r43 = r42.data;
        this.f22139c = r43;
        r32.setColor(r43);
    }

    public void j() {
        this.f22153r = getPaddingLeft();
        this.f22154s = getPaddingRight();
        this.f22155t = getPaddingTop();
        this.f22156u = getPaddingBottom();
        h(this.f22157v, this.f22148m, this.f22147l);
        this.f22137a.setColor(this.f22139c);
        this.f22137a.setStrokeWidth(this.f22149n);
        this.f22137a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f22137a.setFlags(128);
        setTextSize(this.f22145j);
        this.f22137a.setAntiAlias(true);
    }

    public final void k() {
        if (this.f22119D == null) goto L28;
        this.f22123H = new Matrix();
        int r02 = this.f22119D.getIntrinsicWidth();
        int r1 = this.f22119D.getIntrinsicHeight();
        int r2 = 128;
        if (r02 > 0) goto L12;
        r02 = getWidth();
        if (r02 != 0) goto L12;
        if (Float.isNaN(this.f22125J) == false) goto L11;
        r02 = 128;
        goto L12
    L11:
        r02 = (int) this.f22125J;
    L12:
        if (r1 > 0) goto L21;
        r1 = getHeight();
        if (r1 != 0) goto L21;
        if (Float.isNaN(this.f22124I) == true) goto L19;
        r2 = (int) this.f22124I;
    L19:
        r1 = r2;
    L21:
        if (this.f22129N == 0) goto L23;
        r02 = r02 / 2;
        r1 = r1 / 2;
    L23:
        this.f22121F = Bitmap.createBitmap(r02, r1, Bitmap.Config.ARGB_8888);
        Canvas r03 = new Canvas(this.f22121F);
        this.f22119D.setBounds(0, 0, r03.getWidth(), r03.getHeight());
        this.f22119D.setFilterBitmap(true);
        this.f22119D.draw(r03);
        if (this.f22129N == 0) goto L26;
        this.f22121F = e(this.f22121F, 4);
    L26:
        Bitmap r12 = this.f22121F;
        Shader.TileMode r22 = Shader.TileMode.REPEAT;
        this.f22122G = new BitmapShader(r12, r22, r22);
        return;
    }

    public final void l() {
        float r1 = 0.0f;
        if (Float.isNaN(this.f22133R) == false) goto L5;
        float r02 = 0.0f;
    L7:
        if (Float.isNaN(this.f22134S) == false) goto L9;
        float r2 = 0.0f;
    L11:
        if (Float.isNaN(this.f22135T) == false) goto L13;
        float r3 = 1.0f;
    L15:
        if (Float.isNaN(this.f22136U) == true) goto L18;
        r1 = this.f22136U;
    L18:
        this.f22123H.reset();
        float r4 = this.f22121F.getWidth();
        float r5 = this.f22121F.getHeight();
        if (Float.isNaN(this.f22125J) == false) goto L21;
        float r6 = this.f22117B;
    L23:
        if (Float.isNaN(this.f22124I) == false) goto L25;
        float r7 = this.f22118C;
    L27:
        if ((r4 * r7) >= (r5 * r6)) goto L29;
        float r8 = r6 / r4;
    L30:
        float r32 = r3 * r8;
        this.f22123H.postScale(r32, r32);
        float r42 = r4 * r32;
        float r82 = r6 - r42;
        float r33 = r32 * r5;
        float r52 = r7 - r33;
        if (Float.isNaN(this.f22124I) == true) goto L34;
        r52 = this.f22124I / 2.0f;
    L34:
        if (Float.isNaN(this.f22125J) == true) goto L36;
        r82 = this.f22125J / 2.0f;
    L36:
        float r22 = (((r2 * r52) + r7) - r33) * 0.5f;
        this.f22123H.postTranslate((((r02 * r82) + r6) - r42) * 0.5f, r22);
        this.f22123H.postRotate(r1, r6 / 2.0f, r7 / 2.0f);
        this.f22122G.setLocalMatrix(this.f22123H);
        return;
    L29:
        r8 = r7 / r5;
        goto L30
    L25:
        r7 = this.f22124I;
        goto L27
    L21:
        r6 = this.f22125J;
        goto L23
    L13:
        r3 = this.f22135T;
        goto L15
    L9:
        r2 = this.f22134S;
        goto L11
    L5:
        r02 = this.f22133R;
        goto L7
    }

    @Override // android.view.View
    public void layout(int r9, int r10, int r11, int r12) {
        super.layout(r9, r10, r11, r12);
        boolean r02 = Float.isNaN(this.f22146k);
        if (r02 == false) goto L5;
        float r1 = 1.0f;
    L6:
        this.f22117B = r11 - r9;
        this.f22118C = r12 - r10;
        if (this.f22161z == false) goto L22;
        if (this.f22130O != null) goto L11;
        this.f22131P = new Paint();
        this.f22130O = new Rect();
        this.f22131P.set(this.f22137a);
        this.f22132Q = this.f22131P.getTextSize();
    L11:
        Paint r2 = this.f22131P;
        String r3 = this.f22150o;
        r2.getTextBounds(r3, 0, r3.length(), this.f22130O);
        int r22 = this.f22130O.width();
        int r32 = (int) (this.f22130O.height() * 1.3f);
        float r4 = (this.f22117B - this.f22154s) - this.f22153r;
        float r5 = (this.f22118C - this.f22156u) - this.f22155t;
        if (r02 == false) goto L17;
        float r23 = r22;
        float r33 = r32;
        if ((r23 * r5) <= (r33 * r4)) goto L16;
        this.f22137a.setTextSize((this.f22132Q * r4) / r23);
        goto L22
    L16:
        this.f22137a.setTextSize((this.f22132Q * r5) / r33);
        goto L22
    L17:
        float r13 = r22;
        float r34 = r32;
        if ((r13 * r5) <= (r34 * r4)) goto L20;
        r1 = r4 / r13;
        goto L22
    L20:
        r1 = r5 / r34;
    L22:
        if (this.f22140e == true) goto L26;
        if (r02 == false) goto L26;
        return;
    L26:
        d(r9, r10, r11, r12);
        f(r1);
        return;
    L5:
        r1 = this.f22145j / this.f22146k;
        goto L6
    }

    @Override // android.view.View
    public void onDraw(Canvas r5) {
        if (Float.isNaN(this.f22146k) == false) goto L5;
        float r02 = 1.0f;
    L6:
        super.onDraw(r5);
        if (this.f22140e == true) goto L13;
        if (r02 != 1.0f) goto L13;
        float r03 = this.f22153r + getHorizontalOffset();
        r5.drawText(this.f22150o, this.f22116A + r03, this.f22155t + getVerticalOffset(), this.f22137a);
        return;
    L13:
        if (this.f22151p == false) goto L16;
        f(r02);
    L16:
        if (this.f22120E != null) goto L19;
        this.f22120E = new Matrix();
    L19:
        if (this.f22140e == false) goto L29;
        this.f22128M.set(this.f22137a);
        this.f22120E.reset();
        float r1 = this.f22153r + getHorizontalOffset();
        float r2 = this.f22155t + getVerticalOffset();
        this.f22120E.postTranslate(r1, r2);
        this.f22120E.preScale(r02, r02);
        this.f22138b.transform(this.f22120E);
        if (this.f22122G == null) goto L23;
        this.f22137a.setFilterBitmap(true);
        this.f22137a.setShader(this.f22122G);
    L24:
        this.f22137a.setStyle(Paint.Style.FILL);
        this.f22137a.setStrokeWidth(this.f22149n);
        r5.drawPath(this.f22138b, this.f22137a);
        if (this.f22122G == null) goto L27;
        this.f22137a.setShader(null);
    L27:
        this.f22137a.setColor(this.d);
        this.f22137a.setStyle(Paint.Style.STROKE);
        this.f22137a.setStrokeWidth(this.f22149n);
        r5.drawPath(this.f22138b, this.f22137a);
        this.f22120E.reset();
        this.f22120E.postTranslate(-r1, -r2);
        this.f22138b.transform(this.f22120E);
        this.f22137a.set(this.f22128M);
        return;
    L23:
        this.f22137a.setColor(this.f22139c);
        goto L24
    L29:
        float r04 = this.f22153r + getHorizontalOffset();
        float r12 = this.f22155t + getVerticalOffset();
        this.f22120E.reset();
        this.f22120E.preTranslate(r04, r12);
        this.f22138b.transform(this.f22120E);
        this.f22137a.setColor(this.f22139c);
        this.f22137a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f22137a.setStrokeWidth(this.f22149n);
        r5.drawPath(this.f22138b, this.f22137a);
        this.f22120E.reset();
        this.f22120E.preTranslate(-r04, -r12);
        this.f22138b.transform(this.f22120E);
        return;
    L5:
        r02 = this.f22145j / this.f22146k;
        goto L6
    }

    @Override // android.view.View
    public void onMeasure(int r9, int r10) {
        int r02 = View.MeasureSpec.getMode(r9);
        int r1 = View.MeasureSpec.getMode(r10);
        int r92 = View.MeasureSpec.getSize(r9);
        int r102 = View.MeasureSpec.getSize(r10);
        this.f22161z = false;
        this.f22153r = getPaddingLeft();
        this.f22154s = getPaddingRight();
        this.f22155t = getPaddingTop();
        this.f22156u = getPaddingBottom();
        if (r02 != 1073741824) goto L9;
        if (r1 != 1073741824) goto L9;
        if (this.f22160y == 0) goto L18;
        this.f22161z = true;
    L18:
        setMeasuredDimension(r92, r102);
        return;
    L9:
        TextPaint r4 = this.f22137a;
        String r5 = this.f22150o;
        r4.getTextBounds(r5, 0, r5.length(), this.f22152q);
        if (r02 == 1073741824) goto L12;
        r92 = (int) (this.f22152q.width() + 0.99999f);
    L12:
        r92 = r92 + (this.f22153r + this.f22154s);
        if (r1 == 1073741824) goto L18;
        int r03 = (int) (this.f22137a.getFontMetricsInt(null) + 0.99999f);
        if (r1 != Integer.MIN_VALUE) goto L17;
        r03 = Math.min(r102, r03);
    L17:
        r102 = (this.f22155t + this.f22156u) + r03;
        goto L18
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int r8) {
        if ((r8 & 8388615) != 0) goto L6;
        r8 = r8 | 8388611;
    L6:
        if ((r8 & 112) != 0) goto L9;
        r8 = r8 | 48;
    L9:
        if (r8 == this.f22159x) goto L11;
        invalidate();
    L11:
        this.f22159x = r8;
        int r1 = r8 & 112;
        if (r1 != 48) goto L14;
        this.f22127L = -1.0f;
    L18:
        int r82 = r8 & 8388615;
        if (r82 != 3) goto L21;
    L29:
        this.f22126K = -1.0f;
        return;
    L21:
        if (r82 == 5) goto L27;
        if (r82 == 8388611) goto L29;
        if (r82 == 8388613) goto L27;
        this.f22126K = 0.0f;
        return;
    L27:
        this.f22126K = 1.0f;
        return;
    L14:
        if (r1 == 80) goto L16;
        this.f22127L = 0.0f;
        goto L18
    L16:
        this.f22127L = 1.0f;
        goto L18
    }

    public void setRound(float r5) {
        if (Float.isNaN(r5) == false) goto L7;
        this.f22142g = r5;
        float r52 = this.f22141f;
        this.f22141f = -1.0f;
        setRoundPercent(r52);
        return;
    L7:
        if (this.f22142g == r5) goto L9;
        boolean r02 = true;
    L10:
        this.f22142g = r5;
        if (r5 != 0.0f) goto L13;
        setClipToOutline(false);
    L23:
        if (r02 == false) goto L26;
        invalidateOutline();
        return;
    L26:
        return;
    L13:
        if (this.f22138b != null) goto L16;
        this.f22138b = new Path();
    L16:
        if (this.f22144i != null) goto L19;
        this.f22144i = new RectF();
    L19:
        if (this.f22143h != null) goto L21;
        b r53 = new b(this);
        this.f22143h = r53;
        setOutlineProvider(r53);
    L21:
        setClipToOutline(true);
        this.f22144i.set(0.0f, 0.0f, getWidth(), getHeight());
        this.f22138b.reset();
        Path r54 = this.f22138b;
        RectF r1 = this.f22144i;
        float r2 = this.f22142g;
        r54.addRoundRect(r1, r2, r2, Path.Direction.CW);
        goto L23
    L9:
        r02 = false;
        goto L10
    }

    public void setRoundPercent(float r6) {
        if (this.f22141f == r6) goto L5;
        boolean r02 = true;
    L6:
        this.f22141f = r6;
        if (r6 != 0.0f) goto L9;
        setClipToOutline(false);
    L19:
        if (r02 == false) goto L22;
        invalidateOutline();
        return;
    L22:
        return;
    L9:
        if (this.f22138b != null) goto L12;
        this.f22138b = new Path();
    L12:
        if (this.f22144i != null) goto L15;
        this.f22144i = new RectF();
    L15:
        if (this.f22143h != null) goto L17;
        a r62 = new a(this);
        this.f22143h = r62;
        setOutlineProvider(r62);
    L17:
        setClipToOutline(true);
        int r63 = getWidth();
        int r1 = getHeight();
        float r2 = (Math.min(r63, r1) * this.f22141f) / 2.0f;
        this.f22144i.set(0.0f, 0.0f, r63, r1);
        this.f22138b.reset();
        this.f22138b.addRoundRect(this.f22144i, r2, r2, Path.Direction.CW);
        goto L19
    L5:
        r02 = false;
        goto L6
    }

    public void setScaleFromTextSize(float r1) {
        this.f22146k = r1;
    }

    public void setText(CharSequence r1) {
        this.f22150o = r1.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float r1) {
        this.f22133R = r1;
        l();
        invalidate();
    }

    public void setTextBackgroundPanY(float r1) {
        this.f22134S = r1;
        l();
        invalidate();
    }

    public void setTextBackgroundRotate(float r1) {
        this.f22136U = r1;
        l();
        invalidate();
    }

    public void setTextBackgroundZoom(float r1) {
        this.f22135T = r1;
        l();
        invalidate();
    }

    public void setTextFillColor(int r1) {
        this.f22139c = r1;
        invalidate();
    }

    public void setTextOutlineColor(int r1) {
        this.d = r1;
        this.f22140e = true;
        invalidate();
    }

    public void setTextOutlineThickness(float r2) {
        this.f22149n = r2;
        this.f22140e = true;
        if (Float.isNaN(r2) == false) goto L5;
        this.f22149n = 1.0f;
        this.f22140e = false;
    L5:
        invalidate();
    }

    public void setTextPanX(float r1) {
        this.f22126K = r1;
        invalidate();
    }

    public void setTextPanY(float r1) {
        this.f22127L = r1;
        invalidate();
    }

    public void setTextSize(float r4) {
        this.f22145j = r4;
        Log.v(f22115V, androidx.constraintlayout.motion.widget.a.a() + "  " + r4 + " / " + this.f22146k);
        TextPaint r02 = this.f22137a;
        if (Float.isNaN(this.f22146k) == true) goto L6;
        r4 = this.f22146k;
    L6:
        r02.setTextSize(r4);
        if (Float.isNaN(this.f22146k) == false) goto L9;
        float r42 = 1.0f;
    L10:
        f(r42);
        requestLayout();
        invalidate();
        return;
    L9:
        r42 = this.f22145j / this.f22146k;
        goto L10
    }

    public void setTextureHeight(float r1) {
        this.f22124I = r1;
        l();
        invalidate();
    }

    public void setTextureWidth(float r1) {
        this.f22125J = r1;
        l();
        invalidate();
    }

    public void setTypeface(Typeface r2) {
        if (this.f22137a.getTypeface() == r2) goto L8;
        this.f22137a.setTypeface(r2);
        if (this.f22158w == null) goto L9;
        this.f22158w = null;
        requestLayout();
        invalidate();
        return;
    L9:
        return;
    }

    public MotionLabel(Context r6, AttributeSet r7) {
        super(r6, r7);
        this.f22137a = new TextPaint();
        this.f22138b = new Path();
        this.f22139c = 65535;
        this.d = 65535;
        this.f22140e = false;
        this.f22141f = 0.0f;
        this.f22142g = Float.NaN;
        this.f22145j = 48.0f;
        this.f22146k = Float.NaN;
        this.f22149n = 0.0f;
        this.f22150o = "Hello World";
        this.f22151p = true;
        this.f22152q = new Rect();
        this.f22153r = 1;
        this.f22154s = 1;
        this.f22155t = 1;
        this.f22156u = 1;
        this.f22159x = 8388659;
        this.f22160y = 0;
        this.f22161z = false;
        this.f22124I = Float.NaN;
        this.f22125J = Float.NaN;
        this.f22126K = 0.0f;
        this.f22127L = 0.0f;
        this.f22128M = new Paint();
        this.f22129N = 0;
        this.f22133R = Float.NaN;
        this.f22134S = Float.NaN;
        this.f22135T = Float.NaN;
        this.f22136U = Float.NaN;
        g(r6, r7);
    }

    public MotionLabel(Context r5, AttributeSet r6, int r7) {
        super(r5, r6, r7);
        this.f22137a = new TextPaint();
        this.f22138b = new Path();
        this.f22139c = 65535;
        this.d = 65535;
        this.f22140e = false;
        this.f22141f = 0.0f;
        this.f22142g = Float.NaN;
        this.f22145j = 48.0f;
        this.f22146k = Float.NaN;
        this.f22149n = 0.0f;
        this.f22150o = "Hello World";
        this.f22151p = true;
        this.f22152q = new Rect();
        this.f22153r = 1;
        this.f22154s = 1;
        this.f22155t = 1;
        this.f22156u = 1;
        this.f22159x = 8388659;
        this.f22160y = 0;
        this.f22161z = false;
        this.f22124I = Float.NaN;
        this.f22125J = Float.NaN;
        this.f22126K = 0.0f;
        this.f22127L = 0.0f;
        this.f22128M = new Paint();
        this.f22129N = 0;
        this.f22133R = Float.NaN;
        this.f22134S = Float.NaN;
        this.f22135T = Float.NaN;
        this.f22136U = Float.NaN;
        g(r5, r6);
    }
}
