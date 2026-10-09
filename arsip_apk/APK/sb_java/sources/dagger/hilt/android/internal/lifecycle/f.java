package dagger.hilt.android.internal.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class f implements dagger.hilt.android.a, dagger.hilt.android.c {

    /* renamed from: a, reason: collision with root package name */
    public final Set f173951a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f173952b;

    public f() {
        this.f173951a = new HashSet();
        this.f173952b = false;
    }

    public void a() {
        dagger.hilt.android.internal.b.a();
        this.f173952b = true;
        Iterator r02 = this.f173951a.iterator();
        if (r02.hasNext() == true) goto L5;
        return;
    L5:
        a.a.a.a.c.f.a(r02.next());
        throw null;
    }
}
