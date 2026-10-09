package com.stockbit.usecase.cryptowithdrawal.contract.entity;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f157491a;

    public a(String r2) {
        p.l(r2, Constants.KEY_ID);
        this.f157491a = r2;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f157491a, ((a) r4).f157491a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f157491a.hashCode();
    }

    public String toString() {
        return "CryptoCashoutEntity(id=" + this.f157491a + ")";
    }
}
