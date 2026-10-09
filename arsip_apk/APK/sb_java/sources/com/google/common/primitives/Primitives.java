package com.google.common.primitives;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes5.dex */
public final class Primitives {
    private static final Map<Class<?>, Class<?>> PRIMITIVE_TO_WRAPPER_TYPE = null;
    private static final Map<Class<?>, Class<?>> WRAPPER_TO_PRIMITIVE_TYPE = null;

    static {
        LinkedHashMap r02 = new LinkedHashMap(16);
        LinkedHashMap r2 = new LinkedHashMap(16);
        add(r02, r2, Boolean.TYPE, Boolean.class);
        add(r02, r2, Byte.TYPE, Byte.class);
        add(r02, r2, Character.TYPE, Character.class);
        add(r02, r2, Double.TYPE, Double.class);
        add(r02, r2, Float.TYPE, Float.class);
        add(r02, r2, Integer.TYPE, Integer.class);
        add(r02, r2, Long.TYPE, Long.class);
        add(r02, r2, Short.TYPE, Short.class);
        add(r02, r2, Void.TYPE, Void.class);
        PRIMITIVE_TO_WRAPPER_TYPE = Collections.unmodifiableMap(r02);
        WRAPPER_TO_PRIMITIVE_TYPE = Collections.unmodifiableMap(r2);
    }

    private Primitives() {
    }

    private static void add(Map<Class<?>, Class<?>> r02, Map<Class<?>, Class<?>> r1, Class<?> r2, Class<?> r3) {
        r02.put(r2, r3);
        r1.put(r3, r2);
    }

    public static Set<Class<?>> allPrimitiveTypes() {
        return PRIMITIVE_TO_WRAPPER_TYPE.keySet();
    }

    public static Set<Class<?>> allWrapperTypes() {
        return WRAPPER_TO_PRIMITIVE_TYPE.keySet();
    }

    public static boolean isWrapperType(Class<?> r1) {
        return WRAPPER_TO_PRIMITIVE_TYPE.containsKey(Preconditions.checkNotNull(r1));
    }

    public static <T> Class<T> unwrap(Class<T> r1) {
        Preconditions.checkNotNull(r1);
        Class<T> r02 = (Class) WRAPPER_TO_PRIMITIVE_TYPE.get(r1);
        if (r02 != null) goto L5;
        return r1;
    L5:
        return r02;
    }

    public static <T> Class<T> wrap(Class<T> r1) {
        Preconditions.checkNotNull(r1);
        Class<T> r02 = (Class) PRIMITIVE_TO_WRAPPER_TYPE.get(r1);
        if (r02 != null) goto L5;
        return r1;
    L5:
        return r02;
    }
}
