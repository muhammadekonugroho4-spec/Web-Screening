package com.stockbit.model.entity;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.stockbit.eipo.EipoEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b3\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u000fHÆ\u0003J\t\u0010=\u001a\u00020\u000fHÆ\u0003J\t\u0010>\u001a\u00020\u000fHÆ\u0003J©\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fHÆ\u0001J\u0014\u0010@\u001a\u00020\u000f2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010B\u001a\u00020CHÖ\u0081\u0004J\n\u0010D\u001a\u00020\u0003HÖ\u0081\u0004R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010,\"\u0004\b-\u0010.R\u001e\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010,\"\u0004\b/\u0010.R\u001e\u0010\u0011\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010,\"\u0004\b0\u0010.¨\u0006E"}, d2 = {"Lcom/stockbit/model/entity/EIpoDataResponseData;", "", "companyName", "", EipoEntryPoint.EXTRA_EMITEN_CODE, "companyLogo", FirebaseAnalytics.Param.PRICE, "stage", "stageDisplay", "stageStartDate", "stageEndDate", "stageDateDisplay", NotificationCompat.CATEGORY_STATUS, "statusDisplay", "isShow", "", "isWarrant", "isSharia", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "getCompanyName", "()Ljava/lang/String;", "setCompanyName", "(Ljava/lang/String;)V", "getEmitenCode", "setEmitenCode", "getCompanyLogo", "setCompanyLogo", "getPrice", "setPrice", "getStage", "setStage", "getStageDisplay", "setStageDisplay", "getStageStartDate", "setStageStartDate", "getStageEndDate", "setStageEndDate", "getStageDateDisplay", "setStageDateDisplay", "getStatus", "setStatus", "getStatusDisplay", "setStatusDisplay", "()Z", "setShow", "(Z)V", "setWarrant", "setSharia", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EIpoDataResponseData {

    @SerializedName("company_logo")
    @Expose
    private String companyLogo;

    @SerializedName("company_name")
    @Expose
    private String companyName;

    @SerializedName("emiten_code")
    @Expose
    private String emitenCode;

    @SerializedName("is_sharia")
    @Expose
    private boolean isSharia;

    @SerializedName("is_show")
    @Expose
    private boolean isShow;

    @SerializedName("is_warrant")
    @Expose
    private boolean isWarrant;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    @Expose
    private String price;

    @SerializedName("stage")
    @Expose
    private String stage;

    @SerializedName("stage_date_display")
    @Expose
    private String stageDateDisplay;

    @SerializedName("stage_display")
    @Expose
    private String stageDisplay;

    @SerializedName("stage_end_date")
    @Expose
    private String stageEndDate;

    @SerializedName("stage_start_date")
    @Expose
    private String stageStartDate;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Expose
    private String status;

    @SerializedName("status_display")
    @Expose
    private String statusDisplay;

    public EIpoDataResponseData() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        boolean r12 = false;
        boolean r13 = false;
        boolean r14 = false;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, 16383, null);
    }

    public final String a() {
        return this.companyLogo;
    }

    public final String b() {
        return this.companyName;
    }

    public final String c() {
        return this.emitenCode;
    }

    public final String d() {
        return this.price;
    }

    public final String e() {
        return this.stage;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof EIpoDataResponseData) == true) goto L8;
        return false;
    L8:
        EIpoDataResponseData r52 = (EIpoDataResponseData) r5;
        if (p.g(this.companyName, r52.companyName) == true) goto L12;
        return false;
    L12:
        if (p.g(this.emitenCode, r52.emitenCode) == true) goto L15;
        return false;
    L15:
        if (p.g(this.companyLogo, r52.companyLogo) == true) goto L18;
        return false;
    L18:
        if (p.g(this.price, r52.price) == true) goto L21;
        return false;
    L21:
        if (p.g(this.stage, r52.stage) == true) goto L24;
        return false;
    L24:
        if (p.g(this.stageDisplay, r52.stageDisplay) == true) goto L27;
        return false;
    L27:
        if (p.g(this.stageStartDate, r52.stageStartDate) == true) goto L30;
        return false;
    L30:
        if (p.g(this.stageEndDate, r52.stageEndDate) == true) goto L33;
        return false;
    L33:
        if (p.g(this.stageDateDisplay, r52.stageDateDisplay) == true) goto L36;
        return false;
    L36:
        if (p.g(this.status, r52.status) == true) goto L39;
        return false;
    L39:
        if (p.g(this.statusDisplay, r52.statusDisplay) == true) goto L42;
        return false;
    L42:
        if (this.isShow == r52.isShow) goto L45;
        return false;
    L45:
        if (this.isWarrant == r52.isWarrant) goto L48;
        return false;
    L48:
        if (this.isSharia == r52.isSharia) goto L50;
        return false;
    L50:
        return true;
    }

    public final String f() {
        return this.stageDateDisplay;
    }

    public final String g() {
        return this.stageDisplay;
    }

    public final String h() {
        return this.stageEndDate;
    }

    public int hashCode() {
        String r02 = this.companyName;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = ((r03 * 31) + this.emitenCode.hashCode()) * 31;
        String r2 = this.companyLogo;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.price;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.stage;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.stageDisplay;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.stageStartDate;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.stageEndDate;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.stageDateDisplay;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.status;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.statusDisplay;
        if (r217 == null) goto L43;
        r1 = r217.hashCode();
    L43:
        return ((((((r012 + r1) * 31) + Boolean.hashCode(this.isShow)) * 31) + Boolean.hashCode(this.isWarrant)) * 31) + Boolean.hashCode(this.isSharia);
    L37:
        r216 = r215.hashCode();
        goto L38
    L33:
        r214 = r213.hashCode();
        goto L34
    L29:
        r212 = r211.hashCode();
        goto L30
    L25:
        r210 = r29.hashCode();
        goto L26
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public final String i() {
        return this.stageStartDate;
    }

    public final String j() {
        return this.status;
    }

    public final String k() {
        return this.statusDisplay;
    }

    public final boolean l() {
        return this.isSharia;
    }

    public final boolean m() {
        return this.isShow;
    }

    public final boolean n() {
        return this.isWarrant;
    }

    public String toString() {
        return "EIpoDataResponseData(companyName=" + this.companyName + ", emitenCode=" + this.emitenCode + ", companyLogo=" + this.companyLogo + ", price=" + this.price + ", stage=" + this.stage + ", stageDisplay=" + this.stageDisplay + ", stageStartDate=" + this.stageStartDate + ", stageEndDate=" + this.stageEndDate + ", stageDateDisplay=" + this.stageDateDisplay + ", status=" + this.status + ", statusDisplay=" + this.statusDisplay + ", isShow=" + this.isShow + ", isWarrant=" + this.isWarrant + ", isSharia=" + this.isSharia + ')';
    }

    public EIpoDataResponseData(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, boolean r13, boolean r14, boolean r15) {
        p.l(r3, EipoEntryPoint.EXTRA_EMITEN_CODE);
        this.companyName = r2;
        this.emitenCode = r3;
        this.companyLogo = r4;
        this.price = r5;
        this.stage = r6;
        this.stageDisplay = r7;
        this.stageStartDate = r8;
        this.stageEndDate = r9;
        this.stageDateDisplay = r10;
        this.status = r11;
        this.statusDisplay = r12;
        this.isShow = r13;
        this.isWarrant = r14;
        this.isSharia = r15;
    }

    public /* synthetic */ EIpoDataResponseData(String r16, String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, boolean r27, boolean r28, boolean r29, int r30, i r31) {
        String r2 = null;
        if ((r30 & 1) == 0) goto L5;
        String r1 = null;
    L7:
        if ((r30 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r30 & 4) == 0) goto L13;
        String r4 = null;
    L15:
        if ((r30 & 8) == 0) goto L17;
        String r5 = null;
    L19:
        if ((r30 & 16) == 0) goto L21;
        String r6 = null;
    L23:
        if ((r30 & 32) == 0) goto L25;
        String r7 = null;
    L27:
        if ((r30 & 64) == 0) goto L29;
        String r8 = null;
    L31:
        if ((r30 & 128) == 0) goto L33;
        String r9 = null;
    L35:
        if ((r30 & 256) == 0) goto L37;
        String r10 = null;
    L39:
        if ((r30 & 512) == 0) goto L41;
        String r11 = null;
    L43:
        if ((r30 & 1024) != 0) goto L47;
        r2 = r26;
    L47:
        if ((r30 & 2048) == 0) goto L49;
        boolean r12 = false;
    L51:
        if ((r30 & 4096) == 0) goto L53;
        boolean r14 = false;
    L55:
        if ((r30 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L58;
        boolean r302 = false;
    L59:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r2, r12, r14, r302);
        return;
    L58:
        r302 = r29;
        goto L59
    L53:
        r14 = r28;
        goto L55
    L49:
        r12 = r27;
        goto L51
    L41:
        r11 = r25;
        goto L43
    L37:
        r10 = r24;
        goto L39
    L33:
        r9 = r23;
        goto L35
    L29:
        r8 = r22;
        goto L31
    L25:
        r7 = r21;
        goto L27
    L21:
        r6 = r20;
        goto L23
    L17:
        r5 = r19;
        goto L19
    L13:
        r4 = r18;
        goto L15
    L9:
        r3 = r17;
        goto L11
    L5:
        r1 = r16;
        goto L7
    }
}
