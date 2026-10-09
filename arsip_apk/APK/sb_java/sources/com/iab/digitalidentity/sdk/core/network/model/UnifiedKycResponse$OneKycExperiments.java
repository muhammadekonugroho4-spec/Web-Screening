package com.iab.digitalidentity.sdk.core.network.model;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.scheduling.WorkQueueKt;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0002\u0012$\b\u0002\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u0004\u0012$\b\u0002\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u0004\u0012$\b\u0002\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u0004\u0012$\b\u0002\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u0004\u0012$\b\u0002\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u0004\u0012$\b\u0002\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u0004\u0012$\b\u0002\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u0004¢\u0006\u0004\b\f\u0010\rR6\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R6\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R6\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R6\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R6\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R6\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R6\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u0017"}, d2 = {"com/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$OneKycExperiments", "", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "imageQualityConfigsV5", "dvnExperimentV4", "unifiedKyc", "homeV2", "selfieConfigsV3", "kycConfig", "mlModelUrl", "<init>", "(Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)V", "Ljava/util/HashMap;", "c", "()Ljava/util/HashMap;", "a", "g", "b", "f", Constants.INAPP_DATA_TAG, "e", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnifiedKycResponse$OneKycExperiments {

    @SerializedName("dvn")
    private final HashMap<String, String> dvnExperimentV4;

    @SerializedName("onboarding")
    private final HashMap<String, String> homeV2;

    @SerializedName("image_quality")
    private final HashMap<String, String> imageQualityConfigsV5;

    @SerializedName("risk")
    private final HashMap<String, String> kycConfig;

    @SerializedName("ojo_ml_model_urls")
    private final HashMap<String, String> mlModelUrl;

    @SerializedName("aurora_selfie")
    private final HashMap<String, String> selfieConfigsV3;

    @SerializedName("unified_kyc")
    private final HashMap<String, String> unifiedKyc;

    public UnifiedKycResponse$OneKycExperiments() {
        HashMap r1 = null;
        HashMap r2 = null;
        HashMap r3 = null;
        HashMap r4 = null;
        HashMap r5 = null;
        HashMap r6 = null;
        HashMap r7 = null;
        this(r1, r2, r3, r4, r5, r6, r7, WorkQueueKt.MASK, null);
    }

    public final HashMap a() {
        return this.dvnExperimentV4;
    }

    public final HashMap b() {
        return this.homeV2;
    }

    public final HashMap c() {
        return this.imageQualityConfigsV5;
    }

    public final HashMap d() {
        return this.kycConfig;
    }

    public final HashMap e() {
        return this.mlModelUrl;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UnifiedKycResponse$OneKycExperiments) == true) goto L8;
        return false;
    L8:
        UnifiedKycResponse$OneKycExperiments r52 = (UnifiedKycResponse$OneKycExperiments) r5;
        if (p.g(this.imageQualityConfigsV5, r52.imageQualityConfigsV5) == true) goto L12;
        return false;
    L12:
        if (p.g(this.dvnExperimentV4, r52.dvnExperimentV4) == true) goto L15;
        return false;
    L15:
        if (p.g(this.unifiedKyc, r52.unifiedKyc) == true) goto L18;
        return false;
    L18:
        if (p.g(this.homeV2, r52.homeV2) == true) goto L21;
        return false;
    L21:
        if (p.g(this.selfieConfigsV3, r52.selfieConfigsV3) == true) goto L24;
        return false;
    L24:
        if (p.g(this.kycConfig, r52.kycConfig) == true) goto L27;
        return false;
    L27:
        if (p.g(this.mlModelUrl, r52.mlModelUrl) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final HashMap f() {
        return this.selfieConfigsV3;
    }

    public final HashMap g() {
        return this.unifiedKyc;
    }

    public final int hashCode() {
        int r02 = this.imageQualityConfigsV5.hashCode() * 31;
        int r1 = (this.dvnExperimentV4.hashCode() + r02) * 31;
        int r03 = (this.unifiedKyc.hashCode() + r1) * 31;
        int r12 = (this.homeV2.hashCode() + r03) * 31;
        int r04 = (this.selfieConfigsV3.hashCode() + r12) * 31;
        int r13 = (this.kycConfig.hashCode() + r04) * 31;
        return this.mlModelUrl.hashCode() + r13;
    }

    public final String toString() {
        return "OneKycExperiments(imageQualityConfigsV5=" + this.imageQualityConfigsV5 + ", dvnExperimentV4=" + this.dvnExperimentV4 + ", unifiedKyc=" + this.unifiedKyc + ", homeV2=" + this.homeV2 + ", selfieConfigsV3=" + this.selfieConfigsV3 + ", kycConfig=" + this.kycConfig + ", mlModelUrl=" + this.mlModelUrl + ")";
    }

    public UnifiedKycResponse$OneKycExperiments(HashMap<String, String> r2, HashMap<String, String> r3, HashMap<String, String> r4, HashMap<String, String> r5, HashMap<String, String> r6, HashMap<String, String> r7, HashMap<String, String> r8) {
        p.l(r2, "imageQualityConfigsV5");
        p.l(r3, "dvnExperimentV4");
        p.l(r4, "unifiedKyc");
        p.l(r5, "homeV2");
        p.l(r6, "selfieConfigsV3");
        p.l(r7, "kycConfig");
        p.l(r8, "mlModelUrl");
        this.imageQualityConfigsV5 = r2;
        this.dvnExperimentV4 = r3;
        this.unifiedKyc = r4;
        this.homeV2 = r5;
        this.selfieConfigsV3 = r6;
        this.kycConfig = r7;
        this.mlModelUrl = r8;
    }

    public /* synthetic */ UnifiedKycResponse$OneKycExperiments(HashMap r1, HashMap r2, HashMap r3, HashMap r4, HashMap r5, HashMap r6, HashMap r7, int r8, i r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = new HashMap();
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = new HashMap();
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = new HashMap();
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = new HashMap();
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = new HashMap();
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = new HashMap();
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = new HashMap();
    L23:
        HashMap r82 = r6;
        HashMap r92 = r7;
        HashMap r62 = r4;
        HashMap r72 = r5;
        HashMap r52 = r3;
        HashMap r32 = r1;
        this(r32, r2, r52, r62, r72, r82, r92);
    }
}
