package androidx.media;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class b {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f25896a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f25897b;
    }

    /* renamed from: androidx.media.b$b, reason: collision with other inner class name */
    public static class C0214b extends MediaBrowserService {

        /* renamed from: a, reason: collision with root package name */
        public final d f25898a;

        public C0214b(Context r1, d r2) {
            attachBaseContext(r1);
            this.f25898a = r2;
        }

        @Override // android.service.media.MediaBrowserService
        public MediaBrowserService.BrowserRoot onGetRoot(String r4, int r5, Bundle r6) {
            MediaSessionCompat.a(r6);
            d r02 = this.f25898a;
            if (r6 != null) goto L5;
            Bundle r2 = null;
        L6:
            r02.b(r4, r5, r2);
            return null;
        L5:
            r2 = new Bundle(r6);
            goto L6
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String r3, MediaBrowserService.Result r4) {
            this.f25898a.c(r3, new c(r4));
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public MediaBrowserService.Result f25899a;

        public c(MediaBrowserService.Result r1) {
            this.f25899a = r1;
        }

        public List a(List r4) {
            if (r4 != null) goto L5;
            return null;
        L5:
            ArrayList r02 = new ArrayList();
            Iterator r42 = r4.iterator();
        L7:
            if (r42.hasNext() == false) goto L9;
            Parcel r1 = (Parcel) r42.next();
            r1.setDataPosition(0);
            r02.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(r1));
            r1.recycle();
            goto L7
        L9:
            return r02;
        }

        public void b(Object r3) {
            if ((r3 instanceof List) == false) goto L7;
            this.f25899a.sendResult(a((List) r3));
            return;
        L7:
            if ((r3 instanceof Parcel) == false) goto L10;
            Parcel r32 = (Parcel) r3;
            r32.setDataPosition(0);
            this.f25899a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(r32));
            r32.recycle();
            return;
        L10:
            this.f25899a.sendResult(null);
        }
    }

    public interface d {
        a b(String r1, int r2, Bundle r3);

        void c(String r1, c r2);
    }

    public static IBinder a(Object r02, Intent r1) {
        return ((MediaBrowserService) r02).onBind(r1);
    }

    public static void b(Object r02) {
        ((MediaBrowserService) r02).onCreate();
    }
}
