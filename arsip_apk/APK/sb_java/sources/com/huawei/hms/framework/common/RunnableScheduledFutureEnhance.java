package com.huawei.hms.framework.common;

import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes6.dex */
public class RunnableScheduledFutureEnhance<T> implements RunnableScheduledFuture<T> {
    private String parentName;
    private RunnableScheduledFuture<T> proxy;

    public RunnableScheduledFutureEnhance(RunnableScheduledFuture<T> r2) {
        this.parentName = Thread.currentThread().getName();
        this.proxy = r2;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean r2) {
        return this.proxy.cancel(r2);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Delayed r1) {
        return compareTo2(r1);
    }

    public boolean equals(Object r2) {
        return this.proxy.equals(r2);
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        return this.proxy.get();
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit r3) {
        return this.proxy.getDelay(r3);
    }

    public String getParentName() {
        return this.parentName;
    }

    public int hashCode() {
        return this.proxy.hashCode();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.proxy.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.proxy.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public boolean isPeriodic() {
        return this.proxy.isPeriodic();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.proxy.run();
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(Delayed r2) {
        return this.proxy.compareTo(r2);
    }

    @Override // java.util.concurrent.Future
    public T get(long r2, TimeUnit r4) throws ExecutionException, InterruptedException, TimeoutException {
        return this.proxy.get(r2, r4);
    }
}
