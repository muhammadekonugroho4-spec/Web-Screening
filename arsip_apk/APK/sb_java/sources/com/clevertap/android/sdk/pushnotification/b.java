package com.clevertap.android.sdk.pushnotification;

/* loaded from: classes4.dex */
public interface b {
    h getPushType();

    boolean isAvailable();

    boolean isSupported();

    int minSDKSupportVersionCode();

    void requestToken();
}
