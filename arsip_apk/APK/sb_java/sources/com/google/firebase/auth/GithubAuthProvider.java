package com.google.firebase.auth;

/* loaded from: classes6.dex */
public class GithubAuthProvider {
    public static final String GITHUB_SIGN_IN_METHOD = "github.com";
    public static final String PROVIDER_ID = "github.com";

    private GithubAuthProvider() {
    }

    public static AuthCredential getCredential(String r1) {
        return new GithubAuthCredential(r1);
    }
}
