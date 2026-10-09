package com.stockbit.remote.models.response.referral;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import com.stockbit.remote.models.base.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0004HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR \u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000f¨\u0006 "}, d2 = {"Lcom/stockbit/remote/models/response/referral/UpdateReferralCodeResponse;", "Lcom/stockbit/remote/models/base/BaseResponseLegacy;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "", "message", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "code", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/util/List;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getError", "setError", "getCode", "setCode", "component1", "component2", "component3", "component4", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UpdateReferralCodeResponse implements b {

    @SerializedName("code")
    private String code;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final List<String> data;

    @SerializedName(Constants.IPC_BUNDLE_KEY_SEND_ERROR)
    private String error;

    @SerializedName("message")
    private String message;

    public UpdateReferralCodeResponse(List<String> r1, String r2, String r3, String r4) {
        this.data = r1;
        this.message = r2;
        this.error = r3;
        this.code = r4;
    }

    public final List a() {
        return this.data;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UpdateReferralCodeResponse) == true) goto L8;
        return false;
    L8:
        UpdateReferralCodeResponse r52 = (UpdateReferralCodeResponse) r5;
        if (p.g(this.data, r52.data) == true) goto L12;
        return false;
    L12:
        if (p.g(this.message, r52.message) == true) goto L15;
        return false;
    L15:
        if (p.g(this.error, r52.error) == true) goto L18;
        return false;
    L18:
        if (p.g(this.code, r52.code) == true) goto L20;
        return false;
    L20:
        return true;
    }

    @Override // com.stockbit.remote.models.base.b
    public String getError() {
        return this.error;
    }

    @Override // com.stockbit.remote.models.base.b
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        List<String> r02 = this.data;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.message;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.error;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.code;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "UpdateReferralCodeResponse(data=" + this.data + ", message=" + this.message + ", error=" + this.error + ", code=" + this.code + ')';
    }

    public /* synthetic */ UpdateReferralCodeResponse(List r2, String r3, String r4, String r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4, r5);
    }
}
