package com.stockbit.domain.model.valueobject;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f86752a;

    /* renamed from: b, reason: collision with root package name */
    public final d f86753b;

    /* renamed from: c, reason: collision with root package name */
    public final d f86754c;

    public c(d r1, d r2, d r3) {
        this.f86752a = r1;
        this.f86753b = r2;
        this.f86754c = r3;
    }

    public final d a() {
        return this.f86753b;
    }

    public final d b() {
        return this.f86752a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (kotlin.jvm.internal.p.g(this.f86752a, r52.f86752a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86753b, r52.f86753b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f86754c, r52.f86754c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        d r02 = this.f86752a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        d r2 = this.f86753b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        d r23 = this.f86754c;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "GiphyImage(previewGif=" + this.f86752a + ", fixedHeight=" + this.f86753b + ", fixedWidth=" + this.f86754c + ')';
    }
}
