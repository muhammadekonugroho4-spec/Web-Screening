package com.huawei.hms.ui;

import android.content.Context;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* loaded from: classes6.dex */
public abstract class AbstractPromptDialog extends AbstractDialog {
    public AbstractPromptDialog() {
    }

    @Override // com.huawei.hms.ui.AbstractDialog
    public String onGetNegativeButtonString(Context r1) {
        return null;
    }

    @Override // com.huawei.hms.ui.AbstractDialog
    public String onGetTitleString(Context r2) {
        if (ResourceLoaderUtil.getmContext() != null) goto L6;
        ResourceLoaderUtil.setmContext(r2);
    L6:
        return ResourceLoaderUtil.getString("hms_bindfaildlg_title");
    }
}
