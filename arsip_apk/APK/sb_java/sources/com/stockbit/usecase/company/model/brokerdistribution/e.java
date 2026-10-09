package com.stockbit.usecase.company.model.brokerdistribution;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f156193a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156194b;

    /* renamed from: c, reason: collision with root package name */
    public final float f156195c;
    public final BrokerGroupType d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f156196e;

    public e(String r2, String r3, float r4, BrokerGroupType r5, boolean r6) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, Constants.ScionAnalytics.PARAM_LABEL);
        p.l(r5, "group");
        this.f156193a = r2;
        this.f156194b = r3;
        this.f156195c = r4;
        this.d = r5;
        this.f156196e = r6;
    }

    public final BrokerGroupType a() {
        return this.d;
    }

    public final String b() {
        return this.f156193a;
    }

    public final String c() {
        return this.f156194b;
    }

    public final float d() {
        return this.f156195c;
    }

    public final boolean e() {
        return this.f156196e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f156193a, r52.f156193a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156194b, r52.f156194b) == true) goto L15;
        return false;
    L15:
        if (Float.compare(this.f156195c, r52.f156195c) == 0) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f156196e == r52.f156196e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f156193a.hashCode() * 31) + this.f156194b.hashCode()) * 31) + Float.hashCode(this.f156195c)) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f156196e);
    }

    public String toString() {
        return "SankeyNodeUIState(id=" + this.f156193a + ", label=" + this.f156194b + ", totalValue=" + this.f156195c + ", group=" + this.d + ", isSource=" + this.f156196e + ")";
    }
}
