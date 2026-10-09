package com.stockbit.followrule;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f120050a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f120051b;

    static {
    }

    public h(Object r1) {
        this.f120050a = r1;
    }

    public final Object a() {
        if (this.f120051b == false) goto L6;
        return null;
    L6:
        this.f120051b = true;
        return this.f120050a;
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof h) == true) goto L5;
        return false;
    L5:
        h r42 = (h) r4;
        if (p.g(this.f120050a, r42.f120050a) == true) goto L9;
        return false;
    L9:
        if (this.f120051b == r42.f120051b) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        Object r02 = this.f120050a;
        if (r02 == null) goto L5;
        int r03 = r02.hashCode();
    L7:
        return (r03 * 31) + Boolean.hashCode(this.f120051b);
    L5:
        r03 = 0;
        goto L7
    }

    public String toString() {
        return "Event(content=" + this.f120050a + ", hasBeenHandled=" + this.f120051b + ')';
    }
}
