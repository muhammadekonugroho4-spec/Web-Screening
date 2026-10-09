package androidx.transition;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: androidx.transition.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4162i extends ViewGroup implements InterfaceC4159f {

    /* renamed from: a, reason: collision with root package name */
    public ViewGroup f28442a;

    /* renamed from: b, reason: collision with root package name */
    public View f28443b;

    /* renamed from: c, reason: collision with root package name */
    public final View f28444c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public Matrix f28445e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f28446f;

    /* renamed from: androidx.transition.i$a */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C4162i f28447a;

        public a(C4162i r1) {
            this.f28447a = r1;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f28447a.postInvalidateOnAnimation();
            C4162i r02 = this.f28447a;
            ViewGroup r1 = r02.f28442a;
            if (r1 == null) goto L9;
            View r03 = r02.f28443b;
            if (r03 == null) goto L10;
            r1.endViewTransition(r03);
            this.f28447a.f28442a.postInvalidateOnAnimation();
            C4162i r04 = this.f28447a;
            r04.f28442a = null;
            r04.f28443b = null;
            return true;
        L10:
            return true;
        L9:
            return true;
        }
    }

    public C4162i(View r2) {
        super(r2.getContext());
        this.f28446f = new a(this);
        this.f28444c = r2;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    public static C4162i b(View r4, ViewGroup r5, Matrix r6) {
        if ((r4.getParent() instanceof ViewGroup) == false) goto L23;
        C4160g r02 = C4160g.b(r5);
        C4162i r1 = e(r4);
        if (r1 == null) goto L9;
        C4160g r2 = (C4160g) r1.getParent();
        if (r2 == r02) goto L9;
        int r3 = r1.d;
        r2.removeView(r1);
        r1 = null;
    L10:
        if (r1 != null) goto L18;
        if (r6 != null) goto L13;
        r6 = new Matrix();
        c(r4, r5, r6);
    L13:
        r1 = new C4162i(r4);
        r1.h(r6);
        if (r02 != null) goto L16;
        r02 = new C4160g(r5);
    L17:
        d(r5, r02);
        d(r5, r1);
        r02.a(r1);
        r1.d = r3;
    L20:
        r1.d++;
        return r1;
    L16:
        r02.g();
        goto L17
    L18:
        if (r6 == null) goto L20;
        r1.h(r6);
    L9:
        r3 = 0;
        goto L10
    L23:
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    public static void c(View r1, ViewGroup r2, Matrix r3) {
        ViewGroup r12 = (ViewGroup) r1.getParent();
        r3.reset();
        J.h(r12, r3);
        r3.preTranslate(-r12.getScrollX(), -r12.getScrollY());
        J.i(r2, r3);
    }

    public static void d(View r4, View r5) {
        J.e(r5, r5.getLeft(), r5.getTop(), r5.getLeft() + r4.getWidth(), r5.getTop() + r4.getHeight());
    }

    public static C4162i e(View r1) {
        return (C4162i) r1.getTag(AbstractC4168o.f28450a);
    }

    public static void f(View r1) {
        C4162i r12 = e(r1);
        if (r12 == null) goto L8;
        int r02 = r12.d - 1;
        r12.d = r02;
        if (r02 > 0) goto L9;
        ((C4160g) r12.getParent()).removeView(r12);
        return;
    L9:
        return;
    }

    public static void g(View r1, C4162i r2) {
        r1.setTag(AbstractC4168o.f28450a, r2);
    }

    @Override // androidx.transition.InterfaceC4159f
    public void a(ViewGroup r1, View r2) {
        this.f28442a = r1;
        this.f28443b = r2;
    }

    public void h(Matrix r1) {
        this.f28445e = r1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g(this.f28444c, this);
        this.f28444c.getViewTreeObserver().addOnPreDrawListener(this.f28446f);
        J.g(this.f28444c, 4);
        if (this.f28444c.getParent() == null) goto L6;
        ((View) this.f28444c.getParent()).invalidate();
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f28444c.getViewTreeObserver().removeOnPreDrawListener(this.f28446f);
        J.g(this.f28444c, 0);
        g(this.f28444c, null);
        if (this.f28444c.getParent() == null) goto L5;
        ((View) this.f28444c.getParent()).invalidate();
    L5:
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas r5) {
        AbstractC4154a.a(r5, true);
        r5.setMatrix(this.f28445e);
        J.g(this.f28444c, 0);
        this.f28444c.invalidate();
        J.g(this.f28444c, 4);
        drawChild(r5, this.f28444c, getDrawingTime());
        AbstractC4154a.a(r5, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
    }

    @Override // android.view.View, androidx.transition.InterfaceC4159f
    public void setVisibility(int r2) {
        super.setVisibility(r2);
        if (e(this.f28444c) != this) goto L9;
        if (r2 != 0) goto L6;
        int r22 = 4;
    L7:
        J.g(this.f28444c, r22);
        return;
    L6:
        r22 = 0;
        goto L7
    }
}
