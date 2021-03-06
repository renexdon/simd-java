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

package org.omg.dds.sub;

import java.util.EventListener;

import org.omg.dds.core.Entity;
import org.omg.dds.core.event.*;
import org.omg.dds.pub.DataWriter;


/**
 * Since a {@link DataReader} is a kind of {@link Entity}, it has the ability
 * to have an associated listener. In this case, the associated listener must
 * be of concrete type DataReaderListener.
 * 
 * The operation {@link #onSubscriptionMatched(org.omg.dds.core.status.SubscriptionMatched)} is
 * intended to inform the application of the discovery of {@link DataWriter}
 * entities that match the DataReader. Some implementations of the service
 * may not propagate this information. In that case the DDS specification
 * does not require this listener operation to be called.
 * 
 * @param <TYPE>    The concrete type of the data that can be delivered by
 *                  the {@link DataReader}.
 */
public interface DataReaderListener<TYPE> extends EventListener {
    public void onRequestedDeadlineMissed(
            RequestedDeadlineMissedEvent<TYPE> e);

    public void onRequestedIncompatibleQos(
            RequestedIncompatibleQosEvent<TYPE> e);

    public void onSampleRejected(SampleRejectedEvent<TYPE> e);

    public void onLivelinessChanged(LivelinessChangedEvent<TYPE> e);

    public void onDataAvailable(DataAvailableEvent<TYPE> e);

    public void onSubscriptionMatched(SubscriptionMatchedEvent<TYPE> e);

    public void onSampleLost(SampleLostEvent<TYPE> e);
}
