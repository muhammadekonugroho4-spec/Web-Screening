package com.stockbit.domain.model.networkdiagnostic;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f84467a;

    /* renamed from: b, reason: collision with root package name */
    public final List f84468b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84469c;
    public final Long d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f84470e;

    public d(String r2, List r3, String r4, Long r5, Long r6) {
        p.l(r3, "resolvedIps");
        this.f84467a = r2;
        this.f84468b = r3;
        this.f84469c = r4;
        this.d = r5;
        this.f84470e = r6;
    }

    public final String a() {
        return this.f84469c;
    }

    public final String b() {
        return this.f84467a;
    }

    public final Long c() {
        return this.d;
    }

    public final List d() {
        return this.f84468b;
    }

    public final Long e() {
        return this.f84470e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f84467a, r52.f84467a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84468b, r52.f84468b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84469c, r52.f84469c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f84470e, r52.f84470e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        String r02 = this.f84467a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = ((r03 * 31) + this.f84468b.hashCode()) * 31;
        String r2 = this.f84469c;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Long r23 = this.d;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Long r25 = this.f84470e;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
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
        return "DigEntity(domain=" + this.f84467a + ", resolvedIps=" + this.f84468b + ", dnsServer=" + this.f84469c + ", queryTimeMs=" + this.d + ", ttl=" + this.f84470e + ")";
    }
}
