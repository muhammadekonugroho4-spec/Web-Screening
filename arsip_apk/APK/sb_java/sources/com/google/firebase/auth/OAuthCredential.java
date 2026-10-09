package com.google.firebase.auth;

/* loaded from: classes6.dex */
public abstract class OAuthCredential extends AuthCredential {
    public OAuthCredential() {
    }

    public abstract String getAccessToken();

    public abstract String getIdToken();

    public abstract String getSecret();
}
