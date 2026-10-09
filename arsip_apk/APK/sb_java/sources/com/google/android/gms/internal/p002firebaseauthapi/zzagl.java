package com.google.android.gms.internal.p002firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.zzal;
import com.google.firebase.auth.zzc;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzagl {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzahb zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private zzc zzk;
    private List<zzagz> zzl;
    private zzaj<zzal> zzm;

    public zzagl() {
        this.zzf = new zzahb();
        this.zzm = zzaj.zzh();
    }

    public final long zza() {
        return this.zzh;
    }

    public final long zzb() {
        return this.zzi;
    }

    public final Uri zzc() {
        if (TextUtils.isEmpty(this.zze) == false) goto L5;
        return null;
    L5:
        return Uri.parse(this.zze);
    }

    public final zzaj<zzal> zzd() {
        return this.zzm;
    }

    public final zzc zze() {
        return this.zzk;
    }

    public final zzahb zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final String zzi() {
        return this.zza;
    }

    public final String zzj() {
        return this.zzg;
    }

    public final List<zzagz> zzk() {
        return this.zzl;
    }

    public final List<zzahc> zzl() {
        return this.zzf.zza();
    }

    public final boolean zzm() {
        return this.zzc;
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final zzagl zza(zzc r1) {
        this.zzk = r1;
        return this;
    }

    public final zzagl zzb(String r1) {
        this.zzb = r1;
        return this;
    }

    public final zzagl zza(String r1) {
        this.zzd = r1;
        return this;
    }

    public final zzagl zzc(String r1) {
        this.zze = r1;
        return this;
    }

    public zzagl(String r1, String r2, boolean r3, String r4, String r5, zzahb r6, String r7, String r8, long r9, long r11, boolean r13, zzc r14, List<zzagz> r15, zzaj<zzal> r16) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
        this.zzd = r4;
        this.zze = r5;
        if (r6 != null) goto L5;
        zzahb r12 = new zzahb();
    L9:
        this.zzf = r12;
        this.zzg = r8;
        this.zzh = r9;
        this.zzi = r11;
        this.zzj = false;
        this.zzk = null;
        if (r15 != null) goto L12;
        List<zzagz> r17 = new ArrayList();
    L13:
        this.zzl = r17;
        this.zzm = r16;
        return;
    L12:
        r17 = r15;
        goto L13
    L5:
        List<zzahc> r18 = r6.zza();
        zzahb r22 = new zzahb();
        if (r18 == null) goto L8;
        r22.zza().addAll(r18);
    L8:
        r12 = r22;
        goto L9
    }

    public final zzagl zza(boolean r1) {
        this.zzj = r1;
        return this;
    }

    public final zzagl zza(zzaj<zzal> r1) {
        Preconditions.checkNotNull(r1);
        this.zzm = r1;
        return this;
    }

    public final zzagl zza(List<zzahc> r2) {
        Preconditions.checkNotNull(r2);
        zzahb r02 = new zzahb();
        this.zzf = r02;
        r02.zza().addAll(r2);
        return this;
    }
}
