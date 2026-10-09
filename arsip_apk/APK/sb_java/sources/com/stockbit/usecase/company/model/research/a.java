package com.stockbit.usecase.company.model.research;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f156560a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156561b;

    public a(b r2, String r3) {
        p.l(r2, "link");
        p.l(r3, Constants.KEY_TEXT);
        this.f156560a = r2;
        this.f156561b = r3;
    }

    public final b a() {
        return this.f156560a;
    }

    public final String b() {
        return this.f156561b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f156560a, r52.f156560a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156561b, r52.f156561b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f156560a.hashCode() * 31) + this.f156561b.hashCode();
    }

    public String toString() {
        return "MaskedTextContentUIState(link=" + this.f156560a + ", text=" + this.f156561b + ")";
    }
}
