package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzagz {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzaia zze;

    private zzagz(String r2, String r3, String r4, long r5, zzaia r7) {
        if (TextUtils.isEmpty(r2) == true) goto L8;
        if (r7 == null) goto L8;
        Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
        throw new IllegalArgumentException("Cannot have both MFA phone_info and totp_info");
    L8:
        this.zza = r2;
        this.zzb = Preconditions.checkNotEmpty(r3);
        this.zzc = r4;
        this.zzd = r5;
        this.zze = r7;
    }

    private static long zza(String r3) {
        return zzanp.zza(zzanp.zza(r3));
    L4:
        e = move-exception;
        Log.w("MfaInfo", "Could not parse timestamp as ISOString. Invalid ISOString \"" + r3 + "\"", e);
        return 0;
    }

    public final zzaia zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zza;
    }

    public final long zza() {
        return this.zzd;
    }

    public static zzagz zza(JSONObject r10) {
        zzaia r2 = null;
        String r1 = r10.optString("phoneInfo", null);
        String r3 = r10.optString("mfaEnrollmentId", null);
        String r4 = r10.optString("displayName", null);
        long r5 = zza(r10.optString("enrolledAt", ""));
        if (r10.opt("totpInfo") == null) goto L5;
        r2 = new zzaia();
    L5:
        zzagz r02 = new zzagz(r1, r3, r4, r5, r2);
        r10.optString("unobfuscatedPhoneInfo");
        return r02;
    }

    public static List<zzagz> zza(JSONArray r3) throws JSONException {
        if (r3 == null) goto L12;
        if (r3.length() == 0) goto L12;
        ArrayList r02 = new ArrayList();
        int r1 = 0;
    L8:
        if (r1 >= r3.length()) goto L10;
        r02.add(zza(r3.getJSONObject(r1)));
        r1 = r1 + 1;
        goto L8
    L10:
        return r02;
    L12:
        return new ArrayList();
    }
}
