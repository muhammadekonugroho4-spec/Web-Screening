package com.stockbit.domain.model.notification;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f84513a;

    public f(String r1) {
        this.f84513a = r1;
    }

    public final String a() {
        return this.f84513a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof f) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f84513a, ((f) r4).f84513a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f84513a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "NotificationTokenStatusEntity(status=" + this.f84513a + ")";
    }
}
