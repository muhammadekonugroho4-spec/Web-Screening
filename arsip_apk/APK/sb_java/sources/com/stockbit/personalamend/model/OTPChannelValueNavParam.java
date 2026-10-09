package com.stockbit.personalamend.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.stockbit.features.model.OTPChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/stockbit/personalamend/model/OTPChannelValueNavParam;", "Landroid/os/Parcelable;", "channel", "Lcom/stockbit/features/model/OTPChannel;", "value", "", "<init>", "(Lcom/stockbit/features/model/OTPChannel;Ljava/lang/String;)V", "getChannel", "()Lcom/stockbit/features/model/OTPChannel;", "setChannel", "(Lcom/stockbit/features/model/OTPChannel;)V", "getValue", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "personalamend-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OTPChannelValueNavParam implements Parcelable {
    public static final Parcelable.Creator<OTPChannelValueNavParam> CREATOR = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f125335c = 0;

    /* renamed from: a, reason: collision with root package name */
    public OTPChannel f125336a;

    /* renamed from: b, reason: collision with root package name */
    public final String f125337b;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final OTPChannelValueNavParam a(Parcel r3) {
            p.l(r3, "parcel");
            return new OTPChannelValueNavParam(OTPChannel.valueOf(r3.readString()), r3.readString());
        }

        public final OTPChannelValueNavParam[] b(int r1) {
            return new OTPChannelValueNavParam[r1];
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
        f125335c = 8;
    }

    public OTPChannelValueNavParam(OTPChannel r2, String r3) {
        p.l(r2, "channel");
        p.l(r3, "value");
        this.f125336a = r2;
        this.f125337b = r3;
    }

    public final OTPChannel a() {
        return this.f125336a;
    }

    public final String b() {
        return this.f125337b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OTPChannelValueNavParam) == true) goto L8;
        return false;
    L8:
        OTPChannelValueNavParam r52 = (OTPChannelValueNavParam) r5;
        if (this.f125336a == r52.f125336a) goto L12;
        return false;
    L12:
        if (p.g(this.f125337b, r52.f125337b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f125336a.hashCode() * 31) + this.f125337b.hashCode();
    }

    public String toString() {
        return "OTPChannelValueNavParam(channel=" + this.f125336a + ", value=" + this.f125337b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f125336a.name());
        r1.writeString(this.f125337b);
    }
}
