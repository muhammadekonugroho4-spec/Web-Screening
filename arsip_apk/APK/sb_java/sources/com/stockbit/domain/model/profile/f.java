package com.stockbit.domain.model.profile;

import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f84668a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84669b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84670c;

    public f(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        kotlin.jvm.internal.p.l(r3, "nationalNumber");
        kotlin.jvm.internal.p.l(r4, "formatted");
        this.f84668a = r2;
        this.f84669b = r3;
        this.f84670c = r4;
    }

    public final String a() {
        return this.f84670c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (kotlin.jvm.internal.p.g(this.f84668a, r52.f84668a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f84669b, r52.f84669b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f84670c, r52.f84670c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f84668a.hashCode() * 31) + this.f84669b.hashCode()) * 31) + this.f84670c.hashCode();
    }

    public String toString() {
        return "PhoneProfileExodusEntity(countryCode=" + this.f84668a + ", nationalNumber=" + this.f84669b + ", formatted=" + this.f84670c + ")";
    }

    public /* synthetic */ f(String r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
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
