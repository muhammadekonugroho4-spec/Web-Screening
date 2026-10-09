package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class zzahf implements zzaeb {
    public zzahf() {
    }

    public static zzahi zzg() {
        return new zzafs();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() throws JSONException {
        JSONObject r02 = new JSONObject();
        r02.put("idToken", zzc());
        r02.put("token", zzf());
        r02.put("providerId", zzd());
        r02.put("tokenType", zzb().toString());
        r02.put("tenantId", zze());
        return r02.toString();
    }

    public abstract zzagh zzb();

    public abstract String zzc();

    public abstract String zzd();

    public abstract String zze();

    public abstract String zzf();
}
