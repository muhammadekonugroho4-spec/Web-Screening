package com.stockbit.domain.model.trusteddevice;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f86146a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86147b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86148c;

    public j(String r2, String r3, String r4) {
        p.l(r2, "target");
        p.l(r3, "promptToken");
        p.l(r4, "nextAttemptTime");
        this.f86146a = r2;
        this.f86147b = r3;
        this.f86148c = r4;
    }

    public final String a() {
        return this.f86148c;
    }

    public final String b() {
        return this.f86147b;
    }

    public final String c() {
        return this.f86146a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (p.g(this.f86146a, r52.f86146a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86147b, r52.f86147b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86148c, r52.f86148c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f86146a.hashCode() * 31) + this.f86147b.hashCode()) * 31) + this.f86148c.hashCode();
    }

    public String toString() {
        return "SendPromptTrustedDeviceEntity(target=" + this.f86146a + ", promptToken=" + this.f86147b + ", nextAttemptTime=" + this.f86148c + ")";
    }
}
