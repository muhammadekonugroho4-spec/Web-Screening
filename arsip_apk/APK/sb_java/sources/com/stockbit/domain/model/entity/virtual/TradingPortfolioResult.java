package com.stockbit.domain.model.entity.virtual;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.stockbit.domain.model.entity.securities.Notation;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010G\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0013HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00106J\u000b\u0010I\u001a\u0004\u0018\u00010\u0017HÆ\u0003Jà\u0001\u0010J\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010KJ\u0006\u0010L\u001a\u00020MJ\u0014\u0010N\u001a\u00020\u00152\b\u0010O\u001a\u0004\u0018\u00010PHÖ\u0083\u0004J\n\u0010Q\u001a\u00020MHÖ\u0081\u0004J\n\u0010R\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020MR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001b\"\u0004\b$\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001b\"\u0004\b(\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001b\"\u0004\b*\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001b\"\u0004\b.\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010 R%\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0013¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u00107\u001a\u0004\b5\u00106R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b8\u00109¨\u0006X"}, d2 = {"Lcom/stockbit/domain/model/entity/virtual/TradingPortfolioResult;", "Landroid/os/Parcelable;", "symbol", "", "companyName", "availableLot", "balanceLot", "sellOpen", "sellOpenToday", "total", FirebaseAnalytics.Param.PRICE, "priceAverage", "priceLatest", "unrealisedMarketvalue", "unrealisedProfitloss", "unrealisedGain", "notation", "Ljava/util/ArrayList;", "Lcom/stockbit/domain/model/entity/securities/Notation;", "Lkotlin/collections/ArrayList;", "uma", "", "corpAction", "Lcom/stockbit/domain/model/entity/virtual/CorpAction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Boolean;Lcom/stockbit/domain/model/entity/virtual/CorpAction;)V", "getSymbol", "()Ljava/lang/String;", "getCompanyName", "getAvailableLot", "getBalanceLot", "setBalanceLot", "(Ljava/lang/String;)V", "getSellOpen", "setSellOpen", "getSellOpenToday", "setSellOpenToday", "getTotal", "setTotal", "getPrice", "setPrice", "getPriceAverage", "setPriceAverage", "getPriceLatest", "setPriceLatest", "getUnrealisedMarketvalue", "setUnrealisedMarketvalue", "getUnrealisedProfitloss", "setUnrealisedProfitloss", "getUnrealisedGain", "setUnrealisedGain", "getNotation", "()Ljava/util/ArrayList;", "getUma", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCorpAction", "()Lcom/stockbit/domain/model/entity/virtual/CorpAction;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Boolean;Lcom/stockbit/domain/model/entity/virtual/CorpAction;)Lcom/stockbit/domain/model/entity/virtual/TradingPortfolioResult;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TradingPortfolioResult implements Parcelable {
    public static final Parcelable.Creator<TradingPortfolioResult> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f83822a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83823b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83824c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f83825e;

    /* renamed from: f, reason: collision with root package name */
    public String f83826f;

    /* renamed from: g, reason: collision with root package name */
    public String f83827g;

    /* renamed from: h, reason: collision with root package name */
    public String f83828h;

    /* renamed from: i, reason: collision with root package name */
    public String f83829i;

    /* renamed from: j, reason: collision with root package name */
    public String f83830j;

    /* renamed from: k, reason: collision with root package name */
    public String f83831k;

    /* renamed from: l, reason: collision with root package name */
    public String f83832l;

    /* renamed from: m, reason: collision with root package name */
    public String f83833m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f83834n;

    /* renamed from: o, reason: collision with root package name */
    public final Boolean f83835o;

    /* renamed from: p, reason: collision with root package name */
    public final CorpAction f83836p;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final TradingPortfolioResult a(Parcel r21) {
            p.l(r21, "parcel");
            String r3 = r21.readString();
            String r4 = r21.readString();
            String r5 = r21.readString();
            String r6 = r21.readString();
            String r7 = r21.readString();
            String r8 = r21.readString();
            String r9 = r21.readString();
            String r10 = r21.readString();
            String r11 = r21.readString();
            String r12 = r21.readString();
            String r13 = r21.readString();
            String r14 = r21.readString();
            String r15 = r21.readString();
            CorpAction r16 = null;
            if (r21.readInt() != 0) goto L5;
            String r18 = r3;
            ArrayList r2 = null;
        L9:
            if (r21.readInt() != 0) goto L12;
            Boolean r17 = null;
        L17:
            if (r21.readInt() == 0) goto L21;
            r16 = CorpAction.CREATOR.createFromParcel(r21);
        L21:
            return new TradingPortfolioResult(r18, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r17, r16);
        L12:
            if (r21.readInt() == 0) goto L14;
            boolean r1 = true;
        L15:
            r17 = Boolean.valueOf(r1);
            goto L17
        L14:
            r1 = false;
            goto L15
        L5:
            int r19 = r21.readInt();
            r2 = new ArrayList(r19);
            r18 = r3;
            int r32 = 0;
        L6:
            if (r32 == r19) goto L9;
            r2.add(Notation.CREATOR.createFromParcel(r21));
            r32 = r32 + 1;
            r19 = r19;
            goto L6
        }

        public final TradingPortfolioResult[] b(int r1) {
            return new TradingPortfolioResult[r1];
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

    public TradingPortfolioResult(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, ArrayList r14, Boolean r15, CorpAction r16) {
        this.f83822a = r1;
        this.f83823b = r2;
        this.f83824c = r3;
        this.d = r4;
        this.f83825e = r5;
        this.f83826f = r6;
        this.f83827g = r7;
        this.f83828h = r8;
        this.f83829i = r9;
        this.f83830j = r10;
        this.f83831k = r11;
        this.f83832l = r12;
        this.f83833m = r13;
        this.f83834n = r14;
        this.f83835o = r15;
        this.f83836p = r16;
    }

    public final String a() {
        return this.f83824c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f83823b;
    }

    public final CorpAction d() {
        return this.f83836p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ArrayList e() {
        return this.f83834n;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TradingPortfolioResult) == true) goto L8;
        return false;
    L8:
        TradingPortfolioResult r52 = (TradingPortfolioResult) r5;
        if (p.g(this.f83822a, r52.f83822a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f83823b, r52.f83823b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f83824c, r52.f83824c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f83825e, r52.f83825e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f83826f, r52.f83826f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f83827g, r52.f83827g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f83828h, r52.f83828h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f83829i, r52.f83829i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f83830j, r52.f83830j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f83831k, r52.f83831k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f83832l, r52.f83832l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f83833m, r52.f83833m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f83834n, r52.f83834n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f83835o, r52.f83835o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f83836p, r52.f83836p) == true) goto L56;
        return false;
    L56:
        return true;
    }

    public final String f() {
        return this.f83828h;
    }

    public final String g() {
        return this.f83829i;
    }

    public final String h() {
        return this.f83830j;
    }

    public int hashCode() {
        String r02 = this.f83822a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f83823b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f83824c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f83825e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f83826f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f83827g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f83828h;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.f83829i;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.f83830j;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.f83831k;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.f83832l;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        String r223 = this.f83833m;
        if (r223 != null) goto L53;
        int r224 = 0;
    L54:
        int r016 = (r015 + r224) * 31;
        ArrayList r225 = this.f83834n;
        if (r225 != null) goto L57;
        int r226 = 0;
    L58:
        int r017 = (r016 + r226) * 31;
        Boolean r227 = this.f83835o;
        if (r227 != null) goto L61;
        int r228 = 0;
    L62:
        int r018 = (r017 + r228) * 31;
        CorpAction r229 = this.f83836p;
        if (r229 == null) goto L67;
        r1 = r229.hashCode();
    L67:
        return r018 + r1;
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
        return this.f83822a;
    }

    public final String j() {
        return this.f83827g;
    }

    public final Boolean k() {
        return this.f83835o;
    }

    public final String l() {
        return this.f83833m;
    }

    public final String m() {
        return this.f83831k;
    }

    public final String n() {
        return this.f83832l;
    }

    public String toString() {
        return "TradingPortfolioResult(symbol=" + this.f83822a + ", companyName=" + this.f83823b + ", availableLot=" + this.f83824c + ", balanceLot=" + this.d + ", sellOpen=" + this.f83825e + ", sellOpenToday=" + this.f83826f + ", total=" + this.f83827g + ", price=" + this.f83828h + ", priceAverage=" + this.f83829i + ", priceLatest=" + this.f83830j + ", unrealisedMarketvalue=" + this.f83831k + ", unrealisedProfitloss=" + this.f83832l + ", unrealisedGain=" + this.f83833m + ", notation=" + this.f83834n + ", uma=" + this.f83835o + ", corpAction=" + this.f83836p + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        p.l(r5, "dest");
        r5.writeString(this.f83822a);
        r5.writeString(this.f83823b);
        r5.writeString(this.f83824c);
        r5.writeString(this.d);
        r5.writeString(this.f83825e);
        r5.writeString(this.f83826f);
        r5.writeString(this.f83827g);
        r5.writeString(this.f83828h);
        r5.writeString(this.f83829i);
        r5.writeString(this.f83830j);
        r5.writeString(this.f83831k);
        r5.writeString(this.f83832l);
        r5.writeString(this.f83833m);
        ArrayList r02 = this.f83834n;
        if (r02 != null) goto L5;
        r5.writeInt(0);
    L9:
        Boolean r03 = this.f83835o;
        if (r03 != null) goto L12;
        r5.writeInt(0);
    L13:
        CorpAction r04 = this.f83836p;
        if (r04 != null) goto L17;
        r5.writeInt(0);
        return;
    L17:
        r5.writeInt(1);
        r04.writeToParcel(r5, r6);
        return;
    L12:
        r5.writeInt(1);
        r5.writeInt(r03.booleanValue() ? 1 : 0);
        goto L13
    L5:
        r5.writeInt(1);
        r5.writeInt(r02.size());
        Iterator r05 = r02.iterator();
    L7:
        if (r05.hasNext() == false) goto L9;
        ((Notation) r05.next()).writeToParcel(r5, r6);
        goto L7
    }
}
