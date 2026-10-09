package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzjj;
import com.huawei.hms.framework.common.ContainerUtils;
import com.iab.digitalidentity.sdk.core.model.GoPayPlusCameraConfigKt;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzoe {
    private static final String[] zza = null;
    private final Map<String, String> zzb;

    static {
        zza = new String[]{"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};
    }

    private zzoe(Map<String, String> r2) {
        HashMap r02 = new HashMap();
        this.zzb = r02;
        r02.putAll(r2);
    }

    private static int zza(SharedPreferences r1, String r2) {
        return r1.getInt(r2, -1);
    L5:
        return -1;
    }

    private static String zzb(SharedPreferences r1, String r2) {
        return r1.getString(r2, "\u0000");
    L5:
        return "\u0000";
    }

    private final int zzd() {
        String r02 = this.zzb.get("CmpSdkID");     // Catch: NumberFormatException -> L8
        if (TextUtils.isEmpty(r02) == true) goto L6;
        return Integer.parseInt(r02);
    L6:
        return -1;
    L11:
        return -1;
    }

    private final int zze() {
        String r02 = this.zzb.get("PolicyVersion");     // Catch: NumberFormatException -> L8
        if (TextUtils.isEmpty(r02) == true) goto L6;
        return Integer.parseInt(r02);
    L6:
        return -1;
    L11:
        return -1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof zzoe) == true) goto L7;
        return false;
    L7:
        return zzc().equalsIgnoreCase(((zzoe) r2).zzc());
    }

    public final int hashCode() {
        return zzc().hashCode();
    }

    public final String toString() {
        return zzc();
    }

    public final String zzc() {
        StringBuilder r02 = new StringBuilder();
        String[] r1 = zza;
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L12;
        String r4 = r1[r3];
        if (this.zzb.containsKey(r4) == false) goto L10;
        if (r02.length() <= 0) goto L9;
        r02.append(";");
    L9:
        r02.append(r4);
        r02.append(ContainerUtils.KEY_VALUE_DELIMITER);
        r02.append(this.zzb.get(r4));
    L10:
        r3 = r3 + 1;
        goto L3
    L12:
        return r02.toString();
    }

    public final Bundle zza() {
        if (GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A.equals(this.zzb.get("GoogleConsent")) == false) goto L44;
        if (GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A.equals(this.zzb.get("gdprApplies")) == false) goto L44;
        if (GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A.equals(this.zzb.get("EnableAdvertiserConsentMode")) == false) goto L44;
        int r02 = zze();
        if (r02 < 0) goto L11;
        String r1 = this.zzb.get("PurposeConsents");
        if (TextUtils.isEmpty(r1) == true) goto L15;
        Bundle r2 = new Bundle();
        String r5 = "denied";
        if (r1.length() <= 0) goto L24;
        String r3 = zzjj.zza.zza.zze;
        if (r1.charAt(0) != '1') goto L21;
        String r8 = "granted";
    L22:
        r2.putString(r3, r8);
        goto L24
    L21:
        r8 = "denied";
    L24:
        if (r1.length() <= 3) goto L33;
        String r32 = zzjj.zza.zzd.zze;
        if (r1.charAt(2) == '1') goto L28;
    L30:
        String r82 = "denied";
    L31:
        r2.putString(r32, r82);
        goto L33
    L28:
        if (r1.charAt(3) != '1') goto L30;
        r82 = "granted";
    L33:
        if (r1.length() > 6) goto L35;
    L42:
        return r2;
    L35:
        if (r02 < 4) goto L42;
        String r03 = zzjj.zza.zzc.zze;
        if (r1.charAt(0) == '1') goto L39;
    L41:
        r2.putString(r03, r5);
        goto L42
    L39:
        if (r1.charAt(6) != '1') goto L41;
        r5 = "granted";
        goto L41
    L15:
        return Bundle.EMPTY;
    L11:
        return Bundle.EMPTY;
    L44:
        return Bundle.EMPTY;
    }

    public final String zzb() {
        StringBuilder r02 = new StringBuilder();
        r02.append(GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A);
        int r2 = zzd();
        if (r2 >= 0) goto L5;
    L7:
        r02.append("00");
    L8:
        int r22 = zze();
        if (r22 < 0) goto L12;
        if (r22 > 63) goto L12;
        r02.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(r22));
    L13:
        Preconditions.checkArgument(true);
        if (GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A.equals(this.zzb.get("gdprApplies")) == false) goto L16;
        int r23 = 2;
    L17:
        int r3 = r23 | 4;
        if (GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A.equals(this.zzb.get("EnableAdvertiserConsentMode")) == false) goto L20;
        r3 = r23 | 12;
    L20:
        r02.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(r3));
        return r02.toString();
    L16:
        r23 = 0;
    L12:
        r02.append("0");
        goto L13
    L5:
        if (r2 > 4095) goto L7;
        r02.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((r2 >> 6) & 63));
        r02.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(r2 & 63));
        goto L8
    }

    public static zzoe zza(SharedPreferences r5) {
        HashMap r02 = new HashMap();
        String r1 = zzb(r5, "IABTCF_VendorConsents");
        if ("\u0000".equals(r1) == false) goto L5;
    L7:
        int r12 = zza(r5, "IABTCF_gdprApplies");
        if (r12 == (-1)) goto L10;
        r02.put("gdprApplies", String.valueOf(r12));
    L10:
        int r13 = zza(r5, "IABTCF_EnableAdvertiserConsentMode");
        if (r13 == (-1)) goto L13;
        r02.put("EnableAdvertiserConsentMode", String.valueOf(r13));
    L13:
        int r14 = zza(r5, "IABTCF_PolicyVersion");
        if (r14 == (-1)) goto L16;
        r02.put("PolicyVersion", String.valueOf(r14));
    L16:
        String r15 = zzb(r5, "IABTCF_PurposeConsents");
        if ("\u0000".equals(r15) == true) goto L19;
        r02.put("PurposeConsents", r15);
    L19:
        int r52 = zza(r5, "IABTCF_CmpSdkID");
        if (r52 == (-1)) goto L23;
        r02.put("CmpSdkID", String.valueOf(r52));
    L23:
        return new zzoe(r02);
    L5:
        if (r1.length() <= 754) goto L7;
        r02.put("GoogleConsent", String.valueOf(r1.charAt(754)));
        goto L7
    }

    public static String zza(String r5, boolean r6) {
        if (r6 == true) goto L4;
        return r5;
    L4:
        if (r5.length() <= 4) goto L19;
        char[] r52 = r5.toCharArray();
        int r1 = 1;
    L8:
        if (r1 >= 64) goto L13;
        if (r52[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(r1)) goto L14;
        r1 = r1 + 1;
    L14:
        r52[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | r1);
        return String.valueOf(r52);
    L13:
        r1 = 0;
        goto L14
    L19:
        return r5;
    }
}
