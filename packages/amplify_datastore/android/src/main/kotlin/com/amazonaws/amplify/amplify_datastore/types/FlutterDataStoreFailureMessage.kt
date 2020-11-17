/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.amplify.amplify_datastore.types

enum class FlutterDataStoreFailureMessage {
    ERROR_CASTING_INPUT_IN_PLATFORM_CODE,
    AMPLIFY_QUERY_REQUEST_MALFORMED,
    AMPLIFY_DELETE_REQUEST_MALFORMED,
    AMPLIFY_CONFIGURE_REQUEST_MALFORMED,
    AMPLIFY_DATASTORE_QUERY_FAILED,
    AMPLIFY_DATASTORE_DELETE_FAILED,
    AMPLIFY_DATASTORE_OBSERVE_EVENT_FAILURE
}
