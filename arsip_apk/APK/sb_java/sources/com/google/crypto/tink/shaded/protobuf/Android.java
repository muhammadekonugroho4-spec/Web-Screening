package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes6.dex */
final class Android {
    private static boolean ASSUME_ANDROID;
    private static final boolean IS_ROBOLECTRIC = false;
    private static final Class<?> MEMORY_CLASS = null;

    static {
        MEMORY_CLASS = getClassForName("libcore.io.Memory");
        if (ASSUME_ANDROID == false) goto L5;
    L7:
        boolean r02 = false;
    L8:
        IS_ROBOLECTRIC = r02;
        return;
    L5:
        if (getClassForName("org.robolectric.Robolectric") == null) goto L7;
        r02 = true;
        goto L8
    }

    private Android() {
    }

    private static <T> Class<T> getClassForName(String r02) {
        return (Class<T>) Class.forName(r02);
    L4:
        return null;
    }

    public static Class<?> getMemoryClass() {
        return MEMORY_CLASS;
    }

    public static boolean isOnAndroidDevice() {
        if (ASSUME_ANDROID == false) goto L5;
        return true;
    L5:
        if (MEMORY_CLASS != null) goto L7;
        return false;
    L7:
        if (IS_ROBOLECTRIC == false) goto L14;
        return false;
    L14:
        return true;
    }
}
