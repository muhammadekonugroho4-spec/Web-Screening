package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zzafw implements zzaea<zzafw> {
    private static final String zza = "zzafw";
    private List<String> zzb;

    static {
    }

    public zzafw() {
        zzahx.zza();
    }

    private final zzafw zzb(String r6) throws zzabr {
        JSONObject r1 = new JSONObject(r6);     // Catch: NullPointerException -> L6 JSONException -> L8
        r1.optString("authUri", null);     // Catch: NullPointerException -> L6 JSONException -> L8
        r1.optBoolean("registered", false);     // Catch: NullPointerException -> L6 JSONException -> L8
        r1.optString("providerId", null);     // Catch: NullPointerException -> L6 JSONException -> L8
        r1.optBoolean("forExistingProvider", false);     // Catch: NullPointerException -> L6 JSONException -> L8
        if (r1.has("allProviders") == true) goto L10;
        zzahx.zza();     // Catch: NullPointerException -> L6 JSONException -> L8
    L11:
        this.zzb = zzail.zza(r1.optJSONArray("signinMethods"));     // Catch: NullPointerException -> L6 JSONException -> L8
        return this;
    L10:
        new zzahx(1, zzail.zza(r1.optJSONArray("allProviders")));     // Catch: NullPointerException -> L6 JSONException -> L8
    L6:
        e = e;
    L14:
        throw zzail.zza(e, zza, r6);
    L8:
        e = e;
        goto L14
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    public final /* synthetic */ zzaea zza(String r1) throws zzabr {
        return zzb(r1);
    }

    public final List<String> zza() {
        return this.zzb;
    }
}
