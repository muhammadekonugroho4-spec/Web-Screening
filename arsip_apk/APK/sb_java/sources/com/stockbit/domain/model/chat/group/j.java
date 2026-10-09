package com.stockbit.domain.model.chat.group;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81228a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81229b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f81230c;

    public j(boolean r1, boolean r2, boolean r3) {
        this.f81228a = r1;
        this.f81229b = r2;
        this.f81230c = r3;
    }

    public final boolean a() {
        return this.f81228a;
    }

    public final boolean b() {
        return this.f81229b;
    }

    public final boolean c() {
        return this.f81230c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (this.f81228a == r52.f81228a) goto L12;
        return false;
    L12:
        if (this.f81229b == r52.f81229b) goto L15;
        return false;
    L15:
        if (this.f81230c == r52.f81230c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f81228a) * 31) + Boolean.hashCode(this.f81229b)) * 31) + Boolean.hashCode(this.f81230c);
    }

    public String toString() {
        return "GroupShareTradeEntity(isAutoshareActive=" + this.f81228a + ", isMemberAllowed=" + this.f81229b + ", isShareValue=" + this.f81230c + ")";
    }
}
