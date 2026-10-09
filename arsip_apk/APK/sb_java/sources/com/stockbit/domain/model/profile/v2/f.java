package com.stockbit.domain.model.profile.v2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f84841a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84842b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84843c;

    public f(String r2, String r3, String r4) {
        p.l(r2, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        p.l(r3, "nationalNumber");
        p.l(r4, "formatted");
        this.f84841a = r2;
        this.f84842b = r3;
        this.f84843c = r4;
    }

    public final String a() {
        return this.f84843c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f84841a, r52.f84841a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84842b, r52.f84842b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84843c, r52.f84843c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f84841a.hashCode() * 31) + this.f84842b.hashCode()) * 31) + this.f84843c.hashCode();
    }

    public String toString() {
        return "MyProfilePhoneEntity(countryCode=" + this.f84841a + ", nationalNumber=" + this.f84842b + ", formatted=" + this.f84843c + ")";
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
