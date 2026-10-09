package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3887n0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f23307a;

    /* renamed from: androidx.core.view.n0$a */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3889o0 f23308a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f23309b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C3887n0 f23310c;

        public a(C3887n0 r1, InterfaceC3889o0 r2, View r3) {
            this.f23310c = r1;
            this.f23308a = r2;
            this.f23309b = r3;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator r2) {
            this.f23308a.a(this.f23309b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator r2) {
            this.f23308a.b(this.f23309b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator r2) {
            this.f23308a.c(this.f23309b);
        }
    }

    public C3887n0(View r2) {
        this.f23307a = new WeakReference(r2);
    }

    public static /* synthetic */ void a(InterfaceC3893q0 r02, View r1, ValueAnimator r2) {
        r02.a(r1);
    }

    public C3887n0 b(float r2) {
        View r02 = (View) this.f23307a.get();
        if (r02 == null) goto L5;
        r02.animate().alpha(r2);
    L5:
        return this;
    }

    public void c() {
        View r02 = (View) this.f23307a.get();
        if (r02 == null) goto L6;
        r02.animate().cancel();
        return;
    }

    public long d() {
        View r02 = (View) this.f23307a.get();
        if (r02 != null) goto L5;
        return 0;
    L5:
        return r02.animate().getDuration();
    }

    public C3887n0 e(long r2) {
        View r02 = (View) this.f23307a.get();
        if (r02 == null) goto L5;
        r02.animate().setDuration(r2);
    L5:
        return this;
    }

    public C3887n0 f(Interpolator r2) {
        View r02 = (View) this.f23307a.get();
        if (r02 == null) goto L5;
        r02.animate().setInterpolator(r2);
    L5:
        return this;
    }

    public C3887n0 g(InterfaceC3889o0 r2) {
        View r02 = (View) this.f23307a.get();
        if (r02 == null) goto L5;
        h(r02, r2);
    L5:
        return this;
    }

    public final void h(View r3, InterfaceC3889o0 r4) {
        if (r4 == null) goto L5;
        r3.animate().setListener(new a(this, r4, r3));
        return;
    L5:
        r3.animate().setListener(null);
    }

    public C3887n0 i(long r2) {
        View r02 = (View) this.f23307a.get();
        if (r02 == null) goto L5;
        r02.animate().setStartDelay(r2);
    L5:
        return this;
    }

    public C3887n0 j(final InterfaceC3893q0 r3) {
        final View r02 = (View) this.f23307a.get();
        if (r02 == null) goto L8;
        if (r3 == null) goto L6;
        ValueAnimator.AnimatorUpdateListener r1 = new C3885m0(r3, r02);
    L7:
        r02.animate().setUpdateListener(r1);
        goto L8
    L6:
        r1 = null;
    L8:
        return this;
    }

    public void k() {
        View r02 = (View) this.f23307a.get();
        if (r02 == null) goto L6;
        r02.animate().start();
        return;
    }

    public C3887n0 l(float r2) {
        View r02 = (View) this.f23307a.get();
        if (r02 == null) goto L5;
        r02.animate().translationY(r2);
    L5:
        return this;
    }
}
