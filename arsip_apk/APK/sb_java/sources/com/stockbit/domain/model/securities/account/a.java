package com.stockbit.domain.model.securities.account;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final AccountType f85010a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85011b;

    public a(AccountType r2, String r3) {
        p.l(r2, "type");
        p.l(r3, "number");
        this.f85010a = r2;
        this.f85011b = r3;
    }

    public final String a() {
        return this.f85011b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f85010a == r52.f85010a) goto L12;
        return false;
    L12:
        if (p.g(this.f85011b, r52.f85011b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85010a.hashCode() * 31) + this.f85011b.hashCode();
    }

    public String toString() {
        return "AuthTokenAccountEntity(type=" + this.f85010a + ", number=" + this.f85011b + ")";
    }

    public /* synthetic */ a(AccountType r1, String r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = AccountType.ACCOUNT_TYPE_UNSPECIFIED;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = "";
    L8:
        this(r1, r2);
    }
}
