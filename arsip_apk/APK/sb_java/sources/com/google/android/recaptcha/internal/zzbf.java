package com.google.android.recaptcha.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzbf {
    private final SharedPreferences zza;

    public zzbf(Context r3) {
        this.zza = r3.getSharedPreferences("_GRECAPTCHA", 0);
    }

    public final String zza() {
        String r02 = this.zza.getString("_GRECAPTCHA_KC", null);
        if (r02 != null) goto L6;
        return "";
    L6:
        return r02;
    }

    public final void zzb(Map r4) {
        SharedPreferences.Editor r02 = this.zza.edit();
        Iterator r42 = r4.entrySet().iterator();
    L4:
        if (r42.hasNext() == false) goto L6;
        Map.Entry r1 = (Map.Entry) r42.next();
        r02.putString((String) r1.getKey(), (String) r1.getValue());
        goto L4
    L6:
        r02.commit();
    }
}
