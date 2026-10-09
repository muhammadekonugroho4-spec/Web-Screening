package com.google.firebase.auth;

/* loaded from: classes6.dex */
public final class FirebaseAuthWeakPasswordException extends FirebaseAuthInvalidCredentialsException {
    private final String zza;

    public FirebaseAuthWeakPasswordException(String r1, String r2, String r3) {
        super(r1, r2);
        this.zza = r3;
    }

    public final String getReason() {
        return this.zza;
    }
}
