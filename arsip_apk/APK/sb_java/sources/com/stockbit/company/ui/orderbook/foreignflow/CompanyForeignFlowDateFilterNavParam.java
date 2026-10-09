package com.stockbit.company.ui.orderbook.foreignflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.common.net.HttpHeaders;
import com.google.firebase.messaging.Constants;
import com.stockbit.usecase.foreignflow.contract.entity.ForeignFlowDatePreset;
import java.time.LocalDate;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/stockbit/company/ui/orderbook/foreignflow/CompanyForeignFlowDateFilterNavParam;", "Landroid/os/Parcelable;", "Preset", "SingleDate", HttpHeaders.RANGE, "Lcom/stockbit/company/ui/orderbook/foreignflow/CompanyForeignFlowDateFilterNavParam$Preset;", "Lcom/stockbit/company/ui/orderbook/foreignflow/CompanyForeignFlowDateFilterNavParam$Range;", "Lcom/stockbit/company/ui/orderbook/foreignflow/CompanyForeignFlowDateFilterNavParam$SingleDate;", "company_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface CompanyForeignFlowDateFilterNavParam extends Parcelable {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stockbit/company/ui/orderbook/foreignflow/CompanyForeignFlowDateFilterNavParam$Preset;", "Lcom/stockbit/company/ui/orderbook/foreignflow/CompanyForeignFlowDateFilterNavParam;", "value", "Lcom/stockbit/usecase/foreignflow/contract/entity/ForeignFlowDatePreset;", "<init>", "(Lcom/stockbit/usecase/foreignflow/contract/entity/ForeignFlowDatePreset;)V", "getValue", "()Lcom/stockbit/usecase/foreignflow/contract/entity/ForeignFlowDatePreset;", "component1", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "company_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Preset implements CompanyForeignFlowDateFilterNavParam {
        public static final Parcelable.Creator<Preset> CREATOR = null;

        /* renamed from: b, reason: collision with root package name */
        public static final int f67431b = 0;

        /* renamed from: a, reason: collision with root package name */
        public final ForeignFlowDatePreset f67432a;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final Preset a(Parcel r2) {
                kotlin.jvm.internal.p.l(r2, "parcel");
                return new Preset(ForeignFlowDatePreset.valueOf(r2.readString()));
            }

            public final Preset[] b(int r1) {
                return new Preset[r1];
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
            f67431b = 8;
        }

        public Preset(ForeignFlowDatePreset r2) {
            kotlin.jvm.internal.p.l(r2, "value");
            this.f67432a = r2;
        }

        public final ForeignFlowDatePreset a() {
            return this.f67432a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof Preset) == true) goto L9;
            return false;
        L9:
            if (this.f67432a == ((Preset) r4).f67432a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f67432a.hashCode();
        }

        public String toString() {
            return "Preset(value=" + this.f67432a + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r1, int r2) {
            kotlin.jvm.internal.p.l(r1, "dest");
            r1.writeString(this.f67432a.name());
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006!"}, d2 = {"Lcom/stockbit/company/ui/orderbook/foreignflow/CompanyForeignFlowDateFilterNavParam$Range;", "Lcom/stockbit/company/ui/orderbook/foreignflow/CompanyForeignFlowDateFilterNavParam;", "fromEpochDay", "", "toEpochDay", "<init>", "(JJ)V", "getFromEpochDay", "()J", "getToEpochDay", Constants.MessagePayloadKeys.FROM, "Ljava/time/LocalDate;", "getFrom", "()Ljava/time/LocalDate;", "to", "getTo", "component1", "component2", com.clevertap.android.sdk.Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "company_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Range implements CompanyForeignFlowDateFilterNavParam {
        public static final Parcelable.Creator<Range> CREATOR = null;

        /* renamed from: c, reason: collision with root package name */
        public static final int f67433c = 0;

        /* renamed from: a, reason: collision with root package name */
        public final long f67434a;

        /* renamed from: b, reason: collision with root package name */
        public final long f67435b;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final Range a(Parcel r6) {
                kotlin.jvm.internal.p.l(r6, "parcel");
                return new Range(r6.readLong(), r6.readLong());
            }

            public final Range[] b(int r1) {
                return new Range[r1];
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
            f67433c = 8;
        }

        public Range(long r1, long r3) {
            this.f67434a = r1;
            this.f67435b = r3;
        }

        public final LocalDate a() {
            LocalDate r02 = LocalDate.ofEpochDay(this.f67434a);
            kotlin.jvm.internal.p.k(r02, "ofEpochDay(...)");
            return r02;
        }

        public final LocalDate b() {
            LocalDate r02 = LocalDate.ofEpochDay(this.f67435b);
            kotlin.jvm.internal.p.k(r02, "ofEpochDay(...)");
            return r02;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof Range) == true) goto L8;
            return false;
        L8:
            Range r82 = (Range) r8;
            if (this.f67434a == r82.f67434a) goto L12;
            return false;
        L12:
            if (this.f67435b == r82.f67435b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Long.hashCode(this.f67434a) * 31) + Long.hashCode(this.f67435b);
        }

        public String toString() {
            return "Range(fromEpochDay=" + this.f67434a + ", toEpochDay=" + this.f67435b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r3, int r4) {
            kotlin.jvm.internal.p.l(r3, "dest");
            r3.writeLong(this.f67434a);
            r3.writeLong(this.f67435b);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stockbit/company/ui/orderbook/foreignflow/CompanyForeignFlowDateFilterNavParam$SingleDate;", "Lcom/stockbit/company/ui/orderbook/foreignflow/CompanyForeignFlowDateFilterNavParam;", "epochDay", "", "<init>", "(J)V", "getEpochDay", "()J", "value", "Ljava/time/LocalDate;", "getValue", "()Ljava/time/LocalDate;", "component1", com.clevertap.android.sdk.Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "company_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SingleDate implements CompanyForeignFlowDateFilterNavParam {
        public static final Parcelable.Creator<SingleDate> CREATOR = null;

        /* renamed from: b, reason: collision with root package name */
        public static final int f67436b = 0;

        /* renamed from: a, reason: collision with root package name */
        public final long f67437a;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final SingleDate a(Parcel r4) {
                kotlin.jvm.internal.p.l(r4, "parcel");
                return new SingleDate(r4.readLong());
            }

            public final SingleDate[] b(int r1) {
                return new SingleDate[r1];
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
            f67436b = 8;
        }

        public SingleDate(long r1) {
            this.f67437a = r1;
        }

        public final LocalDate a() {
            LocalDate r02 = LocalDate.ofEpochDay(this.f67437a);
            kotlin.jvm.internal.p.k(r02, "ofEpochDay(...)");
            return r02;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof SingleDate) == true) goto L9;
            return false;
        L9:
            if (this.f67437a == ((SingleDate) r8).f67437a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Long.hashCode(this.f67437a);
        }

        public String toString() {
            return "SingleDate(epochDay=" + this.f67437a + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r3, int r4) {
            kotlin.jvm.internal.p.l(r3, "dest");
            r3.writeLong(this.f67437a);
        }
    }
}
