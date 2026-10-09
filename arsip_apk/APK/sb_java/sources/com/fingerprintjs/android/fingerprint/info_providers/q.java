package com.fingerprintjs.android.fingerprint.info_providers;

import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f37319a;

    public q(String r2) {
        kotlin.jvm.internal.p.l(r2, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        this.f37319a = r2;
    }

    public final String a() {
        return this.f37319a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof q) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f37319a, ((q) r4).f37319a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f37319a.hashCode();
    }

    public String toString() {
        return this.f37319a;
    }
}
