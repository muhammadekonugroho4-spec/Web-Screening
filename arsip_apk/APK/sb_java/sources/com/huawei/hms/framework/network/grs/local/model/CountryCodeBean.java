package com.huawei.hms.framework.network.grs.local.model;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huawei.hms.framework.common.EmuiUtil;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.SystemPropUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Locale;

/* loaded from: classes6.dex */
public class CountryCodeBean {
    private static final String ANDRIOD_SYSTEMPROP = "android.os.SystemProperties";
    private static final int ANDROID_9_API_LEVEL = 28;
    private static final int COUNTRYCODE_SIZE = 2;
    private static final String KEY_VERSION_EMUI = "ro.build.version.emui";
    private static final String LOCALE_COUNTRYSYSTEMPROP = "ro.product.locale";
    private static final String LOCALE_REGION_COUNTRYSYSTEMPROP = "ro.product.locale.region";
    private static final String SPECIAL_COUNTRYCODE_CN = "cn";
    private static final String SPECIAL_COUNTRYCODE_EU = "eu";
    private static final String SPECIAL_COUNTRYCODE_GB = "gb";
    private static final String SPECIAL_COUNTRYCODE_LA = "la";
    private static final String SPECIAL_COUNTRYCODE_UK = "uk";
    private static final String TAG = "CountryCodeBean";
    private static final String VENDORCOUNTRY_SYSTEMPROP = "ro.hw.country";
    private String countryCode;
    private String countrySource;

    static {
    }

    public CountryCodeBean(Context r2, boolean r3) {
        this.countrySource = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        this.countryCode = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        init(r2, r3);
        this.countryCode = this.countryCode.toUpperCase(Locale.ENGLISH);
    }

    private void checkCodeLenth() {
        String r02 = this.countryCode;
        if (r02 != null) goto L5;
    L8:
        this.countryCode = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        this.countrySource = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        return;
    L5:
        if (r02.length() != 2) goto L8;
    }

    private void getLocaleCountryCode() {
        if (SystemPropUtils.getProperty("get", KEY_VERSION_EMUI, ANDRIOD_SYSTEMPROP, "").isEmpty() == true) goto L10;
        if (EmuiUtil.isUpPVersion() == false) goto L8;
        getRegionSettingCountryCode();
        String r02 = TAG;
        String r1 = "EMUI 9.0 upper System, get countryCode form Locale.getDefault().getCountry()";
    L7:
        Logger.i(r02, r1);
        this.countrySource = GrsBaseInfo.CountryCodeSource.LOCALE_INFO;
        return;
    L8:
        getProductCountryCode();
        r02 = TAG;
        r1 = "EMUI 9.0 lower System, get countryCode form ro.product.locale.region or locale";
        goto L7
    L10:
        if (Build.VERSION.SDK_INT < 28) goto L12;
    L15:
        getRegionSettingCountryCode();
        r02 = TAG;
        r1 = "other Android 9.0 upper， get countryCode form Locale.getDefault().getCountry()";
        goto L7
    L12:
        if (Build.VERSION.RELEASE.charAt(0) >= '9') goto L15;
        getProductCountryCode();
        r02 = TAG;
        r1 = "other Android 9.0 lower, get countryCode form ro.product.locale.region or locale";
        goto L7
    }

    private void getProductCountryCode() {
        this.countryCode = SystemPropUtils.getProperty("get", LOCALE_REGION_COUNTRYSYSTEMPROP, ANDRIOD_SYSTEMPROP, GrsBaseInfo.CountryCodeSource.UNKNOWN);
        String r1 = TAG;
        Logger.i(r1, "countryCode by ro.product.locale.region is: " + this.countryCode);
        if (TextUtils.isEmpty(this.countryCode) == false) goto L5;
    L6:
        String r02 = SystemPropUtils.getProperty("get", LOCALE_COUNTRYSYSTEMPROP, ANDRIOD_SYSTEMPROP, GrsBaseInfo.CountryCodeSource.UNKNOWN);
        if (TextUtils.isEmpty(r02) == true) goto L12;
        int r2 = r02.lastIndexOf("-");
        if (r2 == (-1)) goto L12;
        this.countryCode = r02.substring(r2 + 1);
        Logger.i(r1, "countryCode by ro.product.locale is: " + this.countryCode);
    L12:
        if (SPECIAL_COUNTRYCODE_CN.equalsIgnoreCase(this.countryCode) == true) goto L15;
        this.countryCode = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        return;
    L15:
        return;
    L5:
        if (GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(this.countryCode) == false) goto L12;
        goto L6
    }

