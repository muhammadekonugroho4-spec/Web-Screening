package com.huawei.hms.common.internal;

import android.app.Activity;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes6.dex */
public class ClientSettings {

    /* renamed from: a, reason: collision with root package name */
    private String f39098a;

    /* renamed from: b, reason: collision with root package name */
    private String f39099b;

    /* renamed from: c, reason: collision with root package name */
    private List<Scope> f39100c;
    private String d;

    /* renamed from: e, reason: collision with root package name */
    private List<String> f39101e;

    /* renamed from: f, reason: collision with root package name */
    private String f39102f;

    /* renamed from: g, reason: collision with root package name */
    private SubAppInfo f39103g;

    /* renamed from: h, reason: collision with root package name */
    private WeakReference<Activity> f39104h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f39105i;

    /* renamed from: j, reason: collision with root package name */
    private String f39106j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f39107k;

    public ClientSettings(String r1, String r2, List<Scope> r3, String r4, List<String> r5) {
        this.f39098a = r1;
        this.f39099b = r2;
        this.f39100c = r3;
        this.d = r4;
        this.f39101e = r5;
    }

    public List<String> getApiName() {
        return this.f39101e;
    }

    public String getAppID() {
        return this.d;
    }

    public String getClientClassName() {
        return this.f39099b;
    }

    public String getClientPackageName() {
        return this.f39098a;
    }

    public Activity getCpActivity() {
        WeakReference<Activity> r02 = this.f39104h;
        if (r02 != null) goto L7;
        return null;
    L7:
        return r02.get();
    }

    public String getCpID() {
        return this.f39102f;
    }

    public String getInnerHmsPkg() {
        return this.f39106j;
    }

    public List<Scope> getScopes() {
        return this.f39100c;
    }

    public SubAppInfo getSubAppID() {
        return this.f39103g;
    }

    public boolean isHasActivity() {
        return this.f39105i;
    }

    public boolean isUseInnerHms() {
        return this.f39107k;
    }

    public void setApiName(List<String> r1) {
        this.f39101e = r1;
    }

    public void setAppID(String r1) {
        this.d = r1;
    }

    public void setClientClassName(String r1) {
        this.f39099b = r1;
    }

    public void setClientPackageName(String r1) {
        this.f39098a = r1;
    }

    public void setCpActivity(Activity r2) {
        this.f39104h = new WeakReference(r2);
        this.f39105i = true;
    }

    public void setCpID(String r1) {
        this.f39102f = r1;
    }

    public void setInnerHmsPkg(String r1) {
        this.f39106j = r1;
    }

    public void setScopes(List<Scope> r1) {
        this.f39100c = r1;
    }

    public void setSubAppId(SubAppInfo r1) {
        this.f39103g = r1;
    }

    public void setUseInnerHms(boolean r1) {
        this.f39107k = r1;
    }

    public ClientSettings(String r1, String r2, List<Scope> r3, String r4, List<String> r5, SubAppInfo r6) {
        this(r1, r2, r3, r4, r5);
        this.f39103g = r6;
    }
}
