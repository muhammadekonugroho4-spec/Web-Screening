package androidx.tracing;

import android.os.Trace;

/* loaded from: classes4.dex */
public abstract class b {
    public static void a(String r02) {
        Trace.beginSection(r02);
    }

    public static void b() {
        Trace.endSection();
    }
}
