package com.stockbit.domain.model.entity.amendbank;

import com.clevertap.android.sdk.Constants;
import com.stockbit.company.CompanyEntryPoint;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f82515a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82516b;

    public b(String r2, String r3) {
        p.l(r2, Constants.KEY_TITLE);
        p.l(r3, CompanyEntryPoint.EXTRA_DESC);
        this.f82515a = r2;
        this.f82516b = r3;
    }

    public final String a() {
        return this.f82516b;
    }

    public final String b() {
        return this.f82515a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f82515a, r52.f82515a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82516b, r52.f82516b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f82515a.hashCode() * 31) + this.f82516b.hashCode();
    }

    public String toString() {
        return "AmendBankStatusNote(title=" + this.f82515a + ", desc=" + this.f82516b + ')';
    }

    public /* synthetic */ b(String r2, String r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
