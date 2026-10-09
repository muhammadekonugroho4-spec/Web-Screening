package com.stockbit.domain.model.valueobject.stream;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public String f87138a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87139b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87140c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final e f87141e;

    /* renamed from: f, reason: collision with root package name */
    public String f87142f;

    public d(String r2, String r3, String r4, String r5, e r6, String r7) {
        p.l(r2, "streamId");
        p.l(r3, "symbol");
        p.l(r4, FirebaseAnalytics.Param.PRICE);
        p.l(r5, "companyName");
        p.l(r7, "formattedPrice");
        this.f87138a = r2;
        this.f87139b = r3;
        this.f87140c = r4;
        this.d = r5;
        this.f87141e = r6;
        this.f87142f = r7;
    }

    public final String a() {
        return this.f87142f;
    }

    public final e b() {
        return this.f87141e;
    }

    public final String c() {
        return this.f87140c;
    }

    public final String d() {
        return this.f87139b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f87138a, r52.f87138a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87139b, r52.f87139b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87140c, r52.f87140c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f87141e, r52.f87141e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f87142f, r52.f87142f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        int r02 = ((((((this.f87138a.hashCode() * 31) + this.f87139b.hashCode()) * 31) + this.f87140c.hashCode()) * 31) + this.d.hashCode()) * 31;
        e r1 = this.f87141e;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + this.f87142f.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "SinceMessage(streamId=" + this.f87138a + ", symbol=" + this.f87139b + ", price=" + this.f87140c + ", companyName=" + this.d + ", latest=" + this.f87141e + ", formattedPrice=" + this.f87142f + ')';
    }
}
