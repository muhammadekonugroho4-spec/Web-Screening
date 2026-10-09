package com.stockbit.domain.model.entity.screener;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC11777v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000\fHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00000\fHÆ\u0003Je\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\fHÆ\u0001J\u0006\u0010%\u001a\u00020\u0007J\u0014\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0083\u0004J\n\u0010*\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010+\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001a¨\u00061"}, d2 = {"Lcom/stockbit/domain/model/entity/screener/ScreenerFinancialMetric;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "showChartIcon", "", "category", FirebaseAnalytics.Param.LEVEL, "type", "childs", "", "parents", "<init>", "(JLjava/lang/String;ILjava/lang/String;IILjava/util/List;Ljava/util/List;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getShowChartIcon", "()I", "getCategory", "getLevel", "getType", "getChilds", "()Ljava/util/List;", "getParents", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScreenerFinancialMetric implements Parcelable {
    public static final Parcelable.Creator<ScreenerFinancialMetric> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final long f82871a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82872b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82873c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final int f82874e;

    /* renamed from: f, reason: collision with root package name */
    public final int f82875f;

    /* renamed from: g, reason: collision with root package name */
    public final List f82876g;

    /* renamed from: h, reason: collision with root package name */
    public final List f82877h;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ScreenerFinancialMetric a(Parcel r13) {
            p.l(r13, "parcel");
            long r2 = r13.readLong();
            String r4 = r13.readString();
            int r5 = r13.readInt();
            String r6 = r13.readString();
            int r7 = r13.readInt();
            int r8 = r13.readInt();
            int r02 = r13.readInt();
            ArrayList r9 = new ArrayList(r02);
            int r1 = 0;
            int r10 = 0;
        L3:
            if (r10 == r02) goto L5;
            r9.add(ScreenerFinancialMetric.CREATOR.createFromParcel(r13));
            r10 = r10 + 1;
            goto L3
        L5:
            int r03 = r13.readInt();
            ArrayList r102 = new ArrayList(r03);
        L6:
            if (r1 == r03) goto L9;
            r102.add(ScreenerFinancialMetric.CREATOR.createFromParcel(r13));
            r1 = r1 + 1;
            goto L6
        L9:
            return new ScreenerFinancialMetric(r2, r4, r5, r6, r7, r8, r9, r102);
        }

        public final ScreenerFinancialMetric[] b(int r1) {
            return new ScreenerFinancialMetric[r1];
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

    public ScreenerFinancialMetric(long r2, String r4, int r5, String r6, int r7, int r8, List r9, List r10) {
        p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r6, "category");
        p.l(r9, "childs");
        p.l(r10, "parents");
        this.f82871a = r2;
        this.f82872b = r4;
        this.f82873c = r5;
        this.d = r6;
        this.f82874e = r7;
        this.f82875f = r8;
        this.f82876g = r9;
        this.f82877h = r10;
    }

    public final List a() {
        return this.f82876g;
    }

    public final long b() {
        return this.f82871a;
    }

    public final String c() {
        return this.f82872b;
    }

    public final List d() {
        return this.f82877h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ScreenerFinancialMetric) == true) goto L8;
        return false;
    L8:
        ScreenerFinancialMetric r82 = (ScreenerFinancialMetric) r8;
        if (this.f82871a == r82.f82871a) goto L12;
        return false;
    L12:
        if (p.g(this.f82872b, r82.f82872b) == true) goto L15;
        return false;
    L15:
        if (this.f82873c == r82.f82873c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (this.f82874e == r82.f82874e) goto L24;
        return false;
    L24:
        if (this.f82875f == r82.f82875f) goto L27;
        return false;
    L27:
        if (p.g(this.f82876g, r82.f82876g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f82877h, r82.f82877h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.f82871a) * 31) + this.f82872b.hashCode()) * 31) + Integer.hashCode(this.f82873c)) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.f82874e)) * 31) + Integer.hashCode(this.f82875f)) * 31) + this.f82876g.hashCode()) * 31) + this.f82877h.hashCode();
    }

    public String toString() {
        return "ScreenerFinancialMetric(id=" + this.f82871a + ", name=" + this.f82872b + ", showChartIcon=" + this.f82873c + ", category=" + this.d + ", level=" + this.f82874e + ", type=" + this.f82875f + ", childs=" + this.f82876g + ", parents=" + this.f82877h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeLong(this.f82871a);
        r3.writeString(this.f82872b);
        r3.writeInt(this.f82873c);
        r3.writeString(this.d);
        r3.writeInt(this.f82874e);
        r3.writeInt(this.f82875f);
        List r02 = this.f82876g;
        r3.writeInt(r02.size());
        Iterator r03 = r02.iterator();
    L4:
        if (r03.hasNext() == false) goto L6;
        ((ScreenerFinancialMetric) r03.next()).writeToParcel(r3, r4);
        goto L4
    L6:
        List r04 = this.f82877h;
        r3.writeInt(r04.size());
        Iterator r05 = r04.iterator();
    L8:
        if (r05.hasNext() == false) goto L10;
        ((ScreenerFinancialMetric) r05.next()).writeToParcel(r3, r4);
        goto L8
    }

    public /* synthetic */ ScreenerFinancialMetric(long r10, String r12, int r13, String r14, int r15, int r16, List r17, List r18, int r19, i r20) {
        if ((r19 & 1) == 0) goto L5;
        long r1 = 0;
    L6:
        String r4 = "";
        if ((r19 & 2) == 0) goto L9;
        String r3 = "";
    L10:
        int r6 = 0;
        if ((r19 & 4) == 0) goto L13;
        int r5 = 0;
    L15:
        if ((r19 & 8) != 0) goto L19;
        r4 = r14;
    L19:
        if ((r19 & 16) == 0) goto L21;
        int r7 = 0;
    L23:
        if ((r19 & 32) != 0) goto L27;
        r6 = r16;
    L27:
        if ((r19 & 64) == 0) goto L29;
        List r8 = AbstractC11777v.o();
    L31:
        if ((r19 & 128) == 0) goto L34;
        List r192 = AbstractC11777v.o();
    L35:
        this(r1, r3, r5, r4, r7, r6, r8, r192);
        return;
    L34:
        r192 = r18;
        goto L35
    L29:
        r8 = r17;
        goto L31
    L21:
        r7 = r15;
        goto L23
    L13:
        r5 = r13;
        goto L15
    L9:
        r3 = r12;
        goto L10
    L5:
        r1 = r10;
        goto L6
    }
}
