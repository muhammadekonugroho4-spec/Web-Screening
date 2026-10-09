package com.midtrans.sdk.corekit.callback;

import com.midtrans.sdk.corekit.models.SaveCardResponse;

/* loaded from: classes6.dex */
public interface SaveCardCallback extends HttpRequestCallback {
    void onFailure(String r1);

    void onSuccess(SaveCardResponse r1);
}
