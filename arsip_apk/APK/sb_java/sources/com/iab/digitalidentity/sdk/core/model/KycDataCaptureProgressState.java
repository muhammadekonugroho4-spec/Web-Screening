package com.iab.digitalidentity.sdk.core.model;

import b.AbstractC4230a;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006#"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/KycDataCaptureProgressState;", "", "zipRetryCount", "", "urlRetryCount", "uploadRetryCount", "deleteRetryCount", "currentStep", "", "(IIIILjava/lang/String;)V", "getCurrentStep", "()Ljava/lang/String;", "setCurrentStep", "(Ljava/lang/String;)V", "getDeleteRetryCount", "()I", "setDeleteRetryCount", "(I)V", "getUploadRetryCount", "setUploadRetryCount", "getUrlRetryCount", "setUrlRetryCount", "getZipRetryCount", "setZipRetryCount", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KycDataCaptureProgressState {

    @SerializedName("currentStep")
    private String currentStep;

    @SerializedName("deleteRetryCount")
    private int deleteRetryCount;

    @SerializedName("uploadRetryCount")
    private int uploadRetryCount;

    @SerializedName("urlRetryCount")
    private int urlRetryCount;

    @SerializedName("zipRetryCount")
    private int zipRetryCount;

    public KycDataCaptureProgressState() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        String r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public static /* synthetic */ KycDataCaptureProgressState copy$default(KycDataCaptureProgressState r02, int r1, int r2, int r3, int r4, String r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r02.zipRetryCount;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r02.urlRetryCount;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r02.uploadRetryCount;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r02.deleteRetryCount;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r02.currentStep;
    L17:
        int r62 = r4;
        String r72 = r5;
        int r52 = r3;
        int r32 = r1;
        return r02.copy(r32, r2, r52, r62, r72);
    }

    public final int component1() {
        return this.zipRetryCount;
    }

    public final int component2() {
        return this.urlRetryCount;
    }

    public final int component3() {
        return this.uploadRetryCount;
    }

    public final int component4() {
        return this.deleteRetryCount;
    }

    public final String component5() {
        return this.currentStep;
    }

    public final KycDataCaptureProgressState copy(int r8, int r9, int r10, int r11, String r12) {
        p.l(r12, "currentStep");
        return new KycDataCaptureProgressState(r8, r9, r10, r11, r12);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof KycDataCaptureProgressState) == true) goto L8;
        return false;
    L8:
        KycDataCaptureProgressState r52 = (KycDataCaptureProgressState) r5;
        if (this.zipRetryCount == r52.zipRetryCount) goto L12;
        return false;
    L12:
        if (this.urlRetryCount == r52.urlRetryCount) goto L15;
        return false;
    L15:
        if (this.uploadRetryCount == r52.uploadRetryCount) goto L18;
        return false;
    L18:
        if (this.deleteRetryCount == r52.deleteRetryCount) goto L21;
        return false;
    L21:
        if (p.g(this.currentStep, r52.currentStep) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final String getCurrentStep() {
        return this.currentStep;
    }

    public final int getDeleteRetryCount() {
        return this.deleteRetryCount;
    }

    public final int getUploadRetryCount() {
        return this.uploadRetryCount;
    }

    public final int getUrlRetryCount() {
        return this.urlRetryCount;
    }

    public final int getZipRetryCount() {
        return this.zipRetryCount;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.zipRetryCount) * 31;
        int r03 = AbstractC4230a.a(this.urlRetryCount, r02, 31);
        int r04 = AbstractC4230a.a(this.uploadRetryCount, r03, 31);
        int r05 = AbstractC4230a.a(this.deleteRetryCount, r04, 31);
        return this.currentStep.hashCode() + r05;
    }

    public final void setCurrentStep(String r2) {
        p.l(r2, "<set-?>");
        this.currentStep = r2;
    }

    public final void setDeleteRetryCount(int r1) {
        this.deleteRetryCount = r1;
    }

    public final void setUploadRetryCount(int r1) {
        this.uploadRetryCount = r1;
    }

    public final void setUrlRetryCount(int r1) {
        this.urlRetryCount = r1;
    }

    public final void setZipRetryCount(int r1) {
        this.zipRetryCount = r1;
    }

    public String toString() {
        return "KycDataCaptureProgressState(zipRetryCount=" + this.zipRetryCount + ", urlRetryCount=" + this.urlRetryCount + ", uploadRetryCount=" + this.uploadRetryCount + ", deleteRetryCount=" + this.deleteRetryCount + ", currentStep=" + this.currentStep + ")";
    }

    public KycDataCaptureProgressState(int r2, int r3, int r4, int r5, String r6) {
        p.l(r6, "currentStep");
        this.zipRetryCount = r2;
        this.urlRetryCount = r3;
        this.uploadRetryCount = r4;
        this.deleteRetryCount = r5;
        this.currentStep = r6;
    }

    public /* synthetic */ KycDataCaptureProgressState(int r2, int r3, int r4, int r5, String r6, int r7, i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = "";
    L17:
        String r72 = r6;
        int r62 = r5;
        int r52 = r4;
        this(r2, r3, r52, r62, r72);
    }
}
