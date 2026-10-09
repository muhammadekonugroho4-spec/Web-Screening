package com.facebook.appevents.gps.pa;

import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.appevents.gps.pa.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC4452b {
    public static /* bridge */ /* synthetic */ void a(CustomAudienceManager r02, JoinCustomAudienceRequest r1, Executor r2, OutcomeReceiver r3) {
        r02.joinCustomAudience(r1, r2, r3);
    }
}
