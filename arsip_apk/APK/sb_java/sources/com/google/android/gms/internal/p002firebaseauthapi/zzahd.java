package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzahd implements zzaeb {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzahd(String r1, String r2, String r3) {
        this.zza = Preconditions.checkNotEmpty(r1);
        this.zzb = r2;
        this.zzc = r3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() throws JSONException {
        JSONObject r02 = new JSONObject();
        r02.put("oobCode", this.zza);
        String r1 = this.zzb;
        if (r1 == null) goto L5;
        r02.put("newPassword", r1);
    L5:
        String r12 = this.zzc;
        if (r12 == null) goto L9;
        r02.put("tenantId", r12);
    L9:
        return r02.toString();
    }

    public final String zzb() {
        return this.zzb;
    }
}
