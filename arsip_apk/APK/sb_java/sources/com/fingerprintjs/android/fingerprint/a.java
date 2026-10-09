package com.fingerprintjs.android.fingerprint;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f37046a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fingerprintjs.android.fingerprint.tools.hashers.a f37047b;

    public a(int r2, com.fingerprintjs.android.fingerprint.tools.hashers.a r3) {
        p.l(r3, "hasher");
        this.f37046a = r2;
        this.f37047b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f37046a == r52.f37046a) goto L12;
        return false;
    L12:
        if (p.g(this.f37047b, r52.f37047b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f37046a) * 31) + this.f37047b.hashCode();
    }

    public String toString() {
        return "Configuration(version=" + this.f37046a + ", hasher=" + this.f37047b + ')';
    }

    public /* synthetic */ a(int r1, com.fingerprintjs.android.fingerprint.tools.hashers.a r2, int r3, i r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = new com.fingerprintjs.android.fingerprint.tools.hashers.b();
    L5:
        this(r1, r2);
    }
}
