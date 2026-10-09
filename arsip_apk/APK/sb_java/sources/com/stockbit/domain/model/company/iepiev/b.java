package com.stockbit.domain.model.company.iepiev;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f81560a;

    /* renamed from: b, reason: collision with root package name */
    public final d f81561b;

    /* renamed from: c, reason: collision with root package name */
    public final d f81562c;
    public final c d;

    /* renamed from: e, reason: collision with root package name */
    public final a f81563e;

    /* renamed from: f, reason: collision with root package name */
    public final int f81564f;

    public b(String r2, d r3, d r4, c r5, a r6, int r7) {
        p.l(r2, NotificationCompat.CATEGORY_STATUS);
        this.f81560a = r2;
        this.f81561b = r3;
        this.f81562c = r4;
        this.d = r5;
        this.f81563e = r6;
        this.f81564f = r7;
    }

    public final a a() {
        return this.f81563e;
    }

    public final d b() {
        return this.f81561b;
    }

    public final c c() {
        return this.d;
    }

    public final d d() {
        return this.f81562c;
    }

    public final String e() {
        return this.f81560a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f81560a, r52.f81560a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81561b, r52.f81561b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81562c, r52.f81562c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81563e, r52.f81563e) == true) goto L24;
        return false;
    L24:
        if (this.f81564f == r52.f81564f) goto L26;
        return false;
    L26:
        return true;
    }

    public final int f() {
        return this.f81564f;
    }

    public int hashCode() {
        int r02 = this.f81560a.hashCode() * 31;
        d r1 = this.f81561b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        d r13 = this.f81562c;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        c r15 = this.d;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        a r17 = this.f81563e;
        if (r17 == null) goto L19;
        r2 = r17.hashCode();
    L19:
        return ((r05 + r2) * 31) + Integer.hashCode(this.f81564f);
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "CompanyIepIevEntity(status=" + this.f81560a + ", iep=" + this.f81561b + ", iev=" + this.f81562c + ", iepChanges=" + this.d + ", bestBidOffer=" + this.f81563e + ", timeLeftSeconds=" + this.f81564f + ")";
    }
}
