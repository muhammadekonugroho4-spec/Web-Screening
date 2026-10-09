package com.stockbit.domain.model.auth;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f80635a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80636b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80637c;

    public b(String r1, String r2, String r3) {
        this.f80635a = r1;
        this.f80636b = r2;
        this.f80637c = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f80635a, r52.f80635a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80636b, r52.f80636b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80637c, r52.f80637c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f80635a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f80636b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f80637c;
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
        return "ChangeSendPinOtpEntity(target=" + this.f80635a + ", channel=" + this.f80636b + ", nextAttemptTime=" + this.f80637c + ")";
    }
}
