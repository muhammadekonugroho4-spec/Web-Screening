package com.stockbit.model.entity.securities;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0005HÖ\u0081\u0004R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/stockbit/model/entity/securities/VirtualOrderlistGtcResponseData;", "", "enable", "", "expired", "", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getEnable", "()Ljava/lang/Boolean;", "setEnable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getExpired", "()Ljava/lang/String;", "setExpired", "(Ljava/lang/String;)V", "getStatus", "setStatus", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/model/entity/securities/VirtualOrderlistGtcResponseData;", "equals", "other", "hashCode", "", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class VirtualOrderlistGtcResponseData {

    @SerializedName("enable")
    private Boolean enable;

    @SerializedName("expired")
    private String expired;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private String status;

    public VirtualOrderlistGtcResponseData(Boolean r1, String r2, String r3) {
        this.enable = r1;
        this.expired = r2;
        this.status = r3;
    }

    public final Boolean a() {
        return this.enable;
    }

    public final String b() {
        return this.expired;
    }

    public final String c() {
        return this.status;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof VirtualOrderlistGtcResponseData) == true) goto L8;
        return false;
    L8:
        VirtualOrderlistGtcResponseData r52 = (VirtualOrderlistGtcResponseData) r5;
        if (p.g(this.enable, r52.enable) == true) goto L12;
        return false;
    L12:
        if (p.g(this.expired, r52.expired) == true) goto L15;
        return false;
    L15:
        if (p.g(this.status, r52.status) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.enable;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.expired;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.status;
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
        return "VirtualOrderlistGtcResponseData(enable=" + this.enable + ", expired=" + this.expired + ", status=" + this.status + ')';
    }
}
