package com.stockbit.usecase.trusteddevice.resource.login;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* loaded from: classes2.dex */
public final class q implements r {

    /* renamed from: a, reason: collision with root package name */
    public final DomainExodusException f164344a;

    public q(DomainExodusException r2) {
        kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        this.f164344a = r2;
    }

    public final DomainExodusException a() {
        return this.f164344a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof q) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f164344a, ((q) r4).f164344a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f164344a.hashCode();
    }

    public String toString() {
        return "OtherError(error=" + this.f164344a + ')';
    }
}
