package com.iab.digitalidentity.sdk.config;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/iab/digitalidentity/sdk/config/HelpCenterType;", "", "(Ljava/lang/String;I)V", "SELFIE_TIMEOUT", "VERIFICATION_EXHAUSTED", "VERIFICATION_FAILED", "CAMERA_ISSUE", "USER_DETAILS", "USER_CONSENT", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum HelpCenterType extends Enum<HelpCenterType> {
    public static final HelpCenterType CAMERA_ISSUE = null;
    public static final HelpCenterType SELFIE_TIMEOUT = null;
    public static final HelpCenterType USER_CONSENT = null;
    public static final HelpCenterType USER_DETAILS = null;
    public static final HelpCenterType VERIFICATION_EXHAUSTED = null;
    public static final HelpCenterType VERIFICATION_FAILED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ HelpCenterType[] f40104a = null;

    static {
        SELFIE_TIMEOUT = new HelpCenterType("SELFIE_TIMEOUT", 0);
        VERIFICATION_EXHAUSTED = new HelpCenterType("VERIFICATION_EXHAUSTED", 1);
        VERIFICATION_FAILED = new HelpCenterType("VERIFICATION_FAILED", 2);
        CAMERA_ISSUE = new HelpCenterType("CAMERA_ISSUE", 3);
        USER_DETAILS = new HelpCenterType("USER_DETAILS", 4);
        USER_CONSENT = new HelpCenterType("USER_CONSENT", 5);
        f40104a = a();
    }

    HelpCenterType(String r1, int r2) {
    }

    public static final /* synthetic */ HelpCenterType[] a() {
        return new HelpCenterType[]{SELFIE_TIMEOUT, VERIFICATION_EXHAUSTED, VERIFICATION_FAILED, CAMERA_ISSUE, USER_DETAILS, USER_CONSENT};
    }

    public static HelpCenterType valueOf(String r1) {
        return (HelpCenterType) Enum.valueOf(HelpCenterType.class, r1);
    }

    public static HelpCenterType[] values() {
        return (HelpCenterType[]) f40104a.clone();
    }
}
