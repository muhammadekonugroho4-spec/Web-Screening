package com.stockbit.screener.ui.universe;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/stockbit/screener/ui/universe/ScreenerUniverseResult;", "Landroid/os/Parcelable;", "scopeId", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "scope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getScopeId", "()Ljava/lang/String;", "getName", "getScope", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "screener_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ScreenerUniverseResult implements Parcelable {
    public static final Parcelable.Creator<ScreenerUniverseResult> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f132988a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132989b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132990c;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ScreenerUniverseResult a(Parcel r4) {
            p.l(r4, "parcel");
            return new ScreenerUniverseResult(r4.readString(), r4.readString(), r4.readString());
        }

        public final ScreenerUniverseResult[] b(int r1) {
            return new ScreenerUniverseResult[r1];
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

    public ScreenerUniverseResult(String r2, String r3, String r4) {
        p.l(r2, "scopeId");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "scope");
        this.f132988a = r2;
        this.f132989b = r3;
        this.f132990c = r4;
    }

    public final String a() {
        return this.f132989b;
    }

    public final String b() {
        return this.f132990c;
    }

    public final String c() {
        return this.f132988a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ScreenerUniverseResult) == true) goto L8;
        return false;
    L8:
        ScreenerUniverseResult r52 = (ScreenerUniverseResult) r5;
        if (p.g(this.f132988a, r52.f132988a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f132989b, r52.f132989b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f132990c, r52.f132990c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f132988a.hashCode() * 31) + this.f132989b.hashCode()) * 31) + this.f132990c.hashCode();
    }

    public String toString() {
        return "ScreenerUniverseResult(scopeId=" + this.f132988a + ", name=" + this.f132989b + ", scope=" + this.f132990c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f132988a);
        r1.writeString(this.f132989b);
        r1.writeString(this.f132990c);
    }
}
