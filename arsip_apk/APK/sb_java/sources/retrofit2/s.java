package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* loaded from: classes3.dex */
public class s {

    public static final class a extends s {
        public a() {
        }

        @Override // retrofit2.s
        public Object b(Method r1, Class r2, Object r3, Object[] r4) {
            return l.a(r1, r2, r3, r4);
        }

        @Override // retrofit2.s
        public boolean c(Method r1) {
            return r1.isDefault();
        }
    }

    public static class b extends s {
        public b() {
        }

        @Override // retrofit2.s
        public String a(Method r3, int r4) {
            Parameter r02 = r3.getParameters()[r4];
            if (r02.isNamePresent() == false) goto L7;
            return "parameter '" + r02.getName() + '\'';
        L7:
            return super.a(r3, r4);
        }

        @Override // retrofit2.s
        public Object b(Method r1, Class r2, Object r3, Object[] r4) {
            return l.a(r1, r2, r3, r4);
        }

        @Override // retrofit2.s
        public boolean c(Method r1) {
            return r1.isDefault();
        }
    }

    public s() {
    }

    public String a(Method r2, int r3) {
        return "parameter #" + (r3 + 1);
    }

    public Object b(Method r1, Class r2, Object r3, Object[] r4) {
        throw new AssertionError();
    }

    public boolean c(Method r1) {
        return false;
    }
}
