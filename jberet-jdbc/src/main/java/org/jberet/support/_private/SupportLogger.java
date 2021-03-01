/*
 * Copyright (c) 2014-2018 Red Hat, Inc. and/or its affiliates.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package org.jberet.support._private;

import org.jboss.logging.BasicLogger;
import org.jboss.logging.Logger;
import org.jboss.logging.annotations.*;

import java.util.List;

@MessageLogger(projectCode = "JBERET")
@ValidIdRange(min = 60500, max = 60999)
public interface SupportLogger extends BasicLogger {
    SupportLogger LOGGER = Logger.getMessageLogger(SupportLogger.class, "org.jberet.support");

    @Message(id = 60500, value = "The CellProcessor value may be missing an ending single quote: %s")
    @LogMessage(level = Logger.Level.WARN)
    void maybeMissingEndQuote(String line);

    @Message(id = 60501, value = "Opening resource %s in %s")
    @LogMessage(level = Logger.Level.INFO)
    void openingResource(String resource, Class<?> cls);

    @Message(id = 60502, value = "Closing resource %s in %s")
    @LogMessage(level = Logger.Level.INFO)
    void closingResource(String resource, Class<?> cls);

    @Message(id = 60503, value = "Failed to write Excel workbook %s to output resource %s")
    @LogMessage(level = Logger.Level.WARN)
    void failToWriteWorkbook(@Cause Throwable th, String workbook, String resource);

    @Message(id = 60504, value = "About to run command %s, in working directory %s")
    @LogMessage(level = Logger.Level.INFO)
    void runCommand(List<String> cmd, String workingDir);

    @Message(id = 60505, value = "JDBC batch update count: %s")
    @LogMessage(level = Logger.Level.WARN)
    void jdbcBatchUpdateCounts(String updateCounts);

    @Message(id = 60506, value = "Adding sql statement to be executed: %s")
    @LogMessage(level = Logger.Level.INFO)
    void addingSql(String sql);

    @Message(id = 60507, value = "Produced report to: %s")
    @LogMessage(level = Logger.Level.INFO)
    void producedJasperReport(String dest);

    @Message(id = 60508, value = "Ignoring unrecognized property: %s = %s")
    @LogMessage(level = Logger.Level.WARN)
    void ignoreProperties(String key, String value);

    @Message(id = 60509, value = "Query parameter %s not bound in: %s")
    @LogMessage(level = Logger.Level.WARN)
    void queryParameterNotBound(String parameter, String query);

    @Message(id = 60510, value = "Unsupported data type: %s")
    @LogMessage(level = Logger.Level.WARN)
    void unsupportedDataType(String dataType);

    @Message(id = 60511, value = "Failed to close resource: %s")
    @LogMessage(level = Logger.Level.WARN)
    void failToClose(@Cause Throwable throwable, String resource);



}
