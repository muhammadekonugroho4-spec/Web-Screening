package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.Feature;

/* loaded from: classes5.dex */
public final class zbbi {
    public static final Feature zba = null;
    public static final Feature zbb = null;
    public static final Feature zbc = null;
    public static final Feature zbd = null;
    public static final Feature zbe = null;
    public static final Feature zbf = null;
    public static final Feature zbg = null;
    public static final Feature zbh = null;
    public static final Feature[] zbi = null;

    static {
        Feature r02 = new Feature("auth_api_credentials_begin_sign_in", 8);
        zba = r02;
        Feature r1 = new Feature("auth_api_credentials_sign_out", 2);
        zbb = r1;
        Feature r2 = new Feature("auth_api_credentials_authorize", 1);
        zbc = r2;
        Feature r3 = new Feature("auth_api_credentials_revoke_access", 1);
        zbd = r3;
        Feature r4 = new Feature("auth_api_credentials_save_password", 4);
        zbe = r4;
        Feature r5 = new Feature("auth_api_credentials_get_sign_in_intent", 6);
        zbf = r5;
        Feature r6 = new Feature("auth_api_credentials_save_account_linking_token", 3);
        zbg = r6;
        Feature r7 = new Feature("auth_api_credentials_get_phone_number_hint_intent", 3);
        zbh = r7;
        zbi = new Feature[]{r02, r1, r2, r3, r4, r5, r6, r7};
    }
}
