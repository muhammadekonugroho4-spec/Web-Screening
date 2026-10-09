package com.google.firebase.auth;

import android.app.Activity;

/* loaded from: classes6.dex */
public interface TotpSecret {
    String generateQrCodeUrl();

    String generateQrCodeUrl(String r1, String r2);

    int getCodeIntervalSeconds();

    int getCodeLength();

    long getEnrollmentCompletionDeadline();

    String getHashAlgorithm();

    String getSessionInfo();

    String getSharedSecretKey();

    void openInOtpApp(String r1);

    void openInOtpApp(String r1, String r2, Activity r3);
}
