package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzaih implements zzaeb {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzaih() {
    }

    public static zzaih zza(String r1, String r2, boolean r3) {
        zzaih r02 = new zzaih();
        r02.zzb = Preconditions.checkNotEmpty(r1);
        r02.zzc = Preconditions.checkNotEmpty(r2);
        r02.zzf = r3;
        return r02;
    }

    public static zzaih zzb(String r1, String r2, boolean r3) {
        zzaih r02 = new zzaih();
        r02.zza = Preconditions.checkNotEmpty(r1);
        r02.zzd = Preconditions.checkNotEmpty(r2);
        r02.zzf = r3;
        return r02;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() throws JSONException {
        JSONObject r02 = new JSONObject();
        if (TextUtils.isEmpty(this.zzd) == true) goto L5;
        r02.put("phoneNumber", this.zza);
        r02.put("temporaryProof", this.zzd);
    L6:
        String r1 = this.zze;
        if (r1 == null) goto L10;
        r02.put("idToken", r1);
    L10:
        if (this.zzf == true) goto L13;
        r02.put("operation", 2);
    L13:
        return r02.toString();
    L5:
        r02.put("sessionInfo", this.zzb);
        r02.put("code", this.zzc);
        goto L6
    }

    public final void zza(String r1) {
        this.zze = r1;
    }
}
