package com.stockbit.feature.history.contract;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/stockbit/feature/history/contract/DetailHistoryNegoUIParam;", "Landroid/os/Parcelable;", "symbol", "", "orderId", "command", Constants.KEY_DATE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getOrderId", "getCommand", "getDate", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "history-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DetailHistoryNegoUIParam implements Parcelable {
    public static final Parcelable.Creator<DetailHistoryNegoUIParam> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f96657a;

    /* renamed from: b, reason: collision with root package name */
    public final String f96658b;

    /* renamed from: c, reason: collision with root package name */
    public final String f96659c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final DetailHistoryNegoUIParam a(Parcel r5) {
            p.l(r5, "parcel");
            return new DetailHistoryNegoUIParam(r5.readString(), r5.readString(), r5.readString(), r5.readString());
        }

        public final DetailHistoryNegoUIParam[] b(int r1) {
            return new DetailHistoryNegoUIParam[r1];
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

    public DetailHistoryNegoUIParam(String r2, String r3, String r4, String r5) {
        p.l(r2, "symbol");
        p.l(r3, "orderId");
        p.l(r4, "command");
        p.l(r5, Constants.KEY_DATE);
        this.f96657a = r2;
        this.f96658b = r3;
        this.f96659c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f96659c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f96658b;
    }

    public final String d() {
        return this.f96657a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DetailHistoryNegoUIParam) == true) goto L8;
        return false;
    L8:
        DetailHistoryNegoUIParam r52 = (DetailHistoryNegoUIParam) r5;
        if (p.g(this.f96657a, r52.f96657a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f96658b, r52.f96658b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f96659c, r52.f96659c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f96657a.hashCode() * 31) + this.f96658b.hashCode()) * 31) + this.f96659c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "DetailHistoryNegoUIParam(symbol=" + this.f96657a + ", orderId=" + this.f96658b + ", command=" + this.f96659c + ", date=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f96657a);
        r1.writeString(this.f96658b);
        r1.writeString(this.f96659c);
        r1.writeString(this.d);
    }
}
