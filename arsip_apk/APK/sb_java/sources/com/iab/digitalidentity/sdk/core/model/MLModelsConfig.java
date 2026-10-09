package com.iab.digitalidentity.sdk.core.model;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/MLModelsConfig;", "", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MLModelsConfig {

    @SerializedName("ojo_2_11_1_android")
    private final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public MLModelsConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MLModelsConfig copy$default(MLModelsConfig r02, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r02.url;
    L6:
        return r02.copy(r1);
    }

    public final String component1() {
        return this.url;
    }

    public final MLModelsConfig copy(String r2) {
        p.l(r2, "url");
        return new MLModelsConfig(r2);
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof MLModelsConfig) == true) goto L9;
        return false;
    L9:
        if (p.g(this.url, ((MLModelsConfig) r4).url) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public String toString() {
        return "MLModelsConfig(url=" + this.url + ")";
    }

    public MLModelsConfig(String r2) {
        p.l(r2, "url");
        this.url = r2;
    }

    public /* synthetic */ MLModelsConfig(String r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "https://assets.goidentitas.id/models/ojo_model_files.v10.0.0.zip";
    L5:
        this(r1);
    }
}
