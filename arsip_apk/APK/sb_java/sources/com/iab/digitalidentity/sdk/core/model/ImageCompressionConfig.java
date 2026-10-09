package com.iab.digitalidentity.sdk.core.model;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/ImageCompressionConfig;", "", "quality", "", "maxSizeInKb", "(II)V", "getMaxSizeInKb", "()I", "getQuality", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageCompressionConfig {

    @SerializedName("max_size_in_kb")
    private final int maxSizeInKb;

    @SerializedName("quality")
    private final int quality;

    public ImageCompressionConfig() {
        int r2 = 0;
        this(r2, r2, 3, null);
    }

    public static /* synthetic */ ImageCompressionConfig copy$default(ImageCompressionConfig r02, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.quality;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.maxSizeInKb;
    L9:
        return r02.copy(r1, r2);
    }

    public final int component1() {
        return this.quality;
    }

    public final int component2() {
        return this.maxSizeInKb;
    }

    public final ImageCompressionConfig copy(int r2, int r3) {
        return new ImageCompressionConfig(r2, r3);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ImageCompressionConfig) == true) goto L8;
        return false;
    L8:
        ImageCompressionConfig r52 = (ImageCompressionConfig) r5;
        if (this.quality == r52.quality) goto L12;
        return false;
    L12:
        if (this.maxSizeInKb == r52.maxSizeInKb) goto L14;
        return false;
    L14:
        return true;
    }

    public final int getMaxSizeInKb() {
        return this.maxSizeInKb;
    }

    public final int getQuality() {
        return this.quality;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.quality) * 31;
        return Integer.hashCode(this.maxSizeInKb) + r02;
    }

    public String toString() {
        return "ImageCompressionConfig(quality=" + this.quality + ", maxSizeInKb=" + this.maxSizeInKb + ")";
    }

    public ImageCompressionConfig(int r1, int r2) {
        this.quality = r1;
        this.maxSizeInKb = r2;
    }

    public /* synthetic */ ImageCompressionConfig(int r1, int r2, int r3, i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 50;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = 10240;
    L8:
        this(r1, r2);
    }
}
