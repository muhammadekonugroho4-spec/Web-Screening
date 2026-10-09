package com.stockbit.component.securities;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final int f75781b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f75782a;

    static {
    }

    public c(String r2) {
        kotlin.jvm.internal.p.l(r2, "textCompanySymbolId");
        this.f75782a = r2;
    }

    public final String a() {
        return this.f75782a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f75782a, ((c) r4).f75782a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f75782a.hashCode();
    }

    public String toString() {
        return "CompanyInfoNotationIdentifier(textCompanySymbolId=" + this.f75782a + ')';
    }

    public /* synthetic */ c(String r1, int r2, kotlin.jvm.internal.i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
