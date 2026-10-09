package com.stockbit.dto.chat.message.attachment.shared.stream.targetprice;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00105\u001a\u0004\u0018\u00010\rHÆ\u0003J¶\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u00107J\u0014\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010;\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010<\u001a\u00020\rHÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001e\u0010\u0019R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b \u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b%\u0010\u0016R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b&\u0010\u0019R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"¨\u0006="}, d2 = {"Lcom/stockbit/dto/chat/message/attachment/shared/stream/targetprice/MessageStreamTargetPriceDTO;", "", "agree", "", "currentPrice", "", "dayLeft", "disagree", "duration", "hit", Constants.KEY_ID, "lastPrice", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "symbol", "symbol2", "targetPrice", "tradeable", "voted", "<init>", "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;)V", "getAgree", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCurrentPrice", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDayLeft", "getDisagree", "getDuration", "getHit", "getId", "getLastPrice", "getName", "()Ljava/lang/String;", "getSymbol", "getSymbol2", "getTargetPrice", "getTradeable", "getVoted", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", Constants.COPY_TYPE, "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stockbit/dto/chat/message/attachment/shared/stream/targetprice/MessageStreamTargetPriceDTO;", "equals", "", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessageStreamTargetPriceDTO {

    @SerializedName("agree")
    private final Double agree;

    @SerializedName("current_price")
    private final Integer currentPrice;

    @SerializedName("day_left")
    private final Integer dayLeft;

    @SerializedName("disagree")
    private final Double disagree;

    @SerializedName("duration")
    private final Integer duration;

    @SerializedName("hit")
    private final Integer hit;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final Integer f88617id;

    @SerializedName("last_price")
    private final Double lastPrice;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @SerializedName("symbol")
    private final String symbol;

    @SerializedName("symbol2")
    private final String symbol2;

    @SerializedName("target_price")
    private final Double targetPrice;

    @SerializedName("tradeable")
    private final Integer tradeable;

    @SerializedName("voted")
    private final String voted;

    public MessageStreamTargetPriceDTO() {
        Double r1 = null;
        Integer r2 = null;
        Integer r3 = null;
        Double r4 = null;
        Integer r5 = null;
        Integer r6 = null;
        Integer r7 = null;
        Double r8 = null;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        Double r12 = null;
        Integer r13 = null;
        String r14 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, 16383, null);
    }

    public final Double a() {
        return this.agree;
    }

    public final Integer b() {
        return this.currentPrice;
    }

    public final Integer c() {
        return this.dayLeft;
    }

    public final Double d() {
        return this.disagree;
    }

    public final Integer e() {
        return this.duration;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MessageStreamTargetPriceDTO) == true) goto L8;
        return false;
    L8:
        MessageStreamTargetPriceDTO r52 = (MessageStreamTargetPriceDTO) r5;
        if (p.g(this.agree, r52.agree) == true) goto L12;
        return false;
    L12:
        if (p.g(this.currentPrice, r52.currentPrice) == true) goto L15;
        return false;
    L15:
        if (p.g(this.dayLeft, r52.dayLeft) == true) goto L18;
        return false;
    L18:
        if (p.g(this.disagree, r52.disagree) == true) goto L21;
        return false;
    L21:
        if (p.g(this.duration, r52.duration) == true) goto L24;
        return false;
    L24:
        if (p.g(this.hit, r52.hit) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f88617id, r52.f88617id) == true) goto L30;
        return false;
    L30:
        if (p.g(this.lastPrice, r52.lastPrice) == true) goto L33;
        return false;
    L33:
        if (p.g(this.name, r52.name) == true) goto L36;
        return false;
    L36:
        if (p.g(this.symbol, r52.symbol) == true) goto L39;
        return false;
    L39:
        if (p.g(this.symbol2, r52.symbol2) == true) goto L42;
        return false;
    L42:
        if (p.g(this.targetPrice, r52.targetPrice) == true) goto L45;
        return false;
    L45:
        if (p.g(this.tradeable, r52.tradeable) == true) goto L48;
        return false;
    L48:
        if (p.g(this.voted, r52.voted) == true) goto L50;
        return false;
    L50:
        return true;
    }

    public final Integer f() {
        return this.hit;
    }

    public final Integer g() {
        return this.f88617id;
    }

    public final Double h() {
        return this.lastPrice;
    }

    public int hashCode() {
        Double r02 = this.agree;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.currentPrice;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Integer r23 = this.dayLeft;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Double r25 = this.disagree;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Integer r27 = this.duration;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        Integer r29 = this.hit;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        Integer r211 = this.f88617id;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        Double r213 = this.lastPrice;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.name;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.symbol;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.symbol2;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        Double r221 = this.targetPrice;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        Integer r223 = this.tradeable;
        if (r223 != null) goto L53;
        int r224 = 0;
    L54:
        int r016 = (r015 + r224) * 31;
        String r225 = this.voted;
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
        return this.name;
    }

    public final String j() {
        return this.symbol;
    }

    public final String k() {
        return this.symbol2;
    }

    public final Double l() {
        return this.targetPrice;
    }

    public final Integer m() {
        return this.tradeable;
    }

    public final String n() {
        return this.voted;
    }

    public String toString() {
        return "MessageStreamTargetPriceDTO(agree=" + this.agree + ", currentPrice=" + this.currentPrice + ", dayLeft=" + this.dayLeft + ", disagree=" + this.disagree + ", duration=" + this.duration + ", hit=" + this.hit + ", id=" + this.f88617id + ", lastPrice=" + this.lastPrice + ", name=" + this.name + ", symbol=" + this.symbol + ", symbol2=" + this.symbol2 + ", targetPrice=" + this.targetPrice + ", tradeable=" + this.tradeable + ", voted=" + this.voted + ")";
    }

    public MessageStreamTargetPriceDTO(Double r1, Integer r2, Integer r3, Double r4, Integer r5, Integer r6, Integer r7, Double r8, String r9, String r10, String r11, Double r12, Integer r13, String r14) {
        this.agree = r1;
        this.currentPrice = r2;
        this.dayLeft = r3;
        this.disagree = r4;
        this.duration = r5;
        this.hit = r6;
        this.f88617id = r7;
        this.lastPrice = r8;
        this.name = r9;
        this.symbol = r10;
        this.symbol2 = r11;
        this.targetPrice = r12;
        this.tradeable = r13;
        this.voted = r14;
    }

    public /* synthetic */ MessageStreamTargetPriceDTO(Double r16, Integer r17, Integer r18, Double r19, Integer r20, Integer r21, Integer r22, Double r23, String r24, String r25, String r26, Double r27, Integer r28, String r29, int r30, i r31) {
        if ((r30 & 1) == 0) goto L5;
        Double r1 = null;
    L7:
        if ((r30 & 2) == 0) goto L9;
        Integer r3 = null;
    L11:
        if ((r30 & 4) == 0) goto L13;
        Integer r4 = null;
    L15:
        if ((r30 & 8) == 0) goto L17;
        Double r5 = null;
    L19:
        if ((r30 & 16) == 0) goto L21;
        Integer r6 = null;
    L23:
        if ((r30 & 32) == 0) goto L25;
        Integer r7 = null;
    L27:
        if ((r30 & 64) == 0) goto L29;
        Integer r8 = null;
    L31:
        if ((r30 & 128) == 0) goto L33;
        Double r9 = null;
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
        Double r13 = null;
    L51:
        if ((r30 & 4096) == 0) goto L53;
        Integer r14 = null;
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
