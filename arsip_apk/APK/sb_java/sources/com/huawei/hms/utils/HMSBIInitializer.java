package com.huawei.hms.utils;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.framework.network.grs.IQueryUrlCallBack;
import com.huawei.hms.hatool.HmsHiAnalyticsUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class HMSBIInitializer {
    private static final Object d = null;

    /* renamed from: e, reason: collision with root package name */
    private static HMSBIInitializer f39520e;

    /* renamed from: f, reason: collision with root package name */
    private static HiAnalyticsInstance f39521f;

    /* renamed from: a, reason: collision with root package name */
    private final Context f39522a;

    /* renamed from: b, reason: collision with root package name */
    private AtomicBoolean f39523b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f39524c;

    public class a implements IQueryUrlCallBack {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ HMSBIInitializer f39525a;

        public a(HMSBIInitializer r1) {
            this.f39525a = r1;
        }

        @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
        public void onCallBackFail(int r3) {
            HMSLog.e("HMSBIInitializer", "get grs failed, the errorcode is " + r3);
            HMSBIInitializer.c(this.f39525a).set(false);
        }

        @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
        public void onCallBackSuccess(String r9) {
            if (TextUtils.isEmpty(r9) == false) goto L5;
        L9:
            HMSBIInitializer.c(this.f39525a).set(false);
            return;
        L5:
            if (HMSBIInitializer.a(this.f39525a) == true) goto L7;
            HmsHiAnalyticsUtils.init(HMSBIInitializer.b(this.f39525a), false, false, false, r9, "com.huawei.hwid");
        L8:
            HMSLog.i("HMSBIInitializer", "BI URL acquired successfully");
            goto L9
        L7:
            HiAnalyticsConfig r92 = new HiAnalyticsConfig.Builder().setEnableImei(false).setEnableUDID(false).setEnableSN(false).setCollectURL(r9).build();
            HiAnalyticsConfig r02 = new HiAnalyticsConfig.Builder().setEnableImei(false).setEnableUDID(false).setEnableSN(false).setCollectURL(r9).build();
            HMSBIInitializer.a(new HiAnalyticsInstance.Builder(HMSBIInitializer.b(this.f39525a)).setOperConf(r92).setMaintConf(r02).create(HiAnalyticsConstant.HA_SERVICE_TAG));
            HMSBIInitializer.a().setAppid("com.huawei.hwid");
            goto L8
        }
    }

    public class b extends AsyncTask<String, Integer, Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ HMSBIInitializer f39526a;

        private b(HMSBIInitializer r1) {
            this.f39526a = r1;
        }

        public Void a(String... r3) {
            HMSBIInitializer.a(this.f39526a, r3[0]);
            return null;
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Void doInBackground(String[] r1) {
            return a(r1);
        }

        public /* synthetic */ b(HMSBIInitializer r1, a r2) {
            this(r1);
        }
    }

    static {
        d = new Object();
    }

    private HMSBIInitializer(Context r3) {
        this.f39523b = new AtomicBoolean(false);
        this.f39522a = r3;
        this.f39524c = com.huawei.hms.stats.b.a();
    }

    public static /* synthetic */ void a(HMSBIInitializer r02, String r1) {
        r02.a(r1);
    }

    public static /* synthetic */ Context b(HMSBIInitializer r02) {
        return r02.f39522a;
    }

    public static /* synthetic */ AtomicBoolean c(HMSBIInitializer r02) {
        return r02.f39523b;
    }

    public static HMSBIInitializer getInstance(Context r2) {
        Object r02 = d;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (f39520e != null) goto L12;
        Context r1 = r2.getApplicationContext();     // Catch: Throwable -> L9
        if (r1 == null) goto L11;
        f39520e = new HMSBIInitializer(r1);     // Catch: Throwable -> L9
        goto L12
    L11:
        f39520e = new HMSBIInitializer(r2);     // Catch: Throwable -> L9
    L12:
        monitor-exit(r02);     // Catch: Throwable -> L9
        return f39520e;
    }

    public HiAnalyticsInstance getAnalyticsInstance() {
        return f39521f;
    }

    public void initBI() {
        if (this.f39524c == true) goto L5;
        boolean r02 = HmsHiAnalyticsUtils.getInitFlag();
    L6:
        HMSLog.i("HMSBIInitializer", "Builder->biInitFlag :" + r02);
        if (r02 == false) goto L10;
        return;
    L10:
        if (AnalyticsSwitchHolder.isAnalyticsDisabled(this.f39522a) == false) goto L12;
        return;
    L12:
        HMSLog.i("HMSBIInitializer", "Builder->biInitFlag : start initHaSDK");
        initHaSDK();
        return;
    L5:
        r02 = HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
        goto L6
    }

    public void initHaSDK() {
        if (this.f39523b.compareAndSet(false, true) == false) goto L16;
        String r02 = GrsApp.getInstance().getIssueCountryCode(this.f39522a);
        if (TextUtils.isEmpty(r02) == true) goto L8;
        r02 = r02.toUpperCase(Locale.ENGLISH);
    L8:
        if (GrsBaseInfo.CountryCodeSource.UNKNOWN.equalsIgnoreCase(r02) == false) goto L10;
    L14:
        HMSLog.e("HMSBIInitializer", "Failed to get device issue country");
        this.f39523b.set(false);
        return;
    L10:
        if (TextUtils.isEmpty(r02) == true) goto L14;
        new b(this, null).execute(new String[]{r02});
        return;
    }

    public boolean isInit() {
        if (this.f39524c == true) goto L7;
        return HmsHiAnalyticsUtils.getInitFlag();
    L7:
        return HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
    }

    public static /* synthetic */ boolean a(HMSBIInitializer r02) {
        return r02.f39524c;
    }

    public static /* synthetic */ HiAnalyticsInstance a() {
        return f39521f;
    }

    public static /* synthetic */ HiAnalyticsInstance a(HiAnalyticsInstance r02) {
        f39521f = r02;
        return r02;
    }

    private void a(String r4) {
        HMSLog.i("HMSBIInitializer", "Start to query GRS");
        GrsBaseInfo r02 = new GrsBaseInfo();
        r02.setIssueCountry(r4);
        new GrsClient(this.f39522a, r02).ayncGetGrsUrl("com.huawei.cloud.opensdkhianalytics", "ROOTV2", new a(this));
    }
}
