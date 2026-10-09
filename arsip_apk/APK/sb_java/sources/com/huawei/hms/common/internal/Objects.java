package com.huawei.hms.common.internal;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class Objects {

    public static final class ToStringHelper {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f39113a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f39114b;

        public /* synthetic */ ToStringHelper(Object r1, a r2) {
            this(r1);
        }

        public final ToStringHelper add(String r4, Object r5) {
            String r42 = (String) Preconditions.checkNotNull(r4);
            String r52 = String.valueOf(r5);
            StringBuilder r02 = new StringBuilder((r42.length() + r52.length()) + 1);
            r02.append(r42);
            r02.append(ContainerUtils.KEY_VALUE_DELIMITER);
            r02.append(r52);
            String r43 = r02.toString();
            this.f39113a.add(r43);
            return this;
        }

        public final String toString() {
            String r02 = this.f39114b.getClass().getSimpleName();
            StringBuilder r1 = new StringBuilder(100);
            r1.append(r02);
            r1.append('{');
            int r03 = this.f39113a.size();
            int r2 = 0;
        L3:
            if (r2 >= r03) goto L8;
            r1.append(this.f39113a.get(r2));
            if (r2 >= (r03 - 1)) goto L7;
            r1.append(", ");
        L7:
            r2 = r2 + 1;
            goto L3
        L8:
            r1.append('}');
            return r1.toString();
        }

        private ToStringHelper(Object r1) {
            this.f39114b = Preconditions.checkNotNull(r1);
            this.f39113a = new ArrayList();
        }
    }

    public static /* synthetic */ class a {
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    public static boolean equal(Object r1, Object r2) {
        if (r1 != r2) goto L5;
        return true;
    L5:
        if (r1 != null) goto L7;
        return false;
    L7:
        if (r1.equals(r2) == false) goto L11;
        return true;
    L11:
        return false;
    }

    public static int hashCode(Object... r02) {
        return Arrays.hashCode(r02);
    }

    public static ToStringHelper toStringHelper(Object r2) {
        return new ToStringHelper(r2, null);
    }
}
