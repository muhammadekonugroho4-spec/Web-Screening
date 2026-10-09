package com.google.android.gms.internal.fido;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import com.google.android.gms.fido.fido2.Fido2PendingIntent;

@Deprecated
/* loaded from: classes5.dex */
public final class zzi implements Fido2PendingIntent {
    private final PendingIntent zza;

    public zzi(PendingIntent r1) {
        this.zza = r1;
    }

    @Override // com.google.android.gms.fido.fido2.Fido2PendingIntent
    public final boolean hasPendingIntent() {
        if (this.zza == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // com.google.android.gms.fido.fido2.Fido2PendingIntent
    public final void launchPendingIntent(Activity r9, int r10) throws IntentSender.SendIntentException {
        PendingIntent r02 = this.zza;
        if (r02 == null) goto L7;
        r9.startIntentSenderForResult(r02.getIntentSender(), r10, null, 0, 0, 0);
        return;
    L7:
        throw new IllegalStateException("No PendingIntent available");
    }
}
