package com.huawei.hms.api;

import com.huawei.hms.support.log.HMSLog;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class FailedBinderCallBack {
    private static final long AGING_TIME = 10000;
    public static final String CALLER_ID = "callId";
    private static final Object LOCK_OBJECT = null;
    private static final String TAG = "FailedBinderCallBack";
    private static Map<Long, BinderCallBack> binderCallBackMap;
    private static FailedBinderCallBack instance;

    public interface BinderCallBack {
        void binderCallBack(int r1);
    }

    static {
        binderCallBackMap = new ConcurrentHashMap();
        LOCK_OBJECT = new Object();
    }

    private FailedBinderCallBack() {
    }

    private void agingCheck() {
        long r02 = new Timestamp(System.currentTimeMillis()).getTime() - 10000;
        Iterator<Long> r2 = binderCallBackMap.keySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L8;
        Long r3 = r2.next();
        if (r02 < r3.longValue()) goto L4;
        binderCallBackMap.remove(r3);
        goto L4
    }

    public static FailedBinderCallBack getInstance() {
        Object r02 = LOCK_OBJECT;
        monitor-enter(r02);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (instance != null) goto L9;
        instance = new FailedBinderCallBack();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r02);     // Catch: Throwable -> L7
        return instance;
    }

    private void putCallBackInMap(Long r2, BinderCallBack r3) {
        if (binderCallBackMap != null) goto L6;
        HMSLog.e(TAG, "binderCallBackMap is null");
        return;
    L6:
        agingCheck();
        binderCallBackMap.put(r2, r3);
    }

    public BinderCallBack getCallBack(Long r2) {
        Map<Long, BinderCallBack> r02 = binderCallBackMap;
        if (r02 != null) goto L7;
        HMSLog.e(TAG, "binderCallBackMap is null");
        return null;
    L7:
        return r02.remove(r2);
    }

    public void setCallBack(Long r1, BinderCallBack r2) {
        putCallBackInMap(r1, r2);
    }
}
