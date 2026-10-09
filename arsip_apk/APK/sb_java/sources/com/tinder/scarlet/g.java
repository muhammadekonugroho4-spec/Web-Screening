package com.tinder.scarlet;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final l f173667a;

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.disposables.b f173668b;

    public g(l r2, io.reactivex.disposables.b r3) {
        p.l(r2, "webSocket");
        p.l(r3, "webSocketDisposable");
        this.f173667a = r2;
        this.f173668b = r3;
    }

    public final l a() {
        return this.f173667a;
    }

    public boolean equals(Object r3) {
        if (this != r3) goto L4;
        return true;
    L4:
        if ((r3 instanceof g) == false) goto L10;
        g r32 = (g) r3;
        if (p.g(this.f173667a, r32.f173667a) == true) goto L8;
        return false;
    L8:
        if (p.g(this.f173668b, r32.f173668b) == true) goto L16;
        return false;
    L16:
        return true;
    L10:
        return false;
    }

    public int hashCode() {
        l r02 = this.f173667a;
        int r1 = 0;
        if (r02 == null) goto L5;
        int r03 = r02.hashCode();
    L6:
        int r04 = r03 * 31;
        io.reactivex.disposables.b r2 = this.f173668b;
        if (r2 == null) goto L10;
        r1 = r2.hashCode();
    L10:
        return r04 + r1;
    L5:
        r03 = 0;
        goto L6
    }

    public String toString() {
        return "Session(webSocket=" + this.f173667a + ", webSocketDisposable=" + this.f173668b + ")";
    }
}
