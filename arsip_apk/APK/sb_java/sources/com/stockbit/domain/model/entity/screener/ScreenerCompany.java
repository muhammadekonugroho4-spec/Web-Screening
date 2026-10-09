package com.stockbit.domain.model.entity.screener;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003Jm\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010'\u001a\u00020(J\u0014\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0083\u0004J\n\u0010-\u001a\u00020(HÖ\u0081\u0004J\n\u0010.\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00064"}, d2 = {"Lcom/stockbit/domain/model/entity/screener/ScreenerCompany;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", AppMeasurementSdk.ConditionalUserProperty.NAME, "symbol", "symbol2", "symbol3", "country", "exchange", "type", "iconUrl", "badges", "Lcom/stockbit/domain/model/entity/screener/ScreenerBadges;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/domain/model/entity/screener/ScreenerBadges;)V", "getId", "()Ljava/lang/String;", "getName", "getSymbol", "getSymbol2", "getSymbol3", "getCountry", "getExchange", "getType", "getIconUrl", "getBadges", "()Lcom/stockbit/domain/model/entity/screener/ScreenerBadges;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScreenerCompany implements Parcelable {
    public static final Parcelable.Creator<ScreenerCompany> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f82858a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82859b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82860c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82861e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82862f;

    /* renamed from: g, reason: collision with root package name */
    public final String f82863g;

    /* renamed from: h, reason: collision with root package name */
    public final String f82864h;

    /* renamed from: i, reason: collision with root package name */
    public final String f82865i;

    /* renamed from: j, reason: collision with root package name */
    public final ScreenerBadges f82866j;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ScreenerCompany a(Parcel r13) {
            p.l(r13, "parcel");
            return new ScreenerCompany(r13.readString(), r13.readString(), r13.readString(), r13.readString(), r13.readString(), r13.readString(), r13.readString(), r13.readString(), r13.readString(), ScreenerBadges.CREATOR.createFromParcel(r13));
        }

        public final ScreenerCompany[] b(int r1) {
            return new ScreenerCompany[r1];
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

    public ScreenerCompany(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, ScreenerBadges r11) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "symbol");
        p.l(r5, "symbol2");
        p.l(r6, "symbol3");
        p.l(r7, "country");
        p.l(r8, "exchange");
        p.l(r9, "type");
        p.l(r10, "iconUrl");
        p.l(r11, "badges");
        this.f82858a = r2;
        this.f82859b = r3;
        this.f82860c = r4;
        this.d = r5;
        this.f82861e = r6;
        this.f82862f = r7;
        this.f82863g = r8;
        this.f82864h = r9;
        this.f82865i = r10;
        this.f82866j = r11;
    }

    public final ScreenerBadges a() {
        return this.f82866j;
    }

    public final String b() {
        return this.f82865i;
    }

    public final String c() {
        return this.f82858a;
    }

    public final String d() {
        return this.f82859b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f82860c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ScreenerCompany) == true) goto L8;
        return false;
    L8:
        ScreenerCompany r52 = (ScreenerCompany) r5;
        if (p.g(this.f82858a, r52.f82858a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82859b, r52.f82859b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82860c, r52.f82860c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82861e, r52.f82861e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f82862f, r52.f82862f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f82863g, r52.f82863g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f82864h, r52.f82864h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f82865i, r52.f82865i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f82866j, r52.f82866j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((((((((this.f82858a.hashCode() * 31) + this.f82859b.hashCode()) * 31) + this.f82860c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82861e.hashCode()) * 31) + this.f82862f.hashCode()) * 31) + this.f82863g.hashCode()) * 31) + this.f82864h.hashCode()) * 31) + this.f82865i.hashCode()) * 31) + this.f82866j.hashCode();
    }

    public String toString() {
        return "ScreenerCompany(id=" + this.f82858a + ", name=" + this.f82859b + ", symbol=" + this.f82860c + ", symbol2=" + this.d + ", symbol3=" + this.f82861e + ", country=" + this.f82862f + ", exchange=" + this.f82863g + ", type=" + this.f82864h + ", iconUrl=" + this.f82865i + ", badges=" + this.f82866j + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        p.l(r2, "dest");
        r2.writeString(this.f82858a);
        r2.writeString(this.f82859b);
        r2.writeString(this.f82860c);
        r2.writeString(this.d);
        r2.writeString(this.f82861e);
        r2.writeString(this.f82862f);
        r2.writeString(this.f82863g);
        r2.writeString(this.f82864h);
        r2.writeString(this.f82865i);
        this.f82866j.writeToParcel(r2, r3);
    }

    public /* synthetic */ ScreenerCompany(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, ScreenerBadges r11, int r12, i r13) {
        if ((r12 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r12 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r12 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r12 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r12 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r12 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r12 & 64) == 0) goto L24;
        r8 = "";
    L24:
        if ((r12 & 128) == 0) goto L27;
        r9 = "";
    L27:
        if ((r12 & 256) == 0) goto L30;
        r10 = "";
    L30:
        if ((r12 & 512) == 0) goto L32;
        r11 = new ScreenerBadges(false, 1, null);
    L32:
        ScreenerBadges r122 = r11;
        String r112 = r10;
        String r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82, r92, r102, r112, r122);
    }
}
