package com.stockbit.domain.model.entity.calendar;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/stockbit/domain/model/entity/calendar/CalendarEconomicColumnHeader;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CalendarEconomicColumnHeader implements Parcelable {
    public static final Parcelable.Creator<CalendarEconomicColumnHeader> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f82563a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82564b;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final CalendarEconomicColumnHeader a(Parcel r3) {
            kotlin.jvm.internal.p.l(r3, "parcel");
            return new CalendarEconomicColumnHeader(r3.readString(), r3.readString());
        }

        public final CalendarEconomicColumnHeader[] b(int r1) {
            return new CalendarEconomicColumnHeader[r1];
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

    public CalendarEconomicColumnHeader(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f82563a = r2;
        this.f82564b = r3;
    }

    public final String a() {
        return this.f82564b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CalendarEconomicColumnHeader) == true) goto L8;
        return false;
    L8:
        CalendarEconomicColumnHeader r52 = (CalendarEconomicColumnHeader) r5;
        if (kotlin.jvm.internal.p.g(this.f82563a, r52.f82563a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82564b, r52.f82564b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f82563a.hashCode() * 31) + this.f82564b.hashCode();
    }

    public String toString() {
        return "CalendarEconomicColumnHeader(id=" + this.f82563a + ", name=" + this.f82564b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        kotlin.jvm.internal.p.l(r1, "dest");
        r1.writeString(this.f82563a);
        r1.writeString(this.f82564b);
    }
}
