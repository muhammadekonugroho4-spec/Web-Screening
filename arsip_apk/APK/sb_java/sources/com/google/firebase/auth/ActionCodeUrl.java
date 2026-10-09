package com.google.firebase.auth;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes6.dex */
public class ActionCodeUrl {
    private static final com.google.android.gms.internal.p002firebaseauthapi.zzan<String, Integer> zza = null;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;

    static {
        HashMap r02 = new HashMap();
        r02.put("recoverEmail", 2);
        r02.put("resetPassword", 0);
        r02.put("signIn", 4);
        r02.put("verifyEmail", 1);
        r02.put("verifyBeforeChangeEmail", 5);
        r02.put("revertSecondFactorAddition", 6);
        zza = com.google.android.gms.internal.p002firebaseauthapi.zzan.zza(r02);
    }

    private ActionCodeUrl(String r7) {
        String r1 = zza(r7, "apiKey");
        String r3 = zza(r7, "oobCode");
        String r5 = zza(r7, "mode");
        if (r1 == null) goto L9;
        if (r3 == null) goto L9;
        if (r5 == null) goto L9;
        this.zzb = Preconditions.checkNotEmpty(r1);
        this.zzc = Preconditions.checkNotEmpty(r3);
        this.zzd = Preconditions.checkNotEmpty(r5);
        this.zze = zza(r7, "continueUrl");
        this.zzf = zza(r7, RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE);
        this.zzg = zza(r7, "tenantId");
        return;
    L9:
        throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", new Object[]{"apiKey", "oobCode", "mode"}));
    }

    public static ActionCodeUrl parseLink(String r1) {
        Preconditions.checkNotEmpty(r1);
        return new ActionCodeUrl(r1);
    L5:
        return null;
    }

    public String getApiKey() {
        return this.zzb;
    }

    public String getCode() {
        return this.zzc;
    }

    public String getContinueUrl() {
        return this.zze;
    }

    public String getLanguageCode() {
        return this.zzf;
    }

    public int getOperation() {
        com.google.android.gms.internal.p002firebaseauthapi.zzan<String, Integer> r02 = zza;
        if (r02.containsKey(this.zzd) == true) goto L5;
        return 3;
    L5:
        return r02.get(this.zzd).intValue();
    }

    public final String zza() {
        return this.zzg;
    }

    private static String zza(String r3, String r4) {
        Uri r32 = Uri.parse(r3);
        Set<String> r1 = r32.getQueryParameterNames();     // Catch: Throwable -> L13
        if (r1.contains(r4) == false) goto L8;
        return r32.getQueryParameter(r4);
    L8:
        if (r1.contains("link") == true) goto L10;
        return null;
    L10:
        return Uri.parse(Preconditions.checkNotEmpty(r32.getQueryParameter("link"))).getQueryParameter(r4);
    L15:
        return null;
    }
}
