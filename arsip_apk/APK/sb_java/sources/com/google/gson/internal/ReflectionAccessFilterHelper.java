package com.google.gson.internal;

import com.google.gson.ReflectionAccessFilter;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class ReflectionAccessFilterHelper {

    /* renamed from: com.google.gson.internal.ReflectionAccessFilterHelper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static abstract class AccessChecker {
        public static final AccessChecker INSTANCE = null;

        static {
            if (JavaVersion.isJava9OrLater() == true) goto L12;
        L6:
            AccessChecker r1 = null;
        L7:
            if (r1 != null) goto L9;
            r1 = new AnonymousClass2();
        L9:
            INSTANCE = r1;
            return;
        L12:
            final Method r02 = AccessibleObject.class.getDeclaredMethod("canAccess", new Class[]{Object.class});     // Catch: NoSuchMethodException -> L11
            r1 = new AnonymousClass1(r02);     // Catch: NoSuchMethodException -> L11
            goto L7
        }

        private AccessChecker() {
        }

        public abstract boolean canAccess(AccessibleObject r1, Object r2);

        public /* synthetic */ AccessChecker(AnonymousClass1 r1) {
            this();
        }
    }

    private ReflectionAccessFilterHelper() {
    }

    public static boolean canAccess(AccessibleObject r1, Object r2) {
        return AccessChecker.INSTANCE.canAccess(r1, r2);
    }

    public static ReflectionAccessFilter.FilterResult getFilterResult(List<ReflectionAccessFilter> r2, Class<?> r3) {
        Iterator<ReflectionAccessFilter> r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L9;
        ReflectionAccessFilter.FilterResult r02 = r22.next().check(r3);
        if (r02 == ReflectionAccessFilter.FilterResult.INDECISIVE) goto L4;
        return r02;
    L9:
        return ReflectionAccessFilter.FilterResult.ALLOW;
    }

    public static boolean isAndroidType(Class<?> r02) {
        return isAndroidType(r02.getName());
    }

    public static boolean isAnyPlatformType(Class<?> r1) {
        String r12 = r1.getName();
        if (isAndroidType(r12) == false) goto L5;
        return true;
    L5:
        if (r12.startsWith("kotlin.") == false) goto L7;
        return true;
    L7:
        if (r12.startsWith("kotlinx.") == false) goto L9;
        return true;
    L9:
        if (r12.startsWith("scala.") == true) goto L17;
        return false;
    L17:
        return true;
    }

    public static boolean isJavaType(Class<?> r02) {
        return isJavaType(r02.getName());
    }

    private static boolean isAndroidType(String r1) {
        if (r1.startsWith("android.") == false) goto L5;
        return true;
    L5:
        if (r1.startsWith("androidx.") == false) goto L7;
        return true;
    L7:
        if (isJavaType(r1) == true) goto L14;
        return false;
    L14:
        return true;
    }

    private static boolean isJavaType(String r1) {
        if (r1.startsWith("java.") == false) goto L5;
        return true;
    L5:
        if (r1.startsWith("javax.") == true) goto L11;
        return false;
    L11:
        return true;
    }
}
