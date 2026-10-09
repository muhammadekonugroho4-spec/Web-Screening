package com.stockbit.domain.model.changephone;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f81162a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81163b;

    public a(String r2, String r3) {
        p.l(r2, "channel");
        p.l(r3, "target");
        this.f81162a = r2;
        this.f81163b = r3;
    }

    public final String a() {
        return this.f81162a;
    }

    public final String b() {
        return this.f81163b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f81162a, r52.f81162a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81163b, r52.f81163b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81162a.hashCode() * 31) + this.f81163b.hashCode();
    }

    public String toString() {
        return "ChangePhoneChannelEntity(channel=" + this.f81162a + ", target=" + this.f81163b + ")";
    }
}
