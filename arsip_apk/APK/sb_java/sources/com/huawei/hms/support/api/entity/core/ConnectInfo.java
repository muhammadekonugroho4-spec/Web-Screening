package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.List;

/* loaded from: classes6.dex */
public class ConnectInfo implements IMessageEntity {

    /* renamed from: a, reason: collision with root package name */
    @Packed
    private List<String> f39472a;

    /* renamed from: b, reason: collision with root package name */
    @Packed
    private List<Scope> f39473b;

    /* renamed from: c, reason: collision with root package name */
    @Packed
    private String f39474c;

    @Packed
    private String d;

    public ConnectInfo() {
    }

    public List<String> getApiNameList() {
        return this.f39472a;
    }

    public String getFingerprint() {
        return this.f39474c;
    }

    public List<Scope> getScopeList() {
        return this.f39473b;
    }

    public String getSubAppID() {
        return this.d;
    }

    public void setApiNameList(List<String> r1) {
        this.f39472a = r1;
    }

    public void setFingerprint(String r1) {
        this.f39474c = r1;
    }

    public void setScopeList(List<Scope> r1) {
        this.f39473b = r1;
    }

    public void setSubAppID(String r1) {
        this.d = r1;
    }

    public ConnectInfo(List<String> r1, List<Scope> r2, String r3, String r4) {
        this.f39472a = r1;
        this.f39473b = r2;
        this.f39474c = r3;
        this.d = r4;
    }
}
