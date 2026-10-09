package com.iab.digitalidentity.sdk.core.model;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/ImageConfigs;", "", "compressionConfig", "Lcom/iab/digitalidentity/sdk/core/model/ImageCompressionConfig;", "(Lcom/iab/digitalidentity/sdk/core/model/ImageCompressionConfig;)V", "getCompressionConfig", "()Lcom/iab/digitalidentity/sdk/core/model/ImageCompressionConfig;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageConfigs {

    @SerializedName("compression")
    private final ImageCompressionConfig compressionConfig;

    /* JADX WARN: Multi-variable type inference failed */
    public ImageConfigs() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ImageConfigs copy$default(ImageConfigs r02, ImageCompressionConfig r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r02.compressionConfig;
    L6:
        return r02.copy(r1);
    }

    public final ImageCompressionConfig component1() {
        return this.compressionConfig;
    }

    public final ImageConfigs copy(ImageCompressionConfig r2) {
        p.l(r2, "compressionConfig");
        return new ImageConfigs(r2);
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof ImageConfigs) == true) goto L9;
        return false;
    L9:
        if (p.g(this.compressionConfig, ((ImageConfigs) r4).compressionConfig) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final ImageCompressionConfig getCompressionConfig() {
        return this.compressionConfig;
    }

    public int hashCode() {
        return this.compressionConfig.hashCode();
    }

    public String toString() {
        return "ImageConfigs(compressionConfig=" + this.compressionConfig + ")";
    }

    public ImageConfigs(ImageCompressionConfig r2) {
        p.l(r2, "compressionConfig");
        this.compressionConfig = r2;
    }

    public /* synthetic */ ImageConfigs(ImageCompressionConfig r2, int r3, i r4) {
        if ((r3 & 1) == 0) goto L5;
        r2 = new ImageCompressionConfig(0, 0, 3, null);
    L5:
        this(r2);
    }
}
