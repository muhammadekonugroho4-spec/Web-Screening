package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.C2337a;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzhi implements zzhl {
    private static final Map<Uri, zzhi> zza = null;
    private static final String[] zzb = null;
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private final ContentObserver zzf;
    private final Object zzg;
    private volatile Map<String, String> zzh;
    private final List<zzhj> zzi;

    static {
        zza = new C2337a();
        zzb = new String[]{Constants.KEY_KEY, "value"};
    }

    private zzhi(ContentResolver r3, Uri r4, Runnable r5) {
        zzhk r02 = new zzhk(this, null);
        this.zzf = r02;
        this.zzg = new Object();
        this.zzi = new ArrayList();
        Preconditions.checkNotNull(r3);
        Preconditions.checkNotNull(r4);
        this.zzc = r3;
        this.zzd = r4;
        this.zze = r5;
        r3.registerContentObserver(r4, false, r02);
    }

    public static /* synthetic */ Map zza(zzhi r02) {
        return r02.zzd();
    }

    public static synchronized void zzb() {
        monitor-enter(zzhi.class);
        Iterator<zzhi> r1 = zza.values().iterator();     // Catch: Throwable -> L8
    L6:
        if (r1.hasNext() == false) goto L10;
        zzhi r2 = r1.next();     // Catch: Throwable -> L8
        r2.zzc.unregisterContentObserver(r2.zzf);     // Catch: Throwable -> L8
        goto L6
    L10:
        zza.clear();     // Catch: Throwable -> L8
        monitor-exit(zzhi.class);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    private final /* synthetic */ Map zzd() {
        ContentProviderClient r2 = this.zzc.acquireUnstableContentProviderClient(this.zzd);
        if (r2 != null) goto L53;
        Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
        return Collections.EMPTY_MAP;
    L53:
        Cursor r3 = r2.query(this.zzd, zzb, null, null, null);     // Catch: Throwable -> L12 RemoteException -> L14
        if (r3 != null) goto L20;
        Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");     // Catch: Throwable -> L18
        Map r02 = Collections.EMPTY_MAP;     // Catch: Throwable -> L18
        if (r3 == null) goto L16;
        r3.close();     // Catch: Throwable -> L12 RemoteException -> L14
    L16:
        r2.release();
        return r02;
    L20:
        int r03 = r3.getCount();     // Catch: Throwable -> L18
        if (r03 != 0) goto L27;
        Map r04 = Collections.EMPTY_MAP;     // Catch: Throwable -> L18
        r3.close();     // Catch: Throwable -> L12 RemoteException -> L14
        r2.release();
        return r04;
    L27:
        if (r03 > 256) goto L29;
        Map r4 = new C2337a(r03);     // Catch: Throwable -> L18
    L31:
        if (r3.moveToNext() == false) goto L34;
        r4.put(r3.getString(0), r3.getString(1));     // Catch: Throwable -> L18
        goto L31
    L34:
        if (r3.isAfterLast() == true) goto L39;
        Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");     // Catch: Throwable -> L18
        Map r05 = Collections.EMPTY_MAP;     // Catch: Throwable -> L18
        r3.close();     // Catch: Throwable -> L12 RemoteException -> L14
        r2.release();
        return r05;
    L39:
        r3.close();     // Catch: Throwable -> L12 RemoteException -> L14
        r2.release();
        return r4;
    L29:
        r4 = new HashMap(r03, 1.0f);     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        if (r3 == null) goto L60;
        r3.close();     // Catch: Throwable -> L45
        throw th;     // Catch: Throwable -> L12 RemoteException -> L14
    L45:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L12 RemoteException -> L14
        throw th;     // Catch: Throwable -> L12 RemoteException -> L14
    L60:
        throw th;     // Catch: Throwable -> L12 RemoteException -> L14
    L14:
        e = move-exception;
        Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e);     // Catch: Throwable -> L12
        Map r06 = Collections.EMPTY_MAP;     // Catch: Throwable -> L12
        r2.release();
        return r06;
    L12:
        th = move-exception;
        r2.release();
        throw th;
    }

    private final Map<String, String> zze() {
        StrictMode.ThreadPolicy r02 = StrictMode.allowThreadDiskReads();
        Map<String, String> r1 = (Map) zzho.zza(new zzhh(this));     // Catch: Throwable -> L6 IllegalStateException -> L8 SQLiteException -> L10 Throwable -> L12
        StrictMode.setThreadPolicy(r02);
        return r1;
    L6:
        th = move-exception;
        StrictMode.setThreadPolicy(r02);
        throw th;
    L12:
        e = move-exception;
        Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);     // Catch: Throwable -> L6
        Map<String, String> r12 = Collections.EMPTY_MAP;     // Catch: Throwable -> L6
        StrictMode.setThreadPolicy(r02);
        return r12;
    }

    public final void zzc() {
        Object r02 = this.zzg;
        monitor-enter(r02);
        this.zzh = null;     // Catch: Throwable -> L18
        this.zze.run();     // Catch: Throwable -> L18
        monitor-exit(r02);     // Catch: Throwable -> L18
        monitor-enter(this);
        Iterator<zzhj> r03 = this.zzi.iterator();     // Catch: Throwable -> L12
    L10:
        if (r03.hasNext() == false) goto L14;
        r03.next().zza();     // Catch: Throwable -> L12
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

    public static zzhi zza(ContentResolver r4, Uri r5, Runnable r6) {
        monitor-enter(zzhi.class);
        Map<Uri, zzhi> r1 = zza;     // Catch: Throwable -> L9
        zzhi r2 = r1.get(r5);     // Catch: Throwable -> L9
        if (r2 == null) goto L21;
    L11:
        monitor-exit(zzhi.class);     // Catch: Throwable -> L9
        return r2;
    L21:
        zzhi r3 = new zzhi(r4, r5, r6);     // Catch: Throwable -> L9 SecurityException -> L16
        r1.put(r5, r3);     // Catch: SecurityException -> L15 Throwable -> L9
    L8:
        r2 = r3;
    L9:
        th = move-exception;
        throw th;
    }

    @Override // com.google.android.gms.internal.measurement.zzhl
    public final /* synthetic */ Object zza(String r2) {
        return zza().get(r2);
    }

    public final Map<String, String> zza() {
        Map<String, String> r02 = this.zzh;
        if (r02 != null) goto L15;
        Object r1 = this.zzg;
        monitor-enter(r1);
        r02 = this.zzh;     // Catch: Throwable -> L9
        if (r02 != null) goto L11;
        r02 = zze();     // Catch: Throwable -> L9
        this.zzh = r02;     // Catch: Throwable -> L9
    L11:
        monitor-exit(r1);     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    L15:
        if (r02 == null) goto L18;
        return r02;
    L18:
        return Collections.EMPTY_MAP;
    }
}
