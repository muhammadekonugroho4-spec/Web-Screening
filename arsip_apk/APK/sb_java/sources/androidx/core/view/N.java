package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes4.dex */
public final class N implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f23126a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f23127b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f23128c;

    public N(View r1, Runnable r2) {
        this.f23126a = r1;
        this.f23127b = r1.getViewTreeObserver();
        this.f23128c = r2;
    }

    public static N a(View r1, Runnable r2) {
        if (r1 == null) goto L9;
        if (r2 == null) goto L7;
        N r02 = new N(r1, r2);
        r1.getViewTreeObserver().addOnPreDrawListener(r02);
        r1.addOnAttachStateChangeListener(r02);
        return r02;
    L7:
        throw new NullPointerException("runnable == null");
    L9:
        throw new NullPointerException("view == null");
    }

    public void b() {
        if (this.f23127b.isAlive() == false) goto L5;
        this.f23127b.removeOnPreDrawListener(this);
    L6:
        this.f23126a.removeOnAttachStateChangeListener(this);
        return;
    L5:
        this.f23126a.getViewTreeObserver().removeOnPreDrawListener(this);
        goto L6
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f23128c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View r1) {
        this.f23127b = r1.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View r1) {
        b();
    }
}
