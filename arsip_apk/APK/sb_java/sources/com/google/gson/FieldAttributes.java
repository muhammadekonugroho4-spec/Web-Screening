package com.google.gson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class FieldAttributes {
    private final Field field;

    public FieldAttributes(Field r1) {
        Objects.requireNonNull(r1);
        this.field = r1;
    }

    public <T extends Annotation> T getAnnotation(Class<T> r2) {
        return (T) this.field.getAnnotation(r2);
    }

    public Collection<Annotation> getAnnotations() {
        return Arrays.asList(this.field.getAnnotations());
    }

    public Class<?> getDeclaredClass() {
        return this.field.getType();
    }

    public Type getDeclaredType() {
        return this.field.getGenericType();
    }

    public Class<?> getDeclaringClass() {
        return this.field.getDeclaringClass();
    }

    public String getName() {
        return this.field.getName();
    }

    public boolean hasModifier(int r2) {
        if ((r2 & this.field.getModifiers()) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public String toString() {
        return this.field.toString();
    }
}
