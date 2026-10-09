package com.stockbit.android.service.accountManager;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes4.dex */
public class AuthenticatorService extends Service {
    public AuthenticatorService() {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent r1) {
        return new a(this).getIBinder();
    }
}
