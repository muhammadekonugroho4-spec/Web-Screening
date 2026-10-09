package com.stockbit.domain.model.chat.group;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81227a;

    public i(boolean r1) {
        this.f81227a = r1;
    }

    public final boolean a() {
        return this.f81227a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof i) == true) goto L9;
        return false;
    L9:
        if (this.f81227a == ((i) r4).f81227a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f81227a);
    }

    public String toString() {
        return "GroupSettingsEntity(shareTradePermission=" + this.f81227a + ")";
    }
}
