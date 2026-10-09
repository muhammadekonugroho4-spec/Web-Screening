package com.iab.digitalidentity.ui.button;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.l;
import com.iab.digitalidentity.k;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/iab/digitalidentity/ui/button/KycPlusRadioButton;", "Landroidx/appcompat/widget/AppCompatRadioButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/w;", "a", "()V", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KycPlusRadioButton extends AppCompatRadioButton {
    /* JADX WARN: Multi-variable type inference failed */
    public KycPlusRadioButton(Context r3) {
        p.l(r3, "context");
        this(r3, null, 2, 0 == true ? 1 : 0);
    }

    public final void a() {
        l.m(this, k.f39959B);
    }

    public KycPlusRadioButton(Context r2, AttributeSet r3) {
        p.l(r2, "context");
        super(r2, r3);
        setButtonDrawable(com.iab.digitalidentity.f.f39673O);
        setBackgroundColor(0);
        a();
    }

    public /* synthetic */ KycPlusRadioButton(Context r1, AttributeSet r2, int r3, i r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        this(r1, r2);
    }
}
