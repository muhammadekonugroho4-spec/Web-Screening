package com.stockbit.usecase.chat.model.search;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f155637a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155638b;

    /* renamed from: c, reason: collision with root package name */
    public final String f155639c;

    public e(String r2, String r3, String r4) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "parent");
        this.f155637a = r2;
        this.f155638b = r3;
        this.f155639c = r4;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f155637a, r52.f155637a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f155638b, r52.f155638b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f155639c, r52.f155639c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f155637a.hashCode() * 31) + this.f155638b.hashCode()) * 31) + this.f155639c.hashCode();
    }

    public String toString() {
        return "SearchSectorUIState(id=" + this.f155637a + ", name=" + this.f155638b + ", parent=" + this.f155639c + ")";
    }
}
