package androidx.camera.core.impl;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes.dex */
public enum CameraCaptureMetaData$AfMode extends Enum<CameraCaptureMetaData$AfMode> {
    public static final CameraCaptureMetaData$AfMode OFF = null;
    public static final CameraCaptureMetaData$AfMode ON_CONTINUOUS_AUTO = null;
    public static final CameraCaptureMetaData$AfMode ON_MANUAL_AUTO = null;
    public static final CameraCaptureMetaData$AfMode UNKNOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CameraCaptureMetaData$AfMode[] f5168a = null;

    static {
        UNKNOWN = new CameraCaptureMetaData$AfMode(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        OFF = new CameraCaptureMetaData$AfMode("OFF", 1);
        ON_MANUAL_AUTO = new CameraCaptureMetaData$AfMode("ON_MANUAL_AUTO", 2);
        ON_CONTINUOUS_AUTO = new CameraCaptureMetaData$AfMode("ON_CONTINUOUS_AUTO", 3);
        f5168a = a();
    }

    CameraCaptureMetaData$AfMode(String r1, int r2) {
    }

    public static /* synthetic */ CameraCaptureMetaData$AfMode[] a() {
        return new CameraCaptureMetaData$AfMode[]{UNKNOWN, OFF, ON_MANUAL_AUTO, ON_CONTINUOUS_AUTO};
    }

    public static CameraCaptureMetaData$AfMode valueOf(String r1) {
        return (CameraCaptureMetaData$AfMode) Enum.valueOf(CameraCaptureMetaData$AfMode.class, r1);
    }

    public static CameraCaptureMetaData$AfMode[] values() {
        return (CameraCaptureMetaData$AfMode[]) f5168a.clone();
    }
}
