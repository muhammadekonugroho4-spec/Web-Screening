package com.huawei.hms.common.internal;

import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.StringUtil;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes6.dex */
public class TransactionIdCreater {
    public TransactionIdCreater() {
    }

    private static SecureRandom a() {
        return SecureRandom.getInstance("SHA1PRNG");
    L4:
        HMSLog.e("TransactionIdCreater", "SecureRandom getInstance happpened NoSuchAlgorithmException!");
        return new SecureRandom();
    }

    public static String getId(String r3, String r4) {
        StringBuilder r02 = new StringBuilder();
        r02.append(StringUtil.addByteForNum(r3, 9, '0'));
        r02.append(StringUtil.addByteForNum(r4, 6, '0'));
        Locale r42 = Locale.ENGLISH;
        r02.append(new SimpleDateFormat("yyyyMMddHHmmssSSS", r42).format(new Date()));
        r02.append(String.format(r42, "%06d", new Object[]{Integer.valueOf(a().nextInt(1000000))}));
        return r02.toString();
    }
}
