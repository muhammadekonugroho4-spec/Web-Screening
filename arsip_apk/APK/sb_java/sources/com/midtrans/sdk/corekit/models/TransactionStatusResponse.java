package com.midtrans.sdk.corekit.models;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class TransactionStatusResponse {

    @SerializedName("approval_code")
    private String approvaCode;
    private String bank;

    @SerializedName("fraud_status")
    private String fraudStatus;

    @SerializedName("gross_amount")
    private String grossAmount;

    @SerializedName("masked_card")
    private String maskedCard;

    @SerializedName("order_id")
    private String orderId;

    @SerializedName(FirebaseAnalytics.Param.PAYMENT_TYPE)
    private String paymentType;

    @SerializedName("signature_key")
    private String signatureKey;

    @SerializedName("status_code")
    private String statusCode;

    @SerializedName("status_message")
    private String statusMessage;

    @SerializedName("transaction_id")
    private String transactionId;

    @SerializedName("transaction_status")
    private String transactionStatus;

    @SerializedName("transaction_time")
    private String transactionTime;

    public TransactionStatusResponse() {
    }

    public String getApprovaCode() {
        return this.approvaCode;
    }

    public String getBank() {
        return this.bank;
    }

    public String getFraudStatus() {
        return this.fraudStatus;
    }

    public String getGrossAmount() {
        return this.grossAmount;
    }

    public String getMaskedCard() {
        return this.maskedCard;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getPaymentType() {
        return this.paymentType;
    }

    public String getSignatureKey() {
        return this.signatureKey;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public String getTransactionStatus() {
        return this.transactionStatus;
    }

    public String getTransactionTime() {
        return this.transactionTime;
    }

    public void setApprovaCode(String r1) {
        this.approvaCode = r1;
    }

    public void setBank(String r1) {
        this.bank = r1;
    }

    public void setFraudStatus(String r1) {
        this.fraudStatus = r1;
    }

    public void setGrossAmount(String r1) {
        this.grossAmount = r1;
    }

    public void setMaskedCard(String r1) {
        this.maskedCard = r1;
    }

    public void setOrderId(String r1) {
        this.orderId = r1;
    }

    public void setPaymentType(String r1) {
        this.paymentType = r1;
    }

    public void setSignatureKey(String r1) {
        this.signatureKey = r1;
    }

    public void setStatusCode(String r1) {
        this.statusCode = r1;
    }

    public void setStatusMessage(String r1) {
        this.statusMessage = r1;
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
}
