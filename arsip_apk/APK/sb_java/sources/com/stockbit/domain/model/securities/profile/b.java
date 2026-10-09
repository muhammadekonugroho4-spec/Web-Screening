package com.stockbit.domain.model.securities.profile;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f85722a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85723b;

    public b(String r2, String r3) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "value");
        this.f85722a = r2;
        this.f85723b = r3;
    }

    public final String a() {
        return this.f85722a;
    }

    public final String b() {
        return this.f85723b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f85722a, r52.f85722a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85723b, r52.f85723b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85722a.hashCode() * 31) + this.f85723b.hashCode();
    }

    public String toString() {
        return "PersonalAmendUploadBodyEntity(key=" + this.f85722a + ", value=" + this.f85723b + ")";
    }
}
