package com.stockbit.component.orderbook.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0016JV\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020\u0005J\u0014\u0010$\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0083\u0004J\n\u0010'\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010(\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\n\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006."}, d2 = {"Lcom/stockbit/component/orderbook/model/OrderbookBestBidAskUIState;", "Landroid/os/Parcelable;", "bestBidPrice", "", "bestBidPriceColor", "", "bestBidQuantity", "bestAskPrice", "bestAskPriceColor", "bestAskQuantity", "isOpenMarket", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;)V", "getBestBidPrice", "()Ljava/lang/String;", "getBestBidPriceColor", "()I", "getBestBidQuantity", "getBestAskPrice", "getBestAskPriceColor", "getBestAskQuantity", "()Ljava/lang/Boolean;", "setOpenMarket", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;)Lcom/stockbit/component/orderbook/model/OrderbookBestBidAskUIState;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "orderbook_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OrderbookBestBidAskUIState implements Parcelable {
    public static final Parcelable.Creator<OrderbookBestBidAskUIState> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f73015a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73016b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73017c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final int f73018e;

    /* renamed from: f, reason: collision with root package name */
    public final String f73019f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f73020g;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final OrderbookBestBidAskUIState a(Parcel r10) {
            p.l(r10, "parcel");
            String r2 = r10.readString();
            int r3 = r10.readInt();
            String r4 = r10.readString();
            String r5 = r10.readString();
            int r6 = r10.readInt();
            String r7 = r10.readString();
            if (r10.readInt() != 0) goto L7;
            Boolean r102 = null;
        L12:
            return new OrderbookBestBidAskUIState(r2, r3, r4, r5, r6, r7, r102);
        L7:
            if (r10.readInt() == 0) goto L9;
            boolean r103 = true;
        L10:
            r102 = Boolean.valueOf(r103);
            goto L12
        L9:
            r103 = false;
            goto L10
        }

        public final OrderbookBestBidAskUIState[] b(int r1) {
            return new OrderbookBestBidAskUIState[r1];
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

    public OrderbookBestBidAskUIState(String r2, int r3, String r4, String r5, int r6, String r7, Boolean r8) {
        p.l(r2, "bestBidPrice");
        p.l(r4, "bestBidQuantity");
        p.l(r5, "bestAskPrice");
        p.l(r7, "bestAskQuantity");
        this.f73015a = r2;
        this.f73016b = r3;
        this.f73017c = r4;
        this.d = r5;
        this.f73018e = r6;
        this.f73019f = r7;
        this.f73020g = r8;
    }

    public final String a() {
        return this.d;
    }

    public final int b() {
        return this.f73018e;
    }

    public final String c() {
        return this.f73019f;
    }

    public final String d() {
        return this.f73015a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f73016b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OrderbookBestBidAskUIState) == true) goto L8;
        return false;
    L8:
        OrderbookBestBidAskUIState r52 = (OrderbookBestBidAskUIState) r5;
        if (p.g(this.f73015a, r52.f73015a) == true) goto L12;
        return false;
    L12:
        if (this.f73016b == r52.f73016b) goto L15;
        return false;
    L15:
        if (p.g(this.f73017c, r52.f73017c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f73018e == r52.f73018e) goto L24;
        return false;
    L24:
        if (p.g(this.f73019f, r52.f73019f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f73020g, r52.f73020g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f73017c;
    }

    public final Boolean g() {
        return this.f73020g;
    }

    public int hashCode() {
        int r02 = ((((((((((this.f73015a.hashCode() * 31) + Integer.hashCode(this.f73016b)) * 31) + this.f73017c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.f73018e)) * 31) + this.f73019f.hashCode()) * 31;
        Boolean r1 = this.f73020g;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "OrderbookBestBidAskUIState(bestBidPrice=" + this.f73015a + ", bestBidPriceColor=" + this.f73016b + ", bestBidQuantity=" + this.f73017c + ", bestAskPrice=" + this.d + ", bestAskPriceColor=" + this.f73018e + ", bestAskQuantity=" + this.f73019f + ", isOpenMarket=" + this.f73020g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        p.l(r2, "dest");
        r2.writeString(this.f73015a);
        r2.writeInt(this.f73016b);
        r2.writeString(this.f73017c);
        r2.writeString(this.d);
        r2.writeInt(this.f73018e);
        r2.writeString(this.f73019f);
        Boolean r32 = this.f73020g;
        if (r32 != null) goto L6;
        r2.writeInt(0);
        return;
    L6:
        r2.writeInt(1);
        r2.writeInt(r32.booleanValue() ? 1 : 0);
    }

    public /* synthetic */ OrderbookBestBidAskUIState(String r10, int r11, String r12, String r13, int r14, String r15, Boolean r16, int r17, kotlin.jvm.internal.i r18) {
        if ((r17 & 64) == 0) goto L6;
        Boolean r8 = null;
    L7:
        this(r10, r11, r12, r13, r14, r15, r8);
        return;
    L6:
        r8 = r16;
        goto L7
    }
}
