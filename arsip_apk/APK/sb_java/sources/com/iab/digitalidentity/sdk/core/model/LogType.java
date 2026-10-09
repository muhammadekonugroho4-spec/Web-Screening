package com.iab.digitalidentity.sdk.core.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/LogType;", "", "(Ljava/lang/String;I)V", "WEB_WRAPPER_PAYLATER", "WEB_WRAPPER_CASHLOAN", "PINJAM_CICIL_COMBINED", "ON_DEMAND_CASHLOAN", "ON_DEMAND_DRIVER", "ON_DEMAND_GPS", "ON_DEMAND_LOGIN", "ON_DEMAND_GOBIZ", "ON_DEMAND_CICIL", "CORE_KYC", "VEHICLE_FINANCING", "TEST_PARTNER_FLOW", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum LogType extends Enum<LogType> {
    private static final /* synthetic */ LogType[] $VALUES = null;
    public static final LogType CORE_KYC = null;
    public static final LogType ON_DEMAND_CASHLOAN = null;
    public static final LogType ON_DEMAND_CICIL = null;
    public static final LogType ON_DEMAND_DRIVER = null;
    public static final LogType ON_DEMAND_GOBIZ = null;
    public static final LogType ON_DEMAND_GPS = null;
    public static final LogType ON_DEMAND_LOGIN = null;
    public static final LogType PINJAM_CICIL_COMBINED = null;
    public static final LogType TEST_PARTNER_FLOW = null;
    public static final LogType VEHICLE_FINANCING = null;
    public static final LogType WEB_WRAPPER_CASHLOAN = null;
    public static final LogType WEB_WRAPPER_PAYLATER = null;

    private static final /* synthetic */ LogType[] $values() {
        return new LogType[]{WEB_WRAPPER_PAYLATER, WEB_WRAPPER_CASHLOAN, PINJAM_CICIL_COMBINED, ON_DEMAND_CASHLOAN, ON_DEMAND_DRIVER, ON_DEMAND_GPS, ON_DEMAND_LOGIN, ON_DEMAND_GOBIZ, ON_DEMAND_CICIL, CORE_KYC, VEHICLE_FINANCING, TEST_PARTNER_FLOW};
    }

    static {
        WEB_WRAPPER_PAYLATER = new LogType("WEB_WRAPPER_PAYLATER", 0);
        WEB_WRAPPER_CASHLOAN = new LogType("WEB_WRAPPER_CASHLOAN", 1);
        PINJAM_CICIL_COMBINED = new LogType("PINJAM_CICIL_COMBINED", 2);
        ON_DEMAND_CASHLOAN = new LogType("ON_DEMAND_CASHLOAN", 3);
        ON_DEMAND_DRIVER = new LogType("ON_DEMAND_DRIVER", 4);
        ON_DEMAND_GPS = new LogType("ON_DEMAND_GPS", 5);
        ON_DEMAND_LOGIN = new LogType("ON_DEMAND_LOGIN", 6);
        ON_DEMAND_GOBIZ = new LogType("ON_DEMAND_GOBIZ", 7);
        ON_DEMAND_CICIL = new LogType("ON_DEMAND_CICIL", 8);
        CORE_KYC = new LogType("CORE_KYC", 9);
        VEHICLE_FINANCING = new LogType("VEHICLE_FINANCING", 10);
        TEST_PARTNER_FLOW = new LogType("TEST_PARTNER_FLOW", 11);
        $VALUES = $values();
    }

    LogType(String r1, int r2) {
    }

    public static LogType valueOf(String r1) {
        return (LogType) Enum.valueOf(LogType.class, r1);
    }

    public static LogType[] values() {
        return (LogType[]) $VALUES.clone();
    }
}
