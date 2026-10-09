package com.google.firebase.installations.local;

import com.google.firebase.FirebaseApp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class PersistedInstallation {
    private static final String AUTH_TOKEN_KEY = "AuthToken";
    private static final String EXPIRES_IN_SECONDS_KEY = "ExpiresInSecs";
    private static final String FIREBASE_INSTALLATION_ID_KEY = "Fid";
    private static final String FIS_ERROR_KEY = "FisError";
    private static final String PERSISTED_STATUS_KEY = "Status";
    private static final String REFRESH_TOKEN_KEY = "RefreshToken";
    private static final String SETTINGS_FILE_NAME_PREFIX = "PersistedInstallation";
    private static final String TOKEN_CREATION_TIME_IN_SECONDS_KEY = "TokenCreationEpochInSecs";
    private File dataFile;
    private final FirebaseApp firebaseApp;

    public enum RegistrationStatus extends Enum<RegistrationStatus> {
        private static final /* synthetic */ RegistrationStatus[] $VALUES = null;
        public static final RegistrationStatus ATTEMPT_MIGRATION = null;
        public static final RegistrationStatus NOT_GENERATED = null;
        public static final RegistrationStatus REGISTERED = null;
        public static final RegistrationStatus REGISTER_ERROR = null;
        public static final RegistrationStatus UNREGISTERED = null;

        private static /* synthetic */ RegistrationStatus[] $values() {
            return new RegistrationStatus[]{ATTEMPT_MIGRATION, NOT_GENERATED, UNREGISTERED, REGISTERED, REGISTER_ERROR};
        }

        static {
            ATTEMPT_MIGRATION = new RegistrationStatus("ATTEMPT_MIGRATION", 0);
            NOT_GENERATED = new RegistrationStatus("NOT_GENERATED", 1);
            UNREGISTERED = new RegistrationStatus("UNREGISTERED", 2);
            REGISTERED = new RegistrationStatus("REGISTERED", 3);
            REGISTER_ERROR = new RegistrationStatus("REGISTER_ERROR", 4);
            $VALUES = $values();
        }

        RegistrationStatus(String r1, int r2) {
        }

        public static RegistrationStatus valueOf(String r1) {
            return (RegistrationStatus) Enum.valueOf(RegistrationStatus.class, r1);
        }

        public static RegistrationStatus[] values() {
            return (RegistrationStatus[]) $VALUES.clone();
        }
    }

    public PersistedInstallation(FirebaseApp r1) {
        this.firebaseApp = r1;
    }

    private File getDataFile() {
        if (this.dataFile != null) goto L15;
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L6:
        if (this.dataFile != null) goto L10;
        this.dataFile = new File(this.firebaseApp.getApplicationContext().getFilesDir(), "PersistedInstallation." + this.firebaseApp.getPersistenceKey() + ".json");     // Catch: Throwable -> L8
    L10:
        monitor-exit(this);     // Catch: Throwable -> L8
    L15:
        return this.dataFile;
    }

    private JSONObject readJSONFromFile() {
        ByteArrayOutputStream r02 = new ByteArrayOutputStream();
        byte[] r2 = new byte[16384];
        FileInputStream r3 = new FileInputStream(getDataFile());     // Catch: Throwable -> L19
    L23:
        int r5 = r3.read(r2, 0, 16384);     // Catch: Throwable -> L10
        if (r5 < 0) goto L7;
        r02.write(r2, 0, r5);     // Catch: Throwable -> L10
        goto L23
    L7:
        JSONObject r1 = new JSONObject(r02.toString());     // Catch: Throwable -> L10
        r3.close();     // Catch: Throwable -> L19 Throwable -> L19
        return r1;
    L10:
        th = move-exception;
        r3.close();     // Catch: Throwable -> L16
    L18:
        throw th;     // Catch: Throwable -> L19 Throwable -> L19
    L16:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L19 Throwable -> L19
        goto L18
    L20:
        return new JSONObject();
    }

    public void clearForTesting() {
        getDataFile().delete();
    }

    public PersistedInstallationEntry insertOrUpdatePersistedInstallationEntry(PersistedInstallationEntry r5) {
        JSONObject r02 = new JSONObject();     // Catch: Throwable -> L8
        r02.put(FIREBASE_INSTALLATION_ID_KEY, r5.getFirebaseInstallationId());     // Catch: Throwable -> L8
        r02.put(PERSISTED_STATUS_KEY, r5.getRegistrationStatus().ordinal());     // Catch: Throwable -> L8
        r02.put(AUTH_TOKEN_KEY, r5.getAuthToken());     // Catch: Throwable -> L8
        r02.put(REFRESH_TOKEN_KEY, r5.getRefreshToken());     // Catch: Throwable -> L8
        r02.put(TOKEN_CREATION_TIME_IN_SECONDS_KEY, r5.getTokenCreationEpochInSecs());     // Catch: Throwable -> L8
        r02.put(EXPIRES_IN_SECONDS_KEY, r5.getExpiresInSecs());     // Catch: Throwable -> L8
        r02.put(FIS_ERROR_KEY, r5.getFisError());     // Catch: Throwable -> L8
        File r1 = File.createTempFile(SETTINGS_FILE_NAME_PREFIX, "tmp", this.firebaseApp.getApplicationContext().getFilesDir());     // Catch: Throwable -> L8
        FileOutputStream r2 = new FileOutputStream(r1);     // Catch: Throwable -> L8
        r2.write(r02.toString().getBytes("UTF-8"));     // Catch: Throwable -> L8
        r2.close();     // Catch: Throwable -> L8
        if (r1.renameTo(getDataFile()) == true) goto L7;
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");     // Catch: Throwable -> L8
    L7:
        return r5;
    }

    public PersistedInstallationEntry readPersistedInstallationEntryValue() {
        JSONObject r02 = readJSONFromFile();
        String r1 = r02.optString(FIREBASE_INSTALLATION_ID_KEY, null);
        int r3 = r02.optInt(PERSISTED_STATUS_KEY, RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        String r4 = r02.optString(AUTH_TOKEN_KEY, null);
        String r5 = r02.optString(REFRESH_TOKEN_KEY, null);
        long r9 = r02.optLong(TOKEN_CREATION_TIME_IN_SECONDS_KEY, 0);
        long r6 = r02.optLong(EXPIRES_IN_SECONDS_KEY, 0);
        String r03 = r02.optString(FIS_ERROR_KEY, null);
        return PersistedInstallationEntry.builder().setFirebaseInstallationId(r1).setRegistrationStatus(RegistrationStatus.values()[r3]).setAuthToken(r4).setRefreshToken(r5).setTokenCreationEpochInSecs(r9).setExpiresInSecs(r6).setFisError(r03).build();
    }
}
