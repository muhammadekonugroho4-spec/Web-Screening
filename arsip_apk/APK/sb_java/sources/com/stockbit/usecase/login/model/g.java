package com.stockbit.usecase.login.model;

import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public final LoginUIState f158359a;

    public g(LoginUIState r2) {
        kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f158359a = r2;
    }

    public final LoginUIState a() {
        return this.f158359a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof g) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f158359a, ((g) r4).f158359a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f158359a.hashCode();
    }

    public String toString() {
        return "LoginSuccess(data=" + this.f158359a + ')';
    }
}
