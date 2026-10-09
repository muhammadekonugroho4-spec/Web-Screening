package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class PendingResult<R extends Result> {

    @KeepForSdk
    public interface StatusListener {
        @KeepForSdk
        void onComplete(Status r1);
    }

    public PendingResult() {
    }

    @KeepForSdk
    public void addStatusListener(StatusListener r1) {
        throw new UnsupportedOperationException();
    }

    @ResultIgnorabilityUnspecified
    public abstract R await();

    @ResultIgnorabilityUnspecified
    public abstract R await(long r1, TimeUnit r3);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(ResultCallback<? super R> r1);

    public abstract void setResultCallback(ResultCallback<? super R> r1, long r2, TimeUnit r4);

    public <S extends Result> TransformedResult<S> then(ResultTransform<? super R, ? extends S> r1) {
        throw new UnsupportedOperationException();
    }
}
