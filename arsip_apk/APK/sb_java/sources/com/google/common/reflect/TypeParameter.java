package com.google.common.reflect;

import com.google.common.base.Preconditions;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public abstract class TypeParameter<T> extends TypeCapture<T> {
    final TypeVariable<?> typeVariable;

    public TypeParameter() {
        Type r02 = capture();
        Preconditions.checkArgument(r02 instanceof TypeVariable, "%s should be a type variable.", r02);
        this.typeVariable = (TypeVariable) r02;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof TypeParameter) == true) goto L5;
        return false;
    L5:
        return this.typeVariable.equals(((TypeParameter) r2).typeVariable);
    }

    public final int hashCode() {
        return this.typeVariable.hashCode();
    }

    public String toString() {
        return this.typeVariable.toString();
    }
}
