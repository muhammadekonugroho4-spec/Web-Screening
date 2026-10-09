package com.stockbit.domain.model.valueobject.trading;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b1\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008d\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u00104\u001a\u000205J\u0014\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0083\u0004J\n\u0010:\u001a\u000205HÖ\u0081\u0004J\n\u0010;\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u000205R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010\u0013¨\u0006A"}, d2 = {"Lcom/stockbit/domain/model/valueobject/trading/TradingFormulaDataEntity;", "Landroid/os/Parcelable;", "buyLot", "", "sellLot", "sellMarket", "sellProfitloss", "sellGain", "portfolio", "portfolioProfitloss", "portfolioEquity", "portfolioGain", "buyFee", "sellFee", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBuyLot", "()Ljava/lang/String;", "setBuyLot", "(Ljava/lang/String;)V", "getSellLot", "setSellLot", "getSellMarket", "setSellMarket", "getSellProfitloss", "setSellProfitloss", "getSellGain", "setSellGain", "getPortfolio", "setPortfolio", "getPortfolioProfitloss", "setPortfolioProfitloss", "getPortfolioEquity", "setPortfolioEquity", "getPortfolioGain", "setPortfolioGain", "getBuyFee", "setBuyFee", "getSellFee", "setSellFee", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TradingFormulaDataEntity implements Parcelable {
    public static final Parcelable.Creator<TradingFormulaDataEntity> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public String f87191a;

    /* renamed from: b, reason: collision with root package name */
    public String f87192b;

    /* renamed from: c, reason: collision with root package name */
    public String f87193c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f87194e;

    /* renamed from: f, reason: collision with root package name */
    public String f87195f;

    /* renamed from: g, reason: collision with root package name */
    public String f87196g;

    /* renamed from: h, reason: collision with root package name */
    public String f87197h;

    /* renamed from: i, reason: collision with root package name */
    public String f87198i;

    /* renamed from: j, reason: collision with root package name */
    public String f87199j;

    /* renamed from: k, reason: collision with root package name */
    public String f87200k;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final TradingFormulaDataEntity a(Parcel r14) {
            p.l(r14, "parcel");
            return new TradingFormulaDataEntity(r14.readString(), r14.readString(), r14.readString(), r14.readString(), r14.readString(), r14.readString(), r14.readString(), r14.readString(), r14.readString(), r14.readString(), r14.readString());
        }

        public final TradingFormulaDataEntity[] b(int r1) {
            return new TradingFormulaDataEntity[r1];
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

    public TradingFormulaDataEntity(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11) {
        this.f87191a = r1;
        this.f87192b = r2;
        this.f87193c = r3;
        this.d = r4;
        this.f87194e = r5;
        this.f87195f = r6;
        this.f87196g = r7;
        this.f87197h = r8;
        this.f87198i = r9;
        this.f87199j = r10;
        this.f87200k = r11;
    }

    public final String a() {
        return this.f87199j;
    }

    public final String b() {
        return this.f87191a;
    }

    public final String c() {
        return this.f87195f;
    }

    public final String d() {
        return this.f87197h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f87198i;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TradingFormulaDataEntity) == true) goto L8;
        return false;
    L8:
        TradingFormulaDataEntity r52 = (TradingFormulaDataEntity) r5;
        if (p.g(this.f87191a, r52.f87191a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87192b, r52.f87192b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87193c, r52.f87193c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f87194e, r52.f87194e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f87195f, r52.f87195f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f87196g, r52.f87196g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f87197h, r52.f87197h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f87198i, r52.f87198i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f87199j, r52.f87199j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f87200k, r52.f87200k) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.f87196g;
    }

    public final String g() {
        return this.f87200k;
    }

    public final String h() {
        return this.f87194e;
    }

    public int hashCode() {
        String r02 = this.f87191a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f87192b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f87193c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f87194e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f87195f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f87196g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f87197h;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.f87198i;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.f87199j;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.f87200k;
        if (r219 == null) goto L47;
        r1 = r219.hashCode();
    L47:
        return r013 + r1;
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
        return this.f87192b;
    }

    public final String j() {
        return this.d;
    }

    public String toString() {
        return "TradingFormulaDataEntity(buyLot=" + this.f87191a + ", sellLot=" + this.f87192b + ", sellMarket=" + this.f87193c + ", sellProfitloss=" + this.d + ", sellGain=" + this.f87194e + ", portfolio=" + this.f87195f + ", portfolioProfitloss=" + this.f87196g + ", portfolioEquity=" + this.f87197h + ", portfolioGain=" + this.f87198i + ", buyFee=" + this.f87199j + ", sellFee=" + this.f87200k + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f87191a);
        r1.writeString(this.f87192b);
        r1.writeString(this.f87193c);
        r1.writeString(this.d);
        r1.writeString(this.f87194e);
        r1.writeString(this.f87195f);
        r1.writeString(this.f87196g);
        r1.writeString(this.f87197h);
        r1.writeString(this.f87198i);
        r1.writeString(this.f87199j);
        r1.writeString(this.f87200k);
    }
}
