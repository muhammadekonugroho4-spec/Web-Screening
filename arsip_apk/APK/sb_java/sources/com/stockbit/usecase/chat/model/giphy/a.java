package com.stockbit.usecase.chat.model.giphy;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f155513a;

    /* renamed from: b, reason: collision with root package name */
    public final b f155514b;

    /* renamed from: c, reason: collision with root package name */
    public final b f155515c;

    public a(b r1, b r2, b r3) {
        this.f155513a = r1;
        this.f155514b = r2;
        this.f155515c = r3;
    }

    public final b a() {
        return this.f155515c;
    }

    public final b b() {
        return this.f155513a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f155513a, r52.f155513a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f155514b, r52.f155514b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f155515c, r52.f155515c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        b r02 = this.f155513a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        b r2 = this.f155514b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        b r23 = this.f155515c;
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
        return "GiphyImage(previewGif=" + this.f155513a + ", fixedHeight=" + this.f155514b + ", fixedWidth=" + this.f155515c + ")";
    }
}
