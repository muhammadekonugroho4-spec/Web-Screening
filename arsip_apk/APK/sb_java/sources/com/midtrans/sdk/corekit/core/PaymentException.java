package com.midtrans.sdk.corekit.core;

/* loaded from: classes6.dex */
public class PaymentException extends RuntimeException {
    public String statusCode;

    public PaymentException(String r1, String r2, Throwable r3) {
        super(r3);
        this.statusCode = r1;
    }
}
