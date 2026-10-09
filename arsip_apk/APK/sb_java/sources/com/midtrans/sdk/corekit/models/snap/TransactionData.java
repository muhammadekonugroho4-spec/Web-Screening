package com.midtrans.sdk.corekit.models.snap;

import java.util.List;

@Deprecated
/* loaded from: classes6.dex */
public class TransactionData {
    private BankTransfer bankTransfer;
    private CustomerDetails customerDetails;
    private List<String> enabledPayments;

    /* renamed from: id, reason: collision with root package name */
    private String f42211id;
    private List<ItemDetails> itemDetails;
    private String kind;
    private PaymentOptions paymentOptions;
    private TransactionDetails transactionDetails;
    private String transactionId;

    public TransactionData() {
    }

    public BankTransfer getBankTransfer() {
        return this.bankTransfer;
    }

    public CustomerDetails getCustomerDetails() {
        return this.customerDetails;
    }

    public List<String> getEnabledPayments() {
        return this.enabledPayments;
    }

    public String getId() {
        return this.f42211id;
    }

    public List<ItemDetails> getItemDetails() {
        return this.itemDetails;
    }

    public String getKind() {
        return this.kind;
    }

    public PaymentOptions getPaymentOptions() {
        return this.paymentOptions;
    }

    public TransactionDetails getTransactionDetails() {
        return this.transactionDetails;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setBankTransfer(BankTransfer r1) {
        this.bankTransfer = r1;
    }

    public void setCustomerDetails(CustomerDetails r1) {
        this.customerDetails = r1;
    }

    public void setEnabledPayments(List<String> r1) {
        this.enabledPayments = r1;
    }

    public void setId(String r1) {
        this.f42211id = r1;
    }

    public void setItemDetails(List<ItemDetails> r1) {
        this.itemDetails = r1;
    }

    public void setKind(String r1) {
        this.kind = r1;
    }

    public void setPaymentOptions(PaymentOptions r1) {
        this.paymentOptions = r1;
    }

    public void setTransactionDetails(TransactionDetails r1) {
        this.transactionDetails = r1;
    }

    public void setTransactionId(String r1) {
        this.transactionId = r1;
    }
}
