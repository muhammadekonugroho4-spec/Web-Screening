package com.stockbit.domain.model.entity.withdrawal.balance;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003Jm\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001J\u0006\u0010%\u001a\u00020&J\u0014\u0010'\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0083\u0004J\n\u0010*\u001a\u00020&HÖ\u0081\u0004J\n\u0010+\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0018¨\u00061"}, d2 = {"Lcom/stockbit/domain/model/entity/withdrawal/balance/Balance;", "Landroid/os/Parcelable;", "transactionFormatIdr", "", "pendingFormatIdr", "withdrawFormatIdr", "leverageLiabilityFormatIdr", "netWithdrawableFormatIdr", "withdrawFormatNonFractionNumberWithRoundDown", "cashSweepPendingFormatIdr", "isShowCashSweepPending", "", "cashSweepPendingRedemptionFormatIdr", "isShowCashSweepPendingRedemption", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Z)V", "getTransactionFormatIdr", "()Ljava/lang/String;", "getPendingFormatIdr", "getWithdrawFormatIdr", "getLeverageLiabilityFormatIdr", "getNetWithdrawableFormatIdr", "getWithdrawFormatNonFractionNumberWithRoundDown", "getCashSweepPendingFormatIdr", "()Z", "getCashSweepPendingRedemptionFormatIdr", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Balance implements Parcelable {
    public static final Parcelable.Creator<Balance> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f83928a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83929b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83930c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f83931e;

    /* renamed from: f, reason: collision with root package name */
    public final String f83932f;

    /* renamed from: g, reason: collision with root package name */
    public final String f83933g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f83934h;

    /* renamed from: i, reason: collision with root package name */
    public final String f83935i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f83936j;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final Balance a(Parcel r13) {
            p.l(r13, "parcel");
            String r2 = r13.readString();
            String r3 = r13.readString();
            String r4 = r13.readString();
            String r5 = r13.readString();
            String r6 = r13.readString();
            String r7 = r13.readString();
            String r8 = r13.readString();
            boolean r9 = false;
            if (r13.readInt() == 0) goto L5;
            boolean r02 = false;
            r9 = true;
            boolean r11 = true;
        L6:
            String r10 = r13.readString();
            if (r13.readInt() != 0) goto L11;
            r11 = r02;
        L11:
            return new Balance(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
        L5:
            r02 = false;
            r11 = true;
            goto L6
        }

        public final Balance[] b(int r1) {
            return new Balance[r1];
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

    public Balance(String r2, String r3, String r4, String r5, String r6, String r7, String r8, boolean r9, String r10, boolean r11) {
        p.l(r2, "transactionFormatIdr");
        p.l(r3, "pendingFormatIdr");
        p.l(r4, "withdrawFormatIdr");
        p.l(r5, "leverageLiabilityFormatIdr");
        p.l(r6, "netWithdrawableFormatIdr");
        p.l(r7, "withdrawFormatNonFractionNumberWithRoundDown");
        p.l(r8, "cashSweepPendingFormatIdr");
        p.l(r10, "cashSweepPendingRedemptionFormatIdr");
        this.f83928a = r2;
        this.f83929b = r3;
        this.f83930c = r4;
        this.d = r5;
        this.f83931e = r6;
        this.f83932f = r7;
        this.f83933g = r8;
        this.f83934h = r9;
        this.f83935i = r10;
        this.f83936j = r11;
    }

    public final String a() {
        return this.f83933g;
    }

    public final String b() {
        return this.f83935i;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f83931e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f83929b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Balance) == true) goto L8;
        return false;
    L8:
        Balance r52 = (Balance) r5;
        if (p.g(this.f83928a, r52.f83928a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f83929b, r52.f83929b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f83930c, r52.f83930c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f83931e, r52.f83931e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f83932f, r52.f83932f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f83933g, r52.f83933g) == true) goto L30;
        return false;
    L30:
        if (this.f83934h == r52.f83934h) goto L33;
        return false;
    L33:
        if (p.g(this.f83935i, r52.f83935i) == true) goto L36;
        return false;
    L36:
        if (this.f83936j == r52.f83936j) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f83928a;
    }

    public final String g() {
        return this.f83930c;
    }

    public final String h() {
        return this.f83932f;
    }

    public int hashCode() {
        return (((((((((((((((((this.f83928a.hashCode() * 31) + this.f83929b.hashCode()) * 31) + this.f83930c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f83931e.hashCode()) * 31) + this.f83932f.hashCode()) * 31) + this.f83933g.hashCode()) * 31) + Boolean.hashCode(this.f83934h)) * 31) + this.f83935i.hashCode()) * 31) + Boolean.hashCode(this.f83936j);
    }

    public final boolean i() {
        return this.f83934h;
    }

    public final boolean j() {
        return this.f83936j;
    }

    public String toString() {
        return "Balance(transactionFormatIdr=" + this.f83928a + ", pendingFormatIdr=" + this.f83929b + ", withdrawFormatIdr=" + this.f83930c + ", leverageLiabilityFormatIdr=" + this.d + ", netWithdrawableFormatIdr=" + this.f83931e + ", withdrawFormatNonFractionNumberWithRoundDown=" + this.f83932f + ", cashSweepPendingFormatIdr=" + this.f83933g + ", isShowCashSweepPending=" + this.f83934h + ", cashSweepPendingRedemptionFormatIdr=" + this.f83935i + ", isShowCashSweepPendingRedemption=" + this.f83936j + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f83928a);
        r1.writeString(this.f83929b);
        r1.writeString(this.f83930c);
        r1.writeString(this.d);
        r1.writeString(this.f83931e);
        r1.writeString(this.f83932f);
        r1.writeString(this.f83933g);
        r1.writeInt(this.f83934h ? 1 : 0);
        r1.writeString(this.f83935i);
        r1.writeInt(this.f83936j ? 1 : 0);
    }

    public /* synthetic */ Balance(String r3, String r4, String r5, String r6, String r7, String r8, String r9, boolean r10, String r11, boolean r12, int r13, i r14) {
        if ((r13 & 1) == 0) goto L6;
        r3 = "0";
    L6:
        if ((r13 & 2) == 0) goto L9;
        r4 = "0";
    L9:
        if ((r13 & 4) == 0) goto L12;
        r5 = "0";
    L12:
        if ((r13 & 8) == 0) goto L15;
        r6 = "0";
    L15:
        if ((r13 & 16) == 0) goto L18;
        r7 = "0";
    L18:
        if ((r13 & 32) == 0) goto L21;
        r8 = "0";
    L21:
        if ((r13 & 64) == 0) goto L24;
        r9 = "0";
    L24:
        if ((r13 & 128) == 0) goto L27;
        r10 = false;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r11 = "0";
    L30:
        if ((r13 & 512) == 0) goto L33;
        boolean r132 = false;
    L32:
        String r122 = r11;
        boolean r112 = r10;
        String r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        this(r3, r4, r62, r72, r82, r92, r102, r112, r122, r132);
        return;
    L33:
        r132 = r12;
        goto L32
    }
}
