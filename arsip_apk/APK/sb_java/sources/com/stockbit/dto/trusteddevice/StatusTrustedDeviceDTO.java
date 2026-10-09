package com.stockbit.dto.trusteddevice;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.snap.TransactionResult;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J2\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/stockbit/dto/trusteddevice/StatusTrustedDeviceDTO;", "", NotificationCompat.CATEGORY_STATUS, "", TransactionResult.STATUS_PENDING, "", Constants.KEY_HIDE_CLOSE, "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getStatus", "()Ljava/lang/String;", "getPending", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getClose", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/stockbit/dto/trusteddevice/StatusTrustedDeviceDTO;", "equals", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StatusTrustedDeviceDTO {

    @SerializedName(Constants.KEY_HIDE_CLOSE)
    private final Boolean close;

    @SerializedName(TransactionResult.STATUS_PENDING)
    private final Integer pending;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    public StatusTrustedDeviceDTO() {
        String r1 = null;
        Integer r2 = null;
        Boolean r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final Boolean a() {
        return this.close;
    }

    public final Integer b() {
        return this.pending;
    }

    public final String c() {
        return this.status;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StatusTrustedDeviceDTO) == true) goto L8;
        return false;
    L8:
        StatusTrustedDeviceDTO r52 = (StatusTrustedDeviceDTO) r5;
        if (p.g(this.status, r52.status) == true) goto L12;
        return false;
    L12:
        if (p.g(this.pending, r52.pending) == true) goto L15;
        return false;
    L15:
        if (p.g(this.close, r52.close) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.status;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.pending;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Boolean r23 = this.close;
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
        return "StatusTrustedDeviceDTO(status=" + this.status + ", pending=" + this.pending + ", close=" + this.close + ")";
    }

    public StatusTrustedDeviceDTO(String r1, Integer r2, Boolean r3) {
        this.status = r1;
        this.pending = r2;
        this.close = r3;
    }

    public /* synthetic */ StatusTrustedDeviceDTO(String r2, Integer r3, Boolean r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = Boolean.TRUE;
    L11:
        this(r2, r3, r4);
    }
}
