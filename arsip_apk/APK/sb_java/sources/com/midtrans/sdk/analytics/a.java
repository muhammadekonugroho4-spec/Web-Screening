package com.midtrans.sdk.analytics;

import com.google.firebase.messaging.Constants;
import retrofit2.d;
import retrofit2.http.f;
import retrofit2.http.t;

/* loaded from: classes6.dex */
public interface a {
    @f("/track")
    d<Integer> f(@t(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) String r1);
}
