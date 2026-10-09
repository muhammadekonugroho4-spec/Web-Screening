package com.huawei.hms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;

/* loaded from: classes6.dex */
public class ResolvableApiException extends ApiException {
    public ResolvableApiException(Status r1) {
        super(r1);
    }

    public PendingIntent getResolution() {
        return this.mStatus.getResolution();
    }

    public Intent getResolutionIntent() {
        return this.mStatus.getResolutionIntent();
    }

    public void startResolutionForResult(Activity r2, int r3) throws IntentSender.SendIntentException {
        this.mStatus.startResolutionForResult(r2, r3);
    }

    public ResolvableApiException(ResponseErrorCode r4) {
        super(new Status(r4.getErrorCode(), r4.getErrorReason()));
        if (r4.hasResolution() == true) goto L5;
        return;
    L5:
        if ((r4.getParcelable() instanceof PendingIntent) == false) goto L9;
        this.mStatus.setPendingIntent((PendingIntent) r4.getParcelable());
        return;
    L9:
        if ((r4.getParcelable() instanceof Intent) == false) goto L13;
        this.mStatus.setIntent((Intent) r4.getParcelable());
        return;
    }
}
