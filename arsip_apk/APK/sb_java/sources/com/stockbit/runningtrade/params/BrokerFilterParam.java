package com.stockbit.runningtrade.params;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.stockbit.usecase.runningtrade.model.BrokerType;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/stockbit/runningtrade/params/BrokerFilterParam;", "Landroid/os/Parcelable;", "code", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "type", "Lcom/stockbit/usecase/runningtrade/model/BrokerType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/usecase/runningtrade/model/BrokerType;)V", "getCode", "()Ljava/lang/String;", "getName", "getType", "()Lcom/stockbit/usecase/runningtrade/model/BrokerType;", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "runningtrade_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BrokerFilterParam implements Parcelable {
    public static final Parcelable.Creator<BrokerFilterParam> CREATOR = null;
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f131124a;

    /* renamed from: b, reason: collision with root package name */
    public final String f131125b;

    /* renamed from: c, reason: collision with root package name */
    public final BrokerType f131126c;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final BrokerFilterParam a(Parcel r4) {
            p.l(r4, "parcel");
            return new BrokerFilterParam(r4.readString(), r4.readString(), BrokerType.valueOf(r4.readString()));
        }

        public final BrokerFilterParam[] b(int r1) {
            return new BrokerFilterParam[r1];
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
        d = 8;
    }

    public BrokerFilterParam(String r2, String r3, BrokerType r4) {
        p.l(r2, "code");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "type");
        this.f131124a = r2;
        this.f131125b = r3;
        this.f131126c = r4;
    }

    public final String a() {
        return this.f131124a;
    }

    public final String b() {
        return this.f131125b;
    }

    public final BrokerType c() {
        return this.f131126c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BrokerFilterParam) == true) goto L8;
        return false;
    L8:
        BrokerFilterParam r52 = (BrokerFilterParam) r5;
        if (p.g(this.f131124a, r52.f131124a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f131125b, r52.f131125b) == true) goto L15;
        return false;
    L15:
        if (this.f131126c == r52.f131126c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f131124a.hashCode() * 31) + this.f131125b.hashCode()) * 31) + this.f131126c.hashCode();
    }

    public String toString() {
        return "BrokerFilterParam(code=" + this.f131124a + ", name=" + this.f131125b + ", type=" + this.f131126c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f131124a);
        r1.writeString(this.f131125b);
        r1.writeString(this.f131126c.name());
    }

    public /* synthetic */ BrokerFilterParam(String r2, String r3, BrokerType r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = BrokerType.BROKER_TYPE_UNSPECIFIED;
    L11:
        this(r2, r3, r4);
    }
}
