package com.stockbit.usecase.withdrawaldeposit.model;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f164774a;

    /* renamed from: b, reason: collision with root package name */
    public final List f164775b;

    public d(String r2, List r3) {
        p.l(r2, Constants.KEY_TITLE);
        p.l(r3, "rules");
        this.f164774a = r2;
        this.f164775b = r3;
    }

    public final List a() {
        return this.f164775b;
    }

    public final String b() {
        return this.f164774a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f164774a, r52.f164774a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f164775b, r52.f164775b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f164774a.hashCode() * 31) + this.f164775b.hashCode();
    }

    public String toString() {
        return "WithdrawalGuideUIData(title=" + this.f164774a + ", rules=" + this.f164775b + ")";
    }
}
