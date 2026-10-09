package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.firebase.messaging.Constants;

/* loaded from: classes5.dex */
public final class i implements k {
    public i() {
    }

    @Override // com.google.android.play.core.integrity.k
    public final ApiException a(Bundle r3) {
        int r32 = r3.getInt(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        if (r32 != 0) goto L6;
        return null;
    L6:
        return new IntegrityServiceException(r32, null);
    }
}
