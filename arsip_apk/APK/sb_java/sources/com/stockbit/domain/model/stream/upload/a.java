package com.stockbit.domain.model.stream.upload;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f85868a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85869b;

    public a(String r2, String r3) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "value");
        this.f85868a = r2;
        this.f85869b = r3;
    }

    public final String a() {
        return this.f85868a;
    }

    public final String b() {
        return this.f85869b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f85868a, r52.f85868a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85869b, r52.f85869b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85868a.hashCode() * 31) + this.f85869b.hashCode();
    }

    public String toString() {
        return "UploadFieldEntity(key=" + this.f85868a + ", value=" + this.f85869b + ")";
    }
}
