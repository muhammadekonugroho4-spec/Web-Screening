package com.stockbit.datasource.request.stream.upload;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f80121a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80122b;

    public a(String r2, String r3) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "value");
        this.f80121a = r2;
        this.f80122b = r3;
    }

    public final String a() {
        return this.f80121a;
    }

    public final String b() {
        return this.f80122b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f80121a, r52.f80121a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80122b, r52.f80122b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f80121a.hashCode() * 31) + this.f80122b.hashCode();
    }

    public String toString() {
        return "UploadDataParam(key=" + this.f80121a + ", value=" + this.f80122b + ")";
    }
}
