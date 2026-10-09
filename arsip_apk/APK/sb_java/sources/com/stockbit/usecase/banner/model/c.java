package com.stockbit.usecase.banner.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public List f154399a;

    public c(List r2) {
        p.l(r2, "result");
        this.f154399a = r2;
    }

    public final List a() {
        return this.f154399a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f154399a, ((c) r4).f154399a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f154399a.hashCode();
    }

    public String toString() {
        return "BannerNotificationUIState(result=" + this.f154399a + ")";
    }
}
