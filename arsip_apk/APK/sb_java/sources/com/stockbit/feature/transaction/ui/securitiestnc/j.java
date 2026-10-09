package com.stockbit.feature.transaction.ui.securitiestnc;

/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f115287a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f115288b;

    static {
    }

    public j(boolean r1, boolean r2) {
        this.f115287a = r1;
        this.f115288b = r2;
    }

    public static /* synthetic */ j b(j r02, boolean r1, boolean r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.f115287a;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.f115288b;
    L9:
        return r02.a(r1, r2);
    }

    public final j a(boolean r2, boolean r3) {
        return new j(r2, r3);
    }

    public final boolean c() {
        return this.f115288b;
    }

    public final boolean d() {
        return this.f115287a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (this.f115287a == r52.f115287a) goto L12;
        return false;
    L12:
        if (this.f115288b == r52.f115288b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f115287a) * 31) + Boolean.hashCode(this.f115288b);
    }

    public String toString() {
        return "SecuritiesTermConditionUIState(isTnCChecked=" + this.f115287a + ", isClosed=" + this.f115288b + ')';
    }

    public /* synthetic */ j(boolean r2, boolean r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = false;
    L8:
        this(r2, r3);
    }
}
