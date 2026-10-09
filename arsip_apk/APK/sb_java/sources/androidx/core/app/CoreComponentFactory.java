package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

/* loaded from: classes.dex */
public class CoreComponentFactory extends AppComponentFactory {
    public CoreComponentFactory() {
    }

    public static Object a(Object r02) {
        return r02;
    }

    public Activity instantiateActivity(ClassLoader r1, String r2, Intent r3) {
        return (Activity) a(super.instantiateActivity(r1, r2, r3));
    }

    public Application instantiateApplication(ClassLoader r1, String r2) {
        return (Application) a(super.instantiateApplication(r1, r2));
    }

    public ContentProvider instantiateProvider(ClassLoader r1, String r2) {
        return (ContentProvider) a(super.instantiateProvider(r1, r2));
    }

    public BroadcastReceiver instantiateReceiver(ClassLoader r1, String r2, Intent r3) {
        return (BroadcastReceiver) a(super.instantiateReceiver(r1, r2, r3));
    }

    public Service instantiateService(ClassLoader r1, String r2, Intent r3) {
        return (Service) a(super.instantiateService(r1, r2, r3));
    }
}
