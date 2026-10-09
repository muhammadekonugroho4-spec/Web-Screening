package com.huawei.hms.common.internal;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes6.dex */
public abstract class DialogRedirect implements DialogInterface.OnClickListener {
    public DialogRedirect() {
    }

    public static DialogRedirect getInstance(Activity r1, Intent r2, int r3) {
        return new DialogRedirectImpl(r2, r1, r3);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface r2, int r3) {
        redirect();     // Catch: Throwable -> L4
    L5:
        r2.dismiss();
        return;
    L4:
        HMSLog.e("DialogRedirect", "Failed to start resolution intent");     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        r2.dismiss();
        throw th;
    }

    public abstract void redirect();
}
