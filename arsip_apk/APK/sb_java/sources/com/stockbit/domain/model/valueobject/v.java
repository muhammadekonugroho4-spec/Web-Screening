package com.stockbit.domain.model.valueobject;

/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f87207a;

    public v(boolean r1) {
        this.f87207a = r1;
    }

    public final boolean a() {
        return this.f87207a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof v) == true) goto L9;
        return false;
    L9:
        if (this.f87207a == ((v) r4).f87207a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f87207a);
    }

    public String toString() {
        return "Valid(valid=" + this.f87207a + ')';
    }
}
