package com.stockbit.lib.trackerwrapper.render;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class c implements ViewTreeObserver.OnDrawListener {

    /* renamed from: e, reason: collision with root package name */
    public static final a f120585e = null;

    /* renamed from: a, reason: collision with root package name */
    public final View f120586a;

    /* renamed from: b, reason: collision with root package name */
    public final b f120587b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f120588c;
    public boolean d;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final c a(View r3, b r4) {
            p.l(r3, "view");
            p.l(r4, "firstDrawCallback");
            return new c(r3, r4, null);
        }

        public a() {
        }
    }

    public interface b {
        void a();

        void b();
    }

    /* renamed from: com.stockbit.lib.trackerwrapper.render.c$c, reason: collision with other inner class name */
    public static final class ViewOnAttachStateChangeListenerC1049c implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f120589a;

        public ViewOnAttachStateChangeListenerC1049c(c r1) {
            this.f120589a = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View r2) {
            p.l(r2, "v");
            if (c.c(this.f120589a).getViewTreeObserver().isAlive() == false) goto L5;
            c.c(this.f120589a).getViewTreeObserver().addOnDrawListener(this.f120589a);
        L5:
            c.c(this.f120589a).removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View r2) {
            p.l(r2, "v");
        }
    }

    static {
        f120585e = new a(null);
    }

    public /* synthetic */ c(View r1, b r2, i r3) {
        this(r1, r2);
    }

    public static /* synthetic */ void a(c r02) {
        e(r02);
    }

    public static /* synthetic */ void b(c r02) {
        d(r02);
    }

    public static final /* synthetic */ View c(c r02) {
        return r02.f120586a;
    }

    public static final void d(c r02) {
        r02.f120587b.a();
    }

    public static final void e(c r1) {
        if (r1.f120586a.getViewTreeObserver().isAlive() == false) goto L6;
        r1.f120586a.getViewTreeObserver().removeOnDrawListener(r1);
        return;
    }

    public final void f() {
        if (this.f120586a.getViewTreeObserver().isAlive() == true) goto L5;
    L8:
        this.f120586a.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1049c(this));
        return;
    L5:
        if (this.f120586a.isAttachedToWindow() == false) goto L8;
        this.f120586a.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        if (this.d == true) goto L6;
        this.d = true;
        this.f120587b.b();
        this.f120588c.postAtFrontOfQueue(new com.stockbit.lib.trackerwrapper.render.a(this));
        this.f120588c.post(new com.stockbit.lib.trackerwrapper.render.b(this));
        return;
    }

    public c(View r1, b r2) {
        this.f120586a = r1;
        this.f120587b = r2;
        this.f120588c = new Handler(Looper.getMainLooper());
        f();
    }
}
