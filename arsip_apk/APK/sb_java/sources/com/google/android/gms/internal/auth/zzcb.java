package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class zzcb {
    public static final Uri zza = null;
    public static final Uri zzb = null;
    public static final Pattern zzc = null;
    public static final Pattern zzd = null;
    static HashMap zze;
    static final HashMap zzf = null;
    static final HashMap zzg = null;
    static final HashMap zzh = null;
    static final HashMap zzi = null;
    static final String[] zzj = null;
    private static final AtomicBoolean zzk = null;
    private static Object zzl;
    private static boolean zzm;

    static {
        zza = Uri.parse("content://com.google.android.gsf.gservices");
        zzb = Uri.parse("content://com.google.android.gsf.gservices/prefix");
        zzc = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        zzd = Pattern.compile("^(0|false|f|off|no|n)$", 2);
        zzk = new AtomicBoolean();
        zzf = new HashMap();
        zzg = new HashMap();
        zzh = new HashMap();
        zzi = new HashMap();
        zzj = new String[0];
    }

    public zzcb() {
    }

    public static String zza(ContentResolver r10, String r11, String r12) {
        monitor-enter(zzcb.class);
        String r3 = null;
        if (zze != null) goto L10;
        zzk.set(false);     // Catch: Throwable -> L7
        zze = new HashMap();     // Catch: Throwable -> L7
        zzl = new Object();     // Catch: Throwable -> L7
        zzm = false;     // Catch: Throwable -> L7
        r10.registerContentObserver(zza, true, new zzca(null));     // Catch: Throwable -> L7
    L12:
        Object r02 = zzl;     // Catch: Throwable -> L7
        if (zze.containsKey(r11) == false) goto L20;
        String r102 = (String) zze.get(r11);     // Catch: Throwable -> L7
        if (r102 == null) goto L18;
        r3 = r102;
    L18:
        monitor-exit(zzcb.class);     // Catch: Throwable -> L7
        return r3;
    L20:
        int r2 = zzj.length;     // Catch: Throwable -> L7
        monitor-exit(zzcb.class);     // Catch: Throwable -> L7
        Cursor r103 = r10.query(zza, null, null, new String[]{r11}, null);
        if (r103 != null) goto L47;
        return null;
    L47:
    L30:
        th = move-exception;
        r103.close();
        throw th;
    L26:
        if (r103.moveToFirst() == true) goto L32;
        zzc(r02, r11, null);     // Catch: Throwable -> L30
        r103.close();
        return null;
    L32:
        String r122 = r103.getString(1);     // Catch: Throwable -> L30
        if (r122 != null) goto L35;
    L37:
        zzc(r02, r11, r122);     // Catch: Throwable -> L30
        if (r122 == null) goto L41;
        r3 = r122;
    L41:
        r103.close();
        return r3;
    L35:
        if (r122.equals(null) == false) goto L37;
        r122 = null;
        goto L37
    L10:
        if (zzk.getAndSet(false) == false) goto L12;
        zze.clear();     // Catch: Throwable -> L7
        zzf.clear();     // Catch: Throwable -> L7
        zzg.clear();     // Catch: Throwable -> L7
        zzh.clear();     // Catch: Throwable -> L7
        zzi.clear();     // Catch: Throwable -> L7
        zzl = new Object();     // Catch: Throwable -> L7
        zzm = false;     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        throw th;
    }

    public static /* synthetic */ AtomicBoolean zzb() {
        return zzk;
    }

    private static void zzc(Object r2, String r3, String r4) {
        monitor-enter(zzcb.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (r2 != zzl) goto L9;
        zze.put(r3, r4);     // Catch: Throwable -> L7
    L9:
        monitor-exit(zzcb.class);     // Catch: Throwable -> L7
    }
}
