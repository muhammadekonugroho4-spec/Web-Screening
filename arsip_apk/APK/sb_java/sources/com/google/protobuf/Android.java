package com.google.protobuf;

/* loaded from: classes6.dex */
final class Android {
    private static boolean ASSUME_ANDROID;
    private static final boolean IS_ROBOLECTRIC = false;
    private static final Class<?> MEMORY_CLASS = null;

    static {
        MEMORY_CLASS = getClassForName("libcore.io.Memory");
        IS_ROBOLECTRIC = false;
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
        return true;
    }
}
