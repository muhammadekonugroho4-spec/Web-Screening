package com.stockbit.domain.model.entity.virtual;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\bI\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÝ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jß\u0001\u0010K\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010L\u001a\u00020MJ\u0014\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0083\u0004J\n\u0010R\u001a\u00020MHÖ\u0081\u0004J\n\u0010S\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020MR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001eR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010\u001eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u0010\u001eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0018\"\u0004\b8\u0010\u001e¨\u0006Y"}, d2 = {"Lcom/stockbit/domain/model/entity/virtual/TradingOrderList;", "Landroid/os/Parcelable;", Constants.KEY_ACTION, "", "amountInvested", "amountMatched", "amountFee", "orderDone", "orderTotal", "orderid", "marketOrderid", FirebaseAnalytics.Param.PRICE, "priceAverage", "priceOrder", NotificationCompat.CATEGORY_STATUS, "message", "symbol", "time_open", "gtc", "gtcExpired", "gtcStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getAmountInvested", "getAmountMatched", "getAmountFee", "getOrderDone", "setOrderDone", "(Ljava/lang/String;)V", "getOrderTotal", "setOrderTotal", "getOrderid", "setOrderid", "getMarketOrderid", "setMarketOrderid", "getPrice", "setPrice", "getPriceAverage", "setPriceAverage", "getPriceOrder", "setPriceOrder", "getStatus", "setStatus", "getMessage", "setMessage", "getSymbol", "setSymbol", "getTime_open", "setTime_open", "getGtc", "setGtc", "getGtcExpired", "setGtcExpired", "getGtcStatus", "setGtcStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TradingOrderList implements Parcelable {
    public static final Parcelable.Creator<TradingOrderList> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f83805a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83806b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83807c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public String f83808e;

    /* renamed from: f, reason: collision with root package name */
    public String f83809f;

    /* renamed from: g, reason: collision with root package name */
    public String f83810g;

    /* renamed from: h, reason: collision with root package name */
    public String f83811h;

    /* renamed from: i, reason: collision with root package name */
    public String f83812i;

    /* renamed from: j, reason: collision with root package name */
    public String f83813j;

    /* renamed from: k, reason: collision with root package name */
    public String f83814k;

    /* renamed from: l, reason: collision with root package name */
    public String f83815l;

    /* renamed from: m, reason: collision with root package name */
    public String f83816m;

    /* renamed from: n, reason: collision with root package name */
    public String f83817n;

    /* renamed from: o, reason: collision with root package name */
    public String f83818o;

    /* renamed from: p, reason: collision with root package name */
    public String f83819p;

    /* renamed from: q, reason: collision with root package name */
    public String f83820q;

    /* renamed from: r, reason: collision with root package name */
    public String f83821r;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final TradingOrderList a(Parcel r21) {
            p.l(r21, "parcel");
            return new TradingOrderList(r21.readString(), r21.readString(), r21.readString(), r21.readString(), r21.readString(), r21.readString(), r21.readString(), r21.readString(), r21.readString(), r21.readString(), r21.readString(), r21.readString(), r21.readString(), r21.readString(), r21.readString(), r21.readString(), r21.readString(), r21.readString());
        }

        public final TradingOrderList[] b(int r1) {
            return new TradingOrderList[r1];
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

    public TradingOrderList(String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, String r14, String r15, String r16, String r17, String r18, String r19, String r20) {
        p.l(r18, "gtc");
        this.f83805a = r3;
        this.f83806b = r4;
        this.f83807c = r5;
        this.d = r6;
        this.f83808e = r7;
        this.f83809f = r8;
        this.f83810g = r9;
        this.f83811h = r10;
        this.f83812i = r11;
        this.f83813j = r12;
        this.f83814k = r13;
        this.f83815l = r14;
        this.f83816m = r15;
        this.f83817n = r16;
        this.f83818o = r17;
        this.f83819p = r18;
        this.f83820q = r19;
        this.f83821r = r20;
    }

    public final String a() {
        return this.f83805a;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f83806b;
    }

    public final String d() {
        return this.f83807c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f83819p;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TradingOrderList) == true) goto L8;
        return false;
    L8:
        TradingOrderList r52 = (TradingOrderList) r5;
        if (p.g(this.f83805a, r52.f83805a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f83806b, r52.f83806b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f83807c, r52.f83807c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f83808e, r52.f83808e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f83809f, r52.f83809f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f83810g, r52.f83810g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f83811h, r52.f83811h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f83812i, r52.f83812i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f83813j, r52.f83813j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f83814k, r52.f83814k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f83815l, r52.f83815l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f83816m, r52.f83816m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f83817n, r52.f83817n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f83818o, r52.f83818o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f83819p, r52.f83819p) == true) goto L57;
        return false;
    L57:
        if (p.g(this.f83820q, r52.f83820q) == true) goto L60;
        return false;
    L60:
        if (p.g(this.f83821r, r52.f83821r) == true) goto L62;
        return false;
    L62:
        return true;
    }

    public final String f() {
        return this.f83820q;
    }

    public final String g() {
        return this.f83821r;
    }

    public final String h() {
        return this.f83816m;
    }

    public int hashCode() {
        String r02 = this.f83805a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f83806b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f83807c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f83808e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f83809f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f83810g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f83811h;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.f83812i;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.f83813j;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.f83814k;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.f83815l;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        String r223 = this.f83816m;
        if (r223 != null) goto L53;
        int r224 = 0;
    L54:
        int r016 = (r015 + r224) * 31;
        String r225 = this.f83817n;
        if (r225 != null) goto L57;
        int r226 = 0;
    L58:
        int r017 = (r016 + r226) * 31;
        String r227 = this.f83818o;
        if (r227 != null) goto L61;
        int r228 = 0;
    L62:
        int r018 = (((r017 + r228) * 31) + this.f83819p.hashCode()) * 31;
        String r229 = this.f83820q;
        if (r229 != null) goto L65;
        int r230 = 0;
    L66:
        int r019 = (r018 + r230) * 31;
        String r231 = this.f83821r;
        if (r231 == null) goto L71;
        r1 = r231.hashCode();
    L71:
        return r019 + r1;
    L65:
        r230 = r229.hashCode();
        goto L66
    L61:
        r228 = r227.hashCode();
        goto L62
    L57:
        r226 = r225.hashCode();
        goto L58
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
        return this.f83808e;
    }

    public final String j() {
        return this.f83809f;
    }

    public final String k() {
        return this.f83810g;
    }

    public final String l() {
        return this.f83812i;
    }

    public final String m() {
        return this.f83814k;
    }

    public final String n() {
        return this.f83815l;
    }

    public final String o() {
        return this.f83817n;
    }

    public String toString() {
        return "TradingOrderList(action=" + this.f83805a + ", amountInvested=" + this.f83806b + ", amountMatched=" + this.f83807c + ", amountFee=" + this.d + ", orderDone=" + this.f83808e + ", orderTotal=" + this.f83809f + ", orderid=" + this.f83810g + ", marketOrderid=" + this.f83811h + ", price=" + this.f83812i + ", priceAverage=" + this.f83813j + ", priceOrder=" + this.f83814k + ", status=" + this.f83815l + ", message=" + this.f83816m + ", symbol=" + this.f83817n + ", time_open=" + this.f83818o + ", gtc=" + this.f83819p + ", gtcExpired=" + this.f83820q + ", gtcStatus=" + this.f83821r + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f83805a);
        r1.writeString(this.f83806b);
        r1.writeString(this.f83807c);
        r1.writeString(this.d);
        r1.writeString(this.f83808e);
        r1.writeString(this.f83809f);
        r1.writeString(this.f83810g);
        r1.writeString(this.f83811h);
        r1.writeString(this.f83812i);
        r1.writeString(this.f83813j);
        r1.writeString(this.f83814k);
        r1.writeString(this.f83815l);
        r1.writeString(this.f83816m);
        r1.writeString(this.f83817n);
        r1.writeString(this.f83818o);
        r1.writeString(this.f83819p);
        r1.writeString(this.f83820q);
        r1.writeString(this.f83821r);
    }
}
