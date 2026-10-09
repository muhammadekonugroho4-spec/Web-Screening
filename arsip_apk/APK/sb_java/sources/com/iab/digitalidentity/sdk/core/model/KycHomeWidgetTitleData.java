package com.iab.digitalidentity.sdk.core.model;

import a.AbstractC2049c;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003Jc\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/KycHomeWidgetTitleData;", "", "titleTransfer", "", "titleP2p", "titleGoPayPlus", "titleCashLoan", "titleCicil", "titleTokoCore", "titleGps", "titlePassport", "titleJago", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitleCashLoan", "()Ljava/lang/String;", "getTitleCicil", "getTitleGoPayPlus", "getTitleGps", "getTitleJago", "getTitleP2p", "getTitlePassport", "getTitleTokoCore", "getTitleTransfer", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KycHomeWidgetTitleData {

    @SerializedName(KycHomeConfigsKt.ENTRY_POINT_CASHLOAN)
    private final String titleCashLoan;

    @SerializedName(KycHomeConfigsKt.ENTRY_POINT_CICIL)
    private final String titleCicil;

    @SerializedName(KycHomeConfigsKt.ENTRY_POINT_GOPAY)
    private final String titleGoPayPlus;

    @SerializedName(KycHomeConfigsKt.ENTRY_POINT_GPS)
    private final String titleGps;

    @SerializedName(KycHomeConfigsKt.ENTRY_POINT_JAGO)
    private final String titleJago;

    @SerializedName(KycHomeConfigsKt.ENTRY_POINT_TRANSFER)
    private final String titleP2p;

    @SerializedName(KycHomeConfigsKt.ENTRY_POINT_PASSPORT)
    private final String titlePassport;

    @SerializedName(KycHomeConfigsKt.ENTRY_POINT_TOKO_CORE)
    private final String titleTokoCore;

    @SerializedName(KycHomeConfigsKt.ENTRY_POINT_WITHDRAW)
    private final String titleTransfer;

    public KycHomeWidgetTitleData() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
    }

    public static /* synthetic */ KycHomeWidgetTitleData copy$default(KycHomeWidgetTitleData r02, String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r02.titleTransfer;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r02.titleP2p;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r02.titleGoPayPlus;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r02.titleCashLoan;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r02.titleCicil;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r02.titleTokoCore;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r02.titleGps;
    L24:
        if ((r10 & 128) == 0) goto L27;
        r8 = r02.titlePassport;
    L27:
        if ((r10 & 256) == 0) goto L29;
        r9 = r02.titleJago;
    L29:
        String r102 = r8;
        String r112 = r9;
        String r82 = r6;
        String r92 = r7;
        String r62 = r4;
        String r72 = r5;
        String r52 = r3;
        String r32 = r1;
        return r02.copy(r32, r2, r52, r62, r72, r82, r92, r102, r112);
    }

    public final String component1() {
        return this.titleTransfer;
    }

    public final String component2() {
        return this.titleP2p;
    }

    public final String component3() {
        return this.titleGoPayPlus;
    }

    public final String component4() {
        return this.titleCashLoan;
    }

    public final String component5() {
        return this.titleCicil;
    }

    public final String component6() {
        return this.titleTokoCore;
    }

    public final String component7() {
        return this.titleGps;
    }

    public final String component8() {
        return this.titlePassport;
    }

    public final String component9() {
        return this.titleJago;
    }

    public final KycHomeWidgetTitleData copy(String r12, String r13, String r14, String r15, String r16, String r17, String r18, String r19, String r20) {
        p.l(r12, "titleTransfer");
        p.l(r13, "titleP2p");
        p.l(r14, "titleGoPayPlus");
        p.l(r15, "titleCashLoan");
        p.l(r16, "titleCicil");
        p.l(r17, "titleTokoCore");
        p.l(r18, "titleGps");
        p.l(r19, "titlePassport");
        p.l(r20, "titleJago");
        return new KycHomeWidgetTitleData(r12, r13, r14, r15, r16, r17, r18, r19, r20);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof KycHomeWidgetTitleData) == true) goto L8;
        return false;
    L8:
        KycHomeWidgetTitleData r52 = (KycHomeWidgetTitleData) r5;
        if (p.g(this.titleTransfer, r52.titleTransfer) == true) goto L12;
        return false;
    L12:
        if (p.g(this.titleP2p, r52.titleP2p) == true) goto L15;
        return false;
    L15:
        if (p.g(this.titleGoPayPlus, r52.titleGoPayPlus) == true) goto L18;
        return false;
    L18:
        if (p.g(this.titleCashLoan, r52.titleCashLoan) == true) goto L21;
        return false;
    L21:
        if (p.g(this.titleCicil, r52.titleCicil) == true) goto L24;
        return false;
    L24:
        if (p.g(this.titleTokoCore, r52.titleTokoCore) == true) goto L27;
        return false;
    L27:
        if (p.g(this.titleGps, r52.titleGps) == true) goto L30;
        return false;
    L30:
        if (p.g(this.titlePassport, r52.titlePassport) == true) goto L33;
        return false;
    L33:
        if (p.g(this.titleJago, r52.titleJago) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String getTitleCashLoan() {
        return this.titleCashLoan;
    }

    public final String getTitleCicil() {
        return this.titleCicil;
    }

    public final String getTitleGoPayPlus() {
        return this.titleGoPayPlus;
    }

    public final String getTitleGps() {
        return this.titleGps;
    }

    public final String getTitleJago() {
        return this.titleJago;
    }

    public final String getTitleP2p() {
        return this.titleP2p;
    }

    public final String getTitlePassport() {
        return this.titlePassport;
    }

    public final String getTitleTokoCore() {
        return this.titleTokoCore;
    }

    public final String getTitleTransfer() {
        return this.titleTransfer;
    }

    public int hashCode() {
        int r02 = this.titleTransfer.hashCode() * 31;
        int r03 = AbstractC2049c.a(this.titleP2p, r02, 31);
        int r04 = AbstractC2049c.a(this.titleGoPayPlus, r03, 31);
        int r05 = AbstractC2049c.a(this.titleCashLoan, r04, 31);
        int r06 = AbstractC2049c.a(this.titleCicil, r05, 31);
        int r07 = AbstractC2049c.a(this.titleTokoCore, r06, 31);
        int r08 = AbstractC2049c.a(this.titleGps, r07, 31);
        int r09 = AbstractC2049c.a(this.titlePassport, r08, 31);
        return this.titleJago.hashCode() + r09;
    }

    public String toString() {
        return "KycHomeWidgetTitleData(titleTransfer=" + this.titleTransfer + ", titleP2p=" + this.titleP2p + ", titleGoPayPlus=" + this.titleGoPayPlus + ", titleCashLoan=" + this.titleCashLoan + ", titleCicil=" + this.titleCicil + ", titleTokoCore=" + this.titleTokoCore + ", titleGps=" + this.titleGps + ", titlePassport=" + this.titlePassport + ", titleJago=" + this.titleJago + ")";
    }

    public KycHomeWidgetTitleData(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10) {
        p.l(r2, "titleTransfer");
        p.l(r3, "titleP2p");
        p.l(r4, "titleGoPayPlus");
        p.l(r5, "titleCashLoan");
        p.l(r6, "titleCicil");
        p.l(r7, "titleTokoCore");
        p.l(r8, "titleGps");
        p.l(r9, "titlePassport");
        p.l(r10, "titleJago");
        this.titleTransfer = r2;
        this.titleP2p = r3;
        this.titleGoPayPlus = r4;
        this.titleCashLoan = r5;
        this.titleCicil = r6;
        this.titleTokoCore = r7;
        this.titleGps = r8;
        this.titlePassport = r9;
        this.titleJago = r10;
    }

    public /* synthetic */ KycHomeWidgetTitleData(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, int r11, i r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = "";
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = "";
    L27:
        if ((r11 & 256) == 0) goto L30;
        String r112 = "";
    L29:
        String r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82, r92, r102, r112);
        return;
    L30:
        r112 = r10;
        goto L29
    }
}
