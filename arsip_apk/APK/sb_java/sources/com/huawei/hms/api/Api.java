package com.huawei.hms.api;

import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.common.api.ConnectionPostProcessor;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public class Api<O extends ApiOptions> {
    private final String mApiName;
    public List<ConnectionPostProcessor> mConnetctPostList;
    private final Options<O> mOption;

    public interface ApiOptions {

        public interface HasOptions extends ApiOptions {
        }

        public static final class NoOptions implements NotRequiredOptions {
            public NoOptions() {
            }
        }

        public interface NotRequiredOptions extends ApiOptions {
        }

        public interface Optional extends HasOptions, NotRequiredOptions {
        }
    }

    public static abstract class Options<O> {
        public Options() {
        }

        public List<PermissionInfo> getPermissionInfoList(O r1) {
            return Collections.EMPTY_LIST;
        }

        public List<Scope> getScopeList(O r1) {
            return Collections.EMPTY_LIST;
        }
    }

    public Api(String r1) {
        this.mApiName = r1;
        this.mOption = null;
    }

    public String getApiName() {
        return this.mApiName;
    }

    public Options<O> getOptions() {
        return this.mOption;
    }

    public List<ConnectionPostProcessor> getmConnetctPostList() {
        return this.mConnetctPostList;
    }

    public void setmConnetctPostList(List<ConnectionPostProcessor> r1) {
        this.mConnetctPostList = r1;
    }

    public Api(String r1, Options<O> r2) {
        this.mApiName = r1;
        this.mOption = r2;
    }
}
