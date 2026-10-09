package com.huawei.hms.support.api.client;

import android.os.Looper;
import com.huawei.hms.support.api.client.Result;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public abstract class PendingResult<R extends Result> {
    public PendingResult() {
    }

    public abstract R await();

    public abstract R await(long r1, TimeUnit r3);

    @Deprecated
    public abstract void cancel();

    public <S extends Result> ConvertedResult<S> convertResult(ResultConvert<? super R, ? extends S> r1) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public abstract boolean isCanceled();

    public abstract void setResultCallback(Looper r1, ResultCallback<R> r2);

    public abstract void setResultCallback(ResultCallback<R> r1);

    @Deprecated
    public abstract void setResultCallback(ResultCallback<R> r1, long r2, TimeUnit r4);
}
