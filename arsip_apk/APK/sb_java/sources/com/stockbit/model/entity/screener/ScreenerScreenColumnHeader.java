package com.stockbit.model.entity.screener;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BC\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\n\u0010\u001c\u001a\u00020\u0005H\u0096\u0080\u0004J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003JE\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0006\u0010$\u001a\u00020\fJ\u0014\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010(\u001a\u00020\fHÖ\u0081\u0004J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006."}, d2 = {"Lcom/stockbit/model/entity/screener/ScreenerScreenColumnHeader;", "Landroid/os/Parcelable;", "Lcom/evrencoskun/tableview/filter/IFilterableModel;", "Lcom/evrencoskun/tableview/sort/ISortableModel;", "mId", "", AppMeasurementSdk.ConditionalUserProperty.NAME, Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "symbol", "columnSize", "", "sortingMode", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V", "getMId", "()Ljava/lang/String;", "getName", "getData", "getSymbol", "getColumnSize", "()J", "getSortingMode", "()I", "getFilterableKeyword", "getId", "getContent", "", "toString", "component1", "component2", "component3", "component4", "component5", "component6", com.clevertap.android.sdk.Constants.COPY_TYPE, "describeContents", "equals", "", "other", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ScreenerScreenColumnHeader implements Parcelable {
    public static final Parcelable.Creator<ScreenerScreenColumnHeader> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f122073a;

    /* renamed from: b, reason: collision with root package name */
    public final String f122074b;

    /* renamed from: c, reason: collision with root package name */
    public final String f122075c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final long f122076e;

    /* renamed from: f, reason: collision with root package name */
    public final int f122077f;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ScreenerScreenColumnHeader a(Parcel r10) {
            p.l(r10, "parcel");
            return new ScreenerScreenColumnHeader(r10.readString(), r10.readString(), r10.readString(), r10.readString(), r10.readLong(), r10.readInt());
        }

        public final ScreenerScreenColumnHeader[] b(int r1) {
            return new ScreenerScreenColumnHeader[r1];
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

    public ScreenerScreenColumnHeader(String r2, String r3, String r4, String r5, long r6, int r8) {
        p.l(r2, "mId");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        p.l(r5, "symbol");
        this.f122073a = r2;
        this.f122074b = r3;
        this.f122075c = r4;
        this.d = r5;
        this.f122076e = r6;
        this.f122077f = r8;
    }

    public final String a() {
        return this.f122075c;
    }

    public final int b() {
        return this.f122077f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ScreenerScreenColumnHeader) == true) goto L8;
        return false;
    L8:
        ScreenerScreenColumnHeader r82 = (ScreenerScreenColumnHeader) r8;
        if (p.g(this.f122073a, r82.f122073a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f122074b, r82.f122074b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f122075c, r82.f122075c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (this.f122076e == r82.f122076e) goto L24;
        return false;
    L24:
        if (this.f122077f == r82.f122077f) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((this.f122073a.hashCode() * 31) + this.f122074b.hashCode()) * 31) + this.f122075c.hashCode()) * 31) + this.d.hashCode()) * 31) + Long.hashCode(this.f122076e)) * 31) + Integer.hashCode(this.f122077f);
    }

    public String toString() {
        return "ScreenerScreenColumnHeaderModel{sortingMode=" + this.f122077f + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeString(this.f122073a);
        r3.writeString(this.f122074b);
        r3.writeString(this.f122075c);
        r3.writeString(this.d);
        r3.writeLong(this.f122076e);
        r3.writeInt(this.f122077f);
    }
}
