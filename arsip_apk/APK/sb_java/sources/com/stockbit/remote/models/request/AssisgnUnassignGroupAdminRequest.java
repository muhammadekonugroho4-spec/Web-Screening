package com.stockbit.remote.models.request;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/stockbit/remote/models/request/AssisgnUnassignGroupAdminRequest;", "", "userId", "", NotificationCompat.CATEGORY_STATUS, "", "<init>", "(JZ)V", "getUserId", "()J", "getStatus", "()Z", "component1", "component2", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AssisgnUnassignGroupAdminRequest {

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final boolean status;

    @SerializedName("user_id")
    private final long userId;

    public AssisgnUnassignGroupAdminRequest(long r1, boolean r3) {
        this.userId = r1;
        this.status = r3;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof AssisgnUnassignGroupAdminRequest) == true) goto L8;
        return false;
    L8:
        AssisgnUnassignGroupAdminRequest r82 = (AssisgnUnassignGroupAdminRequest) r8;
        if (this.userId == r82.userId) goto L12;
        return false;
    L12:
        if (this.status == r82.status) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Long.hashCode(this.userId) * 31) + Boolean.hashCode(this.status);
    }

    public String toString() {
        return "AssisgnUnassignGroupAdminRequest(userId=" + this.userId + ", status=" + this.status + ')';
    }
}
