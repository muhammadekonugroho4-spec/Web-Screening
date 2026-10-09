package com.clevertap.android.sdk;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.cryption.EncryptionLevel;
import com.clevertap.android.sdk.pushnotification.PushNotificationUtil;
import com.iab.digitalidentity.sdk.core.model.GoPayPlusCameraConfigKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class CleverTapInstanceConfig implements Parcelable {
    public static final Parcelable.Creator<CleverTapInstanceConfig> CREATOR = null;
    private static final String KEY_ACCOUNT_ID = "accountId";
    private static final String KEY_ACCOUNT_REGION = "accountRegion";
    private static final String KEY_ACCOUNT_TOKEN = "accountToken";
    private static final String KEY_ANALYTICS_ONLY = "analyticsOnly";
    private static final String KEY_BACKGROUND_SYNC = "backgroundSync";
    private static final String KEY_BETA = "beta";
    private static final String KEY_CREATED_POST_APP_LAUNCH = "createdPostAppLaunch";
    private static final String KEY_CUSTOM_HANDSHAKE_DOMAIN = "customHandshakeDomain";
    private static final String KEY_DEBUG_LEVEL = "debugLevel";
    private static final String KEY_DEFAULT_INSTANCE = "isDefaultInstance";
    private static final String KEY_DISABLE_APP_LAUNCHED = "disableAppLaunchedEvent";
    private static final String KEY_ENABLE_CUSTOM_CT_ID = "getEnableCustomCleverTapId";
    private static final String KEY_ENCRYPTION_IN_TRANSIT = "encryptionInTransit";
    public static final String KEY_ENCRYPTION_LEVEL = "encryptionLevel";
    private static final String KEY_FCM_SENDER_ID = "fcmSenderId";
    private static final String KEY_IDENTITY_TYPES = "identityTypes";
    private static final String KEY_PACKAGE_NAME = "packageName";
    private static final String KEY_PERSONALIZATION = "personalization";
    private static final String KEY_PROXY_DOMAIN = "proxyDomain";
    private static final String KEY_PUSH_TYPES = "allowedPushTypes";
    private static final String KEY_SPIKY_PROXY_DOMAIN = "spikyProxyDomain";
    private static final String KEY_SSL_PINNING = "sslPinning";
    private static final String KEY_USE_GOOGLE_AD_ID = "useGoogleAdId";
    private String accountId;
    private String accountRegion;
    private String accountToken;
    private boolean analyticsOnly;
    private boolean backgroundSync;
    private boolean beta;
    private boolean createdPostAppLaunch;
    private String customHandshakeDomain;
    private int debugLevel;
    private boolean disableAppLaunchedEvent;
    private boolean enableCustomCleverTapId;
    private String encryptionInTransit;
    private int encryptionLevel;
    private String fcmSenderId;
    private String[] identityKeys;
    private boolean isDefaultInstance;
    private Logger logger;
    private String packageName;
    private boolean personalization;
    private String proxyDomain;
    private final ArrayList<com.clevertap.android.sdk.pushnotification.h> pushTypes;
    private String spikyProxyDomain;
    private boolean sslPinning;
    private boolean useGoogleAdId;

    public class a implements Parcelable.Creator {
        public a() {
        }

        public CleverTapInstanceConfig a(Parcel r3) {
            return new CleverTapInstanceConfig(r3, null);
        }

        public CleverTapInstanceConfig[] b(int r1) {
            return new CleverTapInstanceConfig[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1) {
            return a(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int r1) {
            return b(r1);
        }
    }

    static {
        CREATOR = new a();
    }

    public /* synthetic */ CleverTapInstanceConfig(Parcel r1, a r2) {
        this(r1);
    }

    private void buildPushProvidersFromManifest(ManifestInfo r12) {
        String r02 = r12.q();     // Catch: Exception -> L18
        if (r02 == null) goto L10;
        String[] r03 = r02.split(Constants.SEPARATOR_COMMA);     // Catch: Exception -> L18
        if (r03 == null) goto L10;
        if (r03.length != 4) goto L10;
        addPushType(new com.clevertap.android.sdk.pushnotification.h(r03[0].trim(), r03[1].trim(), r03[2].trim(), r03[3].trim()));     // Catch: Exception -> L18
    L10:
        String r122 = r12.r();     // Catch: Exception -> L18
        if (r122 == null) goto L22;
        String[] r123 = r122.split(Constants.SEPARATOR_COMMA);     // Catch: Exception -> L18
        if (r123 != null) goto L15;
        return;
    L15:
        if (r123.length != 4) goto L24;
        addPushType(new com.clevertap.android.sdk.pushnotification.h(r123[0].trim(), r123[1].trim(), r123[2].trim(), r123[3].trim()));     // Catch: Exception -> L18
        return;
    L24:
        return;
    L22:
        return;
    L18:
        Logger.v("There was some problem in loading push providers from manifest");
    }

    public static CleverTapInstanceConfig createDefaultInstance(Context r1, String r2, String r3, String r4) {
        return createInstanceWithManifest(ManifestInfo.getInstance(r1), r2, r3, r4, true);
    }

    public static CleverTapInstanceConfig createInstance(Context r1, String r2, String r3) {
        return createInstance(r1, r2, r3, null);
    }

    public static CleverTapInstanceConfig createInstanceWithManifest(ManifestInfo r6, String r7, String r8, String r9, boolean r10) {
        return new CleverTapInstanceConfig(r6, r7, r8, r9, r10);
    }

    public static CleverTapInstanceConfig getDefaultInstance(Context r4) {
        ManifestInfo r42 = ManifestInfo.getInstance(r4);
        return createInstanceWithManifest(r42, r42.c(), r42.e(), r42.d(), true);
    }

    private String getDefaultSuffix(String r4) {
        StringBuilder r02 = new StringBuilder();
        r02.append(Constants.AES_PREFIX);
        if (TextUtils.isEmpty(r4) == true) goto L5;
        String r42 = ":" + r4;
    L6:
        r02.append(r42);
        r02.append(":");
        r02.append(this.accountId);
        r02.append(Constants.AES_SUFFIX);
        return r02.toString();
    L5:
        r42 = "";
        goto L6
    }

    private JSONArray getPushTypesArray() {
        JSONArray r02 = new JSONArray();
        Iterator<com.clevertap.android.sdk.pushnotification.h> r1 = getPushTypes().iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        com.clevertap.android.sdk.pushnotification.h r2 = r1.next();
        if (r2 == com.clevertap.android.sdk.pushnotification.e.f34774a) goto L4;
        r02.put(r2.f());
        goto L4
    L8:
        return r02;
    }

    public void addPushType(com.clevertap.android.sdk.pushnotification.h r2) {
        if (this.pushTypes.contains(r2) == true) goto L6;
        this.pushTypes.add(r2);
        return;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void enablePersonalization(boolean r1) {
        this.personalization = r1;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getAccountRegion() {
        return this.accountRegion;
    }

    public String getAccountToken() {
        return this.accountToken;
    }

    public String getCustomHandshakeDomain() {
        return this.customHandshakeDomain;
    }

    public int getDebugLevel() {
        return this.debugLevel;
    }

    public boolean getEnableCustomCleverTapId() {
        return this.enableCustomCleverTapId;
    }

    public int getEncryptionLevel() {
        return this.encryptionLevel;
    }

    public String getFcmSenderId() {
        return this.fcmSenderId;
    }

    public String[] getIdentityKeys() {
        return this.identityKeys;
    }

    public Logger getLogger() {
        if (this.logger != null) goto L6;
        this.logger = new Logger(this.debugLevel);
    L6:
        return this.logger;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getProxyDomain() {
        return this.proxyDomain;
    }

    public ArrayList<com.clevertap.android.sdk.pushnotification.h> getPushTypes() {
        return this.pushTypes;
    }

    public String getSpikyProxyDomain() {
        return this.spikyProxyDomain;
    }

    public boolean isAnalyticsOnly() {
        return this.analyticsOnly;
    }

    public boolean isBackgroundSync() {
        return this.backgroundSync;
    }

    public boolean isBeta() {
        return this.beta;
    }

    public boolean isCreatedPostAppLaunch() {
        return this.createdPostAppLaunch;
    }

    public boolean isDefaultInstance() {
        return this.isDefaultInstance;
    }

    public boolean isDisableAppLaunchedEvent() {
        return this.disableAppLaunchedEvent;
    }

    public boolean isEncryptionInTransitEnabled() {
        if (Integer.parseInt(this.encryptionInTransit) <= 0) goto L11;
        return true;
    L11:
        return false;
    L7:
        Logger.v("Invalid value passed in manifest for encryption in transit");
        return false;
    }

    public boolean isPersonalizationEnabled() {
        return this.personalization;
    }

    public boolean isSslPinningEnabled() {
        return this.sslPinning;
    }

    public boolean isUseGoogleAdId() {
        return this.useGoogleAdId;
    }

    public void log(String r2, String r3) {
        this.logger.verbose(getDefaultSuffix(r2), r3);
    }

    public void setAnalyticsOnly(boolean r1) {
        this.analyticsOnly = r1;
    }

    public void setBackgroundSync(boolean r1) {
        this.backgroundSync = r1;
    }

    public void setCreatedPostAppLaunch() {
        this.createdPostAppLaunch = true;
    }

    public void setCustomHandshakeDomain(String r1) {
        this.customHandshakeDomain = r1;
    }

    public void setDebugLevel(CleverTapAPI.LogLevel r1) {
        setDebugLevel(r1.intValue());
    }

    public void setDisableAppLaunchedEvent(boolean r1) {
        this.disableAppLaunchedEvent = r1;
    }

    public void setEnableCustomCleverTapId(boolean r1) {
        this.enableCustomCleverTapId = r1;
    }

    public void setEncryptionInTransit(boolean r1) {
        if (r1 == false) goto L4;
        String r12 = GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A;
    L5:
        this.encryptionInTransit = r12;
        return;
    L4:
        r12 = "0";
        goto L5
    }

    public void setEncryptionLevel(EncryptionLevel r1) {
        this.encryptionLevel = r1.intValue();
    }

    public void setIdentityKeys(String... r2) {
        if (this.isDefaultInstance == true) goto L6;
        this.identityKeys = r2;
        log("ON_USER_LOGIN", "Setting Profile Keys via setter: " + Arrays.toString(this.identityKeys));
        return;
    }

    public void setProxyDomain(String r1) {
        this.proxyDomain = r1;
    }

    public void setSpikyProxyDomain(String r1) {
        this.spikyProxyDomain = r1;
    }

    public String toJSONString() {
        JSONObject r02 = new JSONObject();
        r02.put(KEY_ACCOUNT_ID, getAccountId());     // Catch: Throwable -> L5
        r02.put(KEY_ACCOUNT_TOKEN, getAccountToken());     // Catch: Throwable -> L5
        r02.put(KEY_ACCOUNT_REGION, getAccountRegion());     // Catch: Throwable -> L5
        r02.put(KEY_PROXY_DOMAIN, getProxyDomain());     // Catch: Throwable -> L5
        r02.put(KEY_SPIKY_PROXY_DOMAIN, getSpikyProxyDomain());     // Catch: Throwable -> L5
        r02.put(KEY_CUSTOM_HANDSHAKE_DOMAIN, getCustomHandshakeDomain());     // Catch: Throwable -> L5
        r02.put(KEY_FCM_SENDER_ID, getFcmSenderId());     // Catch: Throwable -> L5
        r02.put(KEY_ANALYTICS_ONLY, isAnalyticsOnly());     // Catch: Throwable -> L5
        r02.put(KEY_DEFAULT_INSTANCE, isDefaultInstance());     // Catch: Throwable -> L5
        r02.put(KEY_USE_GOOGLE_AD_ID, isUseGoogleAdId());     // Catch: Throwable -> L5
        r02.put(KEY_DISABLE_APP_LAUNCHED, isDisableAppLaunchedEvent());     // Catch: Throwable -> L5
        r02.put(KEY_PERSONALIZATION, isPersonalizationEnabled());     // Catch: Throwable -> L5
        r02.put(KEY_DEBUG_LEVEL, getDebugLevel());     // Catch: Throwable -> L5
        r02.put(KEY_CREATED_POST_APP_LAUNCH, isCreatedPostAppLaunch());     // Catch: Throwable -> L5
        r02.put(KEY_SSL_PINNING, isSslPinningEnabled());     // Catch: Throwable -> L5
        r02.put(KEY_BACKGROUND_SYNC, isBackgroundSync());     // Catch: Throwable -> L5
        r02.put(KEY_ENABLE_CUSTOM_CT_ID, getEnableCustomCleverTapId());     // Catch: Throwable -> L5
        r02.put("packageName", getPackageName());     // Catch: Throwable -> L5
        r02.put(KEY_BETA, isBeta());     // Catch: Throwable -> L5
        r02.put(KEY_ENCRYPTION_LEVEL, getEncryptionLevel());     // Catch: Throwable -> L5
        r02.put(KEY_ENCRYPTION_IN_TRANSIT, this.encryptionInTransit);     // Catch: Throwable -> L5
        r02.put(KEY_PUSH_TYPES, getPushTypesArray());     // Catch: Throwable -> L5
        return r02.toString();
    L5:
        th = move-exception;
        Logger.v("Unable to convert config to JSON : ", th.getCause());
        return null;
    }

    public void useGoogleAdId(boolean r1) {
        this.useGoogleAdId = r1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeString(this.accountId);
        r1.writeString(this.accountToken);
        r1.writeString(this.accountRegion);
        r1.writeString(this.proxyDomain);
        r1.writeString(this.spikyProxyDomain);
        r1.writeString(this.customHandshakeDomain);
        r1.writeByte(this.analyticsOnly ? 1 : 0);
        r1.writeByte(this.isDefaultInstance ? 1 : 0);
        r1.writeByte(this.useGoogleAdId ? 1 : 0);
        r1.writeByte(this.disableAppLaunchedEvent ? 1 : 0);
        r1.writeByte(this.personalization ? 1 : 0);
        r1.writeInt(this.debugLevel);
        r1.writeByte(this.createdPostAppLaunch ? 1 : 0);
        r1.writeByte(this.sslPinning ? 1 : 0);
        r1.writeByte(this.backgroundSync ? 1 : 0);
        r1.writeByte(this.enableCustomCleverTapId ? 1 : 0);
        r1.writeString(this.fcmSenderId);
        r1.writeString(this.packageName);
        r1.writeByte(this.beta ? 1 : 0);
        r1.writeStringArray(this.identityKeys);
        r1.writeInt(this.encryptionLevel);
        r1.writeString(this.encryptionInTransit);
        r1.writeString(getPushTypesArray().toString());
    }

    public CleverTapInstanceConfig(CleverTapInstanceConfig r3) {
        this.pushTypes = PushNotificationUtil.b();
        this.identityKeys = Constants.NULL_STRING_ARRAY;
        this.accountId = r3.accountId;
        this.accountToken = r3.accountToken;
        this.accountRegion = r3.accountRegion;
        this.proxyDomain = r3.proxyDomain;
        this.spikyProxyDomain = r3.spikyProxyDomain;
        this.customHandshakeDomain = r3.customHandshakeDomain;
        this.isDefaultInstance = r3.isDefaultInstance;
        this.analyticsOnly = r3.analyticsOnly;
        this.personalization = r3.personalization;
        this.debugLevel = r3.debugLevel;
        this.logger = r3.logger;
        this.useGoogleAdId = r3.useGoogleAdId;
        this.disableAppLaunchedEvent = r3.disableAppLaunchedEvent;
        this.createdPostAppLaunch = r3.createdPostAppLaunch;
        this.sslPinning = r3.sslPinning;
        this.backgroundSync = r3.backgroundSync;
        this.enableCustomCleverTapId = r3.enableCustomCleverTapId;
        this.fcmSenderId = r3.fcmSenderId;
        this.packageName = r3.packageName;
        this.beta = r3.beta;
        this.identityKeys = r3.identityKeys;
        this.encryptionLevel = r3.encryptionLevel;
        Iterator<com.clevertap.android.sdk.pushnotification.h> r02 = r3.pushTypes.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        addPushType(r02.next());
        goto L4
    L6:
        this.encryptionInTransit = r3.encryptionInTransit;
    }

    public static CleverTapInstanceConfig createInstance(Context r1, String r2, String r3, String r4) {
        if (r2 == null) goto L7;
        if (r3 == null) goto L7;
        return createInstanceWithManifest(ManifestInfo.getInstance(r1), r2, r3, r4, false);
    L7:
        Logger.i("CleverTap accountId and accountToken cannot be null");
        return null;
    }

    public void log(String r2, String r3, Throwable r4) {
        this.logger.verbose(getDefaultSuffix(r2), r3, r4);
    }

    public void setDebugLevel(int r2) {
        this.debugLevel = r2;
        Logger r02 = this.logger;
        if (r02 == null) goto L6;
        r02.setDebugLevel(r2);
        return;
    }

    public static CleverTapInstanceConfig createInstance(String r1) {
        return new CleverTapInstanceConfig(r1);
    L4:
        return null;
    }

    private CleverTapInstanceConfig(ManifestInfo r2, String r3, String r4, String r5, boolean r6) {
        this.pushTypes = PushNotificationUtil.b();
        this.identityKeys = Constants.NULL_STRING_ARRAY;
        this.accountId = r3;
        this.accountToken = r4;
        this.accountRegion = r5;
        this.isDefaultInstance = r6;
        this.analyticsOnly = false;
        this.personalization = true;
        int r42 = CleverTapAPI.LogLevel.INFO.intValue();
        this.debugLevel = r42;
        this.logger = new Logger(r42);
        this.createdPostAppLaunch = false;
        this.useGoogleAdId = r2.x();
        this.disableAppLaunchedEvent = r2.s();
        this.sslPinning = r2.u();
        this.backgroundSync = r2.t();
        this.fcmSenderId = r2.j();
        this.packageName = r2.m();
        this.enableCustomCleverTapId = r2.w();
        this.beta = r2.b();
        if (this.isDefaultInstance == false) goto L5;
        this.encryptionLevel = r2.h();
        this.identityKeys = r2.n();
        log("ON_USER_LOGIN", "Setting Profile Keys from Manifest: " + Arrays.toString(this.identityKeys));
    L6:
        buildPushProvidersFromManifest(r2);
        String r22 = r2.g();
        if (r22 != null) goto L10;
        r22 = "0";
    L10:
        this.encryptionInTransit = r22;
        return;
    L5:
        this.encryptionLevel = 0;
        goto L6
    }

    private CleverTapInstanceConfig(String r27) throws Throwable {
        this.pushTypes = PushNotificationUtil.b();
        this.identityKeys = Constants.NULL_STRING_ARRAY;
        JSONObject r10 = new JSONObject(r27);     // Catch: Throwable -> L6
        if (r10.has(KEY_ACCOUNT_ID) == false) goto L9;
        this.accountId = r10.getString(KEY_ACCOUNT_ID);     // Catch: Throwable -> L6
    L9:
        if (r10.has(KEY_ACCOUNT_TOKEN) == false) goto L12;
        this.accountToken = r10.getString(KEY_ACCOUNT_TOKEN);     // Catch: Throwable -> L6
    L12:
        if (r10.has(KEY_PROXY_DOMAIN) == false) goto L15;
        this.proxyDomain = r10.getString(KEY_PROXY_DOMAIN);     // Catch: Throwable -> L6
    L15:
        if (r10.has(KEY_SPIKY_PROXY_DOMAIN) == false) goto L18;
        this.spikyProxyDomain = r10.getString(KEY_SPIKY_PROXY_DOMAIN);     // Catch: Throwable -> L6
    L18:
        if (r10.has(KEY_CUSTOM_HANDSHAKE_DOMAIN) == false) goto L21;
        this.customHandshakeDomain = r10.optString(KEY_CUSTOM_HANDSHAKE_DOMAIN, null);     // Catch: Throwable -> L6
    L21:
        if (r10.has(KEY_ACCOUNT_REGION) == false) goto L24;
        this.accountRegion = r10.getString(KEY_ACCOUNT_REGION);     // Catch: Throwable -> L6
    L24:
        if (r10.has(KEY_ANALYTICS_ONLY) == false) goto L27;
        this.analyticsOnly = r10.getBoolean(KEY_ANALYTICS_ONLY);     // Catch: Throwable -> L6
    L27:
        if (r10.has(KEY_DEFAULT_INSTANCE) == false) goto L30;
        this.isDefaultInstance = r10.getBoolean(KEY_DEFAULT_INSTANCE);     // Catch: Throwable -> L6
    L30:
        if (r10.has(KEY_USE_GOOGLE_AD_ID) == false) goto L33;
        this.useGoogleAdId = r10.getBoolean(KEY_USE_GOOGLE_AD_ID);     // Catch: Throwable -> L6
    L33:
        if (r10.has(KEY_DISABLE_APP_LAUNCHED) == false) goto L36;
        this.disableAppLaunchedEvent = r10.getBoolean(KEY_DISABLE_APP_LAUNCHED);     // Catch: Throwable -> L6
    L36:
        if (r10.has(KEY_PERSONALIZATION) == false) goto L39;
        this.personalization = r10.getBoolean(KEY_PERSONALIZATION);     // Catch: Throwable -> L6
    L39:
        if (r10.has(KEY_DEBUG_LEVEL) == false) goto L41;
        this.debugLevel = r10.getInt(KEY_DEBUG_LEVEL);     // Catch: Throwable -> L6
    L41:
        this.logger = new Logger(this.debugLevel);     // Catch: Throwable -> L6
        if (r10.has("packageName") == false) goto L45;
        this.packageName = r10.getString("packageName");     // Catch: Throwable -> L6
    L45:
        if (r10.has(KEY_CREATED_POST_APP_LAUNCH) == false) goto L48;
        this.createdPostAppLaunch = r10.getBoolean(KEY_CREATED_POST_APP_LAUNCH);     // Catch: Throwable -> L6
    L48:
        if (r10.has(KEY_SSL_PINNING) == false) goto L51;
        this.sslPinning = r10.getBoolean(KEY_SSL_PINNING);     // Catch: Throwable -> L6
    L51:
        if (r10.has(KEY_BACKGROUND_SYNC) == false) goto L54;
        this.backgroundSync = r10.getBoolean(KEY_BACKGROUND_SYNC);     // Catch: Throwable -> L6
    L54:
        if (r10.has(KEY_ENABLE_CUSTOM_CT_ID) == false) goto L57;
        this.enableCustomCleverTapId = r10.getBoolean(KEY_ENABLE_CUSTOM_CT_ID);     // Catch: Throwable -> L6
    L57:
        if (r10.has(KEY_FCM_SENDER_ID) == false) goto L60;
        this.fcmSenderId = r10.getString(KEY_FCM_SENDER_ID);     // Catch: Throwable -> L6
    L60:
        if (r10.has(KEY_BETA) == false) goto L63;
        this.beta = r10.getBoolean(KEY_BETA);     // Catch: Throwable -> L6
    L63:
        if (r10.has(KEY_IDENTITY_TYPES) == false) goto L66;
        this.identityKeys = (String[]) com.clevertap.android.sdk.utils.b.g(r10.getJSONArray(KEY_IDENTITY_TYPES));     // Catch: Throwable -> L6
    L66:
        if (r10.has(KEY_ENCRYPTION_LEVEL) == false) goto L69;
        this.encryptionLevel = r10.getInt(KEY_ENCRYPTION_LEVEL);     // Catch: Throwable -> L6
    L69:
        if (r10.has(KEY_PUSH_TYPES) == false) goto L77;
        JSONArray r02 = r10.getJSONArray(KEY_PUSH_TYPES);     // Catch: Throwable -> L6
        int r3 = 0;
    L72:
        if (r3 >= r02.length()) goto L77;
        com.clevertap.android.sdk.pushnotification.h r4 = com.clevertap.android.sdk.pushnotification.h.a(r02.getJSONObject(r3));     // Catch: Throwable -> L6
        if (r4 == null) goto L76;
        addPushType(r4);     // Catch: Throwable -> L6
    L76:
        r3 = r3 + 1;     // Catch: Throwable -> L6
    L77:
        this.encryptionInTransit = r10.optString(KEY_ENCRYPTION_IN_TRANSIT, "0");     // Catch: Throwable -> L6
        return;
    L6:
        th = move-exception;
        Logger.v("Error constructing CleverTapInstanceConfig from JSON: " + r27 + ": ", th.getCause());
        throw th;
    }

    private CleverTapInstanceConfig(Parcel r5) {
        this.pushTypes = PushNotificationUtil.b();
        this.identityKeys = Constants.NULL_STRING_ARRAY;
        this.accountId = r5.readString();
        this.accountToken = r5.readString();
        this.accountRegion = r5.readString();
        this.proxyDomain = r5.readString();
        this.spikyProxyDomain = r5.readString();
        this.customHandshakeDomain = r5.readString();
        int r1 = 0;
        boolean r2 = true;
        if (r5.readByte() == 0) goto L5;
        boolean r02 = true;
    L6:
        this.analyticsOnly = r02;
        if (r5.readByte() == 0) goto L9;
        boolean r03 = true;
    L10:
        this.isDefaultInstance = r03;
        if (r5.readByte() == 0) goto L13;
        boolean r04 = true;
    L14:
        this.useGoogleAdId = r04;
        if (r5.readByte() == 0) goto L17;
        boolean r05 = true;
    L18:
        this.disableAppLaunchedEvent = r05;
        if (r5.readByte() == 0) goto L21;
        boolean r06 = true;
    L22:
        this.personalization = r06;
        this.debugLevel = r5.readInt();
        if (r5.readByte() == 0) goto L25;
        boolean r07 = true;
    L26:
        this.createdPostAppLaunch = r07;
        if (r5.readByte() == 0) goto L29;
        boolean r08 = true;
    L30:
        this.sslPinning = r08;
        if (r5.readByte() == 0) goto L33;
        boolean r09 = true;
    L34:
        this.backgroundSync = r09;
        if (r5.readByte() == 0) goto L37;
        boolean r010 = true;
    L38:
        this.enableCustomCleverTapId = r010;
        this.fcmSenderId = r5.readString();
        this.packageName = r5.readString();
        this.logger = new Logger(this.debugLevel);
        if (r5.readByte() != 0) goto L42;
        r2 = false;
    L42:
        this.beta = r2;
        this.identityKeys = r5.createStringArray();
        this.encryptionLevel = r5.readInt();
        this.encryptionInTransit = r5.readString();
        JSONArray r011 = new JSONArray(r5.readString());     // Catch: JSONException -> L50
    L44:
        if (r1 >= r011.length()) goto L57;
        com.clevertap.android.sdk.pushnotification.h r52 = com.clevertap.android.sdk.pushnotification.h.a(r011.getJSONObject(r1));     // Catch: JSONException -> L50
        if (r52 == null) goto L49;
        addPushType(r52);     // Catch: JSONException -> L50
    L49:
        r1 = r1 + 1;
        goto L44
    L57:
        return;
    L50:
        Logger.v("Error in loading push providers from parcel, using firebase");
        return;
    L37:
        r010 = false;
        goto L38
    L33:
        r09 = false;
        goto L34
    L29:
        r08 = false;
        goto L30
    L25:
        r07 = false;
        goto L26
    L21:
        r06 = false;
        goto L22
    L17:
        r05 = false;
        goto L18
    L13:
        r04 = false;
        goto L14
    L9:
        r03 = false;
        goto L10
    L5:
        r02 = false;
        goto L6
    }
}
