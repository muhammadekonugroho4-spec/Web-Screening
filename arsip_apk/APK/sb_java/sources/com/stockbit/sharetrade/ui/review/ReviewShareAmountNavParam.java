package com.stockbit.sharetrade.ui.review;

import com.clevertap.android.sdk.Constants;
import com.stockbit.sharetrade.model.PreviewBubbleParam;
import com.stockbit.usecase.sharetrade.model.ShareTradeTargetUIState;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/stockbit/sharetrade/ui/review/ReviewShareAmountNavParam;", "Ljava/io/Serializable;", "targets", "", "Lcom/stockbit/usecase/sharetrade/model/ShareTradeTargetUIState;", "isStaticPreview", "", "previewBubbleParam", "Lcom/stockbit/sharetrade/model/PreviewBubbleParam;", "<init>", "(Ljava/util/List;ZLcom/stockbit/sharetrade/model/PreviewBubbleParam;)V", "getTargets", "()Ljava/util/List;", "()Z", "getPreviewBubbleParam", "()Lcom/stockbit/sharetrade/model/PreviewBubbleParam;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "other", "", "hashCode", "", "toString", "", "sharetrade_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ReviewShareAmountNavParam implements Serializable {
    private final boolean isStaticPreview;
    private final PreviewBubbleParam previewBubbleParam;
    private final List<ShareTradeTargetUIState> targets;

    public ReviewShareAmountNavParam(List r2, boolean r3, PreviewBubbleParam r4) {
        p.l(r2, "targets");
        this.targets = r2;
        this.isStaticPreview = r3;
        this.previewBubbleParam = r4;
    }

    public final PreviewBubbleParam a() {
        return this.previewBubbleParam;
    }

    public final List b() {
        return this.targets;
    }

    public final boolean c() {
        return this.isStaticPreview;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ReviewShareAmountNavParam) == true) goto L8;
        return false;
    L8:
        ReviewShareAmountNavParam r52 = (ReviewShareAmountNavParam) r5;
        if (p.g(this.targets, r52.targets) == true) goto L12;
        return false;
    L12:
        if (this.isStaticPreview == r52.isStaticPreview) goto L15;
        return false;
    L15:
        if (p.g(this.previewBubbleParam, r52.previewBubbleParam) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.targets.hashCode() * 31) + Boolean.hashCode(this.isStaticPreview)) * 31;
        PreviewBubbleParam r1 = this.previewBubbleParam;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "ReviewShareAmountNavParam(targets=" + this.targets + ", isStaticPreview=" + this.isStaticPreview + ", previewBubbleParam=" + this.previewBubbleParam + ')';
    }
}
