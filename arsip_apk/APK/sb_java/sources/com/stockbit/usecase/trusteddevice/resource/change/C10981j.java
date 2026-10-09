package com.stockbit.usecase.trusteddevice.resource.change;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;

/* renamed from: com.stockbit.usecase.trusteddevice.resource.change.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10981j implements InterfaceC10982k {

    /* renamed from: a, reason: collision with root package name */
    public final DomainExodusException f164282a;

    public C10981j(DomainExodusException r2) {
        kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        this.f164282a = r2;
    }

    public final DomainExodusException a() {
        return this.f164282a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C10981j) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f164282a, ((C10981j) r4).f164282a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f164282a.hashCode();
    }

    public String toString() {
        return "OtherError(error=" + this.f164282a + ')';
    }
}
