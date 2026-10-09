package com.iab.digitalidentity.sdk.core.network.model;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012¨\u0006\u001d"}, d2 = {"com/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$MaskedIdentityData", "", "", "documentNumber", AppMeasurementSdk.ConditionalUserProperty.NAME, "birthDate", "birthPlace", "address", "province", "city", "subdistrict", "village", "rt", "rw", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "getBirthDate", "getBirthPlace", "a", "e", "b", "h", "i", "f", "g", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnifiedKycResponse$MaskedIdentityData {

    @SerializedName("address")
    private final String address;

    @SerializedName("birthDate")
    private final String birthDate;

    @SerializedName("birthPlace")
    private final String birthPlace;

    @SerializedName("city")
    private final String city;

    @SerializedName("documentNumber")
    private final String documentNumber;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @SerializedName("province")
    private final String province;

    @SerializedName("rt")
    private final String rt;

    @SerializedName("rw")
    private final String rw;

    @SerializedName("subdistrict")
    private final String subdistrict;

    @SerializedName("village")
    private final String village;

    public UnifiedKycResponse$MaskedIdentityData(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11) {
        this.documentNumber = r1;
        this.name = r2;
        this.birthDate = r3;
        this.birthPlace = r4;
        this.address = r5;
        this.province = r6;
        this.city = r7;
        this.subdistrict = r8;
        this.village = r9;
        this.rt = r10;
        this.rw = r11;
    }

    public final String a() {
        return this.address;
    }

    public final String b() {
        return this.city;
    }

    public final String c() {
        return this.documentNumber;
    }

    public final String d() {
        return this.name;
    }

    public final String e() {
        return this.province;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UnifiedKycResponse$MaskedIdentityData) == true) goto L8;
        return false;
    L8:
        UnifiedKycResponse$MaskedIdentityData r52 = (UnifiedKycResponse$MaskedIdentityData) r5;
        if (p.g(this.documentNumber, r52.documentNumber) == true) goto L12;
        return false;
    L12:
        if (p.g(this.name, r52.name) == true) goto L15;
        return false;
    L15:
        if (p.g(this.birthDate, r52.birthDate) == true) goto L18;
        return false;
    L18:
        if (p.g(this.birthPlace, r52.birthPlace) == true) goto L21;
        return false;
    L21:
        if (p.g(this.address, r52.address) == true) goto L24;
        return false;
    L24:
        if (p.g(this.province, r52.province) == true) goto L27;
        return false;
    L27:
        if (p.g(this.city, r52.city) == true) goto L30;
        return false;
    L30:
        if (p.g(this.subdistrict, r52.subdistrict) == true) goto L33;
        return false;
    L33:
        if (p.g(this.village, r52.village) == true) goto L36;
        return false;
    L36:
        if (p.g(this.rt, r52.rt) == true) goto L39;
        return false;
    L39:
        if (p.g(this.rw, r52.rw) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.rt;
    }

    public final String g() {
        return this.rw;
    }

    public final String h() {
        return this.subdistrict;
    }

    public final int hashCode() {
        String r02 = this.documentNumber;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.name;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.birthDate;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.birthPlace;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.address;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.province;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.city;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.subdistrict;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.village;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.rt;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.rw;
        if (r219 == null) goto L47;
        r1 = r219.hashCode();
    L47:
        return r013 + r1;
    L41:
        r218 = r217.hashCode();
        goto L42
    L37:
        r216 = r215.hashCode();
        goto L38
    L33:
        r214 = r213.hashCode();
        goto L34
    L29:
        r212 = r211.hashCode();
        goto L30
    L25:
        r210 = r29.hashCode();
        goto L26
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public final String i() {
        return this.village;
    }

    public final String toString() {
        return "MaskedIdentityData(documentNumber=" + this.documentNumber + ", name=" + this.name + ", birthDate=" + this.birthDate + ", birthPlace=" + this.birthPlace + ", address=" + this.address + ", province=" + this.province + ", city=" + this.city + ", subdistrict=" + this.subdistrict + ", village=" + this.village + ", rt=" + this.rt + ", rw=" + this.rw + ")";
    }
}
