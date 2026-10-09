package io.reactivex.internal.queue;

import io.reactivex.internal.fuseable.d;
import io.reactivex.internal.util.f;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final Integer f174545a = null;
    private static final long serialVersionUID = -1296597691183856449L;
    final AtomicLong consumerIndex;
    final int lookAheadStep;
    final int mask;
    final AtomicLong producerIndex;
    long producerLookAhead;

    static {
        f174545a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    }

    public SpscArrayQueue(int r2) {
        super(f.a(r2));
        this.mask = length() - 1;
        this.producerIndex = new AtomicLong();
        this.consumerIndex = new AtomicLong();
        this.lookAheadStep = Math.min(r2 / 4, f174545a.intValue());
    }

    public int a(long r1) {
        return ((int) r1) & this.mask;
    }

    public int b(long r1, int r3) {
        return ((int) r1) & r3;
    }

    public Object c(int r1) {
        return get(r1);
    }

    @Override // io.reactivex.internal.fuseable.e
    public void clear() {
    L3:
        if (poll() != null) goto L3;
        if (isEmpty() == false) goto L3;
    }

    public void d(long r2) {
        this.consumerIndex.lazySet(r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(int r1, Object r2) {
        lazySet(r1, r2);
    }

    public void f(long r2) {
        this.producerIndex.lazySet(r2);
    }

    @Override // io.reactivex.internal.fuseable.e
    public boolean isEmpty() {
        if (this.producerIndex.get() != this.consumerIndex.get()) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // io.reactivex.internal.fuseable.e
    public boolean offer(Object r7) {
        if (r7 == null) goto L15;
        int r02 = this.mask;
        long r1 = this.producerIndex.get();
        int r3 = b(r1, r02);
        if (r1 < this.producerLookAhead) goto L12;
        long r4 = this.lookAheadStep + r1;
        if (c(b(r4, r02)) != null) goto L9;
        this.producerLookAhead = r4;
        goto L12
    L9:
        if (c(r3) == null) goto L12;
        return false;
    L12:
        e(r3, r7);
        f(r1 + 1);
        return true;
    L15:
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // io.reactivex.internal.fuseable.d, io.reactivex.internal.fuseable.e
    public Object poll() {
        long r02 = this.consumerIndex.get();
        int r2 = a(r02);
        Object r3 = c(r2);
        if (r3 != null) goto L5;
        return null;
    L5:
        d(r02 + 1);
        e(r2, null);
        return r3;
    }
}
