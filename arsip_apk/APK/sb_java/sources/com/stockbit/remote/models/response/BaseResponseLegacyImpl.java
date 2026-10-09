package com.stockbit.remote.models.response;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import com.stockbit.remote.models.base.b;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/stockbit/remote/models/response/BaseResponseLegacyImpl;", "Lcom/stockbit/remote/models/base/BaseResponseLegacy;", "message", "", "code", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getCode", "setCode", "getError", "setError", "component1", "component2", "component3", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BaseResponseLegacyImpl implements b {

    @SerializedName("code")
    private String code;

    @SerializedName(Constants.IPC_BUNDLE_KEY_SEND_ERROR)
    private String error;

    @SerializedName("message")
    private String message;

    public BaseResponseLegacyImpl(String r1, String r2, String r3) {
        this.message = r1;
        this.code = r2;
        this.error = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BaseResponseLegacyImpl) == true) goto L8;
        return false;
    L8:
        BaseResponseLegacyImpl r52 = (BaseResponseLegacyImpl) r5;
        if (p.g(this.message, r52.message) == true) goto L12;
        return false;
    L12:
        if (p.g(this.code, r52.code) == true) goto L15;
        return false;
    L15:
        if (p.g(this.error, r52.error) == true) goto L17;
        return false;
    L17:
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
        String r02 = this.message;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.code;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.error;
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
        return "BaseResponseLegacyImpl(message=" + this.message + ", code=" + this.code + ", error=" + this.error + ')';
    }

    public /* synthetic */ BaseResponseLegacyImpl(String r1, String r2, String r3, int r4, i r5) {
        if ((r4 & 2) == 0) goto L5;
        r2 = null;
    L5:
        this(r1, r2, r3);
    }
}
