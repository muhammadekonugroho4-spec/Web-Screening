package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.support.v4.app.a;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f22668c = null;
    public static String d;

    /* renamed from: e, reason: collision with root package name */
    public static Set f22669e;

    /* renamed from: f, reason: collision with root package name */
    public static final Object f22670f = null;

    /* renamed from: g, reason: collision with root package name */
    public static f f22671g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f22672a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f22673b;

    public static class a {
        public static List a(NotificationManager r02) {
            StatusBarNotification[] r03 = r02.getActiveNotifications();
            if (r03 != null) goto L7;
            return new ArrayList();
        L7:
            return Arrays.asList(r03);
        }

        public static int b(NotificationManager r02) {
            return r02.getCurrentInterruptionFilter();
        }
    }

    public static class b {
        public static boolean a(NotificationManager r02) {
            return r02.areNotificationsEnabled();
        }
    }

    public static class c {
        public static void a(NotificationManager r02, NotificationChannel r1) {
            r02.createNotificationChannel(r1);
        }

        public static NotificationChannel b(NotificationManager r02, String r1) {
            return r02.getNotificationChannel(r1);
        }
    }

    public static class d implements g {

        /* renamed from: a, reason: collision with root package name */
        public final String f22674a;

        /* renamed from: b, reason: collision with root package name */
        public final int f22675b;

        /* renamed from: c, reason: collision with root package name */
        public final String f22676c;
        public final Notification d;

        public d(String r1, int r2, String r3, Notification r4) {
            this.f22674a = r1;
            this.f22675b = r2;
            this.f22676c = r3;
            this.d = r4;
        }

        @Override // androidx.core.app.q.g
        public void a(android.support.v4.app.a r5) {
            r5.r(this.f22674a, this.f22675b, this.f22676c, this.d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f22674a + ", id:" + this.f22675b + ", tag:" + this.f22676c + Constants.AES_SUFFIX;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final ComponentName f22677a;

        /* renamed from: b, reason: collision with root package name */
        public final IBinder f22678b;

        public e(ComponentName r1, IBinder r2) {
            this.f22677a = r1;
            this.f22678b = r2;
        }
    }

    public static class f implements Handler.Callback, ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        public final Context f22679a;

        /* renamed from: b, reason: collision with root package name */
        public final HandlerThread f22680b;

        /* renamed from: c, reason: collision with root package name */
        public final Handler f22681c;
        public final Map d;

        /* renamed from: e, reason: collision with root package name */
        public Set f22682e;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final ComponentName f22683a;

            /* renamed from: b, reason: collision with root package name */
            public boolean f22684b;

            /* renamed from: c, reason: collision with root package name */
            public android.support.v4.app.a f22685c;
            public ArrayDeque d;

            /* renamed from: e, reason: collision with root package name */
            public int f22686e;

            public a(ComponentName r3) {
                this.f22684b = false;
                this.d = new ArrayDeque();
                this.f22686e = 0;
                this.f22683a = r3;
            }
        }

        public f(Context r2) {
            this.d = new HashMap();
            this.f22682e = new HashSet();
            this.f22679a = r2;
            HandlerThread r22 = new HandlerThread("NotificationManagerCompat");
            this.f22680b = r22;
            r22.start();
            this.f22681c = new Handler(r22.getLooper(), this);
        }

        public final boolean a(a r4) {
            if (r4.f22684b == false) goto L6;
            return true;
        L6:
            boolean r02 = this.f22679a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(r4.f22683a), this, 33);
            r4.f22684b = r02;
            if (r02 == false) goto L9;
            r4.f22686e = 0;
        L11:
            return r4.f22684b;
        L9:
            Log.w("NotifManCompat", "Unable to bind to listener " + r4.f22683a);
            this.f22679a.unbindService(this);
            goto L11
        }

        public final void b(a r2) {
            if (r2.f22684b == false) goto L5;
            this.f22679a.unbindService(this);
            r2.f22684b = false;
        L5:
            r2.f22685c = null;
        }

        public final void c(g r4) {
            j();
            Iterator r02 = this.d.values().iterator();
        L4:
            if (r02.hasNext() == false) goto L6;
            a r1 = (a) r02.next();
            r1.d.add(r4);
            g(r1);
            goto L4
        }

        public final void d(ComponentName r2) {
            a r22 = (a) this.d.get(r2);
            if (r22 == null) goto L6;
            g(r22);
            return;
        }

        public final void e(ComponentName r2, IBinder r3) {
            a r22 = (a) this.d.get(r2);
            if (r22 == null) goto L6;
            r22.f22685c = a.AbstractBinderC0013a.V(r3);
            r22.f22686e = 0;
            g(r22);
            return;
        }

        public final void f(ComponentName r2) {
            a r22 = (a) this.d.get(r2);
            if (r22 == null) goto L6;
            b(r22);
            return;
        }

        public final void g(a r6) {
            if (Log.isLoggable("NotifManCompat", 3) == false) goto L6;
            Log.d("NotifManCompat", "Processing component " + r6.f22683a + ", " + r6.d.size() + " queued tasks");
        L6:
            if (r6.d.isEmpty() == false) goto L9;
            return;
        L9:
            if (a(r6) == true) goto L11;
        L31:
            i(r6);
            return;
        L11:
            if (r6.f22685c == null) goto L31;
        L13:
            g r2 = (g) r6.d.peek();
            if (r2 == null) goto L28;
            if (Log.isLoggable("NotifManCompat", 3) == false) goto L21;
            Log.d("NotifManCompat", "Sending task " + r2);     // Catch: RemoteException -> L19 DeadObjectException -> L24
        L21:
            r2.a(r6.f22685c);     // Catch: RemoteException -> L19 DeadObjectException -> L24
            r6.d.remove();     // Catch: RemoteException -> L19 DeadObjectException -> L24
            goto L13
        L19:
            e = move-exception;
            Log.w("NotifManCompat", "RemoteException communicating with " + r6.f22683a, e);
        L25:
            if (Log.isLoggable("NotifManCompat", 3) == false) goto L28;
            Log.d("NotifManCompat", "Remote service has died: " + r6.f22683a);
        L28:
            if (r6.d.isEmpty() == true) goto L38;
            i(r6);
            return;
        }

        public void h(g r3) {
            this.f22681c.obtainMessage(0, r3).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message r4) {
            int r02 = r4.what;
            if (r02 == 0) goto L17;
            if (r02 != 1) goto L6;
            e r42 = (e) r4.obj;
            e(r42.f22677a, r42.f22678b);
            return true;
        L6:
            if (r02 != 2) goto L8;
            f((ComponentName) r4.obj);
            return true;
        L8:
            if (r02 == 3) goto L11;
            return false;
        L11:
            d((ComponentName) r4.obj);
            return true;
        L17:
            c((g) r4.obj);
            return true;
        }

        public final void i(a r6) {
            if (this.f22681c.hasMessages(3, r6.f22683a) == false) goto L5;
            return;
        L5:
            int r02 = r6.f22686e;
            int r1 = r02 + 1;
            r6.f22686e = r1;
            if (r1 <= 6) goto L9;
            Log.w("NotifManCompat", "Giving up on delivering " + r6.d.size() + " tasks to " + r6.f22683a + " after " + r6.f22686e + " retries");
            r6.d.clear();
            return;
        L9:
            int r03 = (1 << r02) * 1000;
            if (Log.isLoggable("NotifManCompat", 3) == false) goto L12;
            Log.d("NotifManCompat", "Scheduling retry for " + r03 + " ms");
        L12:
            this.f22681c.sendMessageDelayed(this.f22681c.obtainMessage(3, r6.f22683a), r03);
        }

        public final void j() {
            Set r02 = q.h(this.f22679a);
            if (r02.equals(this.f22682e) == true) goto L33;
            this.f22682e = r02;
            List<ResolveInfo> r1 = this.f22679a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet r2 = new HashSet();
            Iterator<ResolveInfo> r12 = r1.iterator();
        L7:
            if (r12.hasNext() == false) goto L15;
            ResolveInfo r3 = r12.next();
            if (r02.contains(r3.serviceInfo.packageName) == false) goto L7;
            ServiceInfo r6 = r3.serviceInfo;
            ComponentName r5 = new ComponentName(r6.packageName, r6.name);
            if (r3.serviceInfo.permission != null) goto L13;
            r2.add(r5);
            goto L7
        L13:
            Log.w("NotifManCompat", "Permission present on component " + r5 + ", not adding listener record.");
            goto L7
        L15:
            Iterator r03 = r2.iterator();
        L17:
            if (r03.hasNext() == false) goto L24;
            ComponentName r13 = (ComponentName) r03.next();
            if (this.d.containsKey(r13) == true) goto L17;
            if (Log.isLoggable("NotifManCompat", 3) == false) goto L23;
            Log.d("NotifManCompat", "Adding listener record for " + r13);
        L23:
            this.d.put(r13, new a(r13));
            goto L17
        L24:
            Iterator r04 = this.d.entrySet().iterator();
        L26:
            if (r04.hasNext() == false) goto L52;
            Map.Entry r14 = (Map.Entry) r04.next();
            if (r2.contains(r14.getKey()) == true) goto L26;
            if (Log.isLoggable("NotifManCompat", 3) == false) goto L32;
            Log.d("NotifManCompat", "Removing listener record for " + r14.getKey());
        L32:
            b((a) r14.getValue());
            r04.remove();
            goto L26
        L52:
            return;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName r4, IBinder r5) {
            if (Log.isLoggable("NotifManCompat", 3) == false) goto L5;
            Log.d("NotifManCompat", "Connected to service " + r4);
        L5:
            this.f22681c.obtainMessage(1, new e(r4, r5)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName r4) {
            if (Log.isLoggable("NotifManCompat", 3) == false) goto L5;
            Log.d("NotifManCompat", "Disconnected from service " + r4);
        L5:
            this.f22681c.obtainMessage(2, r4).sendToTarget();
        }
    }

    public interface g {
        void a(android.support.v4.app.a r1);
    }

    static {
        f22668c = new Object();
        f22669e = new HashSet();
        f22670f = new Object();
    }

    public q(Context r2) {
        this.f22672a = r2;
        this.f22673b = (NotificationManager) r2.getSystemService("notification");
    }

    public static q e(Context r1) {
        return new q(r1);
    }

    public static Set h(Context r6) {
        String r62 = Settings.Secure.getString(r6.getContentResolver(), "enabled_notification_listeners");
        Object r02 = f22668c;
        monitor-enter(r02);
        if (r62 != null) goto L21;
    L16:
        Set r63 = f22669e;     // Catch: Throwable -> L12
        monitor-exit(r02);     // Catch: Throwable -> L12
        return r63;
    L12:
        th = move-exception;
        throw th;
    L21:
        if (r62.equals(d) == true) goto L16;
        String[] r1 = r62.split(":", -1);     // Catch: Throwable -> L12
        HashSet r2 = new HashSet(r1.length);     // Catch: Throwable -> L12
        int r3 = r1.length;     // Catch: Throwable -> L12
        int r4 = 0;
    L8:
        if (r4 >= r3) goto L15;
        ComponentName r5 = ComponentName.unflattenFromString(r1[r4]);     // Catch: Throwable -> L12
        if (r5 == null) goto L14;
        r2.add(r5.getPackageName());     // Catch: Throwable -> L12
    L14:
        r4 = r4 + 1;     // Catch: Throwable -> L12
        goto L8
    L15:
        f22669e = r2;     // Catch: Throwable -> L12
        d = r62;     // Catch: Throwable -> L12
        goto L16
    }

    public static boolean n(Notification r1) {
        Bundle r12 = NotificationCompat.getExtras(r1);
        if (r12 != null) goto L5;
        return false;
    L5:
        if (r12.getBoolean("android.support.useSideChannel") == false) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean a() {
        return b.a(this.f22673b);
    }

    public void b(int r2) {
        c(null, r2);
    }

    public void c(String r2, int r3) {
        this.f22673b.cancel(r2, r3);
    }

    public void d(NotificationChannel r2) {
        c.a(this.f22673b, r2);
    }

    public List f() {
        return a.a(this.f22673b);
    }

    public int g() {
        return a.b(this.f22673b);
    }

    public NotificationChannel i(String r2) {
        return c.b(this.f22673b, r2);
    }

    public l j(String r2) {
        NotificationChannel r22 = i(r2);
        if (r22 != null) goto L5;
        return null;
    L5:
        return new l(r22);
    }

    public void k(int r2, Notification r3) {
        l(null, r2, r3);
    }

    public void l(String r3, int r4, Notification r5) {
        if (n(r5) == false) goto L6;
        m(new d(this.f22672a.getPackageName(), r4, r3, r5));
        this.f22673b.cancel(r3, r4);
        return;
    L6:
        this.f22673b.notify(r3, r4, r5);
    }

    public final void m(g r4) {
        Object r02 = f22670f;
        monitor-enter(r02);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (f22671g != null) goto L9;
        f22671g = new f(this.f22672a.getApplicationContext());     // Catch: Throwable -> L7
    L9:
        f22671g.h(r4);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
    }
}
