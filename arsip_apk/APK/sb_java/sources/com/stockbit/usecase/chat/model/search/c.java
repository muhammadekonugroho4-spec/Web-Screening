package com.stockbit.usecase.chat.model.search;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f155627a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f155628b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f155629c;

    public c(boolean r1, boolean r2, boolean r3) {
        this.f155627a = r1;
        this.f155628b = r2;
        this.f155629c = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f155627a == r52.f155627a) goto L12;
        return false;
    L12:
        if (this.f155628b == r52.f155628b) goto L15;
        return false;
    L15:
        if (this.f155629c == r52.f155629c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f155627a) * 31) + Boolean.hashCode(this.f155628b)) * 31) + Boolean.hashCode(this.f155629c);
    }

    public String toString() {
        return "SearchPaginationUIState(hasMoreCompanies=" + this.f155627a + ", hasMoreInsiders=" + this.f155628b + ", hasMoreUsers=" + this.f155629c + ")";
    }
}
