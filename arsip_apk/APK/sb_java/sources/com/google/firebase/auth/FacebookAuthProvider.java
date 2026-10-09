package com.google.firebase.auth;

/* loaded from: classes6.dex */
public class FacebookAuthProvider {
    public static final String FACEBOOK_SIGN_IN_METHOD = "facebook.com";
    public static final String PROVIDER_ID = "facebook.com";

    private FacebookAuthProvider() {
    }

    public static AuthCredential getCredential(String r1) {
        return new FacebookAuthCredential(r1);
    }
}
