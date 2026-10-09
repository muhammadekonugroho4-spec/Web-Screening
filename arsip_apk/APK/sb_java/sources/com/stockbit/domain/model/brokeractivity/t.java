package com.stockbit.domain.model.brokeractivity;

import com.clevertap.android.sdk.Constants;
import java.util.List;

/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final List f80932a;

    /* renamed from: b, reason: collision with root package name */
    public final s f80933b;

    public t(List r2, s r3) {
        kotlin.jvm.internal.p.l(r2, "list");
        kotlin.jvm.internal.p.l(r3, Constants.KEY_DATE);
        this.f80932a = r2;
        this.f80933b = r3;
    }

    public final s a() {
        return this.f80933b;
    }

    public final List b() {
        return this.f80932a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof t) == true) goto L8;
        return false;
    L8:
        t r52 = (t) r5;
        if (kotlin.jvm.internal.p.g(this.f80932a, r52.f80932a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80933b, r52.f80933b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f80932a.hashCode() * 31) + this.f80933b.hashCode();
    }

    public String toString() {
        return "BrokerActivityEntity(list=" + this.f80932a + ", date=" + this.f80933b + ")";
    }
}
