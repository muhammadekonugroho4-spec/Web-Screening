package com.google.gson.internal.reflect;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public class ReflectionHelper {
    private static final RecordHelper RECORD_HELPER = null;

    /* renamed from: com.google.gson.internal.reflect.ReflectionHelper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static abstract class RecordHelper {
        private RecordHelper() {
        }

        public abstract Method getAccessor(Class<?> r1, Field r2);

        public abstract <T> Constructor<T> getCanonicalRecordConstructor(Class<T> r1);

        public abstract String[] getRecordComponentNames(Class<?> r1);

        public abstract boolean isRecord(Class<?> r1);

        public /* synthetic */ RecordHelper(AnonymousClass1 r1) {
            this();
        }
    }

    public static class RecordNotSupportedHelper extends RecordHelper {
        private RecordNotSupportedHelper() {
            super(null);
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public Method getAccessor(Class<?> r1, Field r2) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public <T> Constructor<T> getCanonicalRecordConstructor(Class<T> r2) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public String[] getRecordComponentNames(Class<?> r2) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public boolean isRecord(Class<?> r1) {
            return false;
        }

        public /* synthetic */ RecordNotSupportedHelper(AnonymousClass1 r1) {
            this();
        }
    }

    public static class RecordSupportedHelper extends RecordHelper {
        private final Method getName;
        private final Method getRecordComponents;
        private final Method getType;
        private final Method isRecord;

        public /* synthetic */ RecordSupportedHelper(AnonymousClass1 r1) throws NoSuchMethodException {
            this();
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public Method getAccessor(Class<?> r2, Field r3) {
            return r2.getMethod(r3.getName(), null);
        L4:
            e = move-exception;
            throw ReflectionHelper.access$300(e);
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public <T> Constructor<T> getCanonicalRecordConstructor(Class<T> r7) {
            Object[] r02 = (Object[]) this.getRecordComponents.invoke(r7, null);     // Catch: ReflectiveOperationException -> L6
            Class<?>[] r2 = new Class[r02.length];     // Catch: ReflectiveOperationException -> L6
            int r3 = 0;
        L4:
            if (r3 >= r02.length) goto L8;
            r2[r3] = (Class) this.getType.invoke(r02[r3], null);     // Catch: ReflectiveOperationException -> L6
            r3 = r3 + 1;     // Catch: ReflectiveOperationException -> L6
            goto L4
        L8:
            return r7.getDeclaredConstructor(r2);
        L6:
            e = move-exception;
            throw ReflectionHelper.access$300(e);
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public String[] getRecordComponentNames(Class<?> r6) {
            Object[] r62 = (Object[]) this.getRecordComponents.invoke(r6, null);     // Catch: ReflectiveOperationException -> L7
            String[] r02 = new String[r62.length];     // Catch: ReflectiveOperationException -> L7
            int r2 = 0;
        L3:
            if (r2 >= r62.length) goto L9;
            r02[r2] = (String) this.getName.invoke(r62[r2], null);     // Catch: ReflectiveOperationException -> L7
            r2 = r2 + 1;
            goto L3
        L9:
            return r02;
        L7:
            e = move-exception;
            throw ReflectionHelper.access$300(e);
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public boolean isRecord(Class<?> r3) {
            return ((Boolean) this.isRecord.invoke(r3, null)).booleanValue();
        L4:
            e = move-exception;
            throw ReflectionHelper.access$300(e);
        }

        private RecordSupportedHelper() throws NoSuchMethodException {
            super(null);
            this.isRecord = Class.class.getMethod("isRecord", null);
            Method r1 = Class.class.getMethod("getRecordComponents", null);
            this.getRecordComponents = r1;
            Class<?> r12 = r1.getReturnType().getComponentType();
            this.getName = r12.getMethod("getName", null);
            this.getType = r12.getMethod("getType", null);
        }
    }

    static {
        AnonymousClass1 r02 = null;
        RecordHelper r1 = new RecordSupportedHelper(r02);     // Catch: NoSuchMethodException -> L5
    L6:
        RECORD_HELPER = r1;
        return;
    L5:
        r1 = new RecordNotSupportedHelper(r02);
        goto L6
    }

    private ReflectionHelper() {
    }

    public static /* synthetic */ RuntimeException access$300(ReflectiveOperationException r02) {
        return createExceptionForRecordReflectionException(r02);
    }

    private static void appendExecutableParameters(AccessibleObject r2, StringBuilder r3) {
        r3.append('(');
        if ((r2 instanceof Method) == false) goto L5;
        Class<?>[] r22 = ((Method) r2).getParameterTypes();
    L6:
        int r02 = 0;
    L8:
        if (r02 >= r22.length) goto L12;
        if (r02 <= 0) goto L11;
        r3.append(", ");
    L11:
        r3.append(r22[r02].getSimpleName());
        r02 = r02 + 1;
        goto L8
    L12:
        r3.append(')');
        return;
    L5:
        r22 = ((Constructor) r2).getParameterTypes();
        goto L6
    }

    public static String constructorToString(Constructor<?> r2) {
        StringBuilder r02 = new StringBuilder(r2.getDeclaringClass().getName());
        appendExecutableParameters(r2, r02);
        return r02.toString();
    }

    private static RuntimeException createExceptionForRecordReflectionException(ReflectiveOperationException r2) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", r2);
    }

    public static RuntimeException createExceptionForUnexpectedIllegalAccess(IllegalAccessException r2) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", r2);
    }

    public static String fieldToString(Field r2) {
        return r2.getDeclaringClass().getName() + "#" + r2.getName();
    }

    public static String getAccessibleObjectDescription(AccessibleObject r4, boolean r5) {
        if ((r4 instanceof Field) == false) goto L6;
        String r42 = "field '" + fieldToString((Field) r4) + "'";
    L12:
        if (r5 == true) goto L14;
        return r42;
    L14:
        if (Character.isLowerCase(r42.charAt(0)) == true) goto L16;
        return r42;
    L16:
        return Character.toUpperCase(r42.charAt(0)) + r42.substring(1);
    L6:
        if ((r4 instanceof Method) == false) goto L9;
        Method r43 = (Method) r4;
        StringBuilder r02 = new StringBuilder(r43.getName());
        appendExecutableParameters(r43, r02);
        r42 = "method '" + r43.getDeclaringClass().getName() + "#" + r02.toString() + "'";
        goto L12
    L9:
        if ((r4 instanceof Constructor) == false) goto L11;
        r42 = "constructor '" + constructorToString((Constructor) r4) + "'";
        goto L12
    L11:
        r42 = "<unknown AccessibleObject> " + r4.toString();
        goto L12
    }

    public static Method getAccessor(Class<?> r1, Field r2) {
        return RECORD_HELPER.getAccessor(r1, r2);
    }

    public static <T> Constructor<T> getCanonicalRecordConstructor(Class<T> r1) {
        return RECORD_HELPER.getCanonicalRecordConstructor(r1);
    }

    public static String[] getRecordComponentNames(Class<?> r1) {
        return RECORD_HELPER.getRecordComponentNames(r1);
    }

    public static boolean isRecord(Class<?> r1) {
        return RECORD_HELPER.isRecord(r1);
    }

    public static void makeAccessible(AccessibleObject r4) throws JsonIOException {
        r4.setAccessible(true);     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        throw new JsonIOException("Failed making " + getAccessibleObjectDescription(r4, false) + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.", e);
    }

    public static String tryMakeAccessible(Constructor<?> r3) {
        r3.setAccessible(true);     // Catch: Exception -> L6
        return null;
    L6:
        e = move-exception;
        return "Failed making constructor '" + constructorToString(r3) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage();
    }
}
