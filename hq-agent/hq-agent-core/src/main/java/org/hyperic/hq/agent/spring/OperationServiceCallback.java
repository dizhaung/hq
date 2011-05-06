/*
 * NOTE: This copyright does *not* cover user programs that use HQ
 * program services by normal system calls through the application
 * program interfaces provided as part of the Hyperic Plug-in Development
 * Kit or the Hyperic Client Development Kit - this is merely considered
 * normal use of the program, and does *not* fall under the heading of
 * "derived work".
 *
 * Copyright (C) [2009-2010], VMware, Inc.
 * This file is part of HQ.
 *
 * HQ is free software; you can redistribute it and/or modify
 *  it under the terms version 2 of the GNU General Public License as
 *  published by the Free Software Foundation. This program is distributed
 *  in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 *  even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 *  PARTICULAR PURPOSE. See the GNU General Public License for more
 *  details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 *  USA.
 */

package org.hyperic.hq.agent.spring;

import org.hyperic.hq.agent.bizapp.callback.AgentCallbackClientException;
import org.hyperic.hq.operation.RegisterAgentResponse;

/**
 * @author Helena Edelson
 */
public interface OperationServiceCallback {

    boolean userIsValid(String user, String pword) throws AgentCallbackClientException;

    RegisterAgentResponse registerAgent(String oldAgentToken, String user, String pword, String authToken, String agentIP,
                                        int agentPort, String version, int cpuCount, boolean isNewTransportAgent,
                                        boolean unidirectional) throws AgentCallbackClientException;


    String updateAgent(String agentToken, String user, String pword, String agentIp, int agentPort, boolean isNewTransportAgent,
                              boolean unidirectional) throws AgentCallbackClientException;



}