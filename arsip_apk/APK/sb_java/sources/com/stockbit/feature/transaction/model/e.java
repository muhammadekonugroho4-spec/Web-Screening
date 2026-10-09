package com.stockbit.feature.transaction.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f108281a;

    /* renamed from: b, reason: collision with root package name */
    public final String f108282b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f108283c;
    public final String d;

    static {
    }

    public e(boolean r2, String r3, boolean r4, String r5) {
        p.l(r3, "remainingVolumeLot");
        p.l(r5, "triggerPrice");
        this.f108281a = r2;
        this.f108282b = r3;
        this.f108283c = r4;
        this.d = r5;
    }

    public static /* synthetic */ e b(e r02, boolean r1, String r2, boolean r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.f108281a;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.f108282b;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.f108283c;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        return r02.a(r1, r2, r3, r4);
    }

    public final e a(boolean r2, String r3, boolean r4, String r5) {
        p.l(r3, "remainingVolumeLot");
        p.l(r5, "triggerPrice");
        return new e(r2, r3, r4, r5);
    }

    public final String c() {
        return this.f108282b;
    }

    public final boolean d() {
        return this.f108281a;
    }

    public final boolean e() {
        return this.f108283c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (this.f108281a == r52.f108281a) goto L12;
        return false;
    L12:
        if (p.g(this.f108282b, r52.f108282b) == true) goto L15;
        return false;
    L15:
        if (this.f108283c == r52.f108283c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f108281a) * 31) + this.f108282b.hashCode()) * 31) + Boolean.hashCode(this.f108283c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "VolumeTriggerOrderUIState(showForm=" + this.f108281a + ", remainingVolumeLot=" + this.f108282b + ", showTriggerPrice=" + this.f108283c + ", triggerPrice=" + this.d + ')';
    }

    public /* synthetic */ e(boolean r3, String r4, boolean r5, String r6, int r7, i r8) {
        if ((r7 & 1) == 0) goto L6;
        r3 = false;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r5 = false;
    L12:
        if ((r7 & 8) == 0) goto L14;
        r6 = "";
    L14:
        this(r3, r4, r5, r6);
    }
}
