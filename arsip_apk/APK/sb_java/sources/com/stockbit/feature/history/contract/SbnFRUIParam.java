package com.stockbit.feature.history.contract;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b+\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\u008b\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\u0006\u00100\u001a\u000201J\u0014\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0083\u0004J\n\u00106\u001a\u000201HÖ\u0081\u0004J\n\u00107\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000201R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016¨\u0006="}, d2 = {"Lcom/stockbit/feature/history/contract/SbnFRUIParam;", "Landroid/os/Parcelable;", "type", "Lcom/stockbit/feature/history/contract/SbnFRType;", "toolbarTitle", "", "sbnLogo", "sbnSymbol", "sbnName", Constants.KEY_DATE, "sellAmount", "sellPrice", "avgBuy", "returnTax", "totalAmount", "realized", "realizedColorHex", "<init>", "(Lcom/stockbit/feature/history/contract/SbnFRType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lcom/stockbit/feature/history/contract/SbnFRType;", "getToolbarTitle", "()Ljava/lang/String;", "getSbnLogo", "getSbnSymbol", "getSbnName", "getDate", "getSellAmount", "getSellPrice", "getAvgBuy", "getReturnTax", "getTotalAmount", "getRealized", "getRealizedColorHex", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "history-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SbnFRUIParam implements Parcelable {
    public static final Parcelable.Creator<SbnFRUIParam> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final SbnFRType f96668a;

    /* renamed from: b, reason: collision with root package name */
    public final String f96669b;

    /* renamed from: c, reason: collision with root package name */
    public final String f96670c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f96671e;

    /* renamed from: f, reason: collision with root package name */
    public final String f96672f;

    /* renamed from: g, reason: collision with root package name */
    public final String f96673g;

    /* renamed from: h, reason: collision with root package name */
    public final String f96674h;

    /* renamed from: i, reason: collision with root package name */
    public final String f96675i;

    /* renamed from: j, reason: collision with root package name */
    public final String f96676j;

    /* renamed from: k, reason: collision with root package name */
    public final String f96677k;

    /* renamed from: l, reason: collision with root package name */
    public final String f96678l;

    /* renamed from: m, reason: collision with root package name */
    public final String f96679m;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final SbnFRUIParam a(Parcel r16) {
            p.l(r16, "parcel");
            return new SbnFRUIParam(SbnFRType.valueOf(r16.readString()), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString(), r16.readString());
        }

        public final SbnFRUIParam[] b(int r1) {
            return new SbnFRUIParam[r1];
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

    public SbnFRUIParam(SbnFRType r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, String r14) {
        p.l(r2, "type");
        p.l(r3, "toolbarTitle");
        p.l(r4, "sbnLogo");
        p.l(r5, "sbnSymbol");
        p.l(r6, "sbnName");
        p.l(r7, Constants.KEY_DATE);
        p.l(r8, "sellAmount");
        p.l(r9, "sellPrice");
        p.l(r10, "avgBuy");
        p.l(r11, "returnTax");
        p.l(r12, "totalAmount");
        p.l(r13, "realized");
        p.l(r14, "realizedColorHex");
        this.f96668a = r2;
        this.f96669b = r3;
        this.f96670c = r4;
        this.d = r5;
        this.f96671e = r6;
        this.f96672f = r7;
        this.f96673g = r8;
        this.f96674h = r9;
        this.f96675i = r10;
        this.f96676j = r11;
        this.f96677k = r12;
        this.f96678l = r13;
        this.f96679m = r14;
    }

    public final String a() {
        return this.f96675i;
    }

    public final String b() {
        return this.f96672f;
    }

    public final String c() {
        return this.f96678l;
    }

    public final String d() {
        return this.f96679m;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f96676j;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SbnFRUIParam) == true) goto L8;
        return false;
    L8:
        SbnFRUIParam r52 = (SbnFRUIParam) r5;
        if (this.f96668a == r52.f96668a) goto L12;
        return false;
    L12:
        if (p.g(this.f96669b, r52.f96669b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f96670c, r52.f96670c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f96671e, r52.f96671e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f96672f, r52.f96672f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f96673g, r52.f96673g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f96674h, r52.f96674h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f96675i, r52.f96675i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f96676j, r52.f96676j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f96677k, r52.f96677k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f96678l, r52.f96678l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f96679m, r52.f96679m) == true) goto L47;
        return false;
    L47:
        return true;
    }

    public final String f() {
        return this.f96671e;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.f96673g;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f96668a.hashCode() * 31) + this.f96669b.hashCode()) * 31) + this.f96670c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f96671e.hashCode()) * 31) + this.f96672f.hashCode()) * 31) + this.f96673g.hashCode()) * 31) + this.f96674h.hashCode()) * 31) + this.f96675i.hashCode()) * 31) + this.f96676j.hashCode()) * 31) + this.f96677k.hashCode()) * 31) + this.f96678l.hashCode()) * 31) + this.f96679m.hashCode();
    }

    public final String i() {
        return this.f96674h;
    }

    public final String j() {
        return this.f96669b;
    }

    public final String k() {
        return this.f96677k;
    }

    public final SbnFRType l() {
        return this.f96668a;
    }

    public String toString() {
        return "SbnFRUIParam(type=" + this.f96668a + ", toolbarTitle=" + this.f96669b + ", sbnLogo=" + this.f96670c + ", sbnSymbol=" + this.d + ", sbnName=" + this.f96671e + ", date=" + this.f96672f + ", sellAmount=" + this.f96673g + ", sellPrice=" + this.f96674h + ", avgBuy=" + this.f96675i + ", returnTax=" + this.f96676j + ", totalAmount=" + this.f96677k + ", realized=" + this.f96678l + ", realizedColorHex=" + this.f96679m + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f96668a.name());
        r1.writeString(this.f96669b);
        r1.writeString(this.f96670c);
        r1.writeString(this.d);
        r1.writeString(this.f96671e);
        r1.writeString(this.f96672f);
        r1.writeString(this.f96673g);
        r1.writeString(this.f96674h);
        r1.writeString(this.f96675i);
        r1.writeString(this.f96676j);
        r1.writeString(this.f96677k);
        r1.writeString(this.f96678l);
        r1.writeString(this.f96679m);
    }
}
