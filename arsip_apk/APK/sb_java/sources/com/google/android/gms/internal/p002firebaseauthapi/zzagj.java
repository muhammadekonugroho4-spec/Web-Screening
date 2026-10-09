package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzagj implements zzaeb {
    private String zza;

    public zzagj(String r1) {
        this.zza = Preconditions.checkNotEmpty(r1);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() throws JSONException {
        JSONObject r02 = new JSONObject();
        r02.put("idToken", this.zza);
        return r02.toString();
    }
}
