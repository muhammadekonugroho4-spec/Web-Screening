package com.stockbit.usecase.bonds.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import com.stockbit.usecase.bonds.model.l;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f154635a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154636b;

    /* renamed from: c, reason: collision with root package name */
    public final String f154637c;
    public final l d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f154638e;

    public k(String r2, String r3, String r4, l r5, boolean r6) {
        p.l(r2, "message");
        p.l(r3, "symbol");
        p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r5, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        this.f154635a = r2;
        this.f154636b = r3;
        this.f154637c = r4;
        this.d = r5;
        this.f154638e = r6;
    }

    public final String a() {
        return this.f154635a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (p.g(this.f154635a, r52.f154635a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f154636b, r52.f154636b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f154637c, r52.f154637c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f154638e == r52.f154638e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f154635a.hashCode() * 31) + this.f154636b.hashCode()) * 31) + this.f154637c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f154638e);
    }

    public String toString() {
        return "BondSellUIState(message=" + this.f154635a + ", symbol=" + this.f154636b + ", name=" + this.f154637c + ", error=" + this.d + ", isLoading=" + this.f154638e + ")";
    }

    public /* synthetic */ k(String r2, String r3, String r4, l r5, boolean r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = l.u.f154660c;
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = false;
    L17:
        boolean r72 = r6;
        l r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72);
    }
}
