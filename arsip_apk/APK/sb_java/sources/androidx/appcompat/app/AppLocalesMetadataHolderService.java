package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class AppLocalesMetadataHolderService extends Service {

    public static class a {
        public static int a() {
            return 512;
        }
    }

    public AppLocalesMetadataHolderService() {
    }

    public static ServiceInfo a(Context r4) {
        int r02 = a.a() | 128;
        return r4.getPackageManager().getServiceInfo(new ComponentName(r4, AppLocalesMetadataHolderService.class), r02);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent r1) {
        throw new UnsupportedOperationException();
    }
}
