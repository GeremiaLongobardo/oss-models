/**
 * Copyright 2019 Symphony Communication Services, LLC.
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
 *
 *----------------------------------------------------------------------------------------------------
 * Proforma generated from
 *		Template groupId		 org.symphonyoss.s2.canon
 *           artifactId canon-template-java
 *		Template name		   proforma/java/Object/I_.java.ftl
 *		Template version	   1.0
 *  At                  2019-11-05 08:42:22 GMT
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.chat.canon.facade;

import javax.annotation.concurrent.Immutable;

import com.symphony.oss.models.chat.canon.IMaestroUserEntity;
import com.symphony.oss.models.core.canon.IApplicationPayload;

/**
 * Facade for Object ObjectSchema(MaestroUser)
 *
 * A Symphony maestro user based on IMaestroUser
 * Generated from ObjectSchema(MaestroUser) at #/components/schemas/MaestroUser
 */
@Immutable
public interface IMaestroUser
  extends IApplicationPayload, IMaestroUserEntity
{
  /**
   * Check to see if the user has the given entitlement ID.
   * 
   * @param entitlementId The string entitlement ID of an entitlement.
   * 
   * @return True if the given entitlement ID is present and true, otherwise false.
   */
  boolean hasEntitlement(String entitlementId);
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/I_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */