package com.stockbit.domain.model.entity.withdrawal.accountbank;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0083\u0004J\n\u0010\"\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006)"}, d2 = {"Lcom/stockbit/domain/model/entity/withdrawal/accountbank/AccountBankRdn;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "accountName", "accountNumber", "colorCode", "bankLogo", "bankSwiftCode", "bankCountryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getAccountName", "getAccountNumber", "getColorCode", "getBankLogo", "getBankSwiftCode", "getBankCountryCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AccountBankRdn implements Parcelable {
    public static final Parcelable.Creator<AccountBankRdn> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f83922a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83923b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83924c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f83925e;

    /* renamed from: f, reason: collision with root package name */
    public final String f83926f;

    /* renamed from: g, reason: collision with root package name */
    public final String f83927g;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final AccountBankRdn a(Parcel r10) {
            p.l(r10, "parcel");
            return new AccountBankRdn(r10.readString(), r10.readString(), r10.readString(), r10.readString(), r10.readString(), r10.readString(), r10.readString());
        }

        public final AccountBankRdn[] b(int r1) {
            return new AccountBankRdn[r1];
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

    public AccountBankRdn(String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "accountName");
        p.l(r4, "accountNumber");
        p.l(r5, "colorCode");
        p.l(r6, "bankLogo");
        p.l(r7, "bankSwiftCode");
        p.l(r8, "bankCountryCode");
        this.f83922a = r2;
        this.f83923b = r3;
        this.f83924c = r4;
        this.d = r5;
        this.f83925e = r6;
        this.f83926f = r7;
        this.f83927g = r8;
    }

    public final String a() {
        return this.f83922a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AccountBankRdn) == true) goto L8;
        return false;
    L8:
        AccountBankRdn r52 = (AccountBankRdn) r5;
        if (p.g(this.f83922a, r52.f83922a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f83923b, r52.f83923b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f83924c, r52.f83924c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f83925e, r52.f83925e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f83926f, r52.f83926f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f83927g, r52.f83927g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        return (((((((((((this.f83922a.hashCode() * 31) + this.f83923b.hashCode()) * 31) + this.f83924c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f83925e.hashCode()) * 31) + this.f83926f.hashCode()) * 31) + this.f83927g.hashCode();
    }

    public String toString() {
        return "AccountBankRdn(name=" + this.f83922a + ", accountName=" + this.f83923b + ", accountNumber=" + this.f83924c + ", colorCode=" + this.d + ", bankLogo=" + this.f83925e + ", bankSwiftCode=" + this.f83926f + ", bankCountryCode=" + this.f83927g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f83922a);
        r1.writeString(this.f83923b);
        r1.writeString(this.f83924c);
        r1.writeString(this.d);
        r1.writeString(this.f83925e);
        r1.writeString(this.f83926f);
        r1.writeString(this.f83927g);
    }

    public /* synthetic */ AccountBankRdn(String r3, String r4, String r5, String r6, String r7, String r8, String r9, int r10, i r11) {
        if ((r10 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r10 & 2) == 0) goto L9;
        r4 = "-";
    L9:
        if ((r10 & 4) == 0) goto L12;
        r5 = "-";
    L12:
        if ((r10 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r10 & 16) == 0) goto L18;
        r7 = "";
    L18:
        if ((r10 & 32) == 0) goto L21;
        r8 = "";
    L21:
        if ((r10 & 64) == 0) goto L24;
        String r102 = "";
    L23:
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r3, r52, r62, r72, r82, r92, r102);
        return;
    L24:
        r102 = r9;
        goto L23
    }
}
