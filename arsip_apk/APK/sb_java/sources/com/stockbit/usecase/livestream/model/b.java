package com.stockbit.usecase.livestream.model;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f158259a;

    /* renamed from: b, reason: collision with root package name */
    public final a f158260b;

    /* renamed from: c, reason: collision with root package name */
    public final String f158261c;

    public b(String r2, a r3, String r4) {
        p.l(r2, "tag");
        p.l(r3, "attr");
        p.l(r4, Constants.KEY_TEXT);
        this.f158259a = r2;
        this.f158260b = r3;
        this.f158261c = r4;
    }

    public final String a() {
        return this.f158259a;
    }

    public final a b() {
        return this.f158260b;
    }

    public final String c() {
        return this.f158261c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f158259a, r52.f158259a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f158260b, r52.f158260b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f158261c, r52.f158261c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f158259a.hashCode() * 31) + this.f158260b.hashCode()) * 31) + this.f158261c.hashCode();
    }

    public String toString() {
        return "LivestreamHtmlMetaDataUIState(tag=" + this.f158259a + ", attr=" + this.f158260b + ", text=" + this.f158261c + ")";
    }
}
