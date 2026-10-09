package com.iab.digitalidentity.sdk.core.model;

import i0.EnumC11484h;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/GoPayPlusCustomCameraPreviewData;", "", "", "isFromRetake", "Li0/h;", "previewType", "", "cameraFacing", "<init>", "(ZLi0/h;I)V", "Z", "()Z", "Li0/h;", "getPreviewType", "()Li0/h;", "I", "getCameraFacing", "()I", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GoPayPlusCustomCameraPreviewData {
    private final int cameraFacing;
    private final boolean isFromRetake;
    private final EnumC11484h previewType;

    public GoPayPlusCustomCameraPreviewData(boolean r2, EnumC11484h r3, int r4) {
        p.l(r3, "previewType");
        this.isFromRetake = r2;
        this.previewType = r3;
        this.cameraFacing = r4;
    }

    public final int getCameraFacing() {
        return this.cameraFacing;
    }

    public final EnumC11484h getPreviewType() {
        return this.previewType;
    }

    public final boolean isFromRetake() {
        return this.isFromRetake;
    }
}
