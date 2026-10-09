package com.stockbit.feature.stocksfilter.contract.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u0006J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006%"}, d2 = {"Lcom/stockbit/feature/stocksfilter/contract/model/MyWatchlistUIParam;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", AppMeasurementSdk.ConditionalUserProperty.NAME, "stockCount", "", "stocks", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getId", "()Ljava/lang/String;", "getName", "getStockCount", "()I", "getStocks", "()Ljava/util/List;", "setStocks", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "stocks-filter-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MyWatchlistUIParam implements Parcelable {
    public static final Parcelable.Creator<MyWatchlistUIParam> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f106612a;

    /* renamed from: b, reason: collision with root package name */
    public final String f106613b;

    /* renamed from: c, reason: collision with root package name */
    public final int f106614c;
    public List d;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final MyWatchlistUIParam a(Parcel r5) {
            p.l(r5, "parcel");
            return new MyWatchlistUIParam(r5.readString(), r5.readString(), r5.readInt(), r5.createStringArrayList());
        }

        public final MyWatchlistUIParam[] b(int r1) {
            return new MyWatchlistUIParam[r1];
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

    public MyWatchlistUIParam(String r2, String r3, int r4, List r5) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r5, "stocks");
        this.f106612a = r2;
        this.f106613b = r3;
        this.f106614c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f106612a;
    }

    public final String b() {
        return this.f106613b;
    }

    public final int c() {
        return this.f106614c;
    }

    public final void d(List r2) {
        p.l(r2, "<set-?>");
        this.d = r2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MyWatchlistUIParam) == true) goto L8;
        return false;
    L8:
        MyWatchlistUIParam r52 = (MyWatchlistUIParam) r5;
        if (p.g(this.f106612a, r52.f106612a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f106613b, r52.f106613b) == true) goto L15;
        return false;
    L15:
        if (this.f106614c == r52.f106614c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f106612a.hashCode() * 31) + this.f106613b.hashCode()) * 31) + Integer.hashCode(this.f106614c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "MyWatchlistUIParam(id=" + this.f106612a + ", name=" + this.f106613b + ", stockCount=" + this.f106614c + ", stocks=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f106612a);
        r1.writeString(this.f106613b);
        r1.writeInt(this.f106614c);
        r1.writeStringList(this.d);
    }
}
