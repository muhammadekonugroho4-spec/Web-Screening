package com.google.firebase.perf.config;

import com.google.firebase.perf.BuildConfig;
import com.google.firebase.perf.util.Constants;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes6.dex */
final class ConfigurationConstants {

    public static final class CollectionDeactivated extends ConfigurationFlag<Boolean> {
        private static CollectionDeactivated instance;

        private CollectionDeactivated() {
        }

        public static synchronized CollectionDeactivated getInstance() {
            monitor-enter(CollectionDeactivated.class);
        L7:
            th = move-exception;
            throw th;
        L5:
            if (instance != null) goto L9;
            instance = new CollectionDeactivated();     // Catch: Throwable -> L7
        L9:
            CollectionDeactivated r1 = instance;     // Catch: Throwable -> L7
            monitor-exit(CollectionDeactivated.class);
            return r1;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ Boolean getDefault() {
            return getDefault();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getMetadataFlag() {
            return "firebase_performance_collection_deactivated";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Boolean getDefault() {
            return Boolean.FALSE;
        }
    }

    public static final class CollectionEnabled extends ConfigurationFlag<Boolean> {
        private static CollectionEnabled instance;

        private CollectionEnabled() {
        }

        public static synchronized CollectionEnabled getInstance() {
            monitor-enter(CollectionEnabled.class);
        L7:
            th = move-exception;
            throw th;
        L5:
            if (instance != null) goto L9;
            instance = new CollectionEnabled();     // Catch: Throwable -> L7
        L9:
            CollectionEnabled r1 = instance;     // Catch: Throwable -> L7
            monitor-exit(CollectionEnabled.class);
            return r1;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ Boolean getDefault() {
            return getDefault();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return Constants.ENABLE_DISABLE;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getMetadataFlag() {
            return "firebase_performance_collection_enabled";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Boolean getDefault() {
            return Boolean.TRUE;
        }
    }

    public static final class ExperimentTTID extends ConfigurationFlag<Boolean> {
        private static ExperimentTTID instance;

        private ExperimentTTID() {
        }

        public static synchronized ExperimentTTID getInstance() {
            monitor-enter(ExperimentTTID.class);
        L7:
            th = move-exception;
            throw th;
        L5:
            if (instance != null) goto L9;
            instance = new ExperimentTTID();     // Catch: Throwable -> L7
        L9:
            ExperimentTTID r1 = instance;     // Catch: Throwable -> L7
            monitor-exit(ExperimentTTID.class);
            return r1;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ Boolean getDefault() {
            return getDefault();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.ExperimentTTID";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getMetadataFlag() {
            return "experiment_app_start_ttid";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_experiment_app_start_ttid";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Boolean getDefault() {
            return Boolean.FALSE;
        }
    }

    public static final class FragmentSamplingRate extends ConfigurationFlag<Double> {
        private static FragmentSamplingRate instance;

        private FragmentSamplingRate() {
        }

        public static synchronized FragmentSamplingRate getInstance() {
            monitor-enter(FragmentSamplingRate.class);
        L7:
            th = move-exception;
            throw th;
        L5:
            if (instance != null) goto L9;
            instance = new FragmentSamplingRate();     // Catch: Throwable -> L7
        L9:
            FragmentSamplingRate r1 = instance;     // Catch: Throwable -> L7
            monitor-exit(FragmentSamplingRate.class);
            return r1;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ Double getDefault() {
            return getDefault();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.FragmentSamplingRate";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getMetadataFlag() {
            return "fragment_sampling_percentage";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_vc_fragment_sampling_rate";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Double getDefault() {
            return Double.valueOf(0.0d);
        }
    }

    public static final class LogSourceName extends ConfigurationFlag<String> {
        private static final Map<Long, String> LOG_SOURCE_MAP = null;
        private static LogSourceName instance;

        static {
            LOG_SOURCE_MAP = Collections.unmodifiableMap(new AnonymousClass1());
        }

        private LogSourceName() {
        }

        public static synchronized LogSourceName getInstance() {
            monitor-enter(LogSourceName.class);
        L7:
            th = move-exception;
            throw th;
        L5:
            if (instance != null) goto L9;
            instance = new LogSourceName();     // Catch: Throwable -> L7
        L9:
            LogSourceName r1 = instance;     // Catch: Throwable -> L7
            monitor-exit(LogSourceName.class);
            return r1;
        }

        public static String getLogSourceName(long r1) {
            return LOG_SOURCE_MAP.get(Long.valueOf(r1));
        }

        public static boolean isLogSourceKnown(long r1) {
            return LOG_SOURCE_MAP.containsKey(Long.valueOf(r1));
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ String getDefault() {
            return getDefault2();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.LogSourceName";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_log_source";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        /* renamed from: getDefault, reason: avoid collision after fix types in other method */
        public String getDefault2() {
            return BuildConfig.TRANSPORT_LOG_SRC;
        }
    }

    public static final class NetworkEventCountBackground extends ConfigurationFlag<Long> {
        private static NetworkEventCountBackground instance;

        private NetworkEventCountBackground() {
        }

        public static synchronized NetworkEventCountBackground getInstance() {
            monitor-enter(NetworkEventCountBackground.class);
        L7:
            th = move-exception;
            throw th;
        L5:
            if (instance != null) goto L9;
            instance = new NetworkEventCountBackground();     // Catch: Throwable -> L7
        L9:
            NetworkEventCountBackground r1 = instance;     // Catch: Throwable -> L7
            monitor-exit(NetworkEventCountBackground.class);
            return r1;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ Long getDefault() {
            return getDefault();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.NetworkEventCountBackground";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_rl_network_event_count_bg";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefault() {
            return 70L;
        }
    }

    public static final class NetworkEventCountForeground extends ConfigurationFlag<Long> {
        private static NetworkEventCountForeground instance;

        private NetworkEventCountForeground() {
        }

        public static synchronized NetworkEventCountForeground getInstance() {
            monitor-enter(NetworkEventCountForeground.class);
        L7:
            th = move-exception;
            throw th;
        L5:
            if (instance != null) goto L9;
            instance = new NetworkEventCountForeground();     // Catch: Throwable -> L7
        L9:
            NetworkEventCountForeground r1 = instance;     // Catch: Throwable -> L7
            monitor-exit(NetworkEventCountForeground.class);
            return r1;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ Long getDefault() {
            return getDefault();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.NetworkEventCountForeground";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_rl_network_event_count_fg";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefault() {
            return 700L;
        }
    }

    public static final class NetworkRequestSamplingRate extends ConfigurationFlag<Double> {
        private static NetworkRequestSamplingRate instance;

        private NetworkRequestSamplingRate() {
        }

        public static synchronized NetworkRequestSamplingRate getInstance() {
            monitor-enter(NetworkRequestSamplingRate.class);
        L7:
            th = move-exception;
            throw th;
        L5:
            if (instance != null) goto L9;
            instance = new NetworkRequestSamplingRate();     // Catch: Throwable -> L7
        L9:
            NetworkRequestSamplingRate r1 = instance;     // Catch: Throwable -> L7
            monitor-exit(NetworkRequestSamplingRate.class);
            return r1;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ Double getDefault() {
            return getDefault();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ Double getDefaultOnRcFetchFail() {
            return getDefaultOnRcFetchFail();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.NetworkRequestSamplingRate";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_vc_network_request_sampling_rate";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Double getDefault() {
            return Double.valueOf(1.0d);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Double getDefaultOnRcFetchFail() {
            return Double.valueOf(getDefault().doubleValue() / 1000.0d);
        }
    }

    public static final class RateLimitSec extends ConfigurationFlag<Long> {
        private static RateLimitSec instance;

        private RateLimitSec() {
        }

        public static synchronized RateLimitSec getInstance() {
            monitor-enter(RateLimitSec.class);
        L7:
            th = move-exception;
            throw th;
        L5:
            if (instance != null) goto L9;
            instance = new RateLimitSec();     // Catch: Throwable -> L7
        L9:
            RateLimitSec r1 = instance;     // Catch: Throwable -> L7
            monitor-exit(RateLimitSec.class);
            return r1;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ Long getDefault() {
            return getDefault();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.TimeLimitSec";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_rl_time_limit_sec";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefault() {
            return 600L;
        }
    }

    public static final class SdkDisabledVersions extends ConfigurationFlag<String> {
        private static SdkDisabledVersions instance;

        public SdkDisabledVersions() {
        }

        public static synchronized SdkDisabledVersions getInstance() {
            monitor-enter(SdkDisabledVersions.class);
        L7:
            th = move-exception;
            throw th;
        L5:
            if (instance != null) goto L9;
            instance = new SdkDisabledVersions();     // Catch: Throwable -> L7
        L9:
            SdkDisabledVersions r1 = instance;     // Catch: Throwable -> L7
            monitor-exit(SdkDisabledVersions.class);
            return r1;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ String getDefault() {
            return getDefault2();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SdkDisabledVersions";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_disabled_android_versions";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        /* renamed from: getDefault, reason: avoid collision after fix types in other method */
        public String getDefault2() {
            return "";
        }
    }

    public static final class SdkEnabled extends ConfigurationFlag<Boolean> {
        private static SdkEnabled instance;

        public SdkEnabled() {
        }

        public static synchronized SdkEnabled getInstance() {
            monitor-enter(SdkEnabled.class);
        L7:
            th = move-exception;
            throw th;
        L5:
            if (instance != null) goto L9;
            instance = new SdkEnabled();     // Catch: Throwable -> L7
        L9:
            SdkEnabled r1 = instance;     // Catch: Throwable -> L7
            monitor-exit(SdkEnabled.class);
            return r1;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ Boolean getDefault() {
            return getDefault();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SdkEnabled";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_enabled";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Boolean getDefault() {
            return Boolean.TRUE;
        }
    }

    public static final class SessionsCpuCaptureFrequencyBackgroundMs extends ConfigurationFlag<Long> {
        private static SessionsCpuCaptureFrequencyBackgroundMs instance;

        private SessionsCpuCaptureFrequencyBackgroundMs() {
        }

        public static synchronized SessionsCpuCaptureFrequencyBackgroundMs getInstance() {
            monitor-enter(SessionsCpuCaptureFrequencyBackgroundMs.class);
        L7:
            th = move-exception;
            throw th;
        L5:
            if (instance != null) goto L9;
            instance = new SessionsCpuCaptureFrequencyBackgroundMs();     // Catch: Throwable -> L7
        L9:
            SessionsCpuCaptureFrequencyBackgroundMs r1 = instance;     // Catch: Throwable -> L7
            monitor-exit(SessionsCpuCaptureFrequencyBackgroundMs.class);
            return r1;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ Long getDefault() {
            return getDefault();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getMetadataFlag() {
            return "sessions_cpu_capture_frequency_bg_ms";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefault() {
            return 0L;
        }
    }

    public static final class SessionsCpuCaptureFrequencyForegroundMs extends ConfigurationFlag<Long> {
        private static SessionsCpuCaptureFrequencyForegroundMs instance;

        private SessionsCpuCaptureFrequencyForegroundMs() {
        }

        public static synchronized SessionsCpuCaptureFrequencyForegroundMs getInstance() {
            monitor-enter(SessionsCpuCaptureFrequencyForegroundMs.class);
        L7:
            th = move-exception;
            throw th;
        L5:
            if (instance != null) goto L9;
            instance = new SessionsCpuCaptureFrequencyForegroundMs();     // Catch: Throwable -> L7
        L9:
            SessionsCpuCaptureFrequencyForegroundMs r1 = instance;     // Catch: Throwable -> L7
            monitor-exit(SessionsCpuCaptureFrequencyForegroundMs.class);
            return r1;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ Long getDefault() {
            return getDefault();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ Long getDefaultOnRcFetchFail() {
            return getDefaultOnRcFetchFail();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getMetadataFlag() {
            return "sessions_cpu_capture_frequency_fg_ms";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefault() {
            return 100L;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefaultOnRcFetchFail() {
            return Long.valueOf(getDefault().longValue() * 3);
        }
    }

    public static final class SessionsMaxDurationMinutes extends ConfigurationFlag<Long> {
        private static SessionsMaxDurationMinutes instance;

        private SessionsMaxDurationMinutes() {
        }

        public static synchronized SessionsMaxDurationMinutes getInstance() {
            monitor-enter(SessionsMaxDurationMinutes.class);
        L7:
            th = move-exception;
            throw th;
        L5:
            if (instance != null) goto L9;
            instance = new SessionsMaxDurationMinutes();     // Catch: Throwable -> L7
        L9:
            SessionsMaxDurationMinutes r1 = instance;     // Catch: Throwable -> L7
            monitor-exit(SessionsMaxDurationMinutes.class);
            return r1;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ Long getDefault() {
            return getDefault();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SessionsMaxDurationMinutes";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getMetadataFlag() {
            return "sessions_max_length_minutes";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_session_max_duration_min";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefault() {
            return 240L;
        }
    }

    public static final class SessionsMemoryCaptureFrequencyBackgroundMs extends ConfigurationFlag<Long> {
        private static SessionsMemoryCaptureFrequencyBackgroundMs instance;

        private SessionsMemoryCaptureFrequencyBackgroundMs() {
        }

        public static synchronized SessionsMemoryCaptureFrequencyBackgroundMs getInstance() {
            monitor-enter(SessionsMemoryCaptureFrequencyBackgroundMs.class);
        L7:
            th = move-exception;
            throw th;
        L5:
            if (instance != null) goto L9;
            instance = new SessionsMemoryCaptureFrequencyBackgroundMs();     // Catch: Throwable -> L7
        L9:
            SessionsMemoryCaptureFrequencyBackgroundMs r1 = instance;     // Catch: Throwable -> L7
            monitor-exit(SessionsMemoryCaptureFrequencyBackgroundMs.class);
            return r1;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ Long getDefault() {
            return getDefault();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getMetadataFlag() {
            return "sessions_memory_capture_frequency_bg_ms";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_session_gauge_memory_capture_frequency_bg_ms";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefault() {
            return 0L;
        }
    }

    public static final class SessionsMemoryCaptureFrequencyForegroundMs extends ConfigurationFlag<Long> {
        private static SessionsMemoryCaptureFrequencyForegroundMs instance;

        private SessionsMemoryCaptureFrequencyForegroundMs() {
        }

        public static synchronized SessionsMemoryCaptureFrequencyForegroundMs getInstance() {
            monitor-enter(SessionsMemoryCaptureFrequencyForegroundMs.class);
        L7:
            th = move-exception;
            throw th;
        L5:
            if (instance != null) goto L9;
            instance = new SessionsMemoryCaptureFrequencyForegroundMs();     // Catch: Throwable -> L7
        L9:
            SessionsMemoryCaptureFrequencyForegroundMs r1 = instance;     // Catch: Throwable -> L7
            monitor-exit(SessionsMemoryCaptureFrequencyForegroundMs.class);
            return r1;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ Long getDefault() {
            return getDefault();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ Long getDefaultOnRcFetchFail() {
            return getDefaultOnRcFetchFail();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getMetadataFlag() {
            return "sessions_memory_capture_frequency_fg_ms";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_session_gauge_memory_capture_frequency_fg_ms";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefault() {
            return 100L;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefaultOnRcFetchFail() {
            return Long.valueOf(getDefault().longValue() * 3);
        }
    }

    public static final class SessionsSamplingRate extends ConfigurationFlag<Double> {
        private static SessionsSamplingRate instance;

        private SessionsSamplingRate() {
        }

        public static synchronized SessionsSamplingRate getInstance() {
            monitor-enter(SessionsSamplingRate.class);
        L7:
            th = move-exception;
            throw th;
        L5:
            if (instance != null) goto L9;
            instance = new SessionsSamplingRate();     // Catch: Throwable -> L7
        L9:
            SessionsSamplingRate r1 = instance;     // Catch: Throwable -> L7
            monitor-exit(SessionsSamplingRate.class);
            return r1;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ Double getDefault() {
            return getDefault();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ Double getDefaultOnRcFetchFail() {
            return getDefaultOnRcFetchFail();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SessionSamplingRate";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getMetadataFlag() {
            return "sessions_sampling_percentage";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_vc_session_sampling_rate";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Double getDefault() {
            return Double.valueOf(0.01d);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Double getDefaultOnRcFetchFail() {
            return Double.valueOf(getDefault().doubleValue() / 1000.0d);
        }
    }

    public static final class TraceEventCountBackground extends ConfigurationFlag<Long> {
        private static TraceEventCountBackground instance;

        private TraceEventCountBackground() {
        }

        public static synchronized TraceEventCountBackground getInstance() {
            monitor-enter(TraceEventCountBackground.class);
        L7:
            th = move-exception;
            throw th;
        L5:
            if (instance != null) goto L9;
            instance = new TraceEventCountBackground();     // Catch: Throwable -> L7
        L9:
            TraceEventCountBackground r1 = instance;     // Catch: Throwable -> L7
            monitor-exit(TraceEventCountBackground.class);
            return r1;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ Long getDefault() {
            return getDefault();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.TraceEventCountBackground";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_rl_trace_event_count_bg";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefault() {
            return 30L;
        }
    }

    public static final class TraceEventCountForeground extends ConfigurationFlag<Long> {
        private static TraceEventCountForeground instance;

        private TraceEventCountForeground() {
        }

        public static synchronized TraceEventCountForeground getInstance() {
            monitor-enter(TraceEventCountForeground.class);
        L7:
            th = move-exception;
            throw th;
        L5:
            if (instance != null) goto L9;
            instance = new TraceEventCountForeground();     // Catch: Throwable -> L7
        L9:
            TraceEventCountForeground r1 = instance;     // Catch: Throwable -> L7
            monitor-exit(TraceEventCountForeground.class);
            return r1;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ Long getDefault() {
            return getDefault();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.TraceEventCountForeground";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_rl_trace_event_count_fg";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Long getDefault() {
            return 300L;
        }
    }

    public static final class TraceSamplingRate extends ConfigurationFlag<Double> {
        private static TraceSamplingRate instance;

        private TraceSamplingRate() {
        }

        public static synchronized TraceSamplingRate getInstance() {
            monitor-enter(TraceSamplingRate.class);
        L7:
            th = move-exception;
            throw th;
        L5:
            if (instance != null) goto L9;
            instance = new TraceSamplingRate();     // Catch: Throwable -> L7
        L9:
            TraceSamplingRate r1 = instance;     // Catch: Throwable -> L7
            monitor-exit(TraceSamplingRate.class);
            return r1;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ Double getDefault() {
            return getDefault();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public /* bridge */ /* synthetic */ Double getDefaultOnRcFetchFail() {
            return getDefaultOnRcFetchFail();
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getDeviceCacheFlag() {
            return "com.google.firebase.perf.TraceSamplingRate";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public String getRemoteConfigFlag() {
            return "fpr_vc_trace_sampling_rate";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Double getDefault() {
            return Double.valueOf(1.0d);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public Double getDefaultOnRcFetchFail() {
            return Double.valueOf(getDefault().doubleValue() / 1000.0d);
        }
    }

    public ConfigurationConstants() {
    }
}
