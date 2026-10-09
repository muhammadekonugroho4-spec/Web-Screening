package com.stockbit.feature.portfolio.ui.webview;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Arrays;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;

/* loaded from: classes9.dex */
public final class b extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public a f106584a;

    public interface a {
        void G2();

        void a3(String r1);

        void g0();
    }

    static {
    }

    public b(a r1) {
        this.f106584a = r1;
    }

    public final void a() {
        this.f106584a = null;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView r1, String r2) {
        super.onPageFinished(r1, r2);
        a r12 = this.f106584a;
        if (r12 == null) goto L6;
        r12.G2();
        return;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView r1, String r2, Bitmap r3) {
        super.onPageStarted(r1, r2, r3);
        a r12 = this.f106584a;
        if (r12 == null) goto L6;
        r12.g0();
        return;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView r2, WebResourceRequest r3, WebResourceError r4) {
        super.onReceivedError(r2, r3, r4);
        y r32 = y.f177509a;
        Integer r33 = null;
        if (r2 == null) goto L5;
        String r22 = r2.getUrl();
    L6:
        if (r4 == null) goto L8;
        CharSequence r02 = r4.getDescription();
    L9:
        String r03 = String.valueOf(r02);
        if (r4 == null) goto L12;
        r33 = Integer.valueOf(r4.getErrorCode());
    L12:
        String r23 = String.format("Error happened on %s caused of %s with %s code", Arrays.copyOf(new Object[]{r22, r03, r33}, 3));
        p.k(r23, "format(...)");
        a r34 = this.f106584a;
        if (r34 == null) goto L16;
        r34.a3(r23);
        return;
    L16:
        return;
    L8:
        r02 = null;
        goto L9
    L5:
        r22 = null;
        goto L6
    }
}
