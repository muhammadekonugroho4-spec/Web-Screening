package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class MerchantPreferences {

    @SerializedName("color_scheme")
    private String colorScheme;

    @SerializedName("color_scheme_url")
    private String colorSchemeUrl;

    @SerializedName("display_name")
    private String displayName;

    @SerializedName("error_url")
    private String errorUrl;

    @SerializedName("finish_url")
    private String finishUrl;
    private String locale;

    @SerializedName("logo_url")
    private String logoUrl;

    @SerializedName("other_va_processor")
    private String otherVaProcessor;

    @SerializedName("pending_url")
    private String pendingUrl;

    public MerchantPreferences() {
    }

    public String getColorScheme() {
        return this.colorScheme;
    }

    public String getColorSchemeUrl() {
        return this.colorSchemeUrl;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getErrorUrl() {
        return this.errorUrl;
    }

    public String getFinishUrl() {
        return this.finishUrl;
    }

    public String getLocale() {
        return this.locale;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }

    public String getOtherVaProcessor() {
        return this.otherVaProcessor;
    }

    public String getPendingUrl() {
        return this.pendingUrl;
    }

    public void setColorScheme(String r1) {
        this.colorScheme = r1;
    }

    public void setColorSchemeUrl(String r1) {
        this.colorSchemeUrl = r1;
    }

    public void setDisplayName(String r1) {
        this.displayName = r1;
    }

    public void setErrorUrl(String r1) {
        this.errorUrl = r1;
    }

    public void setFinishUrl(String r1) {
        this.finishUrl = r1;
    }

    public void setLocale(String r1) {
        this.locale = r1;
    }

    public void setLogoUrl(String r1) {
        this.logoUrl = r1;
    }

    public void setOtherVaProcessor(String r1) {
        this.otherVaProcessor = r1;
    }

    public void setPendingUrl(String r1) {
        this.pendingUrl = r1;
    }
}
