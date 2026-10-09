package com.stockbit.dto.openingaccount;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/stockbit/dto/openingaccount/OAProgressDTO;", "", Constants.KEY_ENCRYPTION_INAPP_CS, "", "ksei", "bank", "oaVerificationSteps", "", "Lcom/stockbit/dto/openingaccount/OAVerificationStepDTO;", "<init>", "(IIILjava/util/List;)V", "getCs", "()I", "getKsei", "getBank", "getOaVerificationSteps", "()Ljava/util/List;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OAProgressDTO {

    @SerializedName("bank")
    private final int bank;

    @SerializedName(Constants.KEY_ENCRYPTION_INAPP_CS)
    private final int cs;

    @SerializedName("ksei")
    private final int ksei;

    @SerializedName("kyc")
    private final List<OAVerificationStepDTO> oaVerificationSteps;

    public OAProgressDTO(int r2, int r3, int r4, List<OAVerificationStepDTO> r5) {
        p.l(r5, "oaVerificationSteps");
        this.cs = r2;
        this.ksei = r3;
        this.bank = r4;
        this.oaVerificationSteps = r5;
    }

    public final int a() {
        return this.bank;
    }

    public final int b() {
        return this.cs;
    }

    public final int c() {
        return this.ksei;
    }

    public final List d() {
        return this.oaVerificationSteps;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OAProgressDTO) == true) goto L8;
        return false;
    L8:
        OAProgressDTO r52 = (OAProgressDTO) r5;
        if (this.cs == r52.cs) goto L12;
        return false;
    L12:
        if (this.ksei == r52.ksei) goto L15;
        return false;
    L15:
        if (this.bank == r52.bank) goto L18;
        return false;
    L18:
        if (p.g(this.oaVerificationSteps, r52.oaVerificationSteps) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.cs) * 31) + Integer.hashCode(this.ksei)) * 31) + Integer.hashCode(this.bank)) * 31) + this.oaVerificationSteps.hashCode();
    }

    public String toString() {
        return "OAProgressDTO(cs=" + this.cs + ", ksei=" + this.ksei + ", bank=" + this.bank + ", oaVerificationSteps=" + this.oaVerificationSteps + ")";
    }
}
