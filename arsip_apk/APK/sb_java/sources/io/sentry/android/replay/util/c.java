package io.sentry.android.replay.util;

import android.content.Context;

/* loaded from: classes3.dex */
public abstract class c {
    public static final Context a(Context r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        Context r02 = r1.getApplicationContext();
        if (r02 != null) goto L5;
        return r1;
    L5:
        return r02;
    }
}
