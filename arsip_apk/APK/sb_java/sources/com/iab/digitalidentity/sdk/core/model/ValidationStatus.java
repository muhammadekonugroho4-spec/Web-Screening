package com.iab.digitalidentity.sdk.core.model;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b>\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003¢\u0006\u0002\u0010\u0016J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003JÇ\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u0003HÆ\u0001J\u0013\u0010?\u001a\u00020\u00032\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020DHÖ\u0001R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018¨\u0006E"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/ValidationStatus;", "", "ndr", "", "str", "slls", "ebc", "enc", "ecf", "hd", "hd2", "hd3", "hd4", "hd5", "rd", "rd2", "rd3", "ed", "ed2", "ac", "mg", "dd", "(ZZZZZZZZZZZZZZZZZZZ)V", "getAc", "()Z", "getDd", "getEbc", "getEcf", "getEd", "getEd2", "getEnc", "getHd", "getHd2", "getHd3", "getHd4", "getHd5", "getMg", "getNdr", "getRd", "getRd2", "getRd3", "getSlls", "getStr", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ValidationStatus {

    @SerializedName("AC")
    private final boolean ac;

    @SerializedName("DD")
    private final boolean dd;

    @SerializedName("EBC")
    private final boolean ebc;

    @SerializedName("ECF")
    private final boolean ecf;

    @SerializedName("ED1")
    private final boolean ed;

    @SerializedName("ED2")
    private final boolean ed2;

    @SerializedName("ENC")
    private final boolean enc;

    @SerializedName("HD")
    private final boolean hd;

    @SerializedName("HD2")
    private final boolean hd2;

    @SerializedName("HD3")
    private final boolean hd3;

    @SerializedName("HD4")
    private final boolean hd4;

    @SerializedName("HD5")
    private final boolean hd5;

    @SerializedName("MG")
    private final boolean mg;

    @SerializedName("NDR")
    private final boolean ndr;

    @SerializedName("RD")
    private final boolean rd;

    @SerializedName("RD2")
    private final boolean rd2;

    @SerializedName("RD3")
    private final boolean rd3;

    @SerializedName("SLLS")
    private final boolean slls;

    @SerializedName("STR")
    private final boolean str;

    public ValidationStatus() {
        boolean r1 = false;
        boolean r2 = false;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;
        boolean r6 = false;
        boolean r7 = false;
        boolean r8 = false;
        boolean r9 = false;
        boolean r10 = false;
        boolean r11 = false;
        boolean r12 = false;
        boolean r13 = false;
        boolean r14 = false;
        boolean r15 = false;
        boolean r16 = false;
        boolean r17 = false;
        boolean r18 = false;
        boolean r19 = false;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, 524287, null);
    }

    public static /* synthetic */ ValidationStatus copy$default(ValidationStatus r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36, int r37, Object r38) {
        if ((r37 & 1) == 0) goto L5;
        boolean r2 = r17.ndr;
    L7:
        if ((r37 & 2) == 0) goto L9;
        boolean r3 = r17.str;
    L11:
        if ((r37 & 4) == 0) goto L13;
        boolean r4 = r17.slls;
    L15:
        if ((r37 & 8) == 0) goto L17;
        boolean r5 = r17.ebc;
    L19:
        if ((r37 & 16) == 0) goto L21;
        boolean r6 = r17.enc;
    L23:
        if ((r37 & 32) == 0) goto L25;
        boolean r7 = r17.ecf;
    L27:
        if ((r37 & 64) == 0) goto L29;
        boolean r8 = r17.hd;
    L31:
        if ((r37 & 128) == 0) goto L33;
        boolean r9 = r17.hd2;
    L35:
        if ((r37 & 256) == 0) goto L37;
        boolean r10 = r17.hd3;
    L39:
        if ((r37 & 512) == 0) goto L41;
        boolean r11 = r17.hd4;
    L43:
        if ((r37 & 1024) == 0) goto L45;
        boolean r12 = r17.hd5;
    L47:
        if ((r37 & 2048) == 0) goto L49;
        boolean r13 = r17.rd;
    L51:
        if ((r37 & 4096) == 0) goto L53;
        boolean r14 = r17.rd2;
    L55:
        if ((r37 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        boolean r15 = r17.rd3;
    L58:
        boolean r182 = r2;
        if ((r37 & 16384) == 0) goto L61;
        boolean r210 = r17.ed;
    L63:
        if ((r37 & 32768) == 0) goto L65;
        boolean r1 = r17.ed2;
    L66:
        boolean r192 = r1;
        if ((r37 & 65536) == 0) goto L69;
        boolean r16 = r17.ac;
    L70:
        boolean r202 = r16;
        if ((r37 & 131072) == 0) goto L73;
        boolean r110 = r17.mg;
    L75:
        if ((r37 & 262144) == 0) goto L78;
        boolean r212 = r110;
        boolean r362 = r212;
        boolean r372 = r17.dd;
    L80:
        return r17.copy(r182, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r210, r192, r202, r362, r372);
    L78:
        r372 = r36;
        r362 = r110;
        goto L80
    L73:
        r110 = r35;
        goto L75
    L69:
        r16 = r34;
        goto L70
    L65:
        r1 = r33;
        goto L66
    L61:
        r210 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L58
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    public final boolean component1() {
        return this.ndr;
    }

    public final boolean component10() {
        return this.hd4;
    }

    public final boolean component11() {
        return this.hd5;
    }

    public final boolean component12() {
        return this.rd;
    }

    public final boolean component13() {
        return this.rd2;
    }

    public final boolean component14() {
        return this.rd3;
    }

    public final boolean component15() {
        return this.ed;
    }

    public final boolean component16() {
        return this.ed2;
    }

    public final boolean component17() {
        return this.ac;
    }

    public final boolean component18() {
        return this.mg;
    }

    public final boolean component19() {
        return this.dd;
    }

    public final boolean component2() {
        return this.str;
    }

    public final boolean component3() {
        return this.slls;
    }

    public final boolean component4() {
        return this.ebc;
    }

    public final boolean component5() {
        return this.enc;
    }

    public final boolean component6() {
        return this.ecf;
    }

    public final boolean component7() {
        return this.hd;
    }

    public final boolean component8() {
        return this.hd2;
    }

    public final boolean component9() {
        return this.hd3;
    }

    public final ValidationStatus copy(boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39) {
        return new ValidationStatus(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ValidationStatus) == true) goto L8;
        return false;
    L8:
        ValidationStatus r52 = (ValidationStatus) r5;
        if (this.ndr == r52.ndr) goto L12;
        return false;
    L12:
        if (this.str == r52.str) goto L15;
        return false;
    L15:
        if (this.slls == r52.slls) goto L18;
        return false;
    L18:
        if (this.ebc == r52.ebc) goto L21;
        return false;
    L21:
        if (this.enc == r52.enc) goto L24;
        return false;
    L24:
        if (this.ecf == r52.ecf) goto L27;
        return false;
    L27:
        if (this.hd == r52.hd) goto L30;
        return false;
    L30:
        if (this.hd2 == r52.hd2) goto L33;
        return false;
    L33:
        if (this.hd3 == r52.hd3) goto L36;
        return false;
    L36:
        if (this.hd4 == r52.hd4) goto L39;
        return false;
    L39:
        if (this.hd5 == r52.hd5) goto L42;
        return false;
    L42:
        if (this.rd == r52.rd) goto L45;
        return false;
    L45:
        if (this.rd2 == r52.rd2) goto L48;
        return false;
    L48:
        if (this.rd3 == r52.rd3) goto L51;
        return false;
    L51:
        if (this.ed == r52.ed) goto L54;
        return false;
    L54:
        if (this.ed2 == r52.ed2) goto L57;
        return false;
    L57:
        if (this.ac == r52.ac) goto L60;
        return false;
    L60:
        if (this.mg == r52.mg) goto L63;
        return false;
    L63:
        if (this.dd == r52.dd) goto L65;
        return false;
    L65:
        return true;
    }

    public final boolean getAc() {
        return this.ac;
    }

    public final boolean getDd() {
        return this.dd;
    }

    public final boolean getEbc() {
        return this.ebc;
    }

    public final boolean getEcf() {
        return this.ecf;
    }

    public final boolean getEd() {
        return this.ed;
    }

    public final boolean getEd2() {
        return this.ed2;
    }

    public final boolean getEnc() {
        return this.enc;
    }

    public final boolean getHd() {
        return this.hd;
    }

    public final boolean getHd2() {
        return this.hd2;
    }

    public final boolean getHd3() {
        return this.hd3;
    }

    public final boolean getHd4() {
        return this.hd4;
    }

    public final boolean getHd5() {
        return this.hd5;
    }

    public final boolean getMg() {
        return this.mg;
    }

    public final boolean getNdr() {
        return this.ndr;
    }

    public final boolean getRd() {
        return this.rd;
    }

    public final boolean getRd2() {
        return this.rd2;
    }

    public final boolean getRd3() {
        return this.rd3;
    }

    public final boolean getSlls() {
        return this.slls;
    }

    public final boolean getStr() {
        return this.str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public int hashCode() {
        boolean r02 = this.ndr;
        int r1 = 1;
        ?? r03 = r02;
        if (r02 == false) goto L5;
        r03 = 1;
    L5:
        int r04 = r03 * 31;
        ?? r2 = this.str;
        int r22 = r2;
        if (r2 == 0) goto L8;
        r22 = 1;
    L8:
        int r05 = (r04 + r22) * 31;
        ?? r23 = this.slls;
        int r24 = r23;
        if (r23 == 0) goto L11;
        r24 = 1;
    L11:
        int r06 = (r05 + r24) * 31;
        ?? r25 = this.ebc;
        int r26 = r25;
        if (r25 == 0) goto L14;
        r26 = 1;
    L14:
        int r07 = (r06 + r26) * 31;
        ?? r27 = this.enc;
        int r28 = r27;
        if (r27 == 0) goto L17;
        r28 = 1;
    L17:
        int r08 = (r07 + r28) * 31;
        ?? r29 = this.ecf;
        int r210 = r29;
        if (r29 == 0) goto L20;
        r210 = 1;
    L20:
        int r09 = (r08 + r210) * 31;
        ?? r211 = this.hd;
        int r212 = r211;
        if (r211 == 0) goto L23;
        r212 = 1;
    L23:
        int r010 = (r09 + r212) * 31;
        ?? r213 = this.hd2;
        int r214 = r213;
        if (r213 == 0) goto L26;
        r214 = 1;
    L26:
        int r011 = (r010 + r214) * 31;
        ?? r215 = this.hd3;
        int r216 = r215;
        if (r215 == 0) goto L29;
        r216 = 1;
    L29:
        int r012 = (r011 + r216) * 31;
        ?? r217 = this.hd4;
        int r218 = r217;
        if (r217 == 0) goto L32;
        r218 = 1;
    L32:
        int r013 = (r012 + r218) * 31;
        ?? r219 = this.hd5;
        int r220 = r219;
        if (r219 == 0) goto L35;
        r220 = 1;
    L35:
        int r014 = (r013 + r220) * 31;
        ?? r221 = this.rd;
        int r222 = r221;
        if (r221 == 0) goto L38;
        r222 = 1;
    L38:
        int r015 = (r014 + r222) * 31;
        ?? r223 = this.rd2;
        int r224 = r223;
        if (r223 == 0) goto L41;
        r224 = 1;
    L41:
        int r016 = (r015 + r224) * 31;
        ?? r225 = this.rd3;
        int r226 = r225;
        if (r225 == 0) goto L44;
        r226 = 1;
    L44:
        int r017 = (r016 + r226) * 31;
        ?? r227 = this.ed;
        int r228 = r227;
        if (r227 == 0) goto L47;
        r228 = 1;
    L47:
        int r018 = (r017 + r228) * 31;
        ?? r229 = this.ed2;
        int r230 = r229;
        if (r229 == 0) goto L50;
        r230 = 1;
    L50:
        int r019 = (r018 + r230) * 31;
        ?? r231 = this.ac;
        int r232 = r231;
        if (r231 == 0) goto L53;
        r232 = 1;
    L53:
        int r020 = (r019 + r232) * 31;
        ?? r233 = this.mg;
        int r234 = r233;
        if (r233 == 0) goto L56;
        r234 = 1;
    L56:
        int r021 = (r020 + r234) * 31;
        boolean r235 = this.dd;
        if (r235 == true) goto L61;
        r1 = r235 ? 1 : 0;
    L61:
        return r021 + r1;
    }

    public String toString() {
        return "ValidationStatus(ndr=" + this.ndr + ", str=" + this.str + ", slls=" + this.slls + ", ebc=" + this.ebc + ", enc=" + this.enc + ", ecf=" + this.ecf + ", hd=" + this.hd + ", hd2=" + this.hd2 + ", hd3=" + this.hd3 + ", hd4=" + this.hd4 + ", hd5=" + this.hd5 + ", rd=" + this.rd + ", rd2=" + this.rd2 + ", rd3=" + this.rd3 + ", ed=" + this.ed + ", ed2=" + this.ed2 + ", ac=" + this.ac + ", mg=" + this.mg + ", dd=" + this.dd + ")";
    }

    public ValidationStatus(boolean r1, boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19) {
        this.ndr = r1;
        this.str = r2;
        this.slls = r3;
        this.ebc = r4;
        this.enc = r5;
        this.ecf = r6;
        this.hd = r7;
        this.hd2 = r8;
        this.hd3 = r9;
        this.hd4 = r10;
        this.hd5 = r11;
        this.rd = r12;
        this.rd2 = r13;
        this.rd3 = r14;
        this.ed = r15;
        this.ed2 = r16;
        this.ac = r17;
        this.mg = r18;
        this.dd = r19;
    }

    public /* synthetic */ ValidationStatus(boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39, int r40, i r41) {
        if ((r40 & 1) == 0) goto L5;
        boolean r1 = true;
    L7:
        if ((r40 & 2) == 0) goto L9;
        boolean r3 = true;
    L11:
        if ((r40 & 4) == 0) goto L13;
        boolean r4 = true;
    L15:
        if ((r40 & 8) == 0) goto L17;
        boolean r5 = true;
    L19:
        if ((r40 & 16) == 0) goto L21;
        boolean r6 = true;
    L23:
        if ((r40 & 32) == 0) goto L25;
        boolean r7 = true;
    L27:
        if ((r40 & 64) == 0) goto L29;
        boolean r8 = true;
    L31:
        if ((r40 & 128) == 0) goto L33;
        boolean r9 = true;
    L35:
        if ((r40 & 256) == 0) goto L37;
        boolean r10 = true;
    L39:
        if ((r40 & 512) == 0) goto L41;
        boolean r11 = true;
    L43:
        if ((r40 & 1024) == 0) goto L45;
        boolean r12 = true;
    L47:
        if ((r40 & 2048) == 0) goto L49;
        boolean r13 = true;
    L51:
        if ((r40 & 4096) == 0) goto L53;
        boolean r14 = true;
    L55:
        if ((r40 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        boolean r15 = true;
    L59:
        if ((r40 & 16384) == 0) goto L61;
        boolean r2 = true;
    L63:
        if ((r40 & 32768) == 0) goto L65;
        boolean r16 = true;
    L67:
        if ((r40 & 65536) == 0) goto L69;
        boolean r17 = true;
    L71:
        if ((r40 & 131072) == 0) goto L73;
        boolean r18 = true;
    L75:
        if ((r40 & 262144) == 0) goto L78;
        boolean r402 = true;
    L79:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r17, r18, r402);
        return;
    L78:
        r402 = r39;
        goto L79
    L73:
        r18 = r38;
        goto L75
    L69:
        r17 = r37;
        goto L71
    L65:
        r16 = r36;
        goto L67
    L61:
        r2 = r35;
        goto L63
    L57:
        r15 = r34;
        goto L59
    L53:
        r14 = r33;
        goto L55
    L49:
        r13 = r32;
        goto L51
    L45:
        r12 = r31;
        goto L47
    L41:
        r11 = r30;
        goto L43
    L37:
        r10 = r29;
        goto L39
    L33:
        r9 = r28;
        goto L35
    L29:
        r8 = r27;
        goto L31
    L25:
        r7 = r26;
        goto L27
    L21:
        r6 = r25;
        goto L23
    L17:
        r5 = r24;
        goto L19
    L13:
        r4 = r23;
        goto L15
    L9:
        r3 = r22;
        goto L11
    L5:
        r1 = r21;
        goto L7
    }
}
