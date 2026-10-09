package com.stockbit.component.orderbook.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\""}, d2 = {"Lcom/stockbit/component/orderbook/model/AraArbViewUIState;", "Landroid/os/Parcelable;", "type", "Lcom/stockbit/component/orderbook/model/AraArbViewType;", FirebaseAnalytics.Param.PRICE, "", "changeAndPercentage", "totalPercentage", "<init>", "(Lcom/stockbit/component/orderbook/model/AraArbViewType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lcom/stockbit/component/orderbook/model/AraArbViewType;", "getPrice", "()Ljava/lang/String;", "getChangeAndPercentage", "getTotalPercentage", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "orderbook_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AraArbViewUIState implements Parcelable {
    public static final Parcelable.Creator<AraArbViewUIState> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final AraArbViewType f73004a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73005b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73006c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final AraArbViewUIState a(Parcel r5) {
            p.l(r5, "parcel");
            return new AraArbViewUIState(AraArbViewType.valueOf(r5.readString()), r5.readString(), r5.readString(), r5.readString());
        }

        public final AraArbViewUIState[] b(int r1) {
            return new AraArbViewUIState[r1];
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

    public AraArbViewUIState(AraArbViewType r2, String r3, String r4, String r5) {
        p.l(r2, "type");
        p.l(r3, FirebaseAnalytics.Param.PRICE);
        p.l(r4, "changeAndPercentage");
        p.l(r5, "totalPercentage");
        this.f73004a = r2;
        this.f73005b = r3;
        this.f73006c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f73006c;
    }

    public final String b() {
        return this.f73005b;
    }

    public final String c() {
        return this.d;
    }

    public final AraArbViewType d() {
        return this.f73004a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AraArbViewUIState) == true) goto L8;
        return false;
    L8:
        AraArbViewUIState r52 = (AraArbViewUIState) r5;
        if (this.f73004a == r52.f73004a) goto L12;
        return false;
    L12:
        if (p.g(this.f73005b, r52.f73005b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f73006c, r52.f73006c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f73004a.hashCode() * 31) + this.f73005b.hashCode()) * 31) + this.f73006c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "AraArbViewUIState(type=" + this.f73004a + ", price=" + this.f73005b + ", changeAndPercentage=" + this.f73006c + ", totalPercentage=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f73004a.name());
        r1.writeString(this.f73005b);
        r1.writeString(this.f73006c);
        r1.writeString(this.d);
    }
}
