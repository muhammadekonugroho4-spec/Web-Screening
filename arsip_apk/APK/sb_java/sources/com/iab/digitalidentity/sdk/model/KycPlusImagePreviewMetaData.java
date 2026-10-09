package com.iab.digitalidentity.sdk.model;

import T.b;
import a.AbstractC2049c;
import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.iab.digitalidentity.sdk.core.model.CustomCameraCaptureMetaData;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J^\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u0010\u0010\u001f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b&\u0010 J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b7\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b8\u0010\u0013¨\u00069"}, d2 = {"Lcom/iab/digitalidentity/sdk/model/KycPlusImagePreviewMetaData;", "Landroid/os/Parcelable;", "LT/b;", "cameraType", "", "captureMode", "autoCaptureVariantName", "Lcom/iab/digitalidentity/sdk/core/model/CustomCameraCaptureMetaData;", "captureMetaData", "", "timeToDetectFace", "", "autoCaptureAttempts", "imageQualityFeedback", "<init>", "(LT/b;Ljava/lang/String;Ljava/lang/String;Lcom/iab/digitalidentity/sdk/core/model/CustomCameraCaptureMetaData;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()LT/b;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/iab/digitalidentity/sdk/core/model/CustomCameraCaptureMetaData;", "component5", "()Ljava/lang/Long;", "component6", "()Ljava/lang/Integer;", "component7", Constants.COPY_TYPE, "(LT/b;Ljava/lang/String;Ljava/lang/String;Lcom/iab/digitalidentity/sdk/core/model/CustomCameraCaptureMetaData;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)Lcom/iab/digitalidentity/sdk/model/KycPlusImagePreviewMetaData;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/w;", "writeToParcel", "(Landroid/os/Parcel;I)V", "LT/b;", "getCameraType", "Ljava/lang/String;", "getCaptureMode", "getAutoCaptureVariantName", "Lcom/iab/digitalidentity/sdk/core/model/CustomCameraCaptureMetaData;", "getCaptureMetaData", "Ljava/lang/Long;", "getTimeToDetectFace", "Ljava/lang/Integer;", "getAutoCaptureAttempts", "getImageQualityFeedback", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KycPlusImagePreviewMetaData implements Parcelable {
    public static final Parcelable.Creator<KycPlusImagePreviewMetaData> CREATOR = null;
    private final Integer autoCaptureAttempts;
    private final String autoCaptureVariantName;
    private final b cameraType;
    private final CustomCameraCaptureMetaData captureMetaData;
    private final String captureMode;
    private final String imageQualityFeedback;
    private final Long timeToDetectFace;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<KycPlusImagePreviewMetaData> {
        public Creator() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycPlusImagePreviewMetaData createFromParcel(Parcel r10) {
            p.l(r10, "parcel");
            b r2 = b.valueOf(r10.readString());
            String r3 = r10.readString();
            String r4 = r10.readString();
            Integer r5 = null;
            if (r10.readInt() != 0) goto L5;
            CustomCameraCaptureMetaData r02 = null;
        L6:
            CustomCameraCaptureMetaData r03 = r02;
            if (r10.readInt() != 0) goto L9;
            Long r6 = null;
        L11:
            if (r10.readInt() == 0) goto L15;
            r5 = Integer.valueOf(r10.readInt());
        L15:
            return new KycPlusImagePreviewMetaData(r2, r3, r4, r03, r6, r5, r10.readString());
        L9:
            r6 = Long.valueOf(r10.readLong());
            goto L11
        L5:
            r02 = CustomCameraCaptureMetaData.CREATOR.createFromParcel(r10);
            goto L6
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycPlusImagePreviewMetaData[] newArray(int r1) {
            return new KycPlusImagePreviewMetaData[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ KycPlusImagePreviewMetaData createFromParcel(Parcel r1) {
            return createFromParcel(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ KycPlusImagePreviewMetaData[] newArray(int r1) {
            return newArray(r1);
        }
    }

    static {
        CREATOR = new Creator();
    }

    public KycPlusImagePreviewMetaData(b r2, String r3, String r4, CustomCameraCaptureMetaData r5, Long r6, Integer r7, String r8) {
        p.l(r2, "cameraType");
        p.l(r3, "captureMode");
        p.l(r8, "imageQualityFeedback");
        this.cameraType = r2;
        this.captureMode = r3;
        this.autoCaptureVariantName = r4;
        this.captureMetaData = r5;
        this.timeToDetectFace = r6;
        this.autoCaptureAttempts = r7;
        this.imageQualityFeedback = r8;
    }

    public static /* synthetic */ KycPlusImagePreviewMetaData copy$default(KycPlusImagePreviewMetaData r02, b r1, String r2, String r3, CustomCameraCaptureMetaData r4, Long r5, Integer r6, String r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r02.cameraType;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r02.captureMode;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r02.autoCaptureVariantName;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r02.captureMetaData;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r02.timeToDetectFace;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r02.autoCaptureAttempts;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r02.imageQualityFeedback;
    L23:
        Integer r82 = r6;
        String r92 = r7;
        CustomCameraCaptureMetaData r62 = r4;
        Long r72 = r5;
        String r52 = r3;
        b r32 = r1;
        return r02.copy(r32, r2, r52, r62, r72, r82, r92);
    }

    public final b component1() {
        return this.cameraType;
    }

    public final String component2() {
        return this.captureMode;
    }

    public final String component3() {
        return this.autoCaptureVariantName;
    }

    public final CustomCameraCaptureMetaData component4() {
        return this.captureMetaData;
    }

    public final Long component5() {
        return this.timeToDetectFace;
    }

    public final Integer component6() {
        return this.autoCaptureAttempts;
    }

    public final String component7() {
        return this.imageQualityFeedback;
    }

    public final KycPlusImagePreviewMetaData copy(b r10, String r11, String r12, CustomCameraCaptureMetaData r13, Long r14, Integer r15, String r16) {
        p.l(r10, "cameraType");
        p.l(r11, "captureMode");
        p.l(r16, "imageQualityFeedback");
        return new KycPlusImagePreviewMetaData(r10, r11, r12, r13, r14, r15, r16);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof KycPlusImagePreviewMetaData) == true) goto L8;
        return false;
    L8:
        KycPlusImagePreviewMetaData r52 = (KycPlusImagePreviewMetaData) r5;
        if (this.cameraType == r52.cameraType) goto L12;
        return false;
    L12:
        if (p.g(this.captureMode, r52.captureMode) == true) goto L15;
        return false;
    L15:
        if (p.g(this.autoCaptureVariantName, r52.autoCaptureVariantName) == true) goto L18;
        return false;
    L18:
        if (p.g(this.captureMetaData, r52.captureMetaData) == true) goto L21;
        return false;
    L21:
        if (p.g(this.timeToDetectFace, r52.timeToDetectFace) == true) goto L24;
        return false;
    L24:
        if (p.g(this.autoCaptureAttempts, r52.autoCaptureAttempts) == true) goto L27;
        return false;
    L27:
        if (p.g(this.imageQualityFeedback, r52.imageQualityFeedback) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final Integer getAutoCaptureAttempts() {
        return this.autoCaptureAttempts;
    }

    public final String getAutoCaptureVariantName() {
        return this.autoCaptureVariantName;
    }

    public final b getCameraType() {
        return this.cameraType;
    }

    public final CustomCameraCaptureMetaData getCaptureMetaData() {
        return this.captureMetaData;
    }

    public final String getCaptureMode() {
        return this.captureMode;
    }

    public final String getImageQualityFeedback() {
        return this.imageQualityFeedback;
    }

    public final Long getTimeToDetectFace() {
        return this.timeToDetectFace;
    }

    public int hashCode() {
        int r02 = AbstractC2049c.a(this.captureMode, this.cameraType.hashCode() * 31, 31);
        String r2 = this.autoCaptureVariantName;
        int r3 = 0;
        if (r2 != null) goto L5;
        int r22 = 0;
    L6:
        int r03 = (r02 + r22) * 31;
        CustomCameraCaptureMetaData r23 = this.captureMetaData;
        if (r23 != null) goto L9;
        int r24 = 0;
    L10:
        int r04 = (r03 + r24) * 31;
        Long r25 = this.timeToDetectFace;
        if (r25 != null) goto L13;
        int r26 = 0;
    L14:
        int r05 = (r04 + r26) * 31;
        Integer r27 = this.autoCaptureAttempts;
        if (r27 == null) goto L19;
        r3 = r27.hashCode();
    L19:
        return this.imageQualityFeedback.hashCode() + ((r05 + r3) * 31);
    L13:
        r26 = r25.hashCode();
        goto L14
    L9:
        r24 = r23.hashCode();
        goto L10
    L5:
        r22 = r2.hashCode();
        goto L6
    }

    public String toString() {
        return "KycPlusImagePreviewMetaData(cameraType=" + this.cameraType + ", captureMode=" + this.captureMode + ", autoCaptureVariantName=" + this.autoCaptureVariantName + ", captureMetaData=" + this.captureMetaData + ", timeToDetectFace=" + this.timeToDetectFace + ", autoCaptureAttempts=" + this.autoCaptureAttempts + ", imageQualityFeedback=" + this.imageQualityFeedback + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r6, int r7) {
        p.l(r6, "out");
        r6.writeString(this.cameraType.name());
        r6.writeString(this.captureMode);
        r6.writeString(this.autoCaptureVariantName);
        CustomCameraCaptureMetaData r02 = this.captureMetaData;
        if (r02 != null) goto L5;
        r6.writeInt(0);
    L6:
        Long r72 = this.timeToDetectFace;
        if (r72 != null) goto L9;
        r6.writeInt(0);
    L10:
        Integer r73 = this.autoCaptureAttempts;
        if (r73 != null) goto L13;
        r6.writeInt(0);
    L14:
        r6.writeString(this.imageQualityFeedback);
        return;
    L13:
        r6.writeInt(1);
        r6.writeInt(r73.intValue());
        goto L14
    L9:
        r6.writeInt(1);
        r6.writeLong(r72.longValue());
        goto L10
    L5:
        r6.writeInt(1);
        r02.writeToParcel(r6, r7);
        goto L6
    }
}
