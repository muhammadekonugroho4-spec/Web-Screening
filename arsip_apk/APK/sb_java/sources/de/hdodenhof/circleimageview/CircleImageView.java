package de.hdodenhof.circleimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public class CircleImageView extends ImageView {

    /* renamed from: u, reason: collision with root package name */
    public static final ImageView.ScaleType f173991u = null;

    /* renamed from: v, reason: collision with root package name */
    public static final Bitmap.Config f173992v = null;

    /* renamed from: a, reason: collision with root package name */
    public final RectF f173993a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f173994b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f173995c;
    public final Paint d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f173996e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f173997f;

    /* renamed from: g, reason: collision with root package name */
    public int f173998g;

    /* renamed from: h, reason: collision with root package name */
    public int f173999h;

    /* renamed from: i, reason: collision with root package name */
    public int f174000i;

    /* renamed from: j, reason: collision with root package name */
    public Bitmap f174001j;

    /* renamed from: k, reason: collision with root package name */
    public BitmapShader f174002k;

    /* renamed from: l, reason: collision with root package name */
    public int f174003l;

    /* renamed from: m, reason: collision with root package name */
    public int f174004m;

    /* renamed from: n, reason: collision with root package name */
    public float f174005n;

    /* renamed from: o, reason: collision with root package name */
    public float f174006o;

    /* renamed from: p, reason: collision with root package name */
    public ColorFilter f174007p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f174008q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f174009r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f174010s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f174011t;

    public static /* synthetic */ class a {
    }

    public class b extends ViewOutlineProvider {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CircleImageView f174012a;

        public b(CircleImageView r1) {
            this.f174012a = r1;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View r3, Outline r4) {
            if (CircleImageView.a(this.f174012a) == false) goto L6;
            ViewOutlineProvider.BACKGROUND.getOutline(r3, r4);
            return;
        L6:
            Rect r32 = new Rect();
            CircleImageView.b(this.f174012a).roundOut(r32);
            r4.setRoundRect(r32, r32.width() / 2.0f);
        }

        public /* synthetic */ b(CircleImageView r1, a r2) {
            this(r1);
        }
    }

    static {
        f173991u = ImageView.ScaleType.CENTER_CROP;
        f173992v = Bitmap.Config.ARGB_8888;
    }

    public CircleImageView(Context r1) {
        super(r1);
        this.f173993a = new RectF();
        this.f173994b = new RectF();
        this.f173995c = new Matrix();
        this.d = new Paint();
        this.f173996e = new Paint();
        this.f173997f = new Paint();
        this.f173998g = -16777216;
        this.f173999h = 0;
        this.f174000i = 0;
        g();
    }

    public static /* synthetic */ boolean a(CircleImageView r02) {
        return r02.f174011t;
    }

    public static /* synthetic */ RectF b(CircleImageView r02) {
        return r02.f173994b;
    }

    public final void c() {
        Paint r02 = this.d;
        if (r02 == null) goto L6;
        r02.setColorFilter(this.f174007p);
        return;
    }

    public final RectF d() {
        int r2 = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float r3 = getPaddingLeft() + ((r0 - r2) / 2.0f);
        float r02 = getPaddingTop() + ((r1 - r2) / 2.0f);
        float r22 = r2;
        return new RectF(r3, r02, r3 + r22, r22 + r02);
    }

    public final Bitmap e(Drawable r7) {
        if (r7 != null) goto L6;
        return null;
    L6:
        if ((r7 instanceof BitmapDrawable) == true) goto L8;
    L12:
        e = move-exception;
        e.printStackTrace();
        return null;
    L10:
        if ((r7 instanceof ColorDrawable) == false) goto L14;
        Bitmap r1 = Bitmap.createBitmap(2, 2, f173992v);     // Catch: Exception -> L12
    L15:
        Canvas r2 = new Canvas(r1);     // Catch: Exception -> L12
        r7.setBounds(0, 0, r2.getWidth(), r2.getHeight());     // Catch: Exception -> L12
        r7.draw(r2);     // Catch: Exception -> L12
        return r1;
    L14:
        r1 = Bitmap.createBitmap(r7.getIntrinsicWidth(), r7.getIntrinsicHeight(), f173992v);     // Catch: Exception -> L12
        goto L15
    L8:
        return ((BitmapDrawable) r7).getBitmap();
    }

    public final boolean f(float r7, float r8) {
        if (this.f173994b.isEmpty() == false) goto L6;
        return true;
    L6:
        if ((Math.pow(r7 - this.f173994b.centerX(), 2.0d) + Math.pow(r8 - this.f173994b.centerY(), 2.0d)) > Math.pow(this.f174006o, 2.0d)) goto L8;
        return true;
    L8:
        return false;
    }

    public final void g() {
        super.setScaleType(f173991u);
        this.f174008q = true;
        setOutlineProvider(new b(this, null));
        if (this.f174009r == false) goto L6;
        i();
        this.f174009r = false;
        return;
    }

    public int getBorderColor() {
        return this.f173998g;
    }

    public int getBorderWidth() {
        return this.f173999h;
    }

    public int getCircleBackgroundColor() {
        return this.f174000i;
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.f174007p;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return f173991u;
    }

    public final void h() {
        if (this.f174011t == false) goto L5;
        this.f174001j = null;
    L6:
        i();
        return;
    L5:
        this.f174001j = e(getDrawable());
        goto L6
    }

    public final void i() {
        if (this.f174008q == true) goto L7;
        this.f174009r = true;
        return;
    L7:
        if (getWidth() != 0) goto L12;
        if (getHeight() != 0) goto L12;
        return;
    L12:
        if (this.f174001j != null) goto L15;
        invalidate();
        return;
    L15:
        Bitmap r2 = this.f174001j;
        Shader.TileMode r3 = Shader.TileMode.CLAMP;
        this.f174002k = new BitmapShader(r2, r3, r3);
        this.d.setAntiAlias(true);
        this.d.setDither(true);
        this.d.setFilterBitmap(true);
        this.d.setShader(this.f174002k);
        this.f173996e.setStyle(Paint.Style.STROKE);
        this.f173996e.setAntiAlias(true);
        this.f173996e.setColor(this.f173998g);
        this.f173996e.setStrokeWidth(this.f173999h);
        this.f173997f.setStyle(Paint.Style.FILL);
        this.f173997f.setAntiAlias(true);
        this.f173997f.setColor(this.f174000i);
        this.f174004m = this.f174001j.getHeight();
        this.f174003l = this.f174001j.getWidth();
        this.f173994b.set(d());
        this.f174006o = Math.min((this.f173994b.height() - this.f173999h) / 2.0f, (this.f173994b.width() - this.f173999h) / 2.0f);
        this.f173993a.set(this.f173994b);
        if (this.f174010s == true) goto L20;
        int r02 = this.f173999h;
        if (r02 <= 0) goto L20;
        this.f173993a.inset(r02 - 1.0f, r02 - 1.0f);
    L20:
        this.f174005n = Math.min(this.f173993a.height() / 2.0f, this.f173993a.width() / 2.0f);
        c();
        j();
        invalidate();
    }

    public final void j() {
        this.f173995c.set(null);
        float r2 = 0.0f;
        if ((this.f174003l * this.f173993a.height()) <= (this.f173993a.width() * this.f174004m)) goto L5;
        float r02 = this.f173993a.height() / this.f174004m;
        float r3 = 0.0f;
        r2 = (this.f173993a.width() - (this.f174003l * r02)) * 0.5f;
    L6:
        this.f173995c.setScale(r02, r02);
        Matrix r03 = this.f173995c;
        RectF r4 = this.f173993a;
        r03.postTranslate(((int) (r2 + 0.5f)) + r4.left, ((int) (r3 + 0.5f)) + r4.top);
        this.f174002k.setLocalMatrix(this.f173995c);
        return;
    L5:
        r02 = this.f173993a.width() / this.f174003l;
        r3 = (this.f173993a.height() - (this.f174004m * r02)) * 0.5f;
        goto L6
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas r5) {
        if (this.f174011t == false) goto L7;
        super.onDraw(r5);
        return;
    L7:
        if (this.f174001j != null) goto L10;
        return;
    L10:
        if (this.f174000i == 0) goto L12;
        r5.drawCircle(this.f173993a.centerX(), this.f173993a.centerY(), this.f174005n, this.f173997f);
    L12:
        r5.drawCircle(this.f173993a.centerX(), this.f173993a.centerY(), this.f174005n, this.d);
        if (this.f173999h <= 0) goto L16;
        r5.drawCircle(this.f173994b.centerX(), this.f173994b.centerY(), this.f174006o, this.f173996e);
        return;
    }

    @Override // android.view.View
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        i();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent r3) {
        if (this.f174011t == false) goto L7;
        return super.onTouchEvent(r3);
    L7:
        if (f(r3.getX(), r3.getY()) == true) goto L9;
        return false;
    L9:
        if (super.onTouchEvent(r3) == false) goto L14;
        return true;
    L14:
        return false;
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean r2) {
        if (r2 == true) goto L5;
        return;
    L5:
        throw new IllegalArgumentException("adjustViewBounds not supported.");
    }

    public void setBorderColor(int r2) {
        if (r2 != this.f173998g) goto L5;
        return;
    L5:
        this.f173998g = r2;
        this.f173996e.setColor(r2);
        invalidate();
    }

    public void setBorderOverlay(boolean r2) {
        if (r2 != this.f174010s) goto L5;
        return;
    L5:
        this.f174010s = r2;
        i();
    }

    public void setBorderWidth(int r2) {
        if (r2 != this.f173999h) goto L5;
        return;
    L5:
        this.f173999h = r2;
        i();
    }

    public void setCircleBackgroundColor(int r2) {
        if (r2 != this.f174000i) goto L5;
        return;
    L5:
        this.f174000i = r2;
        this.f173997f.setColor(r2);
        invalidate();
    }

    public void setCircleBackgroundColorResource(int r2) {
        setCircleBackgroundColor(getContext().getResources().getColor(r2));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter r2) {
        if (r2 != this.f174007p) goto L5;
        return;
    L5:
        this.f174007p = r2;
        c();
        invalidate();
    }

    public void setDisableCircularTransformation(boolean r2) {
        if (this.f174011t != r2) goto L5;
        return;
    L5:
        this.f174011t = r2;
        h();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap r1) {
        super.setImageBitmap(r1);
        h();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable r1) {
        super.setImageDrawable(r1);
        h();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r1) {
        super.setImageResource(r1);
        h();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri r1) {
        super.setImageURI(r1);
        h();
    }

    @Override // android.view.View
    public void setPadding(int r1, int r2, int r3, int r4) {
        super.setPadding(r1, r2, r3, r4);
        i();
    }

    @Override // android.view.View
    public void setPaddingRelative(int r1, int r2, int r3, int r4) {
        super.setPaddingRelative(r1, r2, r3, r4);
        i();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType r3) {
        if (r3 != f173991u) goto L6;
        return;
    L6:
        throw new IllegalArgumentException(String.format("ScaleType %s not supported.", new Object[]{r3}));
    }

    public CircleImageView(Context r2, AttributeSet r3) {
        this(r2, r3, 0);
    }

    public CircleImageView(Context r4, AttributeSet r5, int r6) {
        super(r4, r5, r6);
        this.f173993a = new RectF();
        this.f173994b = new RectF();
        this.f173995c = new Matrix();
        this.d = new Paint();
        this.f173996e = new Paint();
        this.f173997f = new Paint();
        this.f173998g = -16777216;
        this.f173999h = 0;
        this.f174000i = 0;
        TypedArray r42 = r4.obtainStyledAttributes(r5, de.hdodenhof.circleimageview.a.f174013a, r6, 0);
        this.f173999h = r42.getDimensionPixelSize(de.hdodenhof.circleimageview.a.d, 0);
        this.f173998g = r42.getColor(de.hdodenhof.circleimageview.a.f174014b, -16777216);
        this.f174010s = r42.getBoolean(de.hdodenhof.circleimageview.a.f174015c, false);
        this.f174000i = r42.getColor(de.hdodenhof.circleimageview.a.f174016e, 0);
        r42.recycle();
        g();
    }
}
