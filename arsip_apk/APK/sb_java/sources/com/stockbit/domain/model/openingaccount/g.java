package com.stockbit.domain.model.openingaccount;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f84534a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84535b;

    public g(String r2, String r3) {
        p.l(r2, Constants.KEY_TITLE);
        p.l(r3, "description");
        this.f84534a = r2;
        this.f84535b = r3;
    }

    public final String a() {
        return this.f84535b;
    }

    public final String b() {
        return this.f84534a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f84534a, r52.f84534a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84535b, r52.f84535b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f84534a.hashCode() * 31) + this.f84535b.hashCode();
    }

    public String toString() {
        return "OARejectReasonEntity(title=" + this.f84534a + ", description=" + this.f84535b + ")";
    }
}
