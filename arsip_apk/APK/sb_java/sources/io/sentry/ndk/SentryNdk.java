package io.sentry.ndk;

/* loaded from: classes3.dex */
public final class SentryNdk {
    private static volatile boolean nativeLibrariesLoaded;

    private SentryNdk() {
    }

    public static void close() {
        loadNativeLibraries();
        shutdown();
    }

    public static void init(NdkOptions r1) {
        loadNativeLibraries();
        int r12 = initSentryNative(r1);
        if (r12 > 0) goto L9;
        if (r12 < 0) goto L7;
        return;
    L7:
        throw new IllegalStateException("A sentry-native setup failure occurred");
    L9:
        throw new IllegalStateException("A sentry-native internal init error occurred, please check the logs for more details.");
    }

    private static native int initSentryNative(NdkOptions r02);

    public static synchronized void loadNativeLibraries() {
        monitor-enter(SentryNdk.class);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (nativeLibrariesLoaded == true) goto L10;
        System.loadLibrary("log");     // Catch: Throwable -> L8
        System.loadLibrary("sentry");     // Catch: Throwable -> L8
        System.loadLibrary("sentry-android");     // Catch: Throwable -> L8
        nativeLibrariesLoaded = true;     // Catch: Throwable -> L8
    L10:
        monitor-exit(SentryNdk.class);
    }

    private static native void shutdown();
}
