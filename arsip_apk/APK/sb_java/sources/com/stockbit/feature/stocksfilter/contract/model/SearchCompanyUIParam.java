package com.stockbit.feature.stocksfilter.contract.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.stockbit.company.CompanyEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, d2 = {"Lcom/stockbit/feature/stocksfilter/contract/model/SearchCompanyUIParam;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", AppMeasurementSdk.ConditionalUserProperty.NAME, "symbol", "image", "type", CompanyEntryPoint.EXTRA_DESC, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getSymbol", "getImage", "getType", "getDesc", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "stocks-filter-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SearchCompanyUIParam implements Parcelable {
    public static final Parcelable.Creator<SearchCompanyUIParam> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f106615a;

    /* renamed from: b, reason: collision with root package name */
    public final String f106616b;

    /* renamed from: c, reason: collision with root package name */
    public final String f106617c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f106618e;

    /* renamed from: f, reason: collision with root package name */
    public final String f106619f;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final SearchCompanyUIParam a(Parcel r9) {
            p.l(r9, "parcel");
            return new SearchCompanyUIParam(r9.readString(), r9.readString(), r9.readString(), r9.readString(), r9.readString(), r9.readString());
        }

        public final SearchCompanyUIParam[] b(int r1) {
            return new SearchCompanyUIParam[r1];
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

    public SearchCompanyUIParam(String r2, String r3, String r4, String r5, String r6, String r7) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "symbol");
        p.l(r5, "image");
        p.l(r6, "type");
        p.l(r7, CompanyEntryPoint.EXTRA_DESC);
        this.f106615a = r2;
        this.f106616b = r3;
        this.f106617c = r4;
        this.d = r5;
        this.f106618e = r6;
        this.f106619f = r7;
    }

    public final String a() {
        return this.f106619f;
    }

    public final String b() {
        return this.f106615a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f106616b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f106617c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SearchCompanyUIParam) == true) goto L8;
        return false;
    L8:
        SearchCompanyUIParam r52 = (SearchCompanyUIParam) r5;
        if (p.g(this.f106615a, r52.f106615a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f106616b, r52.f106616b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f106617c, r52.f106617c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f106618e, r52.f106618e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f106619f, r52.f106619f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f106618e;
    }

    public int hashCode() {
        return (((((((((this.f106615a.hashCode() * 31) + this.f106616b.hashCode()) * 31) + this.f106617c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f106618e.hashCode()) * 31) + this.f106619f.hashCode();
    }

    public String toString() {
        return "SearchCompanyUIParam(id=" + this.f106615a + ", name=" + this.f106616b + ", symbol=" + this.f106617c + ", image=" + this.d + ", type=" + this.f106618e + ", desc=" + this.f106619f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f106615a);
        r1.writeString(this.f106616b);
        r1.writeString(this.f106617c);
        r1.writeString(this.d);
        r1.writeString(this.f106618e);
        r1.writeString(this.f106619f);
    }
}
