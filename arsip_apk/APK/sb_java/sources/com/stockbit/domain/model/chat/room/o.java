package com.stockbit.domain.model.chat.room;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f81370a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81371b;

    public o(int r2, String r3) {
        p.l(r3, "lastId");
        this.f81370a = r2;
        this.f81371b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof o) == true) goto L8;
        return false;
    L8:
        o r52 = (o) r5;
        if (this.f81370a == r52.f81370a) goto L12;
        return false;
    L12:
        if (p.g(this.f81371b, r52.f81371b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f81370a) * 31) + this.f81371b.hashCode();
    }

    public String toString() {
        return "UnreadMessageEntity(total=" + this.f81370a + ", lastId=" + this.f81371b + ")";
    }
}
