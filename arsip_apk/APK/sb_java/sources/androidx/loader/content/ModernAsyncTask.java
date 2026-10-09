package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* loaded from: classes4.dex */
public abstract class ModernAsyncTask {

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadFactory f25780f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final BlockingQueue f25781g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final Executor f25782h = null;

    /* renamed from: i, reason: collision with root package name */
    public static f f25783i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile Executor f25784j;

    /* renamed from: a, reason: collision with root package name */
    public final g f25785a;

    /* renamed from: b, reason: collision with root package name */
    public final FutureTask f25786b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Status f25787c;
    public final AtomicBoolean d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f25788e;

    public enum Status extends Enum<Status> {
        public static final Status FINISHED = null;
        public static final Status PENDING = null;
        public static final Status RUNNING = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Status[] f25789a = null;

        static {
            Status r02 = new Status("PENDING", 0);
            PENDING = r02;
            Status r1 = new Status(DebugCoroutineInfoImplKt.RUNNING, 1);
            RUNNING = r1;
            Status r2 = new Status("FINISHED", 2);
            FINISHED = r2;
            f25789a = new Status[]{r02, r1, r2};
        }

        Status(String r1, int r2) {
        }

        public static Status valueOf(String r1) {
            return (Status) Enum.valueOf(Status.class, r1);
        }

        public static Status[] values() {
            return (Status[]) f25789a.clone();
        }
    }

    public static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f25790a;

        public a() {
            this.f25790a = new AtomicInteger(1);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r4) {
            return new Thread(r4, "ModernAsyncTask #" + this.f25790a.getAndIncrement());
        }
    }

    public class b extends g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ModernAsyncTask f25791b;

        public b(ModernAsyncTask r1) {
            this.f25791b = r1;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            this.f25791b.f25788e.set(true);
            Object r2 = null;
            Process.setThreadPriority(10);     // Catch: Throwable -> L6
            r2 = this.f25791b.b(this.f25796a);     // Catch: Throwable -> L6
            Binder.flushPendingCommands();     // Catch: Throwable -> L6
            this.f25791b.k(r2);
            return r2;
        L6:
            th = move-exception;
            this.f25791b.d.set(true);     // Catch: Throwable -> L9
            throw th;     // Catch: Throwable -> L9
        L9:
            th = move-exception;
            this.f25791b.k(r2);
            throw th;
        }
    }

    public class c extends FutureTask {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ModernAsyncTask f25792a;

        public c(ModernAsyncTask r1, Callable r2) {
            this.f25792a = r1;
            super(r2);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            Object r1 = get();     // Catch: Throwable -> L5 ExecutionException -> L7 InterruptedException -> L9 CancellationException -> L13
            this.f25792a.l(r1);     // Catch: Throwable -> L5 ExecutionException -> L7 InterruptedException -> L9 CancellationException -> L13
            return;
        L9:
            e = move-exception;
            Log.w("AsyncTask", e);
            return;
        L13:
            this.f25792a.l(null);
            return;
        L7:
            e = move-exception;
            throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
        L5:
            th = move-exception;
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }

    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25793a = null;

        static {
            int[] r02 = new int[Status.values().length];
            f25793a = r02;
            r02[Status.RUNNING.ordinal()] = 1;     // Catch: NoSuchFieldError -> L6
        L8:
            f25793a[Status.FINISHED.ordinal()] = 2;     // Catch: NoSuchFieldError -> L7
            return;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final ModernAsyncTask f25794a;

        /* renamed from: b, reason: collision with root package name */
        public final Object[] f25795b;

        public e(ModernAsyncTask r1, Object... r2) {
            this.f25794a = r1;
            this.f25795b = r2;
        }
    }

    public static class f extends Handler {
        public f() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message r3) {
            e r02 = (e) r3.obj;
            int r32 = r3.what;
            if (r32 != 1) goto L5;
            r02.f25794a.d(r02.f25795b[0]);
            return;
        L5:
            if (r32 == 2) goto L7;
            return;
        L7:
            r02.f25794a.j(r02.f25795b);
        }
    }

    public static abstract class g implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public Object[] f25796a;

        public g() {
        }
    }

    static {
        a r7 = new a();
        f25780f = r7;
        LinkedBlockingQueue r6 = new LinkedBlockingQueue(10);
        f25781g = r6;
        ThreadPoolExecutor r02 = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, r6, r7);
        f25782h = r02;
        f25784j = r02;
    }

    public ModernAsyncTask() {
        this.f25787c = Status.PENDING;
        this.d = new AtomicBoolean();
        this.f25788e = new AtomicBoolean();
        b r02 = new b(this);
        this.f25785a = r02;
        this.f25786b = new c(this, r02);
    }

    public static Handler e() {
        monitor-enter(ModernAsyncTask.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (f25783i != null) goto L9;
        f25783i = new f();     // Catch: Throwable -> L7
    L9:
        f r1 = f25783i;     // Catch: Throwable -> L7
        monitor-exit(ModernAsyncTask.class);     // Catch: Throwable -> L7
        return r1;
    }

    public final boolean a(boolean r3) {
        this.d.set(true);
        return this.f25786b.cancel(r3);
    }

    public abstract Object b(Object... r1);

    public final ModernAsyncTask c(Executor r3, Object... r4) {
        if (this.f25787c == Status.PENDING) goto L14;
        int r32 = d.f25793a[this.f25787c.ordinal()];
        if (r32 == 1) goto L13;
        if (r32 == 2) goto L11;
        throw new IllegalStateException("We should never reach this state");
    L11:
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    L13:
        throw new IllegalStateException("Cannot execute task: the task is already running.");
    L14:
        this.f25787c = Status.RUNNING;
        i();
        this.f25785a.f25796a = r4;
        r3.execute(this.f25786b);
        return this;
    }

    public void d(Object r2) {
        if (f() == false) goto L5;
        g(r2);
    L6:
        this.f25787c = Status.FINISHED;
        return;
    L5:
        h(r2);
        goto L6
    }

    public final boolean f() {
        return this.d.get();
    }

    public abstract void g(Object r1);

    public abstract void h(Object r1);

    public void i() {
    }

    public void j(Object... r1) {
    }

    public Object k(Object r4) {
        e().obtainMessage(1, new e(this, new Object[]{r4})).sendToTarget();
        return r4;
    }

    public void l(Object r2) {
        if (this.f25788e.get() == true) goto L6;
        k(r2);
        return;
    }
}
