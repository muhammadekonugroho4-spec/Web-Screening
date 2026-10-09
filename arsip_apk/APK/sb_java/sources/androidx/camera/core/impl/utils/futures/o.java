package androidx.camera.core.impl.utils.futures;

import androidx.camera.core.AbstractC2209b0;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class o implements ListenableFuture {

    public static class a extends o {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f5588a;

        public a(Throwable r1) {
            this.f5588a = r1;
        }

        @Override // androidx.camera.core.impl.utils.futures.o, java.util.concurrent.Future
        public Object get() {
            throw new ExecutionException(this.f5588a);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f5588a + "]]";
        }
    }

    public static final class b extends a implements ScheduledFuture {
        public b(Throwable r1) {
            super(r1);
        }

        public int b(Delayed r1) {
            return -1;
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Delayed r1) {
            return b(r1);
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit r3) {
            return 0;
        }
    }

    public static final class c extends o {

        /* renamed from: b, reason: collision with root package name */
        public static final o f5589b = null;

        /* renamed from: a, reason: collision with root package name */
        public final Object f5590a;

        static {
            f5589b = new c(null);
        }

        public c(Object r1) {
            this.f5590a = r1;
        }

        @Override // androidx.camera.core.impl.utils.futures.o, java.util.concurrent.Future
        public Object get() {
            return this.f5590a;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f5590a + "]]";
        }
    }

    public o() {
    }

    public static ListenableFuture a() {
        return c.f5589b;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable r4, Executor r5) {
        androidx.core.util.h.g(r4);
        androidx.core.util.h.g(r5);
        r5.execute(r4);     // Catch: RuntimeException -> L5
        return;
    L5:
        e = move-exception;
        AbstractC2209b0.d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + r4 + " on Executor " + r5, e);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean r1) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract Object get();

    @Override // java.util.concurrent.Future
    public Object get(long r1, TimeUnit r3) {
        androidx.core.util.h.g(r3);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
