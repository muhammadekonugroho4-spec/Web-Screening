package com.stockbit.toaster;

import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f146168a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f146169b;

    static {
    }

    public a(Object r1) {
        this.f146168a = r1;
    }

    public final Object a() {
        if (this.f146169b == false) goto L6;
        return null;
    L6:
        this.f146169b = true;
        return this.f146168a;
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof a) == true) goto L5;
        return false;
    L5:
        a r42 = (a) r4;
        if (p.g(this.f146168a, r42.f146168a) == true) goto L9;
        return false;
    L9:
        if (this.f146169b == r42.f146169b) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        Object r02 = this.f146168a;
        if (r02 == null) goto L5;
        int r03 = r02.hashCode();
    L7:
        return (r03 * 31) + Boolean.hashCode(this.f146169b);
    L5:
        r03 = 0;
        goto L7
    }

    public String toString() {
        return "Event(content=" + this.f146168a + ", hasBeenHandled=" + this.f146169b + ')';
    }
}
