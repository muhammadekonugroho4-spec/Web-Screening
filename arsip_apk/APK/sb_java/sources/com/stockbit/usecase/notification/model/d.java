package com.stockbit.usecase.notification.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public String f158643a;

    /* renamed from: b, reason: collision with root package name */
    public int f158644b;

    public d(String r1, int r2) {
        this.f158643a = r1;
        this.f158644b = r2;
    }

    public final int a() {
        return this.f158644b;
    }

    public final String b() {
        return this.f158643a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f158643a, r52.f158643a) == true) goto L12;
        return false;
    L12:
        if (this.f158644b == r52.f158644b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f158643a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + Integer.hashCode(this.f158644b);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "NotificationListParams(type=" + this.f158643a + ", limit=" + this.f158644b + ")";
    }
}
