package com.stockbit.domain.model.user;

import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f86662a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86663b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86664c;

    public m(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        kotlin.jvm.internal.p.l(r3, "nationalNumber");
        kotlin.jvm.internal.p.l(r4, "formatted");
        this.f86662a = r2;
        this.f86663b = r3;
        this.f86664c = r4;
    }

    public final String a() {
        return this.f86664c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (kotlin.jvm.internal.p.g(this.f86662a, r52.f86662a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86663b, r52.f86663b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f86664c, r52.f86664c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f86662a.hashCode() * 31) + this.f86663b.hashCode()) * 31) + this.f86664c.hashCode();
    }

    public String toString() {
        return "ProfileSocialPhoneEntity(countryCode=" + this.f86662a + ", nationalNumber=" + this.f86663b + ", formatted=" + this.f86664c + ")";
    }

    public /* synthetic */ m(String r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
