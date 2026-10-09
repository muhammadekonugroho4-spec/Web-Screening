package com.stockbit.usecase.trusteddevice.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final DomainExodusException f164246a;

    public c(DomainExodusException r2) {
        p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        this.f164246a = r2;
    }

    public final DomainExodusException a() {
        return this.f164246a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f164246a, ((c) r4).f164246a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f164246a.hashCode();
    }

    public String toString() {
        return "OtherError(error=" + this.f164246a + ')';
    }
}
