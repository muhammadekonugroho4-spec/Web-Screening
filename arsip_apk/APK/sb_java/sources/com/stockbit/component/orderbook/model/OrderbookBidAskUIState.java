package com.stockbit.component.orderbook.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0014\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0083\u0004J\n\u0010(\u001a\u00020#HÖ\u0081\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006/"}, d2 = {"Lcom/stockbit/component/orderbook/model/OrderbookBidAskUIState;", "Landroid/os/Parcelable;", "freq", "", "lot", "value", "indicator", "", "type", "Lcom/stockbit/component/orderbook/model/OBBidAskValueViewType;", "freqDouble", "", "lotDouble", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/stockbit/component/orderbook/model/OBBidAskValueViewType;DD)V", "getFreq", "()Ljava/lang/String;", "getLot", "getValue", "getIndicator", "()F", "getType", "()Lcom/stockbit/component/orderbook/model/OBBidAskValueViewType;", "getFreqDouble", "()D", "getLotDouble", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "orderbook_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OrderbookBidAskUIState implements Parcelable {
    public static final Parcelable.Creator<OrderbookBidAskUIState> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f73021a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73022b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73023c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final OBBidAskValueViewType f73024e;

    /* renamed from: f, reason: collision with root package name */
    public final double f73025f;

    /* renamed from: g, reason: collision with root package name */
    public final double f73026g;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final OrderbookBidAskUIState a(Parcel r12) {
            p.l(r12, "parcel");
            return new OrderbookBidAskUIState(r12.readString(), r12.readString(), r12.readString(), r12.readFloat(), OBBidAskValueViewType.valueOf(r12.readString()), r12.readDouble(), r12.readDouble());
        }

        public final OrderbookBidAskUIState[] b(int r1) {
            return new OrderbookBidAskUIState[r1];
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

    public OrderbookBidAskUIState(String r2, String r3, String r4, float r5, OBBidAskValueViewType r6, double r7, double r9) {
        p.l(r2, "freq");
        p.l(r3, "lot");
        p.l(r4, "value");
        p.l(r6, "type");
        this.f73021a = r2;
        this.f73022b = r3;
        this.f73023c = r4;
        this.d = r5;
        this.f73024e = r6;
        this.f73025f = r7;
        this.f73026g = r9;
    }

    public final String a() {
        return this.f73021a;
    }

    public final float b() {
        return this.d;
    }

    public final String c() {
        return this.f73022b;
    }

    public final OBBidAskValueViewType d() {
        return this.f73024e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f73023c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof OrderbookBidAskUIState) == true) goto L8;
        return false;
    L8:
        OrderbookBidAskUIState r82 = (OrderbookBidAskUIState) r8;
        if (p.g(this.f73021a, r82.f73021a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f73022b, r82.f73022b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f73023c, r82.f73023c) == true) goto L18;
        return false;
    L18:
        if (Float.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (this.f73024e == r82.f73024e) goto L24;
        return false;
    L24:
        if (Double.compare(this.f73025f, r82.f73025f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f73026g, r82.f73026g) == 0) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        return (((((((((((this.f73021a.hashCode() * 31) + this.f73022b.hashCode()) * 31) + this.f73023c.hashCode()) * 31) + Float.hashCode(this.d)) * 31) + this.f73024e.hashCode()) * 31) + Double.hashCode(this.f73025f)) * 31) + Double.hashCode(this.f73026g);
    }

    public String toString() {
        return "OrderbookBidAskUIState(freq=" + this.f73021a + ", lot=" + this.f73022b + ", value=" + this.f73023c + ", indicator=" + this.d + ", type=" + this.f73024e + ", freqDouble=" + this.f73025f + ", lotDouble=" + this.f73026g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeString(this.f73021a);
        r3.writeString(this.f73022b);
        r3.writeString(this.f73023c);
        r3.writeFloat(this.d);
        r3.writeString(this.f73024e.name());
        r3.writeDouble(this.f73025f);
        r3.writeDouble(this.f73026g);
    }

    public /* synthetic */ OrderbookBidAskUIState(String r3, String r4, String r5, float r6, OBBidAskValueViewType r7, double r8, double r10, int r12, kotlin.jvm.internal.i r13) {
        if ((r12 & 32) == 0) goto L6;
        r8 = 0.0d;
    L6:
        if ((r12 & 64) == 0) goto L9;
        double r11 = 0.0d;
    L10:
        this(r3, r4, r5, r6, r7, r8, r11);
        return;
    L9:
        r11 = r10;
        goto L10
    }
}
