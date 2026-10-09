package io.sentry.util.network;

import java.util.List;

/* loaded from: classes3.dex */
public final class NetworkBody {

    /* renamed from: a, reason: collision with root package name */
    public final Object f176862a;

    /* renamed from: b, reason: collision with root package name */
    public final List f176863b;

    public enum NetworkBodyWarning extends Enum<NetworkBodyWarning> {
        private static final /* synthetic */ NetworkBodyWarning[] $VALUES = null;
        public static final NetworkBodyWarning BODY_PARSE_ERROR = null;
        public static final NetworkBodyWarning INVALID_JSON = null;
        public static final NetworkBodyWarning JSON_TRUNCATED = null;
        public static final NetworkBodyWarning TEXT_TRUNCATED = null;
        private final String value;

        private static /* synthetic */ NetworkBodyWarning[] $values() {
            return new NetworkBodyWarning[]{JSON_TRUNCATED, TEXT_TRUNCATED, INVALID_JSON, BODY_PARSE_ERROR};
        }

        static {
            JSON_TRUNCATED = new NetworkBodyWarning("JSON_TRUNCATED", 0, "JSON_TRUNCATED");
            TEXT_TRUNCATED = new NetworkBodyWarning("TEXT_TRUNCATED", 1, "TEXT_TRUNCATED");
            INVALID_JSON = new NetworkBodyWarning("INVALID_JSON", 2, "INVALID_JSON");
            BODY_PARSE_ERROR = new NetworkBodyWarning("BODY_PARSE_ERROR", 3, "BODY_PARSE_ERROR");
            $VALUES = $values();
        }

        NetworkBodyWarning(String r1, int r2, String r3) {
            this.value = r3;
        }

        public static NetworkBodyWarning valueOf(String r1) {
            return (NetworkBodyWarning) Enum.valueOf(NetworkBodyWarning.class, r1);
        }

        public static NetworkBodyWarning[] values() {
            return (NetworkBodyWarning[]) $VALUES.clone();
        }

        public String getValue() {
            return this.value;
        }
    }

    public NetworkBody(Object r2) {
        this(r2, null);
    }

    public Object a() {
        return this.f176862a;
    }

    public List b() {
        return this.f176863b;
    }

    public String toString() {
        return "NetworkBody{body=" + this.f176862a + ", warnings=" + this.f176863b + '}';
    }

    public NetworkBody(Object r1, List r2) {
        this.f176862a = r1;
        this.f176863b = r2;
    }
}
