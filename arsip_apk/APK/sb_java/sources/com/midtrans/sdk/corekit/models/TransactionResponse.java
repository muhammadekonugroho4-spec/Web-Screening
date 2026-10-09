package com.midtrans.sdk.corekit.models;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.core.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class TransactionResponse implements Serializable {

    @SerializedName("va_numbers")
    private List<VaNumber> accountNumbers;

    @SerializedName("alfamart_expire_time")
    private String alfamartExpireTime;

    @SerializedName("approval_code")
    private String approvalCode;
    private String bank;

    @SerializedName("bca_expiration")
    private String bcaExpiration;

    @SerializedName("bca_klikbca_expire_time")
    private String bcaKlikBcaExpiration;

    @SerializedName("bca_va_number")
    private String bcaVaNumber;

    @SerializedName("bni_expiration")
    private String bniExpiration;

    @SerializedName("bni_va_number")
    private String bniVaNumber;

    @SerializedName("bri_expiration")
    private String briExpiration;

    @SerializedName("bri_va_number")
    private String briVaNumber;

    @SerializedName("biller_code")
    private String companyCode;
    private String currency;

    @SerializedName("deeplink_url")
    private String deeplinkUrl;
    private String eci;

    @SerializedName("finish_redirect_url")
    private String finishRedirectUrl;

    @SerializedName("fraud_status")
    private String fraudStatus;

    @SerializedName("gopay_expiration")
    private String gopayExpiration;

    @SerializedName("gopay_expiration_raw")
    private String gopayExpirationRaw;

    @SerializedName("gross_amount")
    private String grossAmount;

    @SerializedName("indomaret_expire_time")
    private String indomaretExpireTime;

    @SerializedName("installment_term")
    private String installmentTerm;

    @SerializedName("kioson_expire_time")
    private String kiosonExpireTime;

    @SerializedName("billpayment_expiration")
    private String mandiriBillExpiration;

    @SerializedName("masked_card")
    private String maskedCard;

    @SerializedName("order_id")
    private String orderId;

    @SerializedName("bill_key")
    private String paymentCode;

    @SerializedName("payment_code")
    private String paymentCodeResponse;

    @SerializedName(FirebaseAnalytics.Param.PAYMENT_TYPE)
    private String paymentType;

    @SerializedName("pdf_url")
    private String pdfUrl;

    @SerializedName("permata_expiration")
    private String permataExpiration;

    @SerializedName("permata_va_number")
    private String permataVANumber;

    @SerializedName("point_balance")
    private float pointBalance;

    @SerializedName("point_balance_amount")
    private String pointBalanceAmount;

    @SerializedName("point_redeem_amount")
    private float pointRedeemAmount;

    @SerializedName("qr_code_url")
    private String qrCodeUrl;

    @SerializedName("qris_url")
    private String qrisUrl;

    @SerializedName(Constants.WEBVIEW_REDIRECT_URL)
    private String redirectUrl;

    @SerializedName("saved_token_id")
    private String savedTokenId;

    @SerializedName("saved_token_id_expired_at")
    private String savedTokenIdExpiredAt;

    @SerializedName("secure_token")
    private boolean secureToken;

    @SerializedName("status_code")
    private String statusCode;

    @SerializedName("status_message")
    private String statusMessage;

    @SerializedName("three_ds_version")
    private String threeDsVersion;

    @SerializedName("transaction_id")
    private String transactionId;

    @SerializedName("transaction_status")
    private String transactionStatus;

    @SerializedName("transaction_time")
    private String transactionTime;

    @SerializedName("uob_ezpay_deeplink_url")
    private String uobDeeplinkUrl;

    @SerializedName("uob_ezpay_web_url")
    private String uobWebUrl;

    @SerializedName("validation_messages")
    private ArrayList<String> validationMessages;

    @SerializedName("xl_expiration")
    private String xlTunaiExpiration;

    @SerializedName("xl_tunai_merchant_id")
    private String xlTunaiMerchantId;

    @SerializedName("xl_tunai_order_id")
    private String xlTunaiOrderId;

    public TransactionResponse() {
    }

    public List<VaNumber> getAccountNumbers() {
        return this.accountNumbers;
    }

    public String getAlfamartExpireTime() {
        return this.alfamartExpireTime;
    }

    public String getApprovalCode() {
        return this.approvalCode;
    }

    public String getBank() {
        return this.bank;
    }

    public String getBcaExpiration() {
        return this.bcaExpiration;
    }

    public String getBcaKlikBcaExpiration() {
        return this.bcaKlikBcaExpiration;
    }

    public String getBcaVaNumber() {
        return this.bcaVaNumber;
    }

    public String getBniExpiration() {
        return this.bniExpiration;
    }

    public String getBniVaNumber() {
        return this.bniVaNumber;
    }

    public String getBriExpiration() {
        return this.briExpiration;
    }

    public String getBriVaNumber() {
        return this.briVaNumber;
    }

    public String getCompanyCode() {
        return this.companyCode;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getDeeplinkUrl() {
        return this.deeplinkUrl;
    }

    public String getEci() {
        return this.eci;
    }

    public String getFinishRedirectUrl() {
        return this.finishRedirectUrl;
    }

    public String getFraudStatus() {
        if (TextUtils.isEmpty(this.fraudStatus) == false) goto L7;
        return "";
    L7:
        return this.fraudStatus;
    }

    public String getGopayExpiration() {
        return this.gopayExpiration;
    }

    public String getGopayExpirationRaw() {
        return this.gopayExpirationRaw;
    }

    public String getGrossAmount() {
        return this.grossAmount;
    }

    public String getIndomaretExpireTime() {
        return this.indomaretExpireTime;
    }

    public String getInstallmentTerm() {
        return this.installmentTerm;
    }

    public String getKiosonExpireTime() {
        return this.kiosonExpireTime;
    }

    public String getMandiriBillExpiration() {
        return this.mandiriBillExpiration;
    }

    public String getMaskedCard() {
        return this.maskedCard;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getPaymentCode() {
        return this.paymentCode;
    }

    public String getPaymentCodeResponse() {
        return this.paymentCodeResponse;
    }

    public String getPaymentType() {
        if (TextUtils.isEmpty(this.paymentType) == false) goto L7;
        return "";
    L7:
        return this.paymentType;
    }

    public String getPdfUrl() {
        return this.pdfUrl;
    }

    public String getPermataExpiration() {
        return this.permataExpiration;
    }

    public String getPermataVANumber() {
        return this.permataVANumber;
    }

    public float getPointBalance() {
        return this.pointBalance;
    }

    public String getPointBalanceAmount() {
        return this.pointBalanceAmount;
    }

    public float getPointRedeemAmount() {
        return this.pointRedeemAmount;
    }

    public String getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    public String getQrisUrl() {
        return this.qrisUrl;
    }

    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public String getSavedTokenId() {
        if (TextUtils.isEmpty(this.savedTokenId) == false) goto L7;
        return "";
    L7:
        return this.savedTokenId;
    }

    public String getSavedTokenIdExpiredAt() {
        return this.savedTokenIdExpiredAt;
    }

    public String getStatusCode() {
        if (TextUtils.isEmpty(this.statusCode) == false) goto L7;
        return "";
    L7:
        return this.statusCode;
    }

    public String getStatusMessage() {
        if (TextUtils.isEmpty(this.statusMessage) == false) goto L7;
        return "";
    L7:
        return this.statusMessage;
    }

    public String getString() {
        return new Gson().toJson(this);
    L4:
        return "";
    }

    public String getThreeDsVersion() {
        return this.threeDsVersion;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public String getTransactionStatus() {
        if (TextUtils.isEmpty(this.transactionStatus) == false) goto L7;
        return "";
    L7:
        return this.transactionStatus;
    }

    public String getTransactionTime() {
        if (TextUtils.isEmpty(this.transactionTime) == false) goto L7;
        return "";
    L7:
        return this.transactionTime;
    }

    public String getUobDeeplinkUrl() {
        return this.uobDeeplinkUrl;
    }

    public String getUobWebUrl() {
        return this.uobWebUrl;
    }

    public ArrayList<String> getValidationMessages() {
        return this.validationMessages;
    }

    public String getXlTunaiExpiration() {
        return this.xlTunaiExpiration;
    }

    public String getXlTunaiMerchantId() {
        return this.xlTunaiMerchantId;
    }

    public String getXlTunaiOrderId() {
        return this.xlTunaiOrderId;
    }

    public boolean isSecureToken() {
        return this.secureToken;
    }

    public void setAccountNumbers(List<VaNumber> r1) {
        this.accountNumbers = r1;
    }

    public void setAlfamartExpireTime(String r1) {
        this.alfamartExpireTime = r1;
    }

    public void setApprovalCode(String r1) {
        this.approvalCode = r1;
    }

    public void setBank(String r1) {
        this.bank = r1;
    }

    public void setBcaExpiration(String r1) {
        this.bcaExpiration = r1;
    }

    public void setBcaKlikBcaExpiration(String r1) {
        this.bcaKlikBcaExpiration = r1;
    }

    public void setBcaVaNumber(String r1) {
        this.bcaVaNumber = r1;
    }

    public void setBniExpiration(String r1) {
        this.bniExpiration = r1;
    }

    public void setBniVaNumber(String r1) {
        this.bniVaNumber = r1;
    }

    public void setBriExpiration(String r1) {
        this.briExpiration = r1;
    }

    public void setBriVaNumber(String r1) {
        this.briVaNumber = r1;
    }

    public void setCompanyCode(String r1) {
        this.companyCode = r1;
    }

    public void setCurrency(String r1) {
        this.currency = r1;
    }

    public void setDeeplinkUrl(String r1) {
        this.deeplinkUrl = r1;
    }

    public void setEci(String r1) {
        this.eci = r1;
    }

    public void setFinishRedirectUrl(String r1) {
        this.finishRedirectUrl = r1;
    }

    public void setFraudStatus(String r1) {
        this.fraudStatus = r1;
    }

    public void setGopayExpiration(String r1) {
        this.gopayExpiration = r1;
    }

    public void setGopayExpirationRaw(String r1) {
        this.gopayExpirationRaw = r1;
    }

    public void setGrossAmount(String r1) {
        this.grossAmount = r1;
    }

    public void setIndomaretExpireTime(String r1) {
        this.indomaretExpireTime = r1;
    }

    public void setInstallmentTerm(String r1) {
        this.installmentTerm = r1;
    }

    public void setKiosonExpireTime(String r1) {
        this.kiosonExpireTime = r1;
    }

    public void setMandiriBillExpiration(String r1) {
        this.mandiriBillExpiration = r1;
    }

    public void setMaskedCard(String r1) {
        this.maskedCard = r1;
    }

    public void setOrderId(String r1) {
        this.orderId = r1;
    }

    public void setPaymentCode(String r1) {
        this.paymentCode = r1;
    }

    public void setPaymentCodeResponse(String r1) {
        this.paymentCodeResponse = r1;
    }

    public void setPaymentType(String r1) {
        this.paymentType = r1;
    }

    public void setPdfUrl(String r1) {
        this.pdfUrl = r1;
    }

    public void setPermataExpiration(String r1) {
        this.permataExpiration = r1;
    }

    public void setPermataVANumber(String r1) {
        this.permataVANumber = r1;
    }

    public void setPointBalance(float r1) {
        this.pointBalance = r1;
    }

    public void setPointBalanceAmount(String r1) {
        this.pointBalanceAmount = r1;
    }

    public void setPointRedeemAmount(float r1) {
        this.pointRedeemAmount = r1;
    }

    public void setQrCodeUrl(String r1) {
        this.qrCodeUrl = r1;
    }

    public void setQrisUrl(String r1) {
        this.qrisUrl = r1;
    }

    public void setRedirectUrl(String r1) {
        this.redirectUrl = r1;
    }

    public void setSavedTokenId(String r1) {
        this.savedTokenId = r1;
    }

    public void setSavedTokenIdExpiredAt(String r1) {
        this.savedTokenIdExpiredAt = r1;
    }

    public void setSecureToken(boolean r1) {
        this.secureToken = r1;
    }

    public void setStatusCode(String r1) {
        this.statusCode = r1;
    }

    public void setStatusMessage(String r1) {
        this.statusMessage = r1;
    }

    public void setThreeDsVersion(String r1) {
        this.threeDsVersion = r1;
    }

    public void setTransactionId(String r1) {
        this.transactionId = r1;
    }

    public void setTransactionStatus(String r1) {
        this.transactionStatus = r1;
    }

    public void setTransactionTime(String r1) {
        this.transactionTime = r1;
    }

    public void setUobDeeplinkUrl(String r1) {
        this.uobDeeplinkUrl = r1;
    }

    public void setUobWebUrl(String r1) {
        this.uobWebUrl = r1;
    }

    public void setValidationMessages(ArrayList<String> r1) {
        this.validationMessages = r1;
    }

    public void setXlTunaiExpiration(String r1) {
        this.xlTunaiExpiration = r1;
    }

    public void setXlTunaiMerchantId(String r1) {
        this.xlTunaiMerchantId = r1;
    }

    public void setXlTunaiOrderId(String r1) {
        this.xlTunaiOrderId = r1;
    }

    public TransactionResponse(String r1) {
        this.statusMessage = r1;
    }

    public TransactionResponse(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        this.statusCode = r1;
        this.statusMessage = r2;
        this.transactionId = r3;
        this.orderId = r4;
        this.grossAmount = r5;
        this.paymentType = r6;
        this.transactionTime = r7;
        this.transactionStatus = r8;
        this.installmentTerm = r9;
    }
}
