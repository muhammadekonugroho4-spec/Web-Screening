package com.stockbit.component.transaction.company;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f77450a;

    /* renamed from: b, reason: collision with root package name */
    public final String f77451b;

    /* renamed from: c, reason: collision with root package name */
    public final String f77452c;

    static {
    }

    public a(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "logoId");
        kotlin.jvm.internal.p.l(r3, "textCompanySymbolId");
        kotlin.jvm.internal.p.l(r4, "priceAndChangeTextId");
        this.f77450a = r2;
        this.f77451b = r3;
        this.f77452c = r4;
    }

    public final String a() {
        return this.f77450a;
    }

    public final String b() {
        return this.f77452c;
    }

    public final String c() {
        return this.f77451b;
    }

    public /* synthetic */ a(String r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
