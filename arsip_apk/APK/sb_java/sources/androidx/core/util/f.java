package androidx.core.util;

import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f23080a;

    /* renamed from: b, reason: collision with root package name */
    public int f23081b;

    public f(int r2) {
        if (r2 <= 0) goto L7;
        this.f23080a = new Object[r2];
        return;
    L7:
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // androidx.core.util.e
    public boolean a(Object r4) {
        p.l(r4, "instance");
        if (b(r4) == true) goto L11;
        int r02 = this.f23081b;
        Object[] r1 = this.f23080a;
        if (r02 >= r1.length) goto L8;
        r1[r02] = r4;
        this.f23081b = r02 + 1;
        return true;
    L8:
        return false;
    L11:
        throw new IllegalStateException("Already in the pool!");
    }

    @Override // androidx.core.util.e
    public Object acquire() {
        int r02 = this.f23081b;
        if (r02 <= 0) goto L6;
        int r03 = r02 - 1;
        Object r2 = this.f23080a[r03];
        p.j(r2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f23080a[r03] = null;
        this.f23081b--;
        return r2;
    L6:
        return null;
    }

    public final boolean b(Object r5) {
        int r02 = this.f23081b;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L9;
        if (this.f23080a[r2] == r5) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }
}
