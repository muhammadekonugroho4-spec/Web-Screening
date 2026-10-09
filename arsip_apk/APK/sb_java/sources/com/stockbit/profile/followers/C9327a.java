package com.stockbit.profile.followers;

/* renamed from: com.stockbit.profile.followers.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9327a {

    /* renamed from: a, reason: collision with root package name */
    public final long f127542a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f127543b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f127544c;

    static {
    }

    public C9327a(long r1, boolean r3, boolean r4) {
        this.f127542a = r1;
        this.f127543b = r3;
        this.f127544c = r4;
    }

    public final long a() {
        return this.f127542a;
    }

    public final boolean b() {
        return this.f127543b;
    }

    public final boolean c() {
        return this.f127544c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C9327a) == true) goto L8;
        return false;
    L8:
        C9327a r82 = (C9327a) r8;
        if (this.f127542a == r82.f127542a) goto L12;
        return false;
    L12:
        if (this.f127543b == r82.f127543b) goto L15;
        return false;
    L15:
        if (this.f127544c == r82.f127544c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f127542a) * 31) + Boolean.hashCode(this.f127543b)) * 31) + Boolean.hashCode(this.f127544c);
    }

    public String toString() {
        return "FollowUIState(userId=" + this.f127542a + ", isFollow=" + this.f127543b + ", isLoading=" + this.f127544c + ')';
    }
}
