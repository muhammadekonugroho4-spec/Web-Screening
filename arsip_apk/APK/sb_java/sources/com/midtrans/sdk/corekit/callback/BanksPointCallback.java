package com.midtrans.sdk.corekit.callback;

import com.midtrans.sdk.corekit.models.snap.BanksPointResponse;

/* loaded from: classes6.dex */
public interface BanksPointCallback extends HttpRequestCallback {
    void onFailure(String r1);

    void onSuccess(BanksPointResponse r1);
}
