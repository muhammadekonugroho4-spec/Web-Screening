package com.google.firebase.perf.util;

/* loaded from: classes6.dex */
public class Constants {
    public static final String ACTIVITY_ATTRIBUTE_KEY = "Hosting_activity";
    public static final int BURST_CAPACITY = 500;
    public static final String ENABLE_DISABLE = "isEnabled";
    public static final int FROZEN_FRAME_TIME = 700;
    public static final int MAX_ATTRIBUTE_KEY_LENGTH = 40;
    public static final int MAX_ATTRIBUTE_VALUE_LENGTH = 100;
    public static final int MAX_CONTENT_TYPE_LENGTH = 128;
    public static final int MAX_COUNTER_ID_LENGTH = 100;
    public static final int MAX_HOST_LENGTH = 255;
    public static final double MAX_SAMPLING_RATE = 1.0d;
    public static final int MAX_SUBTRACE_DEEP = 1;
    public static final int MAX_TRACE_CUSTOM_ATTRIBUTES = 5;
    public static final int MAX_TRACE_ID_LENGTH = 100;
    public static final int MAX_URL_LENGTH = 2000;
    public static final double MIN_SAMPLING_RATE = 0.0d;
    public static final String PARENT_FRAGMENT_ATTRIBUTE_KEY = "Parent_fragment";
    public static final String PARENT_FRAGMENT_ATTRIBUTE_VALUE_NONE = "No parent";
    public static final String PREFS_NAME = "FirebasePerfSharedPrefs";
    public static final int RATE_PER_MINUTE = 100;
    public static final String SCREEN_TRACE_PREFIX = "_st_";
    public static final int SLOW_FRAME_TIME = 16;

    public enum CounterNames extends Enum<CounterNames> {
        private static final /* synthetic */ CounterNames[] $VALUES = null;
        public static final CounterNames FRAMES_FROZEN = null;
        public static final CounterNames FRAMES_SLOW = null;
        public static final CounterNames FRAMES_TOTAL = null;
        public static final CounterNames NETWORK_TRACE_EVENT_RATE_LIMITED = null;
        public static final CounterNames TRACE_EVENT_RATE_LIMITED = null;
        public static final CounterNames TRACE_STARTED_NOT_STOPPED = null;
        private String mName;

        private static /* synthetic */ CounterNames[] $values() {
            return new CounterNames[]{TRACE_EVENT_RATE_LIMITED, NETWORK_TRACE_EVENT_RATE_LIMITED, TRACE_STARTED_NOT_STOPPED, FRAMES_TOTAL, FRAMES_SLOW, FRAMES_FROZEN};
        }

        static {
            TRACE_EVENT_RATE_LIMITED = new CounterNames("TRACE_EVENT_RATE_LIMITED", 0, "_fstec");
            NETWORK_TRACE_EVENT_RATE_LIMITED = new CounterNames("NETWORK_TRACE_EVENT_RATE_LIMITED", 1, "_fsntc");
            TRACE_STARTED_NOT_STOPPED = new CounterNames("TRACE_STARTED_NOT_STOPPED", 2, "_tsns");
            FRAMES_TOTAL = new CounterNames("FRAMES_TOTAL", 3, "_fr_tot");
            FRAMES_SLOW = new CounterNames("FRAMES_SLOW", 4, "_fr_slo");
            FRAMES_FROZEN = new CounterNames("FRAMES_FROZEN", 5, "_fr_fzn");
            $VALUES = $values();
        }

        CounterNames(String r1, int r2, String r3) {
            this.mName = r3;
        }

        public static CounterNames valueOf(String r1) {
            return (CounterNames) Enum.valueOf(CounterNames.class, r1);
        }

        public static CounterNames[] values() {
            return (CounterNames[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mName;
        }
    }

    public enum TraceNames extends Enum<TraceNames> {
        private static final /* synthetic */ TraceNames[] $VALUES = null;
        public static final TraceNames APP_START_TRACE_NAME = null;
        public static final TraceNames BACKGROUND_TRACE_NAME = null;
        public static final TraceNames FOREGROUND_TRACE_NAME = null;
        public static final TraceNames ON_CREATE_TRACE_NAME = null;
        public static final TraceNames ON_RESUME_TRACE_NAME = null;
        public static final TraceNames ON_START_TRACE_NAME = null;
        private String mName;

        private static /* synthetic */ TraceNames[] $values() {
            return new TraceNames[]{APP_START_TRACE_NAME, ON_CREATE_TRACE_NAME, ON_START_TRACE_NAME, ON_RESUME_TRACE_NAME, FOREGROUND_TRACE_NAME, BACKGROUND_TRACE_NAME};
        }

        static {
            APP_START_TRACE_NAME = new TraceNames("APP_START_TRACE_NAME", 0, "_as");
            ON_CREATE_TRACE_NAME = new TraceNames("ON_CREATE_TRACE_NAME", 1, "_astui");
            ON_START_TRACE_NAME = new TraceNames("ON_START_TRACE_NAME", 2, "_astfd");
            ON_RESUME_TRACE_NAME = new TraceNames("ON_RESUME_TRACE_NAME", 3, "_asti");
            FOREGROUND_TRACE_NAME = new TraceNames("FOREGROUND_TRACE_NAME", 4, "_fs");
            BACKGROUND_TRACE_NAME = new TraceNames("BACKGROUND_TRACE_NAME", 5, "_bs");
            $VALUES = $values();
        }

        TraceNames(String r1, int r2, String r3) {
            this.mName = r3;
        }

        public static TraceNames valueOf(String r1) {
            return (TraceNames) Enum.valueOf(TraceNames.class, r1);
        }

        public static TraceNames[] values() {
            return (TraceNames[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mName;
        }
    }

    public Constants() {
    }
}
