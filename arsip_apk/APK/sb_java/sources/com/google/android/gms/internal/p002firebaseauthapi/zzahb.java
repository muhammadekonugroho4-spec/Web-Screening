package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzahb {
    private List<zzahc> zza;

    public zzahb() {
        this.zza = new ArrayList();
    }

    public static zzahb zza(JSONArray r11) throws JSONException {
        if (r11 == null) goto L17;
        if (r11.length() == 0) goto L17;
        ArrayList r02 = new ArrayList();
        int r1 = 0;
    L8:
        if (r1 >= r11.length()) goto L15;
        JSONObject r2 = r11.getJSONObject(r1);
        if (r2 != null) goto L12;
        zzahc r22 = new zzahc();
    L13:
        r02.add(r22);
        r1 = r1 + 1;
        goto L8
    L12:
        r22 = new zzahc(Strings.emptyToNull(r2.optString("federatedId", null)), Strings.emptyToNull(r2.optString("displayName", null)), Strings.emptyToNull(r2.optString("photoUrl", null)), Strings.emptyToNull(r2.optString("providerId", null)), null, Strings.emptyToNull(r2.optString("phoneNumber", null)), Strings.emptyToNull(r2.optString("email", null)));
        goto L13
    L15:
        return new zzahb(r02);
    L17:
        return new zzahb(new ArrayList());
    }

    private zzahb(List<zzahc> r2) {
        if (r2.isEmpty() == true) goto L6;
        this.zza = Collections.unmodifiableList(r2);
        return;
    L6:
        this.zza = Collections.EMPTY_LIST;
    }

    public final List<zzahc> zza() {
        return this.zza;
    }
}
