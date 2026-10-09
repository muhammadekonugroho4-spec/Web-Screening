package com.tinder.scarlet.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class d {
    public static final Type a(ParameterizedType r1, int r2) {
        p.l(r1, "$this$getParameterUpperBound");
        Type r12 = e.b(r2, r1);
        p.k(r12, "Utils.getParameterUpperBound(index, this)");
        return r12;
    }

    public static final Class b(Type r1) {
        p.l(r1, "$this$getRawType");
        Class r12 = e.c(r1);
        p.k(r12, "Utils.getRawType(this)");
        return r12;
    }

    public static final boolean c(Type r1) {
        p.l(r1, "$this$hasUnresolvableType");
        return e.d(r1);
    }
}
