package com.stockbit.model.entity.screener;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B9\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010#\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006*"}, d2 = {"Lcom/stockbit/model/entity/screener/ScreenerScreenCell;", "Lcom/evrencoskun/tableview/sort/ISortableModel;", "Lcom/evrencoskun/tableview/filter/IFilterableModel;", "Landroid/os/Parcelable;", "mId", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "symbol", "symbol2", "columnSize", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getMId", "()Ljava/lang/String;", "getName", "getSymbol", "getSymbol2", "getColumnSize", "()J", "getId", "getContent", "", "getFilterableKeyword", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ScreenerScreenCell implements Parcelable {
    public static final Parcelable.Creator<ScreenerScreenCell> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f122069a;

    /* renamed from: b, reason: collision with root package name */
    public final String f122070b;

    /* renamed from: c, reason: collision with root package name */
    public final String f122071c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final long f122072e;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ScreenerScreenCell a(Parcel r9) {
            p.l(r9, "parcel");
            return new ScreenerScreenCell(r9.readString(), r9.readString(), r9.readString(), r9.readString(), r9.readLong());
        }

        public final ScreenerScreenCell[] b(int r1) {
            return new ScreenerScreenCell[r1];
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

    public ScreenerScreenCell(String r2, String r3, String r4, String r5, long r6) {
        p.l(r2, "mId");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "symbol");
        p.l(r5, "symbol2");
        this.f122069a = r2;
        this.f122070b = r3;
        this.f122071c = r4;
        this.d = r5;
        this.f122072e = r6;
    }

    public final String a() {
        return this.f122071c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ScreenerScreenCell) == true) goto L8;
        return false;
    L8:
        ScreenerScreenCell r82 = (ScreenerScreenCell) r8;
        if (p.g(this.f122069a, r82.f122069a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f122070b, r82.f122070b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f122071c, r82.f122071c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (this.f122072e == r82.f122072e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f122069a.hashCode() * 31) + this.f122070b.hashCode()) * 31) + this.f122071c.hashCode()) * 31) + this.d.hashCode()) * 31) + Long.hashCode(this.f122072e);
    }

    public String toString() {
        return "ScreenerScreenCell(mId=" + this.f122069a + ", name=" + this.f122070b + ", symbol=" + this.f122071c + ", symbol2=" + this.d + ", columnSize=" + this.f122072e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeString(this.f122069a);
        r3.writeString(this.f122070b);
        r3.writeString(this.f122071c);
        r3.writeString(this.d);
        r3.writeLong(this.f122072e);
    }
}
