package com.iab.digitalidentity.sdk.core.constants;

import com.google.android.gms.stats.CodePackage;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/constants/DigitalIdentityFlowErrorCode;", "", "(Ljava/lang/String;I)V", "CAMERA", "PERMISSION", "NETWORK", "API", "VERIFICATION", "HELP_CLICKED", CodePackage.SECURITY, "USER_CANCELLED", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum DigitalIdentityFlowErrorCode extends Enum<DigitalIdentityFlowErrorCode> {
    public static final DigitalIdentityFlowErrorCode API = null;
    public static final DigitalIdentityFlowErrorCode CAMERA = null;
    public static final DigitalIdentityFlowErrorCode HELP_CLICKED = null;
    public static final DigitalIdentityFlowErrorCode NETWORK = null;
    public static final DigitalIdentityFlowErrorCode PERMISSION = null;
    public static final DigitalIdentityFlowErrorCode SECURITY = null;
    public static final DigitalIdentityFlowErrorCode USER_CANCELLED = null;
    public static final DigitalIdentityFlowErrorCode VERIFICATION = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DigitalIdentityFlowErrorCode[] f40137a = null;

    static {
        CAMERA = new DigitalIdentityFlowErrorCode("CAMERA", 0);
        PERMISSION = new DigitalIdentityFlowErrorCode("PERMISSION", 1);
        NETWORK = new DigitalIdentityFlowErrorCode("NETWORK", 2);
        API = new DigitalIdentityFlowErrorCode("API", 3);
        VERIFICATION = new DigitalIdentityFlowErrorCode("VERIFICATION", 4);
        HELP_CLICKED = new DigitalIdentityFlowErrorCode("HELP_CLICKED", 5);
        SECURITY = new DigitalIdentityFlowErrorCode(CodePackage.SECURITY, 6);
        USER_CANCELLED = new DigitalIdentityFlowErrorCode("USER_CANCELLED", 7);
        f40137a = a();
    }

    DigitalIdentityFlowErrorCode(String r1, int r2) {
    }

    public static final /* synthetic */ DigitalIdentityFlowErrorCode[] a() {
        return new DigitalIdentityFlowErrorCode[]{CAMERA, PERMISSION, NETWORK, API, VERIFICATION, HELP_CLICKED, SECURITY, USER_CANCELLED};
    }

    public static DigitalIdentityFlowErrorCode valueOf(String r1) {
        return (DigitalIdentityFlowErrorCode) Enum.valueOf(DigitalIdentityFlowErrorCode.class, r1);
    }

    public static DigitalIdentityFlowErrorCode[] values() {
        return (DigitalIdentityFlowErrorCode[]) f40137a.clone();
    }
}
