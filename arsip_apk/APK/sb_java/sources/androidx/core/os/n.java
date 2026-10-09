package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static long f22971a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f22972b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f22973c;
    public static Method d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f22974e;

    static {
        if (Build.VERSION.SDK_INT >= 29) goto L11;
        f22971a = Trace.class.getField("TRACE_TAG_APP").getLong(null);     // Catch: Exception -> L6
        Class r3 = Long.TYPE;     // Catch: Exception -> L6
        f22972b = Trace.class.getMethod("isTagEnabled", new Class[]{r3});     // Catch: Exception -> L6
        Class r4 = Integer.TYPE;     // Catch: Exception -> L6
        f22973c = Trace.class.getMethod("asyncTraceBegin", new Class[]{r3, String.class, r4});     // Catch: Exception -> L6
        d = Trace.class.getMethod("asyncTraceEnd", new Class[]{r3, String.class, r4});     // Catch: Exception -> L6
        f22974e = Trace.class.getMethod("traceCounter", new Class[]{r3, String.class, r4});     // Catch: Exception -> L6
        return;
    L6:
        e = move-exception;
        Log.i("TraceCompat", "Unable to initialize via reflection.", e);
        return;
    }

    public static void a(String r02) {
        Trace.beginSection(r02);
    }

    public static void b() {
        Trace.endSection();
    }
}
