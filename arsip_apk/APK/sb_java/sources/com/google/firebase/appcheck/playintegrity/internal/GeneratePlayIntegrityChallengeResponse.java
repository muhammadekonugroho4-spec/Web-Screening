package com.google.firebase.appcheck.playintegrity.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Strings;
import com.google.firebase.FirebaseException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class GeneratePlayIntegrityChallengeResponse {
    static final String CHALLENGE_KEY = "challenge";
    static final String TIME_TO_LIVE_KEY = "ttl";
    private String challenge;
    private String timeToLive;

    private GeneratePlayIntegrityChallengeResponse(String r1, String r2) {
        Preconditions.checkNotNull(r1);
        Preconditions.checkNotNull(r2);
        this.challenge = r1;
        this.timeToLive = r2;
    }

    public static GeneratePlayIntegrityChallengeResponse fromJsonString(String r2) throws FirebaseException, JSONException {
        JSONObject r02 = new JSONObject(r2);
        String r22 = Strings.emptyToNull(r02.optString("challenge"));
        String r03 = Strings.emptyToNull(r02.optString(TIME_TO_LIVE_KEY));
        if (r22 == null) goto L8;
        if (r03 == null) goto L8;
        return new GeneratePlayIntegrityChallengeResponse(r22, r03);
    L8:
        throw new FirebaseException("Unexpected server response.");
    }

    public String getChallenge() {
        return this.challenge;
    }

    public String getTimeToLive() {
        return this.timeToLive;
    }
}
