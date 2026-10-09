package okhttp3.internal.platform.android;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/platform/android/DeferredSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "socketAdapterFactory", "<init>", "(Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;)V", "", "isSupported", "()Z", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "a", "(Ljavax/net/ssl/SSLSocket;)Z", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lkotlin/w;", "c", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "b", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", Constants.INAPP_DATA_TAG, "(Ljavax/net/ssl/SSLSocket;)Lokhttp3/internal/platform/android/SocketAdapter;", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "Lokhttp3/internal/platform/android/SocketAdapter;", "delegate", "Factory", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeferredSocketAdapter implements SocketAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final Factory f182172a;

    /* renamed from: b, reason: collision with root package name */
    public SocketAdapter f182173b;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "(Ljavax/net/ssl/SSLSocket;)Z", "Lokhttp3/internal/platform/android/SocketAdapter;", "b", "(Ljavax/net/ssl/SSLSocket;)Lokhttp3/internal/platform/android/SocketAdapter;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Factory {
        boolean a(SSLSocket r1);

        SocketAdapter b(SSLSocket r1);
    }

    public DeferredSocketAdapter(Factory r2) {
        p.l(r2, "socketAdapterFactory");
        this.f182172a = r2;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean a(SSLSocket r2) {
        p.l(r2, "sslSocket");
        return this.f182172a.a(r2);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public String b(SSLSocket r2) {
        p.l(r2, "sslSocket");
        SocketAdapter r02 = d(r2);
        if (r02 != null) goto L5;
        return null;
    L5:
        return r02.b(r2);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void c(SSLSocket r2, String r3, List r4) {
        p.l(r2, "sslSocket");
        p.l(r4, "protocols");
        SocketAdapter r02 = d(r2);
        if (r02 == null) goto L6;
        r02.c(r2, r3, r4);
        return;
    }

    public final synchronized SocketAdapter d(SSLSocket r2) {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (this.f182173b == null) goto L6;
    L10:
        SocketAdapter r22 = this.f182173b;     // Catch: Throwable -> L8
        monitor-exit(this);
        return r22;
    L6:
        if (this.f182172a.a(r2) == false) goto L10;
        this.f182173b = this.f182172a.b(r2);     // Catch: Throwable -> L8
        goto L10
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
        return true;
    }
}
