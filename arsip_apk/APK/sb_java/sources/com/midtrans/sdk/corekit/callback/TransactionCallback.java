package com.midtrans.sdk.corekit.callback;

import com.midtrans.sdk.corekit.models.TransactionResponse;

/* loaded from: classes6.dex */
public interface TransactionCallback extends HttpRequestCallback {
    void onFailure(TransactionResponse r1, String r2);

    void onSuccess(TransactionResponse r1);
}
