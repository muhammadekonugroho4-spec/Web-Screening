package com.fingerprintjs.android.fingerprint.info_providers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.hms.android.SystemUtils;

/* loaded from: classes4.dex */
public final class BatteryInfoProviderImpl implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f37281a;

    public BatteryInfoProviderImpl(Context r2) {
        kotlin.jvm.internal.p.l(r2, "applicationContext");
        this.f37281a = r2;
    }

    public static final /* synthetic */ Context c(BatteryInfoProviderImpl r02) {
        return r02.f37281a;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.a
    public String a() {
        return (String) com.fingerprintjs.android.fingerprint.tools.a.a(new BatteryInfoProviderImpl$batteryTotalCapacity$1(this), "");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.a
    public String b() {
        Intent r02 = this.f37281a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (r02 != null) goto L5;
        return "";
    L5:
        int r03 = r02.getIntExtra("health", -1);
        if (r03 != (-1)) goto L8;
        return "";
    L8:
        return d(r03);
    }

    public final String d(int r1) {
        switch(r1) {
            case 2: goto L15;
            case 3: goto L13;
            case 4: goto L11;
            case 5: goto L9;
            case 6: goto L7;
            case 7: goto L5;
            default: goto L3;
        };
    L3:
        return SystemUtils.UNKNOWN;
    L5:
        return "cold";
    L7:
        return "unspecified failure";
    L9:
        return "over voltage";
    L11:
        return "dead";
    L13:
        return "overheat";
    L15:
        return "good";
    }
}
