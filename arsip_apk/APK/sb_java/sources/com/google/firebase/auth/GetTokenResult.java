package com.google.firebase.auth;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Map;

/* loaded from: classes6.dex */
public class GetTokenResult {
    private String zza;
    private Map<String, Object> zzb;

    @KeepForSdk
    public GetTokenResult(String r1, Map<String, Object> r2) {
        this.zza = r1;
        this.zzb = r2;
    }

    private final long zza(String r3) {
        Integer r32 = (Integer) this.zzb.get(r3);
        if (r32 != null) goto L7;
        return 0;
    L7:
        return r32.longValue();
    }

    public long getAuthTimestamp() {
        return zza("auth_time");
    }

    public Map<String, Object> getClaims() {
        return this.zzb;
    }

    public long getExpirationTimestamp() {
        return zza("exp");
    }

    public long getIssuedAtTimestamp() {
        return zza("iat");
    }

    public String getSignInProvider() {
        Map r02 = (Map) this.zzb.get("firebase");
        if (r02 != null) goto L5;
        return null;
    L5:
        return (String) r02.get("sign_in_provider");
    }

    @KeepForSdk
    public String getSignInSecondFactor() {
        Map r02 = (Map) this.zzb.get("firebase");
        if (r02 != null) goto L5;
        return null;
    L5:
        return (String) r02.get("sign_in_second_factor");
    }

    public String getToken() {
        return this.zza;
    }
}
