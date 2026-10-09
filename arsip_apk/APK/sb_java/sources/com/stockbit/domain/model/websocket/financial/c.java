package com.stockbit.domain.model.websocket.financial;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f87250a;

    /* renamed from: b, reason: collision with root package name */
    public final List f87251b;

    /* renamed from: c, reason: collision with root package name */
    public final List f87252c;

    public c(String r2, List r3, List r4) {
        p.l(r2, "symbol");
        p.l(r3, "bids");
        p.l(r4, "asks");
        this.f87250a = r2;
        this.f87251b = r3;
        this.f87252c = r4;
    }

    public final List a() {
        return this.f87252c;
    }

    public final List b() {
        return this.f87251b;
    }

    public final String c() {
        return this.f87250a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f87250a, r52.f87250a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87251b, r52.f87251b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87252c, r52.f87252c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f87250a.hashCode() * 31) + this.f87251b.hashCode()) * 31) + this.f87252c.hashCode();
    }

    public String toString() {
        return "OrderBookV3WebSocketEntity(symbol=" + this.f87250a + ", bids=" + this.f87251b + ", asks=" + this.f87252c + ")";
    }
}
