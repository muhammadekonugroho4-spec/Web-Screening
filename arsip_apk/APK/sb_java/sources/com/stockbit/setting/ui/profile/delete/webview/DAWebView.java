package com.stockbit.setting.ui.profile.delete.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/setting/ui/profile/delete/webview/DAWebView;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "setting_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: classes11.dex */
public final class DAWebView extends WebView {
    static {
    }

    public DAWebView(Context r2, AttributeSet r3) {
        p.l(r2, "context");
        p.l(r3, "attrs");
        super(r2, r3);
        WebSettings r22 = getSettings();
        r22.setUseWideViewPort(true);
        r22.setLoadWithOverviewMode(true);
        r22.setJavaScriptEnabled(true);
        r22.setDomStorageEnabled(true);
        r22.setUseWideViewPort(true);
        r22.setLoadWithOverviewMode(true);
        r22.setDatabaseEnabled(true);
        r22.setSaveFormData(false);
        r22.setCacheMode(2);
        setVerticalScrollBarEnabled(true);
        setHorizontalScrollBarEnabled(true);
        measure(100, 100);
    }
}
