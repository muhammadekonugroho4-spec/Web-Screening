package com.stockbit.watchlist.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006!"}, d2 = {"Lcom/stockbit/watchlist/ui/model/WatchlistGroupEditParam;", "Landroid/os/Parcelable;", "watchlistGroupId", "", "watchlistGroupName", "watchlistGroupIsDefault", "", "watchlistGroupIsPortfolio", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getWatchlistGroupId", "()Ljava/lang/String;", "getWatchlistGroupName", "getWatchlistGroupIsDefault", "()Z", "getWatchlistGroupIsPortfolio", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "watchlist_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WatchlistGroupEditParam implements Parcelable {
    public static final Parcelable.Creator<WatchlistGroupEditParam> CREATOR = null;

    /* renamed from: e, reason: collision with root package name */
    public static final int f171041e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f171042a;

    /* renamed from: b, reason: collision with root package name */
    public final String f171043b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f171044c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final WatchlistGroupEditParam a(Parcel r7) {
            p.l(r7, "parcel");
            String r1 = r7.readString();
            String r2 = r7.readString();
            boolean r4 = false;
            if (r7.readInt() == 0) goto L5;
            boolean r3 = true;
        L7:
            if (r7.readInt() == 0) goto L10;
            r4 = true;
        L10:
            return new WatchlistGroupEditParam(r1, r2, r3, r4);
        L5:
            r3 = false;
            goto L7
        }

        public final WatchlistGroupEditParam[] b(int r1) {
            return new WatchlistGroupEditParam[r1];
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
        f171041e = 8;
    }

    public WatchlistGroupEditParam(String r2, String r3, boolean r4, boolean r5) {
        p.l(r2, "watchlistGroupId");
        p.l(r3, "watchlistGroupName");
        this.f171042a = r2;
        this.f171043b = r3;
        this.f171044c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f171042a;
    }

    public final boolean b() {
        return this.f171044c;
    }

    public final boolean c() {
        return this.d;
    }

    public final String d() {
        return this.f171043b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WatchlistGroupEditParam) == true) goto L8;
        return false;
    L8:
        WatchlistGroupEditParam r52 = (WatchlistGroupEditParam) r5;
        if (p.g(this.f171042a, r52.f171042a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f171043b, r52.f171043b) == true) goto L15;
        return false;
    L15:
        if (this.f171044c == r52.f171044c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f171042a.hashCode() * 31) + this.f171043b.hashCode()) * 31) + Boolean.hashCode(this.f171044c)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "WatchlistGroupEditParam(watchlistGroupId=" + this.f171042a + ", watchlistGroupName=" + this.f171043b + ", watchlistGroupIsDefault=" + this.f171044c + ", watchlistGroupIsPortfolio=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f171042a);
        r1.writeString(this.f171043b);
        r1.writeInt(this.f171044c ? 1 : 0);
        r1.writeInt(this.d ? 1 : 0);
    }
}
