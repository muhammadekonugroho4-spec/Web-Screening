package com.midtrans.sdk.uikit.models;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes6.dex */
public class CountryCodeModel implements Serializable {

    @SerializedName("country-code")
    private String countryCode;

    @SerializedName("alpha-3")
    private String countryCodeAlpha;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private String name;

    public CountryCodeModel() {
    }

    public String a() {
        return this.countryCodeAlpha;
    }

    public String b() {
        return this.name;
    }
}
