package com.stockbit.dto.user;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/stockbit/dto/user/RequestOtpNewPhoneDTO;", "", "token", "", "target", "nextAttemptIn", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getToken", "()Ljava/lang/String;", "getTarget", "getNextAttemptIn", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/stockbit/dto/user/RequestOtpNewPhoneDTO;", "equals", "", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RequestOtpNewPhoneDTO {

    @SerializedName("next_attempt_in")
    private final Integer nextAttemptIn;

    @SerializedName("target")
    private final String target;

    @SerializedName("token")
    private final String token;

    public RequestOtpNewPhoneDTO() {
        String r1 = null;
        String r2 = null;
        Integer r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final Integer a() {
        return this.nextAttemptIn;
    }

    public final String b() {
        return this.target;
    }

    public final String c() {
        return this.token;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof RequestOtpNewPhoneDTO) == true) goto L8;
        return false;
    L8:
        RequestOtpNewPhoneDTO r52 = (RequestOtpNewPhoneDTO) r5;
        if (p.g(this.token, r52.token) == true) goto L12;
        return false;
    L12:
        if (p.g(this.target, r52.target) == true) goto L15;
        return false;
    L15:
        if (p.g(this.nextAttemptIn, r52.nextAttemptIn) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.token;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.target;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Integer r23 = this.nextAttemptIn;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "RequestOtpNewPhoneDTO(token=" + this.token + ", target=" + this.target + ", nextAttemptIn=" + this.nextAttemptIn + ")";
    }

    public RequestOtpNewPhoneDTO(String r1, String r2, Integer r3) {
        this.token = r1;
        this.target = r2;
        this.nextAttemptIn = r3;
    }

    public /* synthetic */ RequestOtpNewPhoneDTO(String r2, String r3, Integer r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4);
    }
}
