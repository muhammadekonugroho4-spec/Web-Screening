package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public class VerifyException extends RuntimeException {
    public VerifyException() {
    }

    public VerifyException(String r1) {
        super(r1);
    }

    public VerifyException(Throwable r1) {
        super(r1);
    }

    public VerifyException(String r1, Throwable r2) {
        super(r1, r2);
    }
}
