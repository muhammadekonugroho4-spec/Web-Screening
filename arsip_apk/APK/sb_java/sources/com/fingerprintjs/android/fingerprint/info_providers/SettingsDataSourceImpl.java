package com.fingerprintjs.android.fingerprint.info_providers;

import android.content.ContentResolver;
import android.os.Build;

/* loaded from: classes4.dex */
public final class SettingsDataSourceImpl implements u {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f37308a;

    public SettingsDataSourceImpl(ContentResolver r2) {
        kotlin.jvm.internal.p.l(r2, "contentResolver");
        this.f37308a = r2;
    }

    public static final /* synthetic */ ContentResolver s(SettingsDataSourceImpl r02) {
        return r02.f37308a;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.u
    public String a() {
        return v("date_format");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.u
    public String b() {
        return v("font_scale");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.u
    public String c() {
        return v("screen_off_timeout");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.u
    public String d() {
        return t("data_roaming");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.u
    public String e() {
        return u("touch_exploration_enabled");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.u
    public String f() {
        return u("default_input_method");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.u
    public String g() {
        return u("accessibility_enabled");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.u
    public String h() {
        return t("transition_animation_scale");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.u
    public String i() {
        return v("auto_punctuate");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.u
    public String j() {
        return v("auto_replace");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.u
    public String k() {
        return v("end_button_behavior");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.u
    public String l() {
        return t("http_proxy");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.u
    public String m() {
        return t("development_settings_enabled");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.u
    public String n() {
        return t("adb_enabled");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.u
    public String o() {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        return "";
    L5:
        return u("rtt_calling_mode");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.u
    public String p() {
        return v("alarm_alert");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.u
    public String q() {
        return t("window_animation_scale");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.u
    public String r() {
        return v("time_12_24");
    }

    public final String t(final String r2) {
        return (String) com.fingerprintjs.android.fingerprint.tools.a.a(new SettingsDataSourceImpl$extractGlobalSettingsParam$1(this, r2), "");
    }

    public final String u(final String r2) {
        return (String) com.fingerprintjs.android.fingerprint.tools.a.a(new SettingsDataSourceImpl$extractSecureSettingsParam$1(this, r2), "");
    }

    public final String v(final String r2) {
        return (String) com.fingerprintjs.android.fingerprint.tools.a.a(new SettingsDataSourceImpl$extractSystemSettingsParam$1(this, r2), "");
    }
}
