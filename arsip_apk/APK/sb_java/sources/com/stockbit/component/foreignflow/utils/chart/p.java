package com.stockbit.component.foreignflow.utils.chart;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;

/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final List f72155a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f72156b;

    public p(List r2, boolean r3) {
        kotlin.jvm.internal.p.l(r2, RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        this.f72155a = r2;
        this.f72156b = r3;
    }

    public final List a() {
        return this.f72155a;
    }

    public final boolean b() {
        return this.f72156b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof p) == true) goto L8;
        return false;
    L8:
        p r52 = (p) r5;
        if (kotlin.jvm.internal.p.g(this.f72155a, r52.f72155a) == true) goto L12;
        return false;
    L12:
        if (this.f72156b == r52.f72156b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f72155a.hashCode() * 31) + Boolean.hashCode(this.f72156b);
    }

    public String toString() {
        return "LineEntries(entries=" + this.f72155a + ", hasMultipleValues=" + this.f72156b + ')';
    }
}
