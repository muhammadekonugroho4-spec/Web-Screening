package com.stockbit.domain.model.calendar;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f80984a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80985b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80986c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f80987e;

    /* renamed from: f, reason: collision with root package name */
    public final e f80988f;

    /* renamed from: g, reason: collision with root package name */
    public final String f80989g;

    public d(String r2, String r3, String r4, String r5, String r6, e r7, String r8) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "companySymbol");
        p.l(r4, "companyName");
        p.l(r5, "listingDate");
        p.l(r6, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        p.l(r7, "detail");
        p.l(r8, "created");
        this.f80984a = r2;
        this.f80985b = r3;
        this.f80986c = r4;
        this.d = r5;
        this.f80987e = r6;
        this.f80988f = r7;
        this.f80989g = r8;
    }

    public final String a() {
        return this.f80986c;
    }

    public final String b() {
        return this.f80985b;
    }

    public final e c() {
        return this.f80988f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f80984a, r52.f80984a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80985b, r52.f80985b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80986c, r52.f80986c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f80987e, r52.f80987e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f80988f, r52.f80988f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f80989g, r52.f80989g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        return (((((((((((this.f80984a.hashCode() * 31) + this.f80985b.hashCode()) * 31) + this.f80986c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f80987e.hashCode()) * 31) + this.f80988f.hashCode()) * 31) + this.f80989g.hashCode();
    }

    public String toString() {
        return "CalendarIpoEntity(id=" + this.f80984a + ", companySymbol=" + this.f80985b + ", companyName=" + this.f80986c + ", listingDate=" + this.d + ", data=" + this.f80987e + ", detail=" + this.f80988f + ", created=" + this.f80989g + ")";
    }
}
