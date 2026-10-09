package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class h {

    public static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public String f23013a;

        /* renamed from: b, reason: collision with root package name */
        public int f23014b;

        /* renamed from: androidx.core.provider.h$a$a, reason: collision with other inner class name */
        public static class C0167a extends Thread {

            /* renamed from: a, reason: collision with root package name */
            public final int f23015a;

            public C0167a(Runnable r1, String r2, int r3) {
                super(r1, r2);
                this.f23015a = r3;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f23015a);
                super.run();
            }
        }

        public a(String r1, int r2) {
            this.f23013a = r1;
            this.f23014b = r2;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r4) {
            return new C0167a(r4, this.f23013a, this.f23014b);
        }
    }

    public static class b implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f23016a;

        public b(Handler r1) {
            this.f23016a = (Handler) androidx.core.util.h.g(r1);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable r3) {
            if (this.f23016a.post((Runnable) androidx.core.util.h.g(r3)) == false) goto L6;
            return;
        L6:
            throw new RejectedExecutionException(this.f23016a + " is shutting down");
        }
    }

    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public Callable f23017a;

        /* renamed from: b, reason: collision with root package name */
        public androidx.core.util.a f23018b;

        /* renamed from: c, reason: collision with root package name */
        public Handler f23019c;

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ androidx.core.util.a f23020a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f23021b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f23022c;

            public a(c r1, androidx.core.util.a r2, Object r3) {
                this.f23022c = r1;
                this.f23020a = r2;
                this.f23021b = r3;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f23020a.accept(this.f23021b);
            }
        }

        public c(Handler r1, Callable r2, androidx.core.util.a r3) {
            this.f23017a = r2;
            this.f23018b = r3;
            this.f23019c = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object r02 = this.f23017a.call();     // Catch: Exception -> L4
        L5:
            androidx.core.util.a r1 = this.f23018b;
            this.f23019c.post(new a(this, r1, r02));
            return;
        L4:
            r02 = null;
            goto L5
        }
    }

    public static ThreadPoolExecutor a(String r8, int r9, int r10) {
        ThreadPoolExecutor r02 = new ThreadPoolExecutor(0, 1, r10, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(r8, r9));
        r02.allowCoreThreadTimeOut(true);
        return r02;
    }

    public static Executor b(Handler r1) {
        return new b(r1);
    }

    public static void c(Executor r2, Callable r3, androidx.core.util.a r4) {
        r2.execute(new c(androidx.core.provider.b.a(), r3, r4));
    }

    public static Object d(ExecutorService r1, Callable r2, int r3) {
        return r1.submit(r2).get(r3, TimeUnit.MILLISECONDS);
    L7:
        e = move-exception;
        throw e;
    L9:
        e = move-exception;
        throw new RuntimeException(e);
    L6:
        throw new InterruptedException("timeout");
    }
}
