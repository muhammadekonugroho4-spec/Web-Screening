package com.stockbit.component.tablayout;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f77370a;

    /* renamed from: b, reason: collision with root package name */
    public final String f77371b;

    static {
    }

    public g(String r2, String r3) {
        p.l(r2, Constants.KEY_TITLE);
        p.l(r3, "tag");
        this.f77370a = r2;
        this.f77371b = r3;
    }

    public final String a() {
        return this.f77371b;
    }

    public final String b() {
        return this.f77370a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f77370a, r52.f77370a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f77371b, r52.f77371b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f77370a.hashCode() * 31) + this.f77371b.hashCode();
    }

    public String toString() {
        return "TabHeader(title=" + this.f77370a + ", tag=" + this.f77371b + ')';
    }
}
