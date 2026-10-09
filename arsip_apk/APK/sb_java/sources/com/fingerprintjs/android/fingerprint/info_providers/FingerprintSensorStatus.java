package com.fingerprintjs.android.fingerprint.info_providers;

import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/info_providers/FingerprintSensorStatus;", "", "stringDescription", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getStringDescription", "()Ljava/lang/String;", "NOT_SUPPORTED", "SUPPORTED", "ENABLED", GrsBaseInfo.CountryCodeSource.UNKNOWN, "fingerprint_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlin.e
/* loaded from: classes4.dex */
public enum FingerprintSensorStatus extends Enum<FingerprintSensorStatus> {
    public static final FingerprintSensorStatus ENABLED = null;
    public static final FingerprintSensorStatus NOT_SUPPORTED = null;
    public static final FingerprintSensorStatus SUPPORTED = null;
    public static final FingerprintSensorStatus UNKNOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FingerprintSensorStatus[] f37294a = null;
    private final String stringDescription;

    static {
        NOT_SUPPORTED = new FingerprintSensorStatus("NOT_SUPPORTED", 0, "not_supported");
        SUPPORTED = new FingerprintSensorStatus("SUPPORTED", 1, "supported");
        ENABLED = new FingerprintSensorStatus("ENABLED", 2, "enabled");
        UNKNOWN = new FingerprintSensorStatus(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, SystemUtils.UNKNOWN);
        f37294a = a();
    }

    FingerprintSensorStatus(String r1, int r2, String r3) {
        this.stringDescription = r3;
    }

    public static final /* synthetic */ FingerprintSensorStatus[] a() {
        return new FingerprintSensorStatus[]{NOT_SUPPORTED, SUPPORTED, ENABLED, UNKNOWN};
    }

    public static FingerprintSensorStatus valueOf(String r1) {
        return (FingerprintSensorStatus) Enum.valueOf(FingerprintSensorStatus.class, r1);
    }

    public static FingerprintSensorStatus[] values() {
        return (FingerprintSensorStatus[]) f37294a.clone();
    }

    public final String getStringDescription() {
        return this.stringDescription;
    }
}
