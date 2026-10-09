package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b-\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u00100\u001a\u000201J\u0014\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0083\u0004J\n\u00106\u001a\u000201HÖ\u0081\u0004J\n\u00107\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000201R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012¨\u0006="}, d2 = {"Lcom/stockbit/model/entity/BandarDetectorBrokersBuyResponseData;", "Landroid/os/Parcelable;", "netbsDate", "", "netbsStockCode", "netbsBrokerCode", "blot", "bval", "bvalv", "blotv", "type", "freq", "netbsBuyAvgPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNetbsDate", "()Ljava/lang/String;", "setNetbsDate", "(Ljava/lang/String;)V", "getNetbsStockCode", "setNetbsStockCode", "getNetbsBrokerCode", "setNetbsBrokerCode", "getBlot", "setBlot", "getBval", "setBval", "getBvalv", "setBvalv", "getBlotv", "setBlotv", "getType", "setType", "getFreq", "setFreq", "getNetbsBuyAvgPrice", "setNetbsBuyAvgPrice", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BandarDetectorBrokersBuyResponseData implements Parcelable {
    public static final Parcelable.Creator<BandarDetectorBrokersBuyResponseData> CREATOR = null;

    @SerializedName("blot")
    @Expose
    private String blot;

    @SerializedName("blotv")
    @Expose
    private String blotv;

    @SerializedName("bval")
    @Expose
    private String bval;

    @SerializedName("bvalv")
    @Expose
    private String bvalv;

    @SerializedName("freq")
    @Expose
    private String freq;

    @SerializedName("netbs_broker_code")
    @Expose
    private String netbsBrokerCode;

    @SerializedName("netbs_buy_avg_price")
    @Expose
    private String netbsBuyAvgPrice;

    @SerializedName("netbs_date")
    @Expose
    private String netbsDate;

    @SerializedName("netbs_stock_code")
    @Expose
    private String netbsStockCode;

    @SerializedName("type")
    @Expose
    private String type;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final BandarDetectorBrokersBuyResponseData a(Parcel r13) {
            p.l(r13, "parcel");
            return new BandarDetectorBrokersBuyResponseData(r13.readString(), r13.readString(), r13.readString(), r13.readString(), r13.readString(), r13.readString(), r13.readString(), r13.readString(), r13.readString(), r13.readString());
        }

        public final BandarDetectorBrokersBuyResponseData[] b(int r1) {
            return new BandarDetectorBrokersBuyResponseData[r1];
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

    public BandarDetectorBrokersBuyResponseData() {
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
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 1023, null);
    }

    public final String a() {
        return this.blot;
    }

    public final String b() {
        return this.bval;
    }

    public final String c() {
        return this.freq;
    }

    public final String d() {
        return this.netbsBrokerCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.netbsBuyAvgPrice;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BandarDetectorBrokersBuyResponseData) == true) goto L8;
        return false;
    L8:
        BandarDetectorBrokersBuyResponseData r52 = (BandarDetectorBrokersBuyResponseData) r5;
        if (p.g(this.netbsDate, r52.netbsDate) == true) goto L12;
        return false;
    L12:
        if (p.g(this.netbsStockCode, r52.netbsStockCode) == true) goto L15;
        return false;
    L15:
        if (p.g(this.netbsBrokerCode, r52.netbsBrokerCode) == true) goto L18;
        return false;
    L18:
        if (p.g(this.blot, r52.blot) == true) goto L21;
        return false;
    L21:
        if (p.g(this.bval, r52.bval) == true) goto L24;
        return false;
    L24:
        if (p.g(this.bvalv, r52.bvalv) == true) goto L27;
        return false;
    L27:
        if (p.g(this.blotv, r52.blotv) == true) goto L30;
        return false;
    L30:
        if (p.g(this.type, r52.type) == true) goto L33;
        return false;
    L33:
        if (p.g(this.freq, r52.freq) == true) goto L36;
        return false;
    L36:
        if (p.g(this.netbsBuyAvgPrice, r52.netbsBuyAvgPrice) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.netbsStockCode;
    }

    public final String g() {
        return this.type;
    }

    public int hashCode() {
        String r02 = this.netbsDate;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.netbsStockCode;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.netbsBrokerCode;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.blot;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.bval;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.bvalv;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.blotv;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.type;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.freq;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.netbsBuyAvgPrice;
        if (r217 == null) goto L43;
        r1 = r217.hashCode();
    L43:
        return r012 + r1;
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

    public String toString() {
        return "BandarDetectorBrokersBuyResponseData(netbsDate=" + this.netbsDate + ", netbsStockCode=" + this.netbsStockCode + ", netbsBrokerCode=" + this.netbsBrokerCode + ", blot=" + this.blot + ", bval=" + this.bval + ", bvalv=" + this.bvalv + ", blotv=" + this.blotv + ", type=" + this.type + ", freq=" + this.freq + ", netbsBuyAvgPrice=" + this.netbsBuyAvgPrice + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.netbsDate);
        r1.writeString(this.netbsStockCode);
        r1.writeString(this.netbsBrokerCode);
        r1.writeString(this.blot);
        r1.writeString(this.bval);
        r1.writeString(this.bvalv);
        r1.writeString(this.blotv);
        r1.writeString(this.type);
        r1.writeString(this.freq);
        r1.writeString(this.netbsBuyAvgPrice);
    }

    public BandarDetectorBrokersBuyResponseData(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10) {
        this.netbsDate = r1;
        this.netbsStockCode = r2;
        this.netbsBrokerCode = r3;
        this.blot = r4;
        this.bval = r5;
        this.bvalv = r6;
        this.blotv = r7;
        this.type = r8;
        this.freq = r9;
        this.netbsBuyAvgPrice = r10;
    }

    public /* synthetic */ BandarDetectorBrokersBuyResponseData(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, int r12, i r13) {
        if ((r12 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r9 = null;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r10 = null;
    L30:
        if ((r12 & 512) == 0) goto L33;
        String r122 = null;
    L32:
        String r112 = r10;
        String r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102, r112, r122);
        return;
    L33:
        r122 = r11;
        goto L32
    }
}
