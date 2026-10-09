package W;

import X.x;
import android.content.Context;
import com.iab.digitalidentity.sdk.core.model.CheckResult;
import com.iab.digitalidentity.sdk.core.model.CheckResultKt;
import com.iab.digitalidentity.sdk.core.model.GoPayPlusExifDataConstants;
import i0.AbstractC11492p;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1319a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1320b;

    public g(Context r3, c r4) {
        p.l(r3, "context");
        p.l(r4, "signalCheckProvider");
        HashMap r32 = new HashMap();
        this.f1319a = r32;
        this.f1320b = new HashMap();
        AbstractC11492p.a("loadChecks", "SignalManager");
        r4.getClass();
        r4.a();     // Catch: Exception -> L5
    L7:
        r32.putAll(r4.f1316e);
        return;
    L5:
        e = move-exception;
        String r02 = e.toString();
        WeakReference r1 = AbstractC11492p.f174419a;
        AbstractC11492p.a(r02, "SignalCheckProvider");
        goto L7
    }

    public final String a(String[] r12) {
        p.l(r12, "checks");
        AbstractC11492p.a("buildExif", "SignalManager");     // Catch: Throwable -> L10
        StringBuilder r1 = new StringBuilder();     // Catch: Throwable -> L10
        int r2 = r12.length;     // Catch: Throwable -> L10
        int r3 = 1;
        int r4 = 0;
        int r5 = 0;
    L6:
        if (r5 >= r2) goto L19;
        CheckResult r9 = (CheckResult) this.f1320b.get(r12[r5]);     // Catch: Throwable -> L10
        if (r9 != null) goto L12;
        r9 = CheckResultKt.getEmptyCheckResult();     // Catch: Throwable -> L10
    L12:
        p.k(r9, "cacheResult[it] ?: emptyCheckResult");     // Catch: Throwable -> L10
        if (r9.getResultCode() == (-1)) goto L16;
        r1.append(r9.getResultTag());     // Catch: Throwable -> L10
        r1.append(":");     // Catch: Throwable -> L10
        r1.append(r9.getResultCode());     // Catch: Throwable -> L10
        r1.append("|");     // Catch: Throwable -> L10
    L16:
        if (r9.getResultCode() != 0) goto L18;
        r3 = 0;
    L18:
        r5 = r5 + 1;     // Catch: Throwable -> L10
        goto L6
    L19:
        CheckResult r122 = (CheckResult) this.f1320b.get("str");     // Catch: Throwable -> L10
        if (r122 != null) goto L22;
        r122 = CheckResultKt.getEmptyCheckResult();     // Catch: Throwable -> L10
    L22:
        p.k(r122, "cacheResult[SIGNAL_STR] ?: emptyCheckResult");     // Catch: Throwable -> L10
        if (r122.getResultCode() == (-1)) goto L26;
        r1.append(r122.getResultTag());     // Catch: Throwable -> L10
        r1.append(":");     // Catch: Throwable -> L10
        r1.append(r122.getResultCode());     // Catch: Throwable -> L10
        r1.append("|");     // Catch: Throwable -> L10
    L26:
        if (r122.getResultCode() == 0) goto L30;
        r4 = r3;
    L30:
        if (r1.length() <= 0) goto L32;
        r1.append(GoPayPlusExifDataConstants.ImageQuality.KEY_OVERALL_SIGNAL_CHECK);     // Catch: Throwable -> L10
        r1.append(r4);     // Catch: Throwable -> L10
    L32:
        String r123 = r1.toString();     // Catch: Throwable -> L10
        p.k(r123, "exifBuilder.toString()");     // Catch: Throwable -> L10
        return r123;
    L10:
        th = move-exception;
        AbstractC11492p.a("buildExif error: " + th, "SignalManager");
        return "";
    }

    public final void b(String r6) {
        p.l(r6, "check");
        AbstractC11492p.a("runCheck, check: " + r6, "SignalManager");     // Catch: Throwable -> L7
        if (this.f1320b.containsKey(r6) == false) goto L9;
        AbstractC11492p.a("cache exist, skip check", "SignalManager");     // Catch: Throwable -> L7
        return;
    L9:
        x r1 = (x) this.f1319a.get(r6);     // Catch: Throwable -> L7
        if (r1 != null) goto L12;
    L20:
        CheckResult r3 = CheckResultKt.getEmptyCheckResult();     // Catch: Throwable -> L7
    L21:
        this.f1320b.put(r6, r3);     // Catch: Throwable -> L7
        return;
    L12:
        if (r1.f1333b == true) goto L25;
        r3 = CheckResultKt.getEmptyCheckResult();     // Catch: Throwable -> L7
    L19:
        if (r3 != null) goto L21;
    L25:
        int r2 = !r1.a() ? 1 : 0;
    L17:
        r3 = new CheckResult(r2, r1.b(), r1.f1332a);     // Catch: Throwable -> L7
        goto L19
    L15:
        th = move-exception;
        String r22 = th.toString();     // Catch: Throwable -> L7
        p.l(r22, "message");     // Catch: Throwable -> L7
        AbstractC11492p.a(r22, "SignalCheck");     // Catch: Throwable -> L7
        r2 = -1;
    L7:
        th = move-exception;
        AbstractC11492p.a("runCheck error: " + th, "SignalManager");
    }

    public final void c(Set r4) {
        p.l(r4, "excludeChecks");
        AbstractC11492p.a("clearCache", "SignalManager");     // Catch: Exception -> L5
        this.f1320b.keySet().retainAll(r4);     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        AbstractC11492p.a("clearCache error: " + e, "SignalManager");
    }

    public final void d(String[] r7) {
        p.l(r7, "checks");
        long r1 = System.currentTimeMillis();     // Catch: Throwable -> L6
        AbstractC11492p.a("runAllChecks", "SignalManager");     // Catch: Throwable -> L6
        int r3 = r7.length;     // Catch: Throwable -> L6
        int r4 = 0;
    L4:
        if (r4 >= r3) goto L8;
        b(r7[r4]);     // Catch: Throwable -> L6
        r4 = r4 + 1;     // Catch: Throwable -> L6
        goto L4
    L8:
        AbstractC11492p.a("runAllChecks completed in " + (System.currentTimeMillis() - r1) + " ms", "SignalManager");     // Catch: Throwable -> L6
        return;
    L6:
        th = move-exception;
        AbstractC11492p.a("runAllChecks error: " + th, "SignalManager");
        if ((th instanceof SecurityException) == true) goto L13;
        return;
    L13:
        throw th;
    }
}
