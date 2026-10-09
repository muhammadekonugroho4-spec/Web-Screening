package androidx.window.reflection;

import android.util.Log;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.p;
import kotlin.reflect.d;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f29015a = null;

    static {
        f29015a = new a();
    }

    public a() {
    }

    public static final boolean e(String r2, kotlin.jvm.functions.a r3) {
        p.l(r2, "errorMessage");
        p.l(r3, "block");
        boolean r32 = ((Boolean) r3.invoke()).booleanValue();     // Catch: NoSuchFieldException -> L7 NoSuchMethodException -> L8 ClassNotFoundException -> L9
        if (r32 == true) goto L6;
        Log.e("ReflectionGuard", r2);     // Catch: NoSuchFieldException -> L7 NoSuchMethodException -> L8 ClassNotFoundException -> L9
    L6:
        return r32;
    L9:
        Log.e("ReflectionGuard", "ClassNotFound: " + r2);
        return false;
    L7:
        Log.e("ReflectionGuard", "NoSuchField: " + r2);
        return false;
    L8:
        Log.e("ReflectionGuard", "NoSuchMethod: " + r2);
        return false;
    }

    public final boolean a(kotlin.jvm.functions.a r2) {
        p.l(r2, "classLoader");
        r2.invoke();     // Catch: Throwable -> L6
        return true;
    L6:
        return false;
    }

    public final boolean b(Method r2, Class r3) {
        p.l(r2, "<this>");
        p.l(r3, "clazz");
        return r2.getReturnType().equals(r3);
    }

    public final boolean c(Method r2, d r3) {
        p.l(r2, "<this>");
        p.l(r3, "clazz");
        return b(r2, kotlin.jvm.a.b(r3));
    }

    public final boolean d(Method r2) {
        p.l(r2, "<this>");
        return Modifier.isPublic(r2.getModifiers());
    }
}
