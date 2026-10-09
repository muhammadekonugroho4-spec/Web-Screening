package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.internal.zzjj;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzbd {
    private static final zzbd zza = null;
    private final int zzb;
    private final String zzc;
    private final Boolean zzd;
    private final String zze;
    private final EnumMap<zzjj.zza, zzjm> zzf;

    static {
        zza = new zzbd(null, 100);
    }

    public zzbd(Boolean r1, int r2) {
        this(null, r2, null, null);
    }

    private final String zzh() {
        StringBuilder r02 = new StringBuilder();
        r02.append(this.zzb);
        zzjj.zza[] r1 = zzjl.zzb.zza();
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L6;
        zzjj.zza r4 = r1[r3];
        r02.append(":");
        r02.append(zzjj.zza(this.zzf.get(r4)));
        r3 = r3 + 1;
        goto L3
    L6:
        return r02.toString();
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof zzbd) == true) goto L5;
        return false;
    L5:
        zzbd r42 = (zzbd) r4;
        if (this.zzc.equalsIgnoreCase(r42.zzc) == true) goto L9;
        return false;
    L9:
        if (Objects.equals(this.zzd, r42.zzd) == true) goto L12;
        return false;
    L12:
        return Objects.equals(this.zze, r42.zze);
    }

    public final int hashCode() {
        Boolean r02 = this.zzd;
        if (r02 != null) goto L6;
        int r03 = 3;
    L9:
        String r1 = this.zze;
        if (r1 != null) goto L12;
        int r12 = 17;
    L14:
        return (this.zzc.hashCode() + (r03 * 29)) + (r12 * 137);
    L12:
        r12 = r1.hashCode();
        goto L14
    L6:
        if (r02 != Boolean.TRUE) goto L8;
        r03 = 7;
        goto L9
    L8:
        r03 = 13;
        goto L9
    }

    public final String toString() {
        StringBuilder r02 = new StringBuilder("source=");
        r02.append(zzjj.zza(this.zzb));
        zzjj.zza[] r1 = zzjl.zzb.zza();
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L22;
        zzjj.zza r4 = r1[r3];
        r02.append(Constants.SEPARATOR_COMMA);
        r02.append(r4.zze);
        r02.append(ContainerUtils.KEY_VALUE_DELIMITER);
        zzjm r42 = this.zzf.get(r4);
        if (r42 != null) goto L7;
        r02.append("uninitialized");
    L20:
        r3 = r3 + 1;
        goto L3
    L7:
        int r43 = zzbc.zza[r42.ordinal()];
        if (r43 != 1) goto L10;
        r02.append("uninitialized");
        goto L20
    L10:
        if (r43 != 2) goto L12;
        r02.append("eu_consent_policy");
        goto L20
    L12:
        if (r43 != 3) goto L14;
        r02.append("denied");
        goto L20
    L14:
        if (r43 != 4) goto L20;
        r02.append("granted");
        goto L20
    L22:
        if (this.zzd == null) goto L25;
        r02.append(",isDmaRegion=");
        r02.append(this.zzd);
    L25:
        if (this.zze == null) goto L28;
        r02.append(",cpsDisplayStr=");
        r02.append(this.zze);
    L28:
        return r02.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final Bundle zzb() {
        Bundle r02 = new Bundle();
        Iterator r1 = this.zzf.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        Map.Entry r2 = (Map.Entry) r1.next();
        String r3 = zzjj.zzb((zzjm) r2.getValue());
        if (r3 == null) goto L4;
        r02.putString(((zzjj.zza) r2.getKey()).zze, r3);
        goto L4
    L8:
        Boolean r12 = this.zzd;
        if (r12 == null) goto L11;
        r02.putString("is_dma_region", r12.toString());
    L11:
        String r13 = this.zze;
        if (r13 == null) goto L14;
        r02.putString("cps_display_str", r13);
    L14:
        return r02;
    }

    public final zzjm zzc() {
        zzjm r02 = this.zzf.get(zzjj.zza.zzc);
        if (r02 == null) goto L5;
        return r02;
    L5:
        return zzjm.zza;
    }

    public final Boolean zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        Iterator<zzjm> r02 = this.zzf.values().iterator();
    L4:
        if (r02.hasNext() == false) goto L9;
        if (r02.next() == zzjm.zza) goto L4;
        return true;
    L9:
        return false;
    }

    public zzbd(Boolean r3, int r4, Boolean r5, String r6) {
        EnumMap<zzjj.zza, zzjm> r02 = new EnumMap(zzjj.zza.class);
        this.zzf = r02;
        r02.put(zzjj.zza.zzc, zzjj.zza(r3));
        this.zzb = r4;
        this.zzc = zzh();
        this.zzd = r5;
        this.zze = r6;
    }

    public static zzbd zza(Bundle r7, int r8) {
        Boolean r02 = null;
        if (r7 == null) goto L5;
        EnumMap r1 = new EnumMap(zzjj.zza.class);
        zzjj.zza[] r2 = zzjl.zzb.zza();
        int r3 = r2.length;
        int r4 = 0;
    L7:
        if (r4 >= r3) goto L10;
        zzjj.zza r5 = r2[r4];
        r1.put(r5, zzjj.zza(r7.getString(r5.zze)));
        r4 = r4 + 1;
        goto L7
    L10:
        if (r7.containsKey("is_dma_region") == false) goto L13;
        r02 = Boolean.valueOf(r7.getString("is_dma_region"));
    L13:
        return new zzbd(r1, r8, r02, r7.getString("cps_display_str"));
    L5:
        return new zzbd(null, r8);
    }

    private zzbd(EnumMap<zzjj.zza, zzjm> r3, int r4, Boolean r5, String r6) {
        EnumMap<zzjj.zza, zzjm> r02 = new EnumMap(zzjj.zza.class);
        this.zzf = r02;
        r02.putAll(r3);
        this.zzb = r4;
        this.zzc = zzh();
        this.zzd = r5;
        this.zze = r6;
    }

    public static zzbd zza(zzjm r2, int r3) {
        EnumMap r32 = new EnumMap(zzjj.zza.class);
        r32.put(zzjj.zza.zzc, r2);
        return new zzbd(r32, -10, null, null);
    }

    public static zzbd zza(String r9) {
        if (r9 == null) goto L12;
        if (r9.length() <= 0) goto L12;
        String[] r92 = r9.split(":");
        int r1 = Integer.parseInt(r92[0]);
        EnumMap r2 = new EnumMap(zzjj.zza.class);
        zzjj.zza[] r3 = zzjl.zzb.zza();
        int r4 = r3.length;
        int r5 = 1;
        int r6 = 0;
    L7:
        if (r6 >= r4) goto L10;
        r2.put(r3[r6], zzjj.zza(r92[r5].charAt(0)));
        r6 = r6 + 1;
        r5 = r5 + 1;
        goto L7
    L10:
        return new zzbd(r2, r1, null, null);
    L12:
        return zza;
    }

    public static Boolean zza(Bundle r2) {
        if (r2 != null) goto L5;
        return null;
    L5:
        zzjm r22 = zzjj.zza(r2.getString("ad_personalization"));
        if (r22 != null) goto L8;
        return null;
    L8:
        int r23 = zzbc.zza[r22.ordinal()];
        if (r23 == 3) goto L16;
        if (r23 == 4) goto L14;
        return null;
    L14:
        return Boolean.TRUE;
    L16:
        return Boolean.FALSE;
    }
}
