package com.airbnb.lottie.utils;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes4.dex */
public abstract class a extends ValueAnimator {

    /* renamed from: a, reason: collision with root package name */
    public final Set f31611a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f31612b;

    public a() {
        this.f31611a = new CopyOnWriteArraySet();
        this.f31612b = new CopyOnWriteArraySet();
    }

    public void a() {
        Iterator r02 = this.f31612b.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((Animator.AnimatorListener) r02.next()).onAnimationCancel(this);
        goto L4
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener r2) {
        this.f31612b.add(r2);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener r2) {
        this.f31611a.add(r2);
    }

    public void b(boolean r3) {
        Iterator r02 = this.f31612b.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((Animator.AnimatorListener) r02.next()).onAnimationEnd(this, r3);
        goto L4
    }

    public void c() {
        Iterator r02 = this.f31612b.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((Animator.AnimatorListener) r02.next()).onAnimationRepeat(this);
        goto L4
    }

    public void e(boolean r3) {
        Iterator r02 = this.f31612b.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((Animator.AnimatorListener) r02.next()).onAnimationStart(this, r3);
        goto L4
    }

    public void g() {
        Iterator r02 = this.f31611a.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((ValueAnimator.AnimatorUpdateListener) r02.next()).onAnimationUpdate(this);
        goto L4
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f31612b.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f31611a.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener r2) {
        this.f31612b.remove(r2);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener r2) {
        this.f31611a.remove(r2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public /* bridge */ /* synthetic */ Animator setDuration(long r1) {
        return setDuration(r1);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator r2) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long r1) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long r1) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
