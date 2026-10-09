package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
public enum zzwc extends Enum<zzwc> implements zzakl {
    public static final zzwc zza = null;
    public static final zzwc zzb = null;
    public static final zzwc zzc = null;
    public static final zzwc zzd = null;
    public static final zzwc zze = null;
    private static final /* synthetic */ zzwc[] zzf = null;
    private final int zzg;

    static {
        zzwc r02 = new zzwc("UNKNOWN_STATUS", 0, 0);
        zza = r02;
        zzwc r1 = new zzwc("ENABLED", 1, 1);
        zzb = r1;
        zzwc r2 = new zzwc("DISABLED", 2, 2);
        zzc = r2;
        zzwc r3 = new zzwc("DESTROYED", 3, 3);
        zzd = r3;
        zzwc r4 = new zzwc("UNRECOGNIZED", 4, -1);
        zze = r4;
        zzf = new zzwc[]{r02, r1, r2, r3, r4};
    }

    zzwc(String r1, int r2, int r3) {
        this.zzg = r3;
    }

    public static zzwc[] values() {
        return (zzwc[]) zzf.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder r02 = new StringBuilder("<");
        r02.append(zzwc.class.getName());
        r02.append('@');
        r02.append(Integer.toHexString(System.identityHashCode(this)));
        if (this == zze) goto L5;
        r02.append(" number=");
        r02.append(zza());
    L5:
        r02.append(" name=");
        r02.append(name());
        r02.append('>');
        return r02.toString();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakl
    public final int zza() {
        if (this == zze) goto L7;
        return this.zzg;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzwc zza(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return zzd;
    L14:
        return zzc;
    L16:
        return zzb;
    L18:
        return zza;
    }
}
