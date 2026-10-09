package com.stockbit.domain.model.valueobject.tipping;

import java.util.HashMap;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f87186a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87187b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f87188c;

    public a(String r2, String r3, HashMap r4) {
        p.l(r2, "avatar");
        p.l(r3, "message");
        this.f87186a = r2;
        this.f87187b = r3;
        this.f87188c = r4;
    }

    public final String a() {
        return this.f87186a;
    }

    public final HashMap b() {
        return this.f87188c;
    }

    public final String c() {
        return this.f87187b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f87186a, r52.f87186a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87187b, r52.f87187b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87188c, r52.f87188c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f87186a.hashCode() * 31) + this.f87187b.hashCode()) * 31;
        HashMap r1 = this.f87188c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "TippingActivityDetailData(avatar=" + this.f87186a + ", message=" + this.f87187b + ", maskHtml=" + this.f87188c + ')';
    }
}
