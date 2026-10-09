package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class zzgx implements zzgy {
    private final AtomicBoolean zza;
    private HashMap<String, String> zzb;
    private final HashMap<String, Boolean> zzc;
    private final HashMap<String, Integer> zzd;
    private final HashMap<String, Long> zze;
    private final HashMap<String, Float> zzf;
    private Object zzg;
    private boolean zzh;
    private String[] zzi;
    private final zzhe zzj;

    public zzgx() {
        this.zza = new AtomicBoolean();
        this.zzb = null;
        this.zzc = new HashMap(16, 1.0f);
        this.zzd = new HashMap(16, 1.0f);
        this.zze = new HashMap(16, 1.0f);
        this.zzf = new HashMap(16, 1.0f);
        this.zzg = null;
        this.zzh = false;
        this.zzi = new String[0];
        this.zzj = new zzhc();
    }

    public static /* bridge */ /* synthetic */ AtomicBoolean zza(zzgx r02) {
        return r02.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final String zza(ContentResolver r7, String r8, String r9) {
        if (r7 == null) goto L69;
        monitor-enter(this);
        int r1 = 0;
        String r2 = null;
        if (this.zzb != null) goto L10;
        this.zza.set(false);     // Catch: Throwable -> L7
        this.zzb = new HashMap(16, 1.0f);     // Catch: Throwable -> L7
        this.zzg = new Object();     // Catch: Throwable -> L7
        r7.registerContentObserver(zzgw.zza, true, new zzgz(this, null));     // Catch: Throwable -> L7
    L12:
        Object r92 = this.zzg;     // Catch: Throwable -> L7
        if (this.zzb.containsKey(r8) == false) goto L19;
        String r72 = this.zzb.get(r8);     // Catch: Throwable -> L7
        if (r72 == null) goto L17;
        r2 = r72;
    L17:
        monitor-exit(this);     // Catch: Throwable -> L7
        return r2;
    L19:
        String[] r3 = this.zzi;     // Catch: Throwable -> L7
        int r4 = r3.length;     // Catch: Throwable -> L7
    L20:
        if (r1 >= r4) goto L47;
        if (r8.startsWith(r3[r1]) == true) goto L24;
        r1 = r1 + 1;     // Catch: Throwable -> L7
        goto L20
    L24:
        if (this.zzh == false) goto L76;
    L44:
        monitor-exit(this);     // Catch: Throwable -> L7
        return null;
    L76:
        HashMap<String, String> r73 = (HashMap) this.zzj.zza(r7, this.zzi, new zzha());     // Catch: Throwable -> L7 zzhd -> L70
        if (r73.isEmpty() == true) goto L31;
        Set<String> r93 = r73.keySet();     // Catch: Throwable -> L7
        r93.removeAll(this.zzc.keySet());     // Catch: Throwable -> L7
        r93.removeAll(this.zzd.keySet());     // Catch: Throwable -> L7
        r93.removeAll(this.zze.keySet());     // Catch: Throwable -> L7
        r93.removeAll(this.zzf.keySet());     // Catch: Throwable -> L7
    L31:
        if (r73.isEmpty() == false) goto L33;
    L36:
        this.zzh = true;     // Catch: Throwable -> L7
        goto L38
    L33:
        if (this.zzb.isEmpty() == false) goto L35;
        this.zzb = r73;     // Catch: Throwable -> L7
        goto L36
    L35:
        this.zzb.putAll(r73);     // Catch: Throwable -> L7
    L38:
        if (this.zzb.containsKey(r8) == false) goto L44;
        String r74 = this.zzb.get(r8);     // Catch: Throwable -> L7
        if (r74 == null) goto L42;
        r2 = r74;
    L42:
        monitor-exit(this);     // Catch: Throwable -> L7
        return r2;
    L47:
        monitor-exit(this);     // Catch: Throwable -> L7
        String r75 = this.zzj.zza(r7, r8);     // Catch: zzhd -> L65
        if (r75 != null) goto L51;
    L53:
        monitor-enter(this);
    L57:
        th = move-exception;
        throw th;
    L55:
        if (r92 != this.zzg) goto L59;
        this.zzb.put(r8, r75);     // Catch: Throwable -> L57
    L59:
        monitor-exit(this);     // Catch: Throwable -> L57
        if (r75 == null) goto L62;
        return r75;
    L62:
        return null;
    L51:
        if (r75.equals(null) == false) goto L53;
        r75 = null;
    L65:
        return null;
    L10:
        if (this.zza.getAndSet(false) == false) goto L12;
        this.zzb.clear();     // Catch: Throwable -> L7
        this.zzc.clear();     // Catch: Throwable -> L7
        this.zzd.clear();     // Catch: Throwable -> L7
        this.zze.clear();     // Catch: Throwable -> L7
        this.zzf.clear();     // Catch: Throwable -> L7
        this.zzg = new Object();     // Catch: Throwable -> L7
        this.zzh = false;     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        throw th;
    L69:
        throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
    }
}
