package com.stockbit.domain.model.verification;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f87208a;

    public a(boolean r1) {
        this.f87208a = r1;
    }

    public final boolean a() {
        return this.f87208a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (this.f87208a == ((a) r4).f87208a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f87208a);
    }

    public String toString() {
        return "DukcapilCurrentStateEntity(hasFinished=" + this.f87208a + ")";
    }
}
