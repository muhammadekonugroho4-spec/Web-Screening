package com.stockbit.android.local.sharedpreferences;

import android.content.SharedPreferences;
import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f47736a;

    public a(SharedPreferences r2) {
        p.l(r2, "sharedPreferences");
        this.f47736a = r2;
    }

    public final void a() {
        boolean r3 = f("SP_IS_JUST_CHANGE_THEME", false);
        boolean r4 = f("SP_IS_APP_FIRST_RUN", true);
        String r8 = e("SP_KEY_API_BASE_URL_LEGACY", "");
        String r10 = e("SP_KEY_API_BASE_URL_LEGACY_V25", "");
        String r12 = e("SP_KEY_API_BASE_URL_SECURITIES", "");
        String r14 = e("SP_KEY_API_BASE_URL_SECURITIES_NEW_CORE", "");
        String r2 = e("SP_KEY_API_BASE_URL_SECURITIES_NON_TRADING", "");
        String r15 = e("SP_KEY_API_BASE_URL_SECURITIES_EXODUS", "");
        String r152 = e("SP_KEY_API_BASE_URL_EXODUS", "");
        String r153 = e("SP_KEY_API_BASE_URL_VIRTUAL", "");
        String r154 = e("SP_KEY_API_BASE_URL_AWS", "");
        String r155 = e("SP_KEY_API_BASE_URL_AWS_EXODUS", "");
        String r156 = e("SP_KEY_API_BASE_URL_WEBSOCKET", "");
        String r157 = e("SP_KEY_API_BASE_URL_WEBSOCKET_PROTOBUF", "");
        String r158 = e("SP_KEY_URL_STOCKBIT_CHARTBIT", "");
        String r159 = e("SP_KEY_URL_STOCKBIT_CHARTBIT_LEGACY", "");
        String r1510 = e("SP_KEY_URL_STOCKBIT_COMPANY_FUNDACHART", "");
        String r1511 = e("SP_KEY_URL_STOCKBIT_ACADEMY", "");
        boolean r13 = f("SP_IS_AMEND_BANK_REJECTED_CLOSED", false);
        String r7 = e("SP_AMEND_BANK_ID", "");
        int r72 = b("SP_WATCHLIST_FONT_SIZE_TYPE", 0);
        SharedPreferences.Editor r1512 = this.f47736a.edit();
        r1512.clear();
        r1512.apply();
        j("SP_IS_JUST_CHANGE_THEME", r3);
        j("SP_IS_APP_FIRST_RUN", r4);
        i("SP_KEY_API_BASE_URL_LEGACY", r8);
        i("SP_KEY_API_BASE_URL_LEGACY_V25", r10);
        i("SP_KEY_API_BASE_URL_SECURITIES", r12);
        i("SP_KEY_API_BASE_URL_SECURITIES_NEW_CORE", r14);
        i("SP_KEY_API_BASE_URL_SECURITIES_NON_TRADING", r2);
        i("SP_KEY_API_BASE_URL_SECURITIES_EXODUS", r15);
        i("SP_KEY_API_BASE_URL_EXODUS", r152);
        i("SP_KEY_API_BASE_URL_VIRTUAL", r153);
        i("SP_KEY_API_BASE_URL_AWS", r154);
        i("SP_KEY_API_BASE_URL_AWS_EXODUS", r155);
        i("SP_KEY_API_BASE_URL_WEBSOCKET", r156);
        i("SP_KEY_API_BASE_URL_WEBSOCKET_PROTOBUF", r157);
        i("SP_KEY_URL_STOCKBIT_CHARTBIT", r158);
        i("SP_KEY_URL_STOCKBIT_CHARTBIT_LEGACY", r159);
        i("SP_KEY_URL_STOCKBIT_COMPANY_FUNDACHART", r1510);
        i("SP_KEY_URL_STOCKBIT_ACADEMY", r1511);
        j("SP_IS_AMEND_BANK_REJECTED_CLOSED", r13);
        i("SP_AMEND_BANK_ID", r7);
        g("SP_WATCHLIST_FONT_SIZE_TYPE", r72);
    }

    public final int b(String r2, int r3) {
        p.l(r2, Constants.KEY_KEY);
        return this.f47736a.getInt(r2, r3);
    }

    public final long c(String r2, long r3) {
        p.l(r2, Constants.KEY_KEY);
        return this.f47736a.getLong(r2, r3);
    }

    public final SharedPreferences d() {
        return this.f47736a;
    }

    public final String e(String r2, String r3) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "defValue");
        String r22 = this.f47736a.getString(r2, r3);
        if (r22 != null) goto L6;
        return "";
    L6:
        return r22;
    }

    public final boolean f(String r2, boolean r3) {
        p.l(r2, Constants.KEY_KEY);
        return this.f47736a.getBoolean(r2, r3);
    }

    public final void g(String r2, int r3) {
        p.l(r2, Constants.KEY_KEY);
        SharedPreferences.Editor r02 = this.f47736a.edit();
        r02.putInt(r2, r3);
        r02.apply();
    }

    public final void h(String r2, long r3) {
        p.l(r2, Constants.KEY_KEY);
        SharedPreferences.Editor r02 = this.f47736a.edit();
        r02.putLong(r2, r3);
        r02.apply();
    }

    public final void i(String r2, CharSequence r3) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "value");
        SharedPreferences.Editor r02 = this.f47736a.edit();
        r02.putString(r2, r3.toString());
        r02.apply();
    }

    public final void j(String r2, boolean r3) {
        p.l(r2, Constants.KEY_KEY);
        SharedPreferences.Editor r02 = this.f47736a.edit();
        r02.putBoolean(r2, r3);
        r02.apply();
    }
}
