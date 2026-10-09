package com.airbnb.lottie;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f31212a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f31213b;

    public k(Object r1) {
        this.f31212a = r1;
        this.f31213b = null;
    }

    public Throwable a() {
        return this.f31213b;
    }

    public Object b() {
        return this.f31212a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (b() == null) goto L14;
        if (b().equals(r52.b()) == false) goto L14;
        return true;
    L14:
        if (a() != null) goto L16;
    L19:
        return false;
    L16:
        if (r52.a() == null) goto L19;
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public k(Throwable r1) {
        this.f31213b = r1;
        this.f31212a = null;
    }
}
