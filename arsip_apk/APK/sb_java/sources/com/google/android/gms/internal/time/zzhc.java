package com.google.android.gms.internal.time;

/* loaded from: classes5.dex */
public final class zzhc extends RuntimeException {
    private zzhc(String r1, String r2) {
        super(r1);
    }

    public static zzhc zza(String r2, String r3, int r4) {
        return new zzhc(zze(r2, r3, r4, r4 + 1), r3);
    }

    public static zzhc zzb(String r1, String r2) {
        return new zzhc(r1, r2);
    }

    public static zzhc zzc(String r1, String r2, int r3, int r4) {
        return new zzhc(zze(r1, r2, r3, r4), r2);
    }

    public static zzhc zzd(String r2, String r3, int r4) {
        return new zzhc(zze(r2, r3, r4, -1), r3);
    }

    private static String zze(String r3, String r4, int r5, int r6) {
        if (r6 >= 0) goto L4;
        r6 = r4.length();
    L4:
        StringBuilder r02 = new StringBuilder(r3);
        r02.append(": ");
        if (r5 <= 8) goto L7;
        r02.append("...");
        r02.append(r4, r5 - 5, r5);
    L8:
        r02.append('[');
        r02.append(r4.substring(r5, r6));
        r02.append(']');
        if ((r4.length() - r6) <= 8) goto L11;
        r02.append(r4, r6, r6 + 5);
        r02.append("...");
    L13:
        return r02.toString();
    L11:
        r02.append(r4, r6, r4.length());
        goto L13
    L7:
        r02.append(r4, 0, r5);
        goto L8
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        monitor-enter(this);
        monitor-exit(this);
        return this;
    }
}
