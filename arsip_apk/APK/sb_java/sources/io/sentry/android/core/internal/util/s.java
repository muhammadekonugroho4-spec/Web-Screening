package io.sentry.android.core.internal.util;

import android.content.Context;
import android.os.Process;

/* loaded from: classes3.dex */
public abstract class s {
    public static boolean a(Context r2, String r3) {
        io.sentry.util.v.c(r2, "The application context is required.");
        if (r2.checkPermission(r3, Process.myPid(), Process.myUid()) != 0) goto L6;
        return true;
    L6:
        return false;
    }
}
