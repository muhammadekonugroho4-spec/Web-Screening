package kotlin.reflect.jvm.internal.impl.util;

import com.google.firebase.messaging.Constants;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC11804k;

/* loaded from: classes3.dex */
public interface k {

    public static final class a implements k {

        /* renamed from: a, reason: collision with root package name */
        public static final a f180175a = null;

        static {
            f180175a = new a();
        }

        public a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.k
        public boolean a(InterfaceC11804k r2, InterfaceC11804k r3) {
            kotlin.jvm.internal.p.l(r2, "what");
            kotlin.jvm.internal.p.l(r3, Constants.MessagePayloadKeys.FROM);
            return true;
        }
    }

    boolean a(InterfaceC11804k r1, InterfaceC11804k r2);
}
