package io.sentry;

import java.util.Locale;

/* loaded from: classes3.dex */
public interface MeasurementUnit {

    public enum Duration extends Enum<Duration> implements MeasurementUnit {
        private static final /* synthetic */ Duration[] $VALUES = null;
        public static final Duration DAY = null;
        public static final Duration HOUR = null;
        public static final Duration MICROSECOND = null;
        public static final Duration MILLISECOND = null;
        public static final Duration MINUTE = null;
        public static final Duration NANOSECOND = null;
        public static final Duration SECOND = null;
        public static final Duration WEEK = null;

        private static /* synthetic */ Duration[] $values() {
            return new Duration[]{NANOSECOND, MICROSECOND, MILLISECOND, SECOND, MINUTE, HOUR, DAY, WEEK};
        }

        static {
            NANOSECOND = new Duration("NANOSECOND", 0);
            MICROSECOND = new Duration("MICROSECOND", 1);
            MILLISECOND = new Duration("MILLISECOND", 2);
            SECOND = new Duration("SECOND", 3);
            MINUTE = new Duration("MINUTE", 4);
            HOUR = new Duration("HOUR", 5);
            DAY = new Duration("DAY", 6);
            WEEK = new Duration("WEEK", 7);
            $VALUES = $values();
        }

        Duration(String r1, int r2) {
        }

        public static Duration valueOf(String r1) {
            return (Duration) Enum.valueOf(Duration.class, r1);
        }

        public static Duration[] values() {
            return (Duration[]) $VALUES.clone();
        }

        @Override // io.sentry.MeasurementUnit
        public String apiName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    String apiName();
}
