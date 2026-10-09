package com.stockbit.common.uikit.keyboard;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.stockbit.common.uikit.keyboard.utilities.a;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0014J\b\u0010\u0014\u001a\u00020\u000fH\u0007J\b\u0010\u0015\u001a\u00020\u000fH$R\u0015\u0010\b\u001a\u00020\t*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\f\u001a\u00020\t*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/common/uikit/keyboard/ResizableRelativeLayout;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "toPx", "", "getToPx", "(I)I", "toDp", "getToDp", "onSizeChanged", "", "width", "height", "oldWidth", "oldHeight", "resetContent", "configureSelf", "common_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ResizableRelativeLayout extends RelativeLayout {
    static {
    }

    public ResizableRelativeLayout(Context r2, AttributeSet r3) {
        p.l(r2, "context");
        p.l(r3, "attr");
        super(r2, r3);
    }

    public static /* synthetic */ void a(ResizableRelativeLayout r02) {
        e(r02);
    }

    public static final void e(ResizableRelativeLayout r02) {
        r02.b();
    }

    public abstract void b();

    public final int c(int r4) {
        a.C0636a r02 = com.stockbit.common.uikit.keyboard.utilities.a.f61830a;
        Context r1 = getContext();
        p.k(r1, "getContext(...)");
        return r02.d(r1, r4);
    }

    public final void d() {
        removeAllViews();
        new Handler().postDelayed(new a(this), 50);
    }

    @Override // android.view.View
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        d();
    }
}
