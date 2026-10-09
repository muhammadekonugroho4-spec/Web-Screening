package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f22641a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f22642b;

    /* renamed from: c, reason: collision with root package name */
    public int f22643c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f22644e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22645f;

    /* renamed from: g, reason: collision with root package name */
    public Uri f22646g;

    /* renamed from: h, reason: collision with root package name */
    public AudioAttributes f22647h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22648i;

    /* renamed from: j, reason: collision with root package name */
    public int f22649j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f22650k;

    /* renamed from: l, reason: collision with root package name */
    public long[] f22651l;

    /* renamed from: m, reason: collision with root package name */
    public String f22652m;

    /* renamed from: n, reason: collision with root package name */
    public String f22653n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f22654o;

    /* renamed from: p, reason: collision with root package name */
    public int f22655p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f22656q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f22657r;

    public static class a {
        public static boolean a(NotificationChannel r02) {
            return r02.canBypassDnd();
        }

        public static boolean b(NotificationChannel r02) {
            return r02.canShowBadge();
        }

        public static AudioAttributes c(NotificationChannel r02) {
            return r02.getAudioAttributes();
        }

        public static String d(NotificationChannel r02) {
            return r02.getDescription();
        }

        public static String e(NotificationChannel r02) {
            return r02.getGroup();
        }

        public static String f(NotificationChannel r02) {
            return r02.getId();
        }

        public static int g(NotificationChannel r02) {
            return r02.getImportance();
        }

        public static int h(NotificationChannel r02) {
            return r02.getLightColor();
        }

        public static int i(NotificationChannel r02) {
            return r02.getLockscreenVisibility();
        }

        public static CharSequence j(NotificationChannel r02) {
            return r02.getName();
        }

        public static Uri k(NotificationChannel r02) {
            return r02.getSound();
        }

        public static long[] l(NotificationChannel r02) {
            return r02.getVibrationPattern();
        }

        public static boolean m(NotificationChannel r02) {
            return r02.shouldShowLights();
        }

        public static boolean n(NotificationChannel r02) {
            return r02.shouldVibrate();
        }
    }

    public static class b {
        public static boolean a(NotificationChannel r02) {
            return r02.canBubble();
        }
    }

    public static class c {
        public static String a(NotificationChannel r02) {
            return r02.getConversationId();
        }

        public static String b(NotificationChannel r02) {
            return r02.getParentChannelId();
        }

        public static boolean c(NotificationChannel r02) {
            return r02.isImportantConversation();
        }
    }

    public l(String r2, int r3) {
        this.f22645f = true;
        this.f22646g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f22649j = 0;
        this.f22641a = (String) androidx.core.util.h.g(r2);
        this.f22643c = r3;
        this.f22647h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public int a() {
        return this.f22643c;
    }

    public l(NotificationChannel r4) {
        this(a.f(r4), a.g(r4));
        this.f22642b = a.j(r4);
        this.d = a.d(r4);
        this.f22644e = a.e(r4);
        this.f22645f = a.b(r4);
        this.f22646g = a.k(r4);
        this.f22647h = a.c(r4);
        this.f22648i = a.m(r4);
        this.f22649j = a.h(r4);
        this.f22650k = a.n(r4);
        this.f22651l = a.l(r4);
        int r02 = Build.VERSION.SDK_INT;
        if (r02 < 30) goto L5;
        this.f22652m = c.b(r4);
        this.f22653n = c.a(r4);
    L5:
        this.f22654o = a.a(r4);
        this.f22655p = a.i(r4);
        if (r02 < 29) goto L8;
        this.f22656q = b.a(r4);
    L8:
        if (r02 < 30) goto L11;
        this.f22657r = c.c(r4);
        return;
    }
}
