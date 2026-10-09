package com.stockbit.stream.utils;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.midtrans.sdk.corekit.core.BaseSdkBuilder;

/* loaded from: classes11.dex */
public final class m extends LinkMovementMethod {
    static {
    }

    public m() {
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView r6, Spannable r7, MotionEvent r8) {
        kotlin.jvm.internal.p.l(r6, BaseSdkBuilder.WIDGET);
        kotlin.jvm.internal.p.l(r8, NotificationCompat.CATEGORY_EVENT);
        if (r8.getAction() != 1) goto L11;
        int r02 = (int) r8.getX();
        int r2 = (((int) r8.getY()) - r6.getTotalPaddingTop()) + r6.getScrollY();
        Layout r3 = r6.getLayout();
        int r22 = r3.getLineForVertical(r2);
        float r4 = r3.getLineLeft(r22);
        float r23 = r3.getLineRight(r22);
        float r32 = r02;
        if (r32 > r23) goto L9;
        if (r02 < 0) goto L11;
        if (r32 >= r4) goto L11;
    L9:
        return true;
    L11:
        return super.onTouchEvent(r6, r7, r8);
    }
}
