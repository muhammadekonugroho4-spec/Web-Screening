package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* loaded from: classes6.dex */
public final class FirebaseOptions {
    private static final String API_KEY_RESOURCE_NAME = "google_api_key";
    private static final String APP_ID_RESOURCE_NAME = "google_app_id";
    private static final String DATABASE_URL_RESOURCE_NAME = "firebase_database_url";
    private static final String GA_TRACKING_ID_RESOURCE_NAME = "ga_trackingId";
    private static final String GCM_SENDER_ID_RESOURCE_NAME = "gcm_defaultSenderId";
    private static final String PROJECT_ID_RESOURCE_NAME = "project_id";
    private static final String STORAGE_BUCKET_RESOURCE_NAME = "google_storage_bucket";
    private final String apiKey;
    private final String applicationId;
    private final String databaseUrl;
    private final String gaTrackingId;
    private final String gcmSenderId;
    private final String projectId;
    private final String storageBucket;

    /* renamed from: com.google.firebase.FirebaseOptions$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private String apiKey;
        private String applicationId;
        private String databaseUrl;
        private String gaTrackingId;
        private String gcmSenderId;
        private String projectId;
        private String storageBucket;

        public Builder() {
        }

        public FirebaseOptions build() {
            return new FirebaseOptions(this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId, null);
        }

        public Builder setApiKey(String r2) {
            this.apiKey = Preconditions.checkNotEmpty(r2, "ApiKey must be set.");
            return this;
        }

        public Builder setApplicationId(String r2) {
            this.applicationId = Preconditions.checkNotEmpty(r2, "ApplicationId must be set.");
            return this;
        }

        public Builder setDatabaseUrl(String r1) {
            this.databaseUrl = r1;
            return this;
        }

        @KeepForSdk
        public Builder setGaTrackingId(String r1) {
            this.gaTrackingId = r1;
            return this;
        }

        public Builder setGcmSenderId(String r1) {
            this.gcmSenderId = r1;
            return this;
        }

        public Builder setProjectId(String r1) {
            this.projectId = r1;
            return this;
        }

        public Builder setStorageBucket(String r1) {
            this.storageBucket = r1;
            return this;
        }

        public Builder(FirebaseOptions r2) {
            this.applicationId = FirebaseOptions.access$000(r2);
            this.apiKey = FirebaseOptions.access$100(r2);
            this.databaseUrl = FirebaseOptions.access$200(r2);
            this.gaTrackingId = FirebaseOptions.access$300(r2);
            this.gcmSenderId = FirebaseOptions.access$400(r2);
            this.storageBucket = FirebaseOptions.access$500(r2);
            this.projectId = FirebaseOptions.access$600(r2);
        }
    }

    public /* synthetic */ FirebaseOptions(String r1, String r2, String r3, String r4, String r5, String r6, String r7, AnonymousClass1 r8) {
        this(r1, r2, r3, r4, r5, r6, r7);
    }

    public static /* synthetic */ String access$000(FirebaseOptions r02) {
        return r02.applicationId;
    }

    public static /* synthetic */ String access$100(FirebaseOptions r02) {
        return r02.apiKey;
    }

    public static /* synthetic */ String access$200(FirebaseOptions r02) {
        return r02.databaseUrl;
    }

    public static /* synthetic */ String access$300(FirebaseOptions r02) {
        return r02.gaTrackingId;
    }

    public static /* synthetic */ String access$400(FirebaseOptions r02) {
        return r02.gcmSenderId;
    }

    public static /* synthetic */ String access$500(FirebaseOptions r02) {
        return r02.storageBucket;
    }

    public static /* synthetic */ String access$600(FirebaseOptions r02) {
        return r02.projectId;
    }

    public static FirebaseOptions fromResource(Context r9) {
        StringResourceValueReader r02 = new StringResourceValueReader(r9);
        String r2 = r02.getString(APP_ID_RESOURCE_NAME);
        if (TextUtils.isEmpty(r2) == false) goto L7;
        return null;
    L7:
        return new FirebaseOptions(r2, r02.getString(API_KEY_RESOURCE_NAME), r02.getString(DATABASE_URL_RESOURCE_NAME), r02.getString(GA_TRACKING_ID_RESOURCE_NAME), r02.getString(GCM_SENDER_ID_RESOURCE_NAME), r02.getString(STORAGE_BUCKET_RESOURCE_NAME), r02.getString(PROJECT_ID_RESOURCE_NAME));
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof FirebaseOptions) == true) goto L5;
        return false;
    L5:
        FirebaseOptions r42 = (FirebaseOptions) r4;
        if (Objects.equal(this.applicationId, r42.applicationId) == true) goto L8;
    L21:
        return false;
    L8:
        if (Objects.equal(this.apiKey, r42.apiKey) == false) goto L21;
        if (Objects.equal(this.databaseUrl, r42.databaseUrl) == false) goto L21;
        if (Objects.equal(this.gaTrackingId, r42.gaTrackingId) == false) goto L21;
        if (Objects.equal(this.gcmSenderId, r42.gcmSenderId) == false) goto L21;
        if (Objects.equal(this.storageBucket, r42.storageBucket) == false) goto L21;
        if (Objects.equal(this.projectId, r42.projectId) == false) goto L21;
        return true;
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public String getDatabaseUrl() {
        return this.databaseUrl;
    }

    @KeepForSdk
    public String getGaTrackingId() {
        return this.gaTrackingId;
    }

    public String getGcmSenderId() {
        return this.gcmSenderId;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public String getStorageBucket() {
        return this.storageBucket;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId});
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.applicationId).add("apiKey", this.apiKey).add("databaseUrl", this.databaseUrl).add("gcmSenderId", this.gcmSenderId).add("storageBucket", this.storageBucket).add("projectId", this.projectId).toString();
    }

    private FirebaseOptions(String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(r3), "ApplicationId must be set.");
        this.applicationId = r3;
        this.apiKey = r4;
        this.databaseUrl = r5;
        this.gaTrackingId = r6;
        this.gcmSenderId = r7;
        this.storageBucket = r8;
        this.projectId = r9;
    }
}
