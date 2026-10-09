package com.stockbit.domain.model.chat.group;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81246a;

    public q(boolean r1) {
        this.f81246a = r1;
    }

    public final boolean a() {
        return this.f81246a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof q) == true) goto L9;
        return false;
    L9:
        if (this.f81246a == ((q) r4).f81246a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f81246a);
    }

    public String toString() {
        return "MuteUnmuteGroupEntity(isMute=" + this.f81246a + ")";
    }
}
