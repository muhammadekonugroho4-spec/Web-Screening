package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes6.dex */
class CrashlyticsAppQualitySessionsStore {
    private static final String AQS_SESSION_ID_FILENAME_PREFIX = "aqs.";
    private static final FilenameFilter AQS_SESSION_ID_FILE_FILTER = null;
    private static final Comparator<File> FILE_RECENCY_COMPARATOR = null;
    private String appQualitySessionId;
    private final FileStore fileStore;
    private String sessionId;

    static {
        AQS_SESSION_ID_FILE_FILTER = new C4625a();
        FILE_RECENCY_COMPARATOR = new b();
    }

    public CrashlyticsAppQualitySessionsStore(FileStore r2) {
        this.sessionId = null;
        this.appQualitySessionId = null;
        this.fileStore = r2;
    }

    public static /* synthetic */ boolean a(File r02, String r1) {
        return r1.startsWith(AQS_SESSION_ID_FILENAME_PREFIX);
    }

    public static /* synthetic */ int b(File r2, File r3) {
        return Long.compare(r3.lastModified(), r2.lastModified());
    }

    private static void persist(FileStore r2, String r3, String r4) {
        if (r3 == null) goto L11;
        if (r4 == null) goto L12;
        r2.getSessionFile(r3, AQS_SESSION_ID_FILENAME_PREFIX + r4).createNewFile();     // Catch: IOException -> L6
        return;
    L6:
        e = move-exception;
        Logger.getLogger().w("Failed to persist App Quality Sessions session id.", e);
        return;
    L12:
        return;
    }

    public static String readAqsSessionIdFile(FileStore r1, String r2) {
        List<File> r12 = r1.getSessionFiles(r2, AQS_SESSION_ID_FILE_FILTER);
        if (r12.isEmpty() == false) goto L7;
        Logger.getLogger().w("Unable to read App Quality Sessions session id.");
        return null;
    L7:
        return ((File) Collections.min(r12, FILE_RECENCY_COMPARATOR)).getName().substring(4);
    }

    public synchronized String getAppQualitySessionId(String r2) {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (Objects.equals(this.sessionId, r2) == false) goto L10;
        String r22 = this.appQualitySessionId;     // Catch: Throwable -> L8
        monitor-exit(this);
        return r22;
    L10:
        String r23 = readAqsSessionIdFile(this.fileStore, r2);     // Catch: Throwable -> L8
        monitor-exit(this);
        return r23;
    }

    public synchronized void rotateAppQualitySessionId(String r3) {
        monitor-enter(this);
    L7:
        th = move-exception;
        throw th;
    L4:
        if (Objects.equals(this.appQualitySessionId, r3) == true) goto L9;
        persist(this.fileStore, this.sessionId, r3);     // Catch: Throwable -> L7
        this.appQualitySessionId = r3;     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
    }

    public synchronized void rotateSessionId(String r3) {
        monitor-enter(this);
    L7:
        th = move-exception;
        throw th;
    L4:
        if (Objects.equals(this.sessionId, r3) == true) goto L9;
        persist(this.fileStore, r3, this.appQualitySessionId);     // Catch: Throwable -> L7
        this.sessionId = r3;     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
    }
}
