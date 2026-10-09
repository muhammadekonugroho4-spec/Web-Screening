package androidx.camera.core.impl;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes.dex */
public enum CameraCaptureMetaData$AfState extends Enum<CameraCaptureMetaData$AfState> {
    public static final CameraCaptureMetaData$AfState INACTIVE = null;
    public static final CameraCaptureMetaData$AfState LOCKED_FOCUSED = null;
    public static final CameraCaptureMetaData$AfState LOCKED_NOT_FOCUSED = null;
    public static final CameraCaptureMetaData$AfState PASSIVE_FOCUSED = null;
    public static final CameraCaptureMetaData$AfState PASSIVE_NOT_FOCUSED = null;
    public static final CameraCaptureMetaData$AfState SCANNING = null;
    public static final CameraCaptureMetaData$AfState UNKNOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CameraCaptureMetaData$AfState[] f5169a = null;

    static {
        UNKNOWN = new CameraCaptureMetaData$AfState(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        INACTIVE = new CameraCaptureMetaData$AfState("INACTIVE", 1);
        SCANNING = new CameraCaptureMetaData$AfState("SCANNING", 2);
        PASSIVE_FOCUSED = new CameraCaptureMetaData$AfState("PASSIVE_FOCUSED", 3);
        PASSIVE_NOT_FOCUSED = new CameraCaptureMetaData$AfState("PASSIVE_NOT_FOCUSED", 4);
        LOCKED_FOCUSED = new CameraCaptureMetaData$AfState("LOCKED_FOCUSED", 5);
        LOCKED_NOT_FOCUSED = new CameraCaptureMetaData$AfState("LOCKED_NOT_FOCUSED", 6);
        f5169a = a();
    }

    CameraCaptureMetaData$AfState(String r1, int r2) {
    }

    public static /* synthetic */ CameraCaptureMetaData$AfState[] a() {
        return new CameraCaptureMetaData$AfState[]{UNKNOWN, INACTIVE, SCANNING, PASSIVE_FOCUSED, PASSIVE_NOT_FOCUSED, LOCKED_FOCUSED, LOCKED_NOT_FOCUSED};
    }

    public static CameraCaptureMetaData$AfState valueOf(String r1) {
        return (CameraCaptureMetaData$AfState) Enum.valueOf(CameraCaptureMetaData$AfState.class, r1);
    }

    public static CameraCaptureMetaData$AfState[] values() {
        return (CameraCaptureMetaData$AfState[]) f5169a.clone();
    }
}
