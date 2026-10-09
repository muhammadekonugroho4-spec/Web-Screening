package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;

/* loaded from: classes6.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {
    private final int httpStatusCode;

    public FirebaseRemoteConfigServerException(int r1, String r2) {
        super(r2);
        this.httpStatusCode = r1;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public FirebaseRemoteConfigServerException(int r1, String r2, Throwable r3) {
        super(r2, r3);
        this.httpStatusCode = r1;
    }

    public FirebaseRemoteConfigServerException(String r1, FirebaseRemoteConfigException.Code r2) {
        super(r1, r2);
        this.httpStatusCode = -1;
    }

    public FirebaseRemoteConfigServerException(int r1, String r2, FirebaseRemoteConfigException.Code r3) {
        super(r2, r3);
        this.httpStatusCode = r1;
    }

    public FirebaseRemoteConfigServerException(String r1, Throwable r2, FirebaseRemoteConfigException.Code r3) {
        super(r1, r2, r3);
        this.httpStatusCode = -1;
    }

    public FirebaseRemoteConfigServerException(int r1, String r2, Throwable r3, FirebaseRemoteConfigException.Code r4) {
        super(r2, r3, r4);
        this.httpStatusCode = r1;
    }
}
