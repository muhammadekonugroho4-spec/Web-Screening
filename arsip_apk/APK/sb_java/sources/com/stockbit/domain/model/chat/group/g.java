package com.stockbit.domain.model.chat.group;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final f f81222a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81223b;

    public g(f r1, boolean r2) {
        this.f81222a = r1;
        this.f81223b = r2;
    }

    public final f a() {
        return this.f81222a;
    }

    public final boolean b() {
        return this.f81223b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (kotlin.jvm.internal.p.g(this.f81222a, r52.f81222a) == true) goto L12;
        return false;
    L12:
        if (this.f81223b == r52.f81223b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        f r02 = this.f81222a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + Boolean.hashCode(this.f81223b);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "GroupJoinSettingEntity(requirement=" + this.f81222a + ", isHideMemberPreview=" + this.f81223b + ")";
    }
}
