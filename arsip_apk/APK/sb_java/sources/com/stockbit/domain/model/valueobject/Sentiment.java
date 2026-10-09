package com.stockbit.domain.model.valueobject;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0007HÖ\u0081\u0004J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, d2 = {"Lcom/stockbit/domain/model/valueobject/Sentiment;", "Landroid/os/Parcelable;", "startValue", "", "endValue", "value", "period", "", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "getStartValue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getEndValue", "getValue", "getPeriod", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)Lcom/stockbit/domain/model/valueobject/Sentiment;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Sentiment implements Parcelable {
    public static final Parcelable.Creator<Sentiment> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final Double f86741a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f86742b;

    /* renamed from: c, reason: collision with root package name */
    public final Double f86743c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final Sentiment a(Parcel r7) {
            kotlin.jvm.internal.p.l(r7, "parcel");
            Double r2 = null;
            if (r7.readInt() != 0) goto L5;
            Double r1 = null;
        L7:
            if (r7.readInt() != 0) goto L9;
            Double r3 = null;
        L11:
            if (r7.readInt() == 0) goto L15;
            r2 = Double.valueOf(r7.readDouble());
        L15:
            return new Sentiment(r1, r3, r2, r7.readString());
        L9:
            r3 = Double.valueOf(r7.readDouble());
            goto L11
        L5:
            r1 = Double.valueOf(r7.readDouble());
            goto L7
        }

        public final Sentiment[] b(int r1) {
            return new Sentiment[r1];
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

    public Sentiment(Double r1, Double r2, Double r3, String r4) {
        this.f86741a = r1;
        this.f86742b = r2;
        this.f86743c = r3;
        this.d = r4;
    }

    public final Double a() {
        return this.f86742b;
    }

    public final String b() {
        return this.d;
    }

    public final Double c() {
        return this.f86741a;
    }

    public final Double d() {
        return this.f86743c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Sentiment) == true) goto L8;
        return false;
    L8:
        Sentiment r52 = (Sentiment) r5;
        if (kotlin.jvm.internal.p.g(this.f86741a, r52.f86741a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86742b, r52.f86742b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f86743c, r52.f86743c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        Double r02 = this.f86741a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Double r2 = this.f86742b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Double r23 = this.f86743c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
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
        return "Sentiment(startValue=" + this.f86741a + ", endValue=" + this.f86742b + ", value=" + this.f86743c + ", period=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        kotlin.jvm.internal.p.l(r5, "dest");
        Double r62 = this.f86741a;
        if (r62 != null) goto L5;
        r5.writeInt(0);
    L6:
        Double r63 = this.f86742b;
        if (r63 != null) goto L9;
        r5.writeInt(0);
    L10:
        Double r64 = this.f86743c;
        if (r64 != null) goto L13;
        r5.writeInt(0);
    L14:
        r5.writeString(this.d);
        return;
    L13:
        r5.writeInt(1);
        r5.writeDouble(r64.doubleValue());
        goto L14
    L9:
        r5.writeInt(1);
        r5.writeDouble(r63.doubleValue());
        goto L10
    L5:
        r5.writeInt(1);
        r5.writeDouble(r62.doubleValue());
        goto L6
    }

    public /* synthetic */ Sentiment(Double r2, Double r3, Double r4, String r5, int r6, kotlin.jvm.internal.i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }
}
