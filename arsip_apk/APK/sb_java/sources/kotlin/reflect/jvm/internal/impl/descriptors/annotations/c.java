package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC11788d;
import kotlin.reflect.jvm.internal.impl.descriptors.S;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.B;

/* loaded from: classes3.dex */
public interface c {

    public static final class a {
        public static kotlin.reflect.jvm.internal.impl.name.c a(c r2) {
            InterfaceC11788d r22 = DescriptorUtilsKt.i(r2);
            if (r22 != null) goto L5;
        L11:
            return null;
        L5:
            if (kotlin.reflect.jvm.internal.impl.types.error.h.m(r22) == false) goto L8;
            r22 = null;
        L8:
            if (r22 == null) goto L11;
            return DescriptorUtilsKt.h(r22);
        }
    }

    Map a();

    kotlin.reflect.jvm.internal.impl.name.c d();

    S getSource();

    B getType();
}
