package com.google.firebase.appcheck.debug.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class ExchangeDebugTokenRequest {
    static final String DEBUG_TOKEN_KEY = "debugToken";
    private final String debugToken;

    public ExchangeDebugTokenRequest(String r1) {
        this.debugToken = r1;
    }

    public String toJsonString() throws JSONException {
        JSONObject r02 = new JSONObject();
        r02.put(DEBUG_TOKEN_KEY, this.debugToken);
        return r02.toString();
    }
}
