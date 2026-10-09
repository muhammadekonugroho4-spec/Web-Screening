package com.stockbit.company.ui.profile.ownershipallocation.displaysearch;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f67920a;

    static {
    }

    public i(String r2) {
        p.l(r2, "searchQuery");
        this.f67920a = r2;
    }

    public final i a(String r2) {
        p.l(r2, "searchQuery");
        return new i(r2);
    }

    public final String b() {
        return this.f67920a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof i) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f67920a, ((i) r4).f67920a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f67920a.hashCode();
    }

    public String toString() {
        return "DisplaySearchScreenState(searchQuery=" + this.f67920a + ')';
    }

    public /* synthetic */ i(String r1, int r2, kotlin.jvm.internal.i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
