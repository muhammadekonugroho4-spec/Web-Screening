package com.skydoves.balloon.internals;

import kotlin.jvm.internal.p;
import kotlin.properties.e;
import kotlin.reflect.l;

/* loaded from: classes6.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.functions.a f44147a;

    /* renamed from: b, reason: collision with root package name */
    public Object f44148b;

    public b(Object r2, kotlin.jvm.functions.a r3) {
        p.l(r3, "invalidator");
        this.f44147a = r3;
        this.f44148b = r2;
    }

    @Override // kotlin.properties.e, kotlin.properties.d
    public Object a(Object r1, l r2) {
        p.l(r2, "property");
        return this.f44148b;
    }

    @Override // kotlin.properties.e
    public void b(Object r1, l r2, Object r3) {
        p.l(r2, "property");
        if (p.g(this.f44148b, r3) == true) goto L6;
        this.f44148b = r3;
        this.f44147a.invoke();
        return;
    }
}
