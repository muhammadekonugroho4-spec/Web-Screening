package com.stockbit.domains.usecase.tradingaccount.model.personalamend;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f88502a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88503b;

    public a(String r2, String r3) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "value");
        this.f88502a = r2;
        this.f88503b = r3;
    }

    public final String a() {
        return this.f88502a;
    }

    public final String b() {
        return this.f88503b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f88502a, r52.f88502a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88503b, r52.f88503b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f88502a.hashCode() * 31) + this.f88503b.hashCode();
    }

    public String toString() {
        return "PersonalAmendUploadBodyUIState(key=" + this.f88502a + ", value=" + this.f88503b + ")";
    }
}
