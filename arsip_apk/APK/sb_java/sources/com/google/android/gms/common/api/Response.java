package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* loaded from: classes5.dex */
public class Response<T extends Result> {
    private Result zza;

    public Response() {
    }

    public T getResult() {
        return (T) this.zza;
    }

    public void setResult(T r1) {
        this.zza = r1;
    }

    public Response(T r1) {
        this.zza = r1;
    }
}
