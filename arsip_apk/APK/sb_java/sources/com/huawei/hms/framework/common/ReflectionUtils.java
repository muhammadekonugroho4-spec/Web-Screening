package com.huawei.hms.framework.common;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.AccessController;

/* loaded from: classes6.dex */
public class ReflectionUtils {
    private static final String TAG = "ReflectionUtils";

    public ReflectionUtils() {
    }

    public static boolean checkCompatible(String r1) {
        tryLoadClass(r1);     // Catch: Exception -> L5
        return true;
    L5:
        Logger.w(TAG, r1 + "ClassNotFoundException");
        return false;
    }

    private static Class<?> getClass(String r1) {
        if (r1 != null) goto L8;
        return null;
    L8:
        return Class.forName(r1);
    L7:
        return null;
    }

    public static Field getField(Object r3, String r4) {
        if (r3 != null) goto L5;
    L19:
        return null;
    L5:
        if (TextUtils.isEmpty(r4) == true) goto L19;
        final Field r32 = r3.getClass().getDeclaredField(r4);     // Catch: SecurityException -> L10 NoSuchFieldException -> L12 IllegalArgumentException -> L14
        AccessController.doPrivileged(new AnonymousClass2(r32));     // Catch: SecurityException -> L10 NoSuchFieldException -> L12 IllegalArgumentException -> L14
        return r32;
    L14:
        e = move-exception;
        Logger.e(TAG, "Exception in getField :: IllegalArgumentException:", e);
    L12:
        e = move-exception;
        Logger.e(TAG, "Exception in getField :: NoSuchFieldException:", e);
    L10:
        e = move-exception;
        Logger.e(TAG, "not security int method getField,SecurityException:", e);
        goto L19
    }

    public static Object getFieldObj(Object r3, String r4) {
        if (r3 != null) goto L5;
    L22:
        return null;
    L5:
        if (TextUtils.isEmpty(r4) == true) goto L22;
        final Field r42 = r3.getClass().getDeclaredField(r4);     // Catch: SecurityException -> L10 NoSuchFieldException -> L12 IllegalArgumentException -> L14 IllegalAccessException -> L16
        AccessController.doPrivileged(new AnonymousClass1(r42));     // Catch: SecurityException -> L10 NoSuchFieldException -> L12 IllegalArgumentException -> L14 IllegalAccessException -> L16
        return r42.get(r3);
    L16:
        e = move-exception;
        Logger.e(TAG, "Exception in getFieldObj :: IllegalAccessException:", e);
    L14:
        e = move-exception;
        Logger.e(TAG, "Exception in getFieldObj :: IllegalArgumentException:", e);
    L12:
        e = move-exception;
        Logger.e(TAG, "Exception in getFieldObj :: NoSuchFieldException:", e);
    L10:
        e = move-exception;
        Logger.e(TAG, "not security int method getFieldObj,SecurityException:", e);
        goto L22
    }

    public static Method getMethod(Class<?> r2, String r3, Class<?>... r4) {
        if (r2 == null) goto L13;
        if (r3 == null) goto L13;
        return r2.getDeclaredMethod(r3, r4);
    L8:
        e = move-exception;
        Logger.e(TAG, "NoSuchMethodException:", e);
    L12:
        return null;
    L10:
        e = move-exception;
        Logger.e(TAG, "SecurityException:", e);
    L13:
        Logger.w(TAG, "targetClass is  null pr name is null:");
        return null;
    }

    public static Object getStaticFieldObj(String r3, String r4) {
        if (r3 != null) goto L5;
        return null;
    L5:
        Class<?> r32 = getClass(r3);
        if (r32 != null) goto L8;
    L24:
        return null;
    L8:
        if (TextUtils.isEmpty(r4) == true) goto L24;
        final Field r42 = r32.getDeclaredField(r4);     // Catch: SecurityException -> L12 NoSuchFieldException -> L14 IllegalArgumentException -> L16 IllegalAccessException -> L18
        AccessController.doPrivileged(new AnonymousClass3(r42));     // Catch: SecurityException -> L12 NoSuchFieldException -> L14 IllegalArgumentException -> L16 IllegalAccessException -> L18
        return r42.get(r32);
    L18:
        e = move-exception;
        Logger.e(TAG, "Exception in getFieldObj :: IllegalAccessException:", e);
    L16:
        e = move-exception;
        Logger.e(TAG, "Exception in getFieldObj :: IllegalArgumentException:", e);
    L14:
        e = move-exception;
        Logger.e(TAG, "Exception in getFieldObj :: NoSuchFieldException:", e);
    L12:
        e = move-exception;
        Logger.e(TAG, "not security int method getStaticFieldObj,SecurityException:", e);
        goto L24
    }

