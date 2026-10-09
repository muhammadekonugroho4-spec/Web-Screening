package org.ocpsoft.prettytime.impl;

import org.ocpsoft.prettytime.e;

/* loaded from: classes3.dex */
public abstract class ResourcesTimeUnit implements e {

    /* renamed from: a, reason: collision with root package name */
    public long f183016a;

    /* renamed from: b, reason: collision with root package name */
    public long f183017b;

    public ResourcesTimeUnit() {
        this.f183016a = 0;
        this.f183017b = 1;
    }

    @Override // org.ocpsoft.prettytime.e
    public long a() {
        return this.f183017b;
    }

    @Override // org.ocpsoft.prettytime.e
    public long b() {
        return this.f183016a;
    }

    public String c() {
        return "org.ocpsoft.prettytime.i18n.Resources";
    }

    public abstract String d();

    public void e(long r1) {
        this.f183016a = r1;
    }

    public boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L9;
        return false;
    L9:
        if (getClass() == r7.getClass()) goto L11;
        return false;
    L11:
        ResourcesTimeUnit r72 = (ResourcesTimeUnit) r7;
        if (this.f183016a == r72.f183016a) goto L15;
        return false;
    L15:
        if (this.f183017b == r72.f183017b) goto L17;
        return false;
    L17:
        return true;
    }

    public void f(long r1) {
        this.f183017b = r1;
    }

    public int hashCode() {
        long r02 = this.f183016a;
        int r03 = (((int) (r02 ^ (r02 >>> 32))) + 31) * 31;
        long r3 = this.f183017b;
        return r03 + ((int) ((r3 >>> 32) ^ r3));
    }

    public String toString() {
        return d();
    }
}
