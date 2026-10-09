package com.google.android.gms.auth;

import android.content.Intent;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes5.dex */
public class UserRecoverableAuthException extends GoogleAuthException {
    private final Intent zza;

    public UserRecoverableAuthException(String r1, Intent r2) {
        super(r1);
        this.zza = r2;
    }

    public Intent getIntent() {
        Intent r02 = this.zza;
        if (r02 != null) goto L7;
        return null;
    L7:
        return new Intent(r02);
    }
}
