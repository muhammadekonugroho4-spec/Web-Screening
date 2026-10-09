package com.huawei.agconnect.exception;

/* loaded from: classes6.dex */
public abstract class AGCException extends Exception {
    private int code;
    private String errMsg;

    @Override // java.lang.Throwable
    public String getMessage() {
        return " code: " + this.code + " message: " + this.errMsg;
    }
}
