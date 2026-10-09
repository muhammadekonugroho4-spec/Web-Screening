package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.InterfaceC4142l;
import com.clevertap.android.sdk.Constants;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\n\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "a", "I", "c", "()I", Constants.INAPP_DATA_TAG, "(I)V", "maxClientId", "", "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "clientNames", "Landroid/os/RemoteCallbackList;", "Landroidx/room/k;", "Landroid/os/RemoteCallbackList;", "()Landroid/os/RemoteCallbackList;", "callbackList", "Landroidx/room/l$a;", "Landroidx/room/l$a;", "binder", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f27690a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f27691b;

    /* renamed from: c, reason: collision with root package name */
    public final RemoteCallbackList f27692c;
    public final InterfaceC4142l.a d;

    public static final class a extends InterfaceC4142l.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MultiInstanceInvalidationService f27693a;

        public a(MultiInstanceInvalidationService r1) {
            this.f27693a = r1;
        }

        @Override // androidx.room.InterfaceC4142l
        public void B(int r9, String[] r10) {
            kotlin.jvm.internal.p.l(r10, "tables");
            RemoteCallbackList r02 = this.f27693a.a();
            MultiInstanceInvalidationService r1 = this.f27693a;
            monitor-enter(r02);
            String r2 = (String) r1.b().get(Integer.valueOf(r9));     // Catch: Throwable -> L9
            if (r2 != null) goto L11;
            Log.w("ROOM", "Remote invalidation client ID not registered");     // Catch: Throwable -> L9
            monitor-exit(r02);
            return;
        L11:
            int r3 = r1.a().beginBroadcast();     // Catch: Throwable -> L9
            int r4 = 0;
        L13:
            if (r4 >= r3) goto L28;
            Object r5 = r1.a().getBroadcastCookie(r4);     // Catch: Throwable -> L21
            kotlin.jvm.internal.p.j(r5, "null cannot be cast to non-null type kotlin.Int");     // Catch: Throwable -> L21
            Integer r52 = (Integer) r5;     // Catch: Throwable -> L21
            int r6 = r52.intValue();     // Catch: Throwable -> L21
            String r53 = (String) r1.b().get(r52);     // Catch: Throwable -> L21
            if (r9 == r6) goto L25;
            if (kotlin.jvm.internal.p.g(r2, r53) == false) goto L25;
            ((InterfaceC4141k) r1.a().getBroadcastItem(r4)).b(r10);     // Catch: Throwable -> L21 RemoteException -> L23
            kotlin.w r54 = kotlin.w.f180450a;     // Catch: Throwable -> L21 RemoteException -> L23
        L23:
            e = move-exception;
            Log.w("ROOM", "Error invoking a remote callback", e);     // Catch: Throwable -> L21
        L25:
            r4 = r4 + 1;
            goto L13
        L21:
            th = move-exception;
            r1.a().finishBroadcast();     // Catch: Throwable -> L9
            throw th;     // Catch: Throwable -> L9
        L28:
            r1.a().finishBroadcast();     // Catch: Throwable -> L9
            kotlin.w r92 = kotlin.w.f180450a;     // Catch: Throwable -> L9
            monitor-exit(r02);
            return;
        L9:
            th = move-exception;
            throw th;
        }

        @Override // androidx.room.InterfaceC4142l
        public int F(InterfaceC4141k r7, String r8) {
            kotlin.jvm.internal.p.l(r7, "callback");
            int r02 = 0;
            if (r8 != null) goto L5;
            return 0;
        L5:
            RemoteCallbackList r1 = this.f27693a.a();
            MultiInstanceInvalidationService r2 = this.f27693a;
            monitor-enter(r1);
            r2.d(r2.c() + 1);     // Catch: Throwable -> L10
            int r3 = r2.c();     // Catch: Throwable -> L10
            if (r2.a().register(r7, Integer.valueOf(r3)) == false) goto L12;
            r2.b().put(Integer.valueOf(r3), r8);     // Catch: Throwable -> L10
            r02 = r3;
        L13:
            monitor-exit(r1);
            return r02;
        L12:
            r2.d(r2.c() - 1);     // Catch: Throwable -> L10
            r2.c();     // Catch: Throwable -> L10
        L10:
            th = move-exception;
            throw th;
        }

        @Override // androidx.room.InterfaceC4142l
        public void T(InterfaceC4141k r4, int r5) {
            kotlin.jvm.internal.p.l(r4, "callback");
            RemoteCallbackList r02 = this.f27693a.a();
            MultiInstanceInvalidationService r1 = this.f27693a;
            monitor-enter(r02);
            r1.a().unregister(r4);     // Catch: Throwable -> L7
            String r42 = (String) r1.b().remove(Integer.valueOf(r5));     // Catch: Throwable -> L7
            monitor-exit(r02);
            return;
        L7:
            th = move-exception;
            throw th;
        }
    }

    public static final class b extends RemoteCallbackList {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MultiInstanceInvalidationService f27694a;

        public b(MultiInstanceInvalidationService r1) {
            this.f27694a = r1;
        }

        public void a(InterfaceC4141k r2, Object r3) {
            kotlin.jvm.internal.p.l(r2, "callback");
            kotlin.jvm.internal.p.l(r3, "cookie");
            this.f27694a.b().remove((Integer) r3);
        }

        @Override // android.os.RemoteCallbackList
        public /* bridge */ /* synthetic */ void onCallbackDied(IInterface r1, Object r2) {
            a((InterfaceC4141k) r1, r2);
        }
    }

    public MultiInstanceInvalidationService() {
        this.f27691b = new LinkedHashMap();
        this.f27692c = new b(this);
        this.d = new a(this);
    }

    public final RemoteCallbackList a() {
        return this.f27692c;
    }

    public final Map b() {
        return this.f27691b;
    }

    public final int c() {
        return this.f27690a;
    }

    public final void d(int r1) {
        this.f27690a = r1;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent r2) {
        kotlin.jvm.internal.p.l(r2, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        return this.d;
    }
}
