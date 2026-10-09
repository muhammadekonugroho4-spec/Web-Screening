package com.stockbit.domain.model.type.tradingcommunity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006 "}, d2 = {"Lcom/stockbit/domain/model/type/tradingcommunity/TradingCommunityFilterParam;", "Landroid/os/Parcelable;", "startDate", "", "endDate", NotificationCompat.CATEGORY_STATUS, "isDefault", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getStartDate", "()Ljava/lang/String;", "getEndDate", "getStatus", "()Z", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TradingCommunityFilterParam implements Parcelable {
    public static final Parcelable.Creator<TradingCommunityFilterParam> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f86525a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86526b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86527c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final TradingCommunityFilterParam a(Parcel r5) {
            p.l(r5, "parcel");
            String r1 = r5.readString();
            String r2 = r5.readString();
            String r3 = r5.readString();
            if (r5.readInt() == 0) goto L5;
            boolean r52 = true;
        L7:
            return new TradingCommunityFilterParam(r1, r2, r3, r52);
        L5:
            r52 = false;
            goto L7
        }

        public final TradingCommunityFilterParam[] b(int r1) {
            return new TradingCommunityFilterParam[r1];
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

    public TradingCommunityFilterParam(String r1, String r2, String r3, boolean r4) {
        this.f86525a = r1;
        this.f86526b = r2;
        this.f86527c = r3;
        this.d = r4;
    }

    public final String a() {
        return this.f86526b;
    }

    public final String b() {
        return this.f86525a;
    }

    public final String c() {
        return this.f86527c;
    }

    public final boolean d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TradingCommunityFilterParam) == true) goto L8;
        return false;
    L8:
        TradingCommunityFilterParam r52 = (TradingCommunityFilterParam) r5;
        if (p.g(this.f86525a, r52.f86525a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86526b, r52.f86526b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86527c, r52.f86527c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        String r02 = this.f86525a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f86526b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f86527c;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return ((r05 + r1) * 31) + Boolean.hashCode(this.d);
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "TradingCommunityFilterParam(startDate=" + this.f86525a + ", endDate=" + this.f86526b + ", status=" + this.f86527c + ", isDefault=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f86525a);
        r1.writeString(this.f86526b);
        r1.writeString(this.f86527c);
        r1.writeInt(this.d ? 1 : 0);
    }
}
