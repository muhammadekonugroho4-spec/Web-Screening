package com.tinder.scarlet.utils;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Type[] f173782a = null;

    static {
        f173782a = new Type[0];
    }

    public static Object a(Object r02, String r1) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(r1);
    }

    public static Type b(int r4, ParameterizedType r5) {
        Type[] r02 = r5.getActualTypeArguments();
        if (r4 < 0) goto L11;
        if (r4 >= r02.length) goto L11;
        Type r42 = r02[r4];
        if ((r42 instanceof WildcardType) == true) goto L9;
        return r42;
    L9:
        return ((WildcardType) r42).getUpperBounds()[0];
    L11:
        throw new IllegalArgumentException("Index " + r4 + " not in range [0," + r02.length + ") for " + r5);
    }

    public static Class c(Type r3) {
        a(r3, "type == null");
        if ((r3 instanceof Class) == false) goto L7;
        return (Class) r3;
    L7:
        if ((r3 instanceof ParameterizedType) == false) goto L15;
        Type r32 = ((ParameterizedType) r3).getRawType();
        if ((r32 instanceof Class) == false) goto L13;
        return (Class) r32;
    L13:
        throw new IllegalArgumentException();
    L15:
        if ((r3 instanceof GenericArrayType) == false) goto L19;
        return Array.newInstance(c(((GenericArrayType) r3).getGenericComponentType()), 0).getClass();
    L19:
        if ((r3 instanceof TypeVariable) == false) goto L23;
        return Object.class;
    L23:
        if ((r3 instanceof WildcardType) == false) goto L27;
        return c(((WildcardType) r3).getUpperBounds()[0]);
    L27:
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + r3 + "> is of type " + r3.getClass().getName());
    }

    public static boolean d(Type r5) {
        if ((r5 instanceof Class) == false) goto L6;
        return false;
    L6:
        if ((r5 instanceof ParameterizedType) == false) goto L15;
        Type[] r52 = ((ParameterizedType) r5).getActualTypeArguments();
        int r02 = r52.length;
        int r3 = 0;
    L8:
        if (r3 >= r02) goto L13;
        if (d(r52[r3]) == true) goto L11;
        r3 = r3 + 1;
        goto L8
    L11:
        return true;
    L13:
        return false;
    L15:
        if ((r5 instanceof GenericArrayType) == false) goto L19;
        return d(((GenericArrayType) r5).getGenericComponentType());
    L19:
        if ((r5 instanceof TypeVariable) == false) goto L22;
        return true;
    L22:
        if ((r5 instanceof WildcardType) == false) goto L24;
        return true;
    L24:
        if (r5 != null) goto L26;
        String r03 = "null";
    L28:
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + r5 + "> is of type " + r03);
    L26:
        r03 = r5.getClass().getName();
        goto L28
    }
}
