package com.stockbit.model.entity.stream;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b<\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010?\u001a\u00020\nHÆ\u0003J\t\u0010@\u001a\u00020\nHÆ\u0003J\t\u0010A\u001a\u00020\nHÆ\u0003J\t\u0010B\u001a\u00020\u000eHÆ\u0003J\t\u0010C\u001a\u00020\u000eHÆ\u0003J\t\u0010D\u001a\u00020\nHÆ\u0003J\t\u0010E\u001a\u00020\nHÆ\u0003J\t\u0010F\u001a\u00020\u000eHÆ\u0003J\t\u0010G\u001a\u00020\u000eHÆ\u0003J\u009d\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000eHÆ\u0001J\u0006\u0010I\u001a\u00020\u000eJ\u0014\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010MHÖ\u0083\u0004J\n\u0010N\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010O\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u000eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001e\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R\u001e\u0010\f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010-\"\u0004\b1\u0010/R\u001e\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R\u001e\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010%\"\u0004\b5\u0010'R\u001e\u0010\u0012\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010-\"\u0004\b7\u0010/R\u001e\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010-\"\u0004\b9\u0010/¨\u0006U"}, d2 = {"Lcom/stockbit/model/entity/stream/TargetPriceResponseData;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", "voted", "", "symbol", "symbol2", AppMeasurementSdk.ConditionalUserProperty.NAME, "lastPrice", "", "currentPrice", "targetPrice", "duration", "", "dayLeft", "agree", "disagree", "hit", "tradeable", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDIIDDII)V", "getId", "()J", "setId", "(J)V", "getVoted", "()Ljava/lang/String;", "setVoted", "(Ljava/lang/String;)V", "getSymbol", "setSymbol", "getSymbol2", "setSymbol2", "getName", "setName", "getLastPrice", "()D", "setLastPrice", "(D)V", "getCurrentPrice", "setCurrentPrice", "getTargetPrice", "setTargetPrice", "getDuration", "()I", "setDuration", "(I)V", "getDayLeft", "setDayLeft", "getAgree", "setAgree", "getDisagree", "setDisagree", "getHit", "setHit", "getTradeable", "setTradeable", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TargetPriceResponseData implements Parcelable {
    public static final Parcelable.Creator<TargetPriceResponseData> CREATOR = null;

    @SerializedName("agree")
    private double agree;

    @SerializedName("current_price")
    private double currentPrice;

    @SerializedName("day_left")
    private int dayLeft;

    @SerializedName("disagree")
    private double disagree;

    @SerializedName("duration")
    private int duration;

    @SerializedName("hit")
    private int hit;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private long f122107id;

    @SerializedName("last_price")
    private double lastPrice;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private String name;

    @SerializedName("symbol")
    private String symbol;

    @SerializedName("symbol2")
    private String symbol2;

    @SerializedName("target_price")
    private double targetPrice;

    @SerializedName("tradeable")
    private int tradeable;

    @SerializedName("voted")
    private String voted;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final TargetPriceResponseData a(Parcel r23) {
            p.l(r23, "parcel");
            return new TargetPriceResponseData(r23.readLong(), r23.readString(), r23.readString(), r23.readString(), r23.readString(), r23.readDouble(), r23.readDouble(), r23.readDouble(), r23.readInt(), r23.readInt(), r23.readDouble(), r23.readDouble(), r23.readInt(), r23.readInt());
        }

        public final TargetPriceResponseData[] b(int r1) {
            return new TargetPriceResponseData[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1) {
            return a(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int r1) {
            return b(r1);
        }
    }

    static {
        CREATOR = new a();
    }

    public TargetPriceResponseData() {
        long r1 = 0;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        double r7 = 0.0d;
        double r9 = 0.0d;
        double r11 = 0.0d;
        int r13 = 0;
        int r14 = 0;
        double r15 = 0.0d;
        double r17 = 0.0d;
        int r19 = 0;
        int r20 = 0;
        this(r1, r3, r4, r5, r6, r7, r9, r11, r13, r14, r15, r17, r19, r20, 16383, null);
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.duration;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof TargetPriceResponseData) == true) goto L8;
        return false;
    L8:
        TargetPriceResponseData r82 = (TargetPriceResponseData) r8;
        if (this.f122107id == r82.f122107id) goto L12;
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
        return this.f122107id;
    }

    public final double h() {
        return this.lastPrice;
    }

    public int hashCode() {
        int r02 = Long.hashCode(this.f122107id) * 31;
        String r1 = this.voted;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.symbol;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.symbol2;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.name;
        if (r17 == null) goto L19;
        r2 = r17.hashCode();
    L19:
        return ((((((((((((((((((r05 + r2) * 31) + Double.hashCode(this.lastPrice)) * 31) + Double.hashCode(this.currentPrice)) * 31) + Double.hashCode(this.targetPrice)) * 31) + Integer.hashCode(this.duration)) * 31) + Integer.hashCode(this.dayLeft)) * 31) + Double.hashCode(this.agree)) * 31) + Double.hashCode(this.disagree)) * 31) + Integer.hashCode(this.hit)) * 31) + Integer.hashCode(this.tradeable);
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
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

    public final double l() {
        return this.targetPrice;
    }

    public final int m() {
        return this.tradeable;
    }

    public final String n() {
        return this.voted;
    }

    public String toString() {
        return "TargetPriceResponseData(id=" + this.f122107id + ", voted=" + this.voted + ", symbol=" + this.symbol + ", symbol2=" + this.symbol2 + ", name=" + this.name + ", lastPrice=" + this.lastPrice + ", currentPrice=" + this.currentPrice + ", targetPrice=" + this.targetPrice + ", duration=" + this.duration + ", dayLeft=" + this.dayLeft + ", agree=" + this.agree + ", disagree=" + this.disagree + ", hit=" + this.hit + ", tradeable=" + this.tradeable + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeLong(this.f122107id);
        r3.writeString(this.voted);
        r3.writeString(this.symbol);
        r3.writeString(this.symbol2);
        r3.writeString(this.name);
        r3.writeDouble(this.lastPrice);
        r3.writeDouble(this.currentPrice);
        r3.writeDouble(this.targetPrice);
        r3.writeInt(this.duration);
        r3.writeInt(this.dayLeft);
        r3.writeDouble(this.agree);
        r3.writeDouble(this.disagree);
        r3.writeInt(this.hit);
        r3.writeInt(this.tradeable);
    }

    public TargetPriceResponseData(long r1, String r3, String r4, String r5, String r6, double r7, double r9, double r11, int r13, int r14, double r15, double r17, int r19, int r20) {
        this.f122107id = r1;
        this.voted = r3;
        this.symbol = r4;
        this.symbol2 = r5;
        this.name = r6;
        this.lastPrice = r7;
        this.currentPrice = r9;
        this.targetPrice = r11;
        this.duration = r13;
        this.dayLeft = r14;
        this.agree = r15;
        this.disagree = r17;
        this.hit = r19;
        this.tradeable = r20;
    }

    public /* synthetic */ TargetPriceResponseData(long r22, String r24, String r25, String r26, String r27, double r28, double r30, double r32, int r34, int r35, double r36, double r38, int r40, int r41, int r42, i r43) {
        if ((r42 & 1) == 0) goto L5;
        long r1 = 0;
    L6:
        String r4 = null;
        if ((r42 & 2) == 0) goto L9;
        String r3 = null;
    L11:
        if ((r42 & 4) == 0) goto L13;
        String r5 = null;
    L15:
        if ((r42 & 8) == 0) goto L17;
        String r6 = null;
    L19:
        if ((r42 & 16) != 0) goto L23;
        r4 = r27;
    L23:
        if ((r42 & 32) == 0) goto L25;
        double r10 = 0.0d;
    L27:
        if ((r42 & 64) == 0) goto L29;
        double r12 = 0.0d;
    L31:
        if ((r42 & 128) == 0) goto L33;
        double r14 = 0.0d;
    L35:
        if ((r42 & 256) == 0) goto L37;
        int r7 = 0;
    L39:
        if ((r42 & 512) == 0) goto L41;
        int r8 = 0;
    L43:
        if ((r42 & 1024) == 0) goto L45;
        double r17 = 0.0d;
    L47:
        if ((r42 & 2048) == 0) goto L49;
        double r19 = 0.0d;
    L51:
        if ((r42 & 4096) == 0) goto L53;
        int r9 = 0;
    L55:
        if ((r42 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L58;
        int r422 = 0;
    L59:
        this(r1, r3, r5, r6, r4, r10, r12, r14, r7, r8, r17, r19, r9, r422);
        return;
    L58:
        r422 = r41;
        goto L59
    L53:
        r9 = r40;
        goto L55
    L49:
        r19 = r38;
        goto L51
    L45:
        r17 = r36;
        goto L47
    L41:
        r8 = r35;
        goto L43
    L37:
        r7 = r34;
        goto L39
    L33:
        r14 = r32;
        goto L35
    L29:
        r12 = r30;
        goto L31
    L25:
        r10 = r28;
        goto L27
    L17:
        r6 = r26;
        goto L19
    L13:
        r5 = r25;
        goto L15
    L9:
        r3 = r24;
        goto L11
    L5:
        r1 = r22;
        goto L6
    }
}
