package app.rive.runtime.kotlin.core;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lapp/rive/runtime/kotlin/core/Loop;", "", "(Ljava/lang/String;I)V", "ONESHOT", "LOOP", "PINGPONG", "AUTO", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum Loop extends Enum<Loop> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ Loop[] $VALUES = null;
    public static final Loop AUTO = null;
    public static final Companion Companion = null;
    public static final Loop LOOP = null;
    public static final Loop ONESHOT = null;
    public static final Loop PINGPONG = null;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/runtime/kotlin/core/Loop$Companion;", "", "()V", "fromIndex", "Lapp/rive/runtime/kotlin/core/Loop;", FirebaseAnalytics.Param.INDEX, "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(i r1) {
            this();
        }

        public final Loop fromIndex(int r5) {
            int r02 = Loop.getEntries().size();
            if (r5 < 0) goto L8;
            if (r5 > r02) goto L8;
            return (Loop) Loop.getEntries().get(r5);
        L8:
            throw new IndexOutOfBoundsException("Invalid Loop index value " + r5 + ". It must be between 0 and " + r02);
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ Loop[] $values() {
        return new Loop[]{ONESHOT, LOOP, PINGPONG, AUTO};
    }

    static {
        ONESHOT = new Loop("ONESHOT", 0);
        LOOP = new Loop("LOOP", 1);
        PINGPONG = new Loop("PINGPONG", 2);
        AUTO = new Loop("AUTO", 3);
        Loop[] r02 = $values();
        $VALUES = r02;
        $ENTRIES = b.a(r02);
        Companion = new Companion(null);
    }

    Loop(String r1, int r2) {
    }

    public static kotlin.enums.a getEntries() {
        return $ENTRIES;
    }

    public static Loop valueOf(String r1) {
        return (Loop) Enum.valueOf(Loop.class, r1);
    }

    public static Loop[] values() {
        return (Loop[]) $VALUES.clone();
    }
}
