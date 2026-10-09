package io.sentry;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes3.dex */
public enum SentryLevel extends Enum<SentryLevel> implements InterfaceC11696y0 {
    private static final /* synthetic */ SentryLevel[] $VALUES = null;
    public static final SentryLevel DEBUG = null;
    public static final SentryLevel ERROR = null;
    public static final SentryLevel FATAL = null;
    public static final SentryLevel INFO = null;
    public static final SentryLevel WARNING = null;

    public static final class a implements InterfaceC11631o0 {
        public a() {
        }

        @Override // io.sentry.InterfaceC11631o0
        public /* bridge */ /* synthetic */ Object a(InterfaceC11587f1 r1, Q r2) {
            return b(r1, r2);
        }

        public SentryLevel b(InterfaceC11587f1 r1, Q r2) {
            return SentryLevel.valueOf(r1.nextString().toUpperCase(Locale.ROOT));
        }
    }

    private static /* synthetic */ SentryLevel[] $values() {
        return new SentryLevel[]{DEBUG, INFO, WARNING, ERROR, FATAL};
    }

    static {
        DEBUG = new SentryLevel("DEBUG", 0);
        INFO = new SentryLevel("INFO", 1);
        WARNING = new SentryLevel("WARNING", 2);
        ERROR = new SentryLevel("ERROR", 3);
        FATAL = new SentryLevel("FATAL", 4);
        $VALUES = $values();
    }

    SentryLevel(String r1, int r2) {
    }

    public static SentryLevel valueOf(String r1) {
        return (SentryLevel) Enum.valueOf(SentryLevel.class, r1);
    }

    public static SentryLevel[] values() {
        return (SentryLevel[]) $VALUES.clone();
    }

    @Override // io.sentry.InterfaceC11696y0
    public void serialize(InterfaceC11592g1 r2, Q r3) throws IOException {
        r2.a(name().toLowerCase(Locale.ROOT));
    }
}
