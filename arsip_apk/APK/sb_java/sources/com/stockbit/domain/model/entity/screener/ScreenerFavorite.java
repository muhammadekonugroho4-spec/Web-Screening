package com.stockbit.domain.model.entity.screener;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/stockbit/domain/model/entity/screener/ScreenerFavorite;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", AppMeasurementSdk.ConditionalUserProperty.NAME, "type", "order", "valueType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getType", "getOrder", "getValueType", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScreenerFavorite implements Parcelable {
    public static final Parcelable.Creator<ScreenerFavorite> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f82867a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82868b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82869c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82870e;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ScreenerFavorite a(Parcel r8) {
            p.l(r8, "parcel");
            return new ScreenerFavorite(r8.readString(), r8.readString(), r8.readString(), r8.readString(), r8.readString());
        }

        public final ScreenerFavorite[] b(int r1) {
            return new ScreenerFavorite[r1];
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

    public ScreenerFavorite(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "type");
        p.l(r5, "order");
        p.l(r6, "valueType");
        this.f82867a = r2;
        this.f82868b = r3;
        this.f82869c = r4;
        this.d = r5;
        this.f82870e = r6;
    }

    public final String a() {
        return this.f82867a;
    }

    public final String b() {
        return this.f82868b;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f82869c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f82870e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ScreenerFavorite) == true) goto L8;
        return false;
    L8:
        ScreenerFavorite r52 = (ScreenerFavorite) r5;
        if (p.g(this.f82867a, r52.f82867a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82868b, r52.f82868b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82869c, r52.f82869c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82870e, r52.f82870e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f82867a.hashCode() * 31) + this.f82868b.hashCode()) * 31) + this.f82869c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82870e.hashCode();
    }

    public String toString() {
        return "ScreenerFavorite(id=" + this.f82867a + ", name=" + this.f82868b + ", type=" + this.f82869c + ", order=" + this.d + ", valueType=" + this.f82870e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f82867a);
        r1.writeString(this.f82868b);
        r1.writeString(this.f82869c);
        r1.writeString(this.d);
        r1.writeString(this.f82870e);
    }

    public /* synthetic */ ScreenerFavorite(String r2, String r3, String r4, String r5, String r6, int r7, i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r7 & 16) == 0) goto L18;
        String r72 = "";
    L17:
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72);
        return;
    L18:
        r72 = r6;
        goto L17
    }
}
