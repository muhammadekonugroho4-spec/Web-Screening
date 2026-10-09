package io.sentry.ndk;

/* loaded from: classes3.dex */
public final class NativeScope implements a {
    public NativeScope() {
    }

    public static native void nativeAddBreadcrumb(String r02, String r1, String r2, String r3, String r4, String r5);

    public static native void nativeRemoveUser();

    public static native void nativeSetTrace(String r02, String r1);

    public static native void nativeSetUser(String r02, String r1, String r2, String r3);

    @Override // io.sentry.ndk.a
    public void a() {
        nativeRemoveUser();
    }

    @Override // io.sentry.ndk.a
    public void b(String r1, String r2) {
        nativeSetTrace(r1, r2);
    }

    @Override // io.sentry.ndk.a
    public void c(String r1, String r2, String r3, String r4, String r5, String r6) {
        nativeAddBreadcrumb(r1, r2, r3, r4, r5, r6);
    }

    @Override // io.sentry.ndk.a
    public void d(String r1, String r2, String r3, String r4) {
        nativeSetUser(r1, r2, r3, r4);
    }
}
