package androidx.tracing;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.google.firebase.perf.metrics.resource.ResourceType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static long f28229a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f28230b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f28231c;
    public static Method d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f28232e;

    public static void a(String r2, int r3) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        c.a(l(r2), r3);
        return;
    L6:
        b(l(r2), r3);
    }

    public static void b(String r5, int r6) {
    L6:
        e = move-exception;
        g("asyncTraceBegin", e);
        return;
    L4:
        if (f28231c != null) goto L8;
        f28231c = Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});     // Catch: Exception -> L6
    L8:
        f28231c.invoke(null, new Object[]{Long.valueOf(f28229a), r5, Integer.valueOf(r6)});     // Catch: Exception -> L6
    }

    public static void c(String r02) {
        b.a(l(r02));
    }

    public static void d(String r2, int r3) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        c.b(l(r2), r3);
        return;
    L6:
        e(l(r2), r3);
    }

    public static void e(String r5, int r6) {
    L6:
        e = move-exception;
        g("asyncTraceEnd", e);
        return;
    L4:
        if (d != null) goto L8;
        d = Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE});     // Catch: Exception -> L6
    L8:
        d.invoke(null, new Object[]{Long.valueOf(f28229a), r5, Integer.valueOf(r6)});     // Catch: Exception -> L6
    }

    public static void f() {
        b.b();
    }

    public static void g(String r2, Exception r3) {
        if ((r3 instanceof InvocationTargetException) == false) goto L10;
        Throwable r22 = r3.getCause();
        if ((r22 instanceof RuntimeException) == false) goto L9;
        throw ((RuntimeException) r22);
    L9:
        throw new RuntimeException(r22);
    L10:
        Log.v(ResourceType.TRACE, "Unable to call " + r2 + " via reflection", r3);
    }

    public static boolean h() {
        if (Build.VERSION.SDK_INT < 29) goto L7;
        return c.c();
    L7:
        return i();
    }

    public static boolean i() {
    L6:
        e = move-exception;
        g("isTagEnabled", e);
        return false;
    L4:
        if (f28230b != null) goto L8;
        f28229a = Trace.class.getField("TRACE_TAG_APP").getLong(null);     // Catch: Exception -> L6
        f28230b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});     // Catch: Exception -> L6
    L8:
        return ((Boolean) f28230b.invoke(null, new Object[]{Long.valueOf(f28229a)})).booleanValue();
    }

    public static void j(String r2, int r3) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        c.d(l(r2), r3);
        return;
    L6:
        k(l(r2), r3);
    }

    public static void k(String r5, int r6) {
    L6:
        e = move-exception;
        g("traceCounter", e);
        return;
    L4:
        if (f28232e != null) goto L8;
        f28232e = Trace.class.getMethod("traceCounter", new Class[]{Long.TYPE, String.class, Integer.TYPE});     // Catch: Exception -> L6
    L8:
        f28232e.invoke(null, new Object[]{Long.valueOf(f28229a), r5, Integer.valueOf(r6)});     // Catch: Exception -> L6
    }

    public static String l(String r2) {
        if (r2.length() > 127) goto L6;
        return r2;
    L6:
        return r2.substring(0, WorkQueueKt.MASK);
    }
}
