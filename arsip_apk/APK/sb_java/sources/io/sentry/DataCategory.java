package io.sentry;

import com.google.firebase.messaging.Constants;
import com.huawei.hms.android.SystemUtils;

/* loaded from: classes3.dex */
public enum DataCategory extends Enum<DataCategory> {
    private static final /* synthetic */ DataCategory[] $VALUES = null;
    public static final DataCategory All = null;
    public static final DataCategory Attachment = null;
    public static final DataCategory Default = null;
    public static final DataCategory Error = null;
    public static final DataCategory Feedback = null;
    public static final DataCategory LogByte = null;
    public static final DataCategory LogItem = null;
    public static final DataCategory Monitor = null;
    public static final DataCategory Profile = null;
    public static final DataCategory ProfileChunk = null;
    public static final DataCategory ProfileChunkUi = null;
    public static final DataCategory Replay = null;
    public static final DataCategory Security = null;
    public static final DataCategory Session = null;
    public static final DataCategory Span = null;
    public static final DataCategory TraceMetric = null;
    public static final DataCategory Transaction = null;
    public static final DataCategory Unknown = null;
    public static final DataCategory UserReport = null;
    private final String category;

    private static /* synthetic */ DataCategory[] $values() {
        return new DataCategory[]{All, Default, Error, Feedback, Session, Attachment, LogItem, LogByte, TraceMetric, Monitor, Profile, ProfileChunkUi, ProfileChunk, Transaction, Replay, Span, Security, UserReport, Unknown};
    }

    static {
        All = new DataCategory("All", 0, "__all__");
        Default = new DataCategory("Default", 1, "default");
        Error = new DataCategory("Error", 2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        Feedback = new DataCategory("Feedback", 3, "feedback");
        Session = new DataCategory("Session", 4, "session");
        Attachment = new DataCategory("Attachment", 5, "attachment");
        LogItem = new DataCategory("LogItem", 6, "log_item");
        LogByte = new DataCategory("LogByte", 7, "log_byte");
        TraceMetric = new DataCategory("TraceMetric", 8, "trace_metric");
        Monitor = new DataCategory("Monitor", 9, "monitor");
        Profile = new DataCategory("Profile", 10, "profile");
        ProfileChunkUi = new DataCategory("ProfileChunkUi", 11, "profile_chunk_ui");
        ProfileChunk = new DataCategory("ProfileChunk", 12, "profile_chunk");
        Transaction = new DataCategory("Transaction", 13, "transaction");
        Replay = new DataCategory("Replay", 14, "replay");
        Span = new DataCategory("Span", 15, "span");
        Security = new DataCategory("Security", 16, "security");
        UserReport = new DataCategory("UserReport", 17, "user_report");
        Unknown = new DataCategory("Unknown", 18, SystemUtils.UNKNOWN);
        $VALUES = $values();
    }

    DataCategory(String r1, int r2, String r3) {
        this.category = r3;
    }

    public static DataCategory valueOf(String r1) {
        return (DataCategory) Enum.valueOf(DataCategory.class, r1);
    }

    public static DataCategory[] values() {
        return (DataCategory[]) $VALUES.clone();
    }

    public String getCategory() {
        return this.category;
    }
}
