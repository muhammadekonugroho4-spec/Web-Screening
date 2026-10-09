package com.google.common.reflect;

import com.google.common.base.Preconditions;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
abstract class TypeCapture<T> {
    public TypeCapture() {
    }

    public final Type capture() {
        Type r02 = getClass().getGenericSuperclass();
        Preconditions.checkArgument(r02 instanceof ParameterizedType, "%s isn't parameterized", r02);
        return ((ParameterizedType) r02).getActualTypeArguments()[0];
    }
}
