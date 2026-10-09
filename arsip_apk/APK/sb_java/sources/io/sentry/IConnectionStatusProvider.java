package io.sentry;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.Closeable;

/* loaded from: classes3.dex */
public interface IConnectionStatusProvider extends Closeable {

    public enum ConnectionStatus extends Enum<ConnectionStatus> {
        private static final /* synthetic */ ConnectionStatus[] $VALUES = null;
        public static final ConnectionStatus CONNECTED = null;
        public static final ConnectionStatus DISCONNECTED = null;
        public static final ConnectionStatus NO_PERMISSION = null;
        public static final ConnectionStatus UNKNOWN = null;

        private static /* synthetic */ ConnectionStatus[] $values() {
            return new ConnectionStatus[]{UNKNOWN, CONNECTED, DISCONNECTED, NO_PERMISSION};
        }

        static {
            UNKNOWN = new ConnectionStatus(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            CONNECTED = new ConnectionStatus("CONNECTED", 1);
            DISCONNECTED = new ConnectionStatus("DISCONNECTED", 2);
            NO_PERMISSION = new ConnectionStatus("NO_PERMISSION", 3);
            $VALUES = $values();
        }

        ConnectionStatus(String r1, int r2) {
        }

        public static ConnectionStatus valueOf(String r1) {
            return (ConnectionStatus) Enum.valueOf(ConnectionStatus.class, r1);
        }

        public static ConnectionStatus[] values() {
            return (ConnectionStatus[]) $VALUES.clone();
        }
    }

    public interface a {
        void t(ConnectionStatus r1);
    }

    ConnectionStatus I();

    void q0(a r1);

    boolean v1(a r1);

    String w();
}
