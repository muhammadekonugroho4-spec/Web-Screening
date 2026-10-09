package com.stockbit.dto.cryptoorder;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J±\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00104\u001a\u000205HÖ\u0081\u0004J\n\u00106\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00067"}, d2 = {"Lcom/stockbit/dto/cryptoorder/CryptoOrderItemDTO;", "", Constants.KEY_ID, "", "accNo", "baseAsset", "quoteAsset", "side", "type", FirebaseAnalytics.Param.PRICE, "baseQty", "avgPrice", "filledBaseQty", "filledQuoteQty", "grossQuoteQty", NotificationCompat.CATEGORY_STATUS, "createdAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getAccNo", "getBaseAsset", "getQuoteAsset", "getSide", "getType", "getPrice", "getBaseQty", "getAvgPrice", "getFilledBaseQty", "getFilledQuoteQty", "getGrossQuoteQty", "getStatus", "getCreatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CryptoOrderItemDTO {

    @SerializedName("acc_no")
    private final String accNo;

    @SerializedName("avg_price")
    private final String avgPrice;

    @SerializedName("base_asset")
    private final String baseAsset;

    @SerializedName("base_qty")
    private final String baseQty;

    @SerializedName("created_at")
    private final String createdAt;

    @SerializedName("filled_base_qty")
    private final String filledBaseQty;

    @SerializedName("filled_quote_qty")
    private final String filledQuoteQty;

    @SerializedName("gross_quote_qty")
    private final String grossQuoteQty;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final String f88634id;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final String price;

    @SerializedName("quote_asset")
    private final String quoteAsset;

    @SerializedName("side")
    private final String side;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    @SerializedName("type")
    private final String type;

    public CryptoOrderItemDTO() {
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
        String r12 = null;
        String r13 = null;
        String r14 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, 16383, null);
    }

    public final String a() {
        return this.avgPrice;
    }

    public final String b() {
        return this.baseAsset;
    }

    public final String c() {
        return this.baseQty;
    }

    public final String d() {
        return this.createdAt;
    }

    public final String e() {
        return this.filledBaseQty;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CryptoOrderItemDTO) == true) goto L8;
        return false;
    L8:
        CryptoOrderItemDTO r52 = (CryptoOrderItemDTO) r5;
        if (p.g(this.f88634id, r52.f88634id) == true) goto L12;
        return false;
    L12:
        if (p.g(this.accNo, r52.accNo) == true) goto L15;
        return false;
    L15:
        if (p.g(this.baseAsset, r52.baseAsset) == true) goto L18;
        return false;
    L18:
        if (p.g(this.quoteAsset, r52.quoteAsset) == true) goto L21;
        return false;
    L21:
        if (p.g(this.side, r52.side) == true) goto L24;
        return false;
    L24:
        if (p.g(this.type, r52.type) == true) goto L27;
        return false;
    L27:
        if (p.g(this.price, r52.price) == true) goto L30;
        return false;
    L30:
        if (p.g(this.baseQty, r52.baseQty) == true) goto L33;
        return false;
    L33:
        if (p.g(this.avgPrice, r52.avgPrice) == true) goto L36;
        return false;
    L36:
        if (p.g(this.filledBaseQty, r52.filledBaseQty) == true) goto L39;
        return false;
    L39:
        if (p.g(this.filledQuoteQty, r52.filledQuoteQty) == true) goto L42;
        return false;
    L42:
        if (p.g(this.grossQuoteQty, r52.grossQuoteQty) == true) goto L45;
        return false;
    L45:
        if (p.g(this.status, r52.status) == true) goto L48;
        return false;
    L48:
        if (p.g(this.createdAt, r52.createdAt) == true) goto L50;
        return false;
    L50:
        return true;
    }

    public final String f() {
        return this.filledQuoteQty;
    }

    public final String g() {
        return this.grossQuoteQty;
    }

    public final String h() {
        return this.f88634id;
    }

    public int hashCode() {
        String r02 = this.f88634id;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.accNo;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.baseAsset;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.quoteAsset;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.side;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.type;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.price;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.baseQty;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.avgPrice;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.filledBaseQty;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.filledQuoteQty;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.grossQuoteQty;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        String r223 = this.status;
        if (r223 != null) goto L53;
        int r224 = 0;
    L54:
        int r016 = (r015 + r224) * 31;
        String r225 = this.createdAt;
        if (r225 == null) goto L59;
        r1 = r225.hashCode();
    L59:
        return r016 + r1;
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

    public final String i() {
        return this.price;
    }

    public final String j() {
        return this.quoteAsset;
    }

    public final String k() {
        return this.side;
    }

    public final String l() {
        return this.status;
    }

    public final String m() {
        return this.type;
    }

    public String toString() {
        return "CryptoOrderItemDTO(id=" + this.f88634id + ", accNo=" + this.accNo + ", baseAsset=" + this.baseAsset + ", quoteAsset=" + this.quoteAsset + ", side=" + this.side + ", type=" + this.type + ", price=" + this.price + ", baseQty=" + this.baseQty + ", avgPrice=" + this.avgPrice + ", filledBaseQty=" + this.filledBaseQty + ", filledQuoteQty=" + this.filledQuoteQty + ", grossQuoteQty=" + this.grossQuoteQty + ", status=" + this.status + ", createdAt=" + this.createdAt + ")";
    }

    public CryptoOrderItemDTO(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, String r14) {
        this.f88634id = r1;
        this.accNo = r2;
        this.baseAsset = r3;
        this.quoteAsset = r4;
        this.side = r5;
        this.type = r6;
        this.price = r7;
        this.baseQty = r8;
        this.avgPrice = r9;
        this.filledBaseQty = r10;
        this.filledQuoteQty = r11;
        this.grossQuoteQty = r12;
        this.status = r13;
        this.createdAt = r14;
    }

    public /* synthetic */ CryptoOrderItemDTO(String r16, String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, int r30, i r31) {
        if ((r30 & 1) == 0) goto L5;
        String r1 = null;
    L7:
        if ((r30 & 2) == 0) goto L9;
        String r3 = null;
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
        if ((r30 & 1024) == 0) goto L45;
        String r12 = null;
    L47:
        if ((r30 & 2048) == 0) goto L49;
        String r13 = null;
    L51:
        if ((r30 & 4096) == 0) goto L53;
        String r14 = null;
    L55:
        if ((r30 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L58;
        String r302 = null;
    L59:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r302);
        return;
    L58:
        r302 = r29;
        goto L59
    L53:
        r14 = r28;
        goto L55
    L49:
        r13 = r27;
        goto L51
    L45:
        r12 = r26;
        goto L47
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
