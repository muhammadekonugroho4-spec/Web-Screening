package com.stockbit.feature.bonds.contract.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/stockbit/feature/bonds/contract/model/BondHistoryDetailRealizedParam;", "Landroid/os/Parcelable;", "historyId", "", Constants.KEY_DATE, "productId", Constants.KEY_TITLE, "transactionType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHistoryId", "()Ljava/lang/String;", "getDate", "getProductId", "getTitle", "getTransactionType", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "bonds-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BondHistoryDetailRealizedParam implements Parcelable {
    public static final Parcelable.Creator<BondHistoryDetailRealizedParam> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f92148a;

    /* renamed from: b, reason: collision with root package name */
    public final String f92149b;

    /* renamed from: c, reason: collision with root package name */
    public final String f92150c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f92151e;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final BondHistoryDetailRealizedParam a(Parcel r8) {
            p.l(r8, "parcel");
            return new BondHistoryDetailRealizedParam(r8.readString(), r8.readString(), r8.readString(), r8.readString(), r8.readString());
        }

        public final BondHistoryDetailRealizedParam[] b(int r1) {
            return new BondHistoryDetailRealizedParam[r1];
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

    public BondHistoryDetailRealizedParam(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, "historyId");
        p.l(r3, Constants.KEY_DATE);
        p.l(r4, "productId");
        p.l(r5, Constants.KEY_TITLE);
        p.l(r6, "transactionType");
        this.f92148a = r2;
        this.f92149b = r3;
        this.f92150c = r4;
        this.d = r5;
        this.f92151e = r6;
    }

    public final String a() {
        return this.f92149b;
    }

    public final String b() {
        return this.f92148a;
    }

    public final String c() {
        return this.f92150c;
    }

    public final String d() {
        return this.f92151e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BondHistoryDetailRealizedParam) == true) goto L8;
        return false;
    L8:
        BondHistoryDetailRealizedParam r52 = (BondHistoryDetailRealizedParam) r5;
        if (p.g(this.f92148a, r52.f92148a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f92149b, r52.f92149b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f92150c, r52.f92150c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f92151e, r52.f92151e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f92148a.hashCode() * 31) + this.f92149b.hashCode()) * 31) + this.f92150c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f92151e.hashCode();
    }

    public String toString() {
        return "BondHistoryDetailRealizedParam(historyId=" + this.f92148a + ", date=" + this.f92149b + ", productId=" + this.f92150c + ", title=" + this.d + ", transactionType=" + this.f92151e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f92148a);
        r1.writeString(this.f92149b);
        r1.writeString(this.f92150c);
        r1.writeString(this.d);
        r1.writeString(this.f92151e);
    }
}
