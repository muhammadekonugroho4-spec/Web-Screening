package com.google.firebase.auth;

/* loaded from: classes6.dex */
public abstract class FirebaseAuthSettings {
    public FirebaseAuthSettings() {
    }

    public abstract void forceRecaptchaFlowForTesting(boolean r1);

    public abstract void setAppVerificationDisabledForTesting(boolean r1);

    public abstract void setAutoRetrievedSmsCodeForPhoneNumber(String r1, String r2);
}
