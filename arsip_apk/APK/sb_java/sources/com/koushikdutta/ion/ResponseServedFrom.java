package com.koushikdutta.ion;

/* loaded from: classes6.dex */
public enum ResponseServedFrom extends Enum<ResponseServedFrom> {
    public static final ResponseServedFrom LOADED_FROM_CACHE = null;
    public static final ResponseServedFrom LOADED_FROM_CONDITIONAL_CACHE = null;
    public static final ResponseServedFrom LOADED_FROM_MEMORY = null;
    public static final ResponseServedFrom LOADED_FROM_NETWORK = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ResponseServedFrom[] f41708a = null;

    static {
        ResponseServedFrom r02 = new ResponseServedFrom("LOADED_FROM_MEMORY", 0);
        LOADED_FROM_MEMORY = r02;
        ResponseServedFrom r1 = new ResponseServedFrom("LOADED_FROM_CACHE", 1);
        LOADED_FROM_CACHE = r1;
        ResponseServedFrom r2 = new ResponseServedFrom("LOADED_FROM_CONDITIONAL_CACHE", 2);
        LOADED_FROM_CONDITIONAL_CACHE = r2;
        ResponseServedFrom r3 = new ResponseServedFrom("LOADED_FROM_NETWORK", 3);
        LOADED_FROM_NETWORK = r3;
        f41708a = new ResponseServedFrom[]{r02, r1, r2, r3};
    }

    ResponseServedFrom(String r1, int r2) {
    }

    public static ResponseServedFrom valueOf(String r1) {
        return (ResponseServedFrom) Enum.valueOf(ResponseServedFrom.class, r1);
    }

    public static ResponseServedFrom[] values() {
        return (ResponseServedFrom[]) f41708a.clone();
    }
}
