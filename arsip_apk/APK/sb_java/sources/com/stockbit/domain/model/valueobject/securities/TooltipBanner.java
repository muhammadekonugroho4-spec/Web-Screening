package com.stockbit.domain.model.valueobject.securities;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/stockbit/domain/model/valueobject/securities/TooltipBanner;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "<init>", "(Z)V", "getActive", "()Z", "component1", Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TooltipBanner implements Parcelable {
    public static final Parcelable.Creator<TooltipBanner> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f86986a;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final TooltipBanner a(Parcel r2) {
            p.l(r2, "parcel");
            if (r2.readInt() == 0) goto L5;
            boolean r22 = true;
        L7:
            return new TooltipBanner(r22);
        L5:
            r22 = false;
            goto L7
        }

        public final TooltipBanner[] b(int r1) {
            return new TooltipBanner[r1];
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

    public TooltipBanner(boolean r1) {
        this.f86986a = r1;
    }

    public final boolean a() {
        return this.f86986a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof TooltipBanner) == true) goto L9;
        return false;
    L9:
        if (this.f86986a == ((TooltipBanner) r4).f86986a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f86986a);
    }

    public String toString() {
        return "TooltipBanner(active=" + this.f86986a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.f86986a ? 1 : 0);
    }

    public /* synthetic */ TooltipBanner(boolean r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = false;
    L5:
        this(r1);
    }
}
