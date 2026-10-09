package com.stockbit.model.entity;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/stockbit/model/entity/LivenessQuotaResponseData;", "", "<init>", "()V", "isQuotaAvailable", "", "()Ljava/lang/Boolean;", "setQuotaAvailable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LivenessQuotaResponseData {

    @SerializedName("is_quota_available")
    private Boolean isQuotaAvailable;

    public LivenessQuotaResponseData() {
        this.isQuotaAvailable = Boolean.FALSE;
    }

    public final Boolean a() {
        return this.isQuotaAvailable;
    }
}
