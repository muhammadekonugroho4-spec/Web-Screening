package com.google.android.gms.internal.p002firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes5.dex */
public final class zzahc {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;

    public zzahc() {
    }

    public final Uri zza() {
        if (TextUtils.isEmpty(this.zzc) == false) goto L5;
        return null;
    L5:
        return Uri.parse(this.zzc);
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final String zzd() {
        return this.zza;
    }

    public final String zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zzd;
    }

    public final String zzg() {
        return this.zze;
    }

    public zzahc(String r1, String r2, String r3, String r4, String r5, String r6, String r7) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
        this.zzd = r4;
        this.zze = null;
        this.zzf = r6;
        this.zzg = r7;
    }

    public final void zza(String r1) {
        this.zze = r1;
    }
}
