package com.google.android.gms.common;

import android.content.Intent;

/* loaded from: classes5.dex */
public class UserRecoverableException extends Exception {
    private final Intent zza;

    public UserRecoverableException(String r1, Intent r2) {
        super(r1);
        this.zza = r2;
    }

    public Intent getIntent() {
        return new Intent(this.zza);
    }
}
