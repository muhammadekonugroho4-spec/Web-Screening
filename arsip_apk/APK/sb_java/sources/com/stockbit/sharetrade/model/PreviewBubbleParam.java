package com.stockbit.sharetrade.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.stockbit.domain.model.type.securities.TradingActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u0007J\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0083\u0004J\n\u0010\"\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006)"}, d2 = {"Lcom/stockbit/sharetrade/model/PreviewBubbleParam;", "Landroid/os/Parcelable;", "symbol", "", "orderType", "Lcom/stockbit/domain/model/type/securities/TradingActionType;", "formattedOrderType", "", "formattedOrderPrice", "formattedOrderTime", "formattedOrderAmount", "<init>", "(Ljava/lang/String;Lcom/stockbit/domain/model/type/securities/TradingActionType;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getOrderType", "()Lcom/stockbit/domain/model/type/securities/TradingActionType;", "getFormattedOrderType", "()I", "getFormattedOrderPrice", "getFormattedOrderTime", "getFormattedOrderAmount", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sharetrade_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PreviewBubbleParam implements Parcelable {
    public static final Parcelable.Creator<PreviewBubbleParam> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f137155a;

    /* renamed from: b, reason: collision with root package name */
    public final TradingActionType f137156b;

    /* renamed from: c, reason: collision with root package name */
    public final int f137157c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f137158e;

    /* renamed from: f, reason: collision with root package name */
    public final String f137159f;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final PreviewBubbleParam a(Parcel r9) {
            p.l(r9, "parcel");
            String r2 = r9.readString();
            if (r9.readInt() != 0) goto L6;
            TradingActionType r02 = null;
        L5:
            TradingActionType r3 = r02;
            return new PreviewBubbleParam(r2, r3, r9.readInt(), r9.readString(), r9.readString(), r9.readString());
        L6:
            r02 = TradingActionType.valueOf(r9.readString());
            goto L5
        }

        public final PreviewBubbleParam[] b(int r1) {
            return new PreviewBubbleParam[r1];
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

    public PreviewBubbleParam(String r2, TradingActionType r3, int r4, String r5, String r6, String r7) {
        p.l(r2, "symbol");
        p.l(r5, "formattedOrderPrice");
        p.l(r6, "formattedOrderTime");
        p.l(r7, "formattedOrderAmount");
        this.f137155a = r2;
        this.f137156b = r3;
        this.f137157c = r4;
        this.d = r5;
        this.f137158e = r6;
        this.f137159f = r7;
    }

    public final String a() {
        return this.f137159f;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f137158e;
    }

    public final int d() {
        return this.f137157c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final TradingActionType e() {
        return this.f137156b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof PreviewBubbleParam) == true) goto L8;
        return false;
    L8:
        PreviewBubbleParam r52 = (PreviewBubbleParam) r5;
        if (p.g(this.f137155a, r52.f137155a) == true) goto L12;
        return false;
    L12:
        if (this.f137156b == r52.f137156b) goto L15;
        return false;
    L15:
        if (this.f137157c == r52.f137157c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f137158e, r52.f137158e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f137159f, r52.f137159f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f137155a;
    }

    public int hashCode() {
        int r02 = this.f137155a.hashCode() * 31;
        TradingActionType r1 = this.f137156b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((((((((r02 + r12) * 31) + Integer.hashCode(this.f137157c)) * 31) + this.d.hashCode()) * 31) + this.f137158e.hashCode()) * 31) + this.f137159f.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "PreviewBubbleParam(symbol=" + this.f137155a + ", orderType=" + this.f137156b + ", formattedOrderType=" + this.f137157c + ", formattedOrderPrice=" + this.d + ", formattedOrderTime=" + this.f137158e + ", formattedOrderAmount=" + this.f137159f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        p.l(r2, "dest");
        r2.writeString(this.f137155a);
        TradingActionType r32 = this.f137156b;
        if (r32 != null) goto L5;
        r2.writeInt(0);
    L6:
        r2.writeInt(this.f137157c);
        r2.writeString(this.d);
        r2.writeString(this.f137158e);
        r2.writeString(this.f137159f);
        return;
    L5:
        r2.writeInt(1);
        r2.writeString(r32.name());
        goto L6
    }
}
