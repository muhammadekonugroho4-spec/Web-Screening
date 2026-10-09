package com.stockbit.domain.model.search;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f84977a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84978b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f84979c;

    public j(boolean r1, boolean r2, boolean r3) {
        this.f84977a = r1;
        this.f84978b = r2;
        this.f84979c = r3;
    }

    public final boolean a() {
        return this.f84977a;
    }

    public final boolean b() {
        return this.f84978b;
    }

    public final boolean c() {
        return this.f84979c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (this.f84977a == r52.f84977a) goto L12;
        return false;
    L12:
        if (this.f84978b == r52.f84978b) goto L15;
        return false;
    L15:
        if (this.f84979c == r52.f84979c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f84977a) * 31) + Boolean.hashCode(this.f84978b)) * 31) + Boolean.hashCode(this.f84979c);
    }

    public String toString() {
        return "SearchPaginationEntity(hasMoreCompanies=" + this.f84977a + ", hasMoreInsiders=" + this.f84978b + ", hasMoreUsers=" + this.f84979c + ")";
    }
}
