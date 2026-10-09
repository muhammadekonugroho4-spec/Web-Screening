package com.stockbit.auth;

import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f48018a;

    /* renamed from: b, reason: collision with root package name */
    public final String f48019b;

    public e(String r1, String r2) {
        this.f48018a = r1;
        this.f48019b = r2;
    }

    public final String a() {
        return this.f48018a;
    }

    public final String b() {
        return this.f48019b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f48018a, r52.f48018a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f48019b, r52.f48019b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f48018a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f48019b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "TokenSnapshot(accessToken=" + this.f48018a + ", refreshToken=" + this.f48019b + ')';
    }
}
