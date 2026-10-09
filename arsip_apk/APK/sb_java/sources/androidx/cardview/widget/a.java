package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* loaded from: classes.dex */
public class a implements c {
    public a() {
    }

    @Override // androidx.cardview.widget.c
    public float a(b r1) {
        return p(r1).getRadius();
    }

    @Override // androidx.cardview.widget.c
    public float b(b r1) {
        return p(r1).getPadding();
    }

    @Override // androidx.cardview.widget.c
    public float c(b r2) {
        return a(r2) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public float d(b r1) {
        return r1.e().getElevation();
    }

    @Override // androidx.cardview.widget.c
    public void e(b r5) {
        if (r5.a() == true) goto L6;
        r5.setShadowPadding(0, 0, 0, 0);
        return;
    L6:
        float r02 = b(r5);
        float r1 = a(r5);
        int r2 = (int) Math.ceil(d.a(r02, r1, r5.d()));
        int r03 = (int) Math.ceil(d.b(r02, r1, r5.d()));
        r5.setShadowPadding(r2, r03, r2, r03);
    }

    @Override // androidx.cardview.widget.c
    public float f(b r2) {
        return a(r2) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public void g(b r4, float r5) {
        p(r4).setPadding(r5, r4.a(), r4.d());
        e(r4);
    }

    @Override // androidx.cardview.widget.c
    public void h(b r1, float r2) {
        p(r1).setRadius(r2);
    }

    @Override // androidx.cardview.widget.c
    public void i(b r1, float r2) {
        r1.e().setElevation(r2);
    }

    @Override // androidx.cardview.widget.c
    public ColorStateList j(b r1) {
        return p(r1).getColor();
    }

    @Override // androidx.cardview.widget.c
    public void k(b r2) {
        g(r2, b(r2));
    }

    @Override // androidx.cardview.widget.c
    public void l(b r1, Context r2, ColorStateList r3, float r4, float r5, float r6) {
        r1.b(new RoundRectDrawable(r3, r4));
        View r22 = r1.e();
        r22.setClipToOutline(true);
        r22.setElevation(r5);
        g(r1, r6);
    }

    @Override // androidx.cardview.widget.c
    public void m(b r2) {
        g(r2, b(r2));
    }

    @Override // androidx.cardview.widget.c
    public void n() {
    }

    @Override // androidx.cardview.widget.c
    public void o(b r1, ColorStateList r2) {
        p(r1).setColor(r2);
    }

    public final RoundRectDrawable p(b r1) {
        return (RoundRectDrawable) r1.c();
    }
}
