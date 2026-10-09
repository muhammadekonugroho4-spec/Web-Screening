package com.stockbit.personalamend.ui.changeemail.otp;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final com.stockbit.usecase.personalamend.model.f f125703a;

    static {
    }

    public g(com.stockbit.usecase.personalamend.model.f r1) {
        this.f125703a = r1;
    }

    public final com.stockbit.usecase.personalamend.model.f a() {
        return this.f125703a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof g) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f125703a, ((g) r4).f125703a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        com.stockbit.usecase.personalamend.model.f r02 = this.f125703a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "SuccessVerifyOTP(uiState=" + this.f125703a + ')';
    }
}
