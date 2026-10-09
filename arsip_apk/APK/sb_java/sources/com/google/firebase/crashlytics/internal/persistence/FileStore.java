package com.google.firebase.crashlytics.internal.persistence;

import android.content.Context;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.ProcessDetailsProvider;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public class FileStore {
    private static final String CRASHLYTICS_PATH_V1 = ".com.google.firebase.crashlytics.files.v1";
    private static final String CRASHLYTICS_PATH_V2 = ".com.google.firebase.crashlytics.files.v2";
    private static final String CRASHLYTICS_PATH_V3 = ".crashlytics.v3";
    private static final String NATIVE_REPORTS_PATH = "native-reports";
    private static final String NATIVE_SESSION_SUBDIR = "native";
    private static final String PRIORITY_REPORTS_PATH = "priority-reports";
    private static final String REPORTS_PATH = "reports";
    private static final String SESSIONS_PATH = "open-sessions";
    private final File crashlyticsDir;
    private final File filesDir;
    private final File nativeReportsDir;
    private final File priorityReportsDir;
    final String processName;
    private final File reportsDir;
    private final File sessionsDir;

    public FileStore(Context r4) {
        String r02 = ProcessDetailsProvider.INSTANCE.getCurrentProcessDetails(r4).getProcessName();
        this.processName = r02;
        File r42 = r4.getFilesDir();
        this.filesDir = r42;
        if (useV3FileSystem() == false) goto L5;
        String r03 = CRASHLYTICS_PATH_V3 + File.separator + sanitizeName(r02);
    L6:
        File r43 = prepareBaseDir(new File(r42, r03));
        this.crashlyticsDir = r43;
        this.sessionsDir = prepareBaseDir(new File(r43, SESSIONS_PATH));
        this.reportsDir = prepareBaseDir(new File(r43, REPORTS_PATH));
        this.priorityReportsDir = prepareBaseDir(new File(r43, PRIORITY_REPORTS_PATH));
        this.nativeReportsDir = prepareBaseDir(new File(r43, NATIVE_REPORTS_PATH));
        return;
    L5:
        r03 = CRASHLYTICS_PATH_V1;
        goto L6
    }

    public static /* synthetic */ boolean a(String r02, File r1, String r2) {
        return r2.startsWith(r02);
    }

    private void cleanupFileSystemDir(String r4) {
        File r02 = new File(this.filesDir, r4);
        if (r02.exists() == true) goto L5;
        return;
    L5:
        if (recursiveDelete(r02) == false) goto L9;
        Logger.getLogger().d("Deleted previous Crashlytics file system: " + r02.getPath());
        return;
    }

    private void cleanupFileSystemDirs(final String r4) {
        if (this.filesDir.exists() == false) goto L9;
        String[] r42 = this.filesDir.list(new e(r4));
        if (r42 == null) goto L11;
        int r02 = r42.length;
        int r1 = 0;
    L7:
        if (r1 >= r02) goto L12;
        cleanupFileSystemDir(r42[r1]);
        r1 = r1 + 1;
        goto L7
    L12:
        return;
    L11:
        return;
    }

    private File getSessionDir(String r3) {
        return prepareDir(new File(this.sessionsDir, r3));
    }

    private static synchronized File prepareBaseDir(File r4) {
        monitor-enter(FileStore.class);
    L11:
        th = move-exception;
        throw th;
    L5:
        if (r4.exists() == false) goto L14;
        if (r4.isDirectory() == false) goto L10;
        monitor-exit(FileStore.class);
        return r4;
    L10:
        Logger.getLogger().d("Unexpected non-directory file: " + r4 + "; deleting file and creating new directory.");     // Catch: Throwable -> L11
        r4.delete();     // Catch: Throwable -> L11
    L14:
        if (r4.mkdirs() == true) goto L16;
        Logger.getLogger().e("Could not create Crashlytics-specific directory: " + r4);     // Catch: Throwable -> L11
    L16:
        monitor-exit(FileStore.class);
        return r4;
    }

    private static File prepareDir(File r02) {
        r02.mkdirs();
        return r02;
    }

    public static boolean recursiveDelete(File r4) {
        File[] r02 = r4.listFiles();
        if (r02 == null) goto L8;
        int r1 = r02.length;
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L8;
        recursiveDelete(r02[r2]);
        r2 = r2 + 1;
    L8:
        return r4.delete();
    }

    private static <T> List<T> safeArrayToList(T[] r02) {
        if (r02 != null) goto L6;
        return Collections.EMPTY_LIST;
    L6:
        return Arrays.asList(r02);
    }

    public static String sanitizeName(String r2) {
        if (r2.length() <= 40) goto L7;
        return CommonUtils.sha1(r2);
    L7:
        return r2.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    private boolean useV3FileSystem() {
        return !this.processName.isEmpty();
    }

    public void cleanupPreviousFileSystems() {
        cleanupFileSystemDir(".com.google.firebase.crashlytics");
        cleanupFileSystemDir(".com.google.firebase.crashlytics-ndk");
        if (useV3FileSystem() == false) goto L6;
        cleanupFileSystemDir(CRASHLYTICS_PATH_V1);
        cleanupFileSystemDirs(CRASHLYTICS_PATH_V2 + File.pathSeparator);
        return;
    }

    public void deleteAllCrashlyticsFiles() {
        recursiveDelete(this.crashlyticsDir);
    }

    public boolean deleteSessionFiles(String r3) {
        return recursiveDelete(new File(this.sessionsDir, r3));
    }

    public List<String> getAllOpenSessionIds() {
        return safeArrayToList(this.sessionsDir.list());
    }

    public File getCommonFile(String r3) {
        return new File(this.crashlyticsDir, r3);
    }

    public List<File> getCommonFiles(FilenameFilter r2) {
        return safeArrayToList(this.crashlyticsDir.listFiles(r2));
    }

    public File getNativeReport(String r3) {
        return new File(this.nativeReportsDir, r3);
    }

    public List<File> getNativeReports() {
        return safeArrayToList(this.nativeReportsDir.listFiles());
    }

    public File getNativeSessionDir(String r3) {
        return prepareDir(new File(getSessionDir(r3), NATIVE_SESSION_SUBDIR));
    }

    public File getPriorityReport(String r3) {
        return new File(this.priorityReportsDir, r3);
    }

    public List<File> getPriorityReports() {
        return safeArrayToList(this.priorityReportsDir.listFiles());
    }

    public File getReport(String r3) {
        return new File(this.reportsDir, r3);
    }

    public List<File> getReports() {
        return safeArrayToList(this.reportsDir.listFiles());
    }

    public File getSessionFile(String r2, String r3) {
        return new File(getSessionDir(r2), r3);
    }

    public List<File> getSessionFiles(String r1, FilenameFilter r2) {
        return safeArrayToList(getSessionDir(r1).listFiles(r2));
    }
}
