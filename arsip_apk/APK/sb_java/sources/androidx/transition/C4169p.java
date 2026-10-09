package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: androidx.transition.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4169p implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public Rect f28459a;

    public C4169p() {
    }

    public Rect a(float r5, Rect r6, Rect r7) {
        int r02 = r6.left + ((int) ((r7.left - r0) * r5));
        int r1 = r6.top + ((int) ((r7.top - r1) * r5));
        int r2 = r6.right + ((int) ((r7.right - r2) * r5));
        int r62 = r6.bottom + ((int) ((r7.bottom - r6) * r5));
        Rect r52 = this.f28459a;
        if (r52 == null) goto L5;
        r52.set(r02, r1, r2, r62);
        return this.f28459a;
    L5:
        return new Rect(r02, r1, r2, r62);
    }

    @Override // android.animation.TypeEvaluator
    public /* bridge */ /* synthetic */ Object evaluate(float r1, Object r2, Object r3) {
        return a(r1, (Rect) r2, (Rect) r3);
    }

    public C4169p(Rect r1) {
        this.f28459a = r1;
    }
}
