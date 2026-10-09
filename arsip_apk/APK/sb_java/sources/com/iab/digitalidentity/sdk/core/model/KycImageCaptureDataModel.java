package com.iab.digitalidentity.sdk.core.model;

import a.AbstractC2049c;
import android.os.Parcel;
import android.os.Parcelable;
import b.AbstractC4230a;
import com.clevertap.android.sdk.Constants;
import i0.EnumC11484h;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ`\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0012J\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\u0016J\u001a\u0010$\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b&\u0010\u0016J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b\t\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b6\u0010\u0012R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b8\u0010\u001d¨\u00069"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/KycImageCaptureDataModel;", "Landroid/os/Parcelable;", "", "source", "kycStatus", "imageFilePath", "", "cameraFacing", "", "isThisRetake", "Li0/h;", "previewType", "onboardingPartner", "Lcom/iab/digitalidentity/sdk/core/model/OneKycFlow;", "flowType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLi0/h;Ljava/lang/String;Lcom/iab/digitalidentity/sdk/core/model/OneKycFlow;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "()Z", "component6", "()Li0/h;", "component7", "component8", "()Lcom/iab/digitalidentity/sdk/core/model/OneKycFlow;", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLi0/h;Ljava/lang/String;Lcom/iab/digitalidentity/sdk/core/model/OneKycFlow;)Lcom/iab/digitalidentity/sdk/core/model/KycImageCaptureDataModel;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/w;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSource", "getKycStatus", "getImageFilePath", "I", "getCameraFacing", "Z", "Li0/h;", "getPreviewType", "getOnboardingPartner", "Lcom/iab/digitalidentity/sdk/core/model/OneKycFlow;", "getFlowType", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KycImageCaptureDataModel implements Parcelable {
    public static final Parcelable.Creator<KycImageCaptureDataModel> CREATOR = null;
    private final int cameraFacing;
    private final OneKycFlow flowType;
    private final String imageFilePath;
    private final boolean isThisRetake;
    private final String kycStatus;
    private final String onboardingPartner;
    private final EnumC11484h previewType;
    private final String source;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<KycImageCaptureDataModel> {
        public Creator() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycImageCaptureDataModel createFromParcel(Parcel r11) {
            p.l(r11, "parcel");
            String r2 = r11.readString();
            String r3 = r11.readString();
            String r4 = r11.readString();
            int r5 = r11.readInt();
            if (r11.readInt() == 0) goto L6;
            boolean r02 = true;
        L5:
            boolean r6 = r02;
            return new KycImageCaptureDataModel(r2, r3, r4, r5, r6, EnumC11484h.valueOf(r11.readString()), r11.readString(), OneKycFlow.valueOf(r11.readString()));
        L6:
            r02 = false;
            goto L5
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycImageCaptureDataModel[] newArray(int r1) {
            return new KycImageCaptureDataModel[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ KycImageCaptureDataModel createFromParcel(Parcel r1) {
            return createFromParcel(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ KycImageCaptureDataModel[] newArray(int r1) {
            return newArray(r1);
        }
    }

    static {
        CREATOR = new Creator();
    }

    public KycImageCaptureDataModel(String r2, String r3, String r4, int r5, boolean r6, EnumC11484h r7, String r8, OneKycFlow r9) {
        p.l(r2, "source");
        p.l(r3, "kycStatus");
        p.l(r4, "imageFilePath");
        p.l(r7, "previewType");
        p.l(r8, "onboardingPartner");
        p.l(r9, "flowType");
        this.source = r2;
        this.kycStatus = r3;
        this.imageFilePath = r4;
        this.cameraFacing = r5;
        this.isThisRetake = r6;
        this.previewType = r7;
        this.onboardingPartner = r8;
        this.flowType = r9;
    }

    public static /* synthetic */ KycImageCaptureDataModel copy$default(KycImageCaptureDataModel r02, String r1, String r2, String r3, int r4, boolean r5, EnumC11484h r6, String r7, OneKycFlow r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r02.source;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r02.kycStatus;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r02.imageFilePath;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r02.cameraFacing;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r02.isThisRetake;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r6 = r02.previewType;
    L21:
        if ((r9 & 64) == 0) goto L24;
        r7 = r02.onboardingPartner;
    L24:
        if ((r9 & 128) == 0) goto L26;
        r8 = r02.flowType;
    L26:
        String r92 = r7;
        OneKycFlow r102 = r8;
        boolean r72 = r5;
        EnumC11484h r82 = r6;
        String r52 = r3;
        int r62 = r4;
        return r02.copy(r1, r2, r52, r62, r72, r82, r92, r102);
    }

    public final String component1() {
        return this.source;
    }

    public final String component2() {
        return this.kycStatus;
    }

    public final String component3() {
        return this.imageFilePath;
    }

    public final int component4() {
        return this.cameraFacing;
    }

    public final boolean component5() {
        return this.isThisRetake;
    }

    public final EnumC11484h component6() {
        return this.previewType;
    }

    public final String component7() {
        return this.onboardingPartner;
    }

    public final OneKycFlow component8() {
        return this.flowType;
    }

    public final KycImageCaptureDataModel copy(String r11, String r12, String r13, int r14, boolean r15, EnumC11484h r16, String r17, OneKycFlow r18) {
        p.l(r11, "source");
        p.l(r12, "kycStatus");
        p.l(r13, "imageFilePath");
        p.l(r16, "previewType");
        p.l(r17, "onboardingPartner");
        p.l(r18, "flowType");
        return new KycImageCaptureDataModel(r11, r12, r13, r14, r15, r16, r17, r18);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof KycImageCaptureDataModel) == true) goto L8;
        return false;
    L8:
        KycImageCaptureDataModel r52 = (KycImageCaptureDataModel) r5;
        if (p.g(this.source, r52.source) == true) goto L12;
        return false;
    L12:
        if (p.g(this.kycStatus, r52.kycStatus) == true) goto L15;
        return false;
    L15:
        if (p.g(this.imageFilePath, r52.imageFilePath) == true) goto L18;
        return false;
    L18:
        if (this.cameraFacing == r52.cameraFacing) goto L21;
        return false;
    L21:
        if (this.isThisRetake == r52.isThisRetake) goto L24;
        return false;
    L24:
        if (this.previewType == r52.previewType) goto L27;
        return false;
    L27:
        if (p.g(this.onboardingPartner, r52.onboardingPartner) == true) goto L30;
        return false;
    L30:
        if (this.flowType == r52.flowType) goto L32;
        return false;
    L32:
        return true;
    }

    public final int getCameraFacing() {
        return this.cameraFacing;
    }

    public final OneKycFlow getFlowType() {
        return this.flowType;
    }

    public final String getImageFilePath() {
        return this.imageFilePath;
    }

    public final String getKycStatus() {
        return this.kycStatus;
    }

    public final String getOnboardingPartner() {
        return this.onboardingPartner;
    }

    public final EnumC11484h getPreviewType() {
        return this.previewType;
    }

    public final String getSource() {
        return this.source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int r02 = this.source.hashCode() * 31;
        int r03 = AbstractC2049c.a(this.kycStatus, r02, 31);
        int r04 = AbstractC2049c.a(this.imageFilePath, r03, 31);
        int r05 = AbstractC4230a.a(this.cameraFacing, r04, 31);
        boolean r2 = this.isThisRetake;
        int r22 = r2;
        if (r2 == 0) goto L5;
        r22 = 1;
    L5:
        int r06 = (r05 + r22) * 31;
        int r23 = (this.previewType.hashCode() + r06) * 31;
        int r07 = AbstractC2049c.a(this.onboardingPartner, r23, 31);
        return this.flowType.hashCode() + r07;
    }

    public final boolean isThisRetake() {
        return this.isThisRetake;
    }

    public String toString() {
        return "KycImageCaptureDataModel(source=" + this.source + ", kycStatus=" + this.kycStatus + ", imageFilePath=" + this.imageFilePath + ", cameraFacing=" + this.cameraFacing + ", isThisRetake=" + this.isThisRetake + ", previewType=" + this.previewType + ", onboardingPartner=" + this.onboardingPartner + ", flowType=" + this.flowType + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "out");
        r1.writeString(this.source);
        r1.writeString(this.kycStatus);
        r1.writeString(this.imageFilePath);
        r1.writeInt(this.cameraFacing);
        r1.writeInt(this.isThisRetake ? 1 : 0);
        r1.writeString(this.previewType.name());
        r1.writeString(this.onboardingPartner);
        r1.writeString(this.flowType.name());
    }

    public /* synthetic */ KycImageCaptureDataModel(String r2, String r3, String r4, int r5, boolean r6, EnumC11484h r7, String r8, OneKycFlow r9, int r10, i r11) {
        if ((r10 & 2) == 0) goto L6;
        r3 = "";
    L6:
        if ((r10 & 64) == 0) goto L9;
        r8 = "";
    L9:
        if ((r10 & 128) == 0) goto L11;
        r9 = OneKycFlow.KYC;
    L11:
        OneKycFlow r102 = r9;
        String r42 = r3;
        this(r2, r42, r4, r5, r6, r7, r8, r102);
    }
}
