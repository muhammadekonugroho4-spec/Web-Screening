package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.i;
import androidx.appcompat.j;

/* loaded from: classes.dex */
public class b extends Drawable {

    /* renamed from: m, reason: collision with root package name */
    public static final float f2739m = 0.0f;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f2740a;

    /* renamed from: b, reason: collision with root package name */
    public float f2741b;

    /* renamed from: c, reason: collision with root package name */
    public float f2742c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f2743e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2744f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f2745g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2746h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2747i;

    /* renamed from: j, reason: collision with root package name */
    public float f2748j;

    /* renamed from: k, reason: collision with root package name */
    public float f2749k;

    /* renamed from: l, reason: collision with root package name */
    public int f2750l;

    static {
        f2739m = (float) Math.toRadians(45.0d);
    }

    public b(Context r7) {
        Paint r02 = new Paint();
        this.f2740a = r02;
        this.f2745g = new Path();
        this.f2747i = false;
        this.f2750l = 2;
        r02.setStyle(Paint.Style.STROKE);
        r02.setStrokeJoin(Paint.Join.MITER);
        r02.setStrokeCap(Paint.Cap.BUTT);
        r02.setAntiAlias(true);
        TypedArray r72 = r7.getTheme().obtainStyledAttributes(null, j.b1, androidx.appcompat.a.f2284E, i.f2768a);
        c(r72.getColor(j.f1, 0));
        b(r72.getDimension(j.j1, 0.0f));
        e(r72.getBoolean(j.i1, true));
        d(Math.round(r72.getDimension(j.h1, 0.0f)));
        this.f2746h = r72.getDimensionPixelSize(j.g1, 0);
        this.f2742c = Math.round(r72.getDimension(j.e1, 0.0f));
        this.f2741b = Math.round(r72.getDimension(j.c1, 0.0f));
        this.d = r72.getDimension(j.d1, 0.0f);
        r72.recycle();
    }

    public static float a(float r02, float r1, float r2) {
        return r02 + ((r1 - r02) * r2);
    }

    public void b(float r5) {
        if (this.f2740a.getStrokeWidth() == r5) goto L6;
        this.f2740a.setStrokeWidth(r5);
        this.f2749k = (float) ((r5 / 2.0f) * Math.cos(f2739m));
        invalidateSelf();
        return;
    }

    public void c(int r2) {
        if (r2 == this.f2740a.getColor()) goto L6;
        this.f2740a.setColor(r2);
        invalidateSelf();
        return;
    }

    public void d(float r2) {
        if (r2 == this.f2743e) goto L6;
        this.f2743e = r2;
        invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas r19) {
        Rect r2 = getBounds();
        int r3 = this.f2750l;
        boolean r4 = false;
        if (r3 == 0) goto L13;
        if (r3 != 1) goto L6;
    L12:
        r4 = true;
        goto L13
    L6:
        if (r3 == 3) goto L11;
        if (androidx.core.graphics.drawable.a.f(this) != 1) goto L13;
    L11:
        if (androidx.core.graphics.drawable.a.f(this) == 0) goto L12;
    L13:
        float r32 = this.f2741b;
        float r33 = a(this.f2742c, (float) Math.sqrt((r32 * r32) * 2.0f), this.f2748j);
        float r7 = a(this.f2742c, this.d, this.f2748j);
        float r8 = Math.round(a(0.0f, this.f2749k, this.f2748j));
        float r9 = a(0.0f, f2739m, this.f2748j);
        if (r4 == false) goto L16;
        float r11 = 0.0f;
    L18:
        if (r4 == false) goto L20;
        float r13 = 180.0f;
    L21:
        float r112 = a(r11, r13, this.f2748j);
        double r132 = r33;
        double r5 = r9;
        boolean r92 = r4;
        float r34 = Math.round(Math.cos(r5) * r132);
        float r42 = Math.round(r132 * Math.sin(r5));
        this.f2745g.rewind();
        float r52 = a(this.f2743e + this.f2740a.getStrokeWidth(), -this.f2749k, this.f2748j);
        float r6 = (-r7) / 2.0f;
        this.f2745g.moveTo(r6 + r8, 0.0f);
        this.f2745g.rLineTo(r7 - (r8 * 2.0f), 0.0f);
        this.f2745g.moveTo(r6, r52);
        this.f2745g.rLineTo(r34, r42);
        this.f2745g.moveTo(r6, -r52);
        this.f2745g.rLineTo(r34, -r42);
        this.f2745g.close();
        r19.save();
        float r35 = this.f2740a.getStrokeWidth();
        float r43 = r2.height() - (3.0f * r35);
        float r53 = this.f2743e;
        r19.translate(r2.centerX(), ((((int) (r43 - (r53 * 2.0f))) / 4) * 2) + ((r35 * 1.5f) + r53));
        if (this.f2744f == true) goto L24;
        if (r92 == false) goto L30;
        r19.rotate(180.0f);
    L30:
        r19.drawPath(this.f2745g, this.f2740a);
        r19.restore();
        return;
    L24:
        if ((this.f2747i ^ r92) == false) goto L26;
        int r54 = -1;
    L27:
        r19.rotate(r112 * r54);
        goto L30
    L26:
        r54 = 1;
        goto L27
    L20:
        r13 = 0.0f;
        goto L21
    L16:
        r11 = -180.0f;
        goto L18
    }

    public void e(boolean r2) {
        if (this.f2744f == r2) goto L6;
        this.f2744f = r2;
        invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2746h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2746h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
        if (r2 == this.f2740a.getAlpha()) goto L6;
        this.f2740a.setAlpha(r2);
        invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter r2) {
        this.f2740a.setColorFilter(r2);
        invalidateSelf();
    }

    public void setProgress(float r2) {
        if (this.f2748j == r2) goto L6;
        this.f2748j = r2;
        invalidateSelf();
        return;
    }
}
