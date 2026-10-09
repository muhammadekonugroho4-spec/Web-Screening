package com.midtrans.sdk.corekit.callback;

import com.midtrans.sdk.corekit.models.snap.Token;

/* loaded from: classes6.dex */
public interface CheckoutCallback extends HttpRequestCallback {
    void onFailure(Token r1, String r2);

    void onSuccess(Token r1);
}
