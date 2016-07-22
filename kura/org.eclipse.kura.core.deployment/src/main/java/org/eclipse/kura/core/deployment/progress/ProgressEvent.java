/*******************************************************************************
 * Copyright (c) 2011, 2016 Eurotech and/or its affiliates
 *
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Eurotech
 *******************************************************************************/
package org.eclipse.kura.core.deployment.progress;

public interface ProgressEvent {
    
    public String getClientId();

    public int getTransferSize();

    public int getTransferProgress();

    public String getTransferStatus();

    public String getRequesterClientId();

    public long getJobId();

    public void setExceptionMessage(String exceptionMessage);

    public String getExceptionMessage();

    public void setDownloadIndex(int downloadIndex);

    public int getDownloadIndex();

}
