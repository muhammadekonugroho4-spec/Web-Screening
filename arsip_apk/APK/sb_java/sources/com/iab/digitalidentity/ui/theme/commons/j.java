package com.iab.digitalidentity.ui.theme.commons;

import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public Integer f40776a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f40777b;

    public j(Integer r1, Boolean r2) {
        this.f40776a = r1;
        this.f40777b = r2;
    }

    public final Integer a() {
        return this.f40776a;
    }

    public final Boolean b() {
        return this.f40777b;
    }

    public final void c(j r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        Integer r02 = r2.f40776a;
        if (r02 != null) goto L7;
        r02 = this.f40776a;
    L7:
        this.f40776a = r02;
        Boolean r22 = r2.f40777b;
        if (r22 != null) goto L10;
        r22 = this.f40777b;
    L10:
        this.f40777b = r22;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (p.g(this.f40776a, r52.f40776a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f40777b, r52.f40777b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.f40776a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Boolean r2 = this.f40777b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "DigitalIdentityStatusBar(color=" + this.f40776a + ", isLight=" + this.f40777b + ")";
    }

    public /* synthetic */ j(Integer r2, Boolean r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }
}
