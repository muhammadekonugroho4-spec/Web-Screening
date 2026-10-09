package com.stockbit.usecase.registration.resource;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f159530a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159531b;

    public c(String r2, String r3) {
        p.l(r2, Constants.KEY_TITLE);
        this.f159530a = r2;
        this.f159531b = r3;
    }

    public final String a() {
        return this.f159531b;
    }

    public final String b() {
        return this.f159530a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f159530a, r52.f159530a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f159531b, r52.f159531b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = this.f159530a.hashCode() * 31;
        String r1 = this.f159531b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "ExceedLimitError(title=" + this.f159530a + ", desc=" + this.f159531b + ")";
    }
}
