package com.stockbit.dto.eipo;

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

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\t\u00100\u001a\u00020\u000fHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J·\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u00104\u001a\u00020\u000f2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00106\u001a\u000207HÖ\u0081\u0004J\n\u00108\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010!R\u0016\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016¨\u00069"}, d2 = {"Lcom/stockbit/dto/eipo/EIpoDTO;", "", "companyName", "", EipoEntryPoint.EXTRA_EMITEN_CODE, "companyLogo", FirebaseAnalytics.Param.PRICE, "stage", "stageDisplay", "stageStartDate", "stageEndDate", "stageDateDisplay", NotificationCompat.CATEGORY_STATUS, "statusDisplay", "isWarrant", "", "isSharia", "ipoStartDate", "ipoEndDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "getCompanyName", "()Ljava/lang/String;", "getEmitenCode", "getCompanyLogo", "getPrice", "getStage", "getStageDisplay", "getStageStartDate", "getStageEndDate", "getStageDateDisplay", "getStatus", "getStatusDisplay", "()Z", "getIpoStartDate", "getIpoEndDate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EIpoDTO {

    @SerializedName("company_logo")
    @Expose
    private final String companyLogo;

    @SerializedName("company_name")
    @Expose
    private final String companyName;

    @SerializedName("emiten_code")
    @Expose
    private final String emitenCode;

    @SerializedName("ipo_end_date")
    @Expose
    private final String ipoEndDate;

    @SerializedName("ipo_start_date")
    @Expose
    private final String ipoStartDate;

    @SerializedName("is_sharia")
    @Expose
    private final boolean isSharia;

    @SerializedName("is_warrant")
    @Expose
    private final boolean isWarrant;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    @Expose
    private final String price;

    @SerializedName("stage")
    @Expose
    private final String stage;

    @SerializedName("stage_date_display")
    @Expose
    private final String stageDateDisplay;

    @SerializedName("stage_display")
    @Expose
    private final String stageDisplay;

    @SerializedName("stage_end_date")
    @Expose
    private final String stageEndDate;

    @SerializedName("stage_start_date")
    @Expose
    private final String stageStartDate;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Expose
    private final String status;

    @SerializedName("status_display")
    @Expose
    private final String statusDisplay;

    public EIpoDTO() {
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
        String r14 = null;
        String r15 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, 32767, null);
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
        return this.ipoEndDate;
    }

    public final String e() {
        return this.ipoStartDate;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof EIpoDTO) == true) goto L8;
        return false;
    L8:
        EIpoDTO r52 = (EIpoDTO) r5;
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
        if (this.isWarrant == r52.isWarrant) goto L45;
        return false;
    L45:
        if (this.isSharia == r52.isSharia) goto L48;
        return false;
    L48:
        if (p.g(this.ipoStartDate, r52.ipoStartDate) == true) goto L51;
        return false;
    L51:
        if (p.g(this.ipoEndDate, r52.ipoEndDate) == true) goto L53;
        return false;
    L53:
        return true;
    }

    public final String f() {
        return this.price;
    }

    public final String g() {
        return this.stage;
    }

    public final String h() {
        return this.stageDateDisplay;
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
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (((((r012 + r218) * 31) + Boolean.hashCode(this.isWarrant)) * 31) + Boolean.hashCode(this.isSharia)) * 31;
        String r219 = this.ipoStartDate;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.ipoEndDate;
        if (r221 == null) goto L51;
        r1 = r221.hashCode();
    L51:
        return r014 + r1;
    L45:
        r220 = r219.hashCode();
        goto L46
    L41:
        r218 = r217.hashCode();
        goto L42
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
        return this.stageDisplay;
    }

    public final String j() {
        return this.stageEndDate;
    }

    public final String k() {
        return this.stageStartDate;
    }

    public final String l() {
        return this.status;
    }

    public final String m() {
        return this.statusDisplay;
    }

    public final boolean n() {
        return this.isSharia;
    }

    public final boolean o() {
        return this.isWarrant;
    }

    public String toString() {
        return "EIpoDTO(companyName=" + this.companyName + ", emitenCode=" + this.emitenCode + ", companyLogo=" + this.companyLogo + ", price=" + this.price + ", stage=" + this.stage + ", stageDisplay=" + this.stageDisplay + ", stageStartDate=" + this.stageStartDate + ", stageEndDate=" + this.stageEndDate + ", stageDateDisplay=" + this.stageDateDisplay + ", status=" + this.status + ", statusDisplay=" + this.statusDisplay + ", isWarrant=" + this.isWarrant + ", isSharia=" + this.isSharia + ", ipoStartDate=" + this.ipoStartDate + ", ipoEndDate=" + this.ipoEndDate + ")";
    }

    public EIpoDTO(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, boolean r13, boolean r14, String r15, String r16) {
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
        this.isWarrant = r13;
        this.isSharia = r14;
        this.ipoStartDate = r15;
        this.ipoEndDate = r16;
    }

    public /* synthetic */ EIpoDTO(String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, boolean r28, boolean r29, String r30, String r31, int r32, i r33) {
        if ((r32 & 1) == 0) goto L5;
        String r1 = null;
    L7:
        if ((r32 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r32 & 4) == 0) goto L13;
        String r4 = null;
    L15:
        if ((r32 & 8) == 0) goto L17;
        String r5 = null;
    L19:
        if ((r32 & 16) == 0) goto L21;
        String r6 = null;
    L23:
        if ((r32 & 32) == 0) goto L25;
        String r7 = null;
    L27:
        if ((r32 & 64) == 0) goto L29;
        String r8 = null;
    L31:
        if ((r32 & 128) == 0) goto L33;
        String r9 = null;
    L35:
        if ((r32 & 256) == 0) goto L37;
        String r10 = null;
    L39:
        if ((r32 & 512) == 0) goto L41;
        String r11 = null;
    L43:
        if ((r32 & 1024) == 0) goto L45;
        String r12 = null;
    L46:
        boolean r14 = false;
        if ((r32 & 2048) == 0) goto L49;
        boolean r13 = false;
    L51:
        if ((r32 & 4096) != 0) goto L55;
        r14 = r29;
    L55:
        if ((r32 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = null;
    L59:
        if ((r32 & 16384) == 0) goto L62;
        String r322 = null;
    L63:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r322);
        return;
    L62:
        r322 = r31;
        goto L63
    L57:
        r15 = r30;
        goto L59
    L49:
        r13 = r28;
        goto L51
    L45:
        r12 = r27;
        goto L46
    L41:
        r11 = r26;
        goto L43
    L37:
        r10 = r25;
        goto L39
    L33:
        r9 = r24;
        goto L35
    L29:
        r8 = r23;
        goto L31
    L25:
        r7 = r22;
        goto L27
    L21:
        r6 = r21;
        goto L23
    L17:
        r5 = r20;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r1 = r17;
        goto L7
    }
}
