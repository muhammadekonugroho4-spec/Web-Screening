package com.stockbit.domain.model.entity.withdrawal.multipleaccount;

import com.stockbit.domain.model.type.withdrawal.WithdrawalType;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f83952a;

    /* renamed from: b, reason: collision with root package name */
    public final double f83953b;

    /* renamed from: c, reason: collision with root package name */
    public final WithdrawalType f83954c;

    public a(String r2, double r3, WithdrawalType r5) {
        p.l(r2, "accountNo");
        p.l(r5, "type");
        this.f83952a = r2;
        this.f83953b = r3;
        this.f83954c = r5;
    }

    public final String a() {
        return this.f83952a;
    }

    public final double b() {
        return this.f83953b;
    }

    public final WithdrawalType c() {
        return this.f83954c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f83952a, r82.f83952a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f83953b, r82.f83953b) == 0) goto L15;
        return false;
    L15:
        if (this.f83954c == r82.f83954c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f83952a.hashCode() * 31) + Double.hashCode(this.f83953b)) * 31) + this.f83954c.hashCode();
    }

    public String toString() {
        return "WithdrawalTransactionData(accountNo=" + this.f83952a + ", amount=" + this.f83953b + ", type=" + this.f83954c + ')';
    }
}
