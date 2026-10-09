package com.stockbit.usecase.login.model;

import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public final j f158360a;

    public h(j r2) {
        kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f158360a = r2;
    }

    public final j a() {
        return this.f158360a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof h) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f158360a, ((h) r4).f158360a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f158360a.hashCode();
    }

    public String toString() {
        return "TrustedDeviceVerification(data=" + this.f158360a + ')';
    }
}
