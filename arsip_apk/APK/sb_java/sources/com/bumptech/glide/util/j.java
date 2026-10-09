package com.bumptech.glide.util;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public Class f33397a;

    /* renamed from: b, reason: collision with root package name */
    public Class f33398b;

    /* renamed from: c, reason: collision with root package name */
    public Class f33399c;

    public j() {
    }

    public void a(Class r1, Class r2, Class r3) {
        this.f33397a = r1;
        this.f33398b = r2;
        this.f33399c = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L20:
        return false;
    L8:
        if (getClass() != r5.getClass()) goto L20;
        j r52 = (j) r5;
        if (this.f33397a.equals(r52.f33397a) == true) goto L14;
        return false;
    L14:
        if (this.f33398b.equals(r52.f33398b) == true) goto L17;
        return false;
    L17:
        if (l.d(this.f33399c, r52.f33399c) == true) goto L19;
        return false;
    L19:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f33397a.hashCode() * 31) + this.f33398b.hashCode()) * 31;
        Class r1 = this.f33399c;
        if (r1 == null) goto L5;
        int r12 = r1.hashCode();
    L7:
        return r02 + r12;
    L5:
        r12 = 0;
        goto L7
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f33397a + ", second=" + this.f33398b + '}';
    }

    public j(Class r1, Class r2, Class r3) {
        a(r1, r2, r3);
    }
}
