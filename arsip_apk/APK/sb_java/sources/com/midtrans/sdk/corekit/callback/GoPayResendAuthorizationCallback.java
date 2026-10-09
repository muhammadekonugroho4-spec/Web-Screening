package com.midtrans.sdk.corekit.callback;

import com.midtrans.sdk.corekit.models.GoPayResendAuthorizationResponse;

/* loaded from: classes6.dex */
public interface GoPayResendAuthorizationCallback extends HttpRequestCallback {
    @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
    void onError(Throwable r1);

    void onFailure(GoPayResendAuthorizationResponse r1, String r2);

    void onSuccess(GoPayResendAuthorizationResponse r1);
}
