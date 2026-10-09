package com.stockbit.domain.model.entity.securities;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b*\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010-\u001a\u00020.J\u0014\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0083\u0004J\n\u00103\u001a\u00020.HÖ\u0081\u0004J\n\u00104\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020.R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0015¨\u0006:"}, d2 = {"Lcom/stockbit/domain/model/entity/securities/StockbitPortfolioResultExercise;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "type", FirebaseAnalytics.Param.PRICE, "listingDate", "expiredDate", "matureDate", "exerciseStartDate", "exerciseEndDate", "infoExercise", "priceFormated", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActive", "()Ljava/lang/String;", "getType", "getPrice", "getListingDate", "setListingDate", "(Ljava/lang/String;)V", "getExpiredDate", "setExpiredDate", "getMatureDate", "setMatureDate", "getExerciseStartDate", "setExerciseStartDate", "getExerciseEndDate", "setExerciseEndDate", "getInfoExercise", "setInfoExercise", "getPriceFormated", "setPriceFormated", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StockbitPortfolioResultExercise implements Parcelable {
    public static final Parcelable.Creator<StockbitPortfolioResultExercise> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f83179a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83180b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83181c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f83182e;

    /* renamed from: f, reason: collision with root package name */
    public String f83183f;

    /* renamed from: g, reason: collision with root package name */
    public String f83184g;

    /* renamed from: h, reason: collision with root package name */
    public String f83185h;

    /* renamed from: i, reason: collision with root package name */
    public String f83186i;

    /* renamed from: j, reason: collision with root package name */
    public String f83187j;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final StockbitPortfolioResultExercise a(Parcel r13) {
            kotlin.jvm.internal.p.l(r13, "parcel");
            return new StockbitPortfolioResultExercise(r13.readString(), r13.readString(), r13.readString(), r13.readString(), r13.readString(), r13.readString(), r13.readString(), r13.readString(), r13.readString(), r13.readString());
        }

        public final StockbitPortfolioResultExercise[] b(int r1) {
            return new StockbitPortfolioResultExercise[r1];
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

    public StockbitPortfolioResultExercise(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10) {
        this.f83179a = r1;
        this.f83180b = r2;
        this.f83181c = r3;
        this.d = r4;
        this.f83182e = r5;
        this.f83183f = r6;
        this.f83184g = r7;
        this.f83185h = r8;
        this.f83186i = r9;
        this.f83187j = r10;
    }

    public final String a() {
        return this.f83179a;
    }

    public final String b() {
        return this.f83185h;
    }

    public final String c() {
        return this.f83184g;
    }

    public final String d() {
        return this.f83182e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f83186i;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StockbitPortfolioResultExercise) == true) goto L8;
        return false;
    L8:
        StockbitPortfolioResultExercise r52 = (StockbitPortfolioResultExercise) r5;
        if (kotlin.jvm.internal.p.g(this.f83179a, r52.f83179a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f83180b, r52.f83180b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f83181c, r52.f83181c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f83182e, r52.f83182e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f83183f, r52.f83183f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f83184g, r52.f83184g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f83185h, r52.f83185h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f83186i, r52.f83186i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f83187j, r52.f83187j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f83183f;
    }

    public final String h() {
        return this.f83181c;
    }

    public int hashCode() {
        String r02 = this.f83179a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f83180b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f83181c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f83182e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f83183f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f83184g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f83185h;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.f83186i;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.f83187j;
        if (r217 == null) goto L43;
        r1 = r217.hashCode();
    L43:
        return r012 + r1;
    L37:
        r216 = r215.hashCode();
        goto L38
    L33:
        r214 = r213.hashCode();
        goto L34
    L29:
        r212 = r211.hashCode();
        goto L30
    L25:
        r210 = r29.hashCode();
        goto L26
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public final String i() {
        return this.f83187j;
    }

    public final String j() {
        return this.f83180b;
    }

    public String toString() {
        return "StockbitPortfolioResultExercise(active=" + this.f83179a + ", type=" + this.f83180b + ", price=" + this.f83181c + ", listingDate=" + this.d + ", expiredDate=" + this.f83182e + ", matureDate=" + this.f83183f + ", exerciseStartDate=" + this.f83184g + ", exerciseEndDate=" + this.f83185h + ", infoExercise=" + this.f83186i + ", priceFormated=" + this.f83187j + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        kotlin.jvm.internal.p.l(r1, "dest");
        r1.writeString(this.f83179a);
        r1.writeString(this.f83180b);
        r1.writeString(this.f83181c);
        r1.writeString(this.d);
        r1.writeString(this.f83182e);
        r1.writeString(this.f83183f);
        r1.writeString(this.f83184g);
        r1.writeString(this.f83185h);
        r1.writeString(this.f83186i);
        r1.writeString(this.f83187j);
    }

    public /* synthetic */ StockbitPortfolioResultExercise(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, int r12, kotlin.jvm.internal.i r13) {
        if ((r12 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r9 = null;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r10 = null;
    L30:
        if ((r12 & 512) == 0) goto L33;
        String r122 = null;
    L32:
        String r112 = r10;
        String r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102, r112, r122);
        return;
    L33:
        r122 = r11;
        goto L32
    }
}
