package com.iab.digitalidentity.sdk.widget.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.iab.digitalidentity.h;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import n0.C12011a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lcom/iab/digitalidentity/sdk/widget/views/OneKycWidgetInProcessStepView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "attributeSet", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OneKycWidgetInProcessStepView extends FrameLayout {
    public OneKycWidgetInProcessStepView(Context r2, AttributeSet r3, int r4) {
        p.l(r2, "context");
        super(r2, r3, r4);
        View.inflate(new C12011a(r2), h.f39831O, this);
    }

    public OneKycWidgetInProcessStepView(Context r2, AttributeSet r3) {
        p.l(r2, "context");
        this(r2, r3, 0);
    }

    public OneKycWidgetInProcessStepView(Context r2) {
        p.l(r2, "context");
        this(r2, null);
    }
}
