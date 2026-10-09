package com.stockbit.domain.model.chat.message;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f81256a;

    /* renamed from: b, reason: collision with root package name */
    public final List f81257b;

    public a(List r2, List r3) {
        p.l(r2, "roomIds");
        p.l(r3, "messageIds");
        this.f81256a = r2;
        this.f81257b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f81256a, r52.f81256a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81257b, r52.f81257b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81256a.hashCode() * 31) + this.f81257b.hashCode();
    }

    public String toString() {
        return "ForwardMessagesEntity(roomIds=" + this.f81256a + ", messageIds=" + this.f81257b + ")";
    }
}
