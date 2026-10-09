package com.stockbit.chat.ui.media;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f56507a = null;

    static {
        f56507a = new a();
    }

    public a() {
    }

    public static final void a(TextView r1, String r2, Drawable r3) {
        p.l(r1, "view");
        p.l(r2, Constants.KEY_TITLE);
        p.l(r3, Constants.KEY_ICON);
        r1.setText(r2);
        r1.setCompoundDrawablesWithIntrinsicBounds(null, null, r3, null);
    }
}
