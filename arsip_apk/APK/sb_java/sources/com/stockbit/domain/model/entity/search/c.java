package com.stockbit.domain.model.entity.search;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f82949a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82950b;

    public c(String r2, String r3) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, Constants.ScionAnalytics.PARAM_LABEL);
        this.f82949a = r2;
        this.f82950b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f82949a, r52.f82949a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82950b, r52.f82950b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f82949a.hashCode() * 31) + this.f82950b.hashCode();
    }

    public String toString() {
        return "SearchItemInsider(id=" + this.f82949a + ", label=" + this.f82950b + ')';
    }

    public /* synthetic */ c(String r2, String r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
