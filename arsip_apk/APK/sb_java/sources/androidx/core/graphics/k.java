package androidx.core.graphics;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class k extends j {
    public k() {
    }

    @Override // androidx.core.graphics.j
    public Typeface i(Object r5) {
        Object r02 = Array.newInstance(this.f22893g, 1);     // Catch: Throwable -> L4 IllegalAccessException -> L6
        Array.set(r02, 0, r5);     // Catch: Throwable -> L4 IllegalAccessException -> L6
        return (Typeface) this.f22899m.invoke(null, new Object[]{r02, "sans-serif", -1, -1});
    L4:
        e = move-exception;
        throw new RuntimeException(e);
    }

    @Override // androidx.core.graphics.j
    public Method t(Class r4) {
        Class<?> r42 = Array.newInstance(r4, 1).getClass();
        Class r2 = Integer.TYPE;
        Method r43 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{r42, String.class, r2, r2});
        r43.setAccessible(true);
        return r43;
    }
}
