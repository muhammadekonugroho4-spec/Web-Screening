package com.stockbit.domain.model.entity.deposit;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0014\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0083\u0004J\n\u0010 \u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, d2 = {"Lcom/stockbit/domain/model/entity/deposit/RdnDetail;", "Landroid/os/Parcelable;", "bankCode", "", "bankName", "bankLogo", "accountName", "accountNo", "foreignAccount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getBankCode", "()Ljava/lang/String;", "getBankName", "getBankLogo", "getAccountName", "getAccountNo", "getForeignAccount", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RdnDetail implements Parcelable {
    public static final Parcelable.Creator<RdnDetail> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f82717a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82718b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82719c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82720e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f82721f;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final RdnDetail a(Parcel r9) {
            p.l(r9, "parcel");
            String r2 = r9.readString();
            String r3 = r9.readString();
            String r4 = r9.readString();
            String r5 = r9.readString();
            String r6 = r9.readString();
            if (r9.readInt() == 0) goto L6;
            boolean r92 = true;
        L8:
            return new RdnDetail(r2, r3, r4, r5, r6, r92);
        L6:
            r92 = false;
            goto L8
        }

        public final RdnDetail[] b(int r1) {
            return new RdnDetail[r1];
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

    public RdnDetail(String r2, String r3, String r4, String r5, String r6, boolean r7) {
        p.l(r2, "bankCode");
        p.l(r3, "bankName");
        p.l(r4, "bankLogo");
        p.l(r5, "accountName");
        p.l(r6, "accountNo");
        this.f82717a = r2;
        this.f82718b = r3;
        this.f82719c = r4;
        this.d = r5;
        this.f82720e = r6;
        this.f82721f = r7;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f82720e;
    }

    public final String c() {
        return this.f82719c;
    }

    public final String d() {
        return this.f82718b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f82721f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof RdnDetail) == true) goto L8;
        return false;
    L8:
        RdnDetail r52 = (RdnDetail) r5;
        if (p.g(this.f82717a, r52.f82717a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82718b, r52.f82718b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82719c, r52.f82719c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82720e, r52.f82720e) == true) goto L24;
        return false;
    L24:
        if (this.f82721f == r52.f82721f) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((this.f82717a.hashCode() * 31) + this.f82718b.hashCode()) * 31) + this.f82719c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82720e.hashCode()) * 31) + Boolean.hashCode(this.f82721f);
    }

    public String toString() {
        return "RdnDetail(bankCode=" + this.f82717a + ", bankName=" + this.f82718b + ", bankLogo=" + this.f82719c + ", accountName=" + this.d + ", accountNo=" + this.f82720e + ", foreignAccount=" + this.f82721f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f82717a);
        r1.writeString(this.f82718b);
        r1.writeString(this.f82719c);
        r1.writeString(this.d);
        r1.writeString(this.f82720e);
        r1.writeInt(this.f82721f ? 1 : 0);
    }

    public /* synthetic */ RdnDetail(String r2, String r3, String r4, String r5, String r6, boolean r7, int r8, i r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = "-";
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = "-";
    L18:
        if ((r8 & 32) == 0) goto L20;
        r7 = false;
    L20:
        boolean r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82);
    }
}
