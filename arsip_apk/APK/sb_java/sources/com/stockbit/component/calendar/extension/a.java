package com.stockbit.component.calendar.extension;

import android.view.View;
import android.view.animation.Animation;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: com.stockbit.component.calendar.extension.a$a, reason: collision with other inner class name */
    public static final class AnimationAnimationListenerC0698a implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.functions.a f69609a;

        public AnimationAnimationListenerC0698a(kotlin.jvm.functions.a r1) {
            this.f69609a = r1;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation r1) {
            this.f69609a.invoke();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation r1) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation r1) {
        }
    }

    public static final void a(View r1, Animation r2, kotlin.jvm.functions.a r3) {
        p.l(r1, "<this>");
        p.l(r2, "anim");
        p.l(r3, "onAnimationEnd");
        r2.setAnimationListener(new AnimationAnimationListenerC0698a(r3));
        r1.startAnimation(r2);
    }
}
