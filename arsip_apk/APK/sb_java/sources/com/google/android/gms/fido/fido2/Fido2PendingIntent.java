package com.google.android.gms.fido.fido2;

import android.app.Activity;
import android.content.IntentSender;

@Deprecated
/* loaded from: classes5.dex */
public interface Fido2PendingIntent {
    boolean hasPendingIntent();

    void launchPendingIntent(Activity r1, int r2) throws IntentSender.SendIntentException;
}
