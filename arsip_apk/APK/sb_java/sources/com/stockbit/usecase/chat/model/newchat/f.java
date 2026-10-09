package com.stockbit.usecase.chat.model.newchat;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final b f155591a;

    public f(b r2) {
        p.l(r2, "member");
        this.f155591a = r2;
    }

    public b a() {
        return this.f155591a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof f) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f155591a, ((f) r4).f155591a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f155591a.hashCode();
    }

    public String toString() {
        return "Member(member=" + this.f155591a + ")";
    }
}
