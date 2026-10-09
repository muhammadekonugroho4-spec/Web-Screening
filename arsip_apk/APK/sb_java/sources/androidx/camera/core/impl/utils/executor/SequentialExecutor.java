package androidx.camera.core.impl.utils.executor;

import androidx.camera.core.AbstractC2209b0;
import androidx.core.util.h;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* loaded from: classes.dex */
public final class SequentialExecutor implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Deque f5521a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f5522b;

    /* renamed from: c, reason: collision with root package name */
    public final b f5523c;
    public WorkerRunningState d;

    /* renamed from: e, reason: collision with root package name */
    public long f5524e;

    public enum WorkerRunningState extends Enum<WorkerRunningState> {
        public static final WorkerRunningState IDLE = null;
        public static final WorkerRunningState QUEUED = null;
        public static final WorkerRunningState QUEUING = null;
        public static final WorkerRunningState RUNNING = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ WorkerRunningState[] f5525a = null;

        static {
            IDLE = new WorkerRunningState("IDLE", 0);
            QUEUING = new WorkerRunningState("QUEUING", 1);
            QUEUED = new WorkerRunningState("QUEUED", 2);
            RUNNING = new WorkerRunningState(DebugCoroutineInfoImplKt.RUNNING, 3);
            f5525a = a();
        }

        WorkerRunningState(String r1, int r2) {
        }

        public static /* synthetic */ WorkerRunningState[] a() {
            return new WorkerRunningState[]{IDLE, QUEUING, QUEUED, RUNNING};
        }

        public static WorkerRunningState valueOf(String r1) {
            return (WorkerRunningState) Enum.valueOf(WorkerRunningState.class, r1);
        }

        public static WorkerRunningState[] values() {
            return (WorkerRunningState[]) f5525a.clone();
        }
    }

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f5526a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SequentialExecutor f5527b;

        public a(SequentialExecutor r1, Runnable r2) {
            this.f5527b = r1;
            this.f5526a = r2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5526a.run();
        }
    }

    public final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SequentialExecutor f5528a;

        public b(SequentialExecutor r1) {
            this.f5528a = r1;
        }

        public final void a() {
            boolean r02 = false;
            boolean r1 = false;
        L36:
            Deque r2 = this.f5528a.f5521a;     // Catch: Throwable -> L26
            monitor-enter(r2);     // Catch: Throwable -> L26
            if (r02 == false) goto L37;
        L14:
            Runnable r3 = (Runnable) this.f5528a.f5521a.poll();     // Catch: Throwable -> L11
            if (r3 == null) goto L16;
            monitor-exit(r2);     // Catch: Throwable -> L11
            r1 = r1 | Thread.interrupted();
            r3.run();     // Catch: Throwable -> L26 RuntimeException -> L28
        L28:
            e = move-exception;
            AbstractC2209b0.d("SequentialExecutor", "Exception while executing runnable " + r3, e);     // Catch: Throwable -> L26
            goto L36
        L16:
            this.f5528a.d = WorkerRunningState.IDLE;     // Catch: Throwable -> L11
            monitor-exit(r2);     // Catch: Throwable -> L11
            if (r1 == true) goto L10;
            return;
        L10:
            Thread.currentThread().interrupt();
            return;
        L37:
            SequentialExecutor r03 = this.f5528a;     // Catch: Throwable -> L11
            WorkerRunningState r32 = r03.d;     // Catch: Throwable -> L11
            WorkerRunningState r4 = WorkerRunningState.RUNNING;     // Catch: Throwable -> L11
            if (r32 == r4) goto L8;
            r03.f5524e++;
            r03.d = r4;     // Catch: Throwable -> L11
            r02 = true;
            goto L14
        L8:
            monitor-exit(r2);     // Catch: Throwable -> L11
            if (r1 == true) goto L10;
            return;
        L11:
            th = move-exception;
            throw th;     // Catch: Throwable -> L26
        L26:
            th = move-exception;
            if (r1 == false) goto L35;
            Thread.currentThread().interrupt();
        L35:
            throw th;
        }

        @Override // java.lang.Runnable
        public void run() {
            a();     // Catch: Error -> L4
            return;
        L4:
            e = move-exception;
            monitor-enter(this.f5528a.f5521a);
            SequentialExecutor r2 = this.f5528a;     // Catch: Throwable -> L10
            r2.d = WorkerRunningState.IDLE;     // Catch: Throwable -> L10
            throw e;
        L10:
            th = move-exception;
            throw th;
        }
    }

    public SequentialExecutor(Executor r3) {
        this.f5521a = new ArrayDeque();
        this.f5523c = new b(this);
        this.d = WorkerRunningState.IDLE;
        this.f5524e = 0;
        this.f5522b = (Executor) h.g(r3);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable r8) {
        h.g(r8);
        Deque r02 = this.f5521a;
        monitor-enter(r02);
        WorkerRunningState r1 = this.d;     // Catch: Throwable -> L52
        if (r1 == WorkerRunningState.RUNNING) goto L54;
        WorkerRunningState r2 = WorkerRunningState.QUEUED;     // Catch: Throwable -> L52
        if (r1 == r2) goto L54;
        long r3 = this.f5524e;     // Catch: Throwable -> L52
        a r12 = new a(this, r8);     // Catch: Throwable -> L52
        this.f5521a.add(r12);     // Catch: Throwable -> L52
        WorkerRunningState r82 = WorkerRunningState.QUEUING;     // Catch: Throwable -> L52
        this.d = r82;     // Catch: Throwable -> L52
        monitor-exit(r02);     // Catch: Throwable -> L52
        this.f5522b.execute(this.f5523c);     // Catch: Error -> L28 Throwable -> L30
        if (this.d == r82) goto L15;
        return;
    L15:
        Deque r03 = this.f5521a;
        monitor-enter(r03);
    L22:
        th = move-exception;
        throw th;
    L18:
        if (this.f5524e == r3) goto L20;
    L24:
        monitor-exit(r03);     // Catch: Throwable -> L22
        return;
    L20:
        if (this.d != r82) goto L24;
        this.d = r2;     // Catch: Throwable -> L22
    L30:
        e = move-exception;
        Deque r22 = this.f5521a;
        monitor-enter(r22);
        WorkerRunningState r04 = this.d;     // Catch: Throwable -> L38
        if (r04 == WorkerRunningState.IDLE) goto L41;
        if (r04 == WorkerRunningState.QUEUING) goto L41;
    L43:
        boolean r05 = false;
    L45:
        if ((e instanceof RejectedExecutionException) == false) goto L49;
        if (r05 == true) goto L49;
        monitor-exit(r22);     // Catch: Throwable -> L38
        return;
    L49:
        throw e;     // Catch: Throwable -> L38
    L41:
        if (this.f5521a.removeLastOccurrence(r12) == false) goto L43;
        r05 = true;
    L38:
        th = move-exception;
        throw th;
    L54:
        this.f5521a.add(r8);     // Catch: Throwable -> L52
        monitor-exit(r02);     // Catch: Throwable -> L52
        return;
    L52:
        th = move-exception;
        throw th;
    }
}
