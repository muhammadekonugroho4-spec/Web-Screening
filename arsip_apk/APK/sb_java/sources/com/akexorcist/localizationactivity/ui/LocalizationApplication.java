package com.akexorcist.localizationactivity.ui;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.akexorcist.localizationactivity.core.c;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/akexorcist/localizationactivity/ui/LocalizationApplication;", "Landroid/app/Application;", "<init>", "()V", "Landroid/content/Context;", "base", "Lkotlin/w;", "attachBaseContext", "(Landroid/content/Context;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "getApplicationContext", "()Landroid/content/Context;", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "Ljava/util/Locale;", "a", "(Landroid/content/Context;)Ljava/util/Locale;", "Lcom/akexorcist/localizationactivity/core/c;", "Lcom/akexorcist/localizationactivity/core/c;", "localizationDelegate", "localization_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public abstract class LocalizationApplication extends Application {

    /* renamed from: a, reason: collision with root package name */
    public final c f31667a;

    public LocalizationApplication() {
        this.f31667a = new c();
    }

    public abstract Locale a(Context r1);

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context r3) {
        p.l(r3, "base");
        this.f31667a.f(r3, a(r3));
        super.attachBaseContext(this.f31667a.a(r3));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        c r02 = this.f31667a;
        Context r1 = super.getApplicationContext();
        p.k(r1, "super.getApplicationContext()");
        return r02.b(r1);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        c r02 = this.f31667a;
        Resources r1 = super.getResources();
        p.k(r1, "super.getResources()");
        return r02.c(this, r1);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration r2) {
        p.l(r2, "newConfig");
        super.onConfigurationChanged(r2);
        this.f31667a.d(this);
    }
}
