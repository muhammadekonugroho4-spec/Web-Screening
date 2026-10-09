package androidx.arch.core.internal;

import androidx.arch.core.internal.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a extends b {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f3702e;

    public a() {
        this.f3702e = new HashMap();
    }

    @Override // androidx.arch.core.internal.b
    public b.c b(Object r2) {
        return (b.c) this.f3702e.get(r2);
    }

    public boolean contains(Object r2) {
        return this.f3702e.containsKey(r2);
    }

    @Override // androidx.arch.core.internal.b
    public Object g(Object r2, Object r3) {
        b.c r02 = b(r2);
        if (r02 != null) goto L5;
        this.f3702e.put(r2, f(r2, r3));
        return null;
    L5:
        return r02.f3707b;
    }

    @Override // androidx.arch.core.internal.b
    public Object h(Object r3) {
        Object r02 = super.h(r3);
        this.f3702e.remove(r3);
        return r02;
    }

    public Map.Entry j(Object r2) {
        if (contains(r2) == true) goto L5;
        return null;
    L5:
        return ((b.c) this.f3702e.get(r2)).d;
    }
}
