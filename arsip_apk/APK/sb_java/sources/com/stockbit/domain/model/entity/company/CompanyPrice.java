package com.stockbit.domain.model.entity.company;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b*\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B³\u0001\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\u000fHÆ\u0003J\t\u0010:\u001a\u00020\u0011HÆ\u0003J\t\u0010;\u001a\u00020\u0013HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\t\u0010=\u001a\u00020\u000fHÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017HÆ\u0003J\t\u0010?\u001a\u00020\u0019HÆ\u0003Jµ\u0001\u0010@\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019HÆ\u0001J\u0006\u0010A\u001a\u00020\u0019J\u0014\u0010B\u001a\u00020\u00112\b\u0010C\u001a\u0004\u0018\u00010DHÖ\u0083\u0004J\n\u0010E\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010F\u001a\u00020\u0007HÖ\u0081\u0004J\u0016\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u0019R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010(R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010'R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006L"}, d2 = {"Lcom/stockbit/domain/model/entity/company/CompanyPrice;", "Landroid/os/Parcelable;", "prices", "Ljava/util/ArrayList;", "Lcom/stockbit/domain/model/entity/company/ChartPrice;", "Lkotlin/collections/ArrayList;", "timeframe", "", "xaxisopt", "markingPoint", "timeFramePriceChange", "timeFramePercentage", "timeFrameCAGR", "timeFrameDrawDown", "previous", "", "isEmpty", "", "lineWeight", "", "chartType", "intervalInMinutes", "allowedChartTypes", "", "maxCandles", "", "<init>", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DZFLjava/lang/String;DLjava/util/List;I)V", "getPrices", "()Ljava/util/ArrayList;", "getTimeframe", "()Ljava/lang/String;", "getXaxisopt", "getMarkingPoint", "getTimeFramePriceChange", "getTimeFramePercentage", "getTimeFrameCAGR", "getTimeFrameDrawDown", "getPrevious", "()D", "()Z", "getLineWeight", "()F", "getChartType", "getIntervalInMinutes", "getAllowedChartTypes", "()Ljava/util/List;", "getMaxCandles", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", Constants.COPY_TYPE, "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CompanyPrice implements Parcelable {
    public static final Parcelable.Creator<CompanyPrice> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f82658a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82659b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82660c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82661e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82662f;

    /* renamed from: g, reason: collision with root package name */
    public final String f82663g;

    /* renamed from: h, reason: collision with root package name */
    public final String f82664h;

    /* renamed from: i, reason: collision with root package name */
    public final double f82665i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f82666j;

    /* renamed from: k, reason: collision with root package name */
    public final float f82667k;

    /* renamed from: l, reason: collision with root package name */
    public final String f82668l;

    /* renamed from: m, reason: collision with root package name */
    public final double f82669m;

    /* renamed from: n, reason: collision with root package name */
    public final List f82670n;

    /* renamed from: o, reason: collision with root package name */
    public final int f82671o;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final CompanyPrice a(Parcel r21) {
            p.l(r21, "parcel");
            int r1 = r21.readInt();
            ArrayList r3 = new ArrayList(r1);
            boolean r2 = false;
            int r4 = 0;
        L3:
            if (r4 == r1) goto L5;
            r3.add(ChartPrice.CREATOR.createFromParcel(r21));
            r4 = r4 + 1;
            goto L3
        L5:
            String r42 = r21.readString();
            String r5 = r21.readString();
            String r6 = r21.readString();
            String r7 = r21.readString();
            String r8 = r21.readString();
            String r9 = r21.readString();
            String r10 = r21.readString();
            double r11 = r21.readDouble();
            if (r21.readInt() == 0) goto L9;
            r2 = true;
        L9:
            return new CompanyPrice(r3, r42, r5, r6, r7, r8, r9, r10, r11, r2, r21.readFloat(), r21.readString(), r21.readDouble(), r21.createStringArrayList(), r21.readInt());
        }

        public final CompanyPrice[] b(int r1) {
            return new CompanyPrice[r1];
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

    public CompanyPrice(ArrayList r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, double r12, boolean r14, float r15, String r16, double r17, List r19, int r20) {
        p.l(r4, "prices");
        p.l(r5, "timeframe");
        p.l(r6, "xaxisopt");
        p.l(r7, "markingPoint");
        p.l(r8, "timeFramePriceChange");
        p.l(r9, "timeFramePercentage");
        p.l(r10, "timeFrameCAGR");
        p.l(r11, "timeFrameDrawDown");
        p.l(r16, "chartType");
        p.l(r19, "allowedChartTypes");
        this.f82658a = r4;
        this.f82659b = r5;
        this.f82660c = r6;
        this.d = r7;
        this.f82661e = r8;
        this.f82662f = r9;
        this.f82663g = r10;
        this.f82664h = r11;
        this.f82665i = r12;
        this.f82666j = r14;
        this.f82667k = r15;
        this.f82668l = r16;
        this.f82669m = r17;
        this.f82670n = r19;
        this.f82671o = r20;
    }

    public final List a() {
        return this.f82670n;
    }

    public final String b() {
        return this.f82668l;
    }

    public final double c() {
        return this.f82669m;
    }

    public final float d() {
        return this.f82667k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final double e() {
        return this.f82665i;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof CompanyPrice) == true) goto L8;
        return false;
    L8:
        CompanyPrice r82 = (CompanyPrice) r8;
        if (p.g(this.f82658a, r82.f82658a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82659b, r82.f82659b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82660c, r82.f82660c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82661e, r82.f82661e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f82662f, r82.f82662f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f82663g, r82.f82663g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f82664h, r82.f82664h) == true) goto L33;
        return false;
    L33:
        if (Double.compare(this.f82665i, r82.f82665i) == 0) goto L36;
        return false;
    L36:
        if (this.f82666j == r82.f82666j) goto L39;
        return false;
    L39:
        if (Float.compare(this.f82667k, r82.f82667k) == 0) goto L42;
        return false;
    L42:
        if (p.g(this.f82668l, r82.f82668l) == true) goto L45;
        return false;
    L45:
        if (Double.compare(this.f82669m, r82.f82669m) == 0) goto L48;
        return false;
    L48:
        if (p.g(this.f82670n, r82.f82670n) == true) goto L51;
        return false;
    L51:
        if (this.f82671o == r82.f82671o) goto L53;
        return false;
    L53:
        return true;
    }

    public final ArrayList f() {
        return this.f82658a;
    }

    public final String g() {
        return this.f82662f;
    }

    public final String h() {
        return this.f82661e;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.f82658a.hashCode() * 31) + this.f82659b.hashCode()) * 31) + this.f82660c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82661e.hashCode()) * 31) + this.f82662f.hashCode()) * 31) + this.f82663g.hashCode()) * 31) + this.f82664h.hashCode()) * 31) + Double.hashCode(this.f82665i)) * 31) + Boolean.hashCode(this.f82666j)) * 31) + Float.hashCode(this.f82667k)) * 31) + this.f82668l.hashCode()) * 31) + Double.hashCode(this.f82669m)) * 31) + this.f82670n.hashCode()) * 31) + Integer.hashCode(this.f82671o);
    }

    public final boolean i() {
        return this.f82666j;
    }

    public String toString() {
        return "CompanyPrice(prices=" + this.f82658a + ", timeframe=" + this.f82659b + ", xaxisopt=" + this.f82660c + ", markingPoint=" + this.d + ", timeFramePriceChange=" + this.f82661e + ", timeFramePercentage=" + this.f82662f + ", timeFrameCAGR=" + this.f82663g + ", timeFrameDrawDown=" + this.f82664h + ", previous=" + this.f82665i + ", isEmpty=" + this.f82666j + ", lineWeight=" + this.f82667k + ", chartType=" + this.f82668l + ", intervalInMinutes=" + this.f82669m + ", allowedChartTypes=" + this.f82670n + ", maxCandles=" + this.f82671o + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        ArrayList r02 = this.f82658a;
        r3.writeInt(r02.size());
        Iterator r03 = r02.iterator();
    L4:
        if (r03.hasNext() == false) goto L6;
        ((ChartPrice) r03.next()).writeToParcel(r3, r4);
        goto L4
    L6:
        r3.writeString(this.f82659b);
        r3.writeString(this.f82660c);
        r3.writeString(this.d);
        r3.writeString(this.f82661e);
        r3.writeString(this.f82662f);
        r3.writeString(this.f82663g);
        r3.writeString(this.f82664h);
        r3.writeDouble(this.f82665i);
        r3.writeInt(this.f82666j ? 1 : 0);
        r3.writeFloat(this.f82667k);
        r3.writeString(this.f82668l);
        r3.writeDouble(this.f82669m);
        r3.writeStringList(this.f82670n);
        r3.writeInt(this.f82671o);
    }
}
