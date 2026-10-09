package com.huawei.hms.framework.common;

/* loaded from: classes6.dex */
public class RunnableEnhance implements Runnable {
    static final String TRANCELOGO = " -->";
    private String parentName;
    private Runnable proxy;

    public RunnableEnhance(Runnable r2) {
        this.parentName = Thread.currentThread().getName();
        this.proxy = r2;
    }

    public String getParentName() {
        return this.parentName;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.proxy.run();
    }
}
