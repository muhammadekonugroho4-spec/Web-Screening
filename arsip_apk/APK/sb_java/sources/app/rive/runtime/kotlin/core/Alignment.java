package app.rive.runtime.kotlin.core;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lapp/rive/runtime/kotlin/core/Alignment;", "", "(Ljava/lang/String;I)V", "TOP_LEFT", "TOP_CENTER", "TOP_RIGHT", "CENTER_LEFT", "CENTER", "CENTER_RIGHT", "BOTTOM_LEFT", "BOTTOM_CENTER", "BOTTOM_RIGHT", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum Alignment extends Enum<Alignment> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ Alignment[] $VALUES = null;
    public static final Alignment BOTTOM_CENTER = null;
    public static final Alignment BOTTOM_LEFT = null;
    public static final Alignment BOTTOM_RIGHT = null;
    public static final Alignment CENTER = null;
    public static final Alignment CENTER_LEFT = null;
    public static final Alignment CENTER_RIGHT = null;
    public static final Companion Companion = null;
    public static final Alignment TOP_CENTER = null;
    public static final Alignment TOP_LEFT = null;
    public static final Alignment TOP_RIGHT = null;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/runtime/kotlin/core/Alignment$Companion;", "", "()V", "fromIndex", "Lapp/rive/runtime/kotlin/core/Alignment;", FirebaseAnalytics.Param.INDEX, "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(i r1) {
            this();
        }

        public final Alignment fromIndex(int r5) {
            int r02 = Alignment.getEntries().size();
            if (r5 < 0) goto L8;
            if (r5 > r02) goto L8;
            return (Alignment) Alignment.getEntries().get(r5);
        L8:
            throw new IndexOutOfBoundsException("Invalid Alignment index value " + r5 + ". It must be between 0 and " + r02);
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ Alignment[] $values() {
        return new Alignment[]{TOP_LEFT, TOP_CENTER, TOP_RIGHT, CENTER_LEFT, CENTER, CENTER_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT};
    }

    static {
        TOP_LEFT = new Alignment("TOP_LEFT", 0);
        TOP_CENTER = new Alignment("TOP_CENTER", 1);
        TOP_RIGHT = new Alignment("TOP_RIGHT", 2);
        CENTER_LEFT = new Alignment("CENTER_LEFT", 3);
        CENTER = new Alignment("CENTER", 4);
        CENTER_RIGHT = new Alignment("CENTER_RIGHT", 5);
        BOTTOM_LEFT = new Alignment("BOTTOM_LEFT", 6);
        BOTTOM_CENTER = new Alignment("BOTTOM_CENTER", 7);
        BOTTOM_RIGHT = new Alignment("BOTTOM_RIGHT", 8);
        Alignment[] r02 = $values();
        $VALUES = r02;
        $ENTRIES = b.a(r02);
        Companion = new Companion(null);
    }

    Alignment(String r1, int r2) {
    }

    public static kotlin.enums.a getEntries() {
        return $ENTRIES;
    }

    public static Alignment valueOf(String r1) {
        return (Alignment) Enum.valueOf(Alignment.class, r1);
    }

    public static Alignment[] values() {
        return (Alignment[]) $VALUES.clone();
    }
}
