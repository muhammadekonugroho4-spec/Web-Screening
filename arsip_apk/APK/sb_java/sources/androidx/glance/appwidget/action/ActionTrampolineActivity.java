package androidx.glance.appwidget.action;

import android.app.Activity;
import android.os.Bundle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/glance/appwidget/action/ActionTrampolineActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/w;", "onCreate", "(Landroid/os/Bundle;)V", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ActionTrampolineActivity extends Activity {
    static {
    }

    public ActionTrampolineActivity() {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle r1) {
        super.onCreate(r1);
        ActionTrampolineKt.f(this, getIntent());
        finish();
    }
}
