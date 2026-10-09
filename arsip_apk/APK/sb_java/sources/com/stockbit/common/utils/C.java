package com.stockbit.common.utils;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* loaded from: classes7.dex */
public final class C extends PopupWindow implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f61879a;

    /* renamed from: b, reason: collision with root package name */
    public final View f61880b;

    /* renamed from: c, reason: collision with root package name */
    public a f61881c;
    public int d;

    public interface a {
        void a(int r1);

        void b();
    }

    static {
    }

    public C(Activity r2) {
        kotlin.jvm.internal.p.l(r2, "mActivity");
        super(r2);
        this.f61879a = r2;
        View r02 = new View(r2);
        this.f61880b = r02;
        setContentView(r02);
        r02.getViewTreeObserver().addOnGlobalLayoutListener(this);
        setBackgroundDrawable(new ColorDrawable(0));
        setWidth(0);
        setHeight(-1);
        setSoftInputMode(16);
        setInputMethodMode(1);
    }

    public static /* synthetic */ void a(C r02, View r1) {
        c(r02, r1);
    }

    public static final void c(C r1, View r2) {
        if (r1.f61879a.isFinishing() == false) goto L5;
        return;
    L5:
        if (r1.f61879a.isDestroyed() == true) goto L9;
        r1.showAtLocation(r2, 0, 0, 0);
        return;
    }

    public final C b() {
        if (isShowing() == false) goto L5;
    L9:
        return this;
    L5:
        if (this.f61879a.isFinishing() == true) goto L9;
        if (this.f61879a.isDestroyed() == true) goto L9;
        final View r02 = this.f61879a.getWindow().getDecorView();
        kotlin.jvm.internal.p.k(r02, "getDecorView(...)");
        r02.post(new B(this, r02));
        goto L9
    }

    public final void d(a r1) {
        this.f61881c = r1;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        Rect r02 = new Rect();
        this.f61880b.getWindowVisibleDisplayFrame(r02);
        int r03 = r02.bottom;
        if (r03 <= this.d) goto L5;
        this.d = r03;
    L5:
        int r1 = this.d - r03;
        a r04 = this.f61881c;
        if (r04 == null) goto L12;
        if (r1 <= 0) goto L10;
        r04.a(r1);
        return;
    L10:
        r04.b();
        return;
    }
}
