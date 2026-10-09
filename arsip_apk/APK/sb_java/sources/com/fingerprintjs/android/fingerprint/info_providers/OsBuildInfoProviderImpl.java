package com.fingerprintjs.android.fingerprint.info_providers;

/* loaded from: classes4.dex */
public final class OsBuildInfoProviderImpl implements p {
    public OsBuildInfoProviderImpl() {
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.p
    public String a() {
        return (String) com.fingerprintjs.android.fingerprint.tools.a.a(OsBuildInfoProviderImpl$sdkVersion$1.f37305g, "");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.p
    public String b() {
        return (String) com.fingerprintjs.android.fingerprint.tools.a.a(OsBuildInfoProviderImpl$fingerprint$1.f37301g, "");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.p
    public String c() {
        return (String) com.fingerprintjs.android.fingerprint.tools.a.a(OsBuildInfoProviderImpl$androidVersion$1.f37300g, "");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.p
    public String d() {
        return (String) com.fingerprintjs.android.fingerprint.tools.a.a(OsBuildInfoProviderImpl$manufacturerName$1.f37303g, "");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.p
    public String e() {
        return (String) com.fingerprintjs.android.fingerprint.tools.a.a(OsBuildInfoProviderImpl$modelName$1.f37304g, "");
    }

    @Override // com.fingerprintjs.android.fingerprint.info_providers.p
    public String f() {
        return (String) com.fingerprintjs.android.fingerprint.tools.a.a(OsBuildInfoProviderImpl$kernelVersion$1.f37302g, "");
    }
}
