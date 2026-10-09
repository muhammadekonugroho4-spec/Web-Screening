package com.stockbit.remote.models.request.registration;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/stockbit/remote/models/request/registration/RegistrationVerifyOTPRequest;", "", Constants.KEY_KEY, "", "otp", "playerId", "pushNotifId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getOtp", "getPlayerId", "getPushNotifId", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RegistrationVerifyOTPRequest {

    @SerializedName(Constants.KEY_KEY)
    private final String key;

    @SerializedName("otp")
    private final String otp;

    @SerializedName("player_id")
    private final String playerId;

    @SerializedName("pushnotif_id")
    private final String pushNotifId;

    public RegistrationVerifyOTPRequest(String r2, String r3, String r4, String r5) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "otp");
        this.key = r2;
        this.otp = r3;
        this.playerId = r4;
        this.pushNotifId = r5;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof RegistrationVerifyOTPRequest) == true) goto L8;
        return false;
    L8:
        RegistrationVerifyOTPRequest r52 = (RegistrationVerifyOTPRequest) r5;
        if (p.g(this.key, r52.key) == true) goto L12;
        return false;
    L12:
        if (p.g(this.otp, r52.otp) == true) goto L15;
        return false;
    L15:
        if (p.g(this.playerId, r52.playerId) == true) goto L18;
        return false;
    L18:
        if (p.g(this.pushNotifId, r52.pushNotifId) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.key.hashCode() * 31) + this.otp.hashCode()) * 31;
        String r1 = this.playerId;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.pushNotifId;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "RegistrationVerifyOTPRequest(key=" + this.key + ", otp=" + this.otp + ", playerId=" + this.playerId + ", pushNotifId=" + this.pushNotifId + ')';
    }
}
