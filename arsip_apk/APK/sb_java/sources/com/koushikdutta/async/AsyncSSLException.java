package com.koushikdutta.async;

/* loaded from: classes6.dex */
public class AsyncSSLException extends Exception {
    private boolean mIgnore;

    public AsyncSSLException(Throwable r2) {
        super("Peer not trusted by any of the system trust managers.", r2);
        this.mIgnore = false;
    }

    public boolean a() {
        return this.mIgnore;
    }
}
