package com.huawei.hms.framework.common;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.libcore.io.ExternalStorageFile;
import com.huawei.libcore.io.ExternalStorageFileInputStream;
import com.huawei.libcore.io.ExternalStorageFileOutputStream;
import com.huawei.libcore.io.ExternalStorageRandomAccessFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;

/* loaded from: classes6.dex */
public class CreateFileUtil {
    private static final String EXTERNAL_FILE_NAME = "com.huawei.libcore.io.ExternalStorageFile";
    private static final String EXTERNAL_INPUTSTREAM_NAME = "com.huawei.libcore.io.ExternalStorageFileInputStream";
    private static final String EXTERNAL_OUTPUTSTREAM_NAME = "com.huawei.libcore.io.ExternalStorageFileOutputStream";
    private static final String RANDOM_ACCESS_FILE_NAME = "com.huawei.libcore.io.ExternalStorageRandomAccessFile";
    private static final String TAG = "CreateFileUtil";

    public CreateFileUtil() {
    }

    public static void deleteSecure(File r1) {
        if (r1 != null) goto L4;
        return;
    L4:
        if (r1.exists() == true) goto L6;
        return;
    L6:
        if (r1.delete() == true) goto L11;
        Logger.w(TAG, "deleteSecure exception");
        return;
    }

    public static String getCacheDirPath(Context r02) {
        if (r02 != null) goto L6;
        return "";
    L6:
        return ContextCompat.getProtectedStorageContext(r02).getCacheDir().getPath();
    }

    public static String getCanonicalPath(String r3) {
        return newFile(r3).getCanonicalPath();
    L9:
        e = move-exception;
        Logger.w(TAG, "the canonicalPath has IOException", e);
    L14:
        return r3;
    L7:
        e = move-exception;
        Logger.w(TAG, "the canonicalPath has securityException", e);
    L5:
        e = move-exception;
        Logger.w(TAG, "the canonicalPath has other Exception", e);
        goto L14
    }

    @Deprecated
    public static boolean isPVersion() {
        return EmuiUtil.isUpPVersion();
    }

    public static File newFile(String r1) {
        if (r1 != null) goto L6;
        return null;
    L6:
        if (EmuiUtil.isUpPVersion() == false) goto L12;
        if (ReflectionUtils.checkCompatible(EXTERNAL_FILE_NAME) == false) goto L12;
        return new ExternalStorageFile(r1);
    L12:
        return new File(r1);
    }

    public static FileInputStream newFileInputStream(String r1) throws FileNotFoundException {
        if (r1 != null) goto L4;
        Logger.w(TAG, "newFileInputStream  file is null");
        throw new FileNotFoundException("file is null");
    L4:
        if (EmuiUtil.isUpPVersion() == false) goto L10;
        if (ReflectionUtils.checkCompatible(EXTERNAL_INPUTSTREAM_NAME) == false) goto L10;
        return new ExternalStorageFileInputStream(r1);
    L10:
        return new FileInputStream(r1);
    }

    public static FileOutputStream newFileOutputStream(File r1) throws FileNotFoundException {
        if (r1 != null) goto L4;
        Logger.e(TAG, "newFileOutputStream  file is null");
        throw new FileNotFoundException("file is null");
    L4:
        if (EmuiUtil.isUpPVersion() == false) goto L10;
        if (ReflectionUtils.checkCompatible(EXTERNAL_OUTPUTSTREAM_NAME) == false) goto L10;
        return new ExternalStorageFileOutputStream(r1);
    L10:
        return new FileOutputStream(r1);
    }

    public static RandomAccessFile newRandomAccessFile(String r1, String r2) throws FileNotFoundException {
        if (r1 != null) goto L4;
        Logger.w(TAG, "newFileOutputStream  file is null");
        throw new FileNotFoundException("file is null");
    L4:
        if (EmuiUtil.isUpPVersion() == false) goto L10;
        if (ReflectionUtils.checkCompatible(RANDOM_ACCESS_FILE_NAME) == false) goto L10;
        return new ExternalStorageRandomAccessFile(r1, r2);
    L10:
        return new RandomAccessFile(r1, r2);
    }

    public static void deleteSecure(String r1) {
        if (TextUtils.isEmpty(r1) == true) goto L6;
        deleteSecure(newFile(r1));
        return;
    }
}
