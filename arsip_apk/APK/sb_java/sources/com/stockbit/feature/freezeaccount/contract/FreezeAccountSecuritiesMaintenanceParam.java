package com.stockbit.feature.freezeaccount.contract;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/stockbit/feature/freezeaccount/contract/FreezeAccountSecuritiesMaintenanceParam;", "Landroid/os/Parcelable;", "isSecuritiesMaintenance", "", "message", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getMessage", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "freezeaccount-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FreezeAccountSecuritiesMaintenanceParam implements Parcelable {
    public static final Parcelable.Creator<FreezeAccountSecuritiesMaintenanceParam> CREATOR = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f96509c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f96510a;

    /* renamed from: b, reason: collision with root package name */
    public final String f96511b;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final FreezeAccountSecuritiesMaintenanceParam a(Parcel r3) {
            p.l(r3, "parcel");
            if (r3.readInt() == 0) goto L5;
            boolean r1 = true;
        L7:
            return new FreezeAccountSecuritiesMaintenanceParam(r1, r3.readString());
        L5:
            r1 = false;
            goto L7
        }

        public final FreezeAccountSecuritiesMaintenanceParam[] b(int r1) {
            return new FreezeAccountSecuritiesMaintenanceParam[r1];
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
        f96509c = 8;
    }

    public FreezeAccountSecuritiesMaintenanceParam(boolean r2, String r3) {
        p.l(r3, "message");
        this.f96510a = r2;
        this.f96511b = r3;
    }

    public final String a() {
        return this.f96511b;
    }

    public final boolean b() {
        return this.f96510a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof FreezeAccountSecuritiesMaintenanceParam) == true) goto L8;
        return false;
    L8:
        FreezeAccountSecuritiesMaintenanceParam r52 = (FreezeAccountSecuritiesMaintenanceParam) r5;
        if (this.f96510a == r52.f96510a) goto L12;
        return false;
    L12:
        if (p.g(this.f96511b, r52.f96511b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f96510a) * 31) + this.f96511b.hashCode();
    }

    public String toString() {
        return "FreezeAccountSecuritiesMaintenanceParam(isSecuritiesMaintenance=" + this.f96510a + ", message=" + this.f96511b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.f96510a ? 1 : 0);
        r1.writeString(this.f96511b);
    }
}
