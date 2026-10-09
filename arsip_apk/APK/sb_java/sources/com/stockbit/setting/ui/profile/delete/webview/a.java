package com.stockbit.setting.ui.profile.delete.webview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Arrays;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;

/* loaded from: classes11.dex */
public final class a extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1238a f136642a;

    /* renamed from: com.stockbit.setting.ui.profile.delete.webview.a$a, reason: collision with other inner class name */
    public interface InterfaceC1238a {
        void d(String r1);

        void m(String r1);
    }

    static {
    }

    public a(InterfaceC1238a r2) {
        p.l(r2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f136642a = r2;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView r1, String r2, boolean r3) {
        super.doUpdateVisitedHistory(r1, r2, r3);
        if (r2 == null) goto L6;
        this.f136642a.m(r2);
        return;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView r1, String r2) {
        super.onPageFinished(r1, r2);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView r1, String r2, Bitmap r3) {
        super.onPageStarted(r1, r2, r3);
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
        this.f136642a.d(r23);
        return;
    L8:
        r02 = null;
        goto L9
    L5:
        r22 = null;
        goto L6
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView r1, SslErrorHandler r2, SslError r3) {
        super.onReceivedSslError(r1, r2, r3);
    }
}
