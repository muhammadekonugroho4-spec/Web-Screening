package androidx.credentials.playservices;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u00060\tR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderMetadataHolder;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "Landroidx/credentials/playservices/CredentialProviderMetadataHolder$a;", "a", "Landroidx/credentials/playservices/CredentialProviderMetadataHolder$a;", "binder", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CredentialProviderMetadataHolder extends Service {

    /* renamed from: a, reason: collision with root package name */
    public final a f23482a;

    public final class a extends Binder {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CredentialProviderMetadataHolder f23483a;

        public a(CredentialProviderMetadataHolder r1) {
            this.f23483a = r1;
        }
    }

    public CredentialProviderMetadataHolder() {
        this.f23482a = new a(this);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent r2) {
        p.l(r2, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        return this.f23482a;
    }
}
