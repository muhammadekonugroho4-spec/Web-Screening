package com.stockbit.remote.models.request;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stockbit/remote/models/request/VerifyChangeDataIdentityRequest;", "", "token", "", "identity", "dateOfBirth", "bankAccountNumber", "motherName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getIdentity", "getDateOfBirth", "getBankAccountNumber", "getMotherName", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class VerifyChangeDataIdentityRequest {

    @SerializedName("bank_account_number")
    private final String bankAccountNumber;

    @SerializedName("date_of_birth")
    private final String dateOfBirth;

    @SerializedName("identity")
    private final String identity;

    @SerializedName("mother_name")
    private final String motherName;

    @SerializedName("token")
    private final String token;

    public VerifyChangeDataIdentityRequest(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, "token");
        p.l(r3, "identity");
        p.l(r4, "dateOfBirth");
        p.l(r5, "bankAccountNumber");
        p.l(r6, "motherName");
        this.token = r2;
        this.identity = r3;
        this.dateOfBirth = r4;
        this.bankAccountNumber = r5;
        this.motherName = r6;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof VerifyChangeDataIdentityRequest) == true) goto L8;
        return false;
    L8:
        VerifyChangeDataIdentityRequest r52 = (VerifyChangeDataIdentityRequest) r5;
        if (p.g(this.token, r52.token) == true) goto L12;
        return false;
    L12:
        if (p.g(this.identity, r52.identity) == true) goto L15;
        return false;
    L15:
        if (p.g(this.dateOfBirth, r52.dateOfBirth) == true) goto L18;
        return false;
    L18:
        if (p.g(this.bankAccountNumber, r52.bankAccountNumber) == true) goto L21;
        return false;
    L21:
        if (p.g(this.motherName, r52.motherName) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.token.hashCode() * 31) + this.identity.hashCode()) * 31) + this.dateOfBirth.hashCode()) * 31) + this.bankAccountNumber.hashCode()) * 31) + this.motherName.hashCode();
    }

    public String toString() {
        return "VerifyChangeDataIdentityRequest(token=" + this.token + ", identity=" + this.identity + ", dateOfBirth=" + this.dateOfBirth + ", bankAccountNumber=" + this.bankAccountNumber + ", motherName=" + this.motherName + ')';
    }
}
