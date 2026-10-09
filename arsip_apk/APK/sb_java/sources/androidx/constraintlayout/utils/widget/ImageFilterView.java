package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.e;

/* loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {

    /* renamed from: a, reason: collision with root package name */
    public c f22076a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22077b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f22078c;
    public Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public float f22079e;

    /* renamed from: f, reason: collision with root package name */
    public float f22080f;

    /* renamed from: g, reason: collision with root package name */
    public float f22081g;

    /* renamed from: h, reason: collision with root package name */
    public Path f22082h;

    /* renamed from: i, reason: collision with root package name */
    public ViewOutlineProvider f22083i;

    /* renamed from: j, reason: collision with root package name */
    public RectF f22084j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable[] f22085k;

    /* renamed from: l, reason: collision with root package name */
    public LayerDrawable f22086l;

    /* renamed from: m, reason: collision with root package name */
    public float f22087m;

    /* renamed from: n, reason: collision with root package name */
    public float f22088n;

    /* renamed from: o, reason: collision with root package name */
    public float f22089o;

    /* renamed from: p, reason: collision with root package name */
    public float f22090p;

    public class a extends ViewOutlineProvider {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImageFilterView f22091a;

        public a(ImageFilterView r1) {
            this.f22091a = r1;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View r7, Outline r8) {
            r8.setRoundRect(0, 0, this.f22091a.getWidth(), this.f22091a.getHeight(), (Math.min(r3, r4) * ImageFilterView.c(this.f22091a)) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImageFilterView f22092a;

        public b(ImageFilterView r1) {
            this.f22092a = r1;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View r7, Outline r8) {
            r8.setRoundRect(0, 0, this.f22092a.getWidth(), this.f22092a.getHeight(), ImageFilterView.d(this.f22092a));
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public float[] f22093a;

        /* renamed from: b, reason: collision with root package name */
        public ColorMatrix f22094b;

        /* renamed from: c, reason: collision with root package name */
        public ColorMatrix f22095c;
        public float d;

        /* renamed from: e, reason: collision with root package name */
        public float f22096e;

        /* renamed from: f, reason: collision with root package name */
        public float f22097f;

        /* renamed from: g, reason: collision with root package name */
        public float f22098g;

        public c() {
            this.f22093a = new float[20];
            this.f22094b = new ColorMatrix();
            this.f22095c = new ColorMatrix();
            this.d = 1.0f;
            this.f22096e = 1.0f;
            this.f22097f = 1.0f;
            this.f22098g = 1.0f;
        }

        public final void a(float r4) {
            float[] r02 = this.f22093a;
            r02[0] = r4;
            r02[1] = 0.0f;
            r02[2] = 0.0f;
            r02[3] = 0.0f;
            r02[4] = 0.0f;
            r02[5] = 0.0f;
            r02[6] = r4;
            r02[7] = 0.0f;
            r02[8] = 0.0f;
            r02[9] = 0.0f;
            r02[10] = 0.0f;
            r02[11] = 0.0f;
            r02[12] = r4;
            r02[13] = 0.0f;
            r02[14] = 0.0f;
            r02[15] = 0.0f;
            r02[16] = 0.0f;
            r02[17] = 0.0f;
            r02[18] = 1.0f;
            r02[19] = 0.0f;
        }

        public final void b(float r9) {
            float r1 = 1.0f - r9;
            float r2 = 0.2999f * r1;
            float r3 = 0.587f * r1;
            float r12 = r1 * 0.114f;
            float[] r4 = this.f22093a;
            r4[0] = r2 + r9;
            r4[1] = r3;
            r4[2] = r12;
            r4[3] = 0.0f;
            r4[4] = 0.0f;
            r4[5] = r2;
            r4[6] = r3 + r9;
            r4[7] = r12;
            r4[8] = 0.0f;
            r4[9] = 0.0f;
            r4[10] = r2;
            r4[11] = r3;
            r4[12] = r12 + r9;
            r4[13] = 0.0f;
            r4[14] = 0.0f;
            r4[15] = 0.0f;
            r4[16] = 0.0f;
            r4[17] = 0.0f;
            r4[18] = 1.0f;
            r4[19] = 0.0f;
        }

        public void c(ImageView r6) {
            this.f22094b.reset();
            float r02 = this.f22096e;
            boolean r3 = true;
            if (r02 == 1.0f) goto L5;
            b(r02);
            this.f22094b.set(this.f22093a);
            boolean r03 = true;
        L6:
            float r2 = this.f22097f;
            if (r2 == 1.0f) goto L9;
            this.f22095c.setScale(r2, r2, r2, 1.0f);
            this.f22094b.postConcat(this.f22095c);
            r03 = true;
        L9:
            float r22 = this.f22098g;
            if (r22 == 1.0f) goto L12;
            d(r22);
            this.f22095c.set(this.f22093a);
            this.f22094b.postConcat(this.f22095c);
            r03 = true;
        L12:
            float r23 = this.d;
            if (r23 == 1.0f) goto L15;
            a(r23);
            this.f22095c.set(this.f22093a);
            this.f22094b.postConcat(this.f22095c);
        L16:
            if (r3 == false) goto L19;
            r6.setColorFilter(new ColorMatrixColorFilter(this.f22094b));
            return;
        L19:
            r6.clearColorFilter();
            return;
        L15:
            r3 = r03;
            goto L16
        L5:
            r03 = false;
            goto L6
        }

        public final void d(float r12) {
            if (r12 > 0.0f) goto L5;
            r12 = 0.01f;
        L5:
            float r1 = (5000.0f / r12) / 100.0f;
            if (r1 <= 66.0f) goto L8;
            double r6 = r1 - 60.0f;
            float r2 = ((float) Math.pow(r6, -0.13320475816726685d)) * 329.69873f;
            float r62 = ((float) Math.pow(r6, 0.07551484555006027d)) * 288.12216f;
        L10:
            if (r1 < 66.0f) goto L12;
            float r122 = 255.0f;
        L16:
            float r13 = Math.min(255.0f, Math.max(r2, 0.0f));
            float r22 = Math.min(255.0f, Math.max(r62, 0.0f));
            float r123 = Math.min(255.0f, Math.max(r122, 0.0f));
            float r63 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            float r3 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
            float r4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float r64 = Math.min(255.0f, Math.max(r63, 0.0f));
            float r124 = r123 / Math.min(255.0f, Math.max(r3, 0.0f));
            float[] r32 = this.f22093a;
            r32[0] = r13 / r4;
            r32[1] = 0.0f;
            r32[2] = 0.0f;
            r32[3] = 0.0f;
            r32[4] = 0.0f;
            r32[5] = 0.0f;
            r32[6] = r22 / r64;
            r32[7] = 0.0f;
            r32[8] = 0.0f;
            r32[9] = 0.0f;
            r32[10] = 0.0f;
            r32[11] = 0.0f;
            r32[12] = r124;
            r32[13] = 0.0f;
            r32[14] = 0.0f;
            r32[15] = 0.0f;
            r32[16] = 0.0f;
            r32[17] = 0.0f;
            r32[18] = 1.0f;
            r32[19] = 0.0f;
            return;
        L12:
            if (r1 <= 19.0f) goto L14;
            r122 = (((float) Math.log(r1 - 10.0f)) * 138.51773f) - 305.0448f;
            goto L16
        L14:
            r122 = 0.0f;
            goto L16
        L8:
            r62 = (((float) Math.log(r1)) * 99.4708f) - 161.11957f;
            r2 = 255.0f;
            goto L10
        }
    }

    public ImageFilterView(Context r4) {
        super(r4);
        this.f22076a = new c();
        this.f22077b = true;
        this.f22078c = null;
        this.d = null;
        this.f22079e = 0.0f;
        this.f22080f = 0.0f;
        this.f22081g = Float.NaN;
        this.f22085k = new Drawable[2];
        this.f22087m = Float.NaN;
        this.f22088n = Float.NaN;
        this.f22089o = Float.NaN;
        this.f22090p = Float.NaN;
        e(r4, null);
    }

    public static /* synthetic */ float c(ImageFilterView r02) {
        return r02.f22080f;
    }

    public static /* synthetic */ float d(ImageFilterView r02) {
        return r02.f22081g;
    }

    private void e(Context r6, AttributeSet r7) {
        if (r7 == null) goto L68;
        TypedArray r62 = getContext().obtainStyledAttributes(r7, e.J5);
        int r72 = r62.getIndexCount();
        this.f22078c = r62.getDrawable(e.K5);
        int r1 = 0;
    L4:
        if (r1 >= r72) goto L42;
        int r2 = r62.getIndex(r1);
        if (r2 != e.N5) goto L9;
        this.f22079e = r62.getFloat(r2, 0.0f);
    L41:
        r1 = r1 + 1;
        goto L4
    L9:
        if (r2 != e.W5) goto L12;
        setWarmth(r62.getFloat(r2, 0.0f));
        goto L41
    L12:
        if (r2 != e.V5) goto L15;
        setSaturation(r62.getFloat(r2, 0.0f));
        goto L41
    L15:
        if (r2 != e.M5) goto L18;
        setContrast(r62.getFloat(r2, 0.0f));
        goto L41
    L18:
        if (r2 != e.L5) goto L21;
        setBrightness(r62.getFloat(r2, 0.0f));
        goto L41
    L21:
        if (r2 != e.T5) goto L24;
        setRound(r62.getDimension(r2, 0.0f));
        goto L41
    L24:
        if (r2 != e.U5) goto L27;
        setRoundPercent(r62.getFloat(r2, 0.0f));
        goto L41
    L27:
        if (r2 != e.S5) goto L30;
        setOverlay(r62.getBoolean(r2, this.f22077b));
        goto L41
    L30:
        if (r2 != e.O5) goto L33;
        setImagePanX(r62.getFloat(r2, this.f22087m));
        goto L41
    L33:
        if (r2 != e.P5) goto L36;
        setImagePanY(r62.getFloat(r2, this.f22088n));
        goto L41
    L36:
        if (r2 != e.Q5) goto L39;
        setImageRotate(r62.getFloat(r2, this.f22090p));
        goto L41
    L39:
        if (r2 != e.R5) goto L41;
        setImageZoom(r62.getFloat(r2, this.f22089o));
        goto L41
    L42:
        r62.recycle();
        Drawable r63 = getDrawable();
        this.d = r63;
        if (this.f22078c == null) goto L50;
        if (r63 == null) goto L50;
        Drawable[] r64 = this.f22085k;
        Drawable r73 = getDrawable().mutate();
        this.d = r73;
        r64[0] = r73;
        this.f22085k[1] = this.f22078c.mutate();
        LayerDrawable r65 = new LayerDrawable(this.f22085k);
        this.f22086l = r65;
        r65.getDrawable(1).setAlpha((int) (this.f22079e * 255.0f));
        if (this.f22077b == true) goto L48;
        this.f22086l.getDrawable(0).setAlpha((int) ((1.0f - this.f22079e) * 255.0f));
    L48:
        super.setImageDrawable(this.f22086l);
        return;
    L50:
        Drawable r66 = getDrawable();
        this.d = r66;
        if (r66 == null) goto L69;
        Drawable[] r74 = this.f22085k;
        Drawable r67 = r66.mutate();
        this.d = r67;
        r74[0] = r67;
        return;
    L69:
        return;
    }

    private void f() {
        if (Float.isNaN(this.f22087m) == true) goto L5;
    L11:
        float r1 = 0.0f;
        if (Float.isNaN(this.f22087m) == false) goto L14;
        float r02 = 0.0f;
    L16:
        if (Float.isNaN(this.f22088n) == false) goto L18;
        float r2 = 0.0f;
    L20:
        if (Float.isNaN(this.f22089o) == false) goto L22;
        float r3 = 1.0f;
    L24:
        if (Float.isNaN(this.f22090p) == true) goto L27;
        r1 = this.f22090p;
    L27:
        Matrix r4 = new Matrix();
        r4.reset();
        float r5 = getDrawable().getIntrinsicWidth();
        float r6 = getDrawable().getIntrinsicHeight();
        float r7 = getWidth();
        float r8 = getHeight();
        if ((r5 * r8) >= (r6 * r7)) goto L30;
        float r9 = r7 / r5;
    L31:
        float r32 = r3 * r9;
        r4.postScale(r32, r32);
        float r52 = r5 * r32;
        float r33 = r32 * r6;
        r4.postTranslate((((r02 * (r7 - r52)) + r7) - r52) * 0.5f, (((r2 * (r8 - r33)) + r8) - r33) * 0.5f);
        r4.postRotate(r1, r7 / 2.0f, r8 / 2.0f);
        setImageMatrix(r4);
        setScaleType(ImageView.ScaleType.MATRIX);
        return;
    L30:
        r9 = r8 / r6;
        goto L31
    L22:
        r3 = this.f22089o;
        goto L24
    L18:
        r2 = this.f22088n;
        goto L20
    L14:
        r02 = this.f22087m;
        goto L16
    L5:
        if (Float.isNaN(this.f22088n) == false) goto L11;
        if (Float.isNaN(this.f22089o) == false) goto L11;
        if (Float.isNaN(this.f22090p) == false) goto L11;
    }

    private void g() {
        if (Float.isNaN(this.f22087m) == true) goto L5;
    L12:
        f();
        return;
    L5:
        if (Float.isNaN(this.f22088n) == false) goto L12;
        if (Float.isNaN(this.f22089o) == false) goto L12;
        if (Float.isNaN(this.f22090p) == false) goto L12;
        setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    private void setOverlay(boolean r1) {
        this.f22077b = r1;
    }

    @Override // android.view.View
    public void draw(Canvas r1) {
        super.draw(r1);
    }

    public float getBrightness() {
        return this.f22076a.d;
    }

    public float getContrast() {
        return this.f22076a.f22097f;
    }

    public float getCrossfade() {
        return this.f22079e;
    }

    public float getImagePanX() {
        return this.f22087m;
    }

    public float getImagePanY() {
        return this.f22088n;
    }

    public float getImageRotate() {
        return this.f22090p;
    }

    public float getImageZoom() {
        return this.f22089o;
    }

    public float getRound() {
        return this.f22081g;
    }

    public float getRoundPercent() {
        return this.f22080f;
    }

    public float getSaturation() {
        return this.f22076a.f22096e;
    }

    public float getWarmth() {
        return this.f22076a.f22098g;
    }

    @Override // android.view.View
    public void layout(int r1, int r2, int r3, int r4) {
        super.layout(r1, r2, r3, r4);
        f();
    }

    public void setAltImageResource(int r4) {
        Drawable r42 = androidx.appcompat.content.res.a.b(getContext(), r4).mutate();
        this.f22078c = r42;
        Drawable[] r02 = this.f22085k;
        r02[0] = this.d;
        r02[1] = r42;
        LayerDrawable r43 = new LayerDrawable(this.f22085k);
        this.f22086l = r43;
        super.setImageDrawable(r43);
        setCrossfade(this.f22079e);
    }

    public void setBrightness(float r2) {
        c r02 = this.f22076a;
        r02.d = r2;
        r02.c(this);
    }

    public void setContrast(float r2) {
        c r02 = this.f22076a;
        r02.f22097f = r2;
        r02.c(this);
    }

    public void setCrossfade(float r4) {
        this.f22079e = r4;
        if (this.f22085k != null) goto L5;
        return;
    L5:
        if (this.f22077b == true) goto L7;
        this.f22086l.getDrawable(0).setAlpha((int) ((1.0f - this.f22079e) * 255.0f));
    L7:
        this.f22086l.getDrawable(1).setAlpha((int) (this.f22079e * 255.0f));
        super.setImageDrawable(this.f22086l);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable r3) {
        if (this.f22078c == null) goto L7;
        if (r3 == null) goto L7;
        Drawable r32 = r3.mutate();
        this.d = r32;
        Drawable[] r02 = this.f22085k;
        r02[0] = r32;
        r02[1] = this.f22078c;
        LayerDrawable r33 = new LayerDrawable(this.f22085k);
        this.f22086l = r33;
        super.setImageDrawable(r33);
        setCrossfade(this.f22079e);
        return;
    L7:
        super.setImageDrawable(r3);
    }

    public void setImagePanX(float r1) {
        this.f22087m = r1;
        g();
    }

    public void setImagePanY(float r1) {
        this.f22088n = r1;
        g();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int r3) {
        if (this.f22078c == null) goto L6;
        Drawable r32 = androidx.appcompat.content.res.a.b(getContext(), r3).mutate();
        this.d = r32;
        Drawable[] r02 = this.f22085k;
        r02[0] = r32;
        r02[1] = this.f22078c;
        LayerDrawable r33 = new LayerDrawable(this.f22085k);
        this.f22086l = r33;
        super.setImageDrawable(r33);
        setCrossfade(this.f22079e);
        return;
    L6:
        super.setImageResource(r3);
    }

    public void setImageRotate(float r1) {
        this.f22090p = r1;
        g();
    }

    public void setImageZoom(float r1) {
        this.f22089o = r1;
        g();
    }

    public void setRound(float r5) {
        if (Float.isNaN(r5) == false) goto L7;
        this.f22081g = r5;
        float r52 = this.f22080f;
        this.f22080f = -1.0f;
        setRoundPercent(r52);
        return;
    L7:
        if (this.f22081g == r5) goto L9;
        boolean r02 = true;
    L10:
        this.f22081g = r5;
        if (r5 != 0.0f) goto L13;
        setClipToOutline(false);
    L23:
        if (r02 == false) goto L26;
        invalidateOutline();
        return;
    L26:
        return;
    L13:
        if (this.f22082h != null) goto L16;
        this.f22082h = new Path();
    L16:
        if (this.f22084j != null) goto L19;
        this.f22084j = new RectF();
    L19:
        if (this.f22083i != null) goto L21;
        b r53 = new b(this);
        this.f22083i = r53;
        setOutlineProvider(r53);
    L21:
        setClipToOutline(true);
        this.f22084j.set(0.0f, 0.0f, getWidth(), getHeight());
        this.f22082h.reset();
        Path r54 = this.f22082h;
        RectF r1 = this.f22084j;
        float r2 = this.f22081g;
        r54.addRoundRect(r1, r2, r2, Path.Direction.CW);
        goto L23
    L9:
        r02 = false;
        goto L10
    }

    public void setRoundPercent(float r6) {
        if (this.f22080f == r6) goto L5;
        boolean r02 = true;
    L6:
        this.f22080f = r6;
        if (r6 != 0.0f) goto L9;
        setClipToOutline(false);
    L19:
        if (r02 == false) goto L22;
        invalidateOutline();
        return;
    L22:
        return;
    L9:
        if (this.f22082h != null) goto L12;
        this.f22082h = new Path();
    L12:
        if (this.f22084j != null) goto L15;
        this.f22084j = new RectF();
    L15:
        if (this.f22083i != null) goto L17;
        a r62 = new a(this);
        this.f22083i = r62;
        setOutlineProvider(r62);
    L17:
        setClipToOutline(true);
        int r63 = getWidth();
        int r1 = getHeight();
        float r2 = (Math.min(r63, r1) * this.f22080f) / 2.0f;
        this.f22084j.set(0.0f, 0.0f, r63, r1);
        this.f22082h.reset();
        this.f22082h.addRoundRect(this.f22084j, r2, r2, Path.Direction.CW);
        goto L19
    L5:
        r02 = false;
        goto L6
    }

    public void setSaturation(float r2) {
        c r02 = this.f22076a;
        r02.f22096e = r2;
        r02.c(this);
    }

    public void setWarmth(float r2) {
        c r02 = this.f22076a;
        r02.f22098g = r2;
        r02.c(this);
    }

    public ImageFilterView(Context r3, AttributeSet r4) {
        super(r3, r4);
        this.f22076a = new c();
        this.f22077b = true;
        this.f22078c = null;
        this.d = null;
        this.f22079e = 0.0f;
        this.f22080f = 0.0f;
        this.f22081g = Float.NaN;
        this.f22085k = new Drawable[2];
        this.f22087m = Float.NaN;
        this.f22088n = Float.NaN;
        this.f22089o = Float.NaN;
        this.f22090p = Float.NaN;
        e(r3, r4);
    }

    public ImageFilterView(Context r2, AttributeSet r3, int r4) {
        super(r2, r3, r4);
        this.f22076a = new c();
        this.f22077b = true;
        this.f22078c = null;
        this.d = null;
        this.f22079e = 0.0f;
        this.f22080f = 0.0f;
        this.f22081g = Float.NaN;
        this.f22085k = new Drawable[2];
        this.f22087m = Float.NaN;
        this.f22088n = Float.NaN;
        this.f22089o = Float.NaN;
        this.f22090p = Float.NaN;
        e(r2, r3);
    }
}
