package androidx.tracing;

import android.os.Trace;

/* loaded from: classes4.dex */
public abstract class c {
    public static void a(String r02, int r1) {
        Trace.beginAsyncSection(r02, r1);
    }

    public static void b(String r02, int r1) {
        Trace.endAsyncSection(r02, r1);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }

    public static void d(String r2, int r3) {
        Trace.setCounter(r2, r3);
    }
}
