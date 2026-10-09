package com.bumptech.glide.load;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class HttpException extends IOException {
    private static final long serialVersionUID = 1;
    private final int statusCode;

    public HttpException(int r2) {
        this("Http request failed", r2);
    }

    public HttpException(String r2, int r3) {
        this(r2, r3, null);
    }

    public HttpException(String r2, int r3, Throwable r4) {
        super(r2 + ", status code: " + r3, r4);
        this.statusCode = r3;
    }
}
