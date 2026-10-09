package com.google.android.gms.internal.time;

/* loaded from: classes5.dex */
public final class zzhe {
    private static final String[] zza = null;
    private static final zzhi zzb = null;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.time.zzhi] */
    static {
        zza = new String[]{"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
        int r02 = 0;
    L4:
        if (r02 >= 2) goto L11;
        zzhj r2 = null;
        r2 = (zzhi) Class.forName(zza[r02]).asSubclass(zzhi.class).getDeclaredConstructor(null).newInstance(null);     // Catch: Throwable -> L14
    L8:
        if (r2 != null) goto L12;
        r02 = r02 + 1;
    L12:
        zzb = r2;
        return;
    L11:
        r2 = new zzhj();
        goto L12
    }

    public static StackTraceElement zza(Class r1, int r2) {
        zzhf.zza(r1, "target");
        return zzb.zza(r1, 2);
    }

    public static StackTraceElement[] zzb(Class r1, int r2, int r3) {
        if (r2 > 0) goto L9;
        if (r2 == (-1)) goto L9;
        throw new IllegalArgumentException("invalid maximum depth: 0");
    L9:
        return zzb.zzb(r1, r2, 2);
    }
}
