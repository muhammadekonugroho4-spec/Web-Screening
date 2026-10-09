package com.stockbit.usecase.securities.model.history.v2;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f160879a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160880b;

    public e(String r2, String r3) {
        p.l(r2, "body");
        p.l(r3, Constants.KEY_TITLE);
        this.f160879a = r2;
        this.f160880b = r3;
    }

    public final String a() {
        return this.f160879a;
    }

    public final String b() {
        return this.f160880b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f160879a, r52.f160879a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f160880b, r52.f160880b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f160879a.hashCode() * 31) + this.f160880b.hashCode();
    }

    public String toString() {
        return "TooltipContentUIState(body=" + this.f160879a + ", title=" + this.f160880b + ")";
    }
}