    private static Object invoke(Object r2, Method r3, Object... r4) throws UnsupportedOperationException {
        if (r3 != null) goto L12;
        return null;
    L12:
        return r3.invoke(r2, r4);
    L9:
        e = move-exception;
        Logger.e(TAG, "RuntimeException in invoke:", e);
    L11:
        return null;
    L7:
        e = move-exception;
        Logger.e(TAG, "Exception in invoke:", e);
        goto L11
    }

    public static Object invokeStaticMethod(String r5, String r6, Object... r7) {
        if (r5 != null) goto L5;
        return null;
    L5:
        if (r7 == null) goto L9;
        int r1 = r7.length;
        Class[] r2 = new Class[r1];
        int r3 = 0;
    L7:
        if (r3 >= r1) goto L10;
        setClassType(r2, r7[r3], r3);
        r3 = r3 + 1;
    L10:
        Method r52 = getMethod(getClass(r5), r6, r2);
        if (r52 != null) goto L14;
        return null;
    L14:
        return invoke(null, r52, r7);
    L9:
        r2 = null;
        goto L10
    }

    private static void setClassType(Class<?>[] r1, Object r2, int r3) {
        if ((r2 instanceof Integer) == false) goto L7;
        r1[r3] = Integer.TYPE;
        return;
    L7:
        if ((r2 instanceof Long) == false) goto L11;
        r1[r3] = Long.TYPE;
        return;
    L11:
        if ((r2 instanceof Double) == false) goto L15;
        r1[r3] = Double.TYPE;
        return;
    L15:
        if ((r2 instanceof Float) == false) goto L19;
        r1[r3] = Float.TYPE;
        return;
    L19:
        if ((r2 instanceof Boolean) == false) goto L23;
        r1[r3] = Boolean.TYPE;
        return;
    L23:
        if ((r2 instanceof Character) == false) goto L27;
        r1[r3] = Character.TYPE;
        return;
    L27:
        if ((r2 instanceof Byte) == false) goto L31;
        r1[r3] = Byte.TYPE;
        return;
    L31:
        if ((r2 instanceof Void) == false) goto L35;
        r1[r3] = Void.TYPE;
        return;
    L35:
        if ((r2 instanceof Short) == false) goto L38;
        r1[r3] = Short.TYPE;
        return;
    L38:
        r1[r3] = r2.getClass();
    }

    private static void tryLoadClass(String r1) throws ClassNotFoundException {
        ClassLoader r02 = ReflectionUtils.class.getClassLoader();
        if (r02 == null) goto L7;
        r02.loadClass(r1);
        return;
    L7:
        throw new ClassNotFoundException("not found classloader");
    }

    public static boolean checkCompatible(String r3, String r4, Class<?>... r5) {
        if (r3 == null) goto L8;
        if (r4 == null) goto L8;
        Class.forName(r3).getDeclaredMethod(r4, r5);     // Catch: Exception -> L10 RuntimeException -> L11
        Logger.v(TAG, "has method : " + r4);     // Catch: Exception -> L10 RuntimeException -> L11
        return true;
    L8:
        Logger.w(TAG, "targetClass is  null or name is null:");     // Catch: Exception -> L10 RuntimeException -> L11
        return false;
    L11:
        Logger.w(TAG, r3 + " RuntimeException");
    L12:
        return false;
    L10:
        Logger.w(TAG, r4 + " NoSuchMethodException");
        goto L12
    }

    public static Object invokeStaticMethod(String r02, String r1, Class<?>[] r2, Object... r3) {
        Method r03 = getMethod(getClass(r02), r1, r2);
        if (r03 != null) goto L6;
        return null;
    L6:
        return invoke(null, r03, r3);
    }
}
