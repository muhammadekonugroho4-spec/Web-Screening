package com.stockbit.watchlist.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0007HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/stockbit/watchlist/ui/model/WatchlistFavoriteResult;", "Landroid/os/Parcelable;", "watchlistFavorites", "Ljava/util/ArrayList;", "Lcom/stockbit/usecase/watchlist/model/WatchlistGroupUIState;", "Lkotlin/collections/ArrayList;", "isChangesOccurred", "", "<init>", "(Ljava/util/ArrayList;Z)V", "getWatchlistFavorites", "()Ljava/util/ArrayList;", "()Z", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "watchlist_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WatchlistFavoriteResult implements Parcelable {
    public static final Parcelable.Creator<WatchlistFavoriteResult> CREATOR = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f171035c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f171036a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f171037b;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final WatchlistFavoriteResult a(Parcel r6) {
            p.l(r6, "parcel");
            int r02 = r6.readInt();
            ArrayList r1 = new ArrayList(r02);
            boolean r2 = false;
            int r3 = 0;
        L3:
            if (r3 == r02) goto L6;
            r1.add(r6.readSerializable());
            r3 = r3 + 1;
            goto L3
        L6:
            if (r6.readInt() == 0) goto L9;
            r2 = true;
        L9:
            return new WatchlistFavoriteResult(r1, r2);
        }

        public final WatchlistFavoriteResult[] b(int r1) {
            return new WatchlistFavoriteResult[r1];
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
        f171035c = 8;
    }

    public WatchlistFavoriteResult(ArrayList r2, boolean r3) {
        p.l(r2, "watchlistFavorites");
        this.f171036a = r2;
        this.f171037b = r3;
    }

    public final ArrayList a() {
        return this.f171036a;
    }

    public final boolean b() {
        return this.f171037b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WatchlistFavoriteResult) == true) goto L8;
        return false;
    L8:
        WatchlistFavoriteResult r52 = (WatchlistFavoriteResult) r5;
        if (p.g(this.f171036a, r52.f171036a) == true) goto L12;
        return false;
    L12:
        if (this.f171037b == r52.f171037b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f171036a.hashCode() * 31) + Boolean.hashCode(this.f171037b);
    }

    public String toString() {
        return "WatchlistFavoriteResult(watchlistFavorites=" + this.f171036a + ", isChangesOccurred=" + this.f171037b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        p.l(r2, "dest");
        ArrayList r32 = this.f171036a;
        r2.writeInt(r32.size());
        Iterator r33 = r32.iterator();
    L4:
        if (r33.hasNext() == false) goto L6;
        r2.writeSerializable((Serializable) r33.next());
        goto L4
    L6:
        r2.writeInt(this.f171037b ? 1 : 0);
    }
}
