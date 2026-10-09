package com.stockbit.dto.openingaccount;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/stockbit/dto/openingaccount/OANoteDTO;", "", NotificationCompat.CATEGORY_PROGRESS, "", "bankName", "bankAccountName", "bankAccountNumber", "errors", "", "Lcom/stockbit/dto/openingaccount/OANoteErrorDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getProgress", "()Ljava/lang/String;", "getBankName", "getBankAccountName", "getBankAccountNumber", "getErrors", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OANoteDTO {

    @SerializedName("bank_account_name")
    private final String bankAccountName;

    @SerializedName("bank_account_number")
    private final String bankAccountNumber;

    @SerializedName("bank_name")
    private final String bankName;

    @SerializedName("errors")
    private final List<OANoteErrorDTO> errors;

    @SerializedName(NotificationCompat.CATEGORY_PROGRESS)
    private final String progress;

    public OANoteDTO(String r2, String r3, String r4, String r5, List<OANoteErrorDTO> r6) {
        p.l(r2, NotificationCompat.CATEGORY_PROGRESS);
        p.l(r3, "bankName");
        p.l(r4, "bankAccountName");
        p.l(r5, "bankAccountNumber");
        p.l(r6, "errors");
        this.progress = r2;
        this.bankName = r3;
        this.bankAccountName = r4;
        this.bankAccountNumber = r5;
        this.errors = r6;
    }

    public final String a() {
        return this.bankAccountName;
    }

    public final String b() {
        return this.bankAccountNumber;
    }

    public final String c() {
        return this.bankName;
    }

    public final List d() {
        return this.errors;
    }

    public final String e() {
        return this.progress;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OANoteDTO) == true) goto L8;
        return false;
    L8:
        OANoteDTO r52 = (OANoteDTO) r5;
        if (p.g(this.progress, r52.progress) == true) goto L12;
        return false;
    L12:
        if (p.g(this.bankName, r52.bankName) == true) goto L15;
        return false;
    L15:
        if (p.g(this.bankAccountName, r52.bankAccountName) == true) goto L18;
        return false;
    L18:
        if (p.g(this.bankAccountNumber, r52.bankAccountNumber) == true) goto L21;
        return false;
    L21:
        if (p.g(this.errors, r52.errors) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.progress.hashCode() * 31) + this.bankName.hashCode()) * 31) + this.bankAccountName.hashCode()) * 31) + this.bankAccountNumber.hashCode()) * 31) + this.errors.hashCode();
    }

    public String toString() {
        return "OANoteDTO(progress=" + this.progress + ", bankName=" + this.bankName + ", bankAccountName=" + this.bankAccountName + ", bankAccountNumber=" + this.bankAccountNumber + ", errors=" + this.errors + ")";
    }
}
