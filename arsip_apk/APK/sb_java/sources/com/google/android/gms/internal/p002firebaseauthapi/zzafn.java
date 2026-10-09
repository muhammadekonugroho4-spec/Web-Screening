package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzafn {
    private final String zza;

    public zzafn(String r1) {
        this.zza = Preconditions.checkNotEmpty(r1);
    }

    public final JSONObject zza() throws JSONException {
        JSONObject r02 = new JSONObject();
        r02.put("appSignatureHash", this.zza);
        return r02;
    }
}
