package com.midtrans.sdk.corekit.callback;

import com.midtrans.sdk.corekit.models.TokenDetailsResponse;

/* loaded from: classes6.dex */
public interface CardTokenCallback extends HttpRequestCallback {
    void onFailure(TokenDetailsResponse r1, String r2);

    void onSuccess(TokenDetailsResponse r1);
}
