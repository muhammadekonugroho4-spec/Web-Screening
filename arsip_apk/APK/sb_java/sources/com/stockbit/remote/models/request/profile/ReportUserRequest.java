package com.stockbit.remote.models.request.profile;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/stockbit/remote/models/request/profile/ReportUserRequest;", "", "userId", "", "reportReason", "", "reportMessage", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "getReportReason", "()I", "getReportMessage", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ReportUserRequest {

    @SerializedName("reason")
    private final String reportMessage;

    @SerializedName("category")
    private final int reportReason;

    @SerializedName("user_id")
    private final String userId;

    public ReportUserRequest(String r2, int r3, String r4) {
        p.l(r2, "userId");
        p.l(r4, "reportMessage");
        this.userId = r2;
        this.reportReason = r3;
        this.reportMessage = r4;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ReportUserRequest) == true) goto L8;
        return false;
    L8:
        ReportUserRequest r52 = (ReportUserRequest) r5;
        if (p.g(this.userId, r52.userId) == true) goto L12;
        return false;
    L12:
        if (this.reportReason == r52.reportReason) goto L15;
        return false;
    L15:
        if (p.g(this.reportMessage, r52.reportMessage) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.userId.hashCode() * 31) + Integer.hashCode(this.reportReason)) * 31) + this.reportMessage.hashCode();
    }

    public String toString() {
        return "ReportUserRequest(userId=" + this.userId + ", reportReason=" + this.reportReason + ", reportMessage=" + this.reportMessage + ')';
    }
}
