package androidx.camera.core.impl;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes.dex */
public enum CameraCaptureMetaData$AeState extends Enum<CameraCaptureMetaData$AeState> {
    public static final CameraCaptureMetaData$AeState CONVERGED = null;
    public static final CameraCaptureMetaData$AeState FLASH_REQUIRED = null;
    public static final CameraCaptureMetaData$AeState INACTIVE = null;
    public static final CameraCaptureMetaData$AeState LOCKED = null;
    public static final CameraCaptureMetaData$AeState SEARCHING = null;
    public static final CameraCaptureMetaData$AeState UNKNOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CameraCaptureMetaData$AeState[] f5167a = null;

    static {
        UNKNOWN = new CameraCaptureMetaData$AeState(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        INACTIVE = new CameraCaptureMetaData$AeState("INACTIVE", 1);
        SEARCHING = new CameraCaptureMetaData$AeState("SEARCHING", 2);
        FLASH_REQUIRED = new CameraCaptureMetaData$AeState("FLASH_REQUIRED", 3);
        CONVERGED = new CameraCaptureMetaData$AeState("CONVERGED", 4);
        LOCKED = new CameraCaptureMetaData$AeState("LOCKED", 5);
        f5167a = a();
    }

    CameraCaptureMetaData$AeState(String r1, int r2) {
    }

    public static /* synthetic */ CameraCaptureMetaData$AeState[] a() {
        return new CameraCaptureMetaData$AeState[]{UNKNOWN, INACTIVE, SEARCHING, FLASH_REQUIRED, CONVERGED, LOCKED};
    }

    public static CameraCaptureMetaData$AeState valueOf(String r1) {
        return (CameraCaptureMetaData$AeState) Enum.valueOf(CameraCaptureMetaData$AeState.class, r1);
    }

    public static CameraCaptureMetaData$AeState[] values() {
        return (CameraCaptureMetaData$AeState[]) f5167a.clone();
    }
}
