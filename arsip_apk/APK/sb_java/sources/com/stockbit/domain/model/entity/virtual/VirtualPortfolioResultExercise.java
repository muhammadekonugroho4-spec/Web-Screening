package com.stockbit.domain.model.entity.virtual;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010%\u001a\u00020&J\u0014\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0083\u0004J\n\u0010+\u001a\u00020&HÖ\u0081\u0004J\n\u0010,\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020&R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0013¨\u00062"}, d2 = {"Lcom/stockbit/domain/model/entity/virtual/VirtualPortfolioResultExercise;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "type", FirebaseAnalytics.Param.PRICE, "listingDate", "expiredDate", "matureDate", "exerciseStartDate", "exerciseEndDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActive", "()Ljava/lang/String;", "getType", "getPrice", "getListingDate", "setListingDate", "(Ljava/lang/String;)V", "getExpiredDate", "setExpiredDate", "getMatureDate", "setMatureDate", "getExerciseStartDate", "setExerciseStartDate", "getExerciseEndDate", "setExerciseEndDate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VirtualPortfolioResultExercise implements Parcelable {
    public static final Parcelable.Creator<VirtualPortfolioResultExercise> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f83837a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83838b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83839c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f83840e;

    /* renamed from: f, reason: collision with root package name */
    public String f83841f;

    /* renamed from: g, reason: collision with root package name */
    public String f83842g;

    /* renamed from: h, reason: collision with root package name */
    public String f83843h;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final VirtualPortfolioResultExercise a(Parcel r11) {
            p.l(r11, "parcel");
            return new VirtualPortfolioResultExercise(r11.readString(), r11.readString(), r11.readString(), r11.readString(), r11.readString(), r11.readString(), r11.readString(), r11.readString());
        }

        public final VirtualPortfolioResultExercise[] b(int r1) {
            return new VirtualPortfolioResultExercise[r1];
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

    public VirtualPortfolioResultExercise(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        this.f83837a = r1;
        this.f83838b = r2;
        this.f83839c = r3;
        this.d = r4;
        this.f83840e = r5;
        this.f83841f = r6;
        this.f83842g = r7;
        this.f83843h = r8;
    }

    public final String a() {
        return this.f83837a;
    }

    public final String b() {
        return this.f83843h;
    }

    public final String c() {
        return this.f83842g;
    }

    public final String d() {
        return this.f83840e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof VirtualPortfolioResultExercise) == true) goto L8;
        return false;
    L8:
        VirtualPortfolioResultExercise r52 = (VirtualPortfolioResultExercise) r5;
        if (p.g(this.f83837a, r52.f83837a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f83838b, r52.f83838b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f83839c, r52.f83839c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f83840e, r52.f83840e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f83841f, r52.f83841f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f83842g, r52.f83842g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f83843h, r52.f83843h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f83841f;
    }

    public final String g() {
        return this.f83839c;
    }

    public final String h() {
        return this.f83838b;
    }

    public int hashCode() {
        String r02 = this.f83837a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f83838b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f83839c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f83840e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f83841f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f83842g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f83843h;
        if (r213 == null) goto L35;
        r1 = r213.hashCode();
    L35:
        return r010 + r1;
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

    public String toString() {
        return "VirtualPortfolioResultExercise(active=" + this.f83837a + ", type=" + this.f83838b + ", price=" + this.f83839c + ", listingDate=" + this.d + ", expiredDate=" + this.f83840e + ", matureDate=" + this.f83841f + ", exerciseStartDate=" + this.f83842g + ", exerciseEndDate=" + this.f83843h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f83837a);
        r1.writeString(this.f83838b);
        r1.writeString(this.f83839c);
        r1.writeString(this.d);
        r1.writeString(this.f83840e);
        r1.writeString(this.f83841f);
        r1.writeString(this.f83842g);
        r1.writeString(this.f83843h);
    }
}
