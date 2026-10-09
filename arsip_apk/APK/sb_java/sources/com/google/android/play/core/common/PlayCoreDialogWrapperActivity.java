package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes5.dex */
public class PlayCoreDialogWrapperActivity extends Activity {
    private ResultReceiver zza;

    public PlayCoreDialogWrapperActivity() {
    }

    private final void zza() {
        ResultReceiver r02 = this.zza;
        if (r02 == null) goto L6;
        r02.send(3, new Bundle());
        return;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int r1, int r2, Intent r3) {
        super.onActivityResult(r1, r2, r3);
        if (r1 != 0) goto L11;
        ResultReceiver r12 = this.zza;
        if (r12 == null) goto L11;
        if (r2 != (-1)) goto L9;
        r12.send(1, new Bundle());
        goto L11
    L9:
        if (r2 != 0) goto L11;
        r12.send(2, new Bundle());
    L11:
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle r10) {
        int r02 = getIntent().getIntExtra("window_flags", 0);
        if (r02 == 0) goto L6;
        getWindow().getDecorView().setSystemUiVisibility(r02);
        Intent r1 = new Intent();
        r1.putExtra("window_flags", r02);
    L5:
        Intent r5 = r1;
        super.onCreate(r10);
        if (r10 != null) goto L21;
        this.zza = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        Bundle r102 = getIntent().getExtras();
        if (r102 != null) goto L26;
        zza();
        finish();
        return;
    L26:
        startIntentSenderForResult(((PendingIntent) r102.get("confirmation_intent")).getIntentSender(), 0, r5, 0, 0, 0);     // Catch: IntentSender.SendIntentException -> L23
        return;
    L19:
        zza();
        finish();
        return;
    L21:
        this.zza = (ResultReceiver) r10.getParcelable("result_receiver");
        return;
    L6:
        r1 = null;
        goto L5
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle r3) {
        r3.putParcelable("result_receiver", this.zza);
    }
}
