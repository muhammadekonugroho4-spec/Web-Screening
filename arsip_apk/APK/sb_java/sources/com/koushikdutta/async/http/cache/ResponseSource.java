package com.koushikdutta.async.http.cache;

/* loaded from: classes6.dex */
enum ResponseSource extends Enum<ResponseSource> {
    public static final ResponseSource CACHE = null;
    public static final ResponseSource CONDITIONAL_CACHE = null;
    public static final ResponseSource NETWORK = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ResponseSource[] f41371a = null;

    static {
        ResponseSource r02 = new ResponseSource("CACHE", 0);
        CACHE = r02;
        ResponseSource r1 = new ResponseSource("CONDITIONAL_CACHE", 1);
        CONDITIONAL_CACHE = r1;
        ResponseSource r2 = new ResponseSource("NETWORK", 2);
        NETWORK = r2;
        f41371a = new ResponseSource[]{r02, r1, r2};
    }

    ResponseSource(String r1, int r2) {
    }

    public static ResponseSource valueOf(String r1) {
        return (ResponseSource) Enum.valueOf(ResponseSource.class, r1);
    }

    public static ResponseSource[] values() {
        return (ResponseSource[]) f41371a.clone();
    }

    public boolean requiresConnection() {
        if (this != CONDITIONAL_CACHE) goto L5;
        return true;
    L5:
        if (this == NETWORK) goto L11;
        return false;
    L11:
        return true;
    }
}
