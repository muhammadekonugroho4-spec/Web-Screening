package com.stockbit.domain.model.valueobject.googlecloud;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f86835a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86836b;

    public a(String r2, String r3) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "value");
        this.f86835a = r2;
        this.f86836b = r3;
    }

    public final String a() {
        return this.f86835a;
    }

    public final String b() {
        return this.f86836b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f86835a, r52.f86835a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86836b, r52.f86836b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f86835a.hashCode() * 31) + this.f86836b.hashCode();
    }

    public String toString() {
        return "GoogleUploadHeader(key=" + this.f86835a + ", value=" + this.f86836b + ')';
    }
}
