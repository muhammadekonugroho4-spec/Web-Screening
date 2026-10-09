package com.stockbit.model.params.withdraw;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001%BI\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003JW\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0006HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006&"}, d2 = {"Lcom/stockbit/model/params/withdraw/WithdrawMultipleRequest;", "", "transactions", "", "Lcom/stockbit/model/params/withdraw/WithdrawMultipleRequest$Transaction;", "uiRef", "", "tokenValidatePin", "currencyCode", "signature", "bankSwiftCode", "transferType", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTransactions", "()Ljava/util/List;", "getUiRef", "()Ljava/lang/String;", "getTokenValidatePin", "getCurrencyCode", "getSignature", "getBankSwiftCode", "getTransferType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Transaction", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WithdrawMultipleRequest {

    @SerializedName("bank_swift_code")
    private final String bankSwiftCode;

    @SerializedName("currency_code")
    private final String currencyCode;

    @SerializedName("signature")
    private final String signature;

    @SerializedName("token_validate_pin")
    private final String tokenValidatePin;

    @SerializedName("transactions")
    private final List<Transaction> transactions;

    @SerializedName("transfer_type")
    private final String transferType;

    @SerializedName("ui_ref")
    private final String uiRef;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/stockbit/model/params/withdraw/WithdrawMultipleRequest$Transaction;", "", "accountNo", "", "amount", "", "type", "<init>", "(Ljava/lang/String;DLjava/lang/String;)V", "getAccountNo", "()Ljava/lang/String;", "getAmount", "()D", "getType", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Transaction {

        @SerializedName("account_no")
        private final String accountNo;

        @SerializedName("amount")
        private final double amount;

        @SerializedName("type")
        private final String type;

        public Transaction(String r2, double r3, String r5) {
            p.l(r2, "accountNo");
            p.l(r5, "type");
            this.accountNo = r2;
            this.amount = r3;
            this.type = r5;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof Transaction) == true) goto L8;
            return false;
        L8:
            Transaction r82 = (Transaction) r8;
            if (p.g(this.accountNo, r82.accountNo) == true) goto L12;
            return false;
        L12:
            if (Double.compare(this.amount, r82.amount) == 0) goto L15;
            return false;
        L15:
            if (p.g(this.type, r82.type) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.accountNo.hashCode() * 31) + Double.hashCode(this.amount)) * 31) + this.type.hashCode();
        }

        public String toString() {
            return "Transaction(accountNo=" + this.accountNo + ", amount=" + this.amount + ", type=" + this.type + ')';
        }
    }

    public WithdrawMultipleRequest(List<Transaction> r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        p.l(r2, "transactions");
        p.l(r3, "uiRef");
        p.l(r4, "tokenValidatePin");
        p.l(r5, "currencyCode");
        p.l(r6, "signature");
        p.l(r7, "bankSwiftCode");
        this.transactions = r2;
        this.uiRef = r3;
        this.tokenValidatePin = r4;
        this.currencyCode = r5;
        this.signature = r6;
        this.bankSwiftCode = r7;
        this.transferType = r8;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WithdrawMultipleRequest) == true) goto L8;
        return false;
    L8:
        WithdrawMultipleRequest r52 = (WithdrawMultipleRequest) r5;
        if (p.g(this.transactions, r52.transactions) == true) goto L12;
        return false;
    L12:
        if (p.g(this.uiRef, r52.uiRef) == true) goto L15;
        return false;
    L15:
        if (p.g(this.tokenValidatePin, r52.tokenValidatePin) == true) goto L18;
        return false;
    L18:
        if (p.g(this.currencyCode, r52.currencyCode) == true) goto L21;
        return false;
    L21:
        if (p.g(this.signature, r52.signature) == true) goto L24;
        return false;
    L24:
        if (p.g(this.bankSwiftCode, r52.bankSwiftCode) == true) goto L27;
        return false;
    L27:
        if (p.g(this.transferType, r52.transferType) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        int r02 = ((((((((((this.transactions.hashCode() * 31) + this.uiRef.hashCode()) * 31) + this.tokenValidatePin.hashCode()) * 31) + this.currencyCode.hashCode()) * 31) + this.signature.hashCode()) * 31) + this.bankSwiftCode.hashCode()) * 31;
        String r1 = this.transferType;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "WithdrawMultipleRequest(transactions=" + this.transactions + ", uiRef=" + this.uiRef + ", tokenValidatePin=" + this.tokenValidatePin + ", currencyCode=" + this.currencyCode + ", signature=" + this.signature + ", bankSwiftCode=" + this.bankSwiftCode + ", transferType=" + this.transferType + ')';
    }

    public /* synthetic */ WithdrawMultipleRequest(List r10, String r11, String r12, String r13, String r14, String r15, String r16, int r17, i r18) {
        if ((r17 & 64) == 0) goto L6;
        String r8 = null;
    L7:
        this(r10, r11, r12, r13, r14, r15, r8);
        return;
    L6:
        r8 = r16;
        goto L7
    }
}
