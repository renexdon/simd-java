/* Copyright 2010, Object Management Group, Inc.
 * Copyright 2010, PrismTech, Inc.
 * Copyright 2010, Real-Time Innovations, Inc.
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.omg.dds.topic;

import java.util.List;

import org.omg.dds.core.policy.DataRepresentation;
import org.omg.dds.core.policy.Deadline;
import org.omg.dds.core.policy.DestinationOrder;
import org.omg.dds.core.policy.Durability;
import org.omg.dds.core.policy.DurabilityService;
import org.omg.dds.core.policy.History;
import org.omg.dds.core.policy.LatencyBudget;
import org.omg.dds.core.policy.Lifespan;
import org.omg.dds.core.policy.Liveliness;
import org.omg.dds.core.policy.Ownership;
import org.omg.dds.core.policy.Reliability;
import org.omg.dds.core.policy.ResourceLimits;
import org.omg.dds.core.policy.TopicData;
import org.omg.dds.core.policy.TransportPriority;
import org.omg.dds.core.policy.TypeConsistencyEnforcement;
import org.omg.dds.type.Extensibility;
import org.omg.dds.type.ID;
import org.omg.dds.type.Key;
import org.omg.dds.type.Optional;
import org.omg.dds.type.typeobject.TypeObject;


@Extensibility(Extensibility.Kind.MUTABLE_EXTENSIBILITY)
public abstract class TopicBuiltinTopicData {
    // -----------------------------------------------------------------------
    // Private Constants
    // -----------------------------------------------------------------------

    private static final long serialVersionUID = -3621587724397579935L;



    // -----------------------------------------------------------------------
    // Factory Methods
    // -----------------------------------------------------------------------

    /**
     * @param bootstrap Identifies the Service instance to which the new
     *                  object will belong.
     */
    /*
    public static TopicBuiltinTopicData newTopicBuiltinTopicData(
            Bootstrap bootstrap) {
        return bootstrap.getSPI().newTopicBuiltinTopicData();
    }
      */

    // -----------------------------------------------------------------------
    // Instance Methods
    // -----------------------------------------------------------------------

    @ID(0x005A) @Key
    public abstract BuiltinTopicKey getKey();

    /**
     * @return the name
     */
    @ID(0x0005)
    public abstract String getName();

    /**
     * @return the typeName
     */
    @ID(0x0007)
    public abstract String getTypeName();

    @ID(0x0075) @Optional
    public abstract List<String> getEquivalentTypeName();

    @ID(0x0076) @Optional
    public abstract List<String> getBaseTypeName();

    @ID(0x0072) @Optional
    public abstract TypeObject getType();

    /**
     * @return the durability
     */
    @ID(0x001D)
    public abstract Durability getDurability();

    /**
     * @return the durabilityService
     */
    @ID(0x001E)
    public abstract DurabilityService getDurabilityService();

    /**
     * @return the deadline
     */
    @ID(0x0023)
    public abstract Deadline getDeadline();

    /**
     * @return the latencyBudget
     */
    @ID(0x0027)
    public abstract LatencyBudget getLatencyBudget();

    /**
     * @return the liveliness
     */
    @ID(0x001B)
    public abstract Liveliness getLiveliness();

    /**
     * @return the reliability
     */
    @ID(0x001A)
    public abstract Reliability getReliability();

    /**
     * @return the transportPriority
     */
    @ID(0x0049)
    public abstract TransportPriority getTransportPriority();

    /**
     * @return the lifespan
     */
    @ID(0x002B)
    public abstract Lifespan getLifespan();

    /**
     * @return the destinationOrder
     */
    @ID(0x0025)
    public abstract DestinationOrder getDestinationOrder();

    /**
     * @return the history
     */
    @ID(0x0040)
    public abstract History getHistory();

    /**
     * @return the resourceLimits
     */
    @ID(0x0041)
    public abstract ResourceLimits getResourceLimits();

    /**
     * @return the ownership
     */
    @ID(0x001F)
    public abstract Ownership getOwnership();

    /**
     * @return the topicData
     */
    @ID(0x002E)
    public abstract TopicData getTopicData();

    @ID(0x0073)
    public abstract DataRepresentation getRepresentation();

    @ID(0x0074)
    public abstract TypeConsistencyEnforcement getTypeConsistency();


    // --- From Object: ------------------------------------------------------

    @Override
    public abstract TopicBuiltinTopicData clone();
}
