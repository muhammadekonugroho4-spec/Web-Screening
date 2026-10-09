package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public final class b extends AbstractResolvableFuture {
    public b() {
    }

    public static b j() {
        return new b();
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean set(Object r1) {
        return super.set(r1);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean setException(Throwable r1) {
        return super.setException(r1);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean setFuture(ListenableFuture r1) {
        return super.setFuture(r1);
    }
}
