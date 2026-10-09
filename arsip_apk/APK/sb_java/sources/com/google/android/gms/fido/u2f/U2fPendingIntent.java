package com.google.android.gms.fido.u2f;

import android.app.Activity;
import android.content.IntentSender;

@Deprecated
/* loaded from: classes5.dex */
public interface U2fPendingIntent {
    boolean hasPendingIntent();

    void launchPendingIntent(Activity r1, int r2) throws IntentSender.SendIntentException;
}
