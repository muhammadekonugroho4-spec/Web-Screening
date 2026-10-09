package com.stockbit.usecase.chat.model.group;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f155544a;

    public e(boolean r1) {
        this.f155544a = r1;
    }

    public final e a(boolean r2) {
        return new e(r2);
    }

    public final boolean b() {
        return this.f155544a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof e) == true) goto L9;
        return false;
    L9:
        if (this.f155544a == ((e) r4).f155544a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f155544a);
    }

    public String toString() {
        return "GroupSettingsUIState(shareTradePermission=" + this.f155544a + ")";
    }
}
