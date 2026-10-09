package com.stockbit.domain.model.chat.message;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f81290a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81291b;

    public c(String r2, String r3) {
        p.l(r2, "prev");
        p.l(r3, "next");
        this.f81290a = r2;
        this.f81291b = r3;
    }

    public final String a() {
        return this.f81291b;
    }

    public final String b() {
        return this.f81290a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f81290a, r52.f81290a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81291b, r52.f81291b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81290a.hashCode() * 31) + this.f81291b.hashCode();
    }

    public String toString() {
        return "MessageCursorEntity(prev=" + this.f81290a + ", next=" + this.f81291b + ")";
    }
}
