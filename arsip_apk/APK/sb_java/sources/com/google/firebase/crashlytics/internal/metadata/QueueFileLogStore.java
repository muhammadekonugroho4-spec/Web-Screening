package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes6.dex */
class QueueFileLogStore implements FileLogStore {
    private static final Charset UTF_8 = null;
    private QueueFile logFile;
    private final int maxLogSize;
    private final File workingFile;

    public static class LogBytes {
        public final byte[] bytes;
        public final int offset;

        public LogBytes(byte[] r1, int r2) {
            this.bytes = r1;
            this.offset = r2;
        }
    }

    static {
        UTF_8 = Charset.forName("UTF-8");
    }

    public QueueFileLogStore(File r1, int r2) {
        this.workingFile = r1;
        this.maxLogSize = r2;
    }

    private void doWriteToLog(long r5, String r7) {
        if (this.logFile == null) goto L25;
        if (r7 != null) goto L21;
        r7 = "null";
    L21:
        int r1 = this.maxLogSize / 4;     // Catch: IOException -> L10
        if (r7.length() <= r1) goto L12;
        r7 = "..." + r7.substring(r7.length() - r1);     // Catch: IOException -> L10
    L12:
        this.logFile.add(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(r5), r7.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes(UTF_8));     // Catch: IOException -> L10
    L13:
        if (this.logFile.isEmpty() == true) goto L27;
        if (this.logFile.usedBytes() <= this.maxLogSize) goto L26;
        this.logFile.remove();     // Catch: IOException -> L10
        goto L13
    L26:
        return;
    L27:
        return;
    L10:
        e = move-exception;
        Logger.getLogger().e("There was a problem writing to the Crashlytics log.", e);
        return;
    }

    private LogBytes getLogBytes() {
        if (this.workingFile.exists() == true) goto L5;
        return null;
    L5:
        openLogFile();
        QueueFile r02 = this.logFile;
        if (r02 != null) goto L8;
        return null;
    L8:
        final int[] r2 = {0};
        final byte[] r03 = new byte[r02.usedBytes()];
        this.logFile.forEach(new AnonymousClass1(this, r03, r2));     // Catch: IOException -> L11
    L14:
        return new LogBytes(r03, r2[0]);
    L11:
        e = move-exception;
        Logger.getLogger().e("A problem occurred while reading the Crashlytics log file.", e);
        goto L14
    }

    private void openLogFile() {
        if (this.logFile != null) goto L11;
        this.logFile = new QueueFile(this.workingFile);     // Catch: IOException -> L6
        return;
    L6:
        e = move-exception;
        Logger.getLogger().e("Could not open log file: " + this.workingFile, e);
        return;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void closeLogFile() {
        CommonUtils.closeOrLog(this.logFile, "There was a problem closing the Crashlytics log file.");
        this.logFile = null;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void deleteLogFile() {
        closeLogFile();
        this.workingFile.delete();
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public byte[] getLogAsBytes() {
        LogBytes r02 = getLogBytes();
        if (r02 != null) goto L6;
        return null;
    L6:
        int r1 = r02.offset;
        byte[] r2 = new byte[r1];
        System.arraycopy(r02.bytes, 0, r2, 0, r1);
        return r2;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public String getLogAsString() {
        byte[] r02 = getLogAsBytes();
        if (r02 != null) goto L5;
        return null;
    L5:
        return new String(r02, UTF_8);
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void writeToLog(long r1, String r3) {
        openLogFile();
        doWriteToLog(r1, r3);
    }
}
