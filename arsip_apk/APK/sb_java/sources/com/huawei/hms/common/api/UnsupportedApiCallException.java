package com.huawei.hms.common.api;

import com.huawei.hms.common.Feature;

@Deprecated
/* loaded from: classes6.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final Feature feature;

    public UnsupportedApiCallException(Feature r1) {
        this.feature = r1;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.feature + " is unsupported";
    }
}
