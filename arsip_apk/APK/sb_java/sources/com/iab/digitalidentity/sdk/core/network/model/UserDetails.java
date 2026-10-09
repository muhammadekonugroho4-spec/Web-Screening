package com.iab.digitalidentity.sdk.core.network.model;

import a.AbstractC2049c;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/network/model/UserDetails;", "", "", "citizenship", "city", "province", "otherAddressDetails", "jobType", "jobTypeDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getCitizenship", "()Ljava/lang/String;", "getCity", "getProvince", "getOtherAddressDetails", "getJobType", "getJobTypeDescription", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserDetails {

    @SerializedName("citizenship")
    private final String citizenship;

    @SerializedName("city")
    private final String city;

    @SerializedName("job_type")
    private final String jobType;

    @SerializedName("job_type_description")
    private final String jobTypeDescription;

    @SerializedName("other_address_details")
    private final String otherAddressDetails;

    @SerializedName("province")
    private final String province;

    public UserDetails(String r2, String r3, String r4, String r5, String r6, String r7) {
        p.l(r2, "citizenship");
        p.l(r3, "city");
        p.l(r4, "province");
        p.l(r5, "otherAddressDetails");
        p.l(r6, "jobType");
        p.l(r7, "jobTypeDescription");
        this.citizenship = r2;
        this.city = r3;
        this.province = r4;
        this.otherAddressDetails = r5;
        this.jobType = r6;
        this.jobTypeDescription = r7;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UserDetails) == true) goto L8;
        return false;
    L8:
        UserDetails r52 = (UserDetails) r5;
        if (p.g(this.citizenship, r52.citizenship) == true) goto L12;
        return false;
    L12:
        if (p.g(this.city, r52.city) == true) goto L15;
        return false;
    L15:
        if (p.g(this.province, r52.province) == true) goto L18;
        return false;
    L18:
        if (p.g(this.otherAddressDetails, r52.otherAddressDetails) == true) goto L21;
        return false;
    L21:
        if (p.g(this.jobType, r52.jobType) == true) goto L24;
        return false;
    L24:
        if (p.g(this.jobTypeDescription, r52.jobTypeDescription) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final int hashCode() {
        int r02 = this.citizenship.hashCode() * 31;
        int r03 = AbstractC2049c.a(this.city, r02, 31);
        int r04 = AbstractC2049c.a(this.province, r03, 31);
        int r05 = AbstractC2049c.a(this.otherAddressDetails, r04, 31);
        int r06 = AbstractC2049c.a(this.jobType, r05, 31);
        return this.jobTypeDescription.hashCode() + r06;
    }

    public final String toString() {
        return "UserDetails(citizenship=" + this.citizenship + ", city=" + this.city + ", province=" + this.province + ", otherAddressDetails=" + this.otherAddressDetails + ", jobType=" + this.jobType + ", jobTypeDescription=" + this.jobTypeDescription + ")";
    }
}
