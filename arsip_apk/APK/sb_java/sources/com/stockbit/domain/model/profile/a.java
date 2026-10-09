package com.stockbit.domain.model.profile;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f84634a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84635b;

    public a(String r1, String r2) {
        this.f84634a = r1;
        this.f84635b = r2;
    }

    public final String a() {
        return this.f84635b;
    }

    public final String b() {
        return this.f84634a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (kotlin.jvm.internal.p.g(this.f84634a, r52.f84634a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f84635b, r52.f84635b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f84634a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f84635b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "AvatarCollectionEntity(group=" + this.f84634a + ", file=" + this.f84635b + ")";
    }
}
