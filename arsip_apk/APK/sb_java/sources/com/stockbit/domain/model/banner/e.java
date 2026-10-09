package com.stockbit.domain.model.banner;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public List f80710a;

    public e(List r2) {
        p.l(r2, "result");
        this.f80710a = r2;
    }

    public final List a() {
        return this.f80710a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof e) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f80710a, ((e) r4).f80710a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f80710a.hashCode();
    }

    public String toString() {
        return "BannerNotificationEntity(result=" + this.f80710a + ")";
    }
}
