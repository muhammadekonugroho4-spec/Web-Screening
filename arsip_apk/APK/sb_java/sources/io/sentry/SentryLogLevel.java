package io.sentry;

import com.google.firebase.perf.FirebasePerformance;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes3.dex */
public enum SentryLogLevel extends Enum<SentryLogLevel> implements InterfaceC11696y0 {
    private static final /* synthetic */ SentryLogLevel[] $VALUES = null;
    public static final SentryLogLevel DEBUG = null;
    public static final SentryLogLevel ERROR = null;
    public static final SentryLogLevel FATAL = null;
    public static final SentryLogLevel INFO = null;
    public static final SentryLogLevel TRACE = null;
    public static final SentryLogLevel WARN = null;
    private final int severityNumber;

    public static final class a implements InterfaceC11631o0 {
        public a() {
        }

        @Override // io.sentry.InterfaceC11631o0
        public /* bridge */ /* synthetic */ Object a(InterfaceC11587f1 r1, Q r2) {
            return b(r1, r2);
        }

        public SentryLogLevel b(InterfaceC11587f1 r1, Q r2) {
            return SentryLogLevel.valueOf(r1.nextString().toUpperCase(Locale.ROOT));
        }
    }

    private static /* synthetic */ SentryLogLevel[] $values() {
        return new SentryLogLevel[]{TRACE, DEBUG, INFO, WARN, ERROR, FATAL};
    }

    static {
        TRACE = new SentryLogLevel(FirebasePerformance.HttpMethod.TRACE, 0, 1);
        DEBUG = new SentryLogLevel("DEBUG", 1, 5);
        INFO = new SentryLogLevel("INFO", 2, 9);
        WARN = new SentryLogLevel("WARN", 3, 13);
        ERROR = new SentryLogLevel("ERROR", 4, 17);
        FATAL = new SentryLogLevel("FATAL", 5, 21);
        $VALUES = $values();
    }

    SentryLogLevel(String r1, int r2, int r3) {
        this.severityNumber = r3;
    }

    public static SentryLogLevel valueOf(String r1) {
        return (SentryLogLevel) Enum.valueOf(SentryLogLevel.class, r1);
    }

    public static SentryLogLevel[] values() {
        return (SentryLogLevel[]) $VALUES.clone();
    }

    public int getSeverityNumber() {
        return this.severityNumber;
    }

    @Override // io.sentry.InterfaceC11696y0
    public void serialize(InterfaceC11592g1 r2, Q r3) throws IOException {
        r2.a(name().toLowerCase(Locale.ROOT));
    }
}
