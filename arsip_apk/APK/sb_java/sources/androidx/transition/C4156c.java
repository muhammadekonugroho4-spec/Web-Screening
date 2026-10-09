package androidx.transition;

import android.animation.TypeEvaluator;

/* renamed from: androidx.transition.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4156c implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public float[] f28415a;

    public C4156c(float[] r1) {
        this.f28415a = r1;
    }

    public float[] a(float r5, float[] r6, float[] r7) {
        float[] r02 = this.f28415a;
        if (r02 != null) goto L5;
        r02 = new float[r6.length];
    L5:
        int r1 = 0;
    L7:
        if (r1 >= r02.length) goto L9;
        float r2 = r6[r1];
        r02[r1] = r2 + ((r7[r1] - r2) * r5);
        r1 = r1 + 1;
        goto L7
    L9:
        return r02;
    }

    @Override // android.animation.TypeEvaluator
    public /* bridge */ /* synthetic */ Object evaluate(float r1, Object r2, Object r3) {
        return a(r1, (float[]) r2, (float[]) r3);
    }
}
