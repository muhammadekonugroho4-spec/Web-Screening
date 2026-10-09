package com.stockbit.dto.liveness;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0007HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0004\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/stockbit/dto/liveness/LivenessSubmitDTO;", "", "threshold", "", "isPassed", "", "reason", "", "<init>", "(Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;)V", "getThreshold", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getReason", "()Ljava/lang/String;", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/stockbit/dto/liveness/LivenessSubmitDTO;", "equals", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LivenessSubmitDTO {

    @SerializedName("is_passed")
    private final Boolean isPassed;

    @SerializedName("reason")
    private final String reason;

    @SerializedName("threshold")
    private final Long threshold;

    public LivenessSubmitDTO(Long r1, Boolean r2, String r3) {
        this.threshold = r1;
        this.isPassed = r2;
        this.reason = r3;
    }

    public final String a() {
        return this.reason;
    }

    public final Long b() {
        return this.threshold;
    }

    public final Boolean c() {
        return this.isPassed;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof LivenessSubmitDTO) == true) goto L8;
        return false;
    L8:
        LivenessSubmitDTO r52 = (LivenessSubmitDTO) r5;
        if (p.g(this.threshold, r52.threshold) == true) goto L12;
        return false;
    L12:
        if (p.g(this.isPassed, r52.isPassed) == true) goto L15;
        return false;
    L15:
        if (p.g(this.reason, r52.reason) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        Long r02 = this.threshold;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Boolean r2 = this.isPassed;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.reason;
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
        return "LivenessSubmitDTO(threshold=" + this.threshold + ", isPassed=" + this.isPassed + ", reason=" + this.reason + ")";
    }
}
