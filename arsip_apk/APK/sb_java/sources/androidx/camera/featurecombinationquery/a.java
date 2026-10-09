package androidx.camera.featurecombinationquery;

import android.hardware.camera2.params.SessionConfiguration;
import androidx.camera.featurecombinationquery.e;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final List f6161a;

    public a(List r1) {
        this.f6161a = r1;
    }

    @Override // androidx.camera.featurecombinationquery.e
    public e.a a(SessionConfiguration r4) {
        Iterator r02 = this.f6161a.iterator();
    L4:
        if (r02.hasNext() == false) goto L9;
        e.a r1 = ((e) r02.next()).a(r4);
        if (r1.a() == 0) goto L4;
        return r1;
    L9:
        return new e.a(0, 0, 0);
    }
}
