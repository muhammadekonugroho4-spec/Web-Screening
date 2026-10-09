package app.rive.runtime.kotlin.core;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lapp/rive/runtime/kotlin/core/RendererType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "Rive", "Canvas", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum RendererType extends Enum<RendererType> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ RendererType[] $VALUES = null;
    public static final RendererType Canvas = null;
    public static final Companion Companion = null;
    public static final RendererType Rive = null;
    private final int value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/runtime/kotlin/core/RendererType$Companion;", "", "()V", "fromIndex", "Lapp/rive/runtime/kotlin/core/RendererType;", FirebaseAnalytics.Param.INDEX, "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(i r1) {
            this();
        }

        public final RendererType fromIndex(int r5) {
            int r02 = RendererType.getEntries().size();
            if (r5 < 0) goto L8;
            if (r5 > r02) goto L8;
            return (RendererType) RendererType.getEntries().get(r5);
        L8:
            throw new IndexOutOfBoundsException("Invalid " + Companion.class + " index value " + r5 + ". It must be between 0 and " + r02);
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ RendererType[] $values() {
        return new RendererType[]{Rive, Canvas};
    }

    static {
        Rive = new RendererType("Rive", 0, 0);
        Canvas = new RendererType("Canvas", 1, 1);
        RendererType[] r02 = $values();
        $VALUES = r02;
        $ENTRIES = b.a(r02);
        Companion = new Companion(null);
    }

    RendererType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static kotlin.enums.a getEntries() {
        return $ENTRIES;
    }

    public static RendererType valueOf(String r1) {
        return (RendererType) Enum.valueOf(RendererType.class, r1);
    }

    public static RendererType[] values() {
        return (RendererType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
