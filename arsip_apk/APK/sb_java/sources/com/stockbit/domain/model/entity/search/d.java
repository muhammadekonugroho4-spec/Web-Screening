package com.stockbit.domain.model.entity.search;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f82951a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f82952b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f82953c;

    public d(boolean r1, boolean r2, boolean r3) {
        this.f82951a = r1;
        this.f82952b = r2;
        this.f82953c = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (this.f82951a == r52.f82951a) goto L12;
        return false;
    L12:
        if (this.f82952b == r52.f82952b) goto L15;
        return false;
    L15:
        if (this.f82953c == r52.f82953c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f82951a) * 31) + Boolean.hashCode(this.f82952b)) * 31) + Boolean.hashCode(this.f82953c);
    }

    public String toString() {
        return "SearchItemPagination(hasMoreCompanies=" + this.f82951a + ", hasMoreInsiders=" + this.f82952b + ", hasMoreUsers=" + this.f82953c + ')';
    }

    public /* synthetic */ d(boolean r2, boolean r3, boolean r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = false;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = false;
    L11:
        this(r2, r3, r4);
    }
}
