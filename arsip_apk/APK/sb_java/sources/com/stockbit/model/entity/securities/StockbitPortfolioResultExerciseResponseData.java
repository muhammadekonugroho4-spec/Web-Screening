package com.stockbit.model.entity.securities;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010)\u001a\u00020*J\u0014\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0083\u0004J\n\u0010/\u001a\u00020*HÖ\u0081\u0004J\n\u00100\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020*R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0014R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0014R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0014R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0014R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0014R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0014¨\u00066"}, d2 = {"Lcom/stockbit/model/entity/securities/StockbitPortfolioResultExerciseResponseData;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "type", FirebaseAnalytics.Param.PRICE, "listingDate", "expiredDate", "matureDate", "exerciseStartDate", "exerciseEndDate", "infoExercise", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActive", "()Ljava/lang/String;", "getType", "getPrice", "getListingDate", "setListingDate", "(Ljava/lang/String;)V", "getExpiredDate", "setExpiredDate", "getMatureDate", "setMatureDate", "getExerciseStartDate", "setExerciseStartDate", "getExerciseEndDate", "setExerciseEndDate", "getInfoExercise", "setInfoExercise", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StockbitPortfolioResultExerciseResponseData implements Parcelable {
    public static final Parcelable.Creator<StockbitPortfolioResultExerciseResponseData> CREATOR = null;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
    private final String active;

    @SerializedName("exercise_end_date")
    private String exerciseEndDate;

    @SerializedName("exercise_start_date")
    private String exerciseStartDate;

    @SerializedName("expired_date")
    private String expiredDate;

    @SerializedName("info")
    private String infoExercise;

    @SerializedName("listing_date")
    private String listingDate;

    @SerializedName("mature_date")
    private String matureDate;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final String price;

    @SerializedName("type")
    private final String type;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final StockbitPortfolioResultExerciseResponseData a(Parcel r12) {
            p.l(r12, "parcel");
            return new StockbitPortfolioResultExerciseResponseData(r12.readString(), r12.readString(), r12.readString(), r12.readString(), r12.readString(), r12.readString(), r12.readString(), r12.readString(), r12.readString());
        }

        public final StockbitPortfolioResultExerciseResponseData[] b(int r1) {
            return new StockbitPortfolioResultExerciseResponseData[r1];
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

    public StockbitPortfolioResultExerciseResponseData() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
    }

    public final String a() {
        return this.active;
    }

    public final String b() {
        return this.exerciseEndDate;
    }

    public final String c() {
        return this.exerciseStartDate;
    }

    public final String d() {
        return this.expiredDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.infoExercise;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StockbitPortfolioResultExerciseResponseData) == true) goto L8;
        return false;
    L8:
        StockbitPortfolioResultExerciseResponseData r52 = (StockbitPortfolioResultExerciseResponseData) r5;
        if (p.g(this.active, r52.active) == true) goto L12;
        return false;
    L12:
        if (p.g(this.type, r52.type) == true) goto L15;
        return false;
    L15:
        if (p.g(this.price, r52.price) == true) goto L18;
        return false;
    L18:
        if (p.g(this.listingDate, r52.listingDate) == true) goto L21;
        return false;
    L21:
        if (p.g(this.expiredDate, r52.expiredDate) == true) goto L24;
        return false;
    L24:
        if (p.g(this.matureDate, r52.matureDate) == true) goto L27;
        return false;
    L27:
        if (p.g(this.exerciseStartDate, r52.exerciseStartDate) == true) goto L30;
        return false;
    L30:
        if (p.g(this.exerciseEndDate, r52.exerciseEndDate) == true) goto L33;
        return false;
    L33:
        if (p.g(this.infoExercise, r52.infoExercise) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.listingDate;
    }

    public final String g() {
        return this.matureDate;
    }

    public final String h() {
        return this.price;
    }

    public int hashCode() {
        String r02 = this.active;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.type;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.price;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.listingDate;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.expiredDate;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.matureDate;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.exerciseStartDate;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.exerciseEndDate;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.infoExercise;
        if (r215 == null) goto L39;
        r1 = r215.hashCode();
    L39:
        return r011 + r1;
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
        return this.type;
    }

    public String toString() {
        return "StockbitPortfolioResultExerciseResponseData(active=" + this.active + ", type=" + this.type + ", price=" + this.price + ", listingDate=" + this.listingDate + ", expiredDate=" + this.expiredDate + ", matureDate=" + this.matureDate + ", exerciseStartDate=" + this.exerciseStartDate + ", exerciseEndDate=" + this.exerciseEndDate + ", infoExercise=" + this.infoExercise + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.active);
        r1.writeString(this.type);
        r1.writeString(this.price);
        r1.writeString(this.listingDate);
        r1.writeString(this.expiredDate);
        r1.writeString(this.matureDate);
        r1.writeString(this.exerciseStartDate);
        r1.writeString(this.exerciseEndDate);
        r1.writeString(this.infoExercise);
    }

    public StockbitPortfolioResultExerciseResponseData(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        this.active = r1;
        this.type = r2;
        this.price = r3;
        this.listingDate = r4;
        this.expiredDate = r5;
        this.matureDate = r6;
        this.exerciseStartDate = r7;
        this.exerciseEndDate = r8;
        this.infoExercise = r9;
    }

    public /* synthetic */ StockbitPortfolioResultExerciseResponseData(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, int r11, i r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = null;
    L27:
        if ((r11 & 256) == 0) goto L30;
        String r112 = null;
    L29:
        String r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102, r112);
        return;
    L30:
        r112 = r10;
        goto L29
    }
}
