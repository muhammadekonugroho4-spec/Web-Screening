package androidx.camera.core.impl;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes.dex */
public enum CameraCaptureMetaData$AeMode extends Enum<CameraCaptureMetaData$AeMode> {
    public static final CameraCaptureMetaData$AeMode OFF = null;
    public static final CameraCaptureMetaData$AeMode ON = null;
    public static final CameraCaptureMetaData$AeMode ON_ALWAYS_FLASH = null;
    public static final CameraCaptureMetaData$AeMode ON_AUTO_FLASH = null;
    public static final CameraCaptureMetaData$AeMode ON_AUTO_FLASH_REDEYE = null;
    public static final CameraCaptureMetaData$AeMode ON_EXTERNAL_FLASH = null;
    public static final CameraCaptureMetaData$AeMode UNKNOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CameraCaptureMetaData$AeMode[] f5166a = null;

    static {
        UNKNOWN = new CameraCaptureMetaData$AeMode(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        OFF = new CameraCaptureMetaData$AeMode("OFF", 1);
        ON = new CameraCaptureMetaData$AeMode("ON", 2);
        ON_AUTO_FLASH = new CameraCaptureMetaData$AeMode("ON_AUTO_FLASH", 3);
        ON_ALWAYS_FLASH = new CameraCaptureMetaData$AeMode("ON_ALWAYS_FLASH", 4);
        ON_AUTO_FLASH_REDEYE = new CameraCaptureMetaData$AeMode("ON_AUTO_FLASH_REDEYE", 5);
        ON_EXTERNAL_FLASH = new CameraCaptureMetaData$AeMode("ON_EXTERNAL_FLASH", 6);
        f5166a = a();
    }

    CameraCaptureMetaData$AeMode(String r1, int r2) {
    }

    public static /* synthetic */ CameraCaptureMetaData$AeMode[] a() {
        return new CameraCaptureMetaData$AeMode[]{UNKNOWN, OFF, ON, ON_AUTO_FLASH, ON_ALWAYS_FLASH, ON_AUTO_FLASH_REDEYE, ON_EXTERNAL_FLASH};
    }

    public static CameraCaptureMetaData$AeMode valueOf(String r1) {
        return (CameraCaptureMetaData$AeMode) Enum.valueOf(CameraCaptureMetaData$AeMode.class, r1);
    }

    public static CameraCaptureMetaData$AeMode[] values() {
        return (CameraCaptureMetaData$AeMode[]) f5166a.clone();
    }
}
