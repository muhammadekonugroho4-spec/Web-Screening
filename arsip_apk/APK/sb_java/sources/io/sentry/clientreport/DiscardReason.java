package io.sentry.clientreport;

import com.google.firebase.messaging.Constants;

/* loaded from: classes3.dex */
public enum DiscardReason extends Enum<DiscardReason> {
    private static final /* synthetic */ DiscardReason[] $VALUES = null;
    public static final DiscardReason BACKPRESSURE = null;
    public static final DiscardReason BEFORE_SEND = null;
    public static final DiscardReason CACHE_OVERFLOW = null;
    public static final DiscardReason EVENT_PROCESSOR = null;
    public static final DiscardReason NETWORK_ERROR = null;
    public static final DiscardReason QUEUE_OVERFLOW = null;
    public static final DiscardReason RATELIMIT_BACKOFF = null;
    public static final DiscardReason SAMPLE_RATE = null;
    public static final DiscardReason SEND_ERROR = null;
    private final String reason;

    private static /* synthetic */ DiscardReason[] $values() {
        return new DiscardReason[]{QUEUE_OVERFLOW, CACHE_OVERFLOW, RATELIMIT_BACKOFF, NETWORK_ERROR, SEND_ERROR, SAMPLE_RATE, BEFORE_SEND, EVENT_PROCESSOR, BACKPRESSURE};
    }

    static {
        QUEUE_OVERFLOW = new DiscardReason("QUEUE_OVERFLOW", 0, "queue_overflow");
        CACHE_OVERFLOW = new DiscardReason("CACHE_OVERFLOW", 1, "cache_overflow");
        RATELIMIT_BACKOFF = new DiscardReason("RATELIMIT_BACKOFF", 2, "ratelimit_backoff");
        NETWORK_ERROR = new DiscardReason("NETWORK_ERROR", 3, "network_error");
        SEND_ERROR = new DiscardReason("SEND_ERROR", 4, Constants.MessageTypes.SEND_ERROR);
        SAMPLE_RATE = new DiscardReason("SAMPLE_RATE", 5, "sample_rate");
        BEFORE_SEND = new DiscardReason("BEFORE_SEND", 6, "before_send");
        EVENT_PROCESSOR = new DiscardReason("EVENT_PROCESSOR", 7, "event_processor");
        BACKPRESSURE = new DiscardReason("BACKPRESSURE", 8, "backpressure");
        $VALUES = $values();
    }

    DiscardReason(String r1, int r2, String r3) {
        this.reason = r3;
    }

    public static DiscardReason valueOf(String r1) {
        return (DiscardReason) Enum.valueOf(DiscardReason.class, r1);
    }

    public static DiscardReason[] values() {
        return (DiscardReason[]) $VALUES.clone();
    }

    public String getReason() {
        return this.reason;
    }
}
