package com.stockbit.domain.model.chat.group;

/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f81249a;

    public t(String r2) {
        kotlin.jvm.internal.p.l(r2, "url");
        this.f81249a = r2;
    }

    public final String a() {
        return this.f81249a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof t) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f81249a, ((t) r4).f81249a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f81249a.hashCode();
    }

    public String toString() {
        return "ResetInvitationLinkEntity(url=" + this.f81249a + ")";
    }
}
