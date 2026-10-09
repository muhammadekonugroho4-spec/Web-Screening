package com.stockbit.domain.param.chat;

import com.stockbit.domain.model.chat.room.ReceiverType;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f87386a;

    /* renamed from: b, reason: collision with root package name */
    public final ReceiverType f87387b;

    public a(int r2, ReceiverType r3) {
        p.l(r3, "type");
        this.f87386a = r2;
        this.f87387b = r3;
    }

    public final int a() {
        return this.f87386a;
    }

    public final ReceiverType b() {
        return this.f87387b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f87386a == r52.f87386a) goto L12;
        return false;
    L12:
        if (this.f87387b == r52.f87387b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f87386a) * 31) + this.f87387b.hashCode();
    }

    public String toString() {
        return "ReceiverDomainParam(id=" + this.f87386a + ", type=" + this.f87387b + ")";
    }
}
