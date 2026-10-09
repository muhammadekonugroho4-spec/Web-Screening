package app.rive.runtime.kotlin.core;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lapp/rive/runtime/kotlin/core/Fit;", "", "(Ljava/lang/String;I)V", "FILL", "CONTAIN", "COVER", "FIT_WIDTH", "FIT_HEIGHT", "NONE", "SCALE_DOWN", "LAYOUT", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum Fit extends Enum<Fit> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ Fit[] $VALUES = null;
    public static final Fit CONTAIN = null;
    public static final Fit COVER = null;
    public static final Companion Companion = null;
    public static final Fit FILL = null;
    public static final Fit FIT_HEIGHT = null;
    public static final Fit FIT_WIDTH = null;
    public static final Fit LAYOUT = null;
    public static final Fit NONE = null;
    public static final Fit SCALE_DOWN = null;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/runtime/kotlin/core/Fit$Companion;", "", "()V", "fromIndex", "Lapp/rive/runtime/kotlin/core/Fit;", FirebaseAnalytics.Param.INDEX, "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(i r1) {
            this();
        }

        public final Fit fromIndex(int r5) {
            int r02 = Fit.getEntries().size();
            if (r5 < 0) goto L8;
            if (r5 > r02) goto L8;
            return (Fit) Fit.getEntries().get(r5);
        L8:
            throw new IndexOutOfBoundsException("Invalid Fit index value " + r5 + ". It must be between 0 and " + r02);
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ Fit[] $values() {
        return new Fit[]{FILL, CONTAIN, COVER, FIT_WIDTH, FIT_HEIGHT, NONE, SCALE_DOWN, LAYOUT};
    }

    static {
        FILL = new Fit("FILL", 0);
        CONTAIN = new Fit("CONTAIN", 1);
        COVER = new Fit("COVER", 2);
        FIT_WIDTH = new Fit("FIT_WIDTH", 3);
        FIT_HEIGHT = new Fit("FIT_HEIGHT", 4);
        NONE = new Fit("NONE", 5);
        SCALE_DOWN = new Fit("SCALE_DOWN", 6);
        LAYOUT = new Fit("LAYOUT", 7);
        Fit[] r02 = $values();
        $VALUES = r02;
        $ENTRIES = b.a(r02);
        Companion = new Companion(null);
    }

    Fit(String r1, int r2) {
    }

    public static kotlin.enums.a getEntries() {
        return $ENTRIES;
    }

    public static Fit valueOf(String r1) {
        return (Fit) Enum.valueOf(Fit.class, r1);
    }

    public static Fit[] values() {
        return (Fit[]) $VALUES.clone();
    }
}
