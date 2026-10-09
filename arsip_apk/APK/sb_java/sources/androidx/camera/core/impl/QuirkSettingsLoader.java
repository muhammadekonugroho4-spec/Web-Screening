package androidx.camera.core.impl;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import androidx.camera.core.AbstractC2209b0;
import androidx.camera.core.impl.E0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class QuirkSettingsLoader implements androidx.arch.core.util.a {

    public static class MetadataHolderService extends Service {
        private MetadataHolderService() {
        }

        @Override // android.app.Service
        public IBinder onBind(Intent r1) {
            throw new UnsupportedOperationException();
        }
    }

    public QuirkSettingsLoader() {
    }

    public static E0 b(Context r4, Bundle r5) {
        boolean r02 = r5.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] r1 = c(r4, r5, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] r42 = c(r4, r5, "androidx.camera.core.quirks.FORCE_DISABLED");
        AbstractC2209b0.a("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        AbstractC2209b0.a("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + r02);
        AbstractC2209b0.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(r1));
        AbstractC2209b0.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(r42));
        return new E0.b().d(r02).c(e(r1)).b(e(r42)).a();
    }

    public static String[] c(Context r3, Bundle r4, String r5) {
        if (r4.containsKey(r5) == false) goto L5;
        int r42 = r4.getInt(r5, -1);
        if (r42 != (-1)) goto L15;
        AbstractC2209b0.l("QuirkSettingsLoader", "Resource ID not found for key: " + r5);
        return new String[0];
    L15:
        return r3.getResources().getStringArray(r42);
    L12:
        e = move-exception;
        AbstractC2209b0.m("QuirkSettingsLoader", "Quirk class names resource not found: " + r42, e);
        return new String[0];
    L5:
        return new String[0];
    }

    public static Class d(String r4) {
        Class<?> r1 = Class.forName(r4);     // Catch: ClassNotFoundException -> L8
        if (D0.class.isAssignableFrom(r1) == false) goto L6;
        return r1;
    L6:
        AbstractC2209b0.l("QuirkSettingsLoader", r4 + " does not implement the Quirk interface.");     // Catch: ClassNotFoundException -> L8
        return null;
    L8:
        e = move-exception;
        AbstractC2209b0.m("QuirkSettingsLoader", "Class not found: " + r4, e);
        return null;
    }

    public static Set e(String[] r4) {
        HashSet r02 = new HashSet();
        int r1 = r4.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        Class r3 = d(r4[r2]);
        if (r3 == null) goto L7;
        r02.add(r3);
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        return r02;
    }

    public E0 a(Context r6) {
        PackageManager r1 = r6.getPackageManager();
        Bundle r12 = r1.getServiceInfo(new ComponentName(r6, MetadataHolderService.class), 640).metaData;     // Catch: PackageManager.NameNotFoundException -> L9
        if (r12 != null) goto L8;
        AbstractC2209b0.l("QuirkSettingsLoader", "No metadata in MetadataHolderService.");     // Catch: PackageManager.NameNotFoundException -> L9
        return null;
    L8:
        return b(r6, r12);
    L9:
        AbstractC2209b0.a("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
        return null;
    }

    @Override // androidx.arch.core.util.a
    public /* bridge */ /* synthetic */ Object apply(Object r1) {
        return a((Context) r1);
    }
}
