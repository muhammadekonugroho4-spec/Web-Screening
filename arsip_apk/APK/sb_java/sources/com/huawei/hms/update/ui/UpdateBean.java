package com.huawei.hms.update.ui;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class UpdateBean implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private boolean f39500a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f39501b;

    /* renamed from: c, reason: collision with root package name */
    private String f39502c;
    private int d;

    /* renamed from: e, reason: collision with root package name */
    private String f39503e;

    /* renamed from: f, reason: collision with root package name */
    private String f39504f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f39505g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f39506h;

    public UpdateBean() {
        this.f39506h = true;
    }

    private static <T> T a(T r02) {
        return r02;
    }

    public String getClientAppId() {
        return (String) a(this.f39503e);
    }

    public String getClientAppName() {
        return (String) a(this.f39504f);
    }

    public String getClientPackageName() {
        return (String) a(this.f39502c);
    }

    public int getClientVersionCode() {
        return ((Integer) a(Integer.valueOf(this.d))).intValue();
    }

    public boolean getResolutionInstallHMS() {
        return this.f39501b;
    }

    public ArrayList getTypeList() {
        return (ArrayList) a(this.f39505g);
    }

    public boolean isHmsOrApkUpgrade() {
        return ((Boolean) a(Boolean.valueOf(this.f39500a))).booleanValue();
    }

    public boolean isNeedConfirm() {
        return ((Boolean) a(Boolean.valueOf(this.f39506h))).booleanValue();
    }

    public void setClientAppId(String r1) {
        this.f39503e = r1;
    }

    public void setClientAppName(String r1) {
        this.f39504f = r1;
    }

    public void setClientPackageName(String r1) {
        this.f39502c = r1;
    }

    public void setClientVersionCode(int r1) {
        this.d = r1;
    }

    public void setHmsOrApkUpgrade(boolean r1) {
        this.f39500a = r1;
    }

    public void setNeedConfirm(boolean r1) {
        this.f39506h = r1;
    }

    public void setResolutionInstallHMS(boolean r1) {
        this.f39501b = r1;
    }

    public void setTypeList(ArrayList r1) {
        this.f39505g = r1;
    }
}
