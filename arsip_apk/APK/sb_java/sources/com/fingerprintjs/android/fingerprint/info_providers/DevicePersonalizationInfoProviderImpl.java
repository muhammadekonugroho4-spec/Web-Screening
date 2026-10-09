package com.fingerprintjs.android.fingerprint.info_providers;

import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.media.RingtoneManager;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class DevicePersonalizationInfoProviderImpl implements g {

    /* renamed from: a, reason: collision with root package name */
    public final RingtoneManager f37286a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager f37287b;

    /* renamed from: c, reason: collision with root package name */
    public final Configuration f37288c;

    public DevicePersonalizationInfoProviderImpl(RingtoneManager r2, AssetManager r3, Configuration r4) {
        kotlin.jvm.internal.p.l(r2, "ringtoneManager");
        kotlin.jvm.internal.p.l(r3, "assetManager");
        kotlin.jvm.internal.p.l(r4, "configuration");
        this.f37286a = r2;
        this.f37287b = r3;
        this.f37288c = r4;
    }

    public static final /* synthetic */ AssetManager f(DevicePersonalizationInfoProviderImpl r02) {
        return r02.f37287b;
    }

    public static final /* synthetic */ Configuration g(DevicePersonalizationInfoProviderImpl r02) {
        return r02.f37288c;
    }

    public static final /* synthetic */ RingtoneManager h(DevicePersonalizationInfoProviderImpl r02) {
        return r02.f37286a;
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.g
    public String a() {
        return (String) com.fingerprintjs.android.fingerprint.tools.a.a(new DevicePersonalizationInfoProviderImpl$ringtoneSource$1(this), "");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.g
    public String[] b() {
        return (String[]) com.fingerprintjs.android.fingerprint.tools.a.a(new DevicePersonalizationInfoProviderImpl$availableLocales$1(this), new String[0]);
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.g
    public String c() {
        return (String) com.fingerprintjs.android.fingerprint.tools.a.a(new DevicePersonalizationInfoProviderImpl$regionCountry$1(this), "");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.g
    public String d() {
        return (String) com.fingerprintjs.android.fingerprint.tools.a.a(DevicePersonalizationInfoProviderImpl$timezone$1.f37289g, "");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.g
    public String e() {
        String r02 = Locale.getDefault().getLanguage();
        kotlin.jvm.internal.p.k(r02, "getDefault().language");
        return r02;
    }
}
