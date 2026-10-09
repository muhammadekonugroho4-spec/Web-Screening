package com.stockbit.feature.trusteddevice.ui.change.confirmation;

/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f118009a;

    static {
    }

    public n(boolean r1) {
        this.f118009a = r1;
    }

    public final n a(boolean r2) {
        return new n(r2);
    }

    public final boolean b() {
        return this.f118009a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof n) == true) goto L9;
        return false;
    L9:
        if (this.f118009a == ((n) r4).f118009a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f118009a);
    }

    public String toString() {
        return "ChangeConfirmationState(isLoading=" + this.f118009a + ')';
    }

    public /* synthetic */ n(boolean r1, int r2, kotlin.jvm.internal.i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = false;
    L5:
        this(r1);
    }
}
