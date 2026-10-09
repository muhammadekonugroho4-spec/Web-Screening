package com.google.crypto.tink.monitoring;

import com.google.crypto.tink.annotations.Alpha;

@Alpha
/* loaded from: classes6.dex */
public interface MonitoringClient {

    public interface Logger {
        void log(int r1, long r2);

        void logFailure();
    }

    Logger createLogger(MonitoringKeysetInfo r1, String r2, String r3);
}
