package com.stockbit.domain.model.entity.securities;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/stockbit/domain/model/entity/securities/HistoryRealizedTooltip;", "Landroid/os/Parcelable;", "header", "", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getHeader", "()Ljava/lang/String;", "getDescription", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HistoryRealizedTooltip implements Parcelable {
    public static final Parcelable.Creator<HistoryRealizedTooltip> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f83134a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83135b;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final HistoryRealizedTooltip a(Parcel r3) {
            kotlin.jvm.internal.p.l(r3, "parcel");
            return new HistoryRealizedTooltip(r3.readString(), r3.readString());
        }

        public final HistoryRealizedTooltip[] b(int r1) {
            return new HistoryRealizedTooltip[r1];
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

    public HistoryRealizedTooltip(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "header");
        kotlin.jvm.internal.p.l(r3, "description");
        this.f83134a = r2;
        this.f83135b = r3;
    }

    public final String a() {
        return this.f83135b;
    }

    public final String b() {
        return this.f83134a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof HistoryRealizedTooltip) == true) goto L8;
        return false;
    L8:
        HistoryRealizedTooltip r52 = (HistoryRealizedTooltip) r5;
        if (kotlin.jvm.internal.p.g(this.f83134a, r52.f83134a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f83135b, r52.f83135b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f83134a.hashCode() * 31) + this.f83135b.hashCode();
    }

    public String toString() {
        return "HistoryRealizedTooltip(header=" + this.f83134a + ", description=" + this.f83135b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        kotlin.jvm.internal.p.l(r1, "dest");
        r1.writeString(this.f83134a);
        r1.writeString(this.f83135b);
    }
}
