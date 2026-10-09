package com.stockbit.domain.model.securities.history.detail;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f85276a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85277b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85278c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final b f85279e;

    public d(String r2, String r3, String r4, String r5, b r6) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, Constants.KEY_DATE);
        p.l(r4, "command");
        p.l(r5, "symbol");
        p.l(r6, "actionDetail");
        this.f85276a = r2;
        this.f85277b = r3;
        this.f85278c = r4;
        this.d = r5;
        this.f85279e = r6;
    }

    public final b a() {
        return this.f85279e;
    }

    public final String b() {
        return this.f85278c;
    }

    public final String c() {
        return this.f85276a;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f85276a, r52.f85276a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85277b, r52.f85277b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85278c, r52.f85278c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f85279e, r52.f85279e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f85276a.hashCode() * 31) + this.f85277b.hashCode()) * 31) + this.f85278c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85279e.hashCode();
    }

    public String toString() {
        return "HistoryDetailEntity(id=" + this.f85276a + ", date=" + this.f85277b + ", command=" + this.f85278c + ", symbol=" + this.d + ", actionDetail=" + this.f85279e + ")";
    }
}
