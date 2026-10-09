package androidx.paging;

import android.os.Build;
import android.util.Log;

/* loaded from: classes4.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public static final J f26701a = null;

    static {
        f26701a = new J();
    }

    public J() {
    }

    public final boolean a(int r2) {
        if (Build.ID != null) goto L5;
        return false;
    L5:
        if (Log.isLoggable("Paging", r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final void b(int r3, String r4, Throwable r5) {
        kotlin.jvm.internal.p.l(r4, "message");
        if (r3 != 2) goto L5;
        Log.v("Paging", r4, r5);
        return;
    L5:
        if (r3 != 3) goto L9;
        Log.d("Paging", r4, r5);
        return;
    L9:
        throw new IllegalArgumentException("debug level " + r3 + " is requested but Paging only supports default logging for level 2 (VERBOSE) or level 3 (DEBUG)");
    }
}
