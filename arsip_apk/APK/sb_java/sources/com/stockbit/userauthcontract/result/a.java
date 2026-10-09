package com.stockbit.userauthcontract.result;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a implements com.stockbit.userauthcontract.base.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f165703a;

    /* renamed from: b, reason: collision with root package name */
    public final String f165704b;

    static {
    }

    public a(String r2, String r3) {
        p.l(r2, "email");
        p.l(r3, RemoteConfigConstants.ResponseFieldKey.STATE);
        this.f165703a = r2;
        this.f165704b = r3;
    }

    public final String a() {
        return this.f165704b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f165703a, r52.f165703a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f165704b, r52.f165704b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f165703a.hashCode() * 31) + this.f165704b.hashCode();
    }

    public String toString() {
        return "OTPEmailResult(email=" + this.f165703a + ", state=" + this.f165704b + ')';
    }
}
