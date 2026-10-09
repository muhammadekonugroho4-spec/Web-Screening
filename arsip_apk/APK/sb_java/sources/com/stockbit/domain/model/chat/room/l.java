package com.stockbit.domain.model.chat.room;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81364a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81365b;

    public l(boolean r1, boolean r2) {
        this.f81364a = r1;
        this.f81365b = r2;
    }

    public final boolean a() {
        return this.f81365b;
    }

    public final boolean b() {
        return this.f81364a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (this.f81364a == r52.f81364a) goto L12;
        return false;
    L12:
        if (this.f81365b == r52.f81365b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f81364a) * 31) + Boolean.hashCode(this.f81365b);
    }

    public String toString() {
        return "RoomStatusEntity(isMuted=" + this.f81364a + ", isMentioned=" + this.f81365b + ")";
    }

    public /* synthetic */ l(boolean r2, boolean r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = false;
    L8:
        this(r2, r3);
    }
}
