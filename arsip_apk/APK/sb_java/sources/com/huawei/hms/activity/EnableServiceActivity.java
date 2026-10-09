package com.huawei.hms.activity;

import android.app.Activity;
import android.os.Bundle;
import com.huawei.hms.base.ui.R;

/* loaded from: classes6.dex */
public class EnableServiceActivity extends Activity {
    public EnableServiceActivity() {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle r1) {
        super.onCreate(r1);
        requestWindowFeature(1);
        setContentView(R.layout.activity_endisable_service);
    }
}
