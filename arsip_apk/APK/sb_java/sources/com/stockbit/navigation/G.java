package com.stockbit.navigation;

/* loaded from: classes10.dex */
public class G {

    /* renamed from: a, reason: collision with root package name */
    public final Object f122400a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f122401b;

    public G(Object r1) {
        this.f122400a = r1;
    }

    public final Object a() {
        if (this.f122401b == false) goto L6;
        return null;
    L6:
        this.f122401b = true;
        return this.f122400a;
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof G) == true) goto L5;
        return false;
    L5:
        G r42 = (G) r4;
        if (kotlin.jvm.internal.p.g(this.f122400a, r42.f122400a) == true) goto L9;
        return false;
    L9:
        if (this.f122401b == r42.f122401b) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        Object r02 = this.f122400a;
        if (r02 == null) goto L5;
        int r03 = r02.hashCode();
    L7:
        return (r03 * 31) + Boolean.hashCode(this.f122401b);
    L5:
        r03 = 0;
        goto L7
    }

    public String toString() {
        return "Event(content=" + this.f122400a + ", hasBeenHandled=" + this.f122401b + ')';
    }
}
