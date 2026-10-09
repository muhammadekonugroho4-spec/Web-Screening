package com.stockbit.feature.order.contract.model;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f100679a;

    /* renamed from: b, reason: collision with root package name */
    public final String f100680b;

    /* renamed from: c, reason: collision with root package name */
    public final String f100681c;

    public c(String r2, String r3, String r4) {
        p.l(r2, "orderId");
        p.l(r3, "companySymbol");
        p.l(r4, "type");
        this.f100679a = r2;
        this.f100680b = r3;
        this.f100681c = r4;
    }

    public final String a() {
        return this.f100680b;
    }

    public final String b() {
        return this.f100679a;
    }

    public final String c() {
        return this.f100681c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f100679a, r52.f100679a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f100680b, r52.f100680b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f100681c, r52.f100681c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f100679a.hashCode() * 31) + this.f100680b.hashCode()) * 31) + this.f100681c.hashCode();
    }

    public String toString() {
        return "OrderDetailNegoNavParam(orderId=" + this.f100679a + ", companySymbol=" + this.f100680b + ", type=" + this.f100681c + ')';
    }
}
