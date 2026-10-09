package com.stockbit.domain.model.entity.sharetrade;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.stockbit.domain.model.type.securities.TradingActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003J\u007f\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0006\u0010)\u001a\u00020*J\u0014\u0010+\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0083\u0004J\n\u0010.\u001a\u00020*HÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00065"}, d2 = {"Lcom/stockbit/domain/model/entity/sharetrade/AutoShareArgs;", "Landroid/os/Parcelable;", "orderId", "", "orderType", "Lcom/stockbit/domain/model/type/securities/TradingActionType;", "symbol", "triggerPrice", "orderPrice", "statusOrder", "orderTime", "orderedAmount", "orderLot", "sendPrice", "", "<init>", "(Ljava/lang/String;Lcom/stockbit/domain/model/type/securities/TradingActionType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getOrderId", "()Ljava/lang/String;", "getOrderType", "()Lcom/stockbit/domain/model/type/securities/TradingActionType;", "getSymbol", "getTriggerPrice", "getOrderPrice", "getStatusOrder", "getOrderTime", "getOrderedAmount", "getOrderLot", "getSendPrice", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AutoShareArgs implements Parcelable {
    public static final Parcelable.Creator<AutoShareArgs> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f83574a;

    /* renamed from: b, reason: collision with root package name */
    public final TradingActionType f83575b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83576c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f83577e;

    /* renamed from: f, reason: collision with root package name */
    public final String f83578f;

    /* renamed from: g, reason: collision with root package name */
    public final String f83579g;

    /* renamed from: h, reason: collision with root package name */
    public final String f83580h;

    /* renamed from: i, reason: collision with root package name */
    public final String f83581i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f83582j;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final AutoShareArgs a(Parcel r13) {
            p.l(r13, "parcel");
            String r2 = r13.readString();
            if (r13.readInt() != 0) goto L6;
            TradingActionType r02 = null;
        L5:
            TradingActionType r3 = r02;
            String r4 = r13.readString();
            String r5 = r13.readString();
            String r6 = r13.readString();
            String r7 = r13.readString();
            String r8 = r13.readString();
            String r9 = r13.readString();
            String r10 = r13.readString();
            if (r13.readInt() == 0) goto L11;
            boolean r132 = true;
        L13:
            return new AutoShareArgs(r2, r3, r4, r5, r6, r7, r8, r9, r10, r132);
        L11:
            r132 = false;
            goto L13
        L6:
            r02 = TradingActionType.valueOf(r13.readString());
            goto L5
        }

        public final AutoShareArgs[] b(int r1) {
            return new AutoShareArgs[r1];
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

    public AutoShareArgs(String r1, TradingActionType r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, boolean r10) {
        this.f83574a = r1;
        this.f83575b = r2;
        this.f83576c = r3;
        this.d = r4;
        this.f83577e = r5;
        this.f83578f = r6;
        this.f83579g = r7;
        this.f83580h = r8;
        this.f83581i = r9;
        this.f83582j = r10;
    }

    public final String a() {
        return this.f83574a;
    }

    public final String b() {
        return this.f83581i;
    }

    public final String c() {
        return this.f83577e;
    }

    public final String d() {
        return this.f83579g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final TradingActionType e() {
        return this.f83575b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AutoShareArgs) == true) goto L8;
        return false;
    L8:
        AutoShareArgs r52 = (AutoShareArgs) r5;
        if (p.g(this.f83574a, r52.f83574a) == true) goto L12;
        return false;
    L12:
        if (this.f83575b == r52.f83575b) goto L15;
        return false;
    L15:
        if (p.g(this.f83576c, r52.f83576c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f83577e, r52.f83577e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f83578f, r52.f83578f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f83579g, r52.f83579g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f83580h, r52.f83580h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f83581i, r52.f83581i) == true) goto L36;
        return false;
    L36:
        if (this.f83582j == r52.f83582j) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f83580h;
    }

    public final boolean g() {
        return this.f83582j;
    }

    public final String h() {
        return this.f83578f;
    }

    public int hashCode() {
        String r02 = this.f83574a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        TradingActionType r2 = this.f83575b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f83576c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f83577e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f83578f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f83579g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f83580h;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.f83581i;
        if (r215 == null) goto L39;
        r1 = r215.hashCode();
    L39:
        return ((r011 + r1) * 31) + Boolean.hashCode(this.f83582j);
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
        return this.f83576c;
    }

    public final String j() {
        return this.d;
    }

    public String toString() {
        return "AutoShareArgs(orderId=" + this.f83574a + ", orderType=" + this.f83575b + ", symbol=" + this.f83576c + ", triggerPrice=" + this.d + ", orderPrice=" + this.f83577e + ", statusOrder=" + this.f83578f + ", orderTime=" + this.f83579g + ", orderedAmount=" + this.f83580h + ", orderLot=" + this.f83581i + ", sendPrice=" + this.f83582j + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        p.l(r2, "dest");
        r2.writeString(this.f83574a);
        TradingActionType r32 = this.f83575b;
        if (r32 != null) goto L5;
        r2.writeInt(0);
    L6:
        r2.writeString(this.f83576c);
        r2.writeString(this.d);
        r2.writeString(this.f83577e);
        r2.writeString(this.f83578f);
        r2.writeString(this.f83579g);
        r2.writeString(this.f83580h);
        r2.writeString(this.f83581i);
        r2.writeInt(this.f83582j ? 1 : 0);
        return;
    L5:
        r2.writeInt(1);
        r2.writeString(r32.name());
        goto L6
    }
}
