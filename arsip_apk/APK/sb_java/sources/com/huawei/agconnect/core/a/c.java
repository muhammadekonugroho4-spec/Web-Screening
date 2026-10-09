package com.huawei.agconnect.core.a;

import a.a.a.a.c.f;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.huawei.agconnect.core.ServiceDiscovery;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38860a;

    public static class a implements Serializable, Comparator<Map.Entry<String, Integer>> {
        private a() {
        }

        public int a(Map.Entry r1, Map.Entry r2) {
            return ((Integer) r1.getValue()).intValue() - ((Integer) r2.getValue()).intValue();
        }

        @Override // java.util.Comparator
        public /* synthetic */ int compare(Map.Entry<String, Integer> r1, Map.Entry<String, Integer> r2) {
            return a(r1, r2);
        }

        public /* synthetic */ a(b r1) {
            this();
        }
    }

    public static /* synthetic */ class b {
    }

    public c(Context r1) {
        this.f38860a = r1;
    }

    public final com.huawei.agconnect.core.a a(String r6) {
        Class<?> r3 = Class.forName(r6);     // Catch: IllegalAccessException -> L7 InstantiationException -> L9 ClassNotFoundException -> L11
        if (com.huawei.agconnect.core.a.class.isAssignableFrom(r3) == true) goto L13;
        Log.e("ServiceRegistrarParser", r3 + " must extends from ServiceRegistrar.");     // Catch: IllegalAccessException -> L7 InstantiationException -> L9 ClassNotFoundException -> L11
        return null;
    L13:
        f.a(Class.forName(r6).newInstance());     // Catch: IllegalAccessException -> L7 InstantiationException -> L9 ClassNotFoundException -> L11
        return null;
    L11:
        e = move-exception;
        String r62 = "Can not found service class, " + e.getMessage();
    L17:
        Log.e("ServiceRegistrarParser", r62);
        return null;
    L7:
        e = e;
        StringBuilder r32 = new StringBuilder();
    L16:
        r32.append("instantiate service class exception ");
        r32.append(e.getLocalizedMessage());
        r62 = r32.toString();
    L9:
        e = e;
        r32 = new StringBuilder();
        goto L16
    }

    public List b() {
        Log.i("ServiceRegistrarParser", "getServices");
        List r02 = c();
        ArrayList r2 = new ArrayList();
        Iterator r03 = r02.iterator();
    L4:
        if (r03.hasNext() == false) goto L6;
        a((String) r03.next());
        goto L4
    L6:
        Log.i("ServiceRegistrarParser", "services:" + Integer.valueOf(r2.size()));
        return r2;
    }

    public final List c() {
        ArrayList r02 = new ArrayList();
        Bundle r1 = d();
        if (r1 == null) goto L25;
        HashMap r2 = new HashMap(10);
        Iterator<String> r3 = r1.keySet().iterator();
    L7:
        if (r3.hasNext() == false) goto L21;
        String r4 = r3.next();
        if ("com.huawei.agconnect.core.ServiceRegistrar".equals(r1.getString(r4)) == false) goto L7;
        String[] r5 = r4.split(":");
        if (r5.length != 2) goto L18;
        r2.put(r5[0], Integer.valueOf(r5[1]));     // Catch: NumberFormatException -> L14
    L14:
        e = move-exception;
        StringBuilder r52 = new StringBuilder();
        r52.append("registrar configuration format error:");
        r4 = e.getMessage();
    L16:
        r52.append(r4);
        Log.e("ServiceRegistrarParser", r52.toString());
        goto L7
    L18:
        if (r5.length == 1) goto L19;
        r52 = new StringBuilder();
        r52.append("registrar configuration error, ");
        goto L16
    L19:
        r2.put(r5[0], 1000);
        goto L7
    L21:
        ArrayList r12 = new ArrayList(r2.entrySet());
        Collections.sort(r12, new a(null));
        Iterator r13 = r12.iterator();
    L23:
        if (r13.hasNext() == false) goto L25;
        r02.add(((Map.Entry) r13.next()).getKey());
    L25:
        return r02;
    }

    public final Bundle d() {
        PackageManager r1 = this.f38860a.getPackageManager();
        if (r1 != null) goto L14;
        return null;
    L14:
        ServiceInfo r12 = r1.getServiceInfo(new ComponentName(this.f38860a, ServiceDiscovery.class), 128);     // Catch: PackageManager.NameNotFoundException -> L8
        if (r12 != null) goto L11;
        Log.e("ServiceRegistrarParser", "Can not found ServiceDiscovery service.");     // Catch: PackageManager.NameNotFoundException -> L8
    L13:
        return null;
    L11:
        return r12.metaData;
    L8:
        e = move-exception;
        Log.e("ServiceRegistrarParser", "get ServiceDiscovery exception." + e.getLocalizedMessage());
        goto L13
    }
}
