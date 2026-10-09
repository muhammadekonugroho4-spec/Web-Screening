package com.stockbit.domain.model.valueobject.securities;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f86992a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f86993b;

    /* renamed from: c, reason: collision with root package name */
    public final OcrResult f86994c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f86995e;

    public a(Boolean r1, Boolean r2, OcrResult r3, String r4, String r5) {
        this.f86992a = r1;
        this.f86993b = r2;
        this.f86994c = r3;
        this.d = r4;
        this.f86995e = r5;
    }

    public final String a() {
        return this.d;
    }

    public final OcrResult b() {
        return this.f86994c;
    }

    public final String c() {
        return this.f86995e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f86992a, r52.f86992a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86993b, r52.f86993b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86994c, r52.f86994c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f86995e, r52.f86995e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.f86992a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Boolean r2 = this.f86993b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        OcrResult r23 = this.f86994c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f86995e;
        if (r27 == null) goto L23;
        r1 = r27.hashCode();
    L23:
        return r07 + r1;
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "FormSubmitResult(status=" + this.f86992a + ", saved=" + this.f86993b + ", ocrResult=" + this.f86994c + ", lastState=" + this.d + ", url=" + this.f86995e + ')';
    }
}
