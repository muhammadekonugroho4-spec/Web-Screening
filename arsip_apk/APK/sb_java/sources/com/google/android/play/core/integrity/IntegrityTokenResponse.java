package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* loaded from: classes5.dex */
public abstract class IntegrityTokenResponse {
    public IntegrityTokenResponse() {
    }

    public abstract Task<Integer> showDialog(Activity r1, int r2);

    public abstract String token();
}
