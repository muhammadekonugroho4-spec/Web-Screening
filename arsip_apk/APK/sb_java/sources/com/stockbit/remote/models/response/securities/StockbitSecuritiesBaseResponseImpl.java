package com.stockbit.remote.models.response.securities;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import com.stockbit.remote.models.base.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR&\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/stockbit/remote/models/response/securities/StockbitSecuritiesBaseResponseImpl;", "Lcom/stockbit/remote/models/base/BaseResponse;", "message", "", "errorType", "errors", "", "Lcom/stockbit/remote/models/base/Error;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getErrorType", "setErrorType", "getErrors", "()Ljava/util/List;", "setErrors", "(Ljava/util/List;)V", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StockbitSecuritiesBaseResponseImpl implements a {

    @SerializedName("error_type")
    private String errorType;

    @SerializedName("errors")
    private List<Object> errors;

    @SerializedName("message")
    private String message;

    public StockbitSecuritiesBaseResponseImpl(String r1, String r2, List<Object> r3) {
        this.message = r1;
        this.errorType = r2;
        this.errors = r3;
    }

    @Override // com.stockbit.remote.models.base.a
    public String a() {
        return this.errorType;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StockbitSecuritiesBaseResponseImpl) == true) goto L8;
        return false;
    L8:
        StockbitSecuritiesBaseResponseImpl r52 = (StockbitSecuritiesBaseResponseImpl) r5;
        if (p.g(this.message, r52.message) == true) goto L12;
        return false;
    L12:
        if (p.g(this.errorType, r52.errorType) == true) goto L15;
        return false;
    L15:
        if (p.g(this.errors, r52.errors) == true) goto L17;
        return false;
    L17:
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
        String r2 = this.errorType;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        List<Object> r23 = this.errors;
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
        return "StockbitSecuritiesBaseResponseImpl(message=" + this.message + ", errorType=" + this.errorType + ", errors=" + this.errors + ')';
    }

    public /* synthetic */ StockbitSecuritiesBaseResponseImpl(String r1, String r2, List r3, int r4, i r5) {
        if ((r4 & 2) == 0) goto L5;
        r2 = null;
    L5:
        this(r1, r2, r3);
    }
}
