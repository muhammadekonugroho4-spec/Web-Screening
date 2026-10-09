package com.google.android.play.integrity.internal;

/* loaded from: classes5.dex */
public final class am {
    public static void a(Object r1, Class r2) {
        if (r1 == null) goto L5;
        return;
    L5:
        throw new IllegalStateException(String.valueOf(r2.getCanonicalName()).concat(" must be set"));
    }
}
