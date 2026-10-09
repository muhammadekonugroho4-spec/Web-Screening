package com.stockbit.setting.ui.compose.model;

import kotlin.jvm.internal.i;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f135844a;

    /* renamed from: b, reason: collision with root package name */
    public final int f135845b;

    static {
    }

    public b(int r1, int r2) {
        this.f135844a = r1;
        this.f135845b = r2;
    }

    public final int a() {
        return this.f135845b;
    }

    public final int b() {
        return this.f135844a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f135844a == r52.f135844a) goto L12;
        return false;
    L12:
        if (this.f135845b == r52.f135845b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f135844a) * 31) + Integer.hashCode(this.f135845b);
    }

    public String toString() {
        return "SettingMenuIdentifier(tagId=" + this.f135844a + ", arrowTagId=" + this.f135845b + ')';
    }

    public /* synthetic */ b(int r2, int r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 0;
    L8:
        this(r2, r3);
    }
}
