package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzahv implements zzahp {
    private final String zza;
    private final String zzb;

    private zzahv(String r1, String r2) {
        this.zza = Preconditions.checkNotEmpty(r1);
        this.zzb = r2;
    }

    public static zzahv zza(String r1, String r2) {
        return new zzahv(r1, r2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() throws JSONException {
        JSONObject r02 = new JSONObject();
        r02.put("idToken", this.zza);
        if (TextUtils.isEmpty(this.zzb) == true) goto L5;
        r02.put("tenantId", this.zzb);
    L5:
        r02.put("totpEnrollmentInfo", new JSONObject());
        return r02.toString();
    }
}
