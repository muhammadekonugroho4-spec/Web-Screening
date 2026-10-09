package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.C2337a;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzcg implements zzcl {
    public static final String[] zza = null;
    private static final Map zzb = null;
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private final ContentObserver zzf;
    private final Object zzg;
    private volatile Map zzh;
    private final List zzi;

    static {
        zzb = new C2337a();
        zza = new String[]{Constants.KEY_KEY, "value"};
    }

    private zzcg(ContentResolver r3, Uri r4, Runnable r5) {
        zzcf r02 = new zzcf(this, null);
        this.zzf = r02;
        this.zzg = new Object();
        this.zzi = new ArrayList();
        r3.getClass();
        r4.getClass();
        this.zzc = r3;
        this.zzd = r4;
        this.zze = r5;
        r3.registerContentObserver(r4, false, r02);
    }

    public static zzcg zza(ContentResolver r4, Uri r5, Runnable r6) {
        monitor-enter(zzcg.class);
        Map r1 = zzb;     // Catch: Throwable -> L9
        zzcg r2 = (zzcg) r1.get(r5);     // Catch: Throwable -> L9
        if (r2 == null) goto L22;
    L12:
        monitor-exit(zzcg.class);     // Catch: Throwable -> L9
        return r2;
    L22:
        zzcg r3 = new zzcg(r4, r5, r6);     // Catch: Throwable -> L9 SecurityException -> L17
        r1.put(r5, r3);     // Catch: Throwable -> L9 SecurityException -> L16
    L11:
        r2 = r3;
    L9:
        th = move-exception;
        throw th;
    }

    public static synchronized void zzd() {
        monitor-enter(zzcg.class);
        Iterator r1 = zzb.values().iterator();     // Catch: Throwable -> L8
    L6:
        if (r1.hasNext() == false) goto L10;
        zzcg r2 = (zzcg) r1.next();     // Catch: Throwable -> L8
        r2.zzc.unregisterContentObserver(r2.zzf);     // Catch: Throwable -> L8
        goto L6
    L10:
        zzb.clear();     // Catch: Throwable -> L8
        monitor-exit(zzcg.class);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzcl
    public final /* bridge */ /* synthetic */ Object zzb(String r5) {
        Map r02 = this.zzh;
        Map r03 = r02;
        if (r02 != null) goto L25;
        Object r1 = this.zzg;
        monitor-enter(r1);
        Map r04 = this.zzh;     // Catch: Throwable -> L12
        Map r05 = r04;
        if (r04 != null) goto L21;
        StrictMode.ThreadPolicy r06 = StrictMode.allowThreadDiskReads();     // Catch: Throwable -> L12
        Map r2 = (Map) zzcj.zza(new zzce(this));     // Catch: Throwable -> L14 Throwable -> L16
        StrictMode.setThreadPolicy(r06);     // Catch: Throwable -> L12
    L18:
        this.zzh = r2;     // Catch: Throwable -> L12
        r06 = r2;
        r05 = r06;
    L14:
        th = move-exception;
        StrictMode.setThreadPolicy(r06);     // Catch: Throwable -> L12
        throw th;     // Catch: Throwable -> L12
    L16:
        Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");     // Catch: Throwable -> L14
        StrictMode.setThreadPolicy(r06);     // Catch: Throwable -> L12
        r2 = null;
    L21:
        monitor-exit(r1);     // Catch: Throwable -> L12
        r03 = r05;
    L12:
        th = move-exception;
        throw th;
    L25:
        if (r03 != null) goto L28;
        r03 = Collections.EMPTY_MAP;
    L28:
        return (String) r03.get(r5);
    }

    public final /* synthetic */ Map zzc() {
        Cursor r1 = this.zzc.query(this.zzd, zza, null, null, null);
        if (r1 == null) goto L5;
        int r02 = r1.getCount();     // Catch: Throwable -> L11
        if (r02 != 0) goto L14;
        Map r03 = Collections.EMPTY_MAP;     // Catch: Throwable -> L11
        r1.close();
        return r03;
    L14:
        if (r02 > 256) goto L16;
        Map r2 = new C2337a(r02);     // Catch: Throwable -> L11
    L18:
        if (r1.moveToNext() == false) goto L21;
        r2.put(r1.getString(0), r1.getString(1));     // Catch: Throwable -> L11
        goto L18
    L21:
        r1.close();
        return r2;
    L16:
        r2 = new HashMap(r02, 1.0f);     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        r1.close();
        throw th;
    L5:
        return Collections.EMPTY_MAP;
    }

    public final void zze() {
        Object r02 = this.zzg;
        monitor-enter(r02);
        this.zzh = null;     // Catch: Throwable -> L18
        zzdc.zzd();     // Catch: Throwable -> L18
        monitor-exit(r02);     // Catch: Throwable -> L18
        monitor-enter(this);
        Iterator r03 = this.zzi.iterator();     // Catch: Throwable -> L12
    L10:
        if (r03.hasNext() == false) goto L14;
        ((zzch) r03.next()).zza();     // Catch: Throwable -> L12
        goto L10
    L14:
        monitor-exit(this);     // Catch: Throwable -> L12
        return;
    L12:
        th = move-exception;
        throw th;
    L18:
        th = move-exception;
        throw th;
    }
}
