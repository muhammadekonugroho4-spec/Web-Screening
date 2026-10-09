package com.google.firebase.appcheck.playintegrity.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class ExchangePlayIntegrityTokenRequest {
    static final String PLAY_INTEGRITY_TOKEN_KEY = "playIntegrityToken";
    private final String playIntegrityToken;

    public ExchangePlayIntegrityTokenRequest(String r1) {
        this.playIntegrityToken = r1;
    }

    public String toJsonString() throws JSONException {
        JSONObject r02 = new JSONObject();
        r02.put(PLAY_INTEGRITY_TOKEN_KEY, this.playIntegrityToken);
        return r02.toString();
    }
}
