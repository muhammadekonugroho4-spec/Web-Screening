package com.midtrans.sdk.corekit.callback;

import com.midtrans.sdk.corekit.models.snap.TransactionStatusResponse;

/* loaded from: classes6.dex */
public interface GetTransactionStatusCallback extends HttpRequestCallback {
    void onFailure(TransactionStatusResponse r1, String r2);

    void onSuccess(TransactionStatusResponse r1);
}
