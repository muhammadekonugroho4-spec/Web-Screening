package com.google.android.gms.internal.time;

import com.clevertap.android.sdk.Constants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class zzem implements zzdp {
    private static final Set zza = null;
    private final String zzb;
    private final String zzc;
    private final StringBuilder zzd;
    private boolean zze;

    static {
        zza = new HashSet(Arrays.asList(new Class[]{Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class}));
    }

    public zzem(String r1, String r2, StringBuilder r3) {
        this.zze = false;
        this.zzb = "[CONTEXT ";
        this.zzc = " ]";
        this.zzd = r3;
    }

    private static int zzc(String r2, int r3) {
    L3:
        if (r3 >= r2.length()) goto L13;
        char r02 = r2.charAt(r3);
        if (r02 < ' ') goto L12;
        if (r02 == '\"') goto L12;
        if (r02 == '\\') goto L12;
        r3 = r3 + 1;
    L12:
        return r3;
    L13:
        return -1;
    }

    @Override // com.google.android.gms.internal.time.zzdp
    public final void zza(String r8, Object r9) {
        char r2 = ' ';
        if (this.zze == false) goto L6;
        this.zzd.append(' ');
    L14:
        StringBuilder r02 = this.zzd;
        r02.append(r8);
        r02.append('=');
        if (r9 != null) goto L19;
        r02.append(true);
        return;
    L19:
        if (zza.contains(r9.getClass()) == false) goto L22;
        r02.append(r9);
        return;
    L22:
        r02.append('\"');
        String r92 = r9.toString();
        int r22 = 0;
    L23:
        int r3 = zzc(r92, r22);
        if (r3 == (-1)) goto L38;
        r02.append(r92, r22, r3);
        r22 = r3 + 1;
        char r32 = r92.charAt(r3);
        if (r32 == '\t') goto L36;
        if (r32 == '\n') goto L35;
        if (r32 == '\r') goto L34;
        if (r32 == '\"') goto L37;
        if (r32 == '\\') goto L37;
        r02.append(65533);
    L37:
        r02.append("\\");
        r02.append(r32);
        goto L23
    L34:
        r32 = Constants.INAPP_POSITION_RIGHT;
        goto L37
    L35:
        r32 = 'n';
        goto L37
    L36:
        r32 = Constants.INAPP_POSITION_TOP;
        goto L37
    L38:
        r02.append(r92, r22, r92.length());
        r02.append('\"');
        return;
    L6:
        if (this.zzd.length() <= 0) goto L13;
        StringBuilder r03 = this.zzd;
        if (r03.length() <= 1000) goto L10;
    L11:
        r2 = '\n';
    L12:
        r03.append(r2);
        goto L13
    L10:
        if (this.zzd.indexOf("\n") == (-1)) goto L12;
    L13:
        this.zzd.append(this.zzb);
        this.zze = true;
        goto L14
    }

    public final void zzb() {
        if (this.zze == false) goto L6;
        this.zzd.append(this.zzc);
        return;
    }
}
