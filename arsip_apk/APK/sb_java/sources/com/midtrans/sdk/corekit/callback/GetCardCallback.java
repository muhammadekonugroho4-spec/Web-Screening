package com.midtrans.sdk.corekit.callback;

import com.midtrans.sdk.corekit.models.SaveCardRequest;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public interface GetCardCallback extends HttpRequestCallback {
    void onFailure(String r1);

    void onSuccess(ArrayList<SaveCardRequest> r1);
}
