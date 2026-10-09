package dagger.android;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes2.dex */
public abstract class DaggerActivity extends Activity implements c {
    public DaggerActivity() {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle r1) {
        a.a(this);
        super.onCreate(r1);
    }

    @Override // dagger.android.c
    public b s() {
        return null;
    }
}