    private void getRegionSettingCountryCode() {
        this.countryCode = Locale.getDefault().getCountry();
        Logger.i(TAG, "countryCode by system's region setting is: " + this.countryCode);
        if (TextUtils.isEmpty(this.countryCode) == false) goto L6;
        this.countryCode = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        return;
    }

    private void getSimCountryCode(Context r2) {
        getSimCountryCode(r2, false);
    }

    private void getVendorCountryCode() {
        this.countrySource = GrsBaseInfo.CountryCodeSource.VENDOR_COUNTRY;
        this.countryCode = SystemPropUtils.getProperty("get", VENDORCOUNTRY_SYSTEMPROP, ANDRIOD_SYSTEMPROP, GrsBaseInfo.CountryCodeSource.UNKNOWN);
        String r1 = TAG;
        Logger.i(r1, "countryCode by ro.hw.country is: " + this.countryCode);
        if (SPECIAL_COUNTRYCODE_EU.equalsIgnoreCase(this.countryCode) == false) goto L5;
    L13:
        this.countryCode = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        this.countrySource = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        return;
    L5:
        if (SPECIAL_COUNTRYCODE_LA.equalsIgnoreCase(this.countryCode) == true) goto L13;
        if (SPECIAL_COUNTRYCODE_UK.equalsIgnoreCase(this.countryCode) == false) goto L11;
        Logger.i(r1, "special country of UK to map GB.");
        this.countryCode = SPECIAL_COUNTRYCODE_GB;
        this.countrySource = GrsBaseInfo.CountryCodeSource.VENDOR_COUNTRY;
        return;
    L11:
        checkCodeLenth();
    }

    private void init(Context r1, boolean r2) {
        if (r1 == null) goto L18;
        getVendorCountryCode();     // Catch: Exception -> L15
        if (isCodeValidate() == false) goto L8;
        String r12 = TAG;     // Catch: Exception -> L15
        String r22 = "get issue_country code from VENDOR_COUNTRY";
    L6:
        Logger.i(r12, r22);     // Catch: Exception -> L15
        return;
    L8:
        getSimCountryCode(r1);     // Catch: Exception -> L15
        if (isCodeValidate() == false) goto L11;
        r12 = TAG;     // Catch: Exception -> L15
        r22 = "get issue_country code from SIM_COUNTRY";
        goto L6
    L11:
        getLocaleCountryCode();     // Catch: Exception -> L15
        if (isCodeValidate() == false) goto L21;
        r12 = TAG;     // Catch: Exception -> L15
        r22 = "get issue_country code from LOCALE_INFO";
        goto L6
    L21:
        return;
    L15:
        Logger.w(TAG, "get CountryCode error");
        return;
    L18:
        throw new NullPointerException("context must be not null.Please provide app's Context");
    }

    private boolean isCodeValidate() {
        return !GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(this.countryCode);
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getCountrySource() {
        return this.countrySource;
    }

    private void getSimCountryCode(Context r2, boolean r3) {
        TelephonyManager r22 = (TelephonyManager) r2.getApplicationContext().getSystemService("phone");
        if (r22 == null) goto L10;
        if (r3 == true) goto L6;
    L9:
        this.countryCode = r22.getSimCountryIso();
        this.countrySource = GrsBaseInfo.CountryCodeSource.SIM_COUNTRY;
        String r23 = TAG;
        StringBuilder r32 = new StringBuilder();
        String r02 = "countryCode by SimCountryIso is: ";
    L8:
        r32.append(r02);
        r32.append(this.countryCode);
        Logger.i(r23, r32.toString());
        goto L10
    L6:
        if (r22.getPhoneType() == 2) goto L9;
        this.countryCode = r22.getNetworkCountryIso();
        this.countrySource = GrsBaseInfo.CountryCodeSource.NETWORK_COUNTRY;
        r23 = TAG;
        r32 = new StringBuilder();
        r02 = "countryCode by NetworkCountryIso is: ";
    L10:
        checkCodeLenth();
    }
}
