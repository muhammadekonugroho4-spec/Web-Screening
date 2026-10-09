package com.stockbit.domain.model.stream.emojireaction;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f85837a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85838b;

    public c(String r2, int r3) {
        p.l(r2, "reaction");
        this.f85837a = r2;
        this.f85838b = r3;
    }

    public final String a() {
        return this.f85837a;
    }

    public final int b() {
        return this.f85838b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f85837a, r52.f85837a) == true) goto L12;
        return false;
    L12:
        if (this.f85838b == r52.f85838b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85837a.hashCode() * 31) + Integer.hashCode(this.f85838b);
    }

    public String toString() {
        return "StreamReactionAggregateItemEntity(reaction=" + this.f85837a + ", total=" + this.f85838b + ")";
    }
}
