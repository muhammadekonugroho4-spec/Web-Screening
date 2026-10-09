package com.stockbit.domain.model.entity.securities;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import java.math.BigDecimal;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0014\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0083\u0004J\n\u0010'\u001a\u00020\"HÖ\u0081\u0004J\n\u0010(\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006."}, d2 = {"Lcom/stockbit/domain/model/entity/securities/HistoryStockDetail;", "Landroid/os/Parcelable;", "paymentDate", "", "ratioOldShare", "ratioNewShare", "closingPriceDate", "closingPrice", "Ljava/math/BigDecimal;", "oldShare", "dividendShare", "bonusShare", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPaymentDate", "()Ljava/lang/String;", "getRatioOldShare", "getRatioNewShare", "getClosingPriceDate", "getClosingPrice", "()Ljava/math/BigDecimal;", "getOldShare", "getDividendShare", "getBonusShare", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HistoryStockDetail implements Parcelable {
    public static final Parcelable.Creator<HistoryStockDetail> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f83140a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83141b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83142c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final BigDecimal f83143e;

    /* renamed from: f, reason: collision with root package name */
    public final String f83144f;

    /* renamed from: g, reason: collision with root package name */
    public final String f83145g;

    /* renamed from: h, reason: collision with root package name */
    public final String f83146h;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final HistoryStockDetail a(Parcel r11) {
            kotlin.jvm.internal.p.l(r11, "parcel");
            return new HistoryStockDetail(r11.readString(), r11.readString(), r11.readString(), r11.readString(), (BigDecimal) r11.readSerializable(), r11.readString(), r11.readString(), r11.readString());
        }

        public final HistoryStockDetail[] b(int r1) {
            return new HistoryStockDetail[r1];
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

    public HistoryStockDetail(String r2, String r3, String r4, String r5, BigDecimal r6, String r7, String r8, String r9) {
        kotlin.jvm.internal.p.l(r2, "paymentDate");
        kotlin.jvm.internal.p.l(r3, "ratioOldShare");
        kotlin.jvm.internal.p.l(r4, "ratioNewShare");
        kotlin.jvm.internal.p.l(r5, "closingPriceDate");
        kotlin.jvm.internal.p.l(r6, "closingPrice");
        kotlin.jvm.internal.p.l(r7, "oldShare");
        kotlin.jvm.internal.p.l(r8, "dividendShare");
        kotlin.jvm.internal.p.l(r9, "bonusShare");
        this.f83140a = r2;
        this.f83141b = r3;
        this.f83142c = r4;
        this.d = r5;
        this.f83143e = r6;
        this.f83144f = r7;
        this.f83145g = r8;
        this.f83146h = r9;
    }

    public final String a() {
        return this.f83146h;
    }

    public final BigDecimal b() {
        return this.f83143e;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f83145g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f83144f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof HistoryStockDetail) == true) goto L8;
        return false;
    L8:
        HistoryStockDetail r52 = (HistoryStockDetail) r5;
        if (kotlin.jvm.internal.p.g(this.f83140a, r52.f83140a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f83141b, r52.f83141b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f83142c, r52.f83142c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f83143e, r52.f83143e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f83144f, r52.f83144f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f83145g, r52.f83145g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f83146h, r52.f83146h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f83140a;
    }

    public final String g() {
        return this.f83142c;
    }

    public final String h() {
        return this.f83141b;
    }

    public int hashCode() {
        return (((((((((((((this.f83140a.hashCode() * 31) + this.f83141b.hashCode()) * 31) + this.f83142c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f83143e.hashCode()) * 31) + this.f83144f.hashCode()) * 31) + this.f83145g.hashCode()) * 31) + this.f83146h.hashCode();
    }

    public String toString() {
        return "HistoryStockDetail(paymentDate=" + this.f83140a + ", ratioOldShare=" + this.f83141b + ", ratioNewShare=" + this.f83142c + ", closingPriceDate=" + this.d + ", closingPrice=" + this.f83143e + ", oldShare=" + this.f83144f + ", dividendShare=" + this.f83145g + ", bonusShare=" + this.f83146h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        kotlin.jvm.internal.p.l(r1, "dest");
        r1.writeString(this.f83140a);
        r1.writeString(this.f83141b);
        r1.writeString(this.f83142c);
        r1.writeString(this.d);
        r1.writeSerializable(this.f83143e);
        r1.writeString(this.f83144f);
        r1.writeString(this.f83145g);
        r1.writeString(this.f83146h);
    }
}
