package kotlin.jvm.internal;

import kotlin.reflect.l;
import kotlin.reflect.m;

/* loaded from: classes3.dex */
public abstract class PropertyReference0 extends PropertyReference implements kotlin.reflect.m {
    public PropertyReference0(Object r1, Class r2, String r3, String r4, int r5) {
        super(r1, r2, r3, r4, r5);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public kotlin.reflect.c computeReflected() {
        return t.g(this);
    }

    @Override // kotlin.reflect.m
    public Object getDelegate() {
        return ((kotlin.reflect.m) getReflected()).getDelegate();
    }

    @Override // kotlin.reflect.l
    public /* bridge */ /* synthetic */ l.b getGetter() {
        return getGetter();
    }

    @Override // kotlin.jvm.functions.a
    public Object invoke() {
        return get();
    }

    @Override // kotlin.reflect.l
    public m.a getGetter() {
        return ((kotlin.reflect.m) getReflected()).getGetter();
    }
}
