package com.stockbit.usecase.chat.model.stream;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f155677a;

    /* renamed from: b, reason: collision with root package name */
    public final b f155678b;

    /* renamed from: c, reason: collision with root package name */
    public final String f155679c;

    public c(String r1, b r2, String r3) {
        this.f155677a = r1;
        this.f155678b = r2;
        this.f155679c = r3;
    }

    public final b a() {
        return this.f155678b;
    }

    public final String b() {
        return this.f155677a;
    }

    public final String c() {
        return this.f155679c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f155677a, r52.f155677a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f155678b, r52.f155678b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f155679c, r52.f155679c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f155677a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        b r2 = this.f155678b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f155679c;
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
        return "HtmlMetaDataUIState(tag=" + this.f155677a + ", attr=" + this.f155678b + ", text=" + this.f155679c + ")";
    }
}
