package com.android.volley;

import android.content.Intent;

/* loaded from: classes4.dex */
public class AuthFailureError extends VolleyError {
    private Intent mResolutionIntent;

    public AuthFailureError() {
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.mResolutionIntent == null) goto L7;
        return "User needs to (re)enter credentials.";
    L7:
        return super.getMessage();
    }

    public AuthFailureError(h r1) {
        super(r1);
    }
}
