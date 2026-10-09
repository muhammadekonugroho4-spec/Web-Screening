package com.stockbit.usecase.bonds.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import com.stockbit.usecase.bonds.model.l;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f154519a;

    /* renamed from: b, reason: collision with root package name */
    public final String f154520b;

    /* renamed from: c, reason: collision with root package name */
    public final String f154521c;
    public final l d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f154522e;

    public a(String r2, String r3, String r4, l r5, boolean r6) {
        p.l(r2, "message");
        p.l(r3, "symbol");
        p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r5, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        this.f154519a = r2;
        this.f154520b = r3;
        this.f154521c = r4;
        this.d = r5;
        this.f154522e = r6;
    }

    public static /* synthetic */ a b(a r02, String r1, String r2, String r3, l r4, boolean r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r02.f154519a;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r02.f154520b;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r02.f154521c;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r02.f154522e;
    L17:
        l r62 = r4;
        boolean r72 = r5;
        String r52 = r3;
        String r32 = r1;
        return r02.a(r32, r2, r52, r62, r72);
    }

    public final a a(String r8, String r9, String r10, l r11, boolean r12) {
        p.l(r8, "message");
        p.l(r9, "symbol");
        p.l(r10, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r11, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        return new a(r8, r9, r10, r11, r12);
    }

    public final String c() {
        return this.f154519a;
    }

    public final String d() {
        return this.f154521c;
    }

    public final String e() {
        return this.f154520b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f154519a, r52.f154519a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f154520b, r52.f154520b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f154521c, r52.f154521c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f154522e == r52.f154522e) goto L23;
        return false;
    L23:
        return true;
    }

    public final boolean f() {
        return this.f154522e;
    }

    public int hashCode() {
        return (((((((this.f154519a.hashCode() * 31) + this.f154520b.hashCode()) * 31) + this.f154521c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f154522e);
    }

    public String toString() {
        return "BondBuyUIState(message=" + this.f154519a + ", symbol=" + this.f154520b + ", name=" + this.f154521c + ", error=" + this.d + ", isLoading=" + this.f154522e + ")";
    }

    public /* synthetic */ a(String r2, String r3, String r4, l r5, boolean r6, int r7, kotlin.jvm.internal.i r8) {
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
