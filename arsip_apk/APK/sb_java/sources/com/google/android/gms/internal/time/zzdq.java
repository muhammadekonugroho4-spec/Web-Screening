package com.google.android.gms.internal.time;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class zzdq {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final long zze;

    public zzdq(String r2, Class r3, boolean r4) {
        this(r2, r3, r4, true);
    }

    public static zzdq zzd(String r2, Class r3) {
        return new zzdq(r2, r3, false, false);
    }

    public final String toString() {
        Class r02 = this.zzb;
        return getClass().getName() + RemoteSettings.FORWARD_SLASH_STRING + this.zza + Constants.AES_PREFIX + r02.getName() + Constants.AES_SUFFIX;
    }

    public void zza(Iterator r2, zzdp r3) {
    L3:
        if (r2.hasNext() == false) goto L5;
        zzb(r2.next(), r3);
        goto L3
    }

    public void zzb(Object r2, zzdp r3) {
        r3.zza(this.zza, r2);
    }

    public final long zzc() {
        return this.zze;
    }

    public final Object zze(Object r2) {
        return this.zzb.cast(r2);
    }

    public final String zzf() {
        return this.zza;
    }

    public final void zzg(Object r3, zzdp r4) {
        if (this.zzd == true) goto L5;
    L8:
        zzb(r3, r4);
        return;
    L5:
        if (zzfp.zza() <= 20) goto L8;
        r4.zza(this.zza, r3);
    }

    public final void zzh(Iterator r3, zzdp r4) {
        zzhf.zzd(this.zzc, "non repeating key");
        if (this.zzd == true) goto L5;
    L10:
        zza(r3, r4);
        return;
    L5:
        if (zzfp.zza() <= 20) goto L10;
    L7:
        if (r3.hasNext() == false) goto L9;
        r4.zza(this.zza, r3.next());
        goto L7
    }

    public final boolean zzi() {
        return this.zzc;
    }

    private zzdq(String r4, Class r5, boolean r6, boolean r7) {
        zzhf.zzb(r4);
        this.zza = r4;
        this.zzb = r5;
        this.zzc = r6;
        this.zzd = r7;
        int r42 = System.identityHashCode(this);
        int r52 = 0;
        long r62 = 0;
    L4:
        if (r52 >= 5) goto L6;
        r62 = r62 | (1 << (r42 & 63));
        r42 = r42 >>> 6;
        r52 = r52 + 1;
        goto L4
    L6:
        this.zze = r62;
    }
}
