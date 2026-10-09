package com.midtrans.sdk.analytics;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes6.dex */
public class MixpanelProperties {

    @SerializedName("button name")
    private String buttonName;

    @SerializedName("card mode")
    private String cardPaymentMode;

    @SerializedName("device id")
    private String deviceId;

    @SerializedName("device type")
    private String deviceType;

    @SerializedName("distinct_id")
    private String distinctId;

    @SerializedName("enabled payments")
    private List<String> enabledPayments;

    @SerializedName("first")
    private Boolean firstPage;

    @SerializedName("flow")
    private String flow;

    @SerializedName("installment available")
    private Boolean installmentAvailable;

    @SerializedName("installment required")
    private Boolean installmentRequired;

    @SerializedName("merchant name")
    private String merchant;

    @SerializedName("merchant id")
    private String merchantId;

    @SerializedName("error message")
    private String message;
    private String network;

    @SerializedName(MixpanelAnalyticsManager.CARD_MODE_ONE_CLICK)
    private Boolean oneClick;

    @SerializedName("order id")
    private String orderId;

    @SerializedName("os version")
    private String osVersion;

    @SerializedName("page name")
    private String pageName;

    /* renamed from: platform, reason: collision with root package name */
    @SerializedName("platform")
    private String f42152platform;

    @SerializedName("response time")
    private long responseTime;

    @SerializedName("time stamp")
    private String timeStamp;
    private String token;

    @SerializedName("transaction id")
    private String transactionId;

    @SerializedName("two clicks")
    private Boolean twoClicks;

    @SerializedName("sdk version")
    private String version;

    public MixpanelProperties() {
    }

    public String getButtonName() {
        return this.buttonName;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public String getFlow() {
        return this.flow;
    }

    public String getMerchant() {
        return this.merchant;
    }

    public String getMessage() {
        return this.message;
    }

    public String getNetwork() {
        return this.network;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getPageName() {
        return this.pageName;
    }

    public String getPlatform() {
        return this.f42152platform;
    }

    public long getResponseTime() {
        return this.responseTime;
    }

    public String getToken() {
        return this.token;
    }

    public String getVersion() {
        return this.version;
    }

    public boolean isFirstPage() {
        return this.firstPage.booleanValue();
    }

    public void setButtonName(String r1) {
        this.buttonName = r1;
    }

    public void setCardPaymentMode(String r1) {
        this.cardPaymentMode = r1;
    }

    public void setDeviceId(String r1) {
        this.deviceId = r1;
    }

    public void setDeviceType(String r1) {
        this.deviceType = r1;
    }

    public void setDistinctId(String r1) {
        this.distinctId = r1;
    }

    public void setEnabledPayments(List<String> r1) {
        this.enabledPayments = r1;
    }

    public void setFirstPage(boolean r1) {
        this.firstPage = Boolean.valueOf(r1);
    }

    public void setFlow(String r1) {
        this.flow = r1;
    }

    public void setInstallmentAvailable(Boolean r1) {
        this.installmentAvailable = r1;
    }

    public void setInstallmentRequired(boolean r1) {
        this.installmentRequired = Boolean.valueOf(r1);
    }

    public void setMerchant(String r1) {
        this.merchant = r1;
    }

    public void setMerchantId(String r1) {
        this.merchantId = r1;
    }

    public void setMessage(String r1) {
        this.message = r1;
    }

    public void setNetwork(String r1) {
        this.network = r1;
    }

    public void setOneClick(Boolean r1) {
        this.oneClick = r1;
    }

    public void setOrderId(String r1) {
        this.orderId = r1;
    }

    public void setOsVersion(String r1) {
        this.osVersion = r1;
    }

    public void setPageName(String r1) {
        this.pageName = r1;
    }

    public void setPlatform(String r1) {
        this.f42152platform = r1;
    }

    public void setResponseTime(long r1) {
        this.responseTime = r1;
    }

    public void setTimeStamp(String r1) {
        this.timeStamp = r1;
    }

    public void setToken(String r1) {
        this.token = r1;
    }

    public void setTransactionId(String r1) {
        this.transactionId = r1;
    }

    public void setTwoClicks(Boolean r1) {
        this.twoClicks = r1;
    }

    public void setVersion(String r1) {
        this.version = r1;
    }
}
