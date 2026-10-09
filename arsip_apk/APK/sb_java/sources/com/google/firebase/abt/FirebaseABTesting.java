package com.google.firebase.abt;

import android.content.Context;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class FirebaseABTesting {
    static final String ABT_PREFERENCES = "com.google.firebase.abt";
    static final String ORIGIN_LAST_KNOWN_START_TIME_KEY_FORMAT = "%s_lastKnownExperimentStartTime";
    private final Provider<AnalyticsConnector> analyticsConnector;
    private Integer maxUserProperties;
    private final String originService;

    @Retention(RetentionPolicy.SOURCE)
    public @interface OriginService {
        public static final String INAPP_MESSAGING = "fiam";
        public static final String REMOTE_CONFIG = "frc";
    }

    public FirebaseABTesting(Context r1, Provider<AnalyticsConnector> r2, String r3) {
        this.analyticsConnector = r2;
        this.originService = r3;
        this.maxUserProperties = null;
    }

    private void addExperimentToAnalytics(AnalyticsConnector.ConditionalUserProperty r2) {
        this.analyticsConnector.get().setConditionalUserProperty(r2);
    }

    private void addExperiments(List<AbtExperimentInfo> r5) {
        ArrayDeque r02 = new ArrayDeque(getAllExperimentsInAnalytics());
        int r1 = getMaxUserPropertiesInAnalytics();
        Iterator<AbtExperimentInfo> r52 = r5.iterator();
    L4:
        if (r52.hasNext() == false) goto L10;
        AbtExperimentInfo r2 = r52.next();
    L7:
        if (r02.size() < r1) goto L9;
        removeExperimentFromAnalytics(((AnalyticsConnector.ConditionalUserProperty) r02.pollFirst()).name);
        goto L7
    L9:
        AnalyticsConnector.ConditionalUserProperty r22 = r2.toConditionalUserProperty(this.originService);
        addExperimentToAnalytics(r22);
        r02.offer(r22);
        goto L4
    }

    private static List<AbtExperimentInfo> convertMapsToExperimentInfos(List<Map<String, String>> r2) throws AbtException {
        ArrayList r02 = new ArrayList();
        Iterator<Map<String, String>> r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L6;
        r02.add(AbtExperimentInfo.fromMap(r22.next()));
        goto L4
    L6:
        return r02;
    }

    private boolean experimentsListContainsExperiment(List<AbtExperimentInfo> r4, AbtExperimentInfo r5) {
        String r02 = r5.getExperimentId();
        String r52 = r5.getVariantId();
        Iterator<AbtExperimentInfo> r42 = r4.iterator();
    L4:
        if (r42.hasNext() == false) goto L11;
        AbtExperimentInfo r1 = r42.next();
        if (r1.getExperimentId().equals(r02) == false) goto L4;
        if (r1.getVariantId().equals(r52) == false) goto L4;
        return true;
    L11:
        return false;
    }

    private List<AnalyticsConnector.ConditionalUserProperty> getAllExperimentsInAnalytics() {
        return this.analyticsConnector.get().getConditionalUserProperties(this.originService, "");
    }

    private ArrayList<AbtExperimentInfo> getExperimentsToAdd(List<AbtExperimentInfo> r4, List<AbtExperimentInfo> r5) {
        ArrayList<AbtExperimentInfo> r02 = new ArrayList();
        Iterator<AbtExperimentInfo> r42 = r4.iterator();
    L4:
        if (r42.hasNext() == false) goto L8;
        AbtExperimentInfo r1 = r42.next();
        if (experimentsListContainsExperiment(r5, r1) == true) goto L4;
        r02.add(r1);
        goto L4
    L8:
        return r02;
    }

    private ArrayList<AnalyticsConnector.ConditionalUserProperty> getExperimentsToRemove(List<AbtExperimentInfo> r4, List<AbtExperimentInfo> r5) {
        ArrayList<AnalyticsConnector.ConditionalUserProperty> r02 = new ArrayList();
        Iterator<AbtExperimentInfo> r42 = r4.iterator();
    L4:
        if (r42.hasNext() == false) goto L8;
        AbtExperimentInfo r1 = r42.next();
        if (experimentsListContainsExperiment(r5, r1) == true) goto L4;
        r02.add(r1.toConditionalUserProperty(this.originService));
        goto L4
    L8:
        return r02;
    }

    private int getMaxUserPropertiesInAnalytics() {
        if (this.maxUserProperties != null) goto L6;
        this.maxUserProperties = Integer.valueOf(this.analyticsConnector.get().getMaxUserProperties(this.originService));
    L6:
        return this.maxUserProperties.intValue();
    }

    private void removeExperimentFromAnalytics(String r3) {
        this.analyticsConnector.get().clearConditionalUserProperty(r3, null, null);
    }

    private void removeExperiments(Collection<AnalyticsConnector.ConditionalUserProperty> r2) {
        Iterator<AnalyticsConnector.ConditionalUserProperty> r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L6;
        removeExperimentFromAnalytics(r22.next().name);
        goto L4
    }

    private void replaceAllExperimentsWith(List<AbtExperimentInfo> r3) throws AbtException {
        if (r3.isEmpty() == false) goto L6;
        removeAllExperiments();
        return;
    L6:
        List<AbtExperimentInfo> r02 = getAllExperiments();
        removeExperiments(getExperimentsToRemove(r02, r3));
        addExperiments(getExperimentsToAdd(r3, r02));
    }

    private void throwAbtExceptionIfAnalyticsIsNull() throws AbtException {
        if (this.analyticsConnector.get() == null) goto L6;
        return;
    L6:
        throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
    }

    public List<AbtExperimentInfo> getAllExperiments() throws AbtException {
        throwAbtExceptionIfAnalyticsIsNull();
        List<AnalyticsConnector.ConditionalUserProperty> r02 = getAllExperimentsInAnalytics();
        ArrayList r1 = new ArrayList();
        Iterator<AnalyticsConnector.ConditionalUserProperty> r03 = r02.iterator();
    L4:
        if (r03.hasNext() == false) goto L6;
        r1.add(AbtExperimentInfo.fromConditionalUserProperty(r03.next()));
        goto L4
    L6:
        return r1;
    }

    public void removeAllExperiments() throws AbtException {
        throwAbtExceptionIfAnalyticsIsNull();
        removeExperiments(getAllExperimentsInAnalytics());
    }

    public void replaceAllExperiments(List<Map<String, String>> r2) throws AbtException {
        throwAbtExceptionIfAnalyticsIsNull();
        if (r2 == null) goto L7;
        replaceAllExperimentsWith(convertMapsToExperimentInfos(r2));
        return;
    L7:
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }

    public void reportActiveExperiment(AbtExperimentInfo r3) throws AbtException {
        throwAbtExceptionIfAnalyticsIsNull();
        AbtExperimentInfo.validateAbtExperimentInfo(r3);
        ArrayList r02 = new ArrayList();
        Map<String, String> r32 = r3.toStringMap();
        r32.remove("triggerEvent");
        r02.add(AbtExperimentInfo.fromMap(r32));
        addExperiments(r02);
    }

    public void validateRunningExperiments(List<AbtExperimentInfo> r2) throws AbtException {
        throwAbtExceptionIfAnalyticsIsNull();
        removeExperiments(getExperimentsToRemove(getAllExperiments(), r2));
    }
}
