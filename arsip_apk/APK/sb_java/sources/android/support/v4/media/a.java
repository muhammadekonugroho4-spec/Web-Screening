package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: android.support.v4.media.a$a, reason: collision with other inner class name */
    public interface InterfaceC0016a {
        void b();

        void c();

        void onConnected();
    }

    public static class b extends MediaBrowser.ConnectionCallback {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC0016a f2040a;

        public b(InterfaceC0016a r1) {
            this.f2040a = r1;
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnected() {
            this.f2040a.onConnected();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionFailed() {
            this.f2040a.c();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionSuspended() {
            this.f2040a.b();
        }
    }

    public static void a(Object r02) {
        ((MediaBrowser) r02).connect();
    }

    public static Object b(Context r1, ComponentName r2, Object r3, Bundle r4) {
        return new MediaBrowser(r1, r2, (MediaBrowser.ConnectionCallback) r3, r4);
    }

    public static Object c(InterfaceC0016a r1) {
        return new b(r1);
    }

    public static void d(Object r02) {
        ((MediaBrowser) r02).disconnect();
    }

    public static Bundle e(Object r02) {
        return ((MediaBrowser) r02).getExtras();
    }

    public static Object f(Object r02) {
        return ((MediaBrowser) r02).getSessionToken();
    }
}
