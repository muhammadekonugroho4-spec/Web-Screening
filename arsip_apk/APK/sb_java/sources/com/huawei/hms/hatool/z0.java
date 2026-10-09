package com.huawei.hms.hatool;

/* loaded from: classes6.dex */
public enum z0 extends Enum<z0> {

    /* renamed from: a, reason: collision with root package name */
    public static final z0 f39446a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f39447b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final z0 f39448c = null;
    public static final z0 d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ z0[] f39449e = null;

    static {
        z0 r02 = new z0("IMEI", 0);
        f39446a = r02;
        z0 r1 = new z0("UDID", 1);
        f39447b = r1;
        z0 r2 = new z0("SN", 2);
        f39448c = r2;
        z0 r3 = new z0("EMPTY", 3);
        d = r3;
        f39449e = new z0[]{r02, r1, r2, r3};
    }

    z0(String r1, int r2) {
    }

    public static z0 valueOf(String r1) {
        return (z0) Enum.valueOf(z0.class, r1);
    }

    public static z0[] values() {
        return (z0[]) f39449e.clone();
    }
}
