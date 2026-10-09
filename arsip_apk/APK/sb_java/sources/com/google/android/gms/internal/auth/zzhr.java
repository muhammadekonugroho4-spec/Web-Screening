package com.google.android.gms.internal.auth;

import java.util.List;

/* loaded from: classes5.dex */
public final class zzhr extends zzeu implements zzfx {
    private static final zzhr zzb = null;
    private zzey zzd;

    static {
        zzhr r02 = new zzhr();
        zzb = r02;
        zzeu.zzg(zzhr.class, r02);
    }

    private zzhr() {
        this.zzd = zzeu.zzc();
    }

    public static /* synthetic */ zzhr zzj() {
        return zzb;
    }

    public static zzhr zzk(byte[] r1) throws zzfa {
        return (zzhr) zzeu.zzb(zzb, r1);
    }

    @Override // com.google.android.gms.internal.auth.zzeu
    public final Object zzi(int r1, Object r2, Object r3) {
        int r12 = r1 - 1;
        if (r12 == 0) goto L22;
        if (r12 == 2) goto L20;
        if (r12 == 3) goto L18;
        zzhp r32 = null;
        if (r12 == 4) goto L16;
        if (r12 == 5) goto L14;
        return null;
    L14:
        return zzb;
    L16:
        return new zzhq(r32);
    L18:
        return new zzhr();
    L20:
        return zzeu.zzf(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
    L22:
        return (byte) 1;
    }

    public final List zzl() {
        return this.zzd;
    }
}
