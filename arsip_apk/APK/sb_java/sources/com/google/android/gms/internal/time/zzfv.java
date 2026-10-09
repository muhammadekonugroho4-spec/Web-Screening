package com.google.android.gms.internal.time;

import android.os.Build;
import dalvik.system.VMStack;

/* loaded from: classes5.dex */
public final class zzfv extends zzfp {
    private static final boolean zza = false;
    private static final boolean zzb = false;
    private static final zzfo zzc = null;

    final class zza {
        public zza() {
        }

        public static boolean zza() {
            return zzfv.zzt();
        }
    }

    static {
        zza = zza.zza();
        String r02 = Build.FINGERPRINT;
        boolean r1 = true;
        if (r02 != null) goto L5;
    L8:
        zzb = r1;
        zzc = new AnonymousClass1();
        return;
    L5:
        if ("robolectric".equals(r02) == true) goto L8;
        r1 = false;
        goto L8
    }

    public zzfv() {
    }

    public static Class<?> zzp() {
        return VMStack.getStackClass2();
    }

    public static String zzq() {
        return VMStack.getStackClass2().getName();
    L4:
        return null;
    }

    public static /* bridge */ /* synthetic */ boolean zzr() {
        return zzb;
    }

    public static /* bridge */ /* synthetic */ boolean zzs() {
        return zza;
    }

    public static boolean zzt() {
        Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);     // Catch: Throwable -> L4
        String r02 = zzq();     // Catch: Throwable -> L4
        return zza.class.getName().equals(r02);
    L4:
        return false;
    }

    @Override // com.google.android.gms.internal.time.zzfp
    public zzep zze(String r1) {
        return zzga.zze(r1);
    }

    @Override // com.google.android.gms.internal.time.zzfp
    public zzfo zzh() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.time.zzfp
    public zzgg zzj() {
        return zzgb.zzb();
    }

    @Override // com.google.android.gms.internal.time.zzfp
    public String zzm() {
        return "platform: Android";
    }
}
