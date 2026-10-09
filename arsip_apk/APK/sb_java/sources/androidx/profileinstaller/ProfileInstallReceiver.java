package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.g;

/* loaded from: classes4.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    public class a implements g.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ProfileInstallReceiver f27114a;

        public a(ProfileInstallReceiver r1) {
            this.f27114a = r1;
        }

        @Override // androidx.profileinstaller.g.c
        public void a(int r2, Object r3) {
            g.f27140b.a(r2, r3);
            this.f27114a.setResultCode(r2);
        }

        @Override // androidx.profileinstaller.g.c
        public void b(int r2, Object r3) {
            g.f27140b.b(r2, r3);
        }
    }

    public ProfileInstallReceiver() {
    }

    public static void a(g.c r2) {
        Process.sendSignal(Process.myPid(), 10);
        r2.a(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context r3, Intent r4) {
        if (r4 == null) goto L38;
        String r02 = r4.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(r02) == false) goto L9;
        g.j(r3, new androidx.privacysandbox.ads.adservices.measurement.m(), new a(this), true);
        return;
    L9:
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(r02) == false) goto L21;
        Bundle r42 = r4.getExtras();
        if (r42 == null) goto L34;
        String r43 = r42.getString("EXTRA_SKIP_FILE_OPERATION");
        if ("WRITE_SKIP_FILE".equals(r43) == false) goto L17;
        g.k(r3, new androidx.privacysandbox.ads.adservices.measurement.m(), new a(this));
        return;
    L17:
        if ("DELETE_SKIP_FILE".equals(r43) == false) goto L35;
        g.c(r3, new androidx.privacysandbox.ads.adservices.measurement.m(), new a(this));
        return;
    L35:
        return;
    L34:
        return;
    L21:
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(r02) == false) goto L25;
        a(new a(this));
        return;
    L25:
        if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(r02) == false) goto L36;
        Bundle r44 = r4.getExtras();
        if (r44 == null) goto L37;
        String r45 = r44.getString("EXTRA_BENCHMARK_OPERATION");
        a r03 = new a(this);
        if ("DROP_SHADER_CACHE".equals(r45) == false) goto L32;
        androidx.profileinstaller.a.b(r3, r03);
        return;
    L32:
        r03.a(16, null);
        return;
    L37:
        return;
    L36:
        return;
    }
}
