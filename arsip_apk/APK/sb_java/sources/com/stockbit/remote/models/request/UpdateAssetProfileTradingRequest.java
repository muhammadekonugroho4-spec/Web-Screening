package com.stockbit.remote.models.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/remote/models/request/UpdateAssetProfileTradingRequest;", "", "files", "Lcom/stockbit/remote/models/request/Files;", "<init>", "(Lcom/stockbit/remote/models/request/Files;)V", "getFiles", "()Lcom/stockbit/remote/models/request/Files;", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UpdateAssetProfileTradingRequest {

    @SerializedName("files")
    private final Files files;

    public UpdateAssetProfileTradingRequest(Files r2) {
        p.l(r2, "files");
        this.files = r2;
    }
}
