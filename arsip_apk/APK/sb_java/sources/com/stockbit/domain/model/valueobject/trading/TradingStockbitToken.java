package com.stockbit.domain.model.valueobject.trading;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/stockbit/domain/model/valueobject/trading/TradingStockbitToken;", "Landroid/os/Parcelable;", "token", "", "message", "target", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getMessage", "getTarget", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TradingStockbitToken implements Parcelable {
    public static final Parcelable.Creator<TradingStockbitToken> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f87201a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87202b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87203c;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final TradingStockbitToken a(Parcel r4) {
            p.l(r4, "parcel");
            return new TradingStockbitToken(r4.readString(), r4.readString(), r4.readString());
        }

        public final TradingStockbitToken[] b(int r1) {
            return new TradingStockbitToken[r1];
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

    public TradingStockbitToken(String r2, String r3, String r4) {
        p.l(r3, "message");
        p.l(r4, "target");
        this.f87201a = r2;
        this.f87202b = r3;
        this.f87203c = r4;
    }

    public final String a() {
        return this.f87201a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TradingStockbitToken) == true) goto L8;
        return false;
    L8:
        TradingStockbitToken r52 = (TradingStockbitToken) r5;
        if (p.g(this.f87201a, r52.f87201a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87202b, r52.f87202b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87203c, r52.f87203c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f87201a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (((r03 * 31) + this.f87202b.hashCode()) * 31) + this.f87203c.hashCode();
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "TradingStockbitToken(token=" + this.f87201a + ", message=" + this.f87202b + ", target=" + this.f87203c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f87201a);
        r1.writeString(this.f87202b);
        r1.writeString(this.f87203c);
    }
}
