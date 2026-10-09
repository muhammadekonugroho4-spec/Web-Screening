package com.stockbit.domain.model.entity.company;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003Jm\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010)\u001a\u00020*J\u0014\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0083\u0004J\n\u0010/\u001a\u00020*HÖ\u0081\u0004J\n\u00100\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0011\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00066"}, d2 = {"Lcom/stockbit/domain/model/entity/company/ChartPrice;", "Landroid/os/Parcelable;", Constants.KEY_DATE, "", "formattedDate", "xLabel", "value", "percentage", "open", Constants.PRIORITY_HIGH, "low", "volume", "change", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "getDate", "()Ljava/lang/String;", "getFormattedDate", "getXLabel", "setXLabel", "(Ljava/lang/String;)V", "getValue", "getPercentage", "getOpen", "getHigh", "getLow", "getVolume", "getChange", "()D", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ChartPrice implements Parcelable {
    public static final Parcelable.Creator<ChartPrice> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f82649a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82650b;

    /* renamed from: c, reason: collision with root package name */
    public String f82651c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82652e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82653f;

    /* renamed from: g, reason: collision with root package name */
    public final String f82654g;

    /* renamed from: h, reason: collision with root package name */
    public final String f82655h;

    /* renamed from: i, reason: collision with root package name */
    public final String f82656i;

    /* renamed from: j, reason: collision with root package name */
    public final double f82657j;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ChartPrice a(Parcel r14) {
            p.l(r14, "parcel");
            return new ChartPrice(r14.readString(), r14.readString(), r14.readString(), r14.readString(), r14.readString(), r14.readString(), r14.readString(), r14.readString(), r14.readString(), r14.readDouble());
        }

        public final ChartPrice[] b(int r1) {
            return new ChartPrice[r1];
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

    public ChartPrice(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, double r11) {
        p.l(r2, Constants.KEY_DATE);
        p.l(r3, "formattedDate");
        p.l(r4, "xLabel");
        p.l(r5, "value");
        p.l(r6, "percentage");
        p.l(r7, "open");
        p.l(r8, Constants.PRIORITY_HIGH);
        p.l(r9, "low");
        p.l(r10, "volume");
        this.f82649a = r2;
        this.f82650b = r3;
        this.f82651c = r4;
        this.d = r5;
        this.f82652e = r6;
        this.f82653f = r7;
        this.f82654g = r8;
        this.f82655h = r9;
        this.f82656i = r10;
        this.f82657j = r11;
    }

    public static /* synthetic */ ChartPrice b(ChartPrice r02, String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, double r10, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L6;
        r1 = r02.f82649a;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r2 = r02.f82650b;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r3 = r02.f82651c;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r5 = r02.f82652e;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r6 = r02.f82653f;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r7 = r02.f82654g;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r8 = r02.f82655h;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r9 = r02.f82656i;
    L30:
        if ((r12 & 512) == 0) goto L32;
        r10 = r02.f82657j;
    L32:
        double r122 = r10;
        String r102 = r8;
        String r11 = r9;
        String r82 = r6;
        String r92 = r7;
        String r62 = r4;
        String r72 = r5;
        String r52 = r3;
        String r32 = r1;
        return r02.a(r32, r2, r52, r62, r72, r82, r92, r102, r11, r122);
    }

    public final ChartPrice a(String r14, String r15, String r16, String r17, String r18, String r19, String r20, String r21, String r22, double r23) {
        p.l(r14, Constants.KEY_DATE);
        p.l(r15, "formattedDate");
        p.l(r16, "xLabel");
        p.l(r17, "value");
        p.l(r18, "percentage");
        p.l(r19, "open");
        p.l(r20, Constants.PRIORITY_HIGH);
        p.l(r21, "low");
        p.l(r22, "volume");
        return new ChartPrice(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
    }

    public final double c() {
        return this.f82657j;
    }

    public final String d() {
        return this.f82650b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f82654g;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ChartPrice) == true) goto L8;
        return false;
    L8:
        ChartPrice r82 = (ChartPrice) r8;
        if (p.g(this.f82649a, r82.f82649a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82650b, r82.f82650b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82651c, r82.f82651c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82652e, r82.f82652e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f82653f, r82.f82653f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f82654g, r82.f82654g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f82655h, r82.f82655h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f82656i, r82.f82656i) == true) goto L36;
        return false;
    L36:
        if (Double.compare(this.f82657j, r82.f82657j) == 0) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f82655h;
    }

    public final String g() {
        return this.f82653f;
    }

    public final String h() {
        return this.f82652e;
    }

    public int hashCode() {
        return (((((((((((((((((this.f82649a.hashCode() * 31) + this.f82650b.hashCode()) * 31) + this.f82651c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82652e.hashCode()) * 31) + this.f82653f.hashCode()) * 31) + this.f82654g.hashCode()) * 31) + this.f82655h.hashCode()) * 31) + this.f82656i.hashCode()) * 31) + Double.hashCode(this.f82657j);
    }

    public final String i() {
        return this.d;
    }

    public final String j() {
        return this.f82656i;
    }

    public String toString() {
        return "ChartPrice(date=" + this.f82649a + ", formattedDate=" + this.f82650b + ", xLabel=" + this.f82651c + ", value=" + this.d + ", percentage=" + this.f82652e + ", open=" + this.f82653f + ", high=" + this.f82654g + ", low=" + this.f82655h + ", volume=" + this.f82656i + ", change=" + this.f82657j + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeString(this.f82649a);
        r3.writeString(this.f82650b);
        r3.writeString(this.f82651c);
        r3.writeString(this.d);
        r3.writeString(this.f82652e);
        r3.writeString(this.f82653f);
        r3.writeString(this.f82654g);
        r3.writeString(this.f82655h);
        r3.writeString(this.f82656i);
        r3.writeDouble(this.f82657j);
    }

    public /* synthetic */ ChartPrice(String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, double r12, int r14, i r15) {
        if ((r14 & 1) == 0) goto L6;
        r3 = "0";
    L6:
        if ((r14 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r14 & 4) == 0) goto L12;
        r5 = "0";
    L12:
        if ((r14 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r14 & 16) == 0) goto L18;
        r7 = "";
    L18:
        if ((r14 & 32) == 0) goto L21;
        r8 = "";
    L21:
        if ((r14 & 64) == 0) goto L24;
        r9 = "";
    L24:
        if ((r14 & 128) == 0) goto L27;
        r10 = "";
    L27:
        if ((r14 & 256) == 0) goto L30;
        r11 = "";
    L30:
        if ((r14 & 512) == 0) goto L32;
        r12 = 0.0d;
    L32:
        double r13 = r12;
        String r122 = r11;
        String r112 = r10;
        String r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r3, r52, r62, r72, r82, r92, r102, r112, r122, r13);
    }
}
