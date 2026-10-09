package androidx.lifecycle;

import com.clevertap.android.sdk.Constants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f25702a;

    public i0() {
        this.f25702a = new LinkedHashMap();
    }

    public final void a() {
        Iterator r02 = this.f25702a.values().iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((e0) r02.next()).e3();
        goto L4
    L6:
        this.f25702a.clear();
    }

    public final e0 b(String r2) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_KEY);
        return (e0) this.f25702a.get(r2);
    }

    public final Set c() {
        return new HashSet(this.f25702a.keySet());
    }

    public final void d(String r2, e0 r3) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_KEY);
        kotlin.jvm.internal.p.l(r3, "viewModel");
        e0 r22 = (e0) this.f25702a.put(r2, r3);
        if (r22 == null) goto L6;
        r22.e3();
        return;
    }
}
