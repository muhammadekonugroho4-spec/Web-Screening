package com.stockbit.chateligibility;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f59401a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f59402b;

    static {
    }

    public h(Object r1) {
        this.f59401a = r1;
    }

    public final Object a() {
        if (this.f59402b == false) goto L6;
        return null;
    L6:
        this.f59402b = true;
        return this.f59401a;
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof h) == true) goto L5;
        return false;
    L5:
        h r42 = (h) r4;
        if (p.g(this.f59401a, r42.f59401a) == true) goto L9;
        return false;
    L9:
        if (this.f59402b == r42.f59402b) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        Object r02 = this.f59401a;
        if (r02 == null) goto L5;
        int r03 = r02.hashCode();
    L7:
        return (r03 * 31) + Boolean.hashCode(this.f59402b);
    L5:
        r03 = 0;
        goto L7
    }

    public String toString() {
        return "Event(content=" + this.f59401a + ", hasBeenHandled=" + this.f59402b + ')';
    }
}
