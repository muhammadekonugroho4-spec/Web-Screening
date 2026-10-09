package com.stockbit.usecase.chat.model.chat.message;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f155255a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155256b;

    /* renamed from: c, reason: collision with root package name */
    public final String f155257c;

    public c(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "url");
        kotlin.jvm.internal.p.l(r3, "symbol");
        kotlin.jvm.internal.p.l(r4, "username");
        this.f155255a = r2;
        this.f155256b = r3;
        this.f155257c = r4;
    }

    public final String a() {
        return this.f155256b;
    }

    public final String b() {
        return this.f155255a;
    }

    public final String c() {
        return this.f155257c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (kotlin.jvm.internal.p.g(this.f155255a, r52.f155255a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f155256b, r52.f155256b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f155257c, r52.f155257c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f155255a.hashCode() * 31) + this.f155256b.hashCode()) * 31) + this.f155257c.hashCode();
    }

    public String toString() {
        return "MaskedTextRefUIState(url=" + this.f155255a + ", symbol=" + this.f155256b + ", username=" + this.f155257c + ")";
    }
}
