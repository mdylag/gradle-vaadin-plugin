/*
 * Copyright 2018 John Ahlroos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.devsoap.plugin

import groovy.transform.CompileStatic
import org.codehaus.groovy.runtime.StackTraceUtils
import org.gradle.util.SingleMessageLogger

/**
 * Logger for displaying (nagging) messages to user
 *
 * @author John Ahlroos
 * @since 1.1
 */
@CompileStatic
class MessageLogger {

    static String getDeprecationMessage() {
        'has been deprecated and is scheduled to be removed in Gradle Vaadin Plugin 2.0'
    }

    /**
     * Nag to use about a deprecated property
     *
     * @param propertyName
     *      the name of the property
     * @param advice
     *      Further details about where the property has been moved
     */
    static nagUserOfDiscontinuedProperty(String propertyName, String advice) {
        //SingleMessageLogger.nag
                //nagUserWith("The $propertyName property ${getDeprecationMessage()}. ", advice)
    }

    /**
     * Nag to user about deprecated property using a Throwable
     *
     * @param throwable
     *      the throwable containing the method stacktrace as well as message
     */
    static nagUserOfDiscontinuedProperty(Throwable throwable) {
        nagUserOfDiscontinuedProperty(
                StackTraceUtils.sanitize(throwable).stackTrace[1].methodName,
                throwable.message)
    }

    /**
     * Nag to user with a custom message
     *
     * @param advice
     *      the message to show the user
     */
    static nag(String advice) {
        //SingleMessageLogger.nog
          //      nagUserWith(advice, null)
    }
}
