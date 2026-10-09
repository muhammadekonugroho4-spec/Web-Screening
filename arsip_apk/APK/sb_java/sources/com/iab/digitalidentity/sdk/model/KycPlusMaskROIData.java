package com.iab.digitalidentity.sdk.model;

import android.graphics.Rect;
import android.graphics.RectF;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/iab/digitalidentity/sdk/model/KycPlusMaskROIData;", "", "fullImageRoi", "Landroid/graphics/Rect;", "fullImageRoiInPx", "Landroid/graphics/RectF;", "faceRoi", "faceRoiInPx", "(Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Rect;Landroid/graphics/RectF;)V", "getFaceRoi", "()Landroid/graphics/Rect;", "getFaceRoiInPx", "()Landroid/graphics/RectF;", "getFullImageRoi", "getFullImageRoiInPx", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KycPlusMaskROIData {
    private final Rect faceRoi;
    private final RectF faceRoiInPx;
    private final Rect fullImageRoi;
    private final RectF fullImageRoiInPx;

    public KycPlusMaskROIData(Rect r2, RectF r3, Rect r4, RectF r5) {
        p.l(r2, "fullImageRoi");
        p.l(r3, "fullImageRoiInPx");
        p.l(r4, "faceRoi");
        p.l(r5, "faceRoiInPx");
        this.fullImageRoi = r2;
        this.fullImageRoiInPx = r3;
        this.faceRoi = r4;
        this.faceRoiInPx = r5;
    }

    public static /* synthetic */ KycPlusMaskROIData copy$default(KycPlusMaskROIData r02, Rect r1, RectF r2, Rect r3, RectF r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.fullImageRoi;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.fullImageRoiInPx;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.faceRoi;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.faceRoiInPx;
    L15:
        return r02.copy(r1, r2, r3, r4);
    }

    public final Rect component1() {
        return this.fullImageRoi;
    }

    public final RectF component2() {
        return this.fullImageRoiInPx;
    }

    public final Rect component3() {
        return this.faceRoi;
    }

    public final RectF component4() {
        return this.faceRoiInPx;
    }

    public final KycPlusMaskROIData copy(Rect r2, RectF r3, Rect r4, RectF r5) {
        p.l(r2, "fullImageRoi");
        p.l(r3, "fullImageRoiInPx");
        p.l(r4, "faceRoi");
        p.l(r5, "faceRoiInPx");
        return new KycPlusMaskROIData(r2, r3, r4, r5);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof KycPlusMaskROIData) == true) goto L8;
        return false;
    L8:
        KycPlusMaskROIData r52 = (KycPlusMaskROIData) r5;
        if (p.g(this.fullImageRoi, r52.fullImageRoi) == true) goto L12;
        return false;
    L12:
        if (p.g(this.fullImageRoiInPx, r52.fullImageRoiInPx) == true) goto L15;
        return false;
    L15:
        if (p.g(this.faceRoi, r52.faceRoi) == true) goto L18;
        return false;
    L18:
        if (p.g(this.faceRoiInPx, r52.faceRoiInPx) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final Rect getFaceRoi() {
        return this.faceRoi;
    }

    public final RectF getFaceRoiInPx() {
        return this.faceRoiInPx;
    }

    public final Rect getFullImageRoi() {
        return this.fullImageRoi;
    }

    public final RectF getFullImageRoiInPx() {
        return this.fullImageRoiInPx;
    }

    public int hashCode() {
        int r02 = this.fullImageRoi.hashCode() * 31;
        int r1 = (this.fullImageRoiInPx.hashCode() + r02) * 31;
        int r03 = (this.faceRoi.hashCode() + r1) * 31;
        return this.faceRoiInPx.hashCode() + r03;
    }

    public String toString() {
        return "KycPlusMaskROIData(fullImageRoi=" + this.fullImageRoi + ", fullImageRoiInPx=" + this.fullImageRoiInPx + ", faceRoi=" + this.faceRoi + ", faceRoiInPx=" + this.faceRoiInPx + ")";
    }
}
