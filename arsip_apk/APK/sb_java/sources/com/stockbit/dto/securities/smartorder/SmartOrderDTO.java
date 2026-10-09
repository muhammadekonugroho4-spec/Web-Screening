package com.stockbit.dto.securities.smartorder;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001bJn\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010&J\u0014\u0010'\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010*\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0018\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\f\u0010\u001b¨\u0006+"}, d2 = {"Lcom/stockbit/dto/securities/smartorder/SmartOrderDTO;", "", Constants.KEY_ID, "", "type", "", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "shares", "source", "realizedAmount", "realizedPercentage", "isRealizedGainHidden", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getType", "()Ljava/lang/String;", "getPrice", "()Ljava/math/BigDecimal;", "getShares", "getSource", "getRealizedAmount", "getRealizedPercentage", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;)Lcom/stockbit/dto/securities/smartorder/SmartOrderDTO;", "equals", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SmartOrderDTO {

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final Integer f88699id;

    @SerializedName("is_realized_gain_hidden")
    private final Boolean isRealizedGainHidden;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final BigDecimal price;

    @SerializedName("realized_amount")
    private final BigDecimal realizedAmount;

    @SerializedName("realized_percentage")
    private final BigDecimal realizedPercentage;

    @SerializedName("shares")
    private final Integer shares;

    @SerializedName("source")
    private final Integer source;

    @SerializedName("type_text")
    private final String type;

    public SmartOrderDTO() {
        Integer r1 = null;
        String r2 = null;
        BigDecimal r3 = null;
        Integer r4 = null;
        Integer r5 = null;
        BigDecimal r6 = null;
        BigDecimal r7 = null;
        Boolean r8 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH, null);
    }

    public final Integer a() {
        return this.f88699id;
    }

    public final BigDecimal b() {
        return this.price;
    }

    public final BigDecimal c() {
        return this.realizedAmount;
    }

    public final BigDecimal d() {
        return this.realizedPercentage;
    }

    public final Integer e() {
        return this.shares;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SmartOrderDTO) == true) goto L8;
        return false;
    L8:
        SmartOrderDTO r52 = (SmartOrderDTO) r5;
        if (p.g(this.f88699id, r52.f88699id) == true) goto L12;
        return false;
    L12:
        if (p.g(this.type, r52.type) == true) goto L15;
        return false;
    L15:
        if (p.g(this.price, r52.price) == true) goto L18;
        return false;
    L18:
        if (p.g(this.shares, r52.shares) == true) goto L21;
        return false;
    L21:
        if (p.g(this.source, r52.source) == true) goto L24;
        return false;
    L24:
        if (p.g(this.realizedAmount, r52.realizedAmount) == true) goto L27;
        return false;
    L27:
        if (p.g(this.realizedPercentage, r52.realizedPercentage) == true) goto L30;
        return false;
    L30:
        if (p.g(this.isRealizedGainHidden, r52.isRealizedGainHidden) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final Integer f() {
        return this.source;
    }

    public final String g() {
        return this.type;
    }

    public final Boolean h() {
        return this.isRealizedGainHidden;
    }

    public int hashCode() {
        Integer r02 = this.f88699id;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.type;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        BigDecimal r23 = this.price;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Integer r25 = this.shares;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Integer r27 = this.source;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        BigDecimal r29 = this.realizedAmount;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        BigDecimal r211 = this.realizedPercentage;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        Boolean r213 = this.isRealizedGainHidden;
        if (r213 == null) goto L35;
        r1 = r213.hashCode();
    L35:
        return r010 + r1;
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

    public String toString() {
        return "SmartOrderDTO(id=" + this.f88699id + ", type=" + this.type + ", price=" + this.price + ", shares=" + this.shares + ", source=" + this.source + ", realizedAmount=" + this.realizedAmount + ", realizedPercentage=" + this.realizedPercentage + ", isRealizedGainHidden=" + this.isRealizedGainHidden + ")";
    }

    public SmartOrderDTO(Integer r1, String r2, BigDecimal r3, Integer r4, Integer r5, BigDecimal r6, BigDecimal r7, Boolean r8) {
        this.f88699id = r1;
        this.type = r2;
        this.price = r3;
        this.shares = r4;
        this.source = r5;
        this.realizedAmount = r6;
        this.realizedPercentage = r7;
        this.isRealizedGainHidden = r8;
    }

    public /* synthetic */ SmartOrderDTO(Integer r2, String r3, BigDecimal r4, Integer r5, Integer r6, BigDecimal r7, BigDecimal r8, Boolean r9, int r10, i r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r10 & 128) == 0) goto L27;
        Boolean r102 = null;
    L26:
        BigDecimal r92 = r8;
        BigDecimal r82 = r7;
        Integer r72 = r6;
        Integer r62 = r5;
        BigDecimal r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102);
        return;
    L27:
        r102 = r9;
        goto L26
    }
}
