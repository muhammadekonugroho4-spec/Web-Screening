package com.google.firebase.appcheck.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Strings;
import com.google.firebase.FirebaseException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class AppCheckTokenResponse {
    static final String TIME_TO_LIVE_KEY = "ttl";
    static final String TOKEN_KEY = "token";
    private String timeToLive;
    private String token;

    private AppCheckTokenResponse(String r1, String r2) {
        Preconditions.checkNotNull(r1);
        Preconditions.checkNotNull(r2);
        this.token = r1;
        this.timeToLive = r2;
    }

    public static AppCheckTokenResponse fromJsonString(String r2) throws FirebaseException, JSONException {
        JSONObject r02 = new JSONObject(r2);
        String r22 = Strings.emptyToNull(r02.optString(TOKEN_KEY));
        String r03 = Strings.emptyToNull(r02.optString(TIME_TO_LIVE_KEY));
        if (r22 == null) goto L8;
        if (r03 == null) goto L8;
        return new AppCheckTokenResponse(r22, r03);
    L8:
        throw new FirebaseException("Unexpected server response.");
    }

    public String getTimeToLive() {
        return this.timeToLive;
    }

    public String getToken() {
        return this.token;
    }
}
