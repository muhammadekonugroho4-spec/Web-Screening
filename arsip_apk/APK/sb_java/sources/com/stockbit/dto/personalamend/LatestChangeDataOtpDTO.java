package com.stockbit.dto.personalamend;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/stockbit/dto/personalamend/LatestChangeDataOtpDTO;", "", "token", "", "target", "duration", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getToken", "()Ljava/lang/String;", "getTarget", "getDuration", "()J", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LatestChangeDataOtpDTO {

    @SerializedName("duration")
    private final long duration;

    @SerializedName("target")
    private final String target;

    @SerializedName("token")
    private final String token;

    public LatestChangeDataOtpDTO(String r2, String r3, long r4) {
        p.l(r2, "token");
        p.l(r3, "target");
        this.token = r2;
        this.target = r3;
        this.duration = r4;
    }

    public final long a() {
        return this.duration;
    }

    public final String b() {
        return this.target;
    }

    public final String c() {
        return this.token;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof LatestChangeDataOtpDTO) == true) goto L8;
        return false;
    L8:
        LatestChangeDataOtpDTO r82 = (LatestChangeDataOtpDTO) r8;
        if (p.g(this.token, r82.token) == true) goto L12;
        return false;
    L12:
        if (p.g(this.target, r82.target) == true) goto L15;
        return false;
    L15:
        if (this.duration == r82.duration) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.token.hashCode() * 31) + this.target.hashCode()) * 31) + Long.hashCode(this.duration);
    }

    public String toString() {
        return "LatestChangeDataOtpDTO(token=" + this.token + ", target=" + this.target + ", duration=" + this.duration + ")";
    }
}
