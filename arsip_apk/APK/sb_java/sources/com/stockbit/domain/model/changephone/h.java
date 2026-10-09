package com.stockbit.domain.model.changephone;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f81178a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81179b;

    public h(String r1, String r2) {
        this.f81178a = r1;
        this.f81179b = r2;
    }

    public final String a() {
        return this.f81178a;
    }

    public final String b() {
        return this.f81179b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f81178a, r52.f81178a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81179b, r52.f81179b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f81178a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f81179b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "FinishChangeDataEntity(heading=" + this.f81178a + ", subHeading=" + this.f81179b + ")";
    }
}
