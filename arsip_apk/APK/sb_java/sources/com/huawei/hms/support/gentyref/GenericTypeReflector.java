package com.huawei.hms.support.gentyref;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes6.dex */
public final class GenericTypeReflector {
    private GenericTypeReflector() {
    }

    public static Class<?> getType(Type r3) {
        if ((r3 instanceof Class) == false) goto L7;
        return (Class) r3;
    L7:
        if ((r3 instanceof ParameterizedType) == false) goto L11;
        return (Class) ((ParameterizedType) r3).getRawType();
    L11:
        if ((r3 instanceof TypeVariable) == false) goto L19;
        TypeVariable r32 = (TypeVariable) r3;
        if (r32.getBounds().length != 0) goto L17;
        return Object.class;
    L17:
        return getType(r32.getBounds()[0]);
    L19:
        throw new IllegalArgumentException("not supported: " + r3.getClass());
    }
}
