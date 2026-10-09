package com.iab.digitalidentity.sdk.core.model;

import a.AbstractC2049c;
import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000b\"\u0004\b$\u0010%R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u001a\u0004\b&\u0010\u000b\"\u0004\b'\u0010%R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u001a\u0004\b(\u0010\u000b\"\u0004\b)\u0010%R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u001a\u0004\b*\u0010\u000b\"\u0004\b+\u0010%R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b,\u0010\u000b\"\u0004\b-\u0010%¨\u0006."}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/AddressViewModel;", "Landroid/os/Parcelable;", "", "addressLine1", "addressLine2", "province", "city", "country", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/iab/digitalidentity/sdk/core/model/AddressViewModel;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/w;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAddressLine1", "setAddressLine1", "(Ljava/lang/String;)V", "getAddressLine2", "setAddressLine2", "getProvince", "setProvince", "getCity", "setCity", "getCountry", "setCountry", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressViewModel implements Parcelable {
    public static final Parcelable.Creator<AddressViewModel> CREATOR = null;

    @SerializedName("addressLine1")
    private String addressLine1;

    @SerializedName("addressLine2")
    private String addressLine2;

    @SerializedName("city")
    private String city;

    @SerializedName("country")
    private String country;

    @SerializedName("province")
    private String province;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AddressViewModel> {
        public Creator() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressViewModel createFromParcel(Parcel r8) {
            p.l(r8, "parcel");
            return new AddressViewModel(r8.readString(), r8.readString(), r8.readString(), r8.readString(), r8.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressViewModel[] newArray(int r1) {
            return new AddressViewModel[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AddressViewModel createFromParcel(Parcel r1) {
            return createFromParcel(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AddressViewModel[] newArray(int r1) {
            return newArray(r1);
        }
    }

    static {
        CREATOR = new Creator();
    }

    public AddressViewModel(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, "addressLine1");
        p.l(r3, "addressLine2");
        p.l(r4, "province");
        p.l(r5, "city");
        p.l(r6, "country");
        this.addressLine1 = r2;
        this.addressLine2 = r3;
        this.province = r4;
        this.city = r5;
        this.country = r6;
    }

    public static /* synthetic */ AddressViewModel copy$default(AddressViewModel r02, String r1, String r2, String r3, String r4, String r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r02.addressLine1;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r02.addressLine2;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r02.province;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r02.city;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r02.country;
    L17:
        String r62 = r4;
        String r72 = r5;
        String r52 = r3;
        String r32 = r1;
        return r02.copy(r32, r2, r52, r62, r72);
    }

    public final String component1() {
        return this.addressLine1;
    }

    public final String component2() {
        return this.addressLine2;
    }

    public final String component3() {
        return this.province;
    }

    public final String component4() {
        return this.city;
    }

    public final String component5() {
        return this.country;
    }

    public final AddressViewModel copy(String r8, String r9, String r10, String r11, String r12) {
        p.l(r8, "addressLine1");
        p.l(r9, "addressLine2");
        p.l(r10, "province");
        p.l(r11, "city");
        p.l(r12, "country");
        return new AddressViewModel(r8, r9, r10, r11, r12);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AddressViewModel) == true) goto L8;
        return false;
    L8:
        AddressViewModel r52 = (AddressViewModel) r5;
        if (p.g(this.addressLine1, r52.addressLine1) == true) goto L12;
        return false;
    L12:
        if (p.g(this.addressLine2, r52.addressLine2) == true) goto L15;
        return false;
    L15:
        if (p.g(this.province, r52.province) == true) goto L18;
        return false;
    L18:
        if (p.g(this.city, r52.city) == true) goto L21;
        return false;
    L21:
        if (p.g(this.country, r52.country) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final String getAddressLine1() {
        return this.addressLine1;
    }

    public final String getAddressLine2() {
        return this.addressLine2;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getProvince() {
        return this.province;
    }

    public int hashCode() {
        int r02 = this.addressLine1.hashCode() * 31;
        int r03 = AbstractC2049c.a(this.addressLine2, r02, 31);
        int r04 = AbstractC2049c.a(this.province, r03, 31);
        int r05 = AbstractC2049c.a(this.city, r04, 31);
        return this.country.hashCode() + r05;
    }

    public final void setAddressLine1(String r2) {
        p.l(r2, "<set-?>");
        this.addressLine1 = r2;
    }

    public final void setAddressLine2(String r2) {
        p.l(r2, "<set-?>");
        this.addressLine2 = r2;
    }

    public final void setCity(String r2) {
        p.l(r2, "<set-?>");
        this.city = r2;
    }

    public final void setCountry(String r2) {
        p.l(r2, "<set-?>");
        this.country = r2;
    }

    public final void setProvince(String r2) {
        p.l(r2, "<set-?>");
        this.province = r2;
    }

    public String toString() {
        return "AddressViewModel(addressLine1=" + this.addressLine1 + ", addressLine2=" + this.addressLine2 + ", province=" + this.province + ", city=" + this.city + ", country=" + this.country + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "out");
        r1.writeString(this.addressLine1);
        r1.writeString(this.addressLine2);
        r1.writeString(this.province);
        r1.writeString(this.city);
        r1.writeString(this.country);
    }
}
