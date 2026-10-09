package com.stockbit.feature.freezeaccount.contract.delegation;

import kotlin.jvm.functions.l;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f96541a;

    /* renamed from: b, reason: collision with root package name */
    public final String f96542b;

    /* renamed from: c, reason: collision with root package name */
    public final l f96543c;
    public final l d;

    static {
    }

    public g(String r1, String r2, l r3, l r4) {
        this.f96541a = r1;
        this.f96542b = r2;
        this.f96543c = r3;
        this.d = r4;
    }

    public final String a() {
        return this.f96541a;
    }

    public final l b() {
        return this.d;
    }

    public final l c() {
        return this.f96543c;
    }

    public final String d() {
        return this.f96542b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f96541a, r52.f96541a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f96542b, r52.f96542b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f96543c, r52.f96543c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        String r02 = this.f96541a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f96542b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        l r23 = this.f96543c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        l r25 = this.d;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "FreezeAccountLoginViewModelDelegateParam(loginToken=" + this.f96541a + ", verificationToken=" + this.f96542b + ", onSuccessVerification=" + this.f96543c + ", onErrorInitializeVerification=" + this.d + ')';
    }

    public /* synthetic */ g(String r2, String r3, l r4, l r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }
}
