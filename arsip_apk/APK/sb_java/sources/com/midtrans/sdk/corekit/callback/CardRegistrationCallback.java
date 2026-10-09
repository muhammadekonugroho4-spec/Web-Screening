package com.midtrans.sdk.corekit.callback;

import com.midtrans.sdk.corekit.models.CardRegistrationResponse;

/* loaded from: classes6.dex */
public interface CardRegistrationCallback extends HttpRequestCallback {
    void onFailure(CardRegistrationResponse r1, String r2);

    void onSuccess(CardRegistrationResponse r1);
}
