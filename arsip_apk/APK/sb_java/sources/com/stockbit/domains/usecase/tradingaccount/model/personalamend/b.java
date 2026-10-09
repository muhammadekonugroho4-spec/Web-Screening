package com.stockbit.domains.usecase.tradingaccount.model.personalamend;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f88504a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88505b;

    /* renamed from: c, reason: collision with root package name */
    public final List f88506c;

    public b(String r2, String r3, List r4) {
        p.l(r2, "fileUrl");
        p.l(r3, "uploadUrl");
        p.l(r4, "uploadBody");
        this.f88504a = r2;
        this.f88505b = r3;
        this.f88506c = r4;
    }

    public final String a() {
        return this.f88504a;
    }

    public final List b() {
        return this.f88506c;
    }

    public final String c() {
        return this.f88505b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f88504a, r52.f88504a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88505b, r52.f88505b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f88506c, r52.f88506c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f88504a.hashCode() * 31) + this.f88505b.hashCode()) * 31) + this.f88506c.hashCode();
    }

    public String toString() {
        return "PersonalAmendUploadDocumentUIState(fileUrl=" + this.f88504a + ", uploadUrl=" + this.f88505b + ", uploadBody=" + this.f88506c + ")";
    }
}
