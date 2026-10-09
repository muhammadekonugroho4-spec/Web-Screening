package com.stockbit.component.facerecognition.ui.base;

/* loaded from: classes7.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final int f71110a;

    static {
    }

    public m(int r1) {
        this.f71110a = r1;
    }

    public final int a() {
        return this.f71110a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof m) == true) goto L9;
        return false;
    L9:
        if (this.f71110a == ((m) r4).f71110a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.f71110a);
    }

    public String toString() {
        return "RetryAble(attemptLeft=" + this.f71110a + ')';
    }
}
