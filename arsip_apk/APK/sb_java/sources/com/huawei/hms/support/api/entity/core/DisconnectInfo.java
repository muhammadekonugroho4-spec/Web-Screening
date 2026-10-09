package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.List;

/* loaded from: classes6.dex */
public class DisconnectInfo implements IMessageEntity {

    @Packed
    public List<String> apiNameList;

    @Packed
    public List<Scope> scopeList;

    public DisconnectInfo() {
    }

    public List<String> getApiNameList() {
        return this.apiNameList;
    }

    public List<Scope> getScopeList() {
        return this.scopeList;
    }

    public DisconnectInfo(List<Scope> r1, List<String> r2) {
        this.scopeList = r1;
        this.apiNameList = r2;
    }
}
