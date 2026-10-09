package com.stockbit.feature.history.contract;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b+\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\u008b\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\u0006\u00100\u001a\u000201J\u0014\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0083\u0004J\n\u00106\u001a\u000201HÖ\u0081\u0004J\n\u00107\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000201R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016¨\u0006="}, d2 = {"Lcom/stockbit/feature/history/contract/DetailHistoryDividendUIParam;", "Landroid/os/Parcelable;", "type", "Lcom/stockbit/feature/history/contract/DividendDetailType;", "symbol", "", "displayAs", Constants.KEY_DATE, "sharesFormatted", "cashType", "dividendPerShare", "ratio", "dividendSharesFormatted", "bonusSharesFormatted", "closingPriceDate", "closingPriceFormatted", "amountFormatted", "<init>", "(Lcom/stockbit/feature/history/contract/DividendDetailType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lcom/stockbit/feature/history/contract/DividendDetailType;", "getSymbol", "()Ljava/lang/String;", "getDisplayAs", "getDate", "getSharesFormatted", "getCashType", "getDividendPerShare", "getRatio", "getDividendSharesFormatted", "getBonusSharesFormatted", "getClosingPriceDate", "getClosingPriceFormatted", "getAmountFormatted", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "history-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DetailHistoryDividendUIParam implements Parcelable {
    public static final Parcelable.Creator<DetailHistoryDividendUIParam> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final DividendDetailType f96645a;

    /* renamed from: b, reason: collision with root package name */
    public final String f96646b;

    /* renamed from: c, reason: collision with root package name */
    public final String f96647c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f96648e;

    /* renamed from: f, reason: collision with root package name */
    public final String f96649f;

    /* renamed from: g, reason: collision with root package name */
    public final String f96650g;

    /* renamed from: h, reason: collision with root package name */
    public final String f96651h;

    /* renamed from: i, reason: collision with root package name */
    public final String f96652i;

    /* renamed from: j, reason: collision with root package name */
    public final String f96653j;

    /* renamed from: k, reason: collision with root package name */
    public final String f96654k;

    /* renamed from: l, reason: collision with root package name */
    public final String f96655l;

    /* renamed from: m, reason: collision with root package name */
    public final String f96656m;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final DetailHistoryDividendUIParam a(Parcel r16) {
            p.l(r16, "parcel");
            return new DetailHistoryDividendUIParam(DividendDetailType.valueOf(r16.readString()), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString());
        }

        public final DetailHistoryDividendUIParam[] b(int r1) {
            return new DetailHistoryDividendUIParam[r1];
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

    public DetailHistoryDividendUIParam(DividendDetailType r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, String r14) {
        p.l(r2, "type");
        p.l(r3, "symbol");
        p.l(r4, "displayAs");
        p.l(r5, Constants.KEY_DATE);
        p.l(r6, "sharesFormatted");
        p.l(r7, "cashType");
        p.l(r8, "dividendPerShare");
        p.l(r9, "ratio");
        p.l(r10, "dividendSharesFormatted");
        p.l(r11, "bonusSharesFormatted");
        p.l(r12, "closingPriceDate");
        p.l(r13, "closingPriceFormatted");
        p.l(r14, "amountFormatted");
        this.f96645a = r2;
        this.f96646b = r3;
        this.f96647c = r4;
        this.d = r5;
        this.f96648e = r6;
        this.f96649f = r7;
        this.f96650g = r8;
        this.f96651h = r9;
        this.f96652i = r10;
        this.f96653j = r11;
        this.f96654k = r12;
        this.f96655l = r13;
        this.f96656m = r14;
    }

    public final String a() {
        return this.f96656m;
    }

    public final String b() {
        return this.f96653j;
    }

    public final String c() {
        return this.f96649f;
    }

    public final String d() {
        return this.f96654k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f96655l;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DetailHistoryDividendUIParam) == true) goto L8;
        return false;
    L8:
        DetailHistoryDividendUIParam r52 = (DetailHistoryDividendUIParam) r5;
        if (this.f96645a == r52.f96645a) goto L12;
        return false;
    L12:
        if (p.g(this.f96646b, r52.f96646b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f96647c, r52.f96647c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f96648e, r52.f96648e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f96649f, r52.f96649f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f96650g, r52.f96650g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f96651h, r52.f96651h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f96652i, r52.f96652i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f96653j, r52.f96653j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f96654k, r52.f96654k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f96655l, r52.f96655l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f96656m, r52.f96656m) == true) goto L47;
        return false;
    L47:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f96647c;
    }

    public final String h() {
        return this.f96650g;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f96645a.hashCode() * 31) + this.f96646b.hashCode()) * 31) + this.f96647c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f96648e.hashCode()) * 31) + this.f96649f.hashCode()) * 31) + this.f96650g.hashCode()) * 31) + this.f96651h.hashCode()) * 31) + this.f96652i.hashCode()) * 31) + this.f96653j.hashCode()) * 31) + this.f96654k.hashCode()) * 31) + this.f96655l.hashCode()) * 31) + this.f96656m.hashCode();
    }

    public final String i() {
        return this.f96652i;
    }

    public final String j() {
        return this.f96651h;
    }

    public final String k() {
        return this.f96648e;
    }

    public final String l() {
        return this.f96646b;
    }

    public final DividendDetailType m() {
        return this.f96645a;
    }

    public String toString() {
        return "DetailHistoryDividendUIParam(type=" + this.f96645a + ", symbol=" + this.f96646b + ", displayAs=" + this.f96647c + ", date=" + this.d + ", sharesFormatted=" + this.f96648e + ", cashType=" + this.f96649f + ", dividendPerShare=" + this.f96650g + ", ratio=" + this.f96651h + ", dividendSharesFormatted=" + this.f96652i + ", bonusSharesFormatted=" + this.f96653j + ", closingPriceDate=" + this.f96654k + ", closingPriceFormatted=" + this.f96655l + ", amountFormatted=" + this.f96656m + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f96645a.name());
        r1.writeString(this.f96646b);
        r1.writeString(this.f96647c);
        r1.writeString(this.d);
        r1.writeString(this.f96648e);
        r1.writeString(this.f96649f);
        r1.writeString(this.f96650g);
        r1.writeString(this.f96651h);
        r1.writeString(this.f96652i);
        r1.writeString(this.f96653j);
        r1.writeString(this.f96654k);
        r1.writeString(this.f96655l);
        r1.writeString(this.f96656m);
    }

    public /* synthetic */ DetailHistoryDividendUIParam(DividendDetailType r13, String r14, String r15, String r16, String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, int r26, i r27) {
        if ((r26 & 2) == 0) goto L6;
        r14 = "";
    L6:
        if ((r26 & 4) == 0) goto L8;
        String r1 = "";
    L10:
        if ((r26 & 8) == 0) goto L12;
        String r3 = "";
    L14:
        if ((r26 & 16) == 0) goto L16;
        String r4 = "";
    L18:
        if ((r26 & 32) == 0) goto L20;
        String r5 = "";
    L22:
        if ((r26 & 64) == 0) goto L24;
        String r6 = "";
    L26:
        if ((r26 & 128) == 0) goto L28;
        String r7 = "";
    L30:
        if ((r26 & 256) == 0) goto L32;
        String r8 = "";
    L34:
        if ((r26 & 512) == 0) goto L36;
        String r9 = "";
    L38:
        if ((r26 & 1024) == 0) goto L40;
        String r10 = "";
    L42:
        if ((r26 & 2048) == 0) goto L44;
        String r11 = "";
    L46:
        if ((r26 & 4096) == 0) goto L49;
        String r272 = "";
    L50:
        this(r13, r14, r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r272);
        return;
    L49:
        r272 = r25;
        goto L50
    L44:
        r11 = r24;
        goto L46
    L40:
        r10 = r23;
        goto L42
    L36:
        r9 = r22;
        goto L38
    L32:
        r8 = r21;
        goto L34
    L28:
        r7 = r20;
        goto L30
    L24:
        r6 = r19;
        goto L26
    L20:
        r5 = r18;
        goto L22
    L16:
        r4 = r17;
        goto L18
    L12:
        r3 = r16;
        goto L14
    L8:
        r1 = r15;
        goto L10
    }
}
