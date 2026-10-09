package com.stockbit.common.utils;

/* renamed from: com.stockbit.common.utils.w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C5872w {

    /* renamed from: c, reason: collision with root package name */
    public static final int f62407c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final Object f62408a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f62409b;

    static {
    }

    public C5872w(Object r1) {
        this.f62408a = r1;
    }

    public final Object a() {
        if (this.f62409b == false) goto L6;
        return null;
    L6:
        this.f62409b = true;
        return this.f62408a;
    }

    public final Object b() {
        return this.f62408a;
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof C5872w) == true) goto L5;
        return false;
    L5:
        C5872w r42 = (C5872w) r4;
        if (kotlin.jvm.internal.p.g(this.f62408a, r42.f62408a) == true) goto L9;
        return false;
    L9:
        if (this.f62409b == r42.f62409b) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        Object r02 = this.f62408a;
        if (r02 == null) goto L5;
        int r03 = r02.hashCode();
    L7:
        return (r03 * 31) + Boolean.hashCode(this.f62409b);
    L5:
        r03 = 0;
        goto L7
    }

    public String toString() {
        return "Event(content=" + this.f62408a + ", hasBeenHandled=" + this.f62409b + ')';
    }
}
