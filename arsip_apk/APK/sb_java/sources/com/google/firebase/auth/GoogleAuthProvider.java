package com.google.firebase.auth;

/* loaded from: classes6.dex */
public class GoogleAuthProvider {
    public static final String GOOGLE_SIGN_IN_METHOD = "google.com";
    public static final String PROVIDER_ID = "google.com";

    private GoogleAuthProvider() {
    }

    public static AuthCredential getCredential(String r1, String r2) {
        return new GoogleAuthCredential(r1, r2);
    }
}
