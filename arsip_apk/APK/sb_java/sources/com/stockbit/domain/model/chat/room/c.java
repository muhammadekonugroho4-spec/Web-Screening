package com.stockbit.domain.model.chat.room;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f81330a;

    public c(List r2) {
        p.l(r2, "receivers");
        this.f81330a = r2;
    }

    public final List a() {
        return this.f81330a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f81330a, ((c) r4).f81330a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f81330a.hashCode();
    }

    public String toString() {
        return "ReceiversRoomEntity(receivers=" + this.f81330a + ")";
    }
}
