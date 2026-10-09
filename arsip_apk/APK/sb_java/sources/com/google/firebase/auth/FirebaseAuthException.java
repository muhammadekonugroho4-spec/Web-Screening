package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;

/* loaded from: classes6.dex */
public class FirebaseAuthException extends FirebaseException {
    private final String zza;

    public FirebaseAuthException(String r1, String r2) {
        super(r2);
        this.zza = Preconditions.checkNotEmpty(r1);
    }

    public String getErrorCode() {
        return this.zza;
    }
}
