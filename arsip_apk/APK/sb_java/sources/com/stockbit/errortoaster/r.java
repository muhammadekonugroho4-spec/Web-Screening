package com.stockbit.errortoaster;

/* loaded from: classes8.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final Object f91446a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f91447b;

    public r(Object r1) {
        this.f91446a = r1;
    }

    public final Object a() {
        if (this.f91447b == false) goto L6;
        return null;
    L6:
        this.f91447b = true;
        return this.f91446a;
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof r) == true) goto L5;
        return false;
    L5:
        r r42 = (r) r4;
        if (kotlin.jvm.internal.p.g(this.f91446a, r42.f91446a) == true) goto L9;
        return false;
    L9:
        if (this.f91447b == r42.f91447b) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        Object r02 = this.f91446a;
        if (r02 == null) goto L5;
        int r03 = r02.hashCode();
    L7:
        return (r03 * 31) + Boolean.hashCode(this.f91447b);
    L5:
        r03 = 0;
        goto L7
    }

    public String toString() {
        return "Event(content=" + this.f91446a + ", hasBeenHandled=" + this.f91447b + ')';
    }
}
