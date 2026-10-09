package com.stockbit.domain.model.entity.withdrawal.accountbank;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JY\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0083\u0004J\n\u0010%\u001a\u00020 HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006,"}, d2 = {"Lcom/stockbit/domain/model/entity/withdrawal/accountbank/AccountBankPersonal;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "accountName", "accountNameFormatCapitalizeWords", "accountNumber", "colorCode", "bankLogo", "bankSwiftCode", "bankCountryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getAccountName", "getAccountNameFormatCapitalizeWords", "getAccountNumber", "getColorCode", "getBankLogo", "getBankSwiftCode", "getBankCountryCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AccountBankPersonal implements Parcelable {
    public static final Parcelable.Creator<AccountBankPersonal> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f83915a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83916b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83917c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f83918e;

    /* renamed from: f, reason: collision with root package name */
    public final String f83919f;

    /* renamed from: g, reason: collision with root package name */
    public final String f83920g;

    /* renamed from: h, reason: collision with root package name */
    public final String f83921h;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final AccountBankPersonal a(Parcel r11) {
            p.l(r11, "parcel");
            return new AccountBankPersonal(r11.readString(), r11.readString(), r11.readString(), r11.readString(), r11.readString(), r11.readString(), r11.readString(), r11.readString());
        }

        public final AccountBankPersonal[] b(int r1) {
            return new AccountBankPersonal[r1];
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

    public AccountBankPersonal(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "accountName");
        p.l(r4, "accountNameFormatCapitalizeWords");
        p.l(r5, "accountNumber");
        p.l(r6, "colorCode");
        p.l(r7, "bankLogo");
        p.l(r8, "bankSwiftCode");
        p.l(r9, "bankCountryCode");
        this.f83915a = r2;
        this.f83916b = r3;
        this.f83917c = r4;
        this.d = r5;
        this.f83918e = r6;
        this.f83919f = r7;
        this.f83920g = r8;
        this.f83921h = r9;
    }

    public final String a() {
        return this.f83916b;
    }

    public final String b() {
        return this.f83917c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f83921h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f83919f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AccountBankPersonal) == true) goto L8;
        return false;
    L8:
        AccountBankPersonal r52 = (AccountBankPersonal) r5;
        if (p.g(this.f83915a, r52.f83915a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f83916b, r52.f83916b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f83917c, r52.f83917c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f83918e, r52.f83918e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f83919f, r52.f83919f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f83920g, r52.f83920g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f83921h, r52.f83921h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f83920g;
    }

    public final String g() {
        return this.f83915a;
    }

    public int hashCode() {
        return (((((((((((((this.f83915a.hashCode() * 31) + this.f83916b.hashCode()) * 31) + this.f83917c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f83918e.hashCode()) * 31) + this.f83919f.hashCode()) * 31) + this.f83920g.hashCode()) * 31) + this.f83921h.hashCode();
    }

    public String toString() {
        return "AccountBankPersonal(name=" + this.f83915a + ", accountName=" + this.f83916b + ", accountNameFormatCapitalizeWords=" + this.f83917c + ", accountNumber=" + this.d + ", colorCode=" + this.f83918e + ", bankLogo=" + this.f83919f + ", bankSwiftCode=" + this.f83920g + ", bankCountryCode=" + this.f83921h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f83915a);
        r1.writeString(this.f83916b);
        r1.writeString(this.f83917c);
        r1.writeString(this.d);
        r1.writeString(this.f83918e);
        r1.writeString(this.f83919f);
        r1.writeString(this.f83920g);
        r1.writeString(this.f83921h);
    }

    public /* synthetic */ AccountBankPersonal(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, int r10, i r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = "-";
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = "-";
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = "-";
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = "-";
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = "";
    L24:
        if ((r10 & 128) == 0) goto L27;
        String r102 = "";
    L26:
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82, r92, r102);
        return;
    L27:
        r102 = r9;
        goto L26
    }
}
