package com.google.firebase.auth;

/* loaded from: classes6.dex */
public class TwitterAuthProvider {
    public static final String PROVIDER_ID = "twitter.com";
    public static final String TWITTER_SIGN_IN_METHOD = "twitter.com";

    private TwitterAuthProvider() {
    }

    public static AuthCredential getCredential(String r1, String r2) {
        return new TwitterAuthCredential(r1, r2);
    }
}
