package com.stockbit.domain.model.chat.room;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81358a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81359b;

    public j(boolean r1, boolean r2) {
        this.f81358a = r1;
        this.f81359b = r2;
    }

    public final boolean a() {
        return this.f81358a;
    }

    public final boolean b() {
        return this.f81359b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (this.f81358a == r52.f81358a) goto L12;
        return false;
    L12:
        if (this.f81359b == r52.f81359b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f81358a) * 31) + Boolean.hashCode(this.f81359b);
    }

    public String toString() {
        return "RoomShareTradeEntity(isAutoShareActive=" + this.f81358a + ", isShareValue=" + this.f81359b + ")";
    }

    public /* synthetic */ j(boolean r2, boolean r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = false;
    L8:
        this(r2, r3);
    }
}
