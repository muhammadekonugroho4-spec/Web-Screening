package com.stockbit.domain.model.chat.message.attachment.shared.stream.targetprice;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\u000eHÆ\u0003J\t\u00101\u001a\u00020\u000eHÆ\u0003J\t\u00102\u001a\u00020\nHÆ\u0003J\t\u00103\u001a\u00020\nHÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003J\t\u00105\u001a\u00020\u000eHÆ\u0003J\u0095\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000eHÆ\u0001J\u0014\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0083\u0004J\n\u0010;\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010<\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"¨\u0006="}, d2 = {"Lcom/stockbit/domain/model/chat/message/attachment/shared/stream/targetprice/MessageStreamTargetPriceEntity;", "Ljava/io/Serializable;", Constants.KEY_ID, "", "voted", "", "symbol", "symbol2", AppMeasurementSdk.ConditionalUserProperty.NAME, "lastPrice", "", "currentPrice", "targetPrice", "duration", "", "dayLeft", "agree", "disagree", "hit", "tradeable", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDIIDDII)V", "getId", "()J", "getVoted", "()Ljava/lang/String;", "getSymbol", "getSymbol2", "getName", "getLastPrice", "()D", "getCurrentPrice", "getTargetPrice", "getDuration", "()I", "getDayLeft", "getAgree", "getDisagree", "getHit", "getTradeable", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "toString", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessageStreamTargetPriceEntity implements Serializable {
    private final double agree;
    private final double currentPrice;
    private final int dayLeft;
    private final double disagree;
    private final int duration;
    private final int hit;

    /* renamed from: id, reason: collision with root package name */
    private final long f81276id;
    private final double lastPrice;
    private final String name;
    private final String symbol;
    private final String symbol2;
    private final double targetPrice;
    private final int tradeable;
    private final String voted;

    public MessageStreamTargetPriceEntity(long r2, String r4, String r5, String r6, String r7, double r8, double r10, double r12, int r14, int r15, double r16, double r18, int r20, int r21) {
        p.l(r4, "voted");
        p.l(r5, "symbol");
        p.l(r6, "symbol2");
        p.l(r7, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f81276id = r2;
        this.voted = r4;
        this.symbol = r5;
        this.symbol2 = r6;
        this.name = r7;
        this.lastPrice = r8;
        this.currentPrice = r10;
        this.targetPrice = r12;
        this.duration = r14;
        this.dayLeft = r15;
        this.agree = r16;
        this.disagree = r18;
        this.hit = r20;
        this.tradeable = r21;
    }

    public final double a() {
        return this.agree;
    }

    public final double b() {
        return this.currentPrice;
    }

    public final int c() {
        return this.dayLeft;
    }

    public final double d() {
        return this.disagree;
    }

    public final int e() {
        return this.duration;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof MessageStreamTargetPriceEntity) == true) goto L8;
        return false;
    L8:
        MessageStreamTargetPriceEntity r82 = (MessageStreamTargetPriceEntity) r8;
        if (this.f81276id == r82.f81276id) goto L12;
        return false;
    L12:
        if (p.g(this.voted, r82.voted) == true) goto L15;
        return false;
    L15:
        if (p.g(this.symbol, r82.symbol) == true) goto L18;
        return false;
    L18:
        if (p.g(this.symbol2, r82.symbol2) == true) goto L21;
        return false;
    L21:
        if (p.g(this.name, r82.name) == true) goto L24;
        return false;
    L24:
        if (Double.compare(this.lastPrice, r82.lastPrice) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.currentPrice, r82.currentPrice) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.targetPrice, r82.targetPrice) == 0) goto L33;
        return false;
    L33:
        if (this.duration == r82.duration) goto L36;
        return false;
    L36:
        if (this.dayLeft == r82.dayLeft) goto L39;
        return false;
    L39:
        if (Double.compare(this.agree, r82.agree) == 0) goto L42;
        return false;
    L42:
        if (Double.compare(this.disagree, r82.disagree) == 0) goto L45;
        return false;
    L45:
        if (this.hit == r82.hit) goto L48;
        return false;
    L48:
        if (this.tradeable == r82.tradeable) goto L50;
        return false;
    L50:
        return true;
    }

    public final int f() {
        return this.hit;
    }

    public final long g() {
        return this.f81276id;
    }

    public final double h() {
        return this.lastPrice;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Long.hashCode(this.f81276id) * 31) + this.voted.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.symbol2.hashCode()) * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.lastPrice)) * 31) + Double.hashCode(this.currentPrice)) * 31) + Double.hashCode(this.targetPrice)) * 31) + Integer.hashCode(this.duration)) * 31) + Integer.hashCode(this.dayLeft)) * 31) + Double.hashCode(this.agree)) * 31) + Double.hashCode(this.disagree)) * 31) + Integer.hashCode(this.hit)) * 31) + Integer.hashCode(this.tradeable);
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

    public final double m() {
        return this.targetPrice;
    }

    public final int o() {
        return this.tradeable;
    }

    public final String p() {
        return this.voted;
    }

    public String toString() {
        return "MessageStreamTargetPriceEntity(id=" + this.f81276id + ", voted=" + this.voted + ", symbol=" + this.symbol + ", symbol2=" + this.symbol2 + ", name=" + this.name + ", lastPrice=" + this.lastPrice + ", currentPrice=" + this.currentPrice + ", targetPrice=" + this.targetPrice + ", duration=" + this.duration + ", dayLeft=" + this.dayLeft + ", agree=" + this.agree + ", disagree=" + this.disagree + ", hit=" + this.hit + ", tradeable=" + this.tradeable + ")";
    }
}
