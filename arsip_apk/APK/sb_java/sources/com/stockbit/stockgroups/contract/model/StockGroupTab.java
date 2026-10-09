package com.stockbit.stockgroups.contract.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/stockbit/stockgroups/contract/model/StockGroupTab;", "Landroid/os/Parcelable;", "groupCode", "", "groupName", "catalogId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGroupCode", "()Ljava/lang/String;", "getGroupName", "getCatalogId", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "stock-groups-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StockGroupTab implements Parcelable {
    public static final Parcelable.Creator<StockGroupTab> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f138891a;

    /* renamed from: b, reason: collision with root package name */
    public final String f138892b;

    /* renamed from: c, reason: collision with root package name */
    public final String f138893c;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final StockGroupTab a(Parcel r4) {
            p.l(r4, "parcel");
            return new StockGroupTab(r4.readString(), r4.readString(), r4.readString());
        }

        public final StockGroupTab[] b(int r1) {
            return new StockGroupTab[r1];
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

    public StockGroupTab(String r2, String r3, String r4) {
        p.l(r2, "groupCode");
        p.l(r3, "groupName");
        p.l(r4, "catalogId");
        this.f138891a = r2;
        this.f138892b = r3;
        this.f138893c = r4;
    }

    public final String a() {
        return this.f138893c;
    }

    public final String b() {
        return this.f138891a;
    }

    public final String c() {
        return this.f138892b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StockGroupTab) == true) goto L8;
        return false;
    L8:
        StockGroupTab r52 = (StockGroupTab) r5;
        if (p.g(this.f138891a, r52.f138891a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f138892b, r52.f138892b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f138893c, r52.f138893c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f138891a.hashCode() * 31) + this.f138892b.hashCode()) * 31) + this.f138893c.hashCode();
    }

    public String toString() {
        return "StockGroupTab(groupCode=" + this.f138891a + ", groupName=" + this.f138892b + ", catalogId=" + this.f138893c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f138891a);
        r1.writeString(this.f138892b);
        r1.writeString(this.f138893c);
    }
}
