package com.google.firebase.appcheck.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class HttpErrorResponse {
    static final String CODE_KEY = "code";
    static final String ERROR_KEY = "error";
    static final String MESSAGE_KEY = "message";
    private int errorCode;
    private String errorMessage;

    private HttpErrorResponse(int r1, String r2) {
        this.errorCode = r1;
        this.errorMessage = r2;
    }

    public static HttpErrorResponse fromJsonString(String r2) throws JSONException {
        JSONObject r02 = new JSONObject(new JSONObject(r2).optString("error"));
        return new HttpErrorResponse(r02.optInt(CODE_KEY), r02.optString("message"));
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
}
