package com.iab.digitalidentity.sdk.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import b.AbstractC4230a;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\fJ \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006+"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/CustomCameraCaptureMetaData;", "Landroid/os/Parcelable;", "", "blurCount", "lowlightCount", "highlightCount", "croppedCount", "", "timeToDetectFirstGreenFrame", "<init>", "(IIIIJ)V", "component1", "()I", "component2", "component3", "component4", "component5", "()J", Constants.COPY_TYPE, "(IIIIJ)Lcom/iab/digitalidentity/sdk/core/model/CustomCameraCaptureMetaData;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/w;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getBlurCount", "getLowlightCount", "getHighlightCount", "getCroppedCount", "J", "getTimeToDetectFirstGreenFrame", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CustomCameraCaptureMetaData implements Parcelable {
    public static final Parcelable.Creator<CustomCameraCaptureMetaData> CREATOR = null;
    private final int blurCount;
    private final int croppedCount;
    private final int highlightCount;
    private final int lowlightCount;
    private final long timeToDetectFirstGreenFrame;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CustomCameraCaptureMetaData> {
        public Creator() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomCameraCaptureMetaData createFromParcel(Parcel r9) {
            p.l(r9, "parcel");
            return new CustomCameraCaptureMetaData(r9.readInt(), r9.readInt(), r9.readInt(), r9.readInt(), r9.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomCameraCaptureMetaData[] newArray(int r1) {
            return new CustomCameraCaptureMetaData[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CustomCameraCaptureMetaData createFromParcel(Parcel r1) {
            return createFromParcel(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CustomCameraCaptureMetaData[] newArray(int r1) {
            return newArray(r1);
        }
    }

    static {
        CREATOR = new Creator();
    }

    public CustomCameraCaptureMetaData(int r1, int r2, int r3, int r4, long r5) {
        this.blurCount = r1;
        this.lowlightCount = r2;
        this.highlightCount = r3;
        this.croppedCount = r4;
        this.timeToDetectFirstGreenFrame = r5;
    }

    public static /* synthetic */ CustomCameraCaptureMetaData copy$default(CustomCameraCaptureMetaData r02, int r1, int r2, int r3, int r4, long r5, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r02.blurCount;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r02.lowlightCount;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r02.highlightCount;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r02.croppedCount;
    L15:
        if ((r7 & 16) == 0) goto L17;
        r5 = r02.timeToDetectFirstGreenFrame;
    L17:
        long r72 = r5;
        int r52 = r3;
        int r6 = r4;
        return r02.copy(r1, r2, r52, r6, r72);
    }

    public final int component1() {
        return this.blurCount;
    }

    public final int component2() {
        return this.lowlightCount;
    }

    public final int component3() {
        return this.highlightCount;
    }

    public final int component4() {
        return this.croppedCount;
    }

    public final long component5() {
        return this.timeToDetectFirstGreenFrame;
    }

    public final CustomCameraCaptureMetaData copy(int r8, int r9, int r10, int r11, long r12) {
        return new CustomCameraCaptureMetaData(r8, r9, r10, r11, r12);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof CustomCameraCaptureMetaData) == true) goto L8;
        return false;
    L8:
        CustomCameraCaptureMetaData r82 = (CustomCameraCaptureMetaData) r8;
        if (this.blurCount == r82.blurCount) goto L12;
        return false;
    L12:
        if (this.lowlightCount == r82.lowlightCount) goto L15;
        return false;
    L15:
        if (this.highlightCount == r82.highlightCount) goto L18;
        return false;
    L18:
        if (this.croppedCount == r82.croppedCount) goto L21;
        return false;
    L21:
        if (this.timeToDetectFirstGreenFrame == r82.timeToDetectFirstGreenFrame) goto L23;
        return false;
    L23:
        return true;
    }

    public final int getBlurCount() {
        return this.blurCount;
    }

    public final int getCroppedCount() {
        return this.croppedCount;
    }

    public final int getHighlightCount() {
        return this.highlightCount;
    }

    public final int getLowlightCount() {
        return this.lowlightCount;
    }

    public final long getTimeToDetectFirstGreenFrame() {
        return this.timeToDetectFirstGreenFrame;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.blurCount) * 31;
        int r03 = AbstractC4230a.a(this.lowlightCount, r02, 31);
        int r04 = AbstractC4230a.a(this.highlightCount, r03, 31);
        int r05 = AbstractC4230a.a(this.croppedCount, r04, 31);
        return Long.hashCode(this.timeToDetectFirstGreenFrame) + r05;
    }

    public String toString() {
        return "CustomCameraCaptureMetaData(blurCount=" + this.blurCount + ", lowlightCount=" + this.lowlightCount + ", highlightCount=" + this.highlightCount + ", croppedCount=" + this.croppedCount + ", timeToDetectFirstGreenFrame=" + this.timeToDetectFirstGreenFrame + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "out");
        r3.writeInt(this.blurCount);
        r3.writeInt(this.lowlightCount);
        r3.writeInt(this.highlightCount);
        r3.writeInt(this.croppedCount);
        r3.writeLong(this.timeToDetectFirstGreenFrame);
    }
}
