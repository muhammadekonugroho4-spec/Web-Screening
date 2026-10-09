package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.e0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f25744a = null;

    static {
        f25744a = new e();
    }

    public e() {
    }

    public final e0 a(Class r5) {
        p.l(r5, "modelClass");
        Constructor r2 = r5.getDeclaredConstructor(null);     // Catch: NoSuchMethodException -> L18
        if (Modifier.isPublic(r2.getModifiers()) == false) goto L17;
        Object r1 = r2.newInstance(null);     // Catch: IllegalAccessException -> L8 InstantiationException -> L10
        p.i(r1);     // Catch: IllegalAccessException -> L8 InstantiationException -> L10
        return (e0) r1;
    L8:
        e = move-exception;
        throw new RuntimeException("Cannot create an instance of " + r5, e);
    L10:
        e = move-exception;
        throw new RuntimeException("Cannot create an instance of " + r5, e);
    L17:
        throw new RuntimeException("Cannot create an instance of " + r5);
    L18:
        e = move-exception;
        throw new RuntimeException("Cannot create an instance of " + r5, e);
    }
}
