package kotlin.jvm.internal;

import kotlin.reflect.i;
import kotlin.reflect.j;
import kotlin.reflect.l;
import kotlin.reflect.m;

/* loaded from: classes3.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements kotlin.reflect.j {
    public MutablePropertyReference0(Object r1, Class r2, String r3, String r4, int r5) {
        super(r1, r2, r3, r4, r5);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public kotlin.reflect.c computeReflected() {
        return t.e(this);
    }

    @Override // kotlin.reflect.i
    public /* bridge */ /* synthetic */ i.a f() {
        return f();
    }

    @Override // kotlin.reflect.m
    public Object getDelegate() {
        return ((kotlin.reflect.j) getReflected()).getDelegate();
    }

    @Override // kotlin.reflect.l
    public /* bridge */ /* synthetic */ l.b getGetter() {
        return getGetter();
    }

    @Override // kotlin.jvm.functions.a
    public Object invoke() {
        return get();
    }

    @Override // kotlin.reflect.i
    public j.a f() {
        return ((kotlin.reflect.j) getReflected()).f();
    }

    @Override // kotlin.reflect.l
    public m.a getGetter() {
        return ((kotlin.reflect.j) getReflected()).getGetter();
    }
}
