package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlinx.coroutines.internal.SystemPropsKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001e\u0010\u0006\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0081\b¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\n\"\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\n\"\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\n\"\u0014\u0010\u000e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\n\"\u001a\u0010\u000f\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0013\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012\" \u0010\u0015\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0016\u0010\u0012\"\u001a\u0010\u0019\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lkotlin/w;", "resetCoroutineId", "()V", "Lkotlin/Function0;", "", "value", "assert", "(Lkotlin/jvm/functions/a;)V", "", "DEBUG_PROPERTY_NAME", "Ljava/lang/String;", "STACKTRACE_RECOVERY_PROPERTY_NAME", "DEBUG_PROPERTY_VALUE_AUTO", "DEBUG_PROPERTY_VALUE_ON", "DEBUG_PROPERTY_VALUE_OFF", "ASSERTIONS_ENABLED", "Z", "getASSERTIONS_ENABLED", "()Z", "DEBUG", "getDEBUG", "RECOVER_STACK_TRACES", "getRECOVER_STACK_TRACES", "getRECOVER_STACK_TRACES$annotations", "Ljava/util/concurrent/atomic/AtomicLong;", "COROUTINE_ID", "Ljava/util/concurrent/atomic/AtomicLong;", "getCOROUTINE_ID", "()Ljava/util/concurrent/atomic/AtomicLong;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugKt {
    private static final boolean ASSERTIONS_ENABLED = false;
    private static final AtomicLong COROUTINE_ID = null;
    private static final boolean DEBUG = false;
    public static final String DEBUG_PROPERTY_NAME = "kotlinx.coroutines.debug";
    public static final String DEBUG_PROPERTY_VALUE_AUTO = "auto";
    public static final String DEBUG_PROPERTY_VALUE_OFF = "off";
    public static final String DEBUG_PROPERTY_VALUE_ON = "on";
    private static final boolean RECOVER_STACK_TRACES = false;
    public static final String STACKTRACE_RECOVERY_PROPERTY_NAME = "kotlinx.coroutines.stacktrace.recovery";

    static {
        String r02 = SystemPropsKt.systemProp(DEBUG_PROPERTY_NAME);
        boolean r1 = true;
        if (r02 == null) goto L17;
        int r3 = r02.hashCode();
        if (r3 == 0) goto L22;
        if (r3 == 3551) goto L19;
        if (r3 == 109935) goto L16;
        if (r3 != 3005871) goto L25;
        if (r02.equals(DEBUG_PROPERTY_VALUE_AUTO) == true) goto L17;
    L25:
        throw new IllegalStateException(("System property 'kotlinx.coroutines.debug' has unrecognized value '" + r02 + '\'').toString());
    L16:
        if (r02.equals(DEBUG_PROPERTY_VALUE_OFF) == false) goto L25;
    L19:
        if (r02.equals(DEBUG_PROPERTY_VALUE_ON) == false) goto L25;
    L23:
        boolean r03 = true;
    L26:
        DEBUG = r03;
        if (r03 == true) goto L29;
    L31:
        r1 = false;
    L32:
        RECOVER_STACK_TRACES = r1;
        COROUTINE_ID = new AtomicLong(0);
        return;
    L29:
        if (SystemPropsKt.systemProp(STACKTRACE_RECOVERY_PROPERTY_NAME, true) == false) goto L31;
    L22:
        if (r02.equals("") == false) goto L25;
    L17:
        r03 = false;
        goto L26
    }

    /* renamed from: assert, reason: not valid java name */
    private static final void m802assert(kotlin.jvm.functions.a r02) {
    }

    public static final boolean getASSERTIONS_ENABLED() {
        return ASSERTIONS_ENABLED;
    }

    public static final AtomicLong getCOROUTINE_ID() {
        return COROUTINE_ID;
    }

    public static final boolean getDEBUG() {
        return DEBUG;
    }

    public static final boolean getRECOVER_STACK_TRACES() {
        return RECOVER_STACK_TRACES;
    }

    public static /* synthetic */ void getRECOVER_STACK_TRACES$annotations() {
    }

    public static final void resetCoroutineId() {
        COROUTINE_ID.set(0);
    }
}
