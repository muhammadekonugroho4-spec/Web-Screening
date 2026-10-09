package com.stockbit.feature.transaction.ui.amend.compose;

import com.stockbit.features.model.DomainSecuritiesError;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f109511a;

    /* renamed from: b, reason: collision with root package name */
    public final DomainSecuritiesError f109512b;

    static {
    }

    public n(String r2, DomainSecuritiesError r3) {
        p.l(r2, "message");
        p.l(r3, "errorType");
        this.f109511a = r2;
        this.f109512b = r3;
    }

    public final DomainSecuritiesError a() {
        return this.f109512b;
    }

    public final String b() {
        return this.f109511a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (p.g(this.f109511a, r52.f109511a) == true) goto L12;
        return false;
    L12:
        if (this.f109512b == r52.f109512b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f109511a.hashCode() * 31) + this.f109512b.hashCode();
    }

    public String toString() {
        return "SuspendedErrorState(message=" + this.f109511a + ", errorType=" + this.f109512b + ')';
    }
}
