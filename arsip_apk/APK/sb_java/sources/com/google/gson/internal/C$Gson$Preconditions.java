package com.google.gson.internal;

/* renamed from: com.google.gson.internal.$Gson$Preconditions, reason: invalid class name */
/* loaded from: classes6.dex */
public final class C$Gson$Preconditions {
    private C$Gson$Preconditions() {
        throw new UnsupportedOperationException();
    }

    public static void checkArgument(boolean r02) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException();
    }

    @Deprecated
    public static <T> T checkNotNull(T r02) {
        r02.getClass();
        return r02;
    }
}
