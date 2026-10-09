package retrofit2;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static Constructor f183469a;

    public static Object a(Method r2, Class r3, Object r4, Object[] r5) {
        Constructor r02 = f183469a;
        if (r02 != null) goto L6;
        r02 = MethodHandles.Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
        r02.setAccessible(true);
        f183469a = r02;
    L6:
        return ((MethodHandles.Lookup) r02.newInstance(new Object[]{r3, -1})).unreflectSpecial(r2, r3).bindTo(r4).invokeWithArguments(r5);
    }
}
