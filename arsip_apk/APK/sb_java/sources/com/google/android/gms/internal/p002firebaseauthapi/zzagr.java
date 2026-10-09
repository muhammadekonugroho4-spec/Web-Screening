package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zzagr implements zzaea<zzagr> {
    private static final String zza = "zzagr";
    private List<String> zzb;

    static {
    }

    public zzagr() {
    }

    private final zzagr zzb(String r5) throws zzabr {
        JSONObject r02 = new JSONObject(r5);     // Catch: JSONException -> L9
        this.zzb = new ArrayList();     // Catch: JSONException -> L9
        JSONArray r03 = r02.optJSONArray("authorizedDomains");     // Catch: JSONException -> L9
        if (r03 == null) goto L11;
        int r1 = 0;
    L5:
        if (r1 >= r03.length()) goto L11;
        this.zzb.add(r03.getString(r1));     // Catch: JSONException -> L9
        r1 = r1 + 1;
    L11:
        return this;
    L9:
        e = move-exception;
        throw zzail.zza(e, zza, r5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    public final /* synthetic */ zzaea zza(String r1) throws zzabr {
        return zzb(r1);
    }

    public final List<String> zza() {
        return this.zzb;
    }
}
