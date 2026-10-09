package I0;

import android.animation.Animator;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final class j implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FunctionReferenceImpl f876a;

    /* JADX WARN: Multi-variable type inference failed */
    public j(kotlin.jvm.functions.a r1) {
        this.f876a = (FunctionReferenceImpl) r1;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator r2) {
        kotlin.jvm.internal.p.l(r2, "animation");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.a, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r2) {
        kotlin.jvm.internal.p.l(r2, "animation");
        this.f876a.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator r2) {
        kotlin.jvm.internal.p.l(r2, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r2) {
        kotlin.jvm.internal.p.l(r2, "animation");
    }
}
