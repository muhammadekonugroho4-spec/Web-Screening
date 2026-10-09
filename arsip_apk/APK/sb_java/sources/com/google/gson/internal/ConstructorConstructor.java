package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* loaded from: classes6.dex */
public final class ConstructorConstructor {
    private final Map<Type, InstanceCreator<?>> instanceCreators;
    private final List<ReflectionAccessFilter> reflectionFilters;
    private final boolean useJdkUnsafe;

    public ConstructorConstructor(Map<Type, InstanceCreator<?>> r1, boolean r2, List<ReflectionAccessFilter> r3) {
        this.instanceCreators = r1;
        this.useJdkUnsafe = r2;
        this.reflectionFilters = r3;
    }

    public static String checkInstantiable(Class<?> r2) {
        int r02 = r2.getModifiers();
        if (Modifier.isInterface(r02) == false) goto L7;
        return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + r2.getName();
    L7:
        if (Modifier.isAbstract(r02) == true) goto L9;
        return null;
    L9:
        return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: " + r2.getName();
    }

    private static <T> ObjectConstructor<T> newDefaultConstructor(Class<? super T> r3, ReflectionAccessFilter.FilterResult r4) {
        if (Modifier.isAbstract(r3.getModifiers()) == false) goto L25;
        return null;
    L25:
        final Constructor<? super T> r02 = r3.getDeclaredConstructor(null);     // Catch: NoSuchMethodException -> L24
        ReflectionAccessFilter.FilterResult r2 = ReflectionAccessFilter.FilterResult.ALLOW;
        if (r4 != r2) goto L9;
    L17:
        if (r4 != r2) goto L23;
        final String r32 = ReflectionHelper.tryMakeAccessible(r02);
        if (r32 == null) goto L23;
        return new AnonymousClass8(r32);
    L23:
        return new AnonymousClass9(r02);
    L9:
        if (ReflectionAccessFilterHelper.canAccess(r02, null) == true) goto L11;
    L15:
        final String r33 = "Unable to invoke no-args constructor of " + r3 + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.";
        return new AnonymousClass7(r33);
    L11:
        if (r4 != ReflectionAccessFilter.FilterResult.BLOCK_ALL) goto L17;
        if (Modifier.isPublic(r02.getModifiers()) == false) goto L15;
    L24:
        return null;
    }

    private static <T> ObjectConstructor<T> newDefaultImplementationConstructor(Type r1, Class<? super T> r2) {
        if (Collection.class.isAssignableFrom(r2) == false) goto L19;
        if (SortedSet.class.isAssignableFrom(r2) == false) goto L9;
        return new AnonymousClass10();
    L9:
        if (Set.class.isAssignableFrom(r2) == false) goto L13;
        return new AnonymousClass11();
    L13:
        if (Queue.class.isAssignableFrom(r2) == false) goto L17;
        return new AnonymousClass12();
    L17:
        return new AnonymousClass13();
    L19:
        if (Map.class.isAssignableFrom(r2) == true) goto L21;
        return null;
    L21:
        if (ConcurrentNavigableMap.class.isAssignableFrom(r2) == false) goto L25;
        return new AnonymousClass14();
    L25:
        if (ConcurrentMap.class.isAssignableFrom(r2) == false) goto L29;
        return new AnonymousClass15();
    L29:
        if (SortedMap.class.isAssignableFrom(r2) == false) goto L33;
        return new AnonymousClass16();
    L33:
        if ((r1 instanceof ParameterizedType) == false) goto L39;
        if (String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) r1).getActualTypeArguments()[0]).getRawType()) == true) goto L39;
        return new AnonymousClass17();
    L39:
        return new AnonymousClass18();
    }

    private static <T> ObjectConstructor<T> newSpecialCollectionConstructor(final Type r1, Class<? super T> r2) {
        if (EnumSet.class.isAssignableFrom(r2) == false) goto L7;
        return new AnonymousClass5(r1);
    L7:
        if (r2 == EnumMap.class) goto L9;
        return null;
    L9:
        return new AnonymousClass6(r1);
    }

    private <T> ObjectConstructor<T> newUnsafeAllocator(final Class<? super T> r3) {
        if (this.useJdkUnsafe == true) goto L5;
        final String r32 = "Unable to create instance of " + r3 + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        return new AnonymousClass20(this, r32);
    L5:
        return new AnonymousClass19(this, r3);
    }

    public <T> ObjectConstructor<T> get(TypeToken<T> r4) {
        final Type r02 = r4.getType();
        Class<? super T> r42 = r4.getRawType();
        final InstanceCreator<?> r1 = this.instanceCreators.get(r02);
        if (r1 != null) goto L5;
        final InstanceCreator<?> r12 = this.instanceCreators.get(r42);
        if (r12 != null) goto L9;
        ObjectConstructor<T> r13 = newSpecialCollectionConstructor(r02, r42);
        if (r13 == null) goto L13;
        return r13;
    L13:
        ReflectionAccessFilter.FilterResult r14 = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, r42);
        ObjectConstructor<T> r2 = newDefaultConstructor(r42, r14);
        if (r2 == null) goto L16;
        return r2;
    L16:
        ObjectConstructor<T> r03 = newDefaultImplementationConstructor(r02, r42);
        if (r03 == null) goto L19;
        return r03;
    L19:
        final String r04 = checkInstantiable(r42);
        if (r04 == null) goto L24;
        return new AnonymousClass3(this, r04);
    L24:
        if (r14 == ReflectionAccessFilter.FilterResult.ALLOW) goto L26;
        final String r43 = "Unable to create instance of " + r42 + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.";
        return new AnonymousClass4(this, r43);
    L26:
        return newUnsafeAllocator(r42);
    L9:
        return new AnonymousClass2(this, r12, r02);
    L5:
        return new AnonymousClass1(this, r1, r02);
    }

    public String toString() {
        return this.instanceCreators.toString();
    }
}
