package com.google.firebase.appcheck.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.AppCheckTokenResult;

/* loaded from: classes6.dex */
public final class DefaultAppCheckTokenResult extends AppCheckTokenResult {
    static final String DUMMY_TOKEN = "eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==";
    private final FirebaseException error;
    private final String token;

    private DefaultAppCheckTokenResult(String r1, FirebaseException r2) {
        Preconditions.checkNotEmpty(r1);
        this.token = r1;
        this.error = r2;
    }

    public static DefaultAppCheckTokenResult constructFromAppCheckToken(AppCheckToken r2) {
        Preconditions.checkNotNull(r2);
        return new DefaultAppCheckTokenResult(r2.getToken(), null);
    }

    public static DefaultAppCheckTokenResult constructFromError(FirebaseException r2) {
        return new DefaultAppCheckTokenResult(DUMMY_TOKEN, (FirebaseException) Preconditions.checkNotNull(r2));
    }

    @Override // com.google.firebase.appcheck.AppCheckTokenResult
    public Exception getError() {
        return this.error;
    }

    @Override // com.google.firebase.appcheck.AppCheckTokenResult
    public String getToken() {
        return this.token;
    }
}
