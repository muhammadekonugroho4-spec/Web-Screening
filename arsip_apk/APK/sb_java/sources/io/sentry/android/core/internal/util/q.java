package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.android.core.C11511b0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class q implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f175512a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f175513b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f175514c;

    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f175515a;

        public a(q r1) {
            this.f175515a = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View r3) {
            r3.getViewTreeObserver().addOnDrawListener(this.f175515a);
            r3.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View r1) {
            r1.removeOnAttachStateChangeListener(this);
        }
    }

    public q(View r3, Runnable r4) {
        this.f175512a = new Handler(Looper.getMainLooper());
        this.f175513b = new AtomicReference(r3);
        this.f175514c = r4;
    }

    public static /* synthetic */ void a(q r02, View r1) {
        r02.getClass();
        r1.getViewTreeObserver().removeOnDrawListener(r02);
    }

    public static /* synthetic */ void b(Window r1, Window.Callback r2, Runnable r3, C11511b0 r4) {
        View r02 = r1.peekDecorView();
        if (r02 == null) goto L6;
        r1.setCallback(r2);
        e(r02, r3, r4);
        return;
    }

    public static boolean c(View r1) {
        if (r1.getViewTreeObserver().isAlive() == true) goto L5;
        return false;
    L5:
        if (r1.isAttachedToWindow() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static void d(Activity r4, final Runnable r5, final C11511b0 r6) {
        final Window r42 = r4.getWindow();
        if (r42 == null) goto L14;
        View r02 = r42.peekDecorView();
        if (r02 == null) goto L8;
        e(r02, r5, r6);
        return;
    L8:
        final Window.Callback r03 = r42.getCallback();
        if (r03 == null) goto L11;
        Window.Callback r2 = r03;
    L12:
        r42.setCallback(new io.sentry.android.core.performance.l(r2, new o(r42, r03, r5, r6)));
        return;
    L11:
        r2 = new io.sentry.android.core.internal.gestures.b();
        goto L12
    }

    public static void e(View r1, Runnable r2, C11511b0 r3) {
        q r02 = new q(r1, r2);
        if (r3.d() < 26) goto L5;
    L8:
        r1.getViewTreeObserver().addOnDrawListener(r02);
        return;
    L5:
        if (c(r1) == true) goto L8;
        r1.addOnAttachStateChangeListener(new a(r02));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View r02 = (View) this.f175513b.getAndSet(null);
        if (r02 != null) goto L5;
        return;
    L5:
        r02.getViewTreeObserver().addOnGlobalLayoutListener(new p(this, r02));
        this.f175512a.postAtFrontOfQueue(this.f175514c);
    }
}
