package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzjj {
    public static final zzjj zza = null;
    private final EnumMap<zza, zzjm> zzb;
    private final int zzc;

    public enum zza extends Enum<zza> {
        public static final zza zza = null;
        public static final zza zzb = null;
        public static final zza zzc = null;
        public static final zza zzd = null;
        private static final /* synthetic */ zza[] zzf = null;
        public final String zze;

        static {
            zza r02 = new zza("AD_STORAGE", 0, "ad_storage");
            zza = r02;
            zza r1 = new zza("ANALYTICS_STORAGE", 1, "analytics_storage");
            zzb = r1;
            zza r2 = new zza("AD_USER_DATA", 2, "ad_user_data");
            zzc = r2;
            zza r3 = new zza("AD_PERSONALIZATION", 3, "ad_personalization");
            zzd = r3;
            zzf = new zza[]{r02, r1, r2, r3};
        }

        zza(String r1, int r2, String r3) {
            this.zze = r3;
        }

        public static zza[] values() {
            return (zza[]) zzf.clone();
        }
    }

    static {
        zza = new zzjj(null, null, 100);
    }

    private zzjj(EnumMap<zza, zzjm> r3, int r4) {
        EnumMap<zza, zzjm> r02 = new EnumMap(zza.class);
        this.zzb = r02;
        r02.putAll(r3);
        this.zzc = r4;
    }

    public static boolean zza(int r2, int r3) {
        if (r2 != (-20)) goto L5;
        if (r3 != (-30)) goto L5;
        return true;
    L5:
        if (r2 != (-30)) goto L8;
        if (r3 != (-20)) goto L8;
        return true;
    L8:
        if (r2 == r3) goto L17;
        if (r2 < r3) goto L15;
        return false;
    L15:
        return true;
    L17:
        return true;
    }

    public final boolean equals(Object r8) {
        if ((r8 instanceof zzjj) == true) goto L5;
        return false;
    L5:
        zzjj r82 = (zzjj) r8;
        zza[] r02 = zzjl.zza(zzjl.zza);
        int r2 = r02.length;
        int r3 = 0;
    L6:
        if (r3 >= r2) goto L12;
        zza r4 = r02[r3];
        if (this.zzb.get(r4) != r82.zzb.get(r4)) goto L9;
        r3 = r3 + 1;
        goto L6
    L9:
        return false;
    L12:
        if (this.zzc != r82.zzc) goto L15;
        return true;
    L15:
        return false;
    }

    public final int hashCode() {
        int r02 = this.zzc * 17;
        Iterator<zzjm> r1 = this.zzb.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        r02 = (r02 * 31) + r1.next().hashCode();
        goto L4
    L6:
        return r02;
    }

    public final String toString() {
        StringBuilder r02 = new StringBuilder("source=");
        r02.append(zza(this.zzc));
        zza[] r1 = zzjl.zza(zzjl.zza);
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L9;
        zza r4 = r1[r3];
        r02.append(Constants.SEPARATOR_COMMA);
        r02.append(r4.zze);
        r02.append(ContainerUtils.KEY_VALUE_DELIMITER);
        zzjm r42 = this.zzb.get(r4);
        if (r42 != null) goto L7;
        r42 = zzjm.zza;
    L7:
        r02.append(r42);
        r3 = r3 + 1;
        goto L3
    L9:
        return r02.toString();
    }

    public final Bundle zzb() {
        Bundle r02 = new Bundle();
        Iterator r1 = this.zzb.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        Map.Entry r2 = (Map.Entry) r1.next();
        String r3 = zzb((zzjm) r2.getValue());
        if (r3 == null) goto L4;
        r02.putString(((zza) r2.getKey()).zze, r3);
        goto L4
    L8:
        return r02;
    }

    public final zzjm zzc() {
        zzjm r02 = this.zzb.get(zza.zza);
        if (r02 == null) goto L5;
        return r02;
    L5:
        return zzjm.zza;
    }

    public final zzjm zzd() {
        zzjm r02 = this.zzb.get(zza.zzb);
        if (r02 == null) goto L5;
        return r02;
    L5:
        return zzjm.zza;
    }

    public final String zze() {
        StringBuilder r02 = new StringBuilder("G1");
        zza[] r1 = zzjl.zza.zza();
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L19;
        zza r4 = r1[r3];
        zzjm r42 = this.zzb.get(r4);
        char r5 = '-';
        if (r42 == null) goto L17;
        int r43 = r42.ordinal();
        if (r43 == 0) goto L17;
        if (r43 != 1) goto L11;
    L16:
        r5 = '1';
        goto L17
    L11:
        if (r43 != 2) goto L13;
        r5 = '0';
        goto L17
    L13:
        if (r43 == 3) goto L16;
    L17:
        r02.append(r5);
        r3 = r3 + 1;
        goto L3
    L19:
        return r02.toString();
    }

    public final String zzf() {
        StringBuilder r02 = new StringBuilder("G1");
        zza[] r1 = zzjl.zza.zza();
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L6;
        zza r4 = r1[r3];
        r02.append(zza(this.zzb.get(r4)));
        r3 = r3 + 1;
        goto L3
    L6:
        return r02.toString();
    }

    public final boolean zzg() {
        return zza(zza.zza);
    }

    public final boolean zzh() {
        return zza(zza.zzb);
    }

    public final boolean zzi() {
        Iterator<zzjm> r02 = this.zzb.values().iterator();
    L4:
        if (r02.hasNext() == false) goto L9;
        if (r02.next() == zzjm.zza) goto L4;
        return true;
    L9:
        return false;
    }

    public static char zza(zzjm r1) {
        if (r1 == null) goto L16;
        int r12 = r1.ordinal();
        if (r12 != 1) goto L6;
        return '+';
    L6:
        if (r12 != 2) goto L8;
        return '0';
    L8:
        if (r12 != 3) goto L18;
        return '1';
    L18:
        return '-';
    L16:
        return '-';
    }

    public final int zza() {
        return this.zzc;
    }

    public final boolean zzc(zzjj r8) {
        zza[] r02 = (zza[]) this.zzb.keySet().toArray(new zza[0]);
        int r2 = r02.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L10;
        zza r4 = r02[r3];
        zzjm r5 = this.zzb.get(r4);
        zzjm r42 = r8.zzb.get(r4);
        zzjm r6 = zzjm.zzc;
        if (r5 != r6) goto L9;
        if (r42 == r6) goto L9;
        return true;
    L9:
        r3 = r3 + 1;
        goto L3
    L10:
        return false;
    }

    public static zzjm zza(String r1) {
        if (r1 != null) goto L6;
        return zzjm.zza;
    L6:
        if (r1.equals("granted") == false) goto L10;
        return zzjm.zzd;
    L10:
        if (r1.equals("denied") == false) goto L14;
        return zzjm.zzc;
    L14:
        return zzjm.zza;
    }

    public zzjj(Boolean r3, Boolean r4, int r5) {
        EnumMap<zza, zzjm> r32 = new EnumMap(zza.class);
        this.zzb = r32;
        r32.put(zza.zza, zza(null));
        r32.put(zza.zzb, zza(null));
        this.zzc = r5;
    }

    public static zzjj zzb(String r1) {
        return zza(r1, 100);
    }

    public final zzjj zzb(zzjj r8) {
        EnumMap r02 = new EnumMap(zza.class);
        zza[] r1 = zzjl.zza(zzjl.zza);
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L11;
        zza r4 = r1[r3];
        zzjm r5 = this.zzb.get(r4);
        if (r5 != zzjm.zza) goto L7;
        r5 = r8.zzb.get(r4);
    L7:
        if (r5 == null) goto L9;
        r02.put(r4, r5);
    L9:
        r3 = r3 + 1;
        goto L3
    L11:
        return new zzjj(r02, this.zzc);
    }

    public static zzjm zza(char r1) {
        if (r1 == '+') goto L15;
        if (r1 == '0') goto L13;
        if (r1 == '1') goto L11;
        return zzjm.zza;
    L11:
        return zzjm.zzd;
    L13:
        return zzjm.zzc;
    L15:
        return zzjm.zzb;
    }

    public static String zzb(zzjm r1) {
        int r12 = r1.ordinal();
        if (r12 != 2) goto L5;
        return "denied";
    L5:
        if (r12 == 3) goto L8;
        return null;
    L8:
        return "granted";
    }

    public static zzjm zza(Boolean r02) {
        if (r02 != null) goto L6;
        return zzjm.zza;
    L6:
        if (r02.booleanValue() == false) goto L10;
        return zzjm.zzd;
    L10:
        return zzjm.zzc;
    }

    public static zzjj zza(Bundle r6, int r7) {
        if (r6 == null) goto L4;
        EnumMap r02 = new EnumMap(zza.class);
        zza[] r1 = zzjl.zza(zzjl.zza);
        int r2 = r1.length;
        int r3 = 0;
    L6:
        if (r3 >= r2) goto L9;
        zza r4 = r1[r3];
        r02.put(r4, zza(r6.getString(r4.zze)));
        r3 = r3 + 1;
        goto L6
    L9:
        return new zzjj(r02, r7);
    L4:
        return new zzjj(null, null, r7);
    }

    public static zzjj zza(zzjm r1, zzjm r2, int r3) {
        EnumMap r32 = new EnumMap(zza.class);
        r32.put(zza.zza, r1);
        r32.put(zza.zzb, r2);
        return new zzjj(r32, -10);
    }

    public static zzjj zza(String r6, int r7) {
        EnumMap r02 = new EnumMap(zza.class);
        if (r6 != null) goto L5;
        r6 = "";
    L5:
        zza[] r1 = zzjl.zza.zza();
        int r2 = 0;
    L7:
        if (r2 >= r1.length) goto L14;
        zza r3 = r1[r2];
        int r4 = r2 + 2;
        if (r4 >= r6.length()) goto L11;
        r02.put(r3, zza(r6.charAt(r4)));
    L12:
        r2 = r2 + 1;
        goto L7
    L11:
        r02.put(r3, zzjm.zza);
        goto L12
    L14:
        return new zzjj(r02, r7);
    }

    public final zzjj zza(zzjj r9) {
        EnumMap r02 = new EnumMap(zza.class);
        zza[] r1 = zzjl.zza(zzjl.zza);
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L29;
        zza r4 = r1[r3];
        zzjm r5 = this.zzb.get(r4);
        zzjm r6 = r9.zzb.get(r4);
        if (r5 == null) goto L16;
        if (r6 == null) goto L25;
        zzjm r7 = zzjm.zza;
        if (r5 == r7) goto L16;
        if (r6 == r7) goto L25;
        zzjm r72 = zzjm.zzb;
        if (r5 == r72) goto L16;
        if (r6 == r72) goto L25;
        zzjm r73 = zzjm.zzc;
        if (r5 == r73) goto L24;
        if (r6 == r73) goto L24;
        r5 = zzjm.zzd;
    L24:
        r5 = r73;
    L25:
        if (r5 == null) goto L27;
        r02.put(r4, r5);
    L27:
        r3 = r3 + 1;
    L16:
        r5 = r6;
        goto L25
    L29:
        return new zzjj(r02, 100);
    }

    public static String zza(int r1) {
        if (r1 != (-30)) goto L5;
        return "TCF";
    L5:
        if (r1 != (-20)) goto L7;
        return "API";
    L7:
        if (r1 == (-10)) goto L25;
        if (r1 != 0) goto L10;
        return "1P_API";
    L10:
        if (r1 != 30) goto L12;
        return "1P_INIT";
    L12:
        if (r1 != 90) goto L14;
        return "REMOTE_CONFIG";
    L14:
        if (r1 == 100) goto L17;
        return "OTHER";
    L17:
        return GrsBaseInfo.CountryCodeSource.UNKNOWN;
    L25:
        return "MANIFEST";
    }

    public static String zza(Bundle r6) {
        zza[] r02 = zzjl.zza(zzjl.zza);
        int r1 = r02.length;
        int r2 = 0;
    L3:
        Boolean r3 = null;
        if (r2 >= r1) goto L18;
        zza r4 = r02[r2];
        if (r6.containsKey(r4.zze) == false) goto L17;
        String r42 = r6.getString(r4.zze);
        if (r42 == null) goto L17;
        if (r42.equals("granted") == false) goto L13;
        r3 = Boolean.TRUE;
    L15:
        if (r3 != null) goto L17;
        return r42;
    L13:
        if (r42.equals("denied") == false) goto L15;
        r3 = Boolean.FALSE;
    L17:
        r2 = r2 + 1;
        goto L3
    L18:
        return null;
    }

    public final boolean zza(zza r2) {
        if (this.zzb.get(r2) != zzjm.zzc) goto L6;
        return false;
    L6:
        return true;
    }
}
