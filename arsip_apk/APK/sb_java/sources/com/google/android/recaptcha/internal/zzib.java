package com.google.android.recaptcha.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes5.dex */
public final class zzib implements zzih {
    private final Context zza;

    public zzib(Context r1) {
        this.zza = r1;
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final /* synthetic */ Object cs(Object[] r1) {
        return zzie.zza(this, r1);
    }

    @Override // com.google.android.recaptcha.internal.zzih
    @SuppressLint({"UnprotectedReceiver"})
    public final Object zza(Object... r20) {
        IntentFilter r1 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (Build.VERSION.SDK_INT < 33) goto L5;
        Intent r12 = this.zza.registerReceiver(null, r1, 4);
    L6:
        if (r12 == null) goto L13;
        int r2 = r12.getIntExtra("health", -1);
        int r4 = r12.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
        int r5 = r12.getIntExtra("plugged", -1);
        boolean r6 = r12.getBooleanExtra("present", false);
        int r7 = r12.getIntExtra("scale", -1);
        int r8 = r12.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        String r9 = r12.getStringExtra("technology");
        if (r9 != null) goto L10;
        r9 = "";
    L10:
        String r16 = r9;
        int r92 = r12.getIntExtra("temperature", -1);
        int r13 = r12.getIntExtra("voltage", -1);
        return new Object[]{Integer.valueOf(r2), Integer.valueOf(r4), Integer.valueOf(r5), Boolean.valueOf(r6), Integer.valueOf(r7), Integer.valueOf(r8), r16, Integer.valueOf(r92), Integer.valueOf(r13)};
    L13:
        throw new zzce(7, 19, null);
    L5:
        r12 = this.zza.registerReceiver(null, r1);
        goto L6
    }
}
