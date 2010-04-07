/*
 * Generated by XDoclet - Do not edit!
 */
package org.hyperic.hq.galerts.shared;

import org.hyperic.hq.galerts.server.session.GtriggerType;
import org.hyperic.hq.galerts.server.session.GtriggerTypeInfo;

/**
 * Local interface for GtriggerManager.
 */
public interface GtriggerManager {

    public GtriggerTypeInfo findTriggerType(GtriggerType type);

    /**
     * Register a trigger type.
     * @param triggerType Trigger type to register
     * @return the persisted metadata about the trigger type
     */
    public GtriggerTypeInfo registerTriggerType(GtriggerType triggerType);

    /**
     * Unregister a trigger type. This method will fail if any alert definitions
     * are using triggers of this type.
     * @param triggerType Trigger type to unregister
     */
    public void unregisterTriggerType(GtriggerType triggerType);

}