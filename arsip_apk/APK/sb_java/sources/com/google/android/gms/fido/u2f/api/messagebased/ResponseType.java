package com.google.android.gms.fido.u2f.api.messagebased;

import com.google.android.gms.fido.u2f.api.messagebased.RequestType;

@Deprecated
/* loaded from: classes5.dex */
public enum ResponseType extends Enum<ResponseType> {
    public static final ResponseType REGISTER = null;
    public static final ResponseType SIGN = null;
    private static final /* synthetic */ ResponseType[] zza = null;
    private final String zzb;

    static {
        ResponseType r02 = new ResponseType("REGISTER", 0, "u2f_register_response");
        REGISTER = r02;
        ResponseType r1 = new ResponseType("SIGN", 1, "u2f_sign_response");
        SIGN = r1;
        zza = new ResponseType[]{r02, r1};
    }

    ResponseType(String r1, int r2, String r3) {
        this.zzb = r3;
    }

    public static ResponseType getResponseTypeForRequestType(RequestType r2) throws RequestType.UnsupportedRequestTypeException {
        if (r2 == null) goto L14;
        int r02 = r2.ordinal();
        if (r02 == 0) goto L12;
        if (r02 != 1) goto L10;
        return SIGN;
    L10:
        throw new RequestType.UnsupportedRequestTypeException(r2.toString());
    L12:
        return REGISTER;
    L14:
        throw new RequestType.UnsupportedRequestTypeException(null);
    }

    public static ResponseType valueOf(String r1) {
        return (ResponseType) Enum.valueOf(ResponseType.class, r1);
    }

    public static ResponseType[] values() {
        return (ResponseType[]) zza.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.zzb;
    }
}
