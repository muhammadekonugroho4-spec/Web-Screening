package com.google.android.gms.fido.u2f.api.messagebased;

@Deprecated
/* loaded from: classes5.dex */
public enum RequestType extends Enum<RequestType> {
    public static final RequestType REGISTER = null;
    public static final RequestType SIGN = null;
    private static final /* synthetic */ RequestType[] zza = null;
    private final String zzb;

    public static class UnsupportedRequestTypeException extends Exception {
        public UnsupportedRequestTypeException(String r2) {
            super("Unsupported request type ".concat(String.valueOf(r2)));
        }
    }

    static {
        RequestType r02 = new RequestType("REGISTER", 0, "u2f_register_request");
        REGISTER = r02;
        RequestType r1 = new RequestType("SIGN", 1, "u2f_sign_request");
        SIGN = r1;
        zza = new RequestType[]{r02, r1};
    }

    RequestType(String r1, int r2, String r3) {
        this.zzb = r3;
    }

    public static RequestType fromString(String r5) throws UnsupportedRequestTypeException {
        RequestType[] r02 = values();
        int r1 = r02.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L9;
        RequestType r3 = r02[r2];
        if (r5.equals(r3.zzb) == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L9:
        throw new UnsupportedRequestTypeException(r5);
    }

    public static RequestType valueOf(String r1) {
        return (RequestType) Enum.valueOf(RequestType.class, r1);
    }

    public static RequestType[] values() {
        return (RequestType[]) zza.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.zzb;
    }
}
