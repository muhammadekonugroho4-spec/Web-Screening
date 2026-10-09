package com.iab.digitalidentity.sdk.config;

import a.AbstractC2049c;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f40105a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40106b;

    /* renamed from: c, reason: collision with root package name */
    public final ClientEnvironment f40107c;

    public a(String r2, String r3, ClientEnvironment r4) {
        p.l(r2, "userId");
        p.l(r3, "userName");
        p.l(r4, "environment");
        this.f40105a = r2;
        this.f40106b = r3;
        this.f40107c = r4;
    }

    public final ClientEnvironment a() {
        return this.f40107c;
    }

    public final String b() {
        return this.f40105a;
    }

    public final String c() {
        return this.f40106b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f40105a, r52.f40105a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f40106b, r52.f40106b) == true) goto L15;
        return false;
    L15:
        if (this.f40107c == r52.f40107c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = this.f40105a.hashCode() * 31;
        int r03 = AbstractC2049c.a(this.f40106b, r02, 31);
        return this.f40107c.hashCode() + r03;
    }

    public String toString() {
        return "DigitalIdentityClientConfig(userId=" + this.f40105a + ", userName=" + this.f40106b + ", environment=" + this.f40107c + ")";
    }
}
