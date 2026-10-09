package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes6.dex */
class DelegatingScheduledFuture<V> extends AbstractResolvableFuture implements ScheduledFuture<V> {
    private final ScheduledFuture<?> upstreamFuture;

    public interface Completer<T> {
        void set(T r1);

        void setException(Throwable r1);
    }

    public interface Resolver<T> {
        ScheduledFuture<?> addCompleter(Completer<T> r1);
    }

    public DelegatingScheduledFuture(Resolver<V> r2) {
        this.upstreamFuture = r2.addCompleter(new AnonymousClass1(this));
    }

    public static /* synthetic */ boolean access$000(DelegatingScheduledFuture r02, Object r1) {
        return r02.set(r1);
    }

    public static /* synthetic */ boolean access$100(DelegatingScheduledFuture r02, Throwable r1) {
        return r02.setException(r1);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public void afterDone() {
        this.upstreamFuture.cancel(wasInterrupted());
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Delayed r1) {
        return compareTo2(r1);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit r3) {
        return this.upstreamFuture.getDelay(r3);
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(Delayed r2) {
        return this.upstreamFuture.compareTo(r2);
    }
}
