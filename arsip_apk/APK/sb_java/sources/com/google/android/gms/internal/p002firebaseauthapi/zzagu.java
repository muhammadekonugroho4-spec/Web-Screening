package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzagu implements zzaeb {
    private final String zza;
    private final String zzb;
    private final String zzc;

    private zzagu(String r1, String r2) {
        this.zza = r1;
        this.zzb = "CLIENT_TYPE_ANDROID";
        this.zzc = r2;
    }

    public static zzagu zza(String r1, String r2) {
        return new zzagu(r1, r2);
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() throws JSONException {
        JSONObject r02 = new JSONObject();
        if (TextUtils.isEmpty(this.zza) == true) goto L6;
        r02.put("tenantId", this.zza);
    L6:
        if (TextUtils.isEmpty(this.zzb) == true) goto L9;
        r02.put("clientType", this.zzb);
    L9:
        if (TextUtils.isEmpty(this.zzc) == true) goto L12;
        r02.put("recaptchaVersion", this.zzc);
    L12:
        return r02.toString();
    }
}
