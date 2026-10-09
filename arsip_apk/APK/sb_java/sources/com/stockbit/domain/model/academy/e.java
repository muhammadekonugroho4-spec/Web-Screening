package com.stockbit.domain.model.academy;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f80553a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80554b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80555c;
    public final d d;

    public e(String r2, String r3, String r4, d r5) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "tag");
        p.l(r4, Constants.KEY_TEXT);
        p.l(r5, "attribute");
        this.f80553a = r2;
        this.f80554b = r3;
        this.f80555c = r4;
        this.d = r5;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f80553a, r52.f80553a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80554b, r52.f80554b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80555c, r52.f80555c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f80553a.hashCode() * 31) + this.f80554b.hashCode()) * 31) + this.f80555c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "UnboxingMaskHtmlEntity(key=" + this.f80553a + ", tag=" + this.f80554b + ", text=" + this.f80555c + ", attribute=" + this.d + ")";
    }
}
