package com.huawei.hms.support.api.client;

import android.os.Looper;
import com.huawei.hms.support.api.client.Result;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class EmptyPendingResult<R extends Result> extends PendingResult<R> {
    private R result;

    public EmptyPendingResult() {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await() {
        return this.result;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void cancel() {
    }

    public R getResult() {
        return this.result;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public boolean isCanceled() {
        return false;
    }

    public void setResult(R r1) {
        this.result = r1;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(Looper r1, ResultCallback<R> r2) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await(long r1, TimeUnit r3) {
        return this.result;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(ResultCallback<R> r1) {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(ResultCallback<R> r1, long r2, TimeUnit r4) {
    }
}
