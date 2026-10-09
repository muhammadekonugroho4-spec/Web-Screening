package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.ProtoEncoderDoNotUse;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ClientMetrics {
    private static final ClientMetrics DEFAULT_INSTANCE = null;
    private final String app_namespace_;
    private final GlobalMetrics global_metrics_;
    private final List<LogSourceMetrics> log_source_metrics_;
    private final TimeWindow window_;

    public static final class Builder {
        private String app_namespace_;
        private GlobalMetrics global_metrics_;
        private List<LogSourceMetrics> log_source_metrics_;
        private TimeWindow window_;

        public Builder() {
            this.window_ = null;
            this.log_source_metrics_ = new ArrayList();
            this.global_metrics_ = null;
            this.app_namespace_ = "";
        }

        public Builder addLogSourceMetrics(LogSourceMetrics r2) {
            this.log_source_metrics_.add(r2);
            return this;
        }

        public ClientMetrics build() {
            return new ClientMetrics(this.window_, Collections.unmodifiableList(this.log_source_metrics_), this.global_metrics_, this.app_namespace_);
        }

        public Builder setAppNamespace(String r1) {
            this.app_namespace_ = r1;
            return this;
        }

        public Builder setGlobalMetrics(GlobalMetrics r1) {
            this.global_metrics_ = r1;
            return this;
        }

        public Builder setLogSourceMetricsList(List<LogSourceMetrics> r1) {
            this.log_source_metrics_ = r1;
            return this;
        }

        public Builder setWindow(TimeWindow r1) {
            this.window_ = r1;
            return this;
        }
    }

    static {
        DEFAULT_INSTANCE = new Builder().build();
    }

    public ClientMetrics(TimeWindow r1, List<LogSourceMetrics> r2, GlobalMetrics r3, String r4) {
        this.window_ = r1;
        this.log_source_metrics_ = r2;
        this.global_metrics_ = r3;
        this.app_namespace_ = r4;
    }

    public static ClientMetrics getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 4)
    public String getAppNamespace() {
        return this.app_namespace_;
    }

    @Encodable.Ignore
    public GlobalMetrics getGlobalMetrics() {
        GlobalMetrics r02 = this.global_metrics_;
        if (r02 == null) goto L5;
        return r02;
    L5:
        return GlobalMetrics.getDefaultInstance();
    }

    @Protobuf(tag = 3)
    @Encodable.Field(name = "globalMetrics")
    public GlobalMetrics getGlobalMetricsInternal() {
        return this.global_metrics_;
    }

    @Protobuf(tag = 2)
    @Encodable.Field(name = "logSourceMetrics")
    public List<LogSourceMetrics> getLogSourceMetricsList() {
        return this.log_source_metrics_;
    }

    @Encodable.Ignore
    public TimeWindow getWindow() {
        TimeWindow r02 = this.window_;
        if (r02 == null) goto L5;
        return r02;
    L5:
        return TimeWindow.getDefaultInstance();
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "window")
    public TimeWindow getWindowInternal() {
        return this.window_;
    }

    public byte[] toByteArray() {
        return ProtoEncoderDoNotUse.encode(this);
    }

    public void writeTo(OutputStream r1) throws IOException {
        ProtoEncoderDoNotUse.encode(this, r1);
    }
}
