package com.stockbit.domain.model.valueobject.register;

import com.clevertap.android.sdk.Constants;
import com.stockbit.domain.model.type.register.EmailValidationType;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f86928a;

    /* renamed from: b, reason: collision with root package name */
    public final EmailValidationType f86929b;

    public a(String r2, EmailValidationType r3) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "verificationStatus");
        this.f86928a = r2;
        this.f86929b = r3;
    }

    public final EmailValidationType a() {
        return this.f86929b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f86928a, r52.f86928a) == true) goto L12;
        return false;
    L12:
        if (this.f86929b == r52.f86929b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f86928a.hashCode() * 31) + this.f86929b.hashCode();
    }

    public String toString() {
        return "EmailValidation(key=" + this.f86928a + ", verificationStatus=" + this.f86929b + ')';
    }

    public /* synthetic */ a(String r1, EmailValidationType r2, int r3, i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = EmailValidationType.UNVERIFIED;
    L8:
        this(r1, r2);
    }
}
