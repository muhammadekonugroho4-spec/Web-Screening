package com.stockbit.domain.model.chat.room;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f81366a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81367b;

    public m(int r1, int r2) {
        this.f81366a = r1;
        this.f81367b = r2;
    }

    public final int a() {
        return this.f81366a;
    }

    public final int b() {
        return this.f81367b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (this.f81366a == r52.f81366a) goto L12;
        return false;
    L12:
        if (this.f81367b == r52.f81367b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f81366a) * 31) + Integer.hashCode(this.f81367b);
    }

    public String toString() {
        return "RoomUnreadEntity(lastId=" + this.f81366a + ", total=" + this.f81367b + ")";
    }

    public /* synthetic */ m(int r2, int r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 0;
    L8:
        this(r2, r3);
    }
}
