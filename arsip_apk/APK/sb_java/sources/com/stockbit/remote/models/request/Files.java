package com.stockbit.remote.models.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/stockbit/remote/models/request/Files;", "", "identity", "", "selfie", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getIdentity", "()Ljava/lang/String;", "getSelfie", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Files {

    @SerializedName("identity")
    private final String identity;

    @SerializedName("selfie")
    private final String selfie;

    public Files(String r2, String r3) {
        p.l(r2, "identity");
        p.l(r3, "selfie");
        this.identity = r2;
        this.selfie = r3;
    }
}
