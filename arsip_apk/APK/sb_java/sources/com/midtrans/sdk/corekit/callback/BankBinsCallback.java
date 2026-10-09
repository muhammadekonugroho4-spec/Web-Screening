package com.midtrans.sdk.corekit.callback;

import com.midtrans.sdk.corekit.models.snap.BankBinsResponse;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public interface BankBinsCallback extends HttpRequestCallback {
    void onFailure(String r1);

    void onSuccess(ArrayList<BankBinsResponse> r1);
}
