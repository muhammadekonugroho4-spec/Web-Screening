package com.stockbit.feature.transaction.ui.nego.orderstock.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.stockbit.usecase.transaction.model.type.CounterPartySideType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0003J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stockbit/feature/transaction/ui/nego/orderstock/model/CounterPartyFilterResultParam;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.PRICE, "", "sideType", "Lcom/stockbit/usecase/transaction/model/type/CounterPartySideType;", "<init>", "(ILcom/stockbit/usecase/transaction/model/type/CounterPartySideType;)V", "getPrice", "()I", "getSideType", "()Lcom/stockbit/usecase/transaction/model/type/CounterPartySideType;", "component1", "component2", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "transaction_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CounterPartyFilterResultParam implements Parcelable {
    public static final Parcelable.Creator<CounterPartyFilterResultParam> CREATOR = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f114835c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f114836a;

    /* renamed from: b, reason: collision with root package name */
    public final CounterPartySideType f114837b;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final CounterPartyFilterResultParam a(Parcel r3) {
            kotlin.jvm.internal.p.l(r3, "parcel");
            return new CounterPartyFilterResultParam(r3.readInt(), CounterPartySideType.valueOf(r3.readString()));
        }

        public final CounterPartyFilterResultParam[] b(int r1) {
            return new CounterPartyFilterResultParam[r1];
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
        f114835c = 8;
    }

    public CounterPartyFilterResultParam(int r2, CounterPartySideType r3) {
        kotlin.jvm.internal.p.l(r3, "sideType");
        this.f114836a = r2;
        this.f114837b = r3;
    }

    public final int a() {
        return this.f114836a;
    }

    public final CounterPartySideType b() {
        return this.f114837b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CounterPartyFilterResultParam) == true) goto L8;
        return false;
    L8:
        CounterPartyFilterResultParam r52 = (CounterPartyFilterResultParam) r5;
        if (this.f114836a == r52.f114836a) goto L12;
        return false;
    L12:
        if (this.f114837b == r52.f114837b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f114836a) * 31) + this.f114837b.hashCode();
    }

    public String toString() {
        return "CounterPartyFilterResultParam(price=" + this.f114836a + ", sideType=" + this.f114837b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        kotlin.jvm.internal.p.l(r1, "dest");
        r1.writeInt(this.f114836a);
        r1.writeString(this.f114837b.name());
    }
}
