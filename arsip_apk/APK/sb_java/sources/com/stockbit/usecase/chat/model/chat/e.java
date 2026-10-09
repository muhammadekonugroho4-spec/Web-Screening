package com.stockbit.usecase.chat.model.chat;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f155201a;

    /* renamed from: b, reason: collision with root package name */
    public final RoomInfoUIState f155202b;

    /* renamed from: c, reason: collision with root package name */
    public final int f155203c;

    public e(int r2, RoomInfoUIState r3, int r4) {
        p.l(r3, "info");
        this.f155201a = r2;
        this.f155202b = r3;
        this.f155203c = r4;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (this.f155201a == r52.f155201a) goto L12;
        return false;
    L12:
        if (p.g(this.f155202b, r52.f155202b) == true) goto L15;
        return false;
    L15:
        if (this.f155203c == r52.f155203c) goto L17;
        return false;
    L17:
        return true;
    }

    @Override // com.stockbit.usecase.chat.model.chat.i
    public int g() {
        return this.f155201a;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f155201a) * 31) + this.f155202b.hashCode()) * 31) + Integer.hashCode(this.f155203c);
    }

    public final int i() {
        return this.f155203c;
    }

    public String toString() {
        return "RoomHeaderUIState(roomId=" + this.f155201a + ", info=" + this.f155202b + ", totalRequests=" + this.f155203c + ")";
    }

    public /* synthetic */ e(int r10, RoomInfoUIState r11, int r12, int r13, kotlin.jvm.internal.i r14) {
        if ((r13 & 1) == 0) goto L6;
        r10 = 0;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r11 = new RoomInfoUIState(null, null, null, null, false, 31, null);
    L9:
        if ((r13 & 4) == 0) goto L11;
        r12 = 0;
    L11:
        this(r10, r11, r12);
    }
}
