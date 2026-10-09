package com.google.android.gms.internal.time;

/* loaded from: classes5.dex */
final class zzhj implements zzhi {
    public zzhj() {
    }

    private static final int zzc(StackTraceElement[] r2, Class r3, int r4) {
        String r32 = r3.getName();
        int r42 = 3;
        boolean r02 = false;
    L4:
        if (r42 >= r2.length) goto L11;
        if (r2[r42].getClassName().equals(r32) == false) goto L8;
        r02 = true;
    L10:
        r42 = r42 + 1;
        goto L4
    L8:
        if (r02 == false) goto L10;
        return r42;
    L11:
        return -1;
    }

    @Override // com.google.android.gms.internal.time.zzhi
    public final StackTraceElement zza(Class r2, int r3) {
        StackTraceElement[] r32 = new Throwable().getStackTrace();
        int r22 = zzc(r32, r2, 3);
        if (r22 != (-1)) goto L5;
        return null;
    L5:
        return r32[r22];
    }

    @Override // com.google.android.gms.internal.time.zzhi
    public final StackTraceElement[] zzb(Class r4, int r5, int r6) {
        boolean r62 = true;
        if (r5 == (-1)) goto L7;
        if (r5 > 0) goto L7;
        r62 = false;
    L7:
        zzhf.zzc(r62, "maxDepth must be > 0 or -1");
        StackTraceElement[] r63 = new Throwable().getStackTrace();
        int r42 = zzc(r63, r4, 3);
        if (r42 == (-1)) goto L10;
        int r1 = r63.length - r42;
        if (r5 <= 0) goto L14;
        if (r5 >= r1) goto L14;
    L15:
        StackTraceElement[] r12 = new StackTraceElement[r5];
        System.arraycopy(r63, r42, r12, 0, r5);
        return r12;
    L14:
        r5 = r1;
        goto L15
    L10:
        return new StackTraceElement[0];
    }
}
