package com.stockbit.lib.inappupdate;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f120211a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f120212b;

    public e(Object r1) {
        this.f120211a = r1;
    }

    public final Object a() {
        if (this.f120212b == false) goto L6;
        return null;
    L6:
        this.f120212b = true;
        return this.f120211a;
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof e) == true) goto L5;
        return false;
    L5:
        e r42 = (e) r4;
        if (p.g(this.f120211a, r42.f120211a) == true) goto L9;
        return false;
    L9:
        if (this.f120212b == r42.f120212b) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        Object r02 = this.f120211a;
        if (r02 == null) goto L5;
        int r03 = r02.hashCode();
    L7:
        return (r03 * 31) + Boolean.hashCode(this.f120212b);
    L5:
        r03 = 0;
        goto L7
    }

    public String toString() {
        return "Event(content=" + this.f120211a + ", hasBeenHandled=" + this.f120212b + ')';
    }
}
