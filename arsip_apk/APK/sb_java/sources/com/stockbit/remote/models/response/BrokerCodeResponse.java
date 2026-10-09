package com.stockbit.remote.models.response;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import com.stockbit.model.entity.BrokerCodeMarketDetectorResponseData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/stockbit/remote/models/response/BrokerCodeResponse;", "Lcom/stockbit/remote/models/base/BaseResponse;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/ArrayList;", "Lcom/stockbit/model/entity/BrokerCodeMarketDetectorResponseData;", "message", "", "errorType", "errors", "", "Lcom/stockbit/remote/models/base/Error;", "<init>", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getErrorType", "setErrorType", "getErrors", "()Ljava/util/List;", "setErrors", "(Ljava/util/List;)V", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BrokerCodeResponse implements com.stockbit.remote.models.base.a {

    /* renamed from: a, reason: collision with root package name */
    public String f129508a;

    /* renamed from: b, reason: collision with root package name */
    public List f129509b;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private ArrayList<BrokerCodeMarketDetectorResponseData> data;

    @SerializedName("error_type")
    private String errorType;

    public BrokerCodeResponse(ArrayList<BrokerCodeMarketDetectorResponseData> r1, String r2, String r3, List<Object> r4) {
        this.data = r1;
        this.f129508a = r2;
        this.errorType = r3;
        this.f129509b = r4;
    }

    @Override // com.stockbit.remote.models.base.a
    public String a() {
        return this.errorType;
    }

    public final ArrayList b() {
        return this.data;
    }

    @Override // com.stockbit.remote.models.base.a
    public String getMessage() {
        return this.f129508a;
    }

    public /* synthetic */ BrokerCodeResponse(ArrayList r1, String r2, String r3, List r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1, r2, r3, r4);
    }
}
