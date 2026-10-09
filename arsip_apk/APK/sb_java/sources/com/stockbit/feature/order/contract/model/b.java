package com.stockbit.feature.order.contract.model;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f100676a;

    /* renamed from: b, reason: collision with root package name */
    public final String f100677b;

    /* renamed from: c, reason: collision with root package name */
    public final String f100678c;
    public final String d;

    public b(String r2, String r3, String r4, String r5) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "companySymbol");
        p.l(r4, "companyName");
        p.l(r5, "companyIconUrl");
        this.f100676a = r2;
        this.f100677b = r3;
        this.f100678c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f100678c;
    }

    public final String c() {
        return this.f100677b;
    }

    public final String d() {
        return this.f100676a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f100676a, r52.f100676a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f100677b, r52.f100677b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f100678c, r52.f100678c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f100676a.hashCode() * 31) + this.f100677b.hashCode()) * 31) + this.f100678c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "DividendOrderDetailNavParam(id=" + this.f100676a + ", companySymbol=" + this.f100677b + ", companyName=" + this.f100678c + ", companyIconUrl=" + this.d + ')';
    }

    public /* synthetic */ b(String r2, String r3, String r4, String r5, int r6, i r7) {
        if ((r6 & 4) == 0) goto L6;
        r4 = "";
    L6:
        if ((r6 & 8) == 0) goto L8;
        r5 = "";
    L8:
        this(r2, r3, r4, r5);
    }
}
