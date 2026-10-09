package com.huawei.hms.api;

import android.content.Intent;

/* loaded from: classes6.dex */
public class UserRecoverableException extends Exception {
    private final Intent mIntent;

    public UserRecoverableException(String r1, Intent r2) {
        super(r1);
        this.mIntent = r2;
    }

    public Intent getIntent() {
        return new Intent(this.mIntent);
    }
}
