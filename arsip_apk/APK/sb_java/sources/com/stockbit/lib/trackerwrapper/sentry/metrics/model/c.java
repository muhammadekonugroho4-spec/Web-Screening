package com.stockbit.lib.trackerwrapper.sentry.metrics.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f120673a;

    /* renamed from: b, reason: collision with root package name */
    public final com.stockbit.usecase.tracking.c f120674b;

    /* renamed from: c, reason: collision with root package name */
    public final List f120675c;

    public c(String r2, com.stockbit.usecase.tracking.c r3, List r4) {
        p.l(r3, "meta");
        p.l(r4, "hostTraces");
        this.f120673a = r2;
        this.f120674b = r3;
        this.f120675c = r4;
    }

    public final List a() {
        return this.f120675c;
    }

    public final com.stockbit.usecase.tracking.c b() {
        return this.f120674b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f120673a, r52.f120673a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f120674b, r52.f120674b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f120675c, r52.f120675c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f120673a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (((r03 * 31) + this.f120674b.hashCode()) * 31) + this.f120675c.hashCode();
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "NetworkMetricSnapshot(networkType=" + this.f120673a + ", meta=" + this.f120674b + ", hostTraces=" + this.f120675c + ')';
    }
}
