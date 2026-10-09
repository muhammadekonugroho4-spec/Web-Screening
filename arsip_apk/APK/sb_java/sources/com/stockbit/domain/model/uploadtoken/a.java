package com.stockbit.domain.model.uploadtoken;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f86608a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86609b;

    public a(String r2, String r3) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "value");
        this.f86608a = r2;
        this.f86609b = r3;
    }

    public final String a() {
        return this.f86608a;
    }

    public final String b() {
        return this.f86609b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f86608a, r52.f86608a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86609b, r52.f86609b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f86608a.hashCode() * 31) + this.f86609b.hashCode();
    }

    public String toString() {
        return "UploadHeaderDomainParam(key=" + this.f86608a + ", value=" + this.f86609b + ")";
    }
}
