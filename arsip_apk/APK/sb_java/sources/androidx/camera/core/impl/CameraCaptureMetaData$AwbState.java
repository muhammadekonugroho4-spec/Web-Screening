package androidx.camera.core.impl;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes.dex */
public enum CameraCaptureMetaData$AwbState extends Enum<CameraCaptureMetaData$AwbState> {
    public static final CameraCaptureMetaData$AwbState CONVERGED = null;
    public static final CameraCaptureMetaData$AwbState INACTIVE = null;
    public static final CameraCaptureMetaData$AwbState LOCKED = null;
    public static final CameraCaptureMetaData$AwbState METERING = null;
    public static final CameraCaptureMetaData$AwbState UNKNOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CameraCaptureMetaData$AwbState[] f5171a = null;

    static {
        UNKNOWN = new CameraCaptureMetaData$AwbState(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        INACTIVE = new CameraCaptureMetaData$AwbState("INACTIVE", 1);
        METERING = new CameraCaptureMetaData$AwbState("METERING", 2);
        CONVERGED = new CameraCaptureMetaData$AwbState("CONVERGED", 3);
        LOCKED = new CameraCaptureMetaData$AwbState("LOCKED", 4);
        f5171a = a();
    }

    CameraCaptureMetaData$AwbState(String r1, int r2) {
    }

    public static /* synthetic */ CameraCaptureMetaData$AwbState[] a() {
        return new CameraCaptureMetaData$AwbState[]{UNKNOWN, INACTIVE, METERING, CONVERGED, LOCKED};
    }

    public static CameraCaptureMetaData$AwbState valueOf(String r1) {
        return (CameraCaptureMetaData$AwbState) Enum.valueOf(CameraCaptureMetaData$AwbState.class, r1);
    }

    public static CameraCaptureMetaData$AwbState[] values() {
        return (CameraCaptureMetaData$AwbState[]) f5171a.clone();
    }
}
