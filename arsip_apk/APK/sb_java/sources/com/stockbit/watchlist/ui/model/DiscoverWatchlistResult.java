package com.stockbit.watchlist.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/stockbit/watchlist/ui/model/DiscoverWatchlistResult;", "Landroid/os/Parcelable;", "watchlistGroupId", "", "watchlistCompanySymbols", "", "Lcom/stockbit/model/entity/WatchlistSymbolOnly;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getWatchlistGroupId", "()Ljava/lang/String;", "getWatchlistCompanySymbols", "()Ljava/util/List;", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "watchlist_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DiscoverWatchlistResult implements Parcelable {
    public static final Parcelable.Creator<DiscoverWatchlistResult> CREATOR = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f171032c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f171033a;

    /* renamed from: b, reason: collision with root package name */
    public final List f171034b;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final DiscoverWatchlistResult a(Parcel r6) {
            p.l(r6, "parcel");
            String r02 = r6.readString();
            int r1 = r6.readInt();
            ArrayList r2 = new ArrayList(r1);
            int r3 = 0;
        L3:
            if (r3 == r1) goto L6;
            r2.add(r6.readParcelable(DiscoverWatchlistResult.class.getClassLoader()));
            r3 = r3 + 1;
            goto L3
        L6:
            return new DiscoverWatchlistResult(r02, r2);
        }

        public final DiscoverWatchlistResult[] b(int r1) {
            return new DiscoverWatchlistResult[r1];
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
        f171032c = 8;
    }

    public DiscoverWatchlistResult(String r2, List r3) {
        p.l(r3, "watchlistCompanySymbols");
        this.f171033a = r2;
        this.f171034b = r3;
    }

    public final List a() {
        return this.f171034b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DiscoverWatchlistResult) == true) goto L8;
        return false;
    L8:
        DiscoverWatchlistResult r52 = (DiscoverWatchlistResult) r5;
        if (p.g(this.f171033a, r52.f171033a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f171034b, r52.f171034b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f171033a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + this.f171034b.hashCode();
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "DiscoverWatchlistResult(watchlistGroupId=" + this.f171033a + ", watchlistCompanySymbols=" + this.f171034b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeString(this.f171033a);
        List r02 = this.f171034b;
        r3.writeInt(r02.size());
        Iterator r03 = r02.iterator();
    L4:
        if (r03.hasNext() == false) goto L6;
        r3.writeParcelable((Parcelable) r03.next(), r4);
        goto L4
    }
}
