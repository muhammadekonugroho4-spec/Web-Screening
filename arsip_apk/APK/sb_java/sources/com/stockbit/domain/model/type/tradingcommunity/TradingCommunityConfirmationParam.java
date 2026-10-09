package com.stockbit.domain.model.type.tradingcommunity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\u0017\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0012HÆ\u0003J\t\u00101\u001a\u00020\u0012HÆ\u0003J\u0099\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001J\u0006\u00103\u001a\u00020\u000eJ\u0014\u00104\u001a\u00020\u00122\b\u00105\u001a\u0004\u0018\u000106HÖ\u0083\u0004J\n\u00107\u001a\u00020\u000eHÖ\u0081\u0004J\n\u00108\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010$R\u0011\u0010\u0013\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010$¨\u0006>"}, d2 = {"Lcom/stockbit/domain/model/type/tradingcommunity/TradingCommunityConfirmationParam;", "Landroid/os/Parcelable;", "communityCode", "", "communityName", "leaveDate", "newBuyFeeTotal", "newSellFeeTotal", "oldBuyFeeTotal", "oldSellFeeTotal", "minimumTradingBalance", "", "tradingBalanceFormatted", "Lkotlin/Pair;", "", "minimumBalanceFormatted", "leaderFullName", "isLeaderHasPILicense", "", "isLowBalance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlin/Pair;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getCommunityCode", "()Ljava/lang/String;", "getCommunityName", "getLeaveDate", "getNewBuyFeeTotal", "getNewSellFeeTotal", "getOldBuyFeeTotal", "getOldSellFeeTotal", "getMinimumTradingBalance", "()D", "getTradingBalanceFormatted", "()Lkotlin/Pair;", "getMinimumBalanceFormatted", "getLeaderFullName", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", Constants.COPY_TYPE, "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TradingCommunityConfirmationParam implements Parcelable {
    public static final Parcelable.Creator<TradingCommunityConfirmationParam> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f86513a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86514b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86515c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f86516e;

    /* renamed from: f, reason: collision with root package name */
    public final String f86517f;

    /* renamed from: g, reason: collision with root package name */
    public final String f86518g;

    /* renamed from: h, reason: collision with root package name */
    public final double f86519h;

    /* renamed from: i, reason: collision with root package name */
    public final Pair f86520i;

    /* renamed from: j, reason: collision with root package name */
    public final String f86521j;

    /* renamed from: k, reason: collision with root package name */
    public final String f86522k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f86523l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f86524m;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final TradingCommunityConfirmationParam a(Parcel r18) {
            p.l(r18, "parcel");
            String r2 = r18.readString();
            String r3 = r18.readString();
            String r4 = r18.readString();
            String r5 = r18.readString();
            String r6 = r18.readString();
            String r7 = r18.readString();
            String r8 = r18.readString();
            double r9 = r18.readDouble();
            Pair r11 = (Pair) r18.readSerializable();
            String r12 = r18.readString();
            String r13 = r18.readString();
            boolean r14 = false;
            boolean r15 = true;
            if (r18.readInt() == 0) goto L5;
            boolean r02 = false;
            r14 = true;
        L7:
            if (r18.readInt() != 0) goto L11;
            r15 = r02;
        L11:
            return new TradingCommunityConfirmationParam(r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15);
        L5:
            r02 = false;
            goto L7
        }

        public final TradingCommunityConfirmationParam[] b(int r1) {
            return new TradingCommunityConfirmationParam[r1];
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

    public TradingCommunityConfirmationParam(String r2, String r3, String r4, String r5, String r6, String r7, String r8, double r9, Pair r11, String r12, String r13, boolean r14, boolean r15) {
        p.l(r2, "communityCode");
        p.l(r3, "communityName");
        p.l(r4, "leaveDate");
        p.l(r5, "newBuyFeeTotal");
        p.l(r6, "newSellFeeTotal");
        p.l(r7, "oldBuyFeeTotal");
        p.l(r8, "oldSellFeeTotal");
        p.l(r12, "minimumBalanceFormatted");
        p.l(r13, "leaderFullName");
        this.f86513a = r2;
        this.f86514b = r3;
        this.f86515c = r4;
        this.d = r5;
        this.f86516e = r6;
        this.f86517f = r7;
        this.f86518g = r8;
        this.f86519h = r9;
        this.f86520i = r11;
        this.f86521j = r12;
        this.f86522k = r13;
        this.f86523l = r14;
        this.f86524m = r15;
    }

    public static /* synthetic */ TradingCommunityConfirmationParam b(TradingCommunityConfirmationParam r14, String r15, String r16, String r17, String r18, String r19, String r20, String r21, double r22, Pair r24, String r25, String r26, boolean r27, boolean r28, int r29, Object r30) {
        if ((r29 & 1) == 0) goto L5;
        String r1 = r14.f86513a;
    L7:
        if ((r29 & 2) == 0) goto L9;
        String r2 = r14.f86514b;
    L11:
        if ((r29 & 4) == 0) goto L13;
        String r3 = r14.f86515c;
    L15:
        if ((r29 & 8) == 0) goto L17;
        String r4 = r14.d;
    L19:
        if ((r29 & 16) == 0) goto L21;
        String r5 = r14.f86516e;
    L23:
        if ((r29 & 32) == 0) goto L25;
        String r6 = r14.f86517f;
    L27:
        if ((r29 & 64) == 0) goto L29;
        String r7 = r14.f86518g;
    L31:
        if ((r29 & 128) == 0) goto L33;
        double r8 = r14.f86519h;
    L35:
        if ((r29 & 256) == 0) goto L37;
        Pair r10 = r14.f86520i;
    L39:
        if ((r29 & 512) == 0) goto L41;
        String r11 = r14.f86521j;
    L43:
        if ((r29 & 1024) == 0) goto L45;
        String r12 = r14.f86522k;
    L47:
        if ((r29 & 2048) == 0) goto L49;
        boolean r13 = r14.f86523l;
    L51:
        if ((r29 & 4096) == 0) goto L54;
        boolean r292 = r14.f86524m;
    L56:
        return r14.a(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r292);
    L54:
        r292 = r28;
        goto L56
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
        r8 = r22;
        goto L35
    L29:
        r7 = r21;
        goto L31
    L25:
        r6 = r20;
        goto L27
    L21:
        r5 = r19;
        goto L23
    L17:
        r4 = r18;
        goto L19
    L13:
        r3 = r17;
        goto L15
    L9:
        r2 = r16;
        goto L11
    L5:
        r1 = r15;
        goto L7
    }

    public final TradingCommunityConfirmationParam a(String r17, String r18, String r19, String r20, String r21, String r22, String r23, double r24, Pair r26, String r27, String r28, boolean r29, boolean r30) {
        p.l(r17, "communityCode");
        p.l(r18, "communityName");
        p.l(r19, "leaveDate");
        p.l(r20, "newBuyFeeTotal");
        p.l(r21, "newSellFeeTotal");
        p.l(r22, "oldBuyFeeTotal");
        p.l(r23, "oldSellFeeTotal");
        p.l(r27, "minimumBalanceFormatted");
        p.l(r28, "leaderFullName");
        return new TradingCommunityConfirmationParam(r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30);
    }

    public final String c() {
        return this.f86513a;
    }

    public final String d() {
        return this.f86514b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f86522k;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof TradingCommunityConfirmationParam) == true) goto L8;
        return false;
    L8:
        TradingCommunityConfirmationParam r82 = (TradingCommunityConfirmationParam) r8;
        if (p.g(this.f86513a, r82.f86513a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86514b, r82.f86514b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86515c, r82.f86515c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f86516e, r82.f86516e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f86517f, r82.f86517f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f86518g, r82.f86518g) == true) goto L30;
        return false;
    L30:
        if (Double.compare(this.f86519h, r82.f86519h) == 0) goto L33;
        return false;
    L33:
        if (p.g(this.f86520i, r82.f86520i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f86521j, r82.f86521j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f86522k, r82.f86522k) == true) goto L42;
        return false;
    L42:
        if (this.f86523l == r82.f86523l) goto L45;
        return false;
    L45:
        if (this.f86524m == r82.f86524m) goto L47;
        return false;
    L47:
        return true;
    }

    public final String f() {
        return this.f86515c;
    }

    public final String g() {
        return this.f86521j;
    }

    public final double h() {
        return this.f86519h;
    }

    public int hashCode() {
        int r02 = ((((((((((((((this.f86513a.hashCode() * 31) + this.f86514b.hashCode()) * 31) + this.f86515c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f86516e.hashCode()) * 31) + this.f86517f.hashCode()) * 31) + this.f86518g.hashCode()) * 31) + Double.hashCode(this.f86519h)) * 31;
        Pair r1 = this.f86520i;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((((((((r02 + r12) * 31) + this.f86521j.hashCode()) * 31) + this.f86522k.hashCode()) * 31) + Boolean.hashCode(this.f86523l)) * 31) + Boolean.hashCode(this.f86524m);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final String i() {
        return this.d;
    }

    public final String j() {
        return this.f86516e;
    }

    public final String k() {
        return this.f86517f;
    }

    public final String l() {
        return this.f86518g;
    }

    public final Pair m() {
        return this.f86520i;
    }

    public final boolean n() {
        return this.f86523l;
    }

    public final boolean o() {
        return this.f86524m;
    }

    public String toString() {
        return "TradingCommunityConfirmationParam(communityCode=" + this.f86513a + ", communityName=" + this.f86514b + ", leaveDate=" + this.f86515c + ", newBuyFeeTotal=" + this.d + ", newSellFeeTotal=" + this.f86516e + ", oldBuyFeeTotal=" + this.f86517f + ", oldSellFeeTotal=" + this.f86518g + ", minimumTradingBalance=" + this.f86519h + ", tradingBalanceFormatted=" + this.f86520i + ", minimumBalanceFormatted=" + this.f86521j + ", leaderFullName=" + this.f86522k + ", isLeaderHasPILicense=" + this.f86523l + ", isLowBalance=" + this.f86524m + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeString(this.f86513a);
        r3.writeString(this.f86514b);
        r3.writeString(this.f86515c);
        r3.writeString(this.d);
        r3.writeString(this.f86516e);
        r3.writeString(this.f86517f);
        r3.writeString(this.f86518g);
        r3.writeDouble(this.f86519h);
        r3.writeSerializable(this.f86520i);
        r3.writeString(this.f86521j);
        r3.writeString(this.f86522k);
        r3.writeInt(this.f86523l ? 1 : 0);
        r3.writeInt(this.f86524m ? 1 : 0);
    }
}
