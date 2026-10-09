package com.stockbit.domain.model.profile.v2;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f84851a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84852b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84853c;

    public j(boolean r2, String r3, String r4) {
        p.l(r3, "activeSince");
        p.l(r4, "expiredAt");
        this.f84851a = r2;
        this.f84852b = r3;
        this.f84853c = r4;
    }

    public final String a() {
        return this.f84852b;
    }

    public final String b() {
        return this.f84853c;
    }

    public final boolean c() {
        return this.f84851a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (this.f84851a == r52.f84851a) goto L12;
        return false;
    L12:
        if (p.g(this.f84852b, r52.f84852b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84853c, r52.f84853c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f84851a) * 31) + this.f84852b.hashCode()) * 31) + this.f84853c.hashCode();
    }

    public String toString() {
        return "MyProfileProStatusEntity(isPro=" + this.f84851a + ", activeSince=" + this.f84852b + ", expiredAt=" + this.f84853c + ")";
    }
}
