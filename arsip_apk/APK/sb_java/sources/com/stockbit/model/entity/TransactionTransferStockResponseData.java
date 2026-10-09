package com.stockbit.model.entity;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\bD\b\u0086\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010<J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010<JÚ\u0001\u0010R\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u0010SJ\u0014\u0010T\u001a\u00020\u00142\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010V\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010W\u001a\u00020\u0003HÖ\u0081\u0004R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001bR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0019\"\u0004\b(\u0010\u001bR\"\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b)\u0010!\"\u0004\b*\u0010#R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010\u001bR\"\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b-\u0010!\"\u0004\b.\u0010#R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u0010\u001bR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b1\u0010!\"\u0004\b2\u0010#R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0019\"\u0004\b4\u0010\u001bR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b5\u0010!\"\u0004\b6\u0010#R \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0019\"\u0004\b8\u0010\u001bR \u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0019\"\u0004\b:\u0010\u001bR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010?\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010?\u001a\u0004\b\u0015\u0010<\"\u0004\b@\u0010>¨\u0006X"}, d2 = {"Lcom/stockbit/model/entity/TransactionTransferStockResponseData;", "", Constants.KEY_ID, "", "securityName", "securityCode", "securityFee", "", Constants.KEY_DATE, "statusText", "statusState", "status1Text", "status1State", "status2Text", "status2State", "status3Text", "status3State", "notes", "buttonText", "buttonShow", "", "isHistory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getSecurityName", "setSecurityName", "getSecurityCode", "setSecurityCode", "getSecurityFee", "()Ljava/lang/Integer;", "setSecurityFee", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDate", "setDate", "getStatusText", "setStatusText", "getStatusState", "setStatusState", "getStatus1Text", "setStatus1Text", "getStatus1State", "setStatus1State", "getStatus2Text", "setStatus2Text", "getStatus2State", "setStatus2State", "getStatus3Text", "setStatus3Text", "getStatus3State", "setStatus3State", "getNotes", "setNotes", "getButtonText", "setButtonText", "getButtonShow", "()Ljava/lang/Boolean;", "setButtonShow", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setHistory", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/stockbit/model/entity/TransactionTransferStockResponseData;", "equals", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransactionTransferStockResponseData {

    @SerializedName("button_show")
    private Boolean buttonShow;

    @SerializedName("button_text")
    private String buttonText;

    @SerializedName(Constants.KEY_DATE)
    private String date;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private String f122042id;

    @SerializedName("is_history")
    private Boolean isHistory;

    @SerializedName("notes")
    private String notes;

    @SerializedName("security_code")
    private String securityCode;

    @SerializedName("security_base_fee")
    private Integer securityFee;

    @SerializedName("security_name")
    private String securityName;

    @SerializedName("status_1_state")
    private Integer status1State;

    @SerializedName("status_1_text")
    private String status1Text;

    @SerializedName("status_2_state")
    private Integer status2State;

    @SerializedName("status_2_text")
    private String status2Text;

    @SerializedName("status_3_state")
    private Integer status3State;

    @SerializedName("status_3_text")
    private String status3Text;

    @SerializedName("status_state")
    private Integer statusState;

    @SerializedName("status_text")
    private String statusText;

    public TransactionTransferStockResponseData() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        Integer r4 = null;
        String r5 = null;
        String r6 = null;
        Integer r7 = null;
        String r8 = null;
        Integer r9 = null;
        String r10 = null;
        Integer r11 = null;
        String r12 = null;
        Integer r13 = null;
        String r14 = null;
        String r15 = null;
        Boolean r16 = null;
        Boolean r17 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, 131071, null);
    }

    public final Boolean a() {
        return this.buttonShow;
    }

    public final String b() {
        return this.buttonText;
    }

    public final String c() {
        return this.date;
    }

    public final String d() {
        return this.f122042id;
    }

    public final String e() {
        return this.notes;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TransactionTransferStockResponseData) == true) goto L8;
        return false;
    L8:
        TransactionTransferStockResponseData r52 = (TransactionTransferStockResponseData) r5;
        if (p.g(this.f122042id, r52.f122042id) == true) goto L12;
        return false;
    L12:
        if (p.g(this.securityName, r52.securityName) == true) goto L15;
        return false;
    L15:
        if (p.g(this.securityCode, r52.securityCode) == true) goto L18;
        return false;
    L18:
        if (p.g(this.securityFee, r52.securityFee) == true) goto L21;
        return false;
    L21:
        if (p.g(this.date, r52.date) == true) goto L24;
        return false;
    L24:
        if (p.g(this.statusText, r52.statusText) == true) goto L27;
        return false;
    L27:
        if (p.g(this.statusState, r52.statusState) == true) goto L30;
        return false;
    L30:
        if (p.g(this.status1Text, r52.status1Text) == true) goto L33;
        return false;
    L33:
        if (p.g(this.status1State, r52.status1State) == true) goto L36;
        return false;
    L36:
        if (p.g(this.status2Text, r52.status2Text) == true) goto L39;
        return false;
    L39:
        if (p.g(this.status2State, r52.status2State) == true) goto L42;
        return false;
    L42:
        if (p.g(this.status3Text, r52.status3Text) == true) goto L45;
        return false;
    L45:
        if (p.g(this.status3State, r52.status3State) == true) goto L48;
        return false;
    L48:
        if (p.g(this.notes, r52.notes) == true) goto L51;
        return false;
    L51:
        if (p.g(this.buttonText, r52.buttonText) == true) goto L54;
        return false;
    L54:
        if (p.g(this.buttonShow, r52.buttonShow) == true) goto L57;
        return false;
    L57:
        if (p.g(this.isHistory, r52.isHistory) == true) goto L59;
        return false;
    L59:
        return true;
    }

    public final String f() {
        return this.securityCode;
    }

    public final Integer g() {
        return this.securityFee;
    }

    public final String h() {
        return this.securityName;
    }

    public int hashCode() {
        String r02 = this.f122042id;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.securityName;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.securityCode;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Integer r25 = this.securityFee;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.date;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.statusText;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        Integer r211 = this.statusState;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.status1Text;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        Integer r215 = this.status1State;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.status2Text;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        Integer r219 = this.status2State;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.status3Text;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        Integer r223 = this.status3State;
        if (r223 != null) goto L53;
        int r224 = 0;
    L54:
        int r016 = (r015 + r224) * 31;
        String r225 = this.notes;
        if (r225 != null) goto L57;
        int r226 = 0;
    L58:
        int r017 = (r016 + r226) * 31;
        String r227 = this.buttonText;
        if (r227 != null) goto L61;
        int r228 = 0;
    L62:
        int r018 = (r017 + r228) * 31;
        Boolean r229 = this.buttonShow;
        if (r229 != null) goto L65;
        int r230 = 0;
    L66:
        int r019 = (r018 + r230) * 31;
        Boolean r231 = this.isHistory;
        if (r231 == null) goto L71;
        r1 = r231.hashCode();
    L71:
        return r019 + r1;
    L65:
        r230 = r229.hashCode();
        goto L66
    L61:
        r228 = r227.hashCode();
        goto L62
    L57:
        r226 = r225.hashCode();
        goto L58
    L53:
        r224 = r223.hashCode();
        goto L54
    L49:
        r222 = r221.hashCode();
        goto L50
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

    public final Integer i() {
        return this.status1State;
    }

    public final String j() {
        return this.status1Text;
    }

    public final Integer k() {
        return this.status2State;
    }

    public final String l() {
        return this.status2Text;
    }

    public final Integer m() {
        return this.status3State;
    }

    public final String n() {
        return this.status3Text;
    }

    public final Integer o() {
        return this.statusState;
    }

    public final String p() {
        return this.statusText;
    }

    public String toString() {
        return "TransactionTransferStockResponseData(id=" + this.f122042id + ", securityName=" + this.securityName + ", securityCode=" + this.securityCode + ", securityFee=" + this.securityFee + ", date=" + this.date + ", statusText=" + this.statusText + ", statusState=" + this.statusState + ", status1Text=" + this.status1Text + ", status1State=" + this.status1State + ", status2Text=" + this.status2Text + ", status2State=" + this.status2State + ", status3Text=" + this.status3Text + ", status3State=" + this.status3State + ", notes=" + this.notes + ", buttonText=" + this.buttonText + ", buttonShow=" + this.buttonShow + ", isHistory=" + this.isHistory + ')';
    }

    public TransactionTransferStockResponseData(String r1, String r2, String r3, Integer r4, String r5, String r6, Integer r7, String r8, Integer r9, String r10, Integer r11, String r12, Integer r13, String r14, String r15, Boolean r16, Boolean r17) {
        this.f122042id = r1;
        this.securityName = r2;
        this.securityCode = r3;
        this.securityFee = r4;
        this.date = r5;
        this.statusText = r6;
        this.statusState = r7;
        this.status1Text = r8;
        this.status1State = r9;
        this.status2Text = r10;
        this.status2State = r11;
        this.status3Text = r12;
        this.status3State = r13;
        this.notes = r14;
        this.buttonText = r15;
        this.buttonShow = r16;
        this.isHistory = r17;
    }

    public /* synthetic */ TransactionTransferStockResponseData(String r19, String r20, String r21, Integer r22, String r23, String r24, Integer r25, String r26, Integer r27, String r28, Integer r29, String r30, Integer r31, String r32, String r33, Boolean r34, Boolean r35, int r36, i r37) {
        if ((r36 & 1) == 0) goto L5;
        String r1 = null;
    L7:
        if ((r36 & 2) == 0) goto L9;
        String r3 = null;
    L11:
        if ((r36 & 4) == 0) goto L13;
        String r4 = null;
    L15:
        if ((r36 & 8) == 0) goto L17;
        Integer r5 = null;
    L19:
        if ((r36 & 16) == 0) goto L21;
        String r6 = null;
    L23:
        if ((r36 & 32) == 0) goto L25;
        String r7 = null;
    L27:
        if ((r36 & 64) == 0) goto L29;
        Integer r8 = null;
    L31:
        if ((r36 & 128) == 0) goto L33;
        String r9 = null;
    L35:
        if ((r36 & 256) == 0) goto L37;
        Integer r10 = null;
    L39:
        if ((r36 & 512) == 0) goto L41;
        String r11 = null;
    L43:
        if ((r36 & 1024) == 0) goto L45;
        Integer r12 = null;
    L47:
        if ((r36 & 2048) == 0) goto L49;
        String r13 = null;
    L51:
        if ((r36 & 4096) == 0) goto L53;
        Integer r14 = null;
    L55:
        if ((r36 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = null;
    L59:
        if ((r36 & 16384) == 0) goto L61;
        String r2 = null;
    L63:
        if ((r36 & 32768) == 0) goto L65;
        Boolean r16 = null;
    L67:
        if ((r36 & 65536) == 0) goto L70;
        Boolean r362 = Boolean.FALSE;
    L71:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r362);
        return;
    L70:
        r362 = r35;
        goto L71
    L65:
        r16 = r34;
        goto L67
    L61:
        r2 = r33;
        goto L63
    L57:
        r15 = r32;
        goto L59
    L53:
        r14 = r31;
        goto L55
    L49:
        r13 = r30;
        goto L51
    L45:
        r12 = r29;
        goto L47
    L41:
        r11 = r28;
        goto L43
    L37:
        r10 = r27;
        goto L39
    L33:
        r9 = r26;
        goto L35
    L29:
        r8 = r25;
        goto L31
    L25:
        r7 = r24;
        goto L27
    L21:
        r6 = r23;
        goto L23
    L17:
        r5 = r22;
        goto L19
    L13:
        r4 = r21;
        goto L15
    L9:
        r3 = r20;
        goto L11
    L5:
        r1 = r19;
        goto L7
    }
}
