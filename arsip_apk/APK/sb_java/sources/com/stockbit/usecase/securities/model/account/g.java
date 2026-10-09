package com.stockbit.usecase.securities.model.account;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f160385a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160386b;

    /* renamed from: c, reason: collision with root package name */
    public final String f160387c;

    public g(String r2, String r3, String r4) {
        p.l(r2, "type");
        p.l(r3, Constants.KEY_TITLE);
        p.l(r4, "description");
        this.f160385a = r2;
        this.f160386b = r3;
        this.f160387c = r4;
    }

    public final String a() {
        return this.f160387c;
    }

    public final String b() {
        return this.f160386b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f160385a, r52.f160385a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f160386b, r52.f160386b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f160387c, r52.f160387c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f160385a.hashCode() * 31) + this.f160386b.hashCode()) * 31) + this.f160387c.hashCode();
    }

    public String toString() {
        return "SubAccountReasonUIState(type=" + this.f160385a + ", title=" + this.f160386b + ", description=" + this.f160387c + ")";
    }
}
