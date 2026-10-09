package com.stockbit.usecase.chat.model.chat;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f155226a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f155227b;

    public h(boolean r1, boolean r2) {
        this.f155226a = r1;
        this.f155227b = r2;
    }

    public final boolean a() {
        return this.f155226a;
    }

    public final boolean b() {
        return this.f155227b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (this.f155226a == r52.f155226a) goto L12;
        return false;
    L12:
        if (this.f155227b == r52.f155227b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f155226a) * 31) + Boolean.hashCode(this.f155227b);
    }

    public String toString() {
        return "RoomShareTradeUIState(isAutoShareActive=" + this.f155226a + ", isShareValue=" + this.f155227b + ")";
    }

    public /* synthetic */ h(boolean r2, boolean r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = false;
    L8:
        this(r2, r3);
    }
}
