package com.stockbit.domain.model.chat.room;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f81343a;

    public f(String r2) {
        p.l(r2, "memberDescription");
        this.f81343a = r2;
    }

    public final String a() {
        return this.f81343a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof f) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f81343a, ((f) r4).f81343a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f81343a.hashCode();
    }

    public String toString() {
        return "RoomGroupEntity(memberDescription=" + this.f81343a + ")";
    }
}
