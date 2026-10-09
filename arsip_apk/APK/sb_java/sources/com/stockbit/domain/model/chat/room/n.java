package com.stockbit.domain.model.chat.room;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f81368a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81369b;

    public n(int r1, boolean r2) {
        this.f81368a = r1;
        this.f81369b = r2;
    }

    public final boolean a() {
        return this.f81369b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (this.f81368a == r52.f81368a) goto L12;
        return false;
    L12:
        if (this.f81369b == r52.f81369b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f81368a) * 31) + Boolean.hashCode(this.f81369b);
    }

    public String toString() {
        return "UnreadChatRoomEntity(count=" + this.f81368a + ", hasNewMessages=" + this.f81369b + ")";
    }
}
