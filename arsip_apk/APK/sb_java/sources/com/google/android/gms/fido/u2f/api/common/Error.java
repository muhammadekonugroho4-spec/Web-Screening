package com.google.android.gms.fido.u2f.api.common;

import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes5.dex */
public class Error {
    public static final String JSON_ERROR_CODE = "errorCode";
    public static final String JSON_ERROR_MESSAGE = "errorMessage";
    private final ErrorCode zza;
    private final String zzb;

    public Error(ErrorCode r1) {
        this.zza = r1;
        this.zzb = null;
    }

    public ErrorCode getErrorCode() {
        return this.zza;
    }

    public String getErrorMessage() {
        return this.zzb;
    }

    public JSONObject toJsonObject() {
        JSONObject r02 = new JSONObject();
        r02.put("errorCode", this.zza.getCode());     // Catch: JSONException -> L7
        String r1 = this.zzb;     // Catch: JSONException -> L7
        if (r1 == null) goto L9;
        r02.put("errorMessage", r1);     // Catch: JSONException -> L7
        return r02;
    L9:
        return r02;
    L7:
        e = move-exception;
        throw new RuntimeException(e);
    }

    public String toString() {
        if (this.zzb != null) goto L7;
        return String.format(Locale.ENGLISH, "{errorCode: %d}", new Object[]{Integer.valueOf(this.zza.getCode())});
    L7:
        return String.format(Locale.ENGLISH, "{errorCode: %d, errorMessage: %s}", new Object[]{Integer.valueOf(this.zza.getCode()), this.zzb});
    }

    public Error(ErrorCode r1, String r2) {
        this.zza = r1;
        this.zzb = r2;
    }
}
