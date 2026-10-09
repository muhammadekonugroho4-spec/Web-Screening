package com.stockbit.domain.model.auth;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f80638a;

    /* renamed from: b, reason: collision with root package name */
    public final m f80639b;

    /* renamed from: c, reason: collision with root package name */
    public final m f80640c;

    public c(boolean r1, m r2, m r3) {
        this.f80638a = r1;
        this.f80639b = r2;
        this.f80640c = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f80638a == r52.f80638a) goto L12;
        return false;
    L12:
        if (p.g(this.f80639b, r52.f80639b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80640c, r52.f80640c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = Boolean.hashCode(this.f80638a) * 31;
        m r1 = this.f80639b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        m r13 = this.f80640c;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "DeviceMigrationEntity(hasMigrated=" + this.f80638a + ", accessToken=" + this.f80639b + ", refreshToken=" + this.f80640c + ")";
    }
}
