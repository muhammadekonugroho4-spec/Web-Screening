package org.koin.core.definition;

import kotlin.jvm.functions.l;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final l f182568a;

    public b(l r1) {
        this.f182568a = r1;
    }

    public final l a() {
        return this.f182568a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f182568a, ((b) r4).f182568a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        l r02 = this.f182568a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "Callbacks(onClose=" + this.f182568a + ')';
    }

    public /* synthetic */ b(l r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }
}
