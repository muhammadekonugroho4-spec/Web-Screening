package com.google.firebase.auth;

/* loaded from: classes6.dex */
public final class FirebaseAuthUserCollisionException extends FirebaseAuthException {
    private AuthCredential zza;
    private String zzb;

    public FirebaseAuthUserCollisionException(String r1, String r2) {
        super(r1, r2);
    }

    public final String getEmail() {
        return this.zzb;
    }

    public final AuthCredential getUpdatedCredential() {
        return this.zza;
    }

    public final FirebaseAuthUserCollisionException zza(AuthCredential r1) {
        this.zza = r1;
        return this;
    }

    public final FirebaseAuthUserCollisionException zza(String r1) {
        this.zzb = r1;
        return this;
    }
}
