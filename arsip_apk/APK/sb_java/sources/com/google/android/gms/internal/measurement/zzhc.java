package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzhc implements zzhe {
    public zzhc() {
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final String zza(ContentResolver r8, String r9) throws zzhd {
        Uri r2 = zzgw.zza;
        ContentProviderClient r1 = r8.acquireUnstableContentProviderClient(r2);
        if (r1 == null) goto L35;
        Cursor r82 = r1.query(r2, null, null, new String[]{r9}, null);     // Catch: Throwable -> L12 RemoteException -> L14
        if (r82 == null) goto L22;
        if (r82.moveToFirst() == false) goto L18;
        String r92 = r82.getString(1);     // Catch: Throwable -> L16
        r82.close();     // Catch: Throwable -> L12 RemoteException -> L14
        r1.release();
        return r92;
    L18:
        r82.close();     // Catch: Throwable -> L12 RemoteException -> L14
        r1.release();
        return null;
    L22:
        throw new zzhd("ContentProvider query returned null cursor");     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        if (r82 == null) goto L41;
        r82.close();     // Catch: Throwable -> L26
        throw th;     // Catch: Throwable -> L12 RemoteException -> L14
    L26:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L12 RemoteException -> L14
        throw th;     // Catch: Throwable -> L12 RemoteException -> L14
    L41:
        throw th;     // Catch: Throwable -> L12 RemoteException -> L14
    L14:
        e = move-exception;
        throw new zzhd("ContentProvider query failed", e);     // Catch: Throwable -> L12
    L35:
        throw new zzhd("Unable to acquire ContentProviderClient");
    L12:
        th = move-exception;
        r1.release();
        throw th;
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final <T extends Map<String, String>> T zza(ContentResolver r8, String[] r9, zzhb<T> r10) throws zzhd {
        Uri r2 = zzgw.zzb;
        ContentProviderClient r1 = r8.acquireUnstableContentProviderClient(r2);
        if (r1 == null) goto L38;
        Cursor r82 = r1.query(r2, null, null, r9, null);     // Catch: Throwable -> L18 RemoteException -> L20
        if (r82 == null) goto L25;
        T r92 = (T) r10.zza(r82.getCount());
    L9:
        if (r82.moveToNext() == false) goto L14;
        r92.put(r82.getString(0), r82.getString(1));     // Catch: Throwable -> L11
        goto L9
    L14:
        if (r82.isAfterLast() == false) goto L23;
        r82.close();     // Catch: Throwable -> L18 RemoteException -> L20
        r1.release();
        return r92;
    L23:
        throw new zzhd("Cursor read incomplete (ContentProvider dead?)");     // Catch: Throwable -> L11
    L25:
        throw new zzhd("ContentProvider query returned null cursor");     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        if (r82 == null) goto L45;
        r82.close();     // Catch: Throwable -> L29
        throw th;     // Catch: Throwable -> L18 RemoteException -> L20
    L29:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L18 RemoteException -> L20
        throw th;     // Catch: Throwable -> L18 RemoteException -> L20
    L45:
        throw th;     // Catch: Throwable -> L18 RemoteException -> L20
    L20:
        e = move-exception;
        throw new zzhd("ContentProvider query failed", e);     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        r1.release();
        throw th;
    L38:
        throw new zzhd("Unable to acquire ContentProviderClient");
    }
}
