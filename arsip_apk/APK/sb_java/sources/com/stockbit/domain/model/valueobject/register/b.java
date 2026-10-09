package com.stockbit.domain.model.valueobject.register;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f86930a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86931b;

    public b(boolean r2, String r3) {
        p.l(r3, RemoteConfigConstants.ResponseFieldKey.STATE);
        this.f86930a = r2;
        this.f86931b = r3;
    }

    public final String a() {
        return this.f86931b;
    }

    public final boolean b() {
        return this.f86930a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f86930a == r52.f86930a) goto L12;
        return false;
    L12:
        if (p.g(this.f86931b, r52.f86931b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f86930a) * 31) + this.f86931b.hashCode();
    }

    public String toString() {
        return "ValidVerifyEmail(valid=" + this.f86930a + ", state=" + this.f86931b + ')';
    }

    public /* synthetic */ b(boolean r1, String r2, int r3, i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = false;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = "";
    L8:
        this(r1, r2);
    }
}
