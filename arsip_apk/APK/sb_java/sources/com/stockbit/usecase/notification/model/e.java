package com.stockbit.usecase.notification.model;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final String f158645a;

    public e(String r2) {
        p.l(r2, Constants.ScionAnalytics.PARAM_LABEL);
        this.f158645a = r2;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof e) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f158645a, ((e) r4).f158645a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // com.stockbit.usecase.notification.model.g
    public String getLabel() {
        return this.f158645a;
    }

    public int hashCode() {
        return this.f158645a.hashCode();
    }

    public String toString() {
        return "NotificationSettingHeaderUIState(label=" + this.f158645a + ")";
    }
}
