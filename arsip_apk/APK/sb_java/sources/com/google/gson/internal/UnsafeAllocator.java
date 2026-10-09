package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public abstract class UnsafeAllocator {
    public static final UnsafeAllocator INSTANCE = null;

    static {
        INSTANCE = create();
    }

    public UnsafeAllocator() {
    }

    public static /* synthetic */ void access$000(Class r02) {
        assertInstantiable(r02);
    }

    private static void assertInstantiable(Class<?> r3) {
        String r32 = ConstructorConstructor.checkInstantiable(r3);
        if (r32 != null) goto L6;
        return;
    L6:
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + r32);
    }

    private static UnsafeAllocator create() {
        Class<?> r5 = Class.forName("sun.misc.Unsafe");     // Catch: Exception -> L5
        Field r6 = r5.getDeclaredField("theUnsafe");     // Catch: Exception -> L5
        r6.setAccessible(true);     // Catch: Exception -> L5
        final Object r62 = r6.get(null);     // Catch: Exception -> L5
        final Method r52 = r5.getMethod("allocateInstance", new Class[]{Class.class});     // Catch: Exception -> L5
        return new AnonymousClass1(r52, r62);
    L5:
        Method r53 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});     // Catch: Exception -> L7
        r53.setAccessible(true);     // Catch: Exception -> L7
        final int r3 = ((Integer) r53.invoke(null, new Object[]{Object.class})).intValue();     // Catch: Exception -> L7
        final Method r1 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});     // Catch: Exception -> L7
        r1.setAccessible(true);     // Catch: Exception -> L7
        return new AnonymousClass2(r1, r3);
    L7:
        final Method r02 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});     // Catch: Exception -> L9
        r02.setAccessible(true);     // Catch: Exception -> L9
        return new AnonymousClass3(r02);
    L10:
        return new AnonymousClass4();
    }

    public abstract <T> T newInstance(Class<T> r1) throws Exception;
}
