package com.stockbit.profiletrading.ui.account.webview.client;

import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes10.dex */
public final class a extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1165a f128502a;

    /* renamed from: com.stockbit.profiletrading.ui.account.webview.client.a$a, reason: collision with other inner class name */
    public interface InterfaceC1165a {
        boolean a(ValueCallback r1, WebChromeClient.FileChooserParams r2);
    }

    static {
    }

    public a(InterfaceC1165a r1) {
        this.f128502a = r1;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView r2, ValueCallback r3, WebChromeClient.FileChooserParams r4) {
        InterfaceC1165a r22 = this.f128502a;
        if (r22 != null) goto L5;
    L7:
        return false;
    L5:
        if (r22.a(r3, r4) != true) goto L7;
        return true;
    }
}
