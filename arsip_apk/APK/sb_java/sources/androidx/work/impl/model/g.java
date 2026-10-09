package androidx.work.impl.model;

import com.clevertap.android.sdk.Constants;
import java.util.List;

/* loaded from: classes4.dex */
public interface g {
    SystemIdInfo a(String r1, int r2);

    default void b(j r2) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        f(r2.b(), r2.a());
    }

    void c(SystemIdInfo r1);

    default SystemIdInfo d(j r2) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        return a(r2.b(), r2.a());
    }

    List e();

    void f(String r1, int r2);

    void g(String r1);
}
