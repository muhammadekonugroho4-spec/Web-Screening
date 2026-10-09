package com.stockbit.domain.model.chat.group;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f81248a;

    public s(String r2) {
        kotlin.jvm.internal.p.l(r2, "invitationCode");
        this.f81248a = r2;
    }

    public final String a() {
        return this.f81248a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof s) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f81248a, ((s) r4).f81248a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f81248a.hashCode();
    }

    public String toString() {
        return "PublicGroupAttributeEntity(invitationCode=" + this.f81248a + ")";
    }
}
