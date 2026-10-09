package com.stockbit.domain.model.networkdiagnostic;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f84464a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84465b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84466c;
    public final String d;

    public c(String r2, String r3, String r4, String r5) {
        p.l(r2, "platform");
        p.l(r3, "osVersion");
        p.l(r4, "model");
        p.l(r5, RemoteConfigConstants.RequestFieldKey.APP_VERSION);
        this.f84464a = r2;
        this.f84465b = r3;
        this.f84466c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f84466c;
    }

    public final String c() {
        return this.f84465b;
    }

    public final String d() {
        return this.f84464a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f84464a, r52.f84464a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84465b, r52.f84465b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84466c, r52.f84466c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f84464a.hashCode() * 31) + this.f84465b.hashCode()) * 31) + this.f84466c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "DeviceInfoEntity(platform=" + this.f84464a + ", osVersion=" + this.f84465b + ", model=" + this.f84466c + ", appVersion=" + this.d + ")";
    }
}
