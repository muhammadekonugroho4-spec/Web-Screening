package com.stockbit.model.params.user;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.models.ExpiryModel;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0014\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0006HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0015¨\u0006\""}, d2 = {"Lcom/stockbit/model/params/user/UserSuspendParams;", "", "type", "", "userId", "reason", "", ExpiryModel.UNIT_DAY, "streamId", "isSendEmail", "", "isBlockIp", "<init>", "(IILjava/lang/String;IIZZ)V", "getType", "()I", "getUserId", "getReason", "()Ljava/lang/String;", "getDays", "getStreamId", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "equals", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UserSuspendParams {

    @SerializedName(ExpiryModel.UNIT_DAY)
    private final int days;

    @SerializedName("block_ip")
    private final boolean isBlockIp;

    @SerializedName("send_email")
    private final boolean isSendEmail;

    @SerializedName("reason")
    private final String reason;

    @SerializedName("stream_id")
    private final int streamId;

    @SerializedName("type")
    private final int type;

    @SerializedName("user_id")
    private final int userId;

    public UserSuspendParams(int r2, int r3, String r4, int r5, int r6, boolean r7, boolean r8) {
        p.l(r4, "reason");
        this.type = r2;
        this.userId = r3;
        this.reason = r4;
        this.days = r5;
        this.streamId = r6;
        this.isSendEmail = r7;
        this.isBlockIp = r8;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UserSuspendParams) == true) goto L8;
        return false;
    L8:
        UserSuspendParams r52 = (UserSuspendParams) r5;
        if (this.type == r52.type) goto L12;
        return false;
    L12:
        if (this.userId == r52.userId) goto L15;
        return false;
    L15:
        if (p.g(this.reason, r52.reason) == true) goto L18;
        return false;
    L18:
        if (this.days == r52.days) goto L21;
        return false;
    L21:
        if (this.streamId == r52.streamId) goto L24;
        return false;
    L24:
        if (this.isSendEmail == r52.isSendEmail) goto L27;
        return false;
    L27:
        if (this.isBlockIp == r52.isBlockIp) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.type) * 31) + Integer.hashCode(this.userId)) * 31) + this.reason.hashCode()) * 31) + Integer.hashCode(this.days)) * 31) + Integer.hashCode(this.streamId)) * 31) + Boolean.hashCode(this.isSendEmail)) * 31) + Boolean.hashCode(this.isBlockIp);
    }

    public String toString() {
        return "UserSuspendParams(type=" + this.type + ", userId=" + this.userId + ", reason=" + this.reason + ", days=" + this.days + ", streamId=" + this.streamId + ", isSendEmail=" + this.isSendEmail + ", isBlockIp=" + this.isBlockIp + ')';
    }
}
