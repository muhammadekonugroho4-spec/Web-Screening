package com.stockbit.remote.models.response;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0083\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR&\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/stockbit/remote/models/response/SetSmartOrderResponse;", "Lcom/stockbit/remote/models/base/BaseResponse;", "message", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "errorType", "errors", "", "Lcom/stockbit/remote/models/base/Error;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getData", "setData", "getErrorType", "setErrorType", "getErrors", "()Ljava/util/List;", "setErrors", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SetSmartOrderResponse implements com.stockbit.remote.models.base.a {

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private String data;

    @SerializedName("error_type")
    private String errorType;

    @SerializedName("errors")
    private List<Object> errors;

    @SerializedName("message")
    private String message;

    public SetSmartOrderResponse(String r1, String r2, String r3, List<Object> r4) {
        this.message = r1;
        this.data = r2;
        this.errorType = r3;
        this.errors = r4;
    }

    @Override // com.stockbit.remote.models.base.a
    public String a() {
        return this.errorType;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SetSmartOrderResponse) == true) goto L8;
        return false;
    L8:
        SetSmartOrderResponse r52 = (SetSmartOrderResponse) r5;
        if (p.g(this.message, r52.message) == true) goto L12;
        return false;
    L12:
        if (p.g(this.data, r52.data) == true) goto L15;
        return false;
    L15:
        if (p.g(this.errorType, r52.errorType) == true) goto L18;
        return false;
    L18:
        if (p.g(this.errors, r52.errors) == true) goto L20;
        return false;
    L20:
        return true;
    }

    @Override // com.stockbit.remote.models.base.a
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
        String r2 = this.data;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.errorType;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        List<Object> r25 = this.errors;
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
        return "SetSmartOrderResponse(message=" + this.message + ", data=" + this.data + ", errorType=" + this.errorType + ", errors=" + this.errors + ')';
    }

    public /* synthetic */ SetSmartOrderResponse(String r1, String r2, String r3, List r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r5 & 2) == 0) goto L8;
        r2 = null;
    L8:
        this(r1, r2, r3, r4);
    }
}
