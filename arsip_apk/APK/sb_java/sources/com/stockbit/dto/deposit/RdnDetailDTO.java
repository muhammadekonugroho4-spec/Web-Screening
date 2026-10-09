package com.stockbit.dto.deposit;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/stockbit/dto/deposit/RdnDetailDTO;", "", "bankCode", "", "bankName", "bankLogo", "accountName", "accountNo", "foreignAccount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getBankCode", "()Ljava/lang/String;", "getBankName", "getBankLogo", "getAccountName", "getAccountNo", "getForeignAccount", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RdnDetailDTO {

    @SerializedName("account_name")
    private final String accountName;

    @SerializedName("account_no")
    private final String accountNo;

    @SerializedName("bank_code")
    private final String bankCode;

    @SerializedName("bank_logo")
    private final String bankLogo;

    @SerializedName("bank_name")
    private final String bankName;

    @SerializedName("foreign_account")
    private final boolean foreignAccount;

    public RdnDetailDTO() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        boolean r6 = false;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public final String a() {
        return this.accountName;
    }

    public final String b() {
        return this.accountNo;
    }

    public final String c() {
        return this.bankCode;
    }

    public final String d() {
        return this.bankLogo;
    }

    public final String e() {
        return this.bankName;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof RdnDetailDTO) == true) goto L8;
        return false;
    L8:
        RdnDetailDTO r52 = (RdnDetailDTO) r5;
        if (p.g(this.bankCode, r52.bankCode) == true) goto L12;
        return false;
    L12:
        if (p.g(this.bankName, r52.bankName) == true) goto L15;
        return false;
    L15:
        if (p.g(this.bankLogo, r52.bankLogo) == true) goto L18;
        return false;
    L18:
        if (p.g(this.accountName, r52.accountName) == true) goto L21;
        return false;
    L21:
        if (p.g(this.accountNo, r52.accountNo) == true) goto L24;
        return false;
    L24:
        if (this.foreignAccount == r52.foreignAccount) goto L26;
        return false;
    L26:
        return true;
    }

    public final boolean f() {
        return this.foreignAccount;
    }

    public int hashCode() {
        return (((((((((this.bankCode.hashCode() * 31) + this.bankName.hashCode()) * 31) + this.bankLogo.hashCode()) * 31) + this.accountName.hashCode()) * 31) + this.accountNo.hashCode()) * 31) + Boolean.hashCode(this.foreignAccount);
    }

    public String toString() {
        return "RdnDetailDTO(bankCode=" + this.bankCode + ", bankName=" + this.bankName + ", bankLogo=" + this.bankLogo + ", accountName=" + this.accountName + ", accountNo=" + this.accountNo + ", foreignAccount=" + this.foreignAccount + ")";
    }

    public RdnDetailDTO(String r2, String r3, String r4, String r5, String r6, boolean r7) {
        p.l(r2, "bankCode");
        p.l(r3, "bankName");
        p.l(r4, "bankLogo");
        p.l(r5, "accountName");
        p.l(r6, "accountNo");
        this.bankCode = r2;
        this.bankName = r3;
        this.bankLogo = r4;
        this.accountName = r5;
        this.accountNo = r6;
        this.foreignAccount = r7;
    }

    public /* synthetic */ RdnDetailDTO(String r2, String r3, String r4, String r5, String r6, boolean r7, int r8, i r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r8 & 32) == 0) goto L20;
        r7 = false;
    L20:
        boolean r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82);
    }
}
