package com.iab.digitalidentity.sdk.core.model;

import b.AbstractC4230a;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u001eR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u001eR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/ImageCompressionOutput;", "", "", "originalSize", "compressedSize", "optimalSize", "", "compressionError", "<init>", "(IIILjava/lang/String;)V", "Lkotlin/w;", "reset", "()V", "component1", "()I", "component2", "component3", "component4", "()Ljava/lang/String;", Constants.COPY_TYPE, "(IIILjava/lang/String;)Lcom/iab/digitalidentity/sdk/core/model/ImageCompressionOutput;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getOriginalSize", "setOriginalSize", "(I)V", "getCompressedSize", "setCompressedSize", "getOptimalSize", "setOptimalSize", "Ljava/lang/String;", "getCompressionError", "setCompressionError", "(Ljava/lang/String;)V", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageCompressionOutput {
    private int compressedSize;
    private String compressionError;
    private int optimalSize;
    private int originalSize;

    public ImageCompressionOutput() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        String r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ ImageCompressionOutput copy$default(ImageCompressionOutput r02, int r1, int r2, int r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.originalSize;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.compressedSize;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.optimalSize;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.compressionError;
    L15:
        return r02.copy(r1, r2, r3, r4);
    }

    public final int component1() {
        return this.originalSize;
    }

    public final int component2() {
        return this.compressedSize;
    }

    public final int component3() {
        return this.optimalSize;
    }

    public final String component4() {
        return this.compressionError;
    }

    public final ImageCompressionOutput copy(int r2, int r3, int r4, String r5) {
        return new ImageCompressionOutput(r2, r3, r4, r5);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ImageCompressionOutput) == true) goto L8;
        return false;
    L8:
        ImageCompressionOutput r52 = (ImageCompressionOutput) r5;
        if (this.originalSize == r52.originalSize) goto L12;
        return false;
    L12:
        if (this.compressedSize == r52.compressedSize) goto L15;
        return false;
    L15:
        if (this.optimalSize == r52.optimalSize) goto L18;
        return false;
    L18:
        if (p.g(this.compressionError, r52.compressionError) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final int getCompressedSize() {
        return this.compressedSize;
    }

    public final String getCompressionError() {
        return this.compressionError;
    }

    public final int getOptimalSize() {
        return this.optimalSize;
    }

    public final int getOriginalSize() {
        return this.originalSize;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.originalSize) * 31;
        int r03 = AbstractC4230a.a(this.compressedSize, r02, 31);
        int r04 = AbstractC4230a.a(this.optimalSize, r03, 31);
        String r1 = this.compressionError;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r04 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final void reset() {
        this.originalSize = 0;
        this.compressedSize = 0;
        this.optimalSize = 0;
        this.compressionError = null;
    }

    public final void setCompressedSize(int r1) {
        this.compressedSize = r1;
    }

    public final void setCompressionError(String r1) {
        this.compressionError = r1;
    }

    public final void setOptimalSize(int r1) {
        this.optimalSize = r1;
    }

    public final void setOriginalSize(int r1) {
        this.originalSize = r1;
    }

    public String toString() {
        return "ImageCompressionOutput(originalSize=" + this.originalSize + ", compressedSize=" + this.compressedSize + ", optimalSize=" + this.optimalSize + ", compressionError=" + this.compressionError + ")";
    }

    public ImageCompressionOutput(int r1, int r2, int r3, String r4) {
        this.originalSize = r1;
        this.compressedSize = r2;
        this.optimalSize = r3;
        this.compressionError = r4;
    }

    public /* synthetic */ ImageCompressionOutput(int r2, int r3, int r4, String r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }
}
