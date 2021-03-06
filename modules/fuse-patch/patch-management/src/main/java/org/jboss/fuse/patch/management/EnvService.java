/**
 *  Copyright 2005-2018 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package org.jboss.fuse.patch.management;

import java.io.IOException;

/**
 * Interface used by {@link org.jboss.fuse.patch.management.impl.GitPatchManagementService} to check the context and
 * environment capabilities.
 */
public interface EnvService {

    /**
     * Checks in what kind of environment we are running. Used to make a decision whether to start tracking
     * patch history (standalone) or not (child)
     * @return
     */
    EnvType determineEnvironmentType() throws IOException;

}
