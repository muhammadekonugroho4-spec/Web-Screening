package com.stockbit.domain.model.valueobject;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u0005J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0083\u0004J\n\u0010 \u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006'"}, d2 = {"Lcom/stockbit/domain/model/valueobject/TippingMyJarProfile;", "Landroid/os/Parcelable;", "gopayAccount", "", "balance", "", "percentFee", "statusFee", "claimMinimum", "claimMaximum", "<init>", "(Ljava/lang/String;IIIII)V", "getGopayAccount", "()Ljava/lang/String;", "getBalance", "()I", "getPercentFee", "getStatusFee", "getClaimMinimum", "getClaimMaximum", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TippingMyJarProfile implements Parcelable {
    public static final Parcelable.Creator<TippingMyJarProfile> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f86744a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86745b;

    /* renamed from: c, reason: collision with root package name */
    public final int f86746c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f86747e;

    /* renamed from: f, reason: collision with root package name */
    public final int f86748f;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final TippingMyJarProfile a(Parcel r9) {
            kotlin.jvm.internal.p.l(r9, "parcel");
            return new TippingMyJarProfile(r9.readString(), r9.readInt(), r9.readInt(), r9.readInt(), r9.readInt(), r9.readInt());
        }

        public final TippingMyJarProfile[] b(int r1) {
            return new TippingMyJarProfile[r1];
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

    public TippingMyJarProfile(String r1, int r2, int r3, int r4, int r5, int r6) {
        this.f86744a = r1;
        this.f86745b = r2;
        this.f86746c = r3;
        this.d = r4;
        this.f86747e = r5;
        this.f86748f = r6;
    }

    public final int a() {
        return this.f86745b;
    }

    public final int b() {
        return this.f86748f;
    }

    public final String c() {
        return this.f86744a;
    }

    public final int d() {
        return this.f86746c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TippingMyJarProfile) == true) goto L8;
        return false;
    L8:
        TippingMyJarProfile r52 = (TippingMyJarProfile) r5;
        if (kotlin.jvm.internal.p.g(this.f86744a, r52.f86744a) == true) goto L12;
        return false;
    L12:
        if (this.f86745b == r52.f86745b) goto L15;
        return false;
    L15:
        if (this.f86746c == r52.f86746c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f86747e == r52.f86747e) goto L24;
        return false;
    L24:
        if (this.f86748f == r52.f86748f) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        String r02 = this.f86744a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (((((((((r03 * 31) + Integer.hashCode(this.f86745b)) * 31) + Integer.hashCode(this.f86746c)) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.f86747e)) * 31) + Integer.hashCode(this.f86748f);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "TippingMyJarProfile(gopayAccount=" + this.f86744a + ", balance=" + this.f86745b + ", percentFee=" + this.f86746c + ", statusFee=" + this.d + ", claimMinimum=" + this.f86747e + ", claimMaximum=" + this.f86748f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        kotlin.jvm.internal.p.l(r1, "dest");
        r1.writeString(this.f86744a);
        r1.writeInt(this.f86745b);
        r1.writeInt(this.f86746c);
        r1.writeInt(this.d);
        r1.writeInt(this.f86747e);
        r1.writeInt(this.f86748f);
    }
}
