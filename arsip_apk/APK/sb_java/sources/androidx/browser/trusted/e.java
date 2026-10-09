package androidx.browser.trusted;

import android.app.Notification;
import android.os.Bundle;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class e {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Parcelable[] f3908a;

        public a(Parcelable[] r1) {
            this.f3908a = r1;
        }

        public Bundle a() {
            Bundle r02 = new Bundle();
            r02.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", this.f3908a);
            return r02;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f3909a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3910b;

        public b(String r1, int r2) {
            this.f3909a = r1;
            this.f3910b = r2;
        }

        public static b a(Bundle r3) {
            e.a(r3, "android.support.customtabs.trusted.PLATFORM_TAG");
            e.a(r3, "android.support.customtabs.trusted.PLATFORM_ID");
            return new b(r3.getString("android.support.customtabs.trusted.PLATFORM_TAG"), r3.getInt("android.support.customtabs.trusted.PLATFORM_ID"));
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f3911a;

        public c(String r1) {
            this.f3911a = r1;
        }

        public static c a(Bundle r2) {
            e.a(r2, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new c(r2.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f3912a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3913b;

        /* renamed from: c, reason: collision with root package name */
        public final Notification f3914c;
        public final String d;

        public d(String r1, int r2, Notification r3, String r4) {
            this.f3912a = r1;
            this.f3913b = r2;
            this.f3914c = r3;
            this.d = r4;
        }

        public static d a(Bundle r5) {
            e.a(r5, "android.support.customtabs.trusted.PLATFORM_TAG");
            e.a(r5, "android.support.customtabs.trusted.PLATFORM_ID");
            e.a(r5, "android.support.customtabs.trusted.NOTIFICATION");
            e.a(r5, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new d(r5.getString("android.support.customtabs.trusted.PLATFORM_TAG"), r5.getInt("android.support.customtabs.trusted.PLATFORM_ID"), (Notification) r5.getParcelable("android.support.customtabs.trusted.NOTIFICATION"), r5.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    /* renamed from: androidx.browser.trusted.e$e, reason: collision with other inner class name */
    public static class C0039e {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f3915a;

        public C0039e(boolean r1) {
            this.f3915a = r1;
        }

        public Bundle a() {
            Bundle r02 = new Bundle();
            r02.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", this.f3915a);
            return r02;
        }
    }

    public static void a(Bundle r2, String r3) {
        if (r2.containsKey(r3) == false) goto L6;
        return;
    L6:
        throw new IllegalArgumentException("Bundle must contain " + r3);
    }
}
