package com.stockbit.usecase.verification.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* loaded from: classes2.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final DomainExodusException f164473a;

    public e(DomainExodusException r2) {
        kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        this.f164473a = r2;
    }

    public final DomainExodusException a() {
        return this.f164473a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof e) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f164473a, ((e) r4).f164473a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f164473a.hashCode();
    }

    public String toString() {
        return "General(error=" + this.f164473a + ')';
    }
}
