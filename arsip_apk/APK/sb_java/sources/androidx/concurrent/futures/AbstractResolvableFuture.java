package androidx.concurrent.futures;

import com.clevertap.android.sdk.Constants;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class AbstractResolvableFuture implements ListenableFuture {
    static final b ATOMIC_HELPER = null;
    static final boolean GENERATE_CANCELLATION_CAUSES = false;
    private static final Object NULL = null;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    private static final Logger log = null;
    volatile d listeners;
    volatile Object value;
    volatile h waiters;

    public static final class Failure {

        /* renamed from: b, reason: collision with root package name */
        public static final Failure f20844b = null;

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f20845a;

        static {
            final String r2 = "Failure occurred while trying to finish a future.";
            f20844b = new Failure(new AnonymousClass1(r2));
        }

        public Failure(Throwable r1) {
            this.f20845a = (Throwable) AbstractResolvableFuture.checkNotNull(r1);
        }
    }

    public static /* synthetic */ class a {
    }

    public static abstract class b {
        public b() {
        }

        public abstract boolean a(AbstractResolvableFuture r1, d r2, d r3);

        public abstract boolean b(AbstractResolvableFuture r1, Object r2, Object r3);

        public abstract boolean c(AbstractResolvableFuture r1, h r2, h r3);

        public abstract void d(h r1, h r2);

        public abstract void e(h r1, Thread r2);

        public /* synthetic */ b(a r1) {
            this();
        }
    }

    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final c f20846c = null;
        public static final c d = null;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f20847a;

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f20848b;

        static {
            if (AbstractResolvableFuture.GENERATE_CANCELLATION_CAUSES == false) goto L6;
            d = null;
            f20846c = null;
            return;
        L6:
            d = new c(false, null);
            f20846c = new c(true, null);
        }

        public c(boolean r1, Throwable r2) {
            this.f20847a = r1;
            this.f20848b = r2;
        }
    }

    public static final class d {
        public static final d d = null;

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f20849a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f20850b;

        /* renamed from: c, reason: collision with root package name */
        public d f20851c;

        static {
            d = new d(null, null);
        }

        public d(Runnable r1, Executor r2) {
            this.f20849a = r1;
            this.f20850b = r2;
        }
    }

    public static final class e extends b {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f20852a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f20853b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f20854c;
        public final AtomicReferenceFieldUpdater d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f20855e;

        public e(AtomicReferenceFieldUpdater r2, AtomicReferenceFieldUpdater r3, AtomicReferenceFieldUpdater r4, AtomicReferenceFieldUpdater r5, AtomicReferenceFieldUpdater r6) {
            super(null);
            this.f20852a = r2;
            this.f20853b = r3;
            this.f20854c = r4;
            this.d = r5;
            this.f20855e = r6;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public boolean a(AbstractResolvableFuture r2, d r3, d r4) {
            return androidx.concurrent.futures.a.a(this.d, r2, r3, r4);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public boolean b(AbstractResolvableFuture r2, Object r3, Object r4) {
            return androidx.concurrent.futures.a.a(this.f20855e, r2, r3, r4);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public boolean c(AbstractResolvableFuture r2, h r3, h r4) {
            return androidx.concurrent.futures.a.a(this.f20854c, r2, r3, r4);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public void d(h r2, h r3) {
            this.f20853b.lazySet(r2, r3);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public void e(h r2, Thread r3) {
            this.f20852a.lazySet(r2, r3);
        }
    }

    public static final class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractResolvableFuture f20856a;

        /* renamed from: b, reason: collision with root package name */
        public final ListenableFuture f20857b;

        public f(AbstractResolvableFuture r1, ListenableFuture r2) {
            this.f20856a = r1;
            this.f20857b = r2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f20856a.value != this) goto L10;
            Object r02 = AbstractResolvableFuture.getFutureValue(this.f20857b);
            if (AbstractResolvableFuture.ATOMIC_HELPER.b(this.f20856a, this, r02) == false) goto L9;
            AbstractResolvableFuture.complete(this.f20856a);
            return;
        L9:
            return;
        }
    }

    public static final class g extends b {
        public g() {
            super(null);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public boolean a(AbstractResolvableFuture r2, d r3, d r4) {
            monitor-enter(r2);
        L8:
            th = move-exception;
            throw th;
        L4:
            if (r2.listeners != r3) goto L11;
            r2.listeners = r4;     // Catch: Throwable -> L8
            monitor-exit(r2);     // Catch: Throwable -> L8
            return true;
        L11:
            monitor-exit(r2);     // Catch: Throwable -> L8
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public boolean b(AbstractResolvableFuture r2, Object r3, Object r4) {
            monitor-enter(r2);
        L8:
            th = move-exception;
            throw th;
        L4:
            if (r2.value != r3) goto L11;
            r2.value = r4;     // Catch: Throwable -> L8
            monitor-exit(r2);     // Catch: Throwable -> L8
            return true;
        L11:
            monitor-exit(r2);     // Catch: Throwable -> L8
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public boolean c(AbstractResolvableFuture r2, h r3, h r4) {
            monitor-enter(r2);
        L8:
            th = move-exception;
            throw th;
        L4:
            if (r2.waiters != r3) goto L11;
            r2.waiters = r4;     // Catch: Throwable -> L8
            monitor-exit(r2);     // Catch: Throwable -> L8
            return true;
        L11:
            monitor-exit(r2);     // Catch: Throwable -> L8
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public void d(h r1, h r2) {
            r1.f20860b = r2;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.b
        public void e(h r1, Thread r2) {
            r1.f20859a = r2;
        }
    }

    public static final class h {

        /* renamed from: c, reason: collision with root package name */
        public static final h f20858c = null;

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f20859a;

        /* renamed from: b, reason: collision with root package name */
        public volatile h f20860b;

        static {
            f20858c = new h(false);
        }

        public h(boolean r1) {
        }

        public void a(h r2) {
            AbstractResolvableFuture.ATOMIC_HELPER.d(this, r2);
        }

        public void b() {
            Thread r02 = this.f20859a;
            if (r02 == null) goto L6;
            this.f20859a = null;
            LockSupport.unpark(r02);
            return;
        }

        public h() {
            AbstractResolvableFuture.ATOMIC_HELPER.e(this, Thread.currentThread());
        }
    }

    static {
        GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        log = Logger.getLogger(AbstractResolvableFuture.class.getName());
        b r3 = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, h.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, d.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, "value"));     // Catch: Throwable -> L5
        th = null;
    L7:
        ATOMIC_HELPER = r3;
        if (th == null) goto L10;
        log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
    L10:
        NULL = new Object();
        return;
    L5:
        th = th;
        r3 = new g();
        goto L7
    }

    public AbstractResolvableFuture() {
    }

    public static CancellationException b(String r1, Throwable r2) {
        CancellationException r02 = new CancellationException(r1);
        r02.initCause(r2);
        return r02;
    }

    public static <T> T checkNotNull(T r02) {
        r02.getClass();
        return r02;
    }

    public static void complete(AbstractResolvableFuture r4) {
        d r02 = null;
    L3:
        r4.g();
        r4.afterDone();
        d r42 = r4.c(r02);
    L4:
        if (r42 == null) goto L14;
        r02 = r42.f20851c;
        Runnable r1 = r42.f20849a;
        if ((r1 instanceof f) == false) goto L12;
        f r12 = (f) r1;
        r4 = r12.f20856a;
        if (r4.value != r12) goto L13;
        Object r2 = getFutureValue(r12.f20857b);
        if (ATOMIC_HELPER.b(r4, r12, r2) == true) goto L3;
    L13:
        r42 = r02;
        goto L4
    L12:
        d(r1, r42.f20850b);
        goto L13
    }

    public static void d(Runnable r5, Executor r6) {
        r6.execute(r5);     // Catch: RuntimeException -> L4
        return;
    L4:
        e = move-exception;
        log.log(Level.SEVERE, "RuntimeException while executing runnable " + r5 + " with executor " + r6, e);
    }

    public static Object getFutureValue(ListenableFuture<?> r5) {
        if ((r5 instanceof AbstractResolvableFuture) == false) goto L14;
        Object r52 = ((AbstractResolvableFuture) r5).value;
        if ((r52 instanceof c) == false) goto L38;
        c r02 = (c) r52;
        if (r02.f20847a == true) goto L9;
        return r52;
    L9:
        if (r02.f20848b == null) goto L13;
        return new c(false, r02.f20848b);
    L13:
        return c.d;
    L38:
        return r52;
    L14:
        boolean r03 = r5.isCancelled();
        if (((!GENERATE_CANCELLATION_CAUSES) & r03) == true) goto L17;
        Object r2 = getUninterruptibly(r5);     // Catch: CancellationException -> L22 Throwable -> L25 ExecutionException -> L33
        if (r2 != null) goto L24;
        return NULL;
    L24:
        return r2;
    L22:
        e = move-exception;
        if (r03 == true) goto L32;
        return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + r5, e));
    L32:
        return new c(false, e);
    L33:
        e = move-exception;
        return new Failure(e.getCause());
    L25:
        th = move-exception;
        return new Failure(th);
    L17:
        return c.d;
    }

    public static <V> V getUninterruptibly(Future<V> r1) throws ExecutionException {
        boolean r02 = false;
    L12:
        V r12 = r1.get();     // Catch: Throwable -> L7 InterruptedException -> L11
    L4:
        if (r02 == false) goto L6;
        Thread.currentThread().interrupt();
    L6:
        return r12;
    L11:
        r02 = true;
    L7:
        th = move-exception;
        if (r02 == false) goto L10;
        Thread.currentThread().interrupt();
    L10:
        throw th;
    }

    public final void a(StringBuilder r4) {
        Object r1 = getUninterruptibly(this);     // Catch: RuntimeException -> L5 ExecutionException -> L7 CancellationException -> L10
        r4.append("SUCCESS, result=[");     // Catch: RuntimeException -> L5 ExecutionException -> L7 CancellationException -> L10
        r4.append(i(r1));     // Catch: RuntimeException -> L5 ExecutionException -> L7 CancellationException -> L10
        r4.append(Constants.AES_SUFFIX);     // Catch: RuntimeException -> L5 ExecutionException -> L7 CancellationException -> L10
        return;
    L10:
        r4.append("CANCELLED");
        return;
    L5:
        e = move-exception;
        r4.append("UNKNOWN, cause=[");
        r4.append(e.getClass());
        r4.append(" thrown from get()]");
        return;
    L7:
        e = move-exception;
        r4.append("FAILURE, cause=[");
        r4.append(e.getCause());
        r4.append(Constants.AES_SUFFIX);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable r4, Executor r5) {
        checkNotNull(r4);
        checkNotNull(r5);
        d r02 = this.listeners;
        if (r02 == d.d) goto L10;
        d r1 = new d(r4, r5);
    L5:
        r1.f20851c = r02;
        if (ATOMIC_HELPER.a(this, r02, r1) == true) goto L7;
        r02 = this.listeners;
        if (r02 != d.d) goto L5;
    L7:
        return;
    L10:
        d(r4, r5);
    }

    public void afterDone() {
    }

    public final d c(d r5) {
    L2:
        d r02 = this.listeners;
        if (ATOMIC_HELPER.a(this, r02, d.d) == false) goto L2;
        d r03 = r5;
        d r52 = r02;
    L5:
        if (r52 == null) goto L7;
        d r1 = r52.f20851c;
        r52.f20851c = r03;
        r03 = r52;
        r52 = r1;
        goto L5
    L7:
        return r03;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r8) {
        Object r02 = this.value;
        if (r02 != null) goto L5;
        boolean r3 = true;
    L7:
        if ((r3 | (r02 instanceof f)) == true) goto L9;
        return false;
    L9:
        if (GENERATE_CANCELLATION_CAUSES == false) goto L11;
        c r32 = new c(r8, new CancellationException("Future.cancel() was called."));
    L14:
        AbstractResolvableFuture r4 = this;
        boolean r5 = false;
    L16:
        if (ATOMIC_HELPER.b(r4, r02, r32) == true) goto L17;
        r02 = r4.value;
        if ((r02 instanceof f) == true) goto L16;
        return r5;
    L17:
        if (r8 == false) goto L19;
        r4.interruptTask();
    L19:
        complete(r4);
        if ((r02 instanceof f) == false) goto L31;
        ListenableFuture r03 = ((f) r02).f20857b;
        if ((r03 instanceof AbstractResolvableFuture) == false) goto L30;
        r4 = (AbstractResolvableFuture) r03;
        r02 = r4.value;
        if (r02 != null) goto L26;
        boolean r52 = true;
    L28:
        if ((r52 | (r02 instanceof f)) == false) goto L31;
        r5 = true;
        goto L16
    L26:
        r52 = false;
        goto L28
    L30:
        r03.cancel(r8);
    L31:
        return true;
    L11:
        if (r8 == false) goto L13;
        r32 = c.f20846c;
        goto L14
    L13:
        r32 = c.d;
        goto L14
    L5:
        r3 = false;
        goto L7
    }

    public final Object e(Object r2) {
        if ((r2 instanceof c) == true) goto L13;
        if ((r2 instanceof Failure) == true) goto L11;
        if (r2 != NULL) goto L14;
        return null;
    L14:
        return r2;
    L11:
        throw new ExecutionException(((Failure) r2).f20845a);
    L13:
        throw b("Task was cancelled.", ((c) r2).f20848b);
    }

    public final void g() {
    L2:
        h r02 = this.waiters;
        if (ATOMIC_HELPER.c(this, r02, h.f20858c) == false) goto L2;
    L4:
        if (r02 == null) goto L6;
        r02.b();
        r02 = r02.f20860b;
        goto L4
    }

    @Override // java.util.concurrent.Future
    public final Object get(long r20, TimeUnit r22) throws InterruptedException, TimeoutException, ExecutionException {
        long r4 = r22.toNanos(r20);
        if (Thread.interrupted() == true) goto L81;
        Object r6 = this.value;
        if (r6 == null) goto L7;
        boolean r9 = true;
    L9:
        if ((r9 & (!(r6 instanceof f))) == false) goto L13;
        return e(r6);
    L13:
        if (r4 <= 0) goto L15;
        long r11 = System.nanoTime() + r4;
    L17:
        if (r4 < SPIN_THRESHOLD_NANOS) goto L43;
        h r62 = this.waiters;
        if (r62 == h.f20858c) goto L41;
        h r15 = new h();
    L21:
        r15.a(r62);
        if (ATOMIC_HELPER.c(this, r62, r15) == true) goto L23;
        r62 = this.waiters;
        if (r62 != h.f20858c) goto L21;
    L23:
        LockSupport.parkNanos(this, r4);
        if (Thread.interrupted() == true) goto L36;
        Object r42 = this.value;
        if (r42 == null) goto L28;
        boolean r5 = true;
    L30:
        if ((r5 & (!(r42 instanceof f))) == true) goto L32;
        r4 = r11 - System.nanoTime();
        if (r4 >= SPIN_THRESHOLD_NANOS) goto L23;
        h(r15);
        goto L43
    L32:
        return e(r42);
    L28:
        r5 = false;
        goto L30
    L36:
        h(r15);
        throw new InterruptedException();
    L41:
        return e(this.value);
    L43:
        if (r4 <= 0) goto L57;
        Object r43 = this.value;
        if (r43 == null) goto L47;
        boolean r52 = true;
    L49:
        if ((r52 & (!(r43 instanceof f))) == true) goto L51;
        if (Thread.interrupted() == true) goto L56;
        r4 = r11 - System.nanoTime();
        goto L43
    L56:
        throw new InterruptedException();
    L51:
        return e(r43);
    L47:
        r52 = false;
        goto L49
    L57:
        String r63 = toString();
        String r7 = r22.toString();
        Locale r112 = Locale.ROOT;
        String r72 = r7.toLowerCase(r112);
        String r2 = "Waited " + r20 + " " + r22.toString().toLowerCase(r112);
        if ((r4 + SPIN_THRESHOLD_NANOS) >= 0) goto L75;
        String r23 = r2 + " (plus ";
        long r44 = -r4;
        long r113 = r22.convert(r44, TimeUnit.NANOSECONDS);
        long r45 = r44 - r22.toNanos(r113);
        if (r113 != 0) goto L62;
    L65:
        boolean r16 = true;
    L66:
        if (r113 <= 0) goto L71;
        String r24 = r23 + r113 + " " + r72;
        if (r16 == false) goto L70;
        r24 = r24 + Constants.SEPARATOR_COMMA;
    L70:
        r23 = r24 + " ";
    L71:
        if (r16 == false) goto L73;
        r23 = r23 + r45 + " nanoseconds ";
    L73:
        r2 = r23 + "delay)";
        goto L75
    L62:
        if (r45 > SPIN_THRESHOLD_NANOS) goto L65;
        r16 = false;
    L75:
        if (isDone() == false) goto L79;
        throw new TimeoutException(r2 + " but future completed as timeout expired");
    L79:
        throw new TimeoutException(r2 + " for " + r63);
    L15:
        r11 = 0;
        goto L17
    L7:
        r9 = false;
        goto L9
    L81:
        throw new InterruptedException();
    }

    public final void h(h r5) {
        r5.f20859a = null;
    L3:
        h r52 = this.waiters;
        if (r52 == h.f20858c) goto L19;
        h r1 = null;
    L7:
        if (r52 == null) goto L28;
        h r2 = r52.f20860b;
        if (r52.f20859a == null) goto L11;
        r1 = r52;
    L18:
        r52 = r2;
        goto L7
    L11:
        if (r1 == null) goto L16;
        r1.f20860b = r2;
        if (r1.f20859a != null) goto L18;
    L16:
        if (ATOMIC_HELPER.c(this, r52, r2) == true) goto L18;
    L28:
        return;
    }

    public final String i(Object r1) {
        if (r1 != this) goto L6;
        return "this future";
    L6:
        return String.valueOf(r1);
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.value == null) goto L5;
        boolean r2 = true;
    L7:
        return (!(r0 instanceof f)) & r2;
    L5:
        r2 = false;
        goto L7
    }

    public final void maybePropagateCancellationTo(Future<?> r3) {
        if (r3 == null) goto L4;
        boolean r02 = true;
    L6:
        if ((r02 & isCancelled()) == false) goto L9;
        r3.cancel(wasInterrupted());
        return;
    L9:
        return;
    L4:
        r02 = false;
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String pendingToString() {
        Object r02 = this.value;
        if ((r02 instanceof f) == false) goto L7;
        return "setFuture=[" + i(((f) r02).f20857b) + Constants.AES_SUFFIX;
    L7:
        if ((this instanceof ScheduledFuture) == true) goto L9;
        return null;
    L9:
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean set(Object r3) {
        if (r3 != null) goto L5;
        r3 = NULL;
    L5:
        if (ATOMIC_HELPER.b(this, null, r3) == false) goto L8;
        complete(this);
        return true;
    L8:
        return false;
    }

    public boolean setException(Throwable r3) {
        Failure r02 = new Failure((Throwable) checkNotNull(r3));
        if (ATOMIC_HELPER.b(this, null, r02) == false) goto L6;
        complete(this);
        return true;
    L6:
        return false;
    }

    public boolean setFuture(ListenableFuture<Object> r6) {
        checkNotNull(r6);
        Object r02 = this.value;
        if (r02 != null) goto L23;
        if (r6.isDone() == false) goto L11;
        Object r62 = getFutureValue(r6);
        if (ATOMIC_HELPER.b(this, null, r62) == false) goto L10;
        complete(this);
        return true;
    L10:
        return false;
    L11:
        f r03 = new f(this, r6);
        if (ATOMIC_HELPER.b(this, null, r03) == true) goto L26;
        r02 = this.value;
        goto L23
    L26:
        r6.addListener(r03, DirectExecutor.INSTANCE);     // Catch: Throwable -> L15
    L20:
        return true;
    L15:
        th = move-exception;
        Failure r1 = new Failure(th);     // Catch: Throwable -> L18
    L19:
        ATOMIC_HELPER.b(this, r03, r1);
    L18:
        r1 = Failure.f20844b;
    L23:
        if ((r02 instanceof c) == false) goto L25;
        r6.cancel(((c) r02).f20847a);
    L25:
        return false;
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append(super.toString());
        r02.append("[status=");
        if (isCancelled() == false) goto L6;
        r02.append("CANCELLED");
    L20:
        r02.append(Constants.AES_SUFFIX);
        return r02.toString();
    L6:
        if (isDone() == false) goto L22;
        a(r02);
        goto L20
    L22:
        String r1 = pendingToString();     // Catch: RuntimeException -> L10
    L12:
        if (r1 == null) goto L17;
        if (r1.isEmpty() == true) goto L17;
        r02.append("PENDING, info=[");
        r02.append(r1);
        r02.append(Constants.AES_SUFFIX);
    L17:
        if (isDone() == false) goto L19;
        a(r02);
        goto L20
    L19:
        r02.append("PENDING");
    L10:
        e = move-exception;
        r1 = "Exception thrown from implementation: " + e.getClass();
        goto L12
    }

    public final boolean wasInterrupted() {
        Object r02 = this.value;
        if ((r02 instanceof c) == true) goto L5;
        return false;
    L5:
        if (((c) r02).f20847a == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        if (Thread.interrupted() == true) goto L34;
        Object r02 = this.value;
        if (r02 == null) goto L7;
        boolean r3 = true;
    L9:
        if ((r3 & (!(r02 instanceof f))) == true) goto L11;
        h r03 = this.waiters;
        if (r03 == h.f20858c) goto L32;
        h r32 = new h();
    L15:
        r32.a(r03);
        if (ATOMIC_HELPER.c(this, r03, r32) == true) goto L17;
        r03 = this.waiters;
        if (r03 != h.f20858c) goto L15;
    L17:
        LockSupport.park(this);
        if (Thread.interrupted() == true) goto L27;
        Object r04 = this.value;
        if (r04 == null) goto L22;
        boolean r4 = true;
    L24:
        if ((r4 & (!(r04 instanceof f))) == false) goto L17;
        return e(r04);
    L22:
        r4 = false;
        goto L24
    L27:
        h(r32);
        throw new InterruptedException();
    L32:
        return e(this.value);
    L11:
        return e(r02);
    L7:
        r3 = false;
        goto L9
    L34:
        throw new InterruptedException();
    }
}
