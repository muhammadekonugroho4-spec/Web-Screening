package com.koushikdutta.ion.bitmap;

import java.lang.ref.Reference;
import java.util.Hashtable;

/* loaded from: classes6.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public Hashtable f41749a;

    public f() {
        this.f41749a = new Hashtable();
    }

    public abstract Reference a(Object r1);

    public Object b(Object r2, Object r3) {
        Reference r22 = (Reference) this.f41749a.put(r2, a(r3));
        if (r22 != null) goto L7;
        return null;
    L7:
        return r22.get();
    }

    public Object c(Object r2) {
        Reference r22 = (Reference) this.f41749a.remove(r2);
        if (r22 != null) goto L7;
        return null;
    L7:
        return r22.get();
    }
}
