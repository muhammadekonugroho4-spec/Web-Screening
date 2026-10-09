package io.sentry;

import java.lang.Thread;

/* loaded from: classes3.dex */
public interface R3 {

    public static final class a implements R3 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f174916a = null;

        static {
            f174916a = new a();
        }

        public a() {
        }

        public static R3 c() {
            return f174916a;
        }

        @Override // io.sentry.R3
        public void a(Thread.UncaughtExceptionHandler r1) {
            Thread.setDefaultUncaughtExceptionHandler(r1);
        }

        @Override // io.sentry.R3
        public Thread.UncaughtExceptionHandler b() {
            return Thread.getDefaultUncaughtExceptionHandler();
        }
    }

    void a(Thread.UncaughtExceptionHandler r1);

    Thread.UncaughtExceptionHandler b();
}
