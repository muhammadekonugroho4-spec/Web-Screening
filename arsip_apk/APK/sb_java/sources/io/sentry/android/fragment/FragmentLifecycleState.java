package io.sentry.android.fragment;

import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lio/sentry/android/fragment/FragmentLifecycleState;", "", "", "breadcrumbName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getBreadcrumbName$sentry_android_fragment_release", "()Ljava/lang/String;", "Companion", "a", "ATTACHED", "SAVE_INSTANCE_STATE", DebugCoroutineInfoImplKt.CREATED, "VIEW_CREATED", "STARTED", "RESUMED", "PAUSED", "STOPPED", "VIEW_DESTROYED", "DESTROYED", "DETACHED", "sentry-android-fragment_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum FragmentLifecycleState extends Enum<FragmentLifecycleState> {
    private static final /* synthetic */ FragmentLifecycleState[] $VALUES = null;
    public static final FragmentLifecycleState ATTACHED = null;
    public static final FragmentLifecycleState CREATED = null;
    public static final a Companion = null;
    public static final FragmentLifecycleState DESTROYED = null;
    public static final FragmentLifecycleState DETACHED = null;
    public static final FragmentLifecycleState PAUSED = null;
    public static final FragmentLifecycleState RESUMED = null;
    public static final FragmentLifecycleState SAVE_INSTANCE_STATE = null;
    public static final FragmentLifecycleState STARTED = null;
    public static final FragmentLifecycleState STOPPED = null;
    public static final FragmentLifecycleState VIEW_CREATED = null;
    public static final FragmentLifecycleState VIEW_DESTROYED = null;
    private static final Set<FragmentLifecycleState> states = null;
    private final String breadcrumbName;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final Set a() {
            return FragmentLifecycleState.access$getStates$cp();
        }

        public a() {
        }
    }

    private static final /* synthetic */ FragmentLifecycleState[] $values() {
        return new FragmentLifecycleState[]{ATTACHED, SAVE_INSTANCE_STATE, CREATED, VIEW_CREATED, STARTED, RESUMED, PAUSED, STOPPED, VIEW_DESTROYED, DESTROYED, DETACHED};
    }

    static {
        FragmentLifecycleState r02 = new FragmentLifecycleState("ATTACHED", 0, "attached");
        ATTACHED = r02;
        FragmentLifecycleState r1 = new FragmentLifecycleState("SAVE_INSTANCE_STATE", 1, "save instance state");
        SAVE_INSTANCE_STATE = r1;
        FragmentLifecycleState r2 = new FragmentLifecycleState(DebugCoroutineInfoImplKt.CREATED, 2, "created");
        CREATED = r2;
        FragmentLifecycleState r3 = new FragmentLifecycleState("VIEW_CREATED", 3, "view created");
        VIEW_CREATED = r3;
        FragmentLifecycleState r4 = new FragmentLifecycleState("STARTED", 4, "started");
        STARTED = r4;
        FragmentLifecycleState r5 = new FragmentLifecycleState("RESUMED", 5, "resumed");
        RESUMED = r5;
        FragmentLifecycleState r6 = new FragmentLifecycleState("PAUSED", 6, "paused");
        PAUSED = r6;
        FragmentLifecycleState r7 = new FragmentLifecycleState("STOPPED", 7, "stopped");
        STOPPED = r7;
        FragmentLifecycleState r8 = new FragmentLifecycleState("VIEW_DESTROYED", 8, "view destroyed");
        VIEW_DESTROYED = r8;
        FragmentLifecycleState r9 = new FragmentLifecycleState("DESTROYED", 9, "destroyed");
        DESTROYED = r9;
        FragmentLifecycleState r10 = new FragmentLifecycleState("DETACHED", 10, "detached");
        DETACHED = r10;
        $VALUES = $values();
        Companion = new a(null);
        HashSet r11 = new HashSet();
        r11.add(r02);
        r11.add(r1);
        r11.add(r2);
        r11.add(r3);
        r11.add(r4);
        r11.add(r5);
        r11.add(r6);
        r11.add(r7);
        r11.add(r8);
        r11.add(r9);
        r11.add(r10);
        states = r11;
    }

    FragmentLifecycleState(String r1, int r2, String r3) {
        this.breadcrumbName = r3;
    }

    public static final /* synthetic */ Set access$getStates$cp() {
        return states;
    }

    public static FragmentLifecycleState valueOf(String r1) {
        return (FragmentLifecycleState) Enum.valueOf(FragmentLifecycleState.class, r1);
    }

    public static FragmentLifecycleState[] values() {
        return (FragmentLifecycleState[]) $VALUES.clone();
    }

    public final String getBreadcrumbName$sentry_android_fragment_release() {
        return this.breadcrumbName;
    }
}
