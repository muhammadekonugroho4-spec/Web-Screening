package com.airbnb.lottie.model.content;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f31312a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f31313b;

    public d(float[] r1, int[] r2) {
        this.f31312a = r1;
        this.f31313b = r2;
    }

    public int[] a() {
        return this.f31313b;
    }

    public float[] b() {
        return this.f31312a;
    }

    public int c() {
        return this.f31313b.length;
    }

    public void d(d r5, d r6, float r7) {
        if (r5.f31313b.length != r6.f31313b.length) goto L10;
        int r02 = 0;
    L6:
        if (r02 >= r5.f31313b.length) goto L8;
        this.f31312a[r02] = com.airbnb.lottie.utils.g.k(r5.f31312a[r02], r6.f31312a[r02], r7);
        this.f31313b[r02] = com.airbnb.lottie.utils.b.c(r7, r5.f31313b[r02], r6.f31313b[r02]);
        r02 = r02 + 1;
        goto L6
    L8:
        return;
    L10:
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + r5.f31313b.length + " vs " + r6.f31313b.length + ")");
    }
}
