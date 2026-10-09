package com.stockbit.domain.model.entity.securities;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0006HÖ\u0081\u0004J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/stockbit/domain/model/entity/securities/BracketOrder;", "Landroid/os/Parcelable;", "stopLossBracketOrder", "Lcom/stockbit/domain/model/entity/securities/BracketOrderChildren;", "takeProfitBracketOrder", "buyPrice", "", "<init>", "(Lcom/stockbit/domain/model/entity/securities/BracketOrderChildren;Lcom/stockbit/domain/model/entity/securities/BracketOrderChildren;Ljava/lang/String;)V", "getStopLossBracketOrder", "()Lcom/stockbit/domain/model/entity/securities/BracketOrderChildren;", "getTakeProfitBracketOrder", "getBuyPrice", "()Ljava/lang/String;", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BracketOrder implements Parcelable {
    public static final Parcelable.Creator<BracketOrder> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final BracketOrderChildren f83023a;

    /* renamed from: b, reason: collision with root package name */
    public final BracketOrderChildren f83024b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83025c;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final BracketOrder a(Parcel r5) {
            kotlin.jvm.internal.p.l(r5, "parcel");
            BracketOrderChildren r2 = null;
            if (r5.readInt() != 0) goto L5;
            BracketOrderChildren r1 = null;
        L6:
            BracketOrderChildren r12 = r1;
            if (r5.readInt() == 0) goto L11;
            r2 = BracketOrderChildren.CREATOR.createFromParcel(r5);
        L11:
            return new BracketOrder(r12, r2, r5.readString());
        L5:
            r1 = BracketOrderChildren.CREATOR.createFromParcel(r5);
            goto L6
        }

        public final BracketOrder[] b(int r1) {
            return new BracketOrder[r1];
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

    public BracketOrder(BracketOrderChildren r2, BracketOrderChildren r3, String r4) {
        kotlin.jvm.internal.p.l(r4, "buyPrice");
        this.f83023a = r2;
        this.f83024b = r3;
        this.f83025c = r4;
    }

    public final BracketOrderChildren a() {
        return this.f83023a;
    }

    public final BracketOrderChildren b() {
        return this.f83024b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BracketOrder) == true) goto L8;
        return false;
    L8:
        BracketOrder r52 = (BracketOrder) r5;
        if (kotlin.jvm.internal.p.g(this.f83023a, r52.f83023a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f83024b, r52.f83024b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f83025c, r52.f83025c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        BracketOrderChildren r02 = this.f83023a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        BracketOrderChildren r2 = this.f83024b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return ((r04 + r1) * 31) + this.f83025c.hashCode();
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "BracketOrder(stopLossBracketOrder=" + this.f83023a + ", takeProfitBracketOrder=" + this.f83024b + ", buyPrice=" + this.f83025c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        kotlin.jvm.internal.p.l(r4, "dest");
        BracketOrderChildren r02 = this.f83023a;
        if (r02 != null) goto L5;
        r4.writeInt(0);
    L6:
        BracketOrderChildren r03 = this.f83024b;
        if (r03 != null) goto L9;
        r4.writeInt(0);
    L10:
        r4.writeString(this.f83025c);
        return;
    L9:
        r4.writeInt(1);
        r03.writeToParcel(r4, r5);
        goto L10
    L5:
        r4.writeInt(1);
        r02.writeToParcel(r4, r5);
        goto L6
    }
}
