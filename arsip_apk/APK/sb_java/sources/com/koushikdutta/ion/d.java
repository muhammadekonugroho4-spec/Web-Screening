package com.koushikdutta.ion;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class d extends WeakReference implements k {

    public static class a extends AbstractC0463d {
        public a(Context r1) {
            super(r1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.koushikdutta.ion.k
        public String a() {
            if (((Context) get()) != null) goto L6;
            return "Context reference null";
        L6:
            return null;
        }
    }

    public static class b extends AbstractC0463d {
        public b(Activity r1) {
            super(r1);
        }

        public static String d(Activity r02) {
            if (r02 != null) goto L6;
            return "Activity reference null";
        L6:
            if (r02.isFinishing() == false) goto L9;
            return "Activity finished";
        L9:
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.koushikdutta.ion.k
        public String a() {
            return d((Activity) get());
        }

        @Override // com.koushikdutta.ion.d.AbstractC0463d, com.koushikdutta.ion.k
        public /* bridge */ /* synthetic */ Context getContext() {
            return super.getContext();
        }
    }

    public static class c extends d {
        public c(ImageView r1) {
            super(r1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.koushikdutta.ion.k
        public String a() {
            ImageView r02 = (ImageView) get();
            if (r02 != null) goto L7;
            return "ImageView reference null";
        L7:
            return AbstractC0463d.c(r02.getContext());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.koushikdutta.ion.k
        public Context getContext() {
            ImageView r02 = (ImageView) get();
            if (r02 != null) goto L7;
            return null;
        L7:
            return r02.getContext();
        }
    }

    /* renamed from: com.koushikdutta.ion.d$d, reason: collision with other inner class name */
    public static abstract class AbstractC0463d extends d {
        public AbstractC0463d(Context r1) {
            super(r1);
        }

        public static String c(Context r1) {
            if ((r1 instanceof Service) == false) goto L7;
            return e.d((Service) r1);
        L7:
            if ((r1 instanceof Activity) == true) goto L9;
            return null;
        L9:
            return b.d((Activity) r1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Context getContext() {
            return (Context) get();
        }
    }

    public static class e extends AbstractC0463d {
        public e(Service r1) {
            super(r1);
        }

        public static String d(Service r3) {
            if (r3 != null) goto L5;
            return "Service reference null";
        L5:
            List<ActivityManager.RunningServiceInfo> r02 = ((ActivityManager) r3.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE);
            if (r02 != null) goto L9;
            return "Could not retrieve services from service manager";
        L9:
            Iterator<ActivityManager.RunningServiceInfo> r03 = r02.iterator();
        L11:
            if (r03.hasNext() == false) goto L16;
            ActivityManager.RunningServiceInfo r1 = r03.next();
            if (r3.getClass().getName().equals(r1.service.getClassName()) == false) goto L11;
            return null;
        L16:
            return "Service stopped";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.koushikdutta.ion.k
        public String a() {
            return d((Service) get());
        }

        @Override // com.koushikdutta.ion.d.AbstractC0463d, com.koushikdutta.ion.k
        public /* bridge */ /* synthetic */ Context getContext() {
            return super.getContext();
        }
    }

    public d(Object r1) {
        super(r1);
    }

    public static d b(Context r1) {
        if ((r1 instanceof Service) == false) goto L7;
        return new e((Service) r1);
    L7:
        if ((r1 instanceof Activity) == false) goto L11;
        return new b((Activity) r1);
    L11:
        return new a(r1);
    }
}
