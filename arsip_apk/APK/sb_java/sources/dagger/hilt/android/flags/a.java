package dagger.hilt.android.flags;

import android.content.Context;
import dagger.hilt.android.b;
import dagger.hilt.internal.d;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: dagger.hilt.android.flags.a$a, reason: collision with other inner class name */
    public interface InterfaceC1830a {
        Set t();
    }

    public static boolean a(Context r4) {
        Set r42 = ((InterfaceC1830a) b.a(r4, InterfaceC1830a.class)).t();
        if (r42.size() > 1) goto L5;
        boolean r02 = true;
    L6:
        d.d(r02, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (r42.isEmpty() == false) goto L10;
        return true;
    L10:
        return ((Boolean) r42.iterator().next()).booleanValue();
    L5:
        r02 = false;
        goto L6
    }
}
